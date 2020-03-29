package com.ktv.bean;

import java.util.ArrayList;
import java.util.List;

public class LinkmanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LinkmanExample() {
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

        public Criteria andLkmIdIsNull() {
            addCriterion("lkm_id is null");
            return (Criteria) this;
        }

        public Criteria andLkmIdIsNotNull() {
            addCriterion("lkm_id is not null");
            return (Criteria) this;
        }

        public Criteria andLkmIdEqualTo(Long value) {
            addCriterion("lkm_id =", value, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdNotEqualTo(Long value) {
            addCriterion("lkm_id <>", value, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdGreaterThan(Long value) {
            addCriterion("lkm_id >", value, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lkm_id >=", value, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdLessThan(Long value) {
            addCriterion("lkm_id <", value, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdLessThanOrEqualTo(Long value) {
            addCriterion("lkm_id <=", value, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdIn(List<Long> values) {
            addCriterion("lkm_id in", values, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdNotIn(List<Long> values) {
            addCriterion("lkm_id not in", values, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdBetween(Long value1, Long value2) {
            addCriterion("lkm_id between", value1, value2, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdNotBetween(Long value1, Long value2) {
            addCriterion("lkm_id not between", value1, value2, "lkmId");
            return (Criteria) this;
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

        public Criteria andSongerIdIsNull() {
            addCriterion("songer_id is null");
            return (Criteria) this;
        }

        public Criteria andSongerIdIsNotNull() {
            addCriterion("songer_id is not null");
            return (Criteria) this;
        }

        public Criteria andSongerIdEqualTo(Long value) {
            addCriterion("songer_id =", value, "songerId");
            return (Criteria) this;
        }

        public Criteria andSongerIdNotEqualTo(Long value) {
            addCriterion("songer_id <>", value, "songerId");
            return (Criteria) this;
        }

        public Criteria andSongerIdGreaterThan(Long value) {
            addCriterion("songer_id >", value, "songerId");
            return (Criteria) this;
        }

        public Criteria andSongerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("songer_id >=", value, "songerId");
            return (Criteria) this;
        }

        public Criteria andSongerIdLessThan(Long value) {
            addCriterion("songer_id <", value, "songerId");
            return (Criteria) this;
        }

        public Criteria andSongerIdLessThanOrEqualTo(Long value) {
            addCriterion("songer_id <=", value, "songerId");
            return (Criteria) this;
        }

        public Criteria andSongerIdIn(List<Long> values) {
            addCriterion("songer_id in", values, "songerId");
            return (Criteria) this;
        }

        public Criteria andSongerIdNotIn(List<Long> values) {
            addCriterion("songer_id not in", values, "songerId");
            return (Criteria) this;
        }

        public Criteria andSongerIdBetween(Long value1, Long value2) {
            addCriterion("songer_id between", value1, value2, "songerId");
            return (Criteria) this;
        }

        public Criteria andSongerIdNotBetween(Long value1, Long value2) {
            addCriterion("songer_id not between", value1, value2, "songerId");
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