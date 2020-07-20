package com.xiaoshu.entity;

import java.util.ArrayList;
import java.util.List;

public class SchoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolExample() {
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

        public Criteria andStuSidIsNull() {
            addCriterion("stu_sid is null");
            return (Criteria) this;
        }

        public Criteria andStuSidIsNotNull() {
            addCriterion("stu_sid is not null");
            return (Criteria) this;
        }

        public Criteria andStuSidEqualTo(Integer value) {
            addCriterion("stu_sid =", value, "stuSid");
            return (Criteria) this;
        }

        public Criteria andStuSidNotEqualTo(Integer value) {
            addCriterion("stu_sid <>", value, "stuSid");
            return (Criteria) this;
        }

        public Criteria andStuSidGreaterThan(Integer value) {
            addCriterion("stu_sid >", value, "stuSid");
            return (Criteria) this;
        }

        public Criteria andStuSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_sid >=", value, "stuSid");
            return (Criteria) this;
        }

        public Criteria andStuSidLessThan(Integer value) {
            addCriterion("stu_sid <", value, "stuSid");
            return (Criteria) this;
        }

        public Criteria andStuSidLessThanOrEqualTo(Integer value) {
            addCriterion("stu_sid <=", value, "stuSid");
            return (Criteria) this;
        }

        public Criteria andStuSidIn(List<Integer> values) {
            addCriterion("stu_sid in", values, "stuSid");
            return (Criteria) this;
        }

        public Criteria andStuSidNotIn(List<Integer> values) {
            addCriterion("stu_sid not in", values, "stuSid");
            return (Criteria) this;
        }

        public Criteria andStuSidBetween(Integer value1, Integer value2) {
            addCriterion("stu_sid between", value1, value2, "stuSid");
            return (Criteria) this;
        }

        public Criteria andStuSidNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_sid not between", value1, value2, "stuSid");
            return (Criteria) this;
        }

        public Criteria andSchSnameIsNull() {
            addCriterion("sch_sname is null");
            return (Criteria) this;
        }

        public Criteria andSchSnameIsNotNull() {
            addCriterion("sch_sname is not null");
            return (Criteria) this;
        }

        public Criteria andSchSnameEqualTo(String value) {
            addCriterion("sch_sname =", value, "schSname");
            return (Criteria) this;
        }

        public Criteria andSchSnameNotEqualTo(String value) {
            addCriterion("sch_sname <>", value, "schSname");
            return (Criteria) this;
        }

        public Criteria andSchSnameGreaterThan(String value) {
            addCriterion("sch_sname >", value, "schSname");
            return (Criteria) this;
        }

        public Criteria andSchSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sch_sname >=", value, "schSname");
            return (Criteria) this;
        }

        public Criteria andSchSnameLessThan(String value) {
            addCriterion("sch_sname <", value, "schSname");
            return (Criteria) this;
        }

        public Criteria andSchSnameLessThanOrEqualTo(String value) {
            addCriterion("sch_sname <=", value, "schSname");
            return (Criteria) this;
        }

        public Criteria andSchSnameLike(String value) {
            addCriterion("sch_sname like", value, "schSname");
            return (Criteria) this;
        }

        public Criteria andSchSnameNotLike(String value) {
            addCriterion("sch_sname not like", value, "schSname");
            return (Criteria) this;
        }

        public Criteria andSchSnameIn(List<String> values) {
            addCriterion("sch_sname in", values, "schSname");
            return (Criteria) this;
        }

        public Criteria andSchSnameNotIn(List<String> values) {
            addCriterion("sch_sname not in", values, "schSname");
            return (Criteria) this;
        }

        public Criteria andSchSnameBetween(String value1, String value2) {
            addCriterion("sch_sname between", value1, value2, "schSname");
            return (Criteria) this;
        }

        public Criteria andSchSnameNotBetween(String value1, String value2) {
            addCriterion("sch_sname not between", value1, value2, "schSname");
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