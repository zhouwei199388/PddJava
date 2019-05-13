package com.zw.http.response;

import com.zw.domain.Finance;
import com.zw.http.BaseResponse;

/**
 * Created by zw on 2019/4/17.
 */
public class FinanceResponse extends BaseResponse {
    public Finance finance;

    public static class Finance{
        public Integer earning;

        public Integer sdpricetotal;

        public Integer commissiontotal;

        public Integer coundagetotal;

        public Integer wlpricetotal;

        public Integer goodspricetotal;
    }

}
