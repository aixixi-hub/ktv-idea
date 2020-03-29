package com.ktv.bean;

import java.util.ArrayList;
import java.util.List;

public class SingerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SingerExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andSingerIdIsNull() {
            addCriterion("singer_id is null");
            return (Criteria) this;
        }

        public Criteria andSingerIdIsNotNull() {
            addCriterion("singer_id is not null");
            return (Criteria) this;
        }

        public Criteria andSingerIdEqualTo(Long value) {
            addCriterion("singer_id =", value, "singerId");
            return (Criteria) this;
        }

        public Criteria andSingerIdNotEqualTo(Long value) {
            addCriterion("singer_id <>", value, "singerId");
            return (Criteria) this;
        }

        public Criteria andSingerIdGreaterThan(Long value) {
            addCriterion("singer_id >", value, "singerId");
            return (Criteria) this;
        }

        public Criteria andSingerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("singer_id >=", value, "singerId");
            return (Criteria) this;
        }

        public Criteria andSingerIdLessThan(Long value) {
            addCriterion("singer_id <", value, "singerId");
            return (Criteria) this;
        }

        public Criteria andSingerIdLessThanOrEqualTo(Long value) {
            addCriterion("singer_id <=", value, "singerId");
            return (Criteria) this;
        }

        public Criteria andSingerIdIn(List<Long> values) {
            addCriterion("singer_id in", values, "singerId");
            return (Criteria) this;
        }

        public Criteria andSingerIdNotIn(List<Long> values) {
            addCriterion("singer_id not in", values, "singerId");
            return (Criteria) this;
        }

        public Criteria andSingerIdBetween(Long value1, Long value2) {
            addCriterion("singer_id between", value1, value2, "singerId");
            return (Criteria) this;
        }

        public Criteria andSingerIdNotBetween(Long value1, Long value2) {
            addCriterion("singer_id not between", value1, value2, "singerId");
            return (Criteria) this;
        }

        public Criteria andSingerNameIsNull() {
            addCriterion("singer_name is null");
            return (Criteria) this;
        }

        public Criteria andSingerNameIsNotNull() {
            addCriterion("singer_name is not null");
            return (Criteria) this;
        }

        public Criteria andSingerNameEqualTo(String value) {
            addCriterion("singer_name =", value, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameNotEqualTo(String value) {
            addCriterion("singer_name <>", value, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameGreaterThan(String value) {
            addCriterion("singer_name >", value, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameGreaterThanOrEqualTo(String value) {
            addCriterion("singer_name >=", value, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameLessThan(String value) {
            addCriterion("singer_name <", value, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameLessThanOrEqualTo(String value) {
            addCriterion("singer_name <=", value, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameLike(String value) {
            addCriterion("singer_name like", value, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameNotLike(String value) {
            addCriterion("singer_name not like", value, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameIn(List<String> values) {
            addCriterion("singer_name in", values, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameNotIn(List<String> values) {
            addCriterion("singer_name not in", values, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameBetween(String value1, String value2) {
            addCriterion("singer_name between", value1, value2, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameNotBetween(String value1, String value2) {
            addCriterion("singer_name not between", value1, value2, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerGenderIsNull() {
            addCriterion("singer_gender is null");
            return (Criteria) this;
        }

        public Criteria andSingerGenderIsNotNull() {
            addCriterion("singer_gender is not null");
            return (Criteria) this;
        }

        public Criteria andSingerGenderEqualTo(String value) {
            addCriterion("singer_gender =", value, "singerGender");
            return (Criteria) this;
        }

        public Criteria andSingerGenderNotEqualTo(String value) {
            addCriterion("singer_gender <>", value, "singerGender");
            return (Criteria) this;
        }

        public Criteria andSingerGenderGreaterThan(String value) {
            addCriterion("singer_gender >", value, "singerGender");
            return (Criteria) this;
        }

        public Criteria andSingerGenderGreaterThanOrEqualTo(String value) {
            addCriterion("singer_gender >=", value, "singerGender");
            return (Criteria) this;
        }

        public Criteria andSingerGenderLessThan(String value) {
            addCriterion("singer_gender <", value, "singerGender");
            return (Criteria) this;
        }

        public Criteria andSingerGenderLessThanOrEqualTo(String value) {
            addCriterion("singer_gender <=", value, "singerGender");
            return (Criteria) this;
        }

        public Criteria andSingerGenderLike(String value) {
            addCriterion("singer_gender like", value, "singerGender");
            return (Criteria) this;
        }

        public Criteria andSingerGenderNotLike(String value) {
            addCriterion("singer_gender not like", value, "singerGender");
            return (Criteria) this;
        }

        public Criteria andSingerGenderIn(List<String> values) {
            addCriterion("singer_gender in", values, "singerGender");
            return (Criteria) this;
        }

        public Criteria andSingerGenderNotIn(List<String> values) {
            addCriterion("singer_gender not in", values, "singerGender");
            return (Criteria) this;
        }

        public Criteria andSingerGenderBetween(String value1, String value2) {
            addCriterion("singer_gender between", value1, value2, "singerGender");
            return (Criteria) this;
        }

        public Criteria andSingerGenderNotBetween(String value1, String value2) {
            addCriterion("singer_gender not between", value1, value2, "singerGender");
            return (Criteria) this;
        }

        public Criteria andSingerCategoryIsNull() {
            addCriterion("singer_category is null");
            return (Criteria) this;
        }

        public Criteria andSingerCategoryIsNotNull() {
            addCriterion("singer_category is not null");
            return (Criteria) this;
        }

        public Criteria andSingerCategoryEqualTo(String value) {
            addCriterion("singer_category =", value, "singerCategory");
            return (Criteria) this;
        }

        public Criteria andSingerCategoryNotEqualTo(String value) {
            addCriterion("singer_category <>", value, "singerCategory");
            return (Criteria) this;
        }

        public Criteria andSingerCategoryGreaterThan(String value) {
            addCriterion("singer_category >", value, "singerCategory");
            return (Criteria) this;
        }

        public Criteria andSingerCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("singer_category >=", value, "singerCategory");
            return (Criteria) this;
        }

        public Criteria andSingerCategoryLessThan(String value) {
            addCriterion("singer_category <", value, "singerCategory");
            return (Criteria) this;
        }

        public Criteria andSingerCategoryLessThanOrEqualTo(String value) {
            addCriterion("singer_category <=", value, "singerCategory");
            return (Criteria) this;
        }

        public Criteria andSingerCategoryLike(String value) {
            addCriterion("singer_category like", value, "singerCategory");
            return (Criteria) this;
        }

        public Criteria andSingerCategoryNotLike(String value) {
            addCriterion("singer_category not like", value, "singerCategory");
            return (Criteria) this;
        }

        public Criteria andSingerCategoryIn(List<String> values) {
            addCriterion("singer_category in", values, "singerCategory");
            return (Criteria) this;
        }

        public Criteria andSingerCategoryNotIn(List<String> values) {
            addCriterion("singer_category not in", values, "singerCategory");
            return (Criteria) this;
        }

        public Criteria andSingerCategoryBetween(String value1, String value2) {
            addCriterion("singer_category between", value1, value2, "singerCategory");
            return (Criteria) this;
        }

        public Criteria andSingerCategoryNotBetween(String value1, String value2) {
            addCriterion("singer_category not between", value1, value2, "singerCategory");
            return (Criteria) this;
        }

        public Criteria andSingerUrlIsNull() {
            addCriterion("singer_url is null");
            return (Criteria) this;
        }

        public Criteria andSingerUrlIsNotNull() {
            addCriterion("singer_url is not null");
            return (Criteria) this;
        }

        public Criteria andSingerUrlEqualTo(String value) {
            addCriterion("singer_url =", value, "singerUrl");
            return (Criteria) this;
        }

        public Criteria andSingerUrlNotEqualTo(String value) {
            addCriterion("singer_url <>", value, "singerUrl");
            return (Criteria) this;
        }

        public Criteria andSingerUrlGreaterThan(String value) {
            addCriterion("singer_url >", value, "singerUrl");
            return (Criteria) this;
        }

        public Criteria andSingerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("singer_url >=", value, "singerUrl");
            return (Criteria) this;
        }

        public Criteria andSingerUrlLessThan(String value) {
            addCriterion("singer_url <", value, "singerUrl");
            return (Criteria) this;
        }

        public Criteria andSingerUrlLessThanOrEqualTo(String value) {
            addCriterion("singer_url <=", value, "singerUrl");
            return (Criteria) this;
        }

        public Criteria andSingerUrlLike(String value) {
            addCriterion("singer_url like", value, "singerUrl");
            return (Criteria) this;
        }

        public Criteria andSingerUrlNotLike(String value) {
            addCriterion("singer_url not like", value, "singerUrl");
            return (Criteria) this;
        }

        public Criteria andSingerUrlIn(List<String> values) {
            addCriterion("singer_url in", values, "singerUrl");
            return (Criteria) this;
        }

        public Criteria andSingerUrlNotIn(List<String> values) {
            addCriterion("singer_url not in", values, "singerUrl");
            return (Criteria) this;
        }

        public Criteria andSingerUrlBetween(String value1, String value2) {
            addCriterion("singer_url between", value1, value2, "singerUrl");
            return (Criteria) this;
        }

        public Criteria andSingerUrlNotBetween(String value1, String value2) {
            addCriterion("singer_url not between", value1, value2, "singerUrl");
            return (Criteria) this;
        }
    }

    /**
     */
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