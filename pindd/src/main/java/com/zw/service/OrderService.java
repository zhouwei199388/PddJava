package com.zw.service;

import com.google.gson.Gson;
import com.zw.dao.FinanceMapper;
import com.zw.dao.OrderMapper;
import com.zw.domain.Order;
import com.zw.domain.OrderExample;
import com.zw.http.ConnectionMessage;
import com.zw.http.ResponseHeader;
import com.zw.http.model.PddOrder;
import com.zw.http.response.FinanceResponse;
import com.zw.http.response.OrderResponse;
import com.zw.utils.LogUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zw on 2019/3/24.
 */
@Service
public class OrderService {

    @Autowired
    private OrderMapper mOrderMapper;
    @Autowired
    private FinanceMapper mFinanceMapper;

    /**
     * 获取所有订单
     */
    public OrderResponse getAllOrder() {
        OrderResponse response = new OrderResponse();
        OrderExample example = new OrderExample();
        example.setOrderByClause("payTime DESC");
        List<Order> orders = mOrderMapper.selectByExample(example);
        ResponseHeader header = new ResponseHeader();
        if (orders.size() > 0) {
            header.code = ConnectionMessage.SUCCESS_CODE;
            header.msg = ConnectionMessage.SUCCESS_TEXT;
            response.orderSize = orders.size();
        }
        response.header = header;
        response.orders = orders;
        return response;
    }

    private void setFinance(FinanceResponse.Finance finance,Order order) {
        //实收-佣金-平台手续费-物流费
//        Finance finance = mFinanceMapper.selectByPrimaryKey(1);
        int earn = order.getGoodprice() - order.getCommission() - order.getPoundage() - order.getWlprice();
        finance.earning+=+ earn;
        finance.commissiontotal+=order.getCommission();
        finance.wlpricetotal+=order.getWlprice();
        finance.sdpricetotal+=order.getGoodsamount();
        finance.goodspricetotal+=order.getGoodprice();
        finance.coundagetotal+=order.getPoundage();
    }



    public boolean addOrders(String orderStr) {
        PddOrder pddOrder = new Gson().fromJson(orderStr, PddOrder.class);
        if (pddOrder == null || pddOrder.getResult().getPageItems().size() == 0) {
            return false;
        }
        for (PddOrder.ResultBean.PageItemsBean pageItemsBean : pddOrder.getResult().getPageItems()) {
            Order order = PddToOrder(pageItemsBean);
            if (isInSql(order)) {
                LogUtils.info("数据库已存在");
                continue;
            }
            mOrderMapper.insert(order);
//            setFinance(order);
        }
        return true;
    }

    public FinanceResponse getFinance() {
        FinanceResponse response = new FinanceResponse();
        ResponseHeader header = new ResponseHeader();
        FinanceResponse.Finance finance = new FinanceResponse.Finance();
        List<Order> orders = mOrderMapper.selectByExample(new OrderExample());
        for (Order order : orders) {
            setFinance(finance,order);
        }
//        Finance finance = mFinanceMapper.selectByPrimaryKey(1);
//        int resultType = mFinanceMapper.updateByPrimaryKey(finance);
        if(finance!=null){
            header.code = ConnectionMessage.SUCCESS_CODE;
            header.msg = ConnectionMessage.SUCCESS_TEXT;
            response.finance = finance;
        }
        response.header = header;
        return response;
    }


    private boolean isInSql(Order order) {
        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();
        criteria.andOrdernumberEqualTo(order.getOrdernumber());
        criteria.andPaytimeEqualTo(order.getPaytime());
        List<Order> orders = mOrderMapper.selectByExample(example);
        return orders.size() > 0 && orders != null;

    }

    private Order PddToOrder(PddOrder.ResultBean.PageItemsBean itemsBean) {
        Order order = new Order();
        order.setOrdernumber(itemsBean.getOrder_sn());
        order.setSpec(itemsBean.getSpec());
        order.setNickname(itemsBean.getNickname());
        order.setName(itemsBean.getReceive_name());
        order.setNumber(itemsBean.getGoods_number());
        order.setGoodprice(mSkuMap.get(itemsBean.getSku_id()));
        order.setGoodsamount(itemsBean.getGoods_amount() + itemsBean.getPlatform_discount());
        order.setPoundage((int) (order.getGoodsamount() * 0.006));
        order.setFavoritestatus(itemsBean.isFavorite_status() ? 1 : 0);
        order.setWlprice(0);
        order.setCommission(0);
        order.setScStatus(0);
        order.setIssd(0);
        order.setPaytime((long) itemsBean.getPay_time());
        order.setSctime(getScTime(itemsBean.getPay_time()));
        return order;
    }

    private Long getScTime(int payTime) {
        return (long) (payTime + (3600 * 24 * 5));
    }

    /**
     * 根据类型获取订单
     */

    public List<Order> getOrderForStatus(int status) {
        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();
        criteria.andIssdEqualTo(status);
        List<Order> orders = mOrderMapper.selectByExample(example);
        return orders;
    }

    /**
     * 根据日期获取订单
     */
    public OrderResponse getOrderForTime(long startLong, long endLong) {
        OrderResponse response = new OrderResponse();
        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();
        criteria.andPaytimeBetween(startLong, endLong);
        List<Order> orders = mOrderMapper.selectByExample(example);
        ResponseHeader header = new ResponseHeader();
        if (orders.size() > 0) {
            header.code = ConnectionMessage.SUCCESS_CODE;
            header.msg = ConnectionMessage.SUCCESS_TEXT;
            LogUtils.info(orders.size()+"");
            response.orderSize = orders.size();
        }else{
            header.code = ConnectionMessage.SUCCESS_CODE;
            header.msg = ConnectionMessage.SUCCESS_TEXT;
            LogUtils.info(orders.size()+"");
            response.orderSize = orders.size();
        }
        response.header = header;
        response.orders = orders;
        return response;
    }


    /**
     * 根据id获取订单
     */

    public Order getOrderForId(int id) {
        Order order = mOrderMapper.selectByPrimaryKey(id);
        return order;
    }


    /**
     * 修改订单信息
     *
     * @param order
     * @return
     */
    public ResponseHeader updateOrder(Order order) {
        ResponseHeader header = new ResponseHeader();
        int resultState = mOrderMapper.updateByPrimaryKey(order);
        if (resultState == 1) {
            header.msg = ConnectionMessage.SUCCESS_TEXT;
            header.code = ConnectionMessage.SUCCESS_CODE;
//            setWlSd(order);
        }
        return header;
    }


    private static Map<Long,Integer> mSkuMap = getSkuPrice();
    public static Map<Long,Integer> getSkuPrice(){
        Map<Long,Integer> map = new HashMap<>();
        //礼恩派弹簧 回弹海绵 天然
        map.put(140925079193L,245);
        map.put(140925079194L,245);
        map.put(140925079195L,285);
        map.put(140925079196L,285);
        map.put(140925079197L,325);
        map.put(140925079198L,325);
        map.put(140925079199L,365);
        map.put(140925079200L,365);
        //礼恩派弹簧 贝卡特针织 3E
        map.put(140928767963L,310);
        map.put(140928767964L,310);
        map.put(140928767965L,350);
        map.put(140928767966L,350);
        map.put(140928767967L,390);
        map.put(140928767968L,390);
        map.put(140928767969L,430);
        map.put(140928767970L,430);
        //乳胶
        map.put(140930104036L,430);
        map.put(140930104037L,430);
        map.put(140930104038L,470);
        map.put(140930104039L,470);
        map.put(140930104040L,510);
        map.put(140930104041L,510);
        map.put(140930104042L,550);
        map.put(140930104043L,550);
        return map;
    }

}
