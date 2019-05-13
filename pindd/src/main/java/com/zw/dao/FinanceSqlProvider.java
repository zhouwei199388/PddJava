package com.zw.dao;

import com.zw.domain.Finance;
import com.zw.domain.FinanceExample.Criteria;
import com.zw.domain.FinanceExample.Criterion;
import com.zw.domain.FinanceExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FinanceSqlProvider {

    public String insertSelective(Finance record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("finance");
        
        if (record.getEarning() != null) {
            sql.VALUES("earning", "#{earning,jdbcType=INTEGER}");
        }
        
        if (record.getSdpricetotal() != null) {
            sql.VALUES("sdPriceTotal", "#{sdpricetotal,jdbcType=INTEGER}");
        }
        
        if (record.getCommissiontotal() != null) {
            sql.VALUES("commissionTotal", "#{commissiontotal,jdbcType=INTEGER}");
        }
        
        if (record.getCoundagetotal() != null) {
            sql.VALUES("coundageTotal", "#{coundagetotal,jdbcType=INTEGER}");
        }
        
        if (record.getWlpricetotal() != null) {
            sql.VALUES("wlPriceTotal", "#{wlpricetotal,jdbcType=INTEGER}");
        }
        
        if (record.getGoodspricetotal() != null) {
            sql.VALUES("goodsPriceTotal", "#{goodspricetotal,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(FinanceExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("earning");
        sql.SELECT("sdPriceTotal");
        sql.SELECT("commissionTotal");
        sql.SELECT("coundageTotal");
        sql.SELECT("wlPriceTotal");
        sql.SELECT("goodsPriceTotal");
        sql.FROM("finance");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Finance record = (Finance) parameter.get("record");
        FinanceExample example = (FinanceExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("finance");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getEarning() != null) {
            sql.SET("earning = #{record.earning,jdbcType=INTEGER}");
        }
        
        if (record.getSdpricetotal() != null) {
            sql.SET("sdPriceTotal = #{record.sdpricetotal,jdbcType=INTEGER}");
        }
        
        if (record.getCommissiontotal() != null) {
            sql.SET("commissionTotal = #{record.commissiontotal,jdbcType=INTEGER}");
        }
        
        if (record.getCoundagetotal() != null) {
            sql.SET("coundageTotal = #{record.coundagetotal,jdbcType=INTEGER}");
        }
        
        if (record.getWlpricetotal() != null) {
            sql.SET("wlPriceTotal = #{record.wlpricetotal,jdbcType=INTEGER}");
        }
        
        if (record.getGoodspricetotal() != null) {
            sql.SET("goodsPriceTotal = #{record.goodspricetotal,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("finance");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("earning = #{record.earning,jdbcType=INTEGER}");
        sql.SET("sdPriceTotal = #{record.sdpricetotal,jdbcType=INTEGER}");
        sql.SET("commissionTotal = #{record.commissiontotal,jdbcType=INTEGER}");
        sql.SET("coundageTotal = #{record.coundagetotal,jdbcType=INTEGER}");
        sql.SET("wlPriceTotal = #{record.wlpricetotal,jdbcType=INTEGER}");
        sql.SET("goodsPriceTotal = #{record.goodspricetotal,jdbcType=INTEGER}");
        
        FinanceExample example = (FinanceExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Finance record) {
        SQL sql = new SQL();
        sql.UPDATE("finance");
        
        if (record.getEarning() != null) {
            sql.SET("earning = #{earning,jdbcType=INTEGER}");
        }
        
        if (record.getSdpricetotal() != null) {
            sql.SET("sdPriceTotal = #{sdpricetotal,jdbcType=INTEGER}");
        }
        
        if (record.getCommissiontotal() != null) {
            sql.SET("commissionTotal = #{commissiontotal,jdbcType=INTEGER}");
        }
        
        if (record.getCoundagetotal() != null) {
            sql.SET("coundageTotal = #{coundagetotal,jdbcType=INTEGER}");
        }
        
        if (record.getWlpricetotal() != null) {
            sql.SET("wlPriceTotal = #{wlpricetotal,jdbcType=INTEGER}");
        }
        
        if (record.getGoodspricetotal() != null) {
            sql.SET("goodsPriceTotal = #{goodspricetotal,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, FinanceExample example, boolean includeExamplePhrase) {
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