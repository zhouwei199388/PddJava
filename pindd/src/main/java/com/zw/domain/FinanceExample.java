package com.zw.domain;

import java.util.ArrayList;
import java.util.List;

public class FinanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinanceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEarningIsNull() {
            addCriterion("earning is null");
            return (Criteria) this;
        }

        public Criteria andEarningIsNotNull() {
            addCriterion("earning is not null");
            return (Criteria) this;
        }

        public Criteria andEarningEqualTo(Integer value) {
            addCriterion("earning =", value, "earning");
            return (Criteria) this;
        }

        public Criteria andEarningNotEqualTo(Integer value) {
            addCriterion("earning <>", value, "earning");
            return (Criteria) this;
        }

        public Criteria andEarningGreaterThan(Integer value) {
            addCriterion("earning >", value, "earning");
            return (Criteria) this;
        }

        public Criteria andEarningGreaterThanOrEqualTo(Integer value) {
            addCriterion("earning >=", value, "earning");
            return (Criteria) this;
        }

        public Criteria andEarningLessThan(Integer value) {
            addCriterion("earning <", value, "earning");
            return (Criteria) this;
        }

        public Criteria andEarningLessThanOrEqualTo(Integer value) {
            addCriterion("earning <=", value, "earning");
            return (Criteria) this;
        }

        public Criteria andEarningIn(List<Integer> values) {
            addCriterion("earning in", values, "earning");
            return (Criteria) this;
        }

        public Criteria andEarningNotIn(List<Integer> values) {
            addCriterion("earning not in", values, "earning");
            return (Criteria) this;
        }

        public Criteria andEarningBetween(Integer value1, Integer value2) {
            addCriterion("earning between", value1, value2, "earning");
            return (Criteria) this;
        }

        public Criteria andEarningNotBetween(Integer value1, Integer value2) {
            addCriterion("earning not between", value1, value2, "earning");
            return (Criteria) this;
        }

        public Criteria andSdpricetotalIsNull() {
            addCriterion("sdPriceTotal is null");
            return (Criteria) this;
        }

        public Criteria andSdpricetotalIsNotNull() {
            addCriterion("sdPriceTotal is not null");
            return (Criteria) this;
        }

        public Criteria andSdpricetotalEqualTo(Integer value) {
            addCriterion("sdPriceTotal =", value, "sdpricetotal");
            return (Criteria) this;
        }

        public Criteria andSdpricetotalNotEqualTo(Integer value) {
            addCriterion("sdPriceTotal <>", value, "sdpricetotal");
            return (Criteria) this;
        }

        public Criteria andSdpricetotalGreaterThan(Integer value) {
            addCriterion("sdPriceTotal >", value, "sdpricetotal");
            return (Criteria) this;
        }

        public Criteria andSdpricetotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("sdPriceTotal >=", value, "sdpricetotal");
            return (Criteria) this;
        }

        public Criteria andSdpricetotalLessThan(Integer value) {
            addCriterion("sdPriceTotal <", value, "sdpricetotal");
            return (Criteria) this;
        }

        public Criteria andSdpricetotalLessThanOrEqualTo(Integer value) {
            addCriterion("sdPriceTotal <=", value, "sdpricetotal");
            return (Criteria) this;
        }

        public Criteria andSdpricetotalIn(List<Integer> values) {
            addCriterion("sdPriceTotal in", values, "sdpricetotal");
            return (Criteria) this;
        }

        public Criteria andSdpricetotalNotIn(List<Integer> values) {
            addCriterion("sdPriceTotal not in", values, "sdpricetotal");
            return (Criteria) this;
        }

        public Criteria andSdpricetotalBetween(Integer value1, Integer value2) {
            addCriterion("sdPriceTotal between", value1, value2, "sdpricetotal");
            return (Criteria) this;
        }

        public Criteria andSdpricetotalNotBetween(Integer value1, Integer value2) {
            addCriterion("sdPriceTotal not between", value1, value2, "sdpricetotal");
            return (Criteria) this;
        }

        public Criteria andCommissiontotalIsNull() {
            addCriterion("commissionTotal is null");
            return (Criteria) this;
        }

        public Criteria andCommissiontotalIsNotNull() {
            addCriterion("commissionTotal is not null");
            return (Criteria) this;
        }

        public Criteria andCommissiontotalEqualTo(Integer value) {
            addCriterion("commissionTotal =", value, "commissiontotal");
            return (Criteria) this;
        }

        public Criteria andCommissiontotalNotEqualTo(Integer value) {
            addCriterion("commissionTotal <>", value, "commissiontotal");
            return (Criteria) this;
        }

        public Criteria andCommissiontotalGreaterThan(Integer value) {
            addCriterion("commissionTotal >", value, "commissiontotal");
            return (Criteria) this;
        }

        public Criteria andCommissiontotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("commissionTotal >=", value, "commissiontotal");
            return (Criteria) this;
        }

        public Criteria andCommissiontotalLessThan(Integer value) {
            addCriterion("commissionTotal <", value, "commissiontotal");
            return (Criteria) this;
        }

        public Criteria andCommissiontotalLessThanOrEqualTo(Integer value) {
            addCriterion("commissionTotal <=", value, "commissiontotal");
            return (Criteria) this;
        }

        public Criteria andCommissiontotalIn(List<Integer> values) {
            addCriterion("commissionTotal in", values, "commissiontotal");
            return (Criteria) this;
        }

        public Criteria andCommissiontotalNotIn(List<Integer> values) {
            addCriterion("commissionTotal not in", values, "commissiontotal");
            return (Criteria) this;
        }

        public Criteria andCommissiontotalBetween(Integer value1, Integer value2) {
            addCriterion("commissionTotal between", value1, value2, "commissiontotal");
            return (Criteria) this;
        }

        public Criteria andCommissiontotalNotBetween(Integer value1, Integer value2) {
            addCriterion("commissionTotal not between", value1, value2, "commissiontotal");
            return (Criteria) this;
        }

        public Criteria andCoundagetotalIsNull() {
            addCriterion("coundageTotal is null");
            return (Criteria) this;
        }

        public Criteria andCoundagetotalIsNotNull() {
            addCriterion("coundageTotal is not null");
            return (Criteria) this;
        }

        public Criteria andCoundagetotalEqualTo(Integer value) {
            addCriterion("coundageTotal =", value, "coundagetotal");
            return (Criteria) this;
        }

        public Criteria andCoundagetotalNotEqualTo(Integer value) {
            addCriterion("coundageTotal <>", value, "coundagetotal");
            return (Criteria) this;
        }

        public Criteria andCoundagetotalGreaterThan(Integer value) {
            addCriterion("coundageTotal >", value, "coundagetotal");
            return (Criteria) this;
        }

        public Criteria andCoundagetotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("coundageTotal >=", value, "coundagetotal");
            return (Criteria) this;
        }

        public Criteria andCoundagetotalLessThan(Integer value) {
            addCriterion("coundageTotal <", value, "coundagetotal");
            return (Criteria) this;
        }

        public Criteria andCoundagetotalLessThanOrEqualTo(Integer value) {
            addCriterion("coundageTotal <=", value, "coundagetotal");
            return (Criteria) this;
        }

        public Criteria andCoundagetotalIn(List<Integer> values) {
            addCriterion("coundageTotal in", values, "coundagetotal");
            return (Criteria) this;
        }

        public Criteria andCoundagetotalNotIn(List<Integer> values) {
            addCriterion("coundageTotal not in", values, "coundagetotal");
            return (Criteria) this;
        }

        public Criteria andCoundagetotalBetween(Integer value1, Integer value2) {
            addCriterion("coundageTotal between", value1, value2, "coundagetotal");
            return (Criteria) this;
        }

        public Criteria andCoundagetotalNotBetween(Integer value1, Integer value2) {
            addCriterion("coundageTotal not between", value1, value2, "coundagetotal");
            return (Criteria) this;
        }

        public Criteria andWlpricetotalIsNull() {
            addCriterion("wlPriceTotal is null");
            return (Criteria) this;
        }

        public Criteria andWlpricetotalIsNotNull() {
            addCriterion("wlPriceTotal is not null");
            return (Criteria) this;
        }

        public Criteria andWlpricetotalEqualTo(Integer value) {
            addCriterion("wlPriceTotal =", value, "wlpricetotal");
            return (Criteria) this;
        }

        public Criteria andWlpricetotalNotEqualTo(Integer value) {
            addCriterion("wlPriceTotal <>", value, "wlpricetotal");
            return (Criteria) this;
        }

        public Criteria andWlpricetotalGreaterThan(Integer value) {
            addCriterion("wlPriceTotal >", value, "wlpricetotal");
            return (Criteria) this;
        }

        public Criteria andWlpricetotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("wlPriceTotal >=", value, "wlpricetotal");
            return (Criteria) this;
        }

        public Criteria andWlpricetotalLessThan(Integer value) {
            addCriterion("wlPriceTotal <", value, "wlpricetotal");
            return (Criteria) this;
        }

        public Criteria andWlpricetotalLessThanOrEqualTo(Integer value) {
            addCriterion("wlPriceTotal <=", value, "wlpricetotal");
            return (Criteria) this;
        }

        public Criteria andWlpricetotalIn(List<Integer> values) {
            addCriterion("wlPriceTotal in", values, "wlpricetotal");
            return (Criteria) this;
        }

        public Criteria andWlpricetotalNotIn(List<Integer> values) {
            addCriterion("wlPriceTotal not in", values, "wlpricetotal");
            return (Criteria) this;
        }

        public Criteria andWlpricetotalBetween(Integer value1, Integer value2) {
            addCriterion("wlPriceTotal between", value1, value2, "wlpricetotal");
            return (Criteria) this;
        }

        public Criteria andWlpricetotalNotBetween(Integer value1, Integer value2) {
            addCriterion("wlPriceTotal not between", value1, value2, "wlpricetotal");
            return (Criteria) this;
        }

        public Criteria andGoodspricetotalIsNull() {
            addCriterion("goodsPriceTotal is null");
            return (Criteria) this;
        }

        public Criteria andGoodspricetotalIsNotNull() {
            addCriterion("goodsPriceTotal is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspricetotalEqualTo(Integer value) {
            addCriterion("goodsPriceTotal =", value, "goodspricetotal");
            return (Criteria) this;
        }

        public Criteria andGoodspricetotalNotEqualTo(Integer value) {
            addCriterion("goodsPriceTotal <>", value, "goodspricetotal");
            return (Criteria) this;
        }

        public Criteria andGoodspricetotalGreaterThan(Integer value) {
            addCriterion("goodsPriceTotal >", value, "goodspricetotal");
            return (Criteria) this;
        }

        public Criteria andGoodspricetotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsPriceTotal >=", value, "goodspricetotal");
            return (Criteria) this;
        }

        public Criteria andGoodspricetotalLessThan(Integer value) {
            addCriterion("goodsPriceTotal <", value, "goodspricetotal");
            return (Criteria) this;
        }

        public Criteria andGoodspricetotalLessThanOrEqualTo(Integer value) {
            addCriterion("goodsPriceTotal <=", value, "goodspricetotal");
            return (Criteria) this;
        }

        public Criteria andGoodspricetotalIn(List<Integer> values) {
            addCriterion("goodsPriceTotal in", values, "goodspricetotal");
            return (Criteria) this;
        }

        public Criteria andGoodspricetotalNotIn(List<Integer> values) {
            addCriterion("goodsPriceTotal not in", values, "goodspricetotal");
            return (Criteria) this;
        }

        public Criteria andGoodspricetotalBetween(Integer value1, Integer value2) {
            addCriterion("goodsPriceTotal between", value1, value2, "goodspricetotal");
            return (Criteria) this;
        }

        public Criteria andGoodspricetotalNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsPriceTotal not between", value1, value2, "goodspricetotal");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}