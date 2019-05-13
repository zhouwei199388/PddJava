package com.zw.domain;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrdernumberIsNull() {
            addCriterion("orderNumber is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNotNull() {
            addCriterion("orderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberEqualTo(String value) {
            addCriterion("orderNumber =", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotEqualTo(String value) {
            addCriterion("orderNumber <>", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThan(String value) {
            addCriterion("orderNumber >", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThanOrEqualTo(String value) {
            addCriterion("orderNumber >=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThan(String value) {
            addCriterion("orderNumber <", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThanOrEqualTo(String value) {
            addCriterion("orderNumber <=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLike(String value) {
            addCriterion("orderNumber like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotLike(String value) {
            addCriterion("orderNumber not like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIn(List<String> values) {
            addCriterion("orderNumber in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotIn(List<String> values) {
            addCriterion("orderNumber not in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberBetween(String value1, String value2) {
            addCriterion("orderNumber between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotBetween(String value1, String value2) {
            addCriterion("orderNumber not between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andSpecIsNull() {
            addCriterion("spec is null");
            return (Criteria) this;
        }

        public Criteria andSpecIsNotNull() {
            addCriterion("spec is not null");
            return (Criteria) this;
        }

        public Criteria andSpecEqualTo(String value) {
            addCriterion("spec =", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotEqualTo(String value) {
            addCriterion("spec <>", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThan(String value) {
            addCriterion("spec >", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThanOrEqualTo(String value) {
            addCriterion("spec >=", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLessThan(String value) {
            addCriterion("spec <", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLessThanOrEqualTo(String value) {
            addCriterion("spec <=", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLike(String value) {
            addCriterion("spec like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotLike(String value) {
            addCriterion("spec not like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecIn(List<String> values) {
            addCriterion("spec in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotIn(List<String> values) {
            addCriterion("spec not in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecBetween(String value1, String value2) {
            addCriterion("spec between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotBetween(String value1, String value2) {
            addCriterion("spec not between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andGoodsamountIsNull() {
            addCriterion("goodsAmount is null");
            return (Criteria) this;
        }

        public Criteria andGoodsamountIsNotNull() {
            addCriterion("goodsAmount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsamountEqualTo(Integer value) {
            addCriterion("goodsAmount =", value, "goodsamount");
            return (Criteria) this;
        }

        public Criteria andGoodsamountNotEqualTo(Integer value) {
            addCriterion("goodsAmount <>", value, "goodsamount");
            return (Criteria) this;
        }

        public Criteria andGoodsamountGreaterThan(Integer value) {
            addCriterion("goodsAmount >", value, "goodsamount");
            return (Criteria) this;
        }

        public Criteria andGoodsamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsAmount >=", value, "goodsamount");
            return (Criteria) this;
        }

        public Criteria andGoodsamountLessThan(Integer value) {
            addCriterion("goodsAmount <", value, "goodsamount");
            return (Criteria) this;
        }

        public Criteria andGoodsamountLessThanOrEqualTo(Integer value) {
            addCriterion("goodsAmount <=", value, "goodsamount");
            return (Criteria) this;
        }

        public Criteria andGoodsamountIn(List<Integer> values) {
            addCriterion("goodsAmount in", values, "goodsamount");
            return (Criteria) this;
        }

        public Criteria andGoodsamountNotIn(List<Integer> values) {
            addCriterion("goodsAmount not in", values, "goodsamount");
            return (Criteria) this;
        }

        public Criteria andGoodsamountBetween(Integer value1, Integer value2) {
            addCriterion("goodsAmount between", value1, value2, "goodsamount");
            return (Criteria) this;
        }

        public Criteria andGoodsamountNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsAmount not between", value1, value2, "goodsamount");
            return (Criteria) this;
        }

        public Criteria andGoodpriceIsNull() {
            addCriterion("goodPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoodpriceIsNotNull() {
            addCriterion("goodPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodpriceEqualTo(Integer value) {
            addCriterion("goodPrice =", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceNotEqualTo(Integer value) {
            addCriterion("goodPrice <>", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceGreaterThan(Integer value) {
            addCriterion("goodPrice >", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodPrice >=", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceLessThan(Integer value) {
            addCriterion("goodPrice <", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceLessThanOrEqualTo(Integer value) {
            addCriterion("goodPrice <=", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceIn(List<Integer> values) {
            addCriterion("goodPrice in", values, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceNotIn(List<Integer> values) {
            addCriterion("goodPrice not in", values, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceBetween(Integer value1, Integer value2) {
            addCriterion("goodPrice between", value1, value2, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("goodPrice not between", value1, value2, "goodprice");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNull() {
            addCriterion("commission is null");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNotNull() {
            addCriterion("commission is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionEqualTo(Integer value) {
            addCriterion("commission =", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotEqualTo(Integer value) {
            addCriterion("commission <>", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThan(Integer value) {
            addCriterion("commission >", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanOrEqualTo(Integer value) {
            addCriterion("commission >=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThan(Integer value) {
            addCriterion("commission <", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanOrEqualTo(Integer value) {
            addCriterion("commission <=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionIn(List<Integer> values) {
            addCriterion("commission in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotIn(List<Integer> values) {
            addCriterion("commission not in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionBetween(Integer value1, Integer value2) {
            addCriterion("commission between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotBetween(Integer value1, Integer value2) {
            addCriterion("commission not between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andPoundageIsNull() {
            addCriterion("poundage is null");
            return (Criteria) this;
        }

        public Criteria andPoundageIsNotNull() {
            addCriterion("poundage is not null");
            return (Criteria) this;
        }

        public Criteria andPoundageEqualTo(Integer value) {
            addCriterion("poundage =", value, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageNotEqualTo(Integer value) {
            addCriterion("poundage <>", value, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageGreaterThan(Integer value) {
            addCriterion("poundage >", value, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageGreaterThanOrEqualTo(Integer value) {
            addCriterion("poundage >=", value, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageLessThan(Integer value) {
            addCriterion("poundage <", value, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageLessThanOrEqualTo(Integer value) {
            addCriterion("poundage <=", value, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageIn(List<Integer> values) {
            addCriterion("poundage in", values, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageNotIn(List<Integer> values) {
            addCriterion("poundage not in", values, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageBetween(Integer value1, Integer value2) {
            addCriterion("poundage between", value1, value2, "poundage");
            return (Criteria) this;
        }

        public Criteria andPoundageNotBetween(Integer value1, Integer value2) {
            addCriterion("poundage not between", value1, value2, "poundage");
            return (Criteria) this;
        }

        public Criteria andWlpriceIsNull() {
            addCriterion("wlPrice is null");
            return (Criteria) this;
        }

        public Criteria andWlpriceIsNotNull() {
            addCriterion("wlPrice is not null");
            return (Criteria) this;
        }

        public Criteria andWlpriceEqualTo(Integer value) {
            addCriterion("wlPrice =", value, "wlprice");
            return (Criteria) this;
        }

        public Criteria andWlpriceNotEqualTo(Integer value) {
            addCriterion("wlPrice <>", value, "wlprice");
            return (Criteria) this;
        }

        public Criteria andWlpriceGreaterThan(Integer value) {
            addCriterion("wlPrice >", value, "wlprice");
            return (Criteria) this;
        }

        public Criteria andWlpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("wlPrice >=", value, "wlprice");
            return (Criteria) this;
        }

        public Criteria andWlpriceLessThan(Integer value) {
            addCriterion("wlPrice <", value, "wlprice");
            return (Criteria) this;
        }

        public Criteria andWlpriceLessThanOrEqualTo(Integer value) {
            addCriterion("wlPrice <=", value, "wlprice");
            return (Criteria) this;
        }

        public Criteria andWlpriceIn(List<Integer> values) {
            addCriterion("wlPrice in", values, "wlprice");
            return (Criteria) this;
        }

        public Criteria andWlpriceNotIn(List<Integer> values) {
            addCriterion("wlPrice not in", values, "wlprice");
            return (Criteria) this;
        }

        public Criteria andWlpriceBetween(Integer value1, Integer value2) {
            addCriterion("wlPrice between", value1, value2, "wlprice");
            return (Criteria) this;
        }

        public Criteria andWlpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("wlPrice not between", value1, value2, "wlprice");
            return (Criteria) this;
        }

        public Criteria andIssdIsNull() {
            addCriterion("isSd is null");
            return (Criteria) this;
        }

        public Criteria andIssdIsNotNull() {
            addCriterion("isSd is not null");
            return (Criteria) this;
        }

        public Criteria andIssdEqualTo(Integer value) {
            addCriterion("isSd =", value, "issd");
            return (Criteria) this;
        }

        public Criteria andIssdNotEqualTo(Integer value) {
            addCriterion("isSd <>", value, "issd");
            return (Criteria) this;
        }

        public Criteria andIssdGreaterThan(Integer value) {
            addCriterion("isSd >", value, "issd");
            return (Criteria) this;
        }

        public Criteria andIssdGreaterThanOrEqualTo(Integer value) {
            addCriterion("isSd >=", value, "issd");
            return (Criteria) this;
        }

        public Criteria andIssdLessThan(Integer value) {
            addCriterion("isSd <", value, "issd");
            return (Criteria) this;
        }

        public Criteria andIssdLessThanOrEqualTo(Integer value) {
            addCriterion("isSd <=", value, "issd");
            return (Criteria) this;
        }

        public Criteria andIssdIn(List<Integer> values) {
            addCriterion("isSd in", values, "issd");
            return (Criteria) this;
        }

        public Criteria andIssdNotIn(List<Integer> values) {
            addCriterion("isSd not in", values, "issd");
            return (Criteria) this;
        }

        public Criteria andIssdBetween(Integer value1, Integer value2) {
            addCriterion("isSd between", value1, value2, "issd");
            return (Criteria) this;
        }

        public Criteria andIssdNotBetween(Integer value1, Integer value2) {
            addCriterion("isSd not between", value1, value2, "issd");
            return (Criteria) this;
        }

        public Criteria andFavoritestatusIsNull() {
            addCriterion("favoriteStatus is null");
            return (Criteria) this;
        }

        public Criteria andFavoritestatusIsNotNull() {
            addCriterion("favoriteStatus is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritestatusEqualTo(Integer value) {
            addCriterion("favoriteStatus =", value, "favoritestatus");
            return (Criteria) this;
        }

        public Criteria andFavoritestatusNotEqualTo(Integer value) {
            addCriterion("favoriteStatus <>", value, "favoritestatus");
            return (Criteria) this;
        }

        public Criteria andFavoritestatusGreaterThan(Integer value) {
            addCriterion("favoriteStatus >", value, "favoritestatus");
            return (Criteria) this;
        }

        public Criteria andFavoritestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("favoriteStatus >=", value, "favoritestatus");
            return (Criteria) this;
        }

        public Criteria andFavoritestatusLessThan(Integer value) {
            addCriterion("favoriteStatus <", value, "favoritestatus");
            return (Criteria) this;
        }

        public Criteria andFavoritestatusLessThanOrEqualTo(Integer value) {
            addCriterion("favoriteStatus <=", value, "favoritestatus");
            return (Criteria) this;
        }

        public Criteria andFavoritestatusIn(List<Integer> values) {
            addCriterion("favoriteStatus in", values, "favoritestatus");
            return (Criteria) this;
        }

        public Criteria andFavoritestatusNotIn(List<Integer> values) {
            addCriterion("favoriteStatus not in", values, "favoritestatus");
            return (Criteria) this;
        }

        public Criteria andFavoritestatusBetween(Integer value1, Integer value2) {
            addCriterion("favoriteStatus between", value1, value2, "favoritestatus");
            return (Criteria) this;
        }

        public Criteria andFavoritestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("favoriteStatus not between", value1, value2, "favoritestatus");
            return (Criteria) this;
        }

        public Criteria andScStatusIsNull() {
            addCriterion("sc_status is null");
            return (Criteria) this;
        }

        public Criteria andScStatusIsNotNull() {
            addCriterion("sc_status is not null");
            return (Criteria) this;
        }

        public Criteria andScStatusEqualTo(Integer value) {
            addCriterion("sc_status =", value, "scStatus");
            return (Criteria) this;
        }

        public Criteria andScStatusNotEqualTo(Integer value) {
            addCriterion("sc_status <>", value, "scStatus");
            return (Criteria) this;
        }

        public Criteria andScStatusGreaterThan(Integer value) {
            addCriterion("sc_status >", value, "scStatus");
            return (Criteria) this;
        }

        public Criteria andScStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_status >=", value, "scStatus");
            return (Criteria) this;
        }

        public Criteria andScStatusLessThan(Integer value) {
            addCriterion("sc_status <", value, "scStatus");
            return (Criteria) this;
        }

        public Criteria andScStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sc_status <=", value, "scStatus");
            return (Criteria) this;
        }

        public Criteria andScStatusIn(List<Integer> values) {
            addCriterion("sc_status in", values, "scStatus");
            return (Criteria) this;
        }

        public Criteria andScStatusNotIn(List<Integer> values) {
            addCriterion("sc_status not in", values, "scStatus");
            return (Criteria) this;
        }

        public Criteria andScStatusBetween(Integer value1, Integer value2) {
            addCriterion("sc_status between", value1, value2, "scStatus");
            return (Criteria) this;
        }

        public Criteria andScStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_status not between", value1, value2, "scStatus");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("payTime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("payTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Long value) {
            addCriterion("payTime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Long value) {
            addCriterion("payTime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Long value) {
            addCriterion("payTime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Long value) {
            addCriterion("payTime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Long value) {
            addCriterion("payTime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Long value) {
            addCriterion("payTime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Long> values) {
            addCriterion("payTime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Long> values) {
            addCriterion("payTime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Long value1, Long value2) {
            addCriterion("payTime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Long value1, Long value2) {
            addCriterion("payTime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andSctimeIsNull() {
            addCriterion("scTime is null");
            return (Criteria) this;
        }

        public Criteria andSctimeIsNotNull() {
            addCriterion("scTime is not null");
            return (Criteria) this;
        }

        public Criteria andSctimeEqualTo(Long value) {
            addCriterion("scTime =", value, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeNotEqualTo(Long value) {
            addCriterion("scTime <>", value, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeGreaterThan(Long value) {
            addCriterion("scTime >", value, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeGreaterThanOrEqualTo(Long value) {
            addCriterion("scTime >=", value, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeLessThan(Long value) {
            addCriterion("scTime <", value, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeLessThanOrEqualTo(Long value) {
            addCriterion("scTime <=", value, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeIn(List<Long> values) {
            addCriterion("scTime in", values, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeNotIn(List<Long> values) {
            addCriterion("scTime not in", values, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeBetween(Long value1, Long value2) {
            addCriterion("scTime between", value1, value2, "sctime");
            return (Criteria) this;
        }

        public Criteria andSctimeNotBetween(Long value1, Long value2) {
            addCriterion("scTime not between", value1, value2, "sctime");
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