package com.research.pisatest.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAnswerDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAnswerDOExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andIthAnswerIsNull() {
            addCriterion("ith_answer is null");
            return (Criteria) this;
        }

        public Criteria andIthAnswerIsNotNull() {
            addCriterion("ith_answer is not null");
            return (Criteria) this;
        }

        public Criteria andIthAnswerEqualTo(Integer value) {
            addCriterion("ith_answer =", value, "ithAnswer");
            return (Criteria) this;
        }

        public Criteria andIthAnswerNotEqualTo(Integer value) {
            addCriterion("ith_answer <>", value, "ithAnswer");
            return (Criteria) this;
        }

        public Criteria andIthAnswerGreaterThan(Integer value) {
            addCriterion("ith_answer >", value, "ithAnswer");
            return (Criteria) this;
        }

        public Criteria andIthAnswerGreaterThanOrEqualTo(Integer value) {
            addCriterion("ith_answer >=", value, "ithAnswer");
            return (Criteria) this;
        }

        public Criteria andIthAnswerLessThan(Integer value) {
            addCriterion("ith_answer <", value, "ithAnswer");
            return (Criteria) this;
        }

        public Criteria andIthAnswerLessThanOrEqualTo(Integer value) {
            addCriterion("ith_answer <=", value, "ithAnswer");
            return (Criteria) this;
        }

        public Criteria andIthAnswerIn(List<Integer> values) {
            addCriterion("ith_answer in", values, "ithAnswer");
            return (Criteria) this;
        }

        public Criteria andIthAnswerNotIn(List<Integer> values) {
            addCriterion("ith_answer not in", values, "ithAnswer");
            return (Criteria) this;
        }

        public Criteria andIthAnswerBetween(Integer value1, Integer value2) {
            addCriterion("ith_answer between", value1, value2, "ithAnswer");
            return (Criteria) this;
        }

        public Criteria andIthAnswerNotBetween(Integer value1, Integer value2) {
            addCriterion("ith_answer not between", value1, value2, "ithAnswer");
            return (Criteria) this;
        }

        public Criteria andTestBeginIsNull() {
            addCriterion("test_begin is null");
            return (Criteria) this;
        }

        public Criteria andTestBeginIsNotNull() {
            addCriterion("test_begin is not null");
            return (Criteria) this;
        }

        public Criteria andTestBeginEqualTo(Date value) {
            addCriterion("test_begin =", value, "testBegin");
            return (Criteria) this;
        }

        public Criteria andTestBeginNotEqualTo(Date value) {
            addCriterion("test_begin <>", value, "testBegin");
            return (Criteria) this;
        }

        public Criteria andTestBeginGreaterThan(Date value) {
            addCriterion("test_begin >", value, "testBegin");
            return (Criteria) this;
        }

        public Criteria andTestBeginGreaterThanOrEqualTo(Date value) {
            addCriterion("test_begin >=", value, "testBegin");
            return (Criteria) this;
        }

        public Criteria andTestBeginLessThan(Date value) {
            addCriterion("test_begin <", value, "testBegin");
            return (Criteria) this;
        }

        public Criteria andTestBeginLessThanOrEqualTo(Date value) {
            addCriterion("test_begin <=", value, "testBegin");
            return (Criteria) this;
        }

        public Criteria andTestBeginIn(List<Date> values) {
            addCriterion("test_begin in", values, "testBegin");
            return (Criteria) this;
        }

        public Criteria andTestBeginNotIn(List<Date> values) {
            addCriterion("test_begin not in", values, "testBegin");
            return (Criteria) this;
        }

        public Criteria andTestBeginBetween(Date value1, Date value2) {
            addCriterion("test_begin between", value1, value2, "testBegin");
            return (Criteria) this;
        }

        public Criteria andTestBeginNotBetween(Date value1, Date value2) {
            addCriterion("test_begin not between", value1, value2, "testBegin");
            return (Criteria) this;
        }

        public Criteria andTestEndIsNull() {
            addCriterion("test_end is null");
            return (Criteria) this;
        }

        public Criteria andTestEndIsNotNull() {
            addCriterion("test_end is not null");
            return (Criteria) this;
        }

        public Criteria andTestEndEqualTo(Date value) {
            addCriterion("test_end =", value, "testEnd");
            return (Criteria) this;
        }

        public Criteria andTestEndNotEqualTo(Date value) {
            addCriterion("test_end <>", value, "testEnd");
            return (Criteria) this;
        }

        public Criteria andTestEndGreaterThan(Date value) {
            addCriterion("test_end >", value, "testEnd");
            return (Criteria) this;
        }

        public Criteria andTestEndGreaterThanOrEqualTo(Date value) {
            addCriterion("test_end >=", value, "testEnd");
            return (Criteria) this;
        }

        public Criteria andTestEndLessThan(Date value) {
            addCriterion("test_end <", value, "testEnd");
            return (Criteria) this;
        }

        public Criteria andTestEndLessThanOrEqualTo(Date value) {
            addCriterion("test_end <=", value, "testEnd");
            return (Criteria) this;
        }

        public Criteria andTestEndIn(List<Date> values) {
            addCriterion("test_end in", values, "testEnd");
            return (Criteria) this;
        }

        public Criteria andTestEndNotIn(List<Date> values) {
            addCriterion("test_end not in", values, "testEnd");
            return (Criteria) this;
        }

        public Criteria andTestEndBetween(Date value1, Date value2) {
            addCriterion("test_end between", value1, value2, "testEnd");
            return (Criteria) this;
        }

        public Criteria andTestEndNotBetween(Date value1, Date value2) {
            addCriterion("test_end not between", value1, value2, "testEnd");
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