package com.wjp.pojo;

import java.util.ArrayList;
import java.util.List;

public class GFacilityHasGrogshopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GFacilityHasGrogshopExample() {
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

        public Criteria andGFacilityIdIsNull() {
            addCriterion("g_facility_id is null");
            return (Criteria) this;
        }

        public Criteria andGFacilityIdIsNotNull() {
            addCriterion("g_facility_id is not null");
            return (Criteria) this;
        }

        public Criteria andGFacilityIdEqualTo(Integer value) {
            addCriterion("g_facility_id =", value, "gFacilityId");
            return (Criteria) this;
        }

        public Criteria andGFacilityIdNotEqualTo(Integer value) {
            addCriterion("g_facility_id <>", value, "gFacilityId");
            return (Criteria) this;
        }

        public Criteria andGFacilityIdGreaterThan(Integer value) {
            addCriterion("g_facility_id >", value, "gFacilityId");
            return (Criteria) this;
        }

        public Criteria andGFacilityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_facility_id >=", value, "gFacilityId");
            return (Criteria) this;
        }

        public Criteria andGFacilityIdLessThan(Integer value) {
            addCriterion("g_facility_id <", value, "gFacilityId");
            return (Criteria) this;
        }

        public Criteria andGFacilityIdLessThanOrEqualTo(Integer value) {
            addCriterion("g_facility_id <=", value, "gFacilityId");
            return (Criteria) this;
        }

        public Criteria andGFacilityIdIn(List<Integer> values) {
            addCriterion("g_facility_id in", values, "gFacilityId");
            return (Criteria) this;
        }

        public Criteria andGFacilityIdNotIn(List<Integer> values) {
            addCriterion("g_facility_id not in", values, "gFacilityId");
            return (Criteria) this;
        }

        public Criteria andGFacilityIdBetween(Integer value1, Integer value2) {
            addCriterion("g_facility_id between", value1, value2, "gFacilityId");
            return (Criteria) this;
        }

        public Criteria andGFacilityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("g_facility_id not between", value1, value2, "gFacilityId");
            return (Criteria) this;
        }

        public Criteria andGrogshopIdIsNull() {
            addCriterion("grogshop_id is null");
            return (Criteria) this;
        }

        public Criteria andGrogshopIdIsNotNull() {
            addCriterion("grogshop_id is not null");
            return (Criteria) this;
        }

        public Criteria andGrogshopIdEqualTo(Integer value) {
            addCriterion("grogshop_id =", value, "grogshopId");
            return (Criteria) this;
        }

        public Criteria andGrogshopIdNotEqualTo(Integer value) {
            addCriterion("grogshop_id <>", value, "grogshopId");
            return (Criteria) this;
        }

        public Criteria andGrogshopIdGreaterThan(Integer value) {
            addCriterion("grogshop_id >", value, "grogshopId");
            return (Criteria) this;
        }

        public Criteria andGrogshopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grogshop_id >=", value, "grogshopId");
            return (Criteria) this;
        }

        public Criteria andGrogshopIdLessThan(Integer value) {
            addCriterion("grogshop_id <", value, "grogshopId");
            return (Criteria) this;
        }

        public Criteria andGrogshopIdLessThanOrEqualTo(Integer value) {
            addCriterion("grogshop_id <=", value, "grogshopId");
            return (Criteria) this;
        }

        public Criteria andGrogshopIdIn(List<Integer> values) {
            addCriterion("grogshop_id in", values, "grogshopId");
            return (Criteria) this;
        }

        public Criteria andGrogshopIdNotIn(List<Integer> values) {
            addCriterion("grogshop_id not in", values, "grogshopId");
            return (Criteria) this;
        }

        public Criteria andGrogshopIdBetween(Integer value1, Integer value2) {
            addCriterion("grogshop_id between", value1, value2, "grogshopId");
            return (Criteria) this;
        }

        public Criteria andGrogshopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grogshop_id not between", value1, value2, "grogshopId");
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