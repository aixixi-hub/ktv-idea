package com.ktv.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KehuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KehuExample() {
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

        public Criteria andKehuIdIsNull() {
            addCriterion("kehu_id is null");
            return (Criteria) this;
        }

        public Criteria andKehuIdIsNotNull() {
            addCriterion("kehu_id is not null");
            return (Criteria) this;
        }

        public Criteria andKehuIdEqualTo(Long value) {
            addCriterion("kehu_id =", value, "kehuId");
            return (Criteria) this;
        }

        public Criteria andKehuIdNotEqualTo(Long value) {
            addCriterion("kehu_id <>", value, "kehuId");
            return (Criteria) this;
        }

        public Criteria andKehuIdGreaterThan(Long value) {
            addCriterion("kehu_id >", value, "kehuId");
            return (Criteria) this;
        }

        public Criteria andKehuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("kehu_id >=", value, "kehuId");
            return (Criteria) this;
        }

        public Criteria andKehuIdLessThan(Long value) {
            addCriterion("kehu_id <", value, "kehuId");
            return (Criteria) this;
        }

        public Criteria andKehuIdLessThanOrEqualTo(Long value) {
            addCriterion("kehu_id <=", value, "kehuId");
            return (Criteria) this;
        }

        public Criteria andKehuIdIn(List<Long> values) {
            addCriterion("kehu_id in", values, "kehuId");
            return (Criteria) this;
        }

        public Criteria andKehuIdNotIn(List<Long> values) {
            addCriterion("kehu_id not in", values, "kehuId");
            return (Criteria) this;
        }

        public Criteria andKehuIdBetween(Long value1, Long value2) {
            addCriterion("kehu_id between", value1, value2, "kehuId");
            return (Criteria) this;
        }

        public Criteria andKehuIdNotBetween(Long value1, Long value2) {
            addCriterion("kehu_id not between", value1, value2, "kehuId");
            return (Criteria) this;
        }

        public Criteria andKehuNameIsNull() {
            addCriterion("kehu_name is null");
            return (Criteria) this;
        }

        public Criteria andKehuNameIsNotNull() {
            addCriterion("kehu_name is not null");
            return (Criteria) this;
        }

        public Criteria andKehuNameEqualTo(String value) {
            addCriterion("kehu_name =", value, "kehuName");
            return (Criteria) this;
        }

        public Criteria andKehuNameNotEqualTo(String value) {
            addCriterion("kehu_name <>", value, "kehuName");
            return (Criteria) this;
        }

        public Criteria andKehuNameGreaterThan(String value) {
            addCriterion("kehu_name >", value, "kehuName");
            return (Criteria) this;
        }

        public Criteria andKehuNameGreaterThanOrEqualTo(String value) {
            addCriterion("kehu_name >=", value, "kehuName");
            return (Criteria) this;
        }

        public Criteria andKehuNameLessThan(String value) {
            addCriterion("kehu_name <", value, "kehuName");
            return (Criteria) this;
        }

        public Criteria andKehuNameLessThanOrEqualTo(String value) {
            addCriterion("kehu_name <=", value, "kehuName");
            return (Criteria) this;
        }

        public Criteria andKehuNameLike(String value) {
            addCriterion("kehu_name like", value, "kehuName");
            return (Criteria) this;
        }

        public Criteria andKehuNameNotLike(String value) {
            addCriterion("kehu_name not like", value, "kehuName");
            return (Criteria) this;
        }

        public Criteria andKehuNameIn(List<String> values) {
            addCriterion("kehu_name in", values, "kehuName");
            return (Criteria) this;
        }

        public Criteria andKehuNameNotIn(List<String> values) {
            addCriterion("kehu_name not in", values, "kehuName");
            return (Criteria) this;
        }

        public Criteria andKehuNameBetween(String value1, String value2) {
            addCriterion("kehu_name between", value1, value2, "kehuName");
            return (Criteria) this;
        }

        public Criteria andKehuNameNotBetween(String value1, String value2) {
            addCriterion("kehu_name not between", value1, value2, "kehuName");
            return (Criteria) this;
        }

        public Criteria andKehuLevelIsNull() {
            addCriterion("kehu_level is null");
            return (Criteria) this;
        }

        public Criteria andKehuLevelIsNotNull() {
            addCriterion("kehu_level is not null");
            return (Criteria) this;
        }

        public Criteria andKehuLevelEqualTo(Long value) {
            addCriterion("kehu_level =", value, "kehuLevel");
            return (Criteria) this;
        }

        public Criteria andKehuLevelNotEqualTo(Long value) {
            addCriterion("kehu_level <>", value, "kehuLevel");
            return (Criteria) this;
        }

        public Criteria andKehuLevelGreaterThan(Long value) {
            addCriterion("kehu_level >", value, "kehuLevel");
            return (Criteria) this;
        }

        public Criteria andKehuLevelGreaterThanOrEqualTo(Long value) {
            addCriterion("kehu_level >=", value, "kehuLevel");
            return (Criteria) this;
        }

        public Criteria andKehuLevelLessThan(Long value) {
            addCriterion("kehu_level <", value, "kehuLevel");
            return (Criteria) this;
        }

        public Criteria andKehuLevelLessThanOrEqualTo(Long value) {
            addCriterion("kehu_level <=", value, "kehuLevel");
            return (Criteria) this;
        }

        public Criteria andKehuLevelIn(List<Long> values) {
            addCriterion("kehu_level in", values, "kehuLevel");
            return (Criteria) this;
        }

        public Criteria andKehuLevelNotIn(List<Long> values) {
            addCriterion("kehu_level not in", values, "kehuLevel");
            return (Criteria) this;
        }

        public Criteria andKehuLevelBetween(Long value1, Long value2) {
            addCriterion("kehu_level between", value1, value2, "kehuLevel");
            return (Criteria) this;
        }

        public Criteria andKehuLevelNotBetween(Long value1, Long value2) {
            addCriterion("kehu_level not between", value1, value2, "kehuLevel");
            return (Criteria) this;
        }

        public Criteria andKehuAddressIsNull() {
            addCriterion("kehu_address is null");
            return (Criteria) this;
        }

        public Criteria andKehuAddressIsNotNull() {
            addCriterion("kehu_address is not null");
            return (Criteria) this;
        }

        public Criteria andKehuAddressEqualTo(String value) {
            addCriterion("kehu_address =", value, "kehuAddress");
            return (Criteria) this;
        }

        public Criteria andKehuAddressNotEqualTo(String value) {
            addCriterion("kehu_address <>", value, "kehuAddress");
            return (Criteria) this;
        }

        public Criteria andKehuAddressGreaterThan(String value) {
            addCriterion("kehu_address >", value, "kehuAddress");
            return (Criteria) this;
        }

        public Criteria andKehuAddressGreaterThanOrEqualTo(String value) {
            addCriterion("kehu_address >=", value, "kehuAddress");
            return (Criteria) this;
        }

        public Criteria andKehuAddressLessThan(String value) {
            addCriterion("kehu_address <", value, "kehuAddress");
            return (Criteria) this;
        }

        public Criteria andKehuAddressLessThanOrEqualTo(String value) {
            addCriterion("kehu_address <=", value, "kehuAddress");
            return (Criteria) this;
        }

        public Criteria andKehuAddressLike(String value) {
            addCriterion("kehu_address like", value, "kehuAddress");
            return (Criteria) this;
        }

        public Criteria andKehuAddressNotLike(String value) {
            addCriterion("kehu_address not like", value, "kehuAddress");
            return (Criteria) this;
        }

        public Criteria andKehuAddressIn(List<String> values) {
            addCriterion("kehu_address in", values, "kehuAddress");
            return (Criteria) this;
        }

        public Criteria andKehuAddressNotIn(List<String> values) {
            addCriterion("kehu_address not in", values, "kehuAddress");
            return (Criteria) this;
        }

        public Criteria andKehuAddressBetween(String value1, String value2) {
            addCriterion("kehu_address between", value1, value2, "kehuAddress");
            return (Criteria) this;
        }

        public Criteria andKehuAddressNotBetween(String value1, String value2) {
            addCriterion("kehu_address not between", value1, value2, "kehuAddress");
            return (Criteria) this;
        }

        public Criteria andKehuPhoneIsNull() {
            addCriterion("kehu_phone is null");
            return (Criteria) this;
        }

        public Criteria andKehuPhoneIsNotNull() {
            addCriterion("kehu_phone is not null");
            return (Criteria) this;
        }

        public Criteria andKehuPhoneEqualTo(String value) {
            addCriterion("kehu_phone =", value, "kehuPhone");
            return (Criteria) this;
        }

        public Criteria andKehuPhoneNotEqualTo(String value) {
            addCriterion("kehu_phone <>", value, "kehuPhone");
            return (Criteria) this;
        }

        public Criteria andKehuPhoneGreaterThan(String value) {
            addCriterion("kehu_phone >", value, "kehuPhone");
            return (Criteria) this;
        }

        public Criteria andKehuPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("kehu_phone >=", value, "kehuPhone");
            return (Criteria) this;
        }

        public Criteria andKehuPhoneLessThan(String value) {
            addCriterion("kehu_phone <", value, "kehuPhone");
            return (Criteria) this;
        }

        public Criteria andKehuPhoneLessThanOrEqualTo(String value) {
            addCriterion("kehu_phone <=", value, "kehuPhone");
            return (Criteria) this;
        }

        public Criteria andKehuPhoneLike(String value) {
            addCriterion("kehu_phone like", value, "kehuPhone");
            return (Criteria) this;
        }

        public Criteria andKehuPhoneNotLike(String value) {
            addCriterion("kehu_phone not like", value, "kehuPhone");
            return (Criteria) this;
        }

        public Criteria andKehuPhoneIn(List<String> values) {
            addCriterion("kehu_phone in", values, "kehuPhone");
            return (Criteria) this;
        }

        public Criteria andKehuPhoneNotIn(List<String> values) {
            addCriterion("kehu_phone not in", values, "kehuPhone");
            return (Criteria) this;
        }

        public Criteria andKehuPhoneBetween(String value1, String value2) {
            addCriterion("kehu_phone between", value1, value2, "kehuPhone");
            return (Criteria) this;
        }

        public Criteria andKehuPhoneNotBetween(String value1, String value2) {
            addCriterion("kehu_phone not between", value1, value2, "kehuPhone");
            return (Criteria) this;
        }

        public Criteria andKehuCreattimeIsNull() {
            addCriterion("kehu_creattime is null");
            return (Criteria) this;
        }

        public Criteria andKehuCreattimeIsNotNull() {
            addCriterion("kehu_creattime is not null");
            return (Criteria) this;
        }

        public Criteria andKehuCreattimeEqualTo(Date value) {
            addCriterion("kehu_creattime =", value, "kehuCreattime");
            return (Criteria) this;
        }

        public Criteria andKehuCreattimeNotEqualTo(Date value) {
            addCriterion("kehu_creattime <>", value, "kehuCreattime");
            return (Criteria) this;
        }

        public Criteria andKehuCreattimeGreaterThan(Date value) {
            addCriterion("kehu_creattime >", value, "kehuCreattime");
            return (Criteria) this;
        }

        public Criteria andKehuCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("kehu_creattime >=", value, "kehuCreattime");
            return (Criteria) this;
        }

        public Criteria andKehuCreattimeLessThan(Date value) {
            addCriterion("kehu_creattime <", value, "kehuCreattime");
            return (Criteria) this;
        }

        public Criteria andKehuCreattimeLessThanOrEqualTo(Date value) {
            addCriterion("kehu_creattime <=", value, "kehuCreattime");
            return (Criteria) this;
        }

        public Criteria andKehuCreattimeIn(List<Date> values) {
            addCriterion("kehu_creattime in", values, "kehuCreattime");
            return (Criteria) this;
        }

        public Criteria andKehuCreattimeNotIn(List<Date> values) {
            addCriterion("kehu_creattime not in", values, "kehuCreattime");
            return (Criteria) this;
        }

        public Criteria andKehuCreattimeBetween(Date value1, Date value2) {
            addCriterion("kehu_creattime between", value1, value2, "kehuCreattime");
            return (Criteria) this;
        }

        public Criteria andKehuCreattimeNotBetween(Date value1, Date value2) {
            addCriterion("kehu_creattime not between", value1, value2, "kehuCreattime");
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