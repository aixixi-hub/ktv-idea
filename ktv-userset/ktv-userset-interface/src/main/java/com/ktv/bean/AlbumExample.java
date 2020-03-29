package com.ktv.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlbumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlbumExample() {
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

        public Criteria andAlbunIdIsNull() {
            addCriterion("albun_id is null");
            return (Criteria) this;
        }

        public Criteria andAlbunIdIsNotNull() {
            addCriterion("albun_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlbunIdEqualTo(Long value) {
            addCriterion("albun_id =", value, "albunId");
            return (Criteria) this;
        }

        public Criteria andAlbunIdNotEqualTo(Long value) {
            addCriterion("albun_id <>", value, "albunId");
            return (Criteria) this;
        }

        public Criteria andAlbunIdGreaterThan(Long value) {
            addCriterion("albun_id >", value, "albunId");
            return (Criteria) this;
        }

        public Criteria andAlbunIdGreaterThanOrEqualTo(Long value) {
            addCriterion("albun_id >=", value, "albunId");
            return (Criteria) this;
        }

        public Criteria andAlbunIdLessThan(Long value) {
            addCriterion("albun_id <", value, "albunId");
            return (Criteria) this;
        }

        public Criteria andAlbunIdLessThanOrEqualTo(Long value) {
            addCriterion("albun_id <=", value, "albunId");
            return (Criteria) this;
        }

        public Criteria andAlbunIdIn(List<Long> values) {
            addCriterion("albun_id in", values, "albunId");
            return (Criteria) this;
        }

        public Criteria andAlbunIdNotIn(List<Long> values) {
            addCriterion("albun_id not in", values, "albunId");
            return (Criteria) this;
        }

        public Criteria andAlbunIdBetween(Long value1, Long value2) {
            addCriterion("albun_id between", value1, value2, "albunId");
            return (Criteria) this;
        }

        public Criteria andAlbunIdNotBetween(Long value1, Long value2) {
            addCriterion("albun_id not between", value1, value2, "albunId");
            return (Criteria) this;
        }

        public Criteria andAlbumNameIsNull() {
            addCriterion("album_name is null");
            return (Criteria) this;
        }

        public Criteria andAlbumNameIsNotNull() {
            addCriterion("album_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumNameEqualTo(String value) {
            addCriterion("album_name =", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotEqualTo(String value) {
            addCriterion("album_name <>", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameGreaterThan(String value) {
            addCriterion("album_name >", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameGreaterThanOrEqualTo(String value) {
            addCriterion("album_name >=", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameLessThan(String value) {
            addCriterion("album_name <", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameLessThanOrEqualTo(String value) {
            addCriterion("album_name <=", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameLike(String value) {
            addCriterion("album_name like", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotLike(String value) {
            addCriterion("album_name not like", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameIn(List<String> values) {
            addCriterion("album_name in", values, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotIn(List<String> values) {
            addCriterion("album_name not in", values, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameBetween(String value1, String value2) {
            addCriterion("album_name between", value1, value2, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotBetween(String value1, String value2) {
            addCriterion("album_name not between", value1, value2, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumMajorIsNull() {
            addCriterion("album_major is null");
            return (Criteria) this;
        }

        public Criteria andAlbumMajorIsNotNull() {
            addCriterion("album_major is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumMajorEqualTo(String value) {
            addCriterion("album_major =", value, "albumMajor");
            return (Criteria) this;
        }

        public Criteria andAlbumMajorNotEqualTo(String value) {
            addCriterion("album_major <>", value, "albumMajor");
            return (Criteria) this;
        }

        public Criteria andAlbumMajorGreaterThan(String value) {
            addCriterion("album_major >", value, "albumMajor");
            return (Criteria) this;
        }

        public Criteria andAlbumMajorGreaterThanOrEqualTo(String value) {
            addCriterion("album_major >=", value, "albumMajor");
            return (Criteria) this;
        }

        public Criteria andAlbumMajorLessThan(String value) {
            addCriterion("album_major <", value, "albumMajor");
            return (Criteria) this;
        }

        public Criteria andAlbumMajorLessThanOrEqualTo(String value) {
            addCriterion("album_major <=", value, "albumMajor");
            return (Criteria) this;
        }

        public Criteria andAlbumMajorLike(String value) {
            addCriterion("album_major like", value, "albumMajor");
            return (Criteria) this;
        }

        public Criteria andAlbumMajorNotLike(String value) {
            addCriterion("album_major not like", value, "albumMajor");
            return (Criteria) this;
        }

        public Criteria andAlbumMajorIn(List<String> values) {
            addCriterion("album_major in", values, "albumMajor");
            return (Criteria) this;
        }

        public Criteria andAlbumMajorNotIn(List<String> values) {
            addCriterion("album_major not in", values, "albumMajor");
            return (Criteria) this;
        }

        public Criteria andAlbumMajorBetween(String value1, String value2) {
            addCriterion("album_major between", value1, value2, "albumMajor");
            return (Criteria) this;
        }

        public Criteria andAlbumMajorNotBetween(String value1, String value2) {
            addCriterion("album_major not between", value1, value2, "albumMajor");
            return (Criteria) this;
        }

        public Criteria andAlbumPublishtimeIsNull() {
            addCriterion("album_publishtime is null");
            return (Criteria) this;
        }

        public Criteria andAlbumPublishtimeIsNotNull() {
            addCriterion("album_publishtime is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumPublishtimeEqualTo(Date value) {
            addCriterion("album_publishtime =", value, "albumPublishtime");
            return (Criteria) this;
        }

        public Criteria andAlbumPublishtimeNotEqualTo(Date value) {
            addCriterion("album_publishtime <>", value, "albumPublishtime");
            return (Criteria) this;
        }

        public Criteria andAlbumPublishtimeGreaterThan(Date value) {
            addCriterion("album_publishtime >", value, "albumPublishtime");
            return (Criteria) this;
        }

        public Criteria andAlbumPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("album_publishtime >=", value, "albumPublishtime");
            return (Criteria) this;
        }

        public Criteria andAlbumPublishtimeLessThan(Date value) {
            addCriterion("album_publishtime <", value, "albumPublishtime");
            return (Criteria) this;
        }

        public Criteria andAlbumPublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("album_publishtime <=", value, "albumPublishtime");
            return (Criteria) this;
        }

        public Criteria andAlbumPublishtimeIn(List<Date> values) {
            addCriterion("album_publishtime in", values, "albumPublishtime");
            return (Criteria) this;
        }

        public Criteria andAlbumPublishtimeNotIn(List<Date> values) {
            addCriterion("album_publishtime not in", values, "albumPublishtime");
            return (Criteria) this;
        }

        public Criteria andAlbumPublishtimeBetween(Date value1, Date value2) {
            addCriterion("album_publishtime between", value1, value2, "albumPublishtime");
            return (Criteria) this;
        }

        public Criteria andAlbumPublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("album_publishtime not between", value1, value2, "albumPublishtime");
            return (Criteria) this;
        }

        public Criteria andAlbumUrlIsNull() {
            addCriterion("album_url is null");
            return (Criteria) this;
        }

        public Criteria andAlbumUrlIsNotNull() {
            addCriterion("album_url is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumUrlEqualTo(String value) {
            addCriterion("album_url =", value, "albumUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumUrlNotEqualTo(String value) {
            addCriterion("album_url <>", value, "albumUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumUrlGreaterThan(String value) {
            addCriterion("album_url >", value, "albumUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumUrlGreaterThanOrEqualTo(String value) {
            addCriterion("album_url >=", value, "albumUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumUrlLessThan(String value) {
            addCriterion("album_url <", value, "albumUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumUrlLessThanOrEqualTo(String value) {
            addCriterion("album_url <=", value, "albumUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumUrlLike(String value) {
            addCriterion("album_url like", value, "albumUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumUrlNotLike(String value) {
            addCriterion("album_url not like", value, "albumUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumUrlIn(List<String> values) {
            addCriterion("album_url in", values, "albumUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumUrlNotIn(List<String> values) {
            addCriterion("album_url not in", values, "albumUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumUrlBetween(String value1, String value2) {
            addCriterion("album_url between", value1, value2, "albumUrl");
            return (Criteria) this;
        }

        public Criteria andAlbumUrlNotBetween(String value1, String value2) {
            addCriterion("album_url not between", value1, value2, "albumUrl");
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