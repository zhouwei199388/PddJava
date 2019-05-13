package com.zw.http.response;

import com.zw.domain.Order;
import com.zw.http.BaseResponse;
import java.util.List;

/**
 * Created by zw on 2019/3/27.
 */
public class OrderResponse extends BaseResponse{
    public int orderSize;
    public List<Order> orders;

}
