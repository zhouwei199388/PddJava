package com.zw.http.model;

import java.util.List;

/**
 * Created by zw on 2019/3/25.
 */
public class PddOrder {

    private boolean success;
    private int errorCode;
    private Object errorMsg;
    private ResultBean result;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public Object getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(Object errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * totalItemNum : 69
         * pageItems : [{"order_sn":"190325-575653806972669","order_id":"709575653806972669","group_order_id":"709575653806972669","mall_id":977197566,"uid":0,"order_time":1553479162,"confirm_time":1553521491,"group_time":1553521491,"pay_time":1553479176,"shipping_time":1553522146,"order_amount":89100,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":89100,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"许东生","mobile":null,"province_id":13,"province_name":"湖北省","city_id":185,"city_name":"荆门市","district_id":1581,"district_name":"京山县","shipping_address":"绿林路83-2","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553479162,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":89100,"goods_number":1,"sku_id":140930104042,"spec":"静音圆簧+3E棕+贝卡特针织+乳胶,1800*1900","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-01-07/99857bea-2485-46fc-9ee7-2e6aba394425.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561297491,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"快乐天使","avatar":"http://t20img.yangkeduo.com/a/eb99a25db8c02d97688cd00edd212ce423d6a791-1552791390?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190325-614279742131148","order_id":"709614279742131148","group_order_id":"709575653806972669","mall_id":977197566,"uid":0,"order_time":1553521468,"confirm_time":1553521491,"group_time":1553521491,"pay_time":1553521491,"shipping_time":1553522190,"order_amount":88100,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":88100,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"晋发东","mobile":null,"province_id":11,"province_name":"河南省","city_id":162,"city_name":"许昌市","district_id":1382,"district_name":"鄢陵县","shipping_address":"北关龙苑小区六号楼","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553521468,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":88100,"goods_number":1,"sku_id":140930104040,"spec":"静音圆簧+3E棕+贝卡特针织+乳胶,1500*1900","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-01-07/99857bea-2485-46fc-9ee7-2e6aba394425.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561297491,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"鱼缸里的鱼","avatar":"http://t20img.yangkeduo.com/a/23149ee29572a7a735fc4dad7fc67d35fdbd7dc1-1543553442?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190325-644563600611129","order_id":"709644563600611129","group_order_id":"709644563600611129","mall_id":977197566,"uid":0,"order_time":1553484708,"confirm_time":1553502740,"group_time":1553502740,"pay_time":1553484717,"shipping_time":1553522128,"order_amount":89100,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":89100,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"珍妮","mobile":null,"province_id":4,"province_name":"福建省","city_id":58,"city_name":"泉州市","district_id":566,"district_name":"泉港区","shipping_address":"金山街3号楼","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553484708,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":89100,"goods_number":1,"sku_id":140930104043,"spec":"静音圆簧+3E棕+贝卡特针织+乳胶,1800*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-01-07/99857bea-2485-46fc-9ee7-2e6aba394425.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561278740,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"胖祥妈","avatar":"http://t20img.yangkeduo.com/a/b9427287ce318f55ada9b8aa5e37dec7111fb911-1543651568?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190325-601113887971693","order_id":"709601113887971693","group_order_id":"709644563600611129","mall_id":977197566,"uid":0,"order_time":1553502727,"confirm_time":1553502740,"group_time":1553502740,"pay_time":1553502740,"shipping_time":1553522173,"order_amount":88100,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":88100,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"周钰","mobile":null,"province_id":16,"province_name":"江苏省","city_id":221,"city_name":"苏州市","district_id":1851,"district_name":"吴中区","shipping_address":"郭巷塘东路518号和协10栋4楼","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553502727,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":88100,"goods_number":1,"sku_id":140930104041,"spec":"静音圆簧+3E棕+贝卡特针织+乳胶,1500*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-01-07/99857bea-2485-46fc-9ee7-2e6aba394425.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561278740,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"周煜钧","avatar":"http://t20img.yangkeduo.com/a/40dd65cf4b4aa3ebb848763549392eda7ed0f75b-1553500700?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190324-087029514914034","order_id":"708087029514914034","group_order_id":"708087029514914034","mall_id":977197566,"uid":0,"order_time":1553437255,"confirm_time":1553500496,"group_time":1553500496,"pay_time":1553437270,"shipping_time":1553522109,"order_amount":89100,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":89100,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"邹凯","mobile":null,"province_id":13,"province_name":"湖北省","city_id":180,"city_name":"武汉市","district_id":1550,"district_name":"洪山区","shipping_address":"关南社区1栋304","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553437255,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":89100,"goods_number":1,"sku_id":140930104043,"spec":"静音圆簧+3E棕+贝卡特针织+乳胶,1800*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-01-07/99857bea-2485-46fc-9ee7-2e6aba394425.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561276496,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"风","avatar":"http://t20img.yangkeduo.com/a/5cee3dc91bc98a0c25abe2bb0cac2acf5a4b0cfc-1553436360?imageMogr2/thumbnail/100x","favorite_status":false,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190325-451525346351267","order_id":"709451525346351267","group_order_id":"708087029514914034","mall_id":977197566,"uid":0,"order_time":1553500491,"confirm_time":1553500496,"group_time":1553500496,"pay_time":1553500496,"shipping_time":1553522090,"order_amount":88100,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":88100,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"张可","mobile":null,"province_id":10,"province_name":"河北省","city_id":147,"city_name":"邢台市","district_id":1215,"district_name":"桥东区","shipping_address":"桥东小区物业","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553500491,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":88100,"goods_number":1,"sku_id":140930104041,"spec":"静音圆簧+3E棕+贝卡特针织+乳胶,1500*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-01-07/99857bea-2485-46fc-9ee7-2e6aba394425.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561276496,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"愈合","avatar":"http://t20img.yangkeduo.com/a/a53ce01e5f8ddce8d84815f9e98f70b5f7a61ebb-1530245772?imageMogr2/thumbnail/100x","favorite_status":false,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190325-016110060270319","order_id":"709016110060270319","group_order_id":"708063899566850202","mall_id":977197566,"uid":0,"order_time":1553481684,"confirm_time":1553481691,"group_time":1553481691,"pay_time":1553481691,"shipping_time":1553522020,"order_amount":89100,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":89100,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"苏岩","mobile":null,"province_id":22,"province_name":"山东省","city_id":297,"city_name":"烟台市","district_id":2446,"district_name":"芝罘区","shipping_address":"华信家园43号2单元801","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553481684,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":89100,"goods_number":1,"sku_id":140930104043,"spec":"静音圆簧+3E棕+贝卡特针织+乳胶,1800*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-01-07/99857bea-2485-46fc-9ee7-2e6aba394425.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561257691,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"柠檬","avatar":"http://t21img.yangkeduo.com/a/1ad2ac6f2bbf20f36ebb2e0ef411994415c93eee-1515379926?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190324-063899566850202","order_id":"708063899566850202","group_order_id":"708063899566850202","mall_id":977197566,"uid":0,"order_time":1553433239,"confirm_time":1553481691,"group_time":1553481691,"pay_time":1553433485,"shipping_time":1553522067,"order_amount":89100,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":89100,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"陈清梅","mobile":null,"province_id":17,"province_name":"江西省","city_id":239,"city_name":"萍乡市","district_id":2032,"district_name":"上栗县","shipping_address":"赤山镇高兰村15号","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553433239,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":89100,"goods_number":1,"sku_id":140930104043,"spec":"静音圆簧+3E棕+贝卡特针织+乳胶,1800*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-01-07/99857bea-2485-46fc-9ee7-2e6aba394425.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561257691,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"周志恒","avatar":"http://t21img.yangkeduo.com/a/0a82aa6511fdb1a7626e01fa0267af3b24bbad46-1525183478?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190323-489563423452546","order_id":"707489563423452546","group_order_id":"707489563423452546","mall_id":977197566,"uid":0,"order_time":1553352529,"confirm_time":1553438882,"group_time":1553438882,"pay_time":1553352541,"shipping_time":1553522005,"order_amount":88100,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":88100,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"李洪新","mobile":null,"province_id":11,"province_name":"河南省","city_id":164,"city_name":"驻马店市","district_id":1394,"district_name":"驿城区","shipping_address":"华骏大道与东祥路交叉口中建五局项目部","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553352529,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":88100,"goods_number":1,"sku_id":140930104041,"spec":"静音圆簧+3E棕+贝卡特针织+乳胶,1500*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-01-07/99857bea-2485-46fc-9ee7-2e6aba394425.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561214882,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"感恩生活","avatar":"http://t20img.yangkeduo.com/a/de9ab868edf65f841ad8cfbadd0f9e598dcc49b0-1528989355?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":true,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190323-090678559392483","order_id":"707090678559392483","group_order_id":"707090678559392483","mall_id":977197566,"uid":0,"order_time":1553352078,"confirm_time":1553435159,"group_time":1553435159,"pay_time":1553352097,"shipping_time":1553521982,"order_amount":88100,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":88100,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"吴远均","mobile":null,"province_id":16,"province_name":"江苏省","city_id":221,"city_name":"苏州市","district_id":1850,"district_name":"虎丘区","shipping_address":"高新区马运路266号佳能苏州有限公司3号门","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553352078,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":88100,"goods_number":1,"sku_id":140930104041,"spec":"静音圆簧+3E棕+贝卡特针织+乳胶,1500*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-01-07/99857bea-2485-46fc-9ee7-2e6aba394425.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561211159,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"悠兰漫步","avatar":"http://t20img.yangkeduo.com/a/68d263e4673acb01330c940feebb51d698b3fe7d-1550470979?imageMogr2/thumbnail/100x","favorite_status":false,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190324-413631120052269","order_id":"708413631120052269","group_order_id":"707090678559392483","mall_id":977197566,"uid":0,"order_time":1553435147,"confirm_time":1553435159,"group_time":1553435159,"pay_time":1553435159,"shipping_time":1553522051,"order_amount":94000,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":94000,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"周毓铭","mobile":null,"province_id":17,"province_name":"江西省","city_id":239,"city_name":"萍乡市","district_id":2028,"district_name":"安源区","shipping_address":"御龙湾13栋3单元301","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553435147,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":18800,"goods_number":5,"sku_id":169025375462,"spec":"海南椰棕+海绵 5cm厚,1200*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-03-11/26d201a8-d460-4743-9114-85845974c558.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561211159,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"极速行者","avatar":"http://t20img.yangkeduo.com/a/d8f723908217808a26c366068d48aa92745fd26c-1535764243?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190324-574966006490614","order_id":"708574966006490614","group_order_id":"707433551115390209","mall_id":977197566,"uid":0,"order_time":1553434649,"confirm_time":1553434659,"group_time":1553434659,"pay_time":1553434659,"shipping_time":1553521939,"order_amount":95400,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":95400,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"陈明升","mobile":null,"province_id":16,"province_name":"江苏省","city_id":221,"city_name":"苏州市","district_id":1855,"district_name":"常熟市","shipping_address":"江夏路景美花园1-208","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553434649,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":15900,"goods_number":6,"sku_id":169025375460,"spec":"海南椰棕+海绵 5cm厚,900*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-03-11/26d201a8-d460-4743-9114-85845974c558.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561210659,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"好好心生","avatar":"http://t20img.yangkeduo.com/a/21322c1b90237c40d00d0677e651db00de1bafcf-1553433633?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190323-433551115390209","order_id":"707433551115390209","group_order_id":"707433551115390209","mall_id":977197566,"uid":0,"order_time":1553350311,"confirm_time":1553434659,"group_time":1553434659,"pay_time":1553351066,"shipping_time":1553521965,"order_amount":113000,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":113000,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"帅巧玲","mobile":null,"province_id":31,"province_name":"浙江省","city_id":388,"city_name":"宁波市","district_id":3284,"district_name":"鄞州区","shipping_address":"潘火街道 下应北路396号3楼2号","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553350311,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":22600,"goods_number":5,"sku_id":169025375464,"spec":"海南椰棕+海绵 5cm厚,1500*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-03-11/26d201a8-d460-4743-9114-85845974c558.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561210659,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"跟着感觉走","avatar":"http://t20img.yangkeduo.com/a/bb0cf7e741b788902d58e327ad22da616b73542f-1545028933?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190323-454997443372375","order_id":"707454997443372375","group_order_id":"707454997443372375","mall_id":977197566,"uid":0,"order_time":1553350216,"confirm_time":1553433239,"group_time":1553433239,"pay_time":1553350226,"shipping_time":1553521897,"order_amount":113000,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":113000,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"植贵梅","mobile":null,"province_id":4,"province_name":"福建省","city_id":60,"city_name":"厦门市","district_id":587,"district_name":"思明区","shipping_address":"文兴西路1459号","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553350216,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":22600,"goods_number":5,"sku_id":169025375464,"spec":"海南椰棕+海绵 5cm厚,1500*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-03-11/26d201a8-d460-4743-9114-85845974c558.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561209239,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"花开富贵","avatar":"http://t21img.yangkeduo.com/a/47238f079229674cfe80397a8509f89882a8884e-1511491040?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190324-257977549493468","order_id":"708257977549493468","group_order_id":"707454997443372375","mall_id":977197566,"uid":0,"order_time":1553433229,"confirm_time":1553433239,"group_time":1553433239,"pay_time":1553433239,"shipping_time":1553521918,"order_amount":89100,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":89100,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"段振浩","mobile":null,"province_id":16,"province_name":"江苏省","city_id":221,"city_name":"苏州市","district_id":1855,"district_name":"常熟市","shipping_address":"梅李镇百合苑1-201","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553433229,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":89100,"goods_number":1,"sku_id":140930104042,"spec":"静音圆簧+3E棕+贝卡特针织+乳胶,1800*1900","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-01-07/99857bea-2485-46fc-9ee7-2e6aba394425.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561209239,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"迷糊","avatar":"http://t20img.yangkeduo.com/a/9d1a5f446f46b22e50826342f042a876e97d3a3a-1553432198?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190322-629845853031569","order_id":"706629845853031569","group_order_id":"706629845853031569","mall_id":977197566,"uid":0,"order_time":1553264938,"confirm_time":1553351286,"group_time":1553351286,"pay_time":1553264945,"shipping_time":1553521873,"order_amount":109000,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":109000,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"童凤","mobile":null,"province_id":16,"province_name":"江苏省","city_id":231,"city_name":"扬州市","district_id":1950,"district_name":"江都区","shipping_address":"浦江西路富豪花园10栋302","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553264938,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":21800,"goods_number":5,"sku_id":169025375464,"spec":"海南椰棕+海绵 5cm厚,1500*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-03-11/26d201a8-d460-4743-9114-85845974c558.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561127286,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"159****1845","avatar":"http://t20img.yangkeduo.com/a/7d5ab0d3fe0b3720788083c29c27ed78840c1ca1-1553321441?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":true,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190322-214349251511908","order_id":"706214349251511908","group_order_id":"706214349251511908","mall_id":977197566,"uid":0,"order_time":1553264567,"confirm_time":1553326484,"group_time":1553326484,"pay_time":1553264593,"shipping_time":1553348142,"order_amount":86200,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":86200,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"郑文文","mobile":null,"province_id":31,"province_name":"浙江省","city_id":391,"city_name":"温州市","district_id":3312,"district_name":"平阳县","shipping_address":"水头镇丹华北路182","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553264567,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":86200,"goods_number":1,"sku_id":140930104042,"spec":"静音圆簧+3E棕+贝卡特针织+乳胶,1800*1900","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-01-07/99857bea-2485-46fc-9ee7-2e6aba394425.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561102484,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"い给我一生安心","avatar":"http://t21img.yangkeduo.com/a/cef4123cd06f2b9dbe20193ebddd752f5a093bdb-1520730872?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190323-469758771930192","order_id":"707469758771930192","group_order_id":"706214349251511908","mall_id":977197566,"uid":0,"order_time":1553326467,"confirm_time":1553326484,"group_time":1553326484,"pay_time":1553326484,"shipping_time":1553348170,"order_amount":131600,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":131600,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"吴江涛","mobile":null,"province_id":10,"province_name":"河北省","city_id":147,"city_name":"邢台市","district_id":1217,"district_name":"南宫市","shipping_address":"东安小区27栋3单元302","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553326467,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":18800,"goods_number":7,"sku_id":169025375462,"spec":"海南椰棕+海绵 5cm厚,1200*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-03-11/26d201a8-d460-4743-9114-85845974c558.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561102484,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"采蘑菇的小姑娘","avatar":"http://t21img.yangkeduo.com/a/6683448a0ef0b45e163834337de6e1180e4d9b07-1525856059?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190322-385290732291754","order_id":"706385290732291754","group_order_id":"706385290732291754","mall_id":977197566,"uid":0,"order_time":1553234768,"confirm_time":1553321117,"group_time":1553321117,"pay_time":1553234776,"shipping_time":1553347805,"order_amount":86200,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":86200,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"马冉","mobile":null,"province_id":22,"province_name":"山东省","city_id":291,"city_name":"聊城市","district_id":2401,"district_name":"临清市","shipping_address":"临清洪亮饭店对过胡同内","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553234768,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":86200,"goods_number":1,"sku_id":140930104042,"spec":"静音圆簧+3E棕+贝卡特针织+乳胶,1800*1900","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-01-07/99857bea-2485-46fc-9ee7-2e6aba394425.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561097117,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"清风","avatar":"http://t20img.yangkeduo.com/a/643f1931f1fe3f5f501eeb7110c4d347d7905302-1530065858?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":true,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190323-683629609652046","order_id":"707683629609652046","group_order_id":"706605554279073784","mall_id":977197566,"uid":0,"order_time":1553309636,"confirm_time":1553309722,"group_time":1553309722,"pay_time":1553309722,"shipping_time":1553348093,"order_amount":95400,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":95400,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"邢彦军","mobile":null,"province_id":27,"province_name":"天津市","city_id":343,"city_name":"天津市","district_id":2913,"district_name":"河西区","shipping_address":"1号楼102号","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553309636,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":15900,"goods_number":6,"sku_id":169025375460,"spec":"海南椰棕+海绵 5cm厚,900*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-03-11/26d201a8-d460-4743-9114-85845974c558.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561085722,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"飞机达人","avatar":"http://t20img.yangkeduo.com/a/0e0bc776b41ba7fa0b0154f7adc65d0085773903-1531223261?imageMogr2/thumbnail/100x","favorite_status":false,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190322-605554279073784","order_id":"706605554279073784","group_order_id":"706605554279073784","mall_id":977197566,"uid":0,"order_time":1553264378,"confirm_time":1553309722,"group_time":1553309722,"pay_time":1553264385,"shipping_time":1553348124,"order_amount":86200,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":86200,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"刘玲","mobile":null,"province_id":16,"province_name":"江苏省","city_id":231,"city_name":"扬州市","district_id":1949,"district_name":"高邮市","shipping_address":"中山南路百岁巷26号","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553264378,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":86200,"goods_number":1,"sku_id":140930104043,"spec":"静音圆簧+3E棕+贝卡特针织+乳胶,1800*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-01-07/99857bea-2485-46fc-9ee7-2e6aba394425.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561085722,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"宽容","avatar":"http://t21img.yangkeduo.com/a/9d14090acb3399258ce77d99989f2d9ddf0c3d7d-1513493787?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190323-329469133991207","order_id":"707329469133991207","group_order_id":"706036139172953544","mall_id":977197566,"uid":0,"order_time":1553308143,"confirm_time":1553308156,"group_time":1553308156,"pay_time":1553308156,"shipping_time":1553348074,"order_amount":89100,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":89100,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"赵永红","mobile":null,"province_id":2,"province_name":"北京市","city_id":52,"city_name":"北京市","district_id":516,"district_name":"密云区","shipping_address":"1单元101","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553308143,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":89100,"goods_number":1,"sku_id":140930104043,"spec":"静音圆簧+3E棕+贝卡特针织+乳胶,1800*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-01-07/99857bea-2485-46fc-9ee7-2e6aba394425.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561084156,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"小白杨","avatar":"http://t20img.yangkeduo.com/a/6b9c222407cd47775a00d45d98af50a60b28b9a0-1527262141?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190322-036139172953544","order_id":"706036139172953544","group_order_id":"706036139172953544","mall_id":977197566,"uid":0,"order_time":1553224374,"confirm_time":1553308156,"group_time":1553308156,"pay_time":1553224382,"shipping_time":1553348052,"order_amount":86200,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":86200,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"刘柳","mobile":null,"province_id":14,"province_name":"湖南省","city_id":200,"city_name":"郴州市","district_id":1670,"district_name":"北湖区","shipping_address":"裕湘公馆2栋1502","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553224374,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":86200,"goods_number":1,"sku_id":140930104043,"spec":"静音圆簧+3E棕+贝卡特针织+乳胶,1800*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-01-07/99857bea-2485-46fc-9ee7-2e6aba394425.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561084156,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"stiver","avatar":"http://t20img.yangkeduo.com/a/95a84388e3fb64664f4b71c7db1449587ee03688-1551924693?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190322-376304108611619","order_id":"706376304108611619","group_order_id":"706637792748211569","mall_id":977197566,"uid":0,"order_time":1553266516,"confirm_time":1553266531,"group_time":1553266531,"pay_time":1553266531,"shipping_time":1553348016,"order_amount":86200,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":86200,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"沙漠鱼","mobile":null,"province_id":3,"province_name":"安徽省","city_id":44,"city_name":"黄山市","district_id":456,"district_name":"黄山区","shipping_address":"平湖西路75号","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553266516,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":86200,"goods_number":1,"sku_id":140930104043,"spec":"静音圆簧+3E棕+贝卡特针织+乳胶,1800*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-01-07/99857bea-2485-46fc-9ee7-2e6aba394425.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561042531,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"沙漠鱼","avatar":"http://t20img.yangkeduo.com/a/220a113a39b3184d1ee9e8567a4e91859f6ce6e8-1553265950?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190322-637792748211569","order_id":"706637792748211569","group_order_id":"706637792748211569","mall_id":977197566,"uid":0,"order_time":1553264565,"confirm_time":1553266531,"group_time":1553266531,"pay_time":1553264601,"shipping_time":1553348033,"order_amount":21800,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":21800,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"童凤","mobile":null,"province_id":16,"province_name":"江苏省","city_id":231,"city_name":"扬州市","district_id":1950,"district_name":"江都区","shipping_address":"浦江西路富豪花园10栋302","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553264565,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":21800,"goods_number":1,"sku_id":169025375464,"spec":"海南椰棕+海绵 5cm厚,1500*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-03-11/26d201a8-d460-4743-9114-85845974c558.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561042531,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"159****1845","avatar":"http://t20img.yangkeduo.com/a/7d5ab0d3fe0b3720788083c29c27ed78840c1ca1-1553321441?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190322-433989223671754","order_id":"706433989223671754","group_order_id":"705169264087991592","mall_id":977197566,"uid":0,"order_time":1553236011,"confirm_time":1553236019,"group_time":1553236019,"pay_time":1553236019,"shipping_time":1553347805,"order_amount":46200,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":46200,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"马冉","mobile":null,"province_id":22,"province_name":"山东省","city_id":291,"city_name":"聊城市","district_id":2401,"district_name":"临清市","shipping_address":"临清洪亮饭店对过胡同内","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553236011,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":15400,"goods_number":3,"sku_id":169025375460,"spec":"海南椰棕+海绵 5cm厚,900*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-03-11/26d201a8-d460-4743-9114-85845974c558.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561012019,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"清风","avatar":"http://t20img.yangkeduo.com/a/643f1931f1fe3f5f501eeb7110c4d347d7905302-1530065858?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190321-169264087991592","order_id":"705169264087991592","group_order_id":"705169264087991592","mall_id":977197566,"uid":0,"order_time":1553180055,"confirm_time":1553236019,"group_time":1553236019,"pay_time":1553180076,"shipping_time":1553347997,"order_amount":86200,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":86200,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"杨晨曦","mobile":null,"province_id":16,"province_name":"江苏省","city_id":231,"city_name":"扬州市","district_id":1947,"district_name":"邗江区","shipping_address":"金山路155号","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553180055,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":86200,"goods_number":1,"sku_id":140930104043,"spec":"静音圆簧+3E棕+贝卡特针织+乳胶,1800*2000","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-01-07/99857bea-2485-46fc-9ee7-2e6aba394425.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561012019,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"晨曦","avatar":"http://t20img.yangkeduo.com/a/52155b208cb9dfc8a6c9884b6312036b76f5b884-1553179022?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190321-005638062793766","order_id":"705005638062793766","group_order_id":"705005638062793766","mall_id":977197566,"uid":0,"order_time":1553147252,"confirm_time":1553233705,"group_time":1553233705,"pay_time":1553147364,"shipping_time":1553347981,"order_amount":92400,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":92400,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"戴弦","mobile":null,"province_id":17,"province_name":"江西省","city_id":234,"city_name":"抚州市","district_id":1970,"district_name":"临川区","shipping_address":"贸易广场十栋德标管业","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553147252,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":15400,"goods_number":6,"sku_id":169025375459,"spec":"海南椰棕+海绵 5cm厚,900*1900","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-03-11/26d201a8-d460-4743-9114-85845974c558.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561009705,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"欣乐人","avatar":"http://t21img.yangkeduo.com/a/b17c34ceefb04b8945ae4c867ef9c724e36d2a65-1521886639?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":true,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190322-632945378330323","order_id":"706632945378330323","group_order_id":"706623395472512151","mall_id":977197566,"uid":0,"order_time":1553228587,"confirm_time":1553228593,"group_time":1553228593,"pay_time":1553228593,"shipping_time":1553347964,"order_amount":127400,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":127400,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"陈凯","mobile":null,"province_id":16,"province_name":"江苏省","city_id":230,"city_name":"盐城市","district_id":1936,"district_name":"盐都区","shipping_address":"义丰镇中官村","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553228587,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":18200,"goods_number":7,"sku_id":169025375461,"spec":"海南椰棕+海绵 5cm厚,1200*1900","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-03-11/26d201a8-d460-4743-9114-85845974c558.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561004593,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"划船机","avatar":"http://t20img.yangkeduo.com/a/c063fd735fdb3eaf125ab782cb5983bd3e0a3d64-1550572624?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0},{"order_sn":"190322-623395472512151","order_id":"706623395472512151","group_order_id":"706623395472512151","mall_id":977197566,"uid":0,"order_time":1553226097,"confirm_time":1553228593,"group_time":1553228593,"pay_time":1553226110,"shipping_time":1553347929,"order_amount":77000,"service_amount":0,"shipping_amount":0,"discount_amount":0,"goods_amount":77000,"customer_num":2,"status":3,"order_status":1,"group_status":1,"pay_status":2,"shipping_status":1,"lucky_status":0,"shipping_id":180,"receive_name":"林迪","mobile":null,"province_id":6,"province_name":"广东省","city_id":82,"city_name":"惠州市","district_id":760,"district_name":"博罗县","shipping_address":"石湾镇皇庭壹号公馆2栋201","type":0,"biz_type":0,"event_type":0,"trade_type":0,"order_attributes":"","created_at":1553226097,"goods_id":5043300020,"goods_name":"席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫","goods_price":15400,"goods_number":5,"sku_id":169025375459,"spec":"海南椰棕+海绵 5cm厚,900*1900","thumb_url":"https://t00img.yangkeduo.com/goods/images/2019-03-11/26d201a8-d460-4743-9114-85845974c558.jpg","is_pre_sale":0,"out_sku_sn":"","out_goods_sn":"","delivery_one_day":null,"promise_shipping_time":1561004593,"buyer_memo":"","remark_status":0,"after_sales_id":null,"after_sales_status":null,"pre_delivery_status":null,"got_timeout_status":0,"track_update_timeout_status":0,"send_timeout_status":null,"stockout_source_type":null,"order_handle_status":null,"expire_time":null,"payment_start_time":0,"payment_end_time":null,"step_pay_orders":null,"nickname":"书法爱好者","avatar":"http://t20img.yangkeduo.com/a/34edc77cbbaf3a10f350f62248ed44cd17c9a428-1553139684?imageMogr2/thumbnail/100x","favorite_status":true,"is_exist_fine_info":0,"total_discount":0,"platform_discount":0,"merchant_discount":0,"event_discount":0,"home_install_value":0,"delivery_home_value":0,"delivery_install_value":0,"use_single_group_card":false,"success_time":null,"send_single_group_card":0,"risk_status":0,"urge_shipping_time":0}]
         */

        private int totalItemNum;
        private List<PageItemsBean> pageItems;

        public int getTotalItemNum() {
            return totalItemNum;
        }

        public void setTotalItemNum(int totalItemNum) {
            this.totalItemNum = totalItemNum;
        }

        public List<PageItemsBean> getPageItems() {
            return pageItems;
        }

        public void setPageItems(List<PageItemsBean> pageItems) {
            this.pageItems = pageItems;
        }

        public static class PageItemsBean {
            /**
             * order_sn : 190325-575653806972669
             * order_id : 709575653806972669
             * group_order_id : 709575653806972669
             * mall_id : 977197566
             * uid : 0
             * order_time : 1553479162
             * confirm_time : 1553521491
             * group_time : 1553521491
             * pay_time : 1553479176
             * shipping_time : 1553522146
             * order_amount : 89100
             * service_amount : 0
             * shipping_amount : 0
             * discount_amount : 0
             * goods_amount : 89100
             * customer_num : 2
             * status : 3
             * order_status : 1
             * group_status : 1
             * pay_status : 2
             * shipping_status : 1
             * lucky_status : 0
             * shipping_id : 180
             * receive_name : 许东生
             * mobile : null
             * province_id : 13
             * province_name : 湖北省
             * city_id : 185
             * city_name : 荆门市
             * district_id : 1581
             * district_name : 京山县
             * shipping_address : 绿林路83-2
             * type : 0
             * biz_type : 0
             * event_type : 0
             * trade_type : 0
             * order_attributes :
             * created_at : 1553479162
             * goods_id : 5043300020
             * goods_name : 席梦思天然乳胶床垫22cm加厚【软硬两用】1.5m1.8m3E椰棕弹簧床垫
             * goods_price : 89100
             * goods_number : 1
             * sku_id : 140930104042
             * spec : 静音圆簧+3E棕+贝卡特针织+乳胶,1800*1900
             * thumb_url : https://t00img.yangkeduo.com/goods/images/2019-01-07/99857bea-2485-46fc-9ee7-2e6aba394425.jpg
             * is_pre_sale : 0
             * out_sku_sn :
             * out_goods_sn :
             * delivery_one_day : null
             * promise_shipping_time : 1561297491
             * buyer_memo :
             * remark_status : 0
             * after_sales_id : null
             * after_sales_status : null
             * pre_delivery_status : null
             * got_timeout_status : 0
             * track_update_timeout_status : 0
             * send_timeout_status : null
             * stockout_source_type : null
             * order_handle_status : null
             * expire_time : null
             * payment_start_time : 0
             * payment_end_time : null
             * step_pay_orders : null
             * nickname : 快乐天使
             * avatar : http://t20img.yangkeduo.com/a/eb99a25db8c02d97688cd00edd212ce423d6a791-1552791390?imageMogr2/thumbnail/100x
             * favorite_status : true
             * is_exist_fine_info : 0
             * total_discount : 0
             * platform_discount : 0
             * merchant_discount : 0
             * event_discount : 0
             * home_install_value : 0
             * delivery_home_value : 0
             * delivery_install_value : 0
             * use_single_group_card : false
             * success_time : null
             * send_single_group_card : 0
             * risk_status : 0
             * urge_shipping_time : 0
             */

            private String order_sn;
            private int order_time;
            private int confirm_time;
            private int group_time;
            private int pay_time;
            private int shipping_time;
            private int order_amount;
            private int goods_amount;
            private int platform_discount;
            private int customer_num;
            private String receive_name;
            private String province_name;
            private String city_name;
            private String district_name;
            private String shipping_address;
            private int created_at;
            private String goods_name;
            private int goods_price;
            private int goods_number;
            private long sku_id;
            private String spec;
            private String out_sku_sn;
            private int promise_shipping_time;
            private String nickname;
            private boolean favorite_status;

            public String getOrder_sn() {
                return order_sn;
            }

            public void setOrder_sn(String order_sn) {
                this.order_sn = order_sn;
            }

            public int getOrder_time() {
                return order_time;
            }

            public void setOrder_time(int order_time) {
                this.order_time = order_time;
            }

            public int getConfirm_time() {
                return confirm_time;
            }

            public void setConfirm_time(int confirm_time) {
                this.confirm_time = confirm_time;
            }

            public int getGroup_time() {
                return group_time;
            }

            public void setGroup_time(int group_time) {
                this.group_time = group_time;
            }

            public int getPay_time() {
                return pay_time;
            }

            public void setPay_time(int pay_time) {
                this.pay_time = pay_time;
            }

            public int getShipping_time() {
                return shipping_time;
            }

            public void setShipping_time(int shipping_time) {
                this.shipping_time = shipping_time;
            }

            public int getOrder_amount() {
                return order_amount;
            }

            public void setOrder_amount(int order_amount) {
                this.order_amount = order_amount;
            }

            public int getGoods_amount() {
                return goods_amount;
            }

            public void setGoods_amount(int goods_amount) {
                this.goods_amount = goods_amount;
            }

            public int getCustomer_num() {
                return customer_num;
            }

            public void setCustomer_num(int customer_num) {
                this.customer_num = customer_num;
            }

            public String getReceive_name() {
                return receive_name;
            }

            public void setReceive_name(String receive_name) {
                this.receive_name = receive_name;
            }

            public String getProvince_name() {
                return province_name;
            }

            public void setProvince_name(String province_name) {
                this.province_name = province_name;
            }

            public String getCity_name() {
                return city_name;
            }

            public void setCity_name(String city_name) {
                this.city_name = city_name;
            }

            public String getDistrict_name() {
                return district_name;
            }

            public void setDistrict_name(String district_name) {
                this.district_name = district_name;
            }

            public String getShipping_address() {
                return shipping_address;
            }

            public void setShipping_address(String shipping_address) {
                this.shipping_address = shipping_address;
            }

            public int getCreated_at() {
                return created_at;
            }

            public void setCreated_at(int created_at) {
                this.created_at = created_at;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public int getGoods_price() {
                return goods_price;
            }

            public void setGoods_price(int goods_price) {
                this.goods_price = goods_price;
            }

            public int getGoods_number() {
                return goods_number;
            }

            public void setGoods_number(int goods_number) {
                this.goods_number = goods_number;
            }

            public long getSku_id() {
                return sku_id;
            }

            public void setSku_id(long sku_id) {
                this.sku_id = sku_id;
            }

            public String getSpec() {
                return spec;
            }

            public void setSpec(String spec) {
                this.spec = spec;
            }

            public String getOut_sku_sn() {
                return out_sku_sn;
            }

            public void setOut_sku_sn(String out_sku_sn) {
                this.out_sku_sn = out_sku_sn;
            }

            public int getPromise_shipping_time() {
                return promise_shipping_time;
            }

            public void setPromise_shipping_time(int promise_shipping_time) {
                this.promise_shipping_time = promise_shipping_time;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public boolean isFavorite_status() {
                return favorite_status;
            }

            public void setFavorite_status(boolean favorite_status) {
                this.favorite_status = favorite_status;
            }

            public int getPlatform_discount() {
                return platform_discount;
            }

            public void setPlatform_discount(int platform_discount) {
                this.platform_discount = platform_discount;
            }
        }
    }
}
