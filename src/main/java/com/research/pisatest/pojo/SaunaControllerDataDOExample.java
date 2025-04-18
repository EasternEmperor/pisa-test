package com.research.pisatest.pojo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SaunaControllerDataDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaunaControllerDataDOExample() {
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

        public Criteria andHtmlNameIsNull() {
            addCriterion("html_name is null");
            return (Criteria) this;
        }

        public Criteria andHtmlNameIsNotNull() {
            addCriterion("html_name is not null");
            return (Criteria) this;
        }

        public Criteria andHtmlNameEqualTo(String value) {
            addCriterion("html_name =", value, "htmlName");
            return (Criteria) this;
        }

        public Criteria andHtmlNameNotEqualTo(String value) {
            addCriterion("html_name <>", value, "htmlName");
            return (Criteria) this;
        }

        public Criteria andHtmlNameGreaterThan(String value) {
            addCriterion("html_name >", value, "htmlName");
            return (Criteria) this;
        }

        public Criteria andHtmlNameGreaterThanOrEqualTo(String value) {
            addCriterion("html_name >=", value, "htmlName");
            return (Criteria) this;
        }

        public Criteria andHtmlNameLessThan(String value) {
            addCriterion("html_name <", value, "htmlName");
            return (Criteria) this;
        }

        public Criteria andHtmlNameLessThanOrEqualTo(String value) {
            addCriterion("html_name <=", value, "htmlName");
            return (Criteria) this;
        }

        public Criteria andHtmlNameLike(String value) {
            addCriterion("html_name like", value, "htmlName");
            return (Criteria) this;
        }

        public Criteria andHtmlNameNotLike(String value) {
            addCriterion("html_name not like", value, "htmlName");
            return (Criteria) this;
        }

        public Criteria andHtmlNameIn(List<String> values) {
            addCriterion("html_name in", values, "htmlName");
            return (Criteria) this;
        }

        public Criteria andHtmlNameNotIn(List<String> values) {
            addCriterion("html_name not in", values, "htmlName");
            return (Criteria) this;
        }

        public Criteria andHtmlNameBetween(String value1, String value2) {
            addCriterion("html_name between", value1, value2, "htmlName");
            return (Criteria) this;
        }

        public Criteria andHtmlNameNotBetween(String value1, String value2) {
            addCriterion("html_name not between", value1, value2, "htmlName");
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

        public Criteria andEventIsNull() {
            addCriterion("event is null");
            return (Criteria) this;
        }

        public Criteria andEventIsNotNull() {
            addCriterion("event is not null");
            return (Criteria) this;
        }

        public Criteria andEventEqualTo(String value) {
            addCriterion("event =", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotEqualTo(String value) {
            addCriterion("event <>", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThan(String value) {
            addCriterion("event >", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThanOrEqualTo(String value) {
            addCriterion("event >=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThan(String value) {
            addCriterion("event <", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThanOrEqualTo(String value) {
            addCriterion("event <=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLike(String value) {
            addCriterion("event like", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotLike(String value) {
            addCriterion("event not like", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventIn(List<String> values) {
            addCriterion("event in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotIn(List<String> values) {
            addCriterion("event not in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventBetween(String value1, String value2) {
            addCriterion("event between", value1, value2, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotBetween(String value1, String value2) {
            addCriterion("event not between", value1, value2, "event");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNull() {
            addCriterion("event_type is null");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNotNull() {
            addCriterion("event_type is not null");
            return (Criteria) this;
        }

        public Criteria andEventTypeEqualTo(String value) {
            addCriterion("event_type =", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotEqualTo(String value) {
            addCriterion("event_type <>", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThan(String value) {
            addCriterion("event_type >", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThanOrEqualTo(String value) {
            addCriterion("event_type >=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThan(String value) {
            addCriterion("event_type <", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThanOrEqualTo(String value) {
            addCriterion("event_type <=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLike(String value) {
            addCriterion("event_type like", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotLike(String value) {
            addCriterion("event_type not like", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeIn(List<String> values) {
            addCriterion("event_type in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotIn(List<String> values) {
            addCriterion("event_type not in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeBetween(String value1, String value2) {
            addCriterion("event_type between", value1, value2, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotBetween(String value1, String value2) {
            addCriterion("event_type not between", value1, value2, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeIsNull() {
            addCriterion("event_start_time is null");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeIsNotNull() {
            addCriterion("event_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeEqualTo(LocalDateTime value) {
            addCriterion("event_start_time =", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeNotEqualTo(LocalDateTime value) {
            addCriterion("event_start_time <>", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeGreaterThan(LocalDateTime value) {
            addCriterion("event_start_time >", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("event_start_time >=", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeLessThan(LocalDateTime value) {
            addCriterion("event_start_time <", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("event_start_time <=", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeIn(List<LocalDateTime> values) {
            addCriterion("event_start_time in", values, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeNotIn(List<LocalDateTime> values) {
            addCriterion("event_start_time not in", values, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("event_start_time between", value1, value2, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("event_start_time not between", value1, value2, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventNumberIsNull() {
            addCriterion("event_number is null");
            return (Criteria) this;
        }

        public Criteria andEventNumberIsNotNull() {
            addCriterion("event_number is not null");
            return (Criteria) this;
        }

        public Criteria andEventNumberEqualTo(Integer value) {
            addCriterion("event_number =", value, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberNotEqualTo(Integer value) {
            addCriterion("event_number <>", value, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberGreaterThan(Integer value) {
            addCriterion("event_number >", value, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("event_number >=", value, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberLessThan(Integer value) {
            addCriterion("event_number <", value, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberLessThanOrEqualTo(Integer value) {
            addCriterion("event_number <=", value, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberIn(List<Integer> values) {
            addCriterion("event_number in", values, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberNotIn(List<Integer> values) {
            addCriterion("event_number not in", values, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberBetween(Integer value1, Integer value2) {
            addCriterion("event_number between", value1, value2, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("event_number not between", value1, value2, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andTopSettingIsNull() {
            addCriterion("top_setting is null");
            return (Criteria) this;
        }

        public Criteria andTopSettingIsNotNull() {
            addCriterion("top_setting is not null");
            return (Criteria) this;
        }

        public Criteria andTopSettingEqualTo(String value) {
            addCriterion("top_setting =", value, "topSetting");
            return (Criteria) this;
        }

        public Criteria andTopSettingNotEqualTo(String value) {
            addCriterion("top_setting <>", value, "topSetting");
            return (Criteria) this;
        }

        public Criteria andTopSettingGreaterThan(String value) {
            addCriterion("top_setting >", value, "topSetting");
            return (Criteria) this;
        }

        public Criteria andTopSettingGreaterThanOrEqualTo(String value) {
            addCriterion("top_setting >=", value, "topSetting");
            return (Criteria) this;
        }

        public Criteria andTopSettingLessThan(String value) {
            addCriterion("top_setting <", value, "topSetting");
            return (Criteria) this;
        }

        public Criteria andTopSettingLessThanOrEqualTo(String value) {
            addCriterion("top_setting <=", value, "topSetting");
            return (Criteria) this;
        }

        public Criteria andTopSettingLike(String value) {
            addCriterion("top_setting like", value, "topSetting");
            return (Criteria) this;
        }

        public Criteria andTopSettingNotLike(String value) {
            addCriterion("top_setting not like", value, "topSetting");
            return (Criteria) this;
        }

        public Criteria andTopSettingIn(List<String> values) {
            addCriterion("top_setting in", values, "topSetting");
            return (Criteria) this;
        }

        public Criteria andTopSettingNotIn(List<String> values) {
            addCriterion("top_setting not in", values, "topSetting");
            return (Criteria) this;
        }

        public Criteria andTopSettingBetween(String value1, String value2) {
            addCriterion("top_setting between", value1, value2, "topSetting");
            return (Criteria) this;
        }

        public Criteria andTopSettingNotBetween(String value1, String value2) {
            addCriterion("top_setting not between", value1, value2, "topSetting");
            return (Criteria) this;
        }

        public Criteria andCentralSettingIsNull() {
            addCriterion("central_setting is null");
            return (Criteria) this;
        }

        public Criteria andCentralSettingIsNotNull() {
            addCriterion("central_setting is not null");
            return (Criteria) this;
        }

        public Criteria andCentralSettingEqualTo(String value) {
            addCriterion("central_setting =", value, "centralSetting");
            return (Criteria) this;
        }

        public Criteria andCentralSettingNotEqualTo(String value) {
            addCriterion("central_setting <>", value, "centralSetting");
            return (Criteria) this;
        }

        public Criteria andCentralSettingGreaterThan(String value) {
            addCriterion("central_setting >", value, "centralSetting");
            return (Criteria) this;
        }

        public Criteria andCentralSettingGreaterThanOrEqualTo(String value) {
            addCriterion("central_setting >=", value, "centralSetting");
            return (Criteria) this;
        }

        public Criteria andCentralSettingLessThan(String value) {
            addCriterion("central_setting <", value, "centralSetting");
            return (Criteria) this;
        }

        public Criteria andCentralSettingLessThanOrEqualTo(String value) {
            addCriterion("central_setting <=", value, "centralSetting");
            return (Criteria) this;
        }

        public Criteria andCentralSettingLike(String value) {
            addCriterion("central_setting like", value, "centralSetting");
            return (Criteria) this;
        }

        public Criteria andCentralSettingNotLike(String value) {
            addCriterion("central_setting not like", value, "centralSetting");
            return (Criteria) this;
        }

        public Criteria andCentralSettingIn(List<String> values) {
            addCriterion("central_setting in", values, "centralSetting");
            return (Criteria) this;
        }

        public Criteria andCentralSettingNotIn(List<String> values) {
            addCriterion("central_setting not in", values, "centralSetting");
            return (Criteria) this;
        }

        public Criteria andCentralSettingBetween(String value1, String value2) {
            addCriterion("central_setting between", value1, value2, "centralSetting");
            return (Criteria) this;
        }

        public Criteria andCentralSettingNotBetween(String value1, String value2) {
            addCriterion("central_setting not between", value1, value2, "centralSetting");
            return (Criteria) this;
        }

        public Criteria andBottomSettingIsNull() {
            addCriterion("bottom_setting is null");
            return (Criteria) this;
        }

        public Criteria andBottomSettingIsNotNull() {
            addCriterion("bottom_setting is not null");
            return (Criteria) this;
        }

        public Criteria andBottomSettingEqualTo(String value) {
            addCriterion("bottom_setting =", value, "bottomSetting");
            return (Criteria) this;
        }

        public Criteria andBottomSettingNotEqualTo(String value) {
            addCriterion("bottom_setting <>", value, "bottomSetting");
            return (Criteria) this;
        }

        public Criteria andBottomSettingGreaterThan(String value) {
            addCriterion("bottom_setting >", value, "bottomSetting");
            return (Criteria) this;
        }

        public Criteria andBottomSettingGreaterThanOrEqualTo(String value) {
            addCriterion("bottom_setting >=", value, "bottomSetting");
            return (Criteria) this;
        }

        public Criteria andBottomSettingLessThan(String value) {
            addCriterion("bottom_setting <", value, "bottomSetting");
            return (Criteria) this;
        }

        public Criteria andBottomSettingLessThanOrEqualTo(String value) {
            addCriterion("bottom_setting <=", value, "bottomSetting");
            return (Criteria) this;
        }

        public Criteria andBottomSettingLike(String value) {
            addCriterion("bottom_setting like", value, "bottomSetting");
            return (Criteria) this;
        }

        public Criteria andBottomSettingNotLike(String value) {
            addCriterion("bottom_setting not like", value, "bottomSetting");
            return (Criteria) this;
        }

        public Criteria andBottomSettingIn(List<String> values) {
            addCriterion("bottom_setting in", values, "bottomSetting");
            return (Criteria) this;
        }

        public Criteria andBottomSettingNotIn(List<String> values) {
            addCriterion("bottom_setting not in", values, "bottomSetting");
            return (Criteria) this;
        }

        public Criteria andBottomSettingBetween(String value1, String value2) {
            addCriterion("bottom_setting between", value1, value2, "bottomSetting");
            return (Criteria) this;
        }

        public Criteria andBottomSettingNotBetween(String value1, String value2) {
            addCriterion("bottom_setting not between", value1, value2, "bottomSetting");
            return (Criteria) this;
        }

        public Criteria andTempValueIsNull() {
            addCriterion("temp_value is null");
            return (Criteria) this;
        }

        public Criteria andTempValueIsNotNull() {
            addCriterion("temp_value is not null");
            return (Criteria) this;
        }

        public Criteria andTempValueEqualTo(String value) {
            addCriterion("temp_value =", value, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueNotEqualTo(String value) {
            addCriterion("temp_value <>", value, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueGreaterThan(String value) {
            addCriterion("temp_value >", value, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueGreaterThanOrEqualTo(String value) {
            addCriterion("temp_value >=", value, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueLessThan(String value) {
            addCriterion("temp_value <", value, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueLessThanOrEqualTo(String value) {
            addCriterion("temp_value <=", value, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueLike(String value) {
            addCriterion("temp_value like", value, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueNotLike(String value) {
            addCriterion("temp_value not like", value, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueIn(List<String> values) {
            addCriterion("temp_value in", values, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueNotIn(List<String> values) {
            addCriterion("temp_value not in", values, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueBetween(String value1, String value2) {
            addCriterion("temp_value between", value1, value2, "tempValue");
            return (Criteria) this;
        }

        public Criteria andTempValueNotBetween(String value1, String value2) {
            addCriterion("temp_value not between", value1, value2, "tempValue");
            return (Criteria) this;
        }

        public Criteria andHumidValueIsNull() {
            addCriterion("humid_value is null");
            return (Criteria) this;
        }

        public Criteria andHumidValueIsNotNull() {
            addCriterion("humid_value is not null");
            return (Criteria) this;
        }

        public Criteria andHumidValueEqualTo(String value) {
            addCriterion("humid_value =", value, "humidValue");
            return (Criteria) this;
        }

        public Criteria andHumidValueNotEqualTo(String value) {
            addCriterion("humid_value <>", value, "humidValue");
            return (Criteria) this;
        }

        public Criteria andHumidValueGreaterThan(String value) {
            addCriterion("humid_value >", value, "humidValue");
            return (Criteria) this;
        }

        public Criteria andHumidValueGreaterThanOrEqualTo(String value) {
            addCriterion("humid_value >=", value, "humidValue");
            return (Criteria) this;
        }

        public Criteria andHumidValueLessThan(String value) {
            addCriterion("humid_value <", value, "humidValue");
            return (Criteria) this;
        }

        public Criteria andHumidValueLessThanOrEqualTo(String value) {
            addCriterion("humid_value <=", value, "humidValue");
            return (Criteria) this;
        }

        public Criteria andHumidValueLike(String value) {
            addCriterion("humid_value like", value, "humidValue");
            return (Criteria) this;
        }

        public Criteria andHumidValueNotLike(String value) {
            addCriterion("humid_value not like", value, "humidValue");
            return (Criteria) this;
        }

        public Criteria andHumidValueIn(List<String> values) {
            addCriterion("humid_value in", values, "humidValue");
            return (Criteria) this;
        }

        public Criteria andHumidValueNotIn(List<String> values) {
            addCriterion("humid_value not in", values, "humidValue");
            return (Criteria) this;
        }

        public Criteria andHumidValueBetween(String value1, String value2) {
            addCriterion("humid_value between", value1, value2, "humidValue");
            return (Criteria) this;
        }

        public Criteria andHumidValueNotBetween(String value1, String value2) {
            addCriterion("humid_value not between", value1, value2, "humidValue");
            return (Criteria) this;
        }

        public Criteria andTimeValueIsNull() {
            addCriterion("time_value is null");
            return (Criteria) this;
        }

        public Criteria andTimeValueIsNotNull() {
            addCriterion("time_value is not null");
            return (Criteria) this;
        }

        public Criteria andTimeValueEqualTo(String value) {
            addCriterion("time_value =", value, "timeValue");
            return (Criteria) this;
        }

        public Criteria andTimeValueNotEqualTo(String value) {
            addCriterion("time_value <>", value, "timeValue");
            return (Criteria) this;
        }

        public Criteria andTimeValueGreaterThan(String value) {
            addCriterion("time_value >", value, "timeValue");
            return (Criteria) this;
        }

        public Criteria andTimeValueGreaterThanOrEqualTo(String value) {
            addCriterion("time_value >=", value, "timeValue");
            return (Criteria) this;
        }

        public Criteria andTimeValueLessThan(String value) {
            addCriterion("time_value <", value, "timeValue");
            return (Criteria) this;
        }

        public Criteria andTimeValueLessThanOrEqualTo(String value) {
            addCriterion("time_value <=", value, "timeValue");
            return (Criteria) this;
        }

        public Criteria andTimeValueLike(String value) {
            addCriterion("time_value like", value, "timeValue");
            return (Criteria) this;
        }

        public Criteria andTimeValueNotLike(String value) {
            addCriterion("time_value not like", value, "timeValue");
            return (Criteria) this;
        }

        public Criteria andTimeValueIn(List<String> values) {
            addCriterion("time_value in", values, "timeValue");
            return (Criteria) this;
        }

        public Criteria andTimeValueNotIn(List<String> values) {
            addCriterion("time_value not in", values, "timeValue");
            return (Criteria) this;
        }

        public Criteria andTimeValueBetween(String value1, String value2) {
            addCriterion("time_value between", value1, value2, "timeValue");
            return (Criteria) this;
        }

        public Criteria andTimeValueNotBetween(String value1, String value2) {
            addCriterion("time_value not between", value1, value2, "timeValue");
            return (Criteria) this;
        }

        public Criteria andDiagramStateIsNull() {
            addCriterion("diagram_state is null");
            return (Criteria) this;
        }

        public Criteria andDiagramStateIsNotNull() {
            addCriterion("diagram_state is not null");
            return (Criteria) this;
        }

        public Criteria andDiagramStateEqualTo(String value) {
            addCriterion("diagram_state =", value, "diagramState");
            return (Criteria) this;
        }

        public Criteria andDiagramStateNotEqualTo(String value) {
            addCriterion("diagram_state <>", value, "diagramState");
            return (Criteria) this;
        }

        public Criteria andDiagramStateGreaterThan(String value) {
            addCriterion("diagram_state >", value, "diagramState");
            return (Criteria) this;
        }

        public Criteria andDiagramStateGreaterThanOrEqualTo(String value) {
            addCriterion("diagram_state >=", value, "diagramState");
            return (Criteria) this;
        }

        public Criteria andDiagramStateLessThan(String value) {
            addCriterion("diagram_state <", value, "diagramState");
            return (Criteria) this;
        }

        public Criteria andDiagramStateLessThanOrEqualTo(String value) {
            addCriterion("diagram_state <=", value, "diagramState");
            return (Criteria) this;
        }

        public Criteria andDiagramStateLike(String value) {
            addCriterion("diagram_state like", value, "diagramState");
            return (Criteria) this;
        }

        public Criteria andDiagramStateNotLike(String value) {
            addCriterion("diagram_state not like", value, "diagramState");
            return (Criteria) this;
        }

        public Criteria andDiagramStateIn(List<String> values) {
            addCriterion("diagram_state in", values, "diagramState");
            return (Criteria) this;
        }

        public Criteria andDiagramStateNotIn(List<String> values) {
            addCriterion("diagram_state not in", values, "diagramState");
            return (Criteria) this;
        }

        public Criteria andDiagramStateBetween(String value1, String value2) {
            addCriterion("diagram_state between", value1, value2, "diagramState");
            return (Criteria) this;
        }

        public Criteria andDiagramStateNotBetween(String value1, String value2) {
            addCriterion("diagram_state not between", value1, value2, "diagramState");
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