package com.wjp.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GRoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GRoomExample() {
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

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(BigDecimal value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(BigDecimal value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(BigDecimal value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(BigDecimal value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<BigDecimal> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<BigDecimal> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andSceneIsNull() {
            addCriterion("scene is null");
            return (Criteria) this;
        }

        public Criteria andSceneIsNotNull() {
            addCriterion("scene is not null");
            return (Criteria) this;
        }

        public Criteria andSceneEqualTo(String value) {
            addCriterion("scene =", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotEqualTo(String value) {
            addCriterion("scene <>", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThan(String value) {
            addCriterion("scene >", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThanOrEqualTo(String value) {
            addCriterion("scene >=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThan(String value) {
            addCriterion("scene <", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThanOrEqualTo(String value) {
            addCriterion("scene <=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLike(String value) {
            addCriterion("scene like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotLike(String value) {
            addCriterion("scene not like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneIn(List<String> values) {
            addCriterion("scene in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotIn(List<String> values) {
            addCriterion("scene not in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneBetween(String value1, String value2) {
            addCriterion("scene between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotBetween(String value1, String value2) {
            addCriterion("scene not between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andBedIsNull() {
            addCriterion("bed is null");
            return (Criteria) this;
        }

        public Criteria andBedIsNotNull() {
            addCriterion("bed is not null");
            return (Criteria) this;
        }

        public Criteria andBedEqualTo(String value) {
            addCriterion("bed =", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedNotEqualTo(String value) {
            addCriterion("bed <>", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedGreaterThan(String value) {
            addCriterion("bed >", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedGreaterThanOrEqualTo(String value) {
            addCriterion("bed >=", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedLessThan(String value) {
            addCriterion("bed <", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedLessThanOrEqualTo(String value) {
            addCriterion("bed <=", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedLike(String value) {
            addCriterion("bed like", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedNotLike(String value) {
            addCriterion("bed not like", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedIn(List<String> values) {
            addCriterion("bed in", values, "bed");
            return (Criteria) this;
        }

        public Criteria andBedNotIn(List<String> values) {
            addCriterion("bed not in", values, "bed");
            return (Criteria) this;
        }

        public Criteria andBedBetween(String value1, String value2) {
            addCriterion("bed between", value1, value2, "bed");
            return (Criteria) this;
        }

        public Criteria andBedNotBetween(String value1, String value2) {
            addCriterion("bed not between", value1, value2, "bed");
            return (Criteria) this;
        }

        public Criteria andNumLimitIsNull() {
            addCriterion("num_limit is null");
            return (Criteria) this;
        }

        public Criteria andNumLimitIsNotNull() {
            addCriterion("num_limit is not null");
            return (Criteria) this;
        }

        public Criteria andNumLimitEqualTo(Integer value) {
            addCriterion("num_limit =", value, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitNotEqualTo(Integer value) {
            addCriterion("num_limit <>", value, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitGreaterThan(Integer value) {
            addCriterion("num_limit >", value, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_limit >=", value, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitLessThan(Integer value) {
            addCriterion("num_limit <", value, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitLessThanOrEqualTo(Integer value) {
            addCriterion("num_limit <=", value, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitIn(List<Integer> values) {
            addCriterion("num_limit in", values, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitNotIn(List<Integer> values) {
            addCriterion("num_limit not in", values, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitBetween(Integer value1, Integer value2) {
            addCriterion("num_limit between", value1, value2, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("num_limit not between", value1, value2, "numLimit");
            return (Criteria) this;
        }

        public Criteria andInitNumberIsNull() {
            addCriterion("init_number is null");
            return (Criteria) this;
        }

        public Criteria andInitNumberIsNotNull() {
            addCriterion("init_number is not null");
            return (Criteria) this;
        }

        public Criteria andInitNumberEqualTo(Integer value) {
            addCriterion("init_number =", value, "initNumber");
            return (Criteria) this;
        }

        public Criteria andInitNumberNotEqualTo(Integer value) {
            addCriterion("init_number <>", value, "initNumber");
            return (Criteria) this;
        }

        public Criteria andInitNumberGreaterThan(Integer value) {
            addCriterion("init_number >", value, "initNumber");
            return (Criteria) this;
        }

        public Criteria andInitNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("init_number >=", value, "initNumber");
            return (Criteria) this;
        }

        public Criteria andInitNumberLessThan(Integer value) {
            addCriterion("init_number <", value, "initNumber");
            return (Criteria) this;
        }

        public Criteria andInitNumberLessThanOrEqualTo(Integer value) {
            addCriterion("init_number <=", value, "initNumber");
            return (Criteria) this;
        }

        public Criteria andInitNumberIn(List<Integer> values) {
            addCriterion("init_number in", values, "initNumber");
            return (Criteria) this;
        }

        public Criteria andInitNumberNotIn(List<Integer> values) {
            addCriterion("init_number not in", values, "initNumber");
            return (Criteria) this;
        }

        public Criteria andInitNumberBetween(Integer value1, Integer value2) {
            addCriterion("init_number between", value1, value2, "initNumber");
            return (Criteria) this;
        }

        public Criteria andInitNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("init_number not between", value1, value2, "initNumber");
            return (Criteria) this;
        }

        public Criteria andRemainNumberIsNull() {
            addCriterion("remain_number is null");
            return (Criteria) this;
        }

        public Criteria andRemainNumberIsNotNull() {
            addCriterion("remain_number is not null");
            return (Criteria) this;
        }

        public Criteria andRemainNumberEqualTo(Integer value) {
            addCriterion("remain_number =", value, "remainNumber");
            return (Criteria) this;
        }

        public Criteria andRemainNumberNotEqualTo(Integer value) {
            addCriterion("remain_number <>", value, "remainNumber");
            return (Criteria) this;
        }

        public Criteria andRemainNumberGreaterThan(Integer value) {
            addCriterion("remain_number >", value, "remainNumber");
            return (Criteria) this;
        }

        public Criteria andRemainNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("remain_number >=", value, "remainNumber");
            return (Criteria) this;
        }

        public Criteria andRemainNumberLessThan(Integer value) {
            addCriterion("remain_number <", value, "remainNumber");
            return (Criteria) this;
        }

        public Criteria andRemainNumberLessThanOrEqualTo(Integer value) {
            addCriterion("remain_number <=", value, "remainNumber");
            return (Criteria) this;
        }

        public Criteria andRemainNumberIn(List<Integer> values) {
            addCriterion("remain_number in", values, "remainNumber");
            return (Criteria) this;
        }

        public Criteria andRemainNumberNotIn(List<Integer> values) {
            addCriterion("remain_number not in", values, "remainNumber");
            return (Criteria) this;
        }

        public Criteria andRemainNumberBetween(Integer value1, Integer value2) {
            addCriterion("remain_number between", value1, value2, "remainNumber");
            return (Criteria) this;
        }

        public Criteria andRemainNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("remain_number not between", value1, value2, "remainNumber");
            return (Criteria) this;
        }

        public Criteria andGRoomStarIdIsNull() {
            addCriterion("g_room_star_id is null");
            return (Criteria) this;
        }

        public Criteria andGRoomStarIdIsNotNull() {
            addCriterion("g_room_star_id is not null");
            return (Criteria) this;
        }

        public Criteria andGRoomStarIdEqualTo(Integer value) {
            addCriterion("g_room_star_id =", value, "gRoomStarId");
            return (Criteria) this;
        }

        public Criteria andGRoomStarIdNotEqualTo(Integer value) {
            addCriterion("g_room_star_id <>", value, "gRoomStarId");
            return (Criteria) this;
        }

        public Criteria andGRoomStarIdGreaterThan(Integer value) {
            addCriterion("g_room_star_id >", value, "gRoomStarId");
            return (Criteria) this;
        }

        public Criteria andGRoomStarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_room_star_id >=", value, "gRoomStarId");
            return (Criteria) this;
        }

        public Criteria andGRoomStarIdLessThan(Integer value) {
            addCriterion("g_room_star_id <", value, "gRoomStarId");
            return (Criteria) this;
        }

        public Criteria andGRoomStarIdLessThanOrEqualTo(Integer value) {
            addCriterion("g_room_star_id <=", value, "gRoomStarId");
            return (Criteria) this;
        }

        public Criteria andGRoomStarIdIn(List<Integer> values) {
            addCriterion("g_room_star_id in", values, "gRoomStarId");
            return (Criteria) this;
        }

        public Criteria andGRoomStarIdNotIn(List<Integer> values) {
            addCriterion("g_room_star_id not in", values, "gRoomStarId");
            return (Criteria) this;
        }

        public Criteria andGRoomStarIdBetween(Integer value1, Integer value2) {
            addCriterion("g_room_star_id between", value1, value2, "gRoomStarId");
            return (Criteria) this;
        }

        public Criteria andGRoomStarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("g_room_star_id not between", value1, value2, "gRoomStarId");
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