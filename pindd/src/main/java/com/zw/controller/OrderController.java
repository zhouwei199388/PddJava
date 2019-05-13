package com.zw.controller;

import com.google.gson.Gson;
import com.zw.domain.Order;
import com.zw.http.ResponseHeader;
import com.zw.http.response.FinanceResponse;
import com.zw.http.response.OrderResponse;
import com.zw.service.OrderService;
import com.zw.utils.LogUtils;
import com.zw.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by zw on 2019/3/24.
 */
@Controller
@RequestMapping(value = "/pdd")
public class OrderController {
    @Autowired
    OrderService mOrderService;

    @ResponseBody
    @RequestMapping(value = "/getAllOrder", method = RequestMethod.GET)
    public void getAllOrder(HttpServletResponse response) {
        OrderResponse orders = mOrderService.getAllOrder();
        LogUtils.info(new Gson().toJson(orders));
        ResponseUtils.renderJson(response, new Gson().toJson(orders));
    }

    @ResponseBody
    @RequestMapping(value = "/getOrderForId", method = RequestMethod.GET)
    public void getOrderForId(HttpServletResponse response, int orderId) {
        Order order = mOrderService.getOrderForId(orderId);
        ResponseUtils.renderJson(response, new Gson().toJson(order));
    }


    @ResponseBody
    @RequestMapping(value = "/updateOrder", method = RequestMethod.POST)
    public void updateOrder(HttpServletResponse response, @RequestBody Order order) {
        ResponseHeader header = mOrderService.updateOrder(order);
        ResponseUtils.renderJson(response, new Gson().toJson(header));
    }

    @ResponseBody
    @RequestMapping(value = "/getOrderForTime", method = RequestMethod.GET)
    public void getOrderForTime(HttpServletResponse response, Long startTime, Long endTime) {
        OrderResponse orderResponse = mOrderService.getOrderForTime(startTime, endTime);
        LogUtils.info(new Gson().toJson(orderResponse));
        ResponseUtils.renderJson(response, new Gson().toJson(orderResponse));
    }


    @ResponseBody
    @RequestMapping(value = "/addOrder", method = RequestMethod.GET)
    public void addOrders(HttpServletResponse response, String orderStr) {
        mOrderService.addOrders(orderStr);
//        mOrderService.setFinance();
    }

    @ResponseBody
    @RequestMapping(value = "/getFinance", method = RequestMethod.GET)
    public void getFinance(HttpServletResponse response) {
//       FinanceResponse financeResponse = mOrderService.getFinance();
//       ResponseUtils.renderJson(response,new Gson().toJson(financeResponse));
//        mOrderService.paramsFinance();
        mOrderService.getFinance();
    }


}
