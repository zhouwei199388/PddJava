package com.zw.dao;

import com.zw.domain.Order;
import com.zw.domain.OrderExample.Criteria;
import com.zw.domain.OrderExample.Criterion;
import com.zw.domain.OrderExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OrderSqlProvider {

    public String insertSelective(Order record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("pdd_order");
        
        if (record.getOrdernumber() != null) {
            sql.VALUES("orderNumber", "#{ordernumber,jdbcType=VARCHAR}");
        }
        
        if (record.getSpec() != null) {
            sql.VALUES("spec", "#{spec,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            sql.VALUES("nickname", "#{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getNumber() != null) {
            sql.VALUES("number", "#{number,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsamount() != null) {
            sql.VALUES("goodsAmount", "#{goodsamount,jdbcType=INTEGER}");
        }
        
        if (record.getGoodprice() != null) {
            sql.VALUES("goodPrice", "#{goodprice,jdbcType=INTEGER}");
        }
        
        if (record.getCommission() != null) {
            sql.VALUES("commission", "#{commission,jdbcType=INTEGER}");
        }
        
        if (record.getPoundage() != null) {
            sql.VALUES("poundage", "#{poundage,jdbcType=INTEGER}");
        }
        
        if (record.getWlprice() != null) {
            sql.VALUES("wlPrice", "#{wlprice,jdbcType=INTEGER}");
        }
        
        if (record.getIssd() != null) {
            sql.VALUES("isSd", "#{issd,jdbcType=INTEGER}");
        }
        
        if (record.getFavoritestatus() != null) {
            sql.VALUES("favoriteStatus", "#{favoritestatus,jdbcType=INTEGER}");
        }
        
        if (record.getScStatus() != null) {
            sql.VALUES("sc_status", "#{scStatus,jdbcType=INTEGER}");
        }
        
        if (record.getPaytime() != null) {
            sql.VALUES("payTime", "#{paytime,jdbcType=BIGINT}");
        }
        
        if (record.getSctime() != null) {
            sql.VALUES("scTime", "#{sctime,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(OrderExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("orderNumber");
        sql.SELECT("spec");
        sql.SELECT("nickname");
        sql.SELECT("name");
        sql.SELECT("number");
        sql.SELECT("goodsAmount");
        sql.SELECT("goodPrice");
        sql.SELECT("commission");
        sql.SELECT("poundage");
        sql.SELECT("wlPrice");
        sql.SELECT("isSd");
        sql.SELECT("favoriteStatus");
        sql.SELECT("sc_status");
        sql.SELECT("payTime");
        sql.SELECT("scTime");
        sql.FROM("pdd_order");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Order record = (Order) parameter.get("record");
        OrderExample example = (OrderExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("pdd_order");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getOrdernumber() != null) {
            sql.SET("orderNumber = #{record.ordernumber,jdbcType=VARCHAR}");
        }
        
        if (record.getSpec() != null) {
            sql.SET("spec = #{record.spec,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            sql.SET("nickname = #{record.nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getNumber() != null) {
            sql.SET("number = #{record.number,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsamount() != null) {
            sql.SET("goodsAmount = #{record.goodsamount,jdbcType=INTEGER}");
        }
        
        if (record.getGoodprice() != null) {
            sql.SET("goodPrice = #{record.goodprice,jdbcType=INTEGER}");
        }
        
        if (record.getCommission() != null) {
            sql.SET("commission = #{record.commission,jdbcType=INTEGER}");
        }
        
        if (record.getPoundage() != null) {
            sql.SET("poundage = #{record.poundage,jdbcType=INTEGER}");
        }
        
        if (record.getWlprice() != null) {
            sql.SET("wlPrice = #{record.wlprice,jdbcType=INTEGER}");
        }
        
        if (record.getIssd() != null) {
            sql.SET("isSd = #{record.issd,jdbcType=INTEGER}");
        }
        
        if (record.getFavoritestatus() != null) {
            sql.SET("favoriteStatus = #{record.favoritestatus,jdbcType=INTEGER}");
        }
        
        if (record.getScStatus() != null) {
            sql.SET("sc_status = #{record.scStatus,jdbcType=INTEGER}");
        }
        
        if (record.getPaytime() != null) {
            sql.SET("payTime = #{record.paytime,jdbcType=BIGINT}");
        }
        
        if (record.getSctime() != null) {
            sql.SET("scTime = #{record.sctime,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("pdd_order");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("orderNumber = #{record.ordernumber,jdbcType=VARCHAR}");
        sql.SET("spec = #{record.spec,jdbcType=VARCHAR}");
        sql.SET("nickname = #{record.nickname,jdbcType=VARCHAR}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("number = #{record.number,jdbcType=INTEGER}");
        sql.SET("goodsAmount = #{record.goodsamount,jdbcType=INTEGER}");
        sql.SET("goodPrice = #{record.goodprice,jdbcType=INTEGER}");
        sql.SET("commission = #{record.commission,jdbcType=INTEGER}");
        sql.SET("poundage = #{record.poundage,jdbcType=INTEGER}");
        sql.SET("wlPrice = #{record.wlprice,jdbcType=INTEGER}");
        sql.SET("isSd = #{record.issd,jdbcType=INTEGER}");
        sql.SET("favoriteStatus = #{record.favoritestatus,jdbcType=INTEGER}");
        sql.SET("sc_status = #{record.scStatus,jdbcType=INTEGER}");
        sql.SET("payTime = #{record.paytime,jdbcType=BIGINT}");
        sql.SET("scTime = #{record.sctime,jdbcType=BIGINT}");
        
        OrderExample example = (OrderExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Order record) {
        SQL sql = new SQL();
        sql.UPDATE("pdd_order");
        
        if (record.getOrdernumber() != null) {
            sql.SET("orderNumber = #{ordernumber,jdbcType=VARCHAR}");
        }
        
        if (record.getSpec() != null) {
            sql.SET("spec = #{spec,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            sql.SET("nickname = #{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getNumber() != null) {
            sql.SET("number = #{number,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsamount() != null) {
            sql.SET("goodsAmount = #{goodsamount,jdbcType=INTEGER}");
        }
        
        if (record.getGoodprice() != null) {
            sql.SET("goodPrice = #{goodprice,jdbcType=INTEGER}");
        }
        
        if (record.getCommission() != null) {
            sql.SET("commission = #{commission,jdbcType=INTEGER}");
        }
        
        if (record.getPoundage() != null) {
            sql.SET("poundage = #{poundage,jdbcType=INTEGER}");
        }
        
        if (record.getWlprice() != null) {
            sql.SET("wlPrice = #{wlprice,jdbcType=INTEGER}");
        }
        
        if (record.getIssd() != null) {
            sql.SET("isSd = #{issd,jdbcType=INTEGER}");
        }
        
        if (record.getFavoritestatus() != null) {
            sql.SET("favoriteStatus = #{favoritestatus,jdbcType=INTEGER}");
        }
        
        if (record.getScStatus() != null) {
            sql.SET("sc_status = #{scStatus,jdbcType=INTEGER}");
        }
        
        if (record.getPaytime() != null) {
            sql.SET("payTime = #{paytime,jdbcType=BIGINT}");
        }
        
        if (record.getSctime() != null) {
            sql.SET("scTime = #{sctime,jdbcType=BIGINT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, OrderExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}