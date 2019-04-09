package com.juzi.wage.model.entity;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andJobNumberIsNull() {
            addCriterion("job_number is null");
            return (Criteria) this;
        }

        public Criteria andJobNumberIsNotNull() {
            addCriterion("job_number is not null");
            return (Criteria) this;
        }

        public Criteria andJobNumberEqualTo(String value) {
            addCriterion("job_number =", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotEqualTo(String value) {
            addCriterion("job_number <>", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberGreaterThan(String value) {
            addCriterion("job_number >", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberGreaterThanOrEqualTo(String value) {
            addCriterion("job_number >=", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLessThan(String value) {
            addCriterion("job_number <", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLessThanOrEqualTo(String value) {
            addCriterion("job_number <=", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLike(String value) {
            addCriterion("job_number like", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotLike(String value) {
            addCriterion("job_number not like", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberIn(List<String> values) {
            addCriterion("job_number in", values, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotIn(List<String> values) {
            addCriterion("job_number not in", values, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberBetween(String value1, String value2) {
            addCriterion("job_number between", value1, value2, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotBetween(String value1, String value2) {
            addCriterion("job_number not between", value1, value2, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
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

        public Criteria andJobPropertyIsNull() {
            addCriterion("job_property is null");
            return (Criteria) this;
        }

        public Criteria andJobPropertyIsNotNull() {
            addCriterion("job_property is not null");
            return (Criteria) this;
        }

        public Criteria andJobPropertyEqualTo(String value) {
            addCriterion("job_property =", value, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyNotEqualTo(String value) {
            addCriterion("job_property <>", value, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyGreaterThan(String value) {
            addCriterion("job_property >", value, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("job_property >=", value, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyLessThan(String value) {
            addCriterion("job_property <", value, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyLessThanOrEqualTo(String value) {
            addCriterion("job_property <=", value, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyLike(String value) {
            addCriterion("job_property like", value, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyNotLike(String value) {
            addCriterion("job_property not like", value, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyIn(List<String> values) {
            addCriterion("job_property in", values, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyNotIn(List<String> values) {
            addCriterion("job_property not in", values, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyBetween(String value1, String value2) {
            addCriterion("job_property between", value1, value2, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobPropertyNotBetween(String value1, String value2) {
            addCriterion("job_property not between", value1, value2, "jobProperty");
            return (Criteria) this;
        }

        public Criteria andJobLevelIsNull() {
            addCriterion("job_level is null");
            return (Criteria) this;
        }

        public Criteria andJobLevelIsNotNull() {
            addCriterion("job_level is not null");
            return (Criteria) this;
        }

        public Criteria andJobLevelEqualTo(String value) {
            addCriterion("job_level =", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelNotEqualTo(String value) {
            addCriterion("job_level <>", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelGreaterThan(String value) {
            addCriterion("job_level >", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelGreaterThanOrEqualTo(String value) {
            addCriterion("job_level >=", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelLessThan(String value) {
            addCriterion("job_level <", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelLessThanOrEqualTo(String value) {
            addCriterion("job_level <=", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelLike(String value) {
            addCriterion("job_level like", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelNotLike(String value) {
            addCriterion("job_level not like", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelIn(List<String> values) {
            addCriterion("job_level in", values, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelNotIn(List<String> values) {
            addCriterion("job_level not in", values, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelBetween(String value1, String value2) {
            addCriterion("job_level between", value1, value2, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelNotBetween(String value1, String value2) {
            addCriterion("job_level not between", value1, value2, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andWorkMonthIsNull() {
            addCriterion("work_month is null");
            return (Criteria) this;
        }

        public Criteria andWorkMonthIsNotNull() {
            addCriterion("work_month is not null");
            return (Criteria) this;
        }

        public Criteria andWorkMonthEqualTo(String value) {
            addCriterion("work_month =", value, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthNotEqualTo(String value) {
            addCriterion("work_month <>", value, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthGreaterThan(String value) {
            addCriterion("work_month >", value, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthGreaterThanOrEqualTo(String value) {
            addCriterion("work_month >=", value, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthLessThan(String value) {
            addCriterion("work_month <", value, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthLessThanOrEqualTo(String value) {
            addCriterion("work_month <=", value, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthLike(String value) {
            addCriterion("work_month like", value, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthNotLike(String value) {
            addCriterion("work_month not like", value, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthIn(List<String> values) {
            addCriterion("work_month in", values, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthNotIn(List<String> values) {
            addCriterion("work_month not in", values, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthBetween(String value1, String value2) {
            addCriterion("work_month between", value1, value2, "workMonth");
            return (Criteria) this;
        }

        public Criteria andWorkMonthNotBetween(String value1, String value2) {
            addCriterion("work_month not between", value1, value2, "workMonth");
            return (Criteria) this;
        }

        public Criteria andJobCoefficientIsNull() {
            addCriterion("job_coefficient is null");
            return (Criteria) this;
        }

        public Criteria andJobCoefficientIsNotNull() {
            addCriterion("job_coefficient is not null");
            return (Criteria) this;
        }

        public Criteria andJobCoefficientEqualTo(String value) {
            addCriterion("job_coefficient =", value, "jobCoefficient");
            return (Criteria) this;
        }

        public Criteria andJobCoefficientNotEqualTo(String value) {
            addCriterion("job_coefficient <>", value, "jobCoefficient");
            return (Criteria) this;
        }

        public Criteria andJobCoefficientGreaterThan(String value) {
            addCriterion("job_coefficient >", value, "jobCoefficient");
            return (Criteria) this;
        }

        public Criteria andJobCoefficientGreaterThanOrEqualTo(String value) {
            addCriterion("job_coefficient >=", value, "jobCoefficient");
            return (Criteria) this;
        }

        public Criteria andJobCoefficientLessThan(String value) {
            addCriterion("job_coefficient <", value, "jobCoefficient");
            return (Criteria) this;
        }

        public Criteria andJobCoefficientLessThanOrEqualTo(String value) {
            addCriterion("job_coefficient <=", value, "jobCoefficient");
            return (Criteria) this;
        }

        public Criteria andJobCoefficientLike(String value) {
            addCriterion("job_coefficient like", value, "jobCoefficient");
            return (Criteria) this;
        }

        public Criteria andJobCoefficientNotLike(String value) {
            addCriterion("job_coefficient not like", value, "jobCoefficient");
            return (Criteria) this;
        }

        public Criteria andJobCoefficientIn(List<String> values) {
            addCriterion("job_coefficient in", values, "jobCoefficient");
            return (Criteria) this;
        }

        public Criteria andJobCoefficientNotIn(List<String> values) {
            addCriterion("job_coefficient not in", values, "jobCoefficient");
            return (Criteria) this;
        }

        public Criteria andJobCoefficientBetween(String value1, String value2) {
            addCriterion("job_coefficient between", value1, value2, "jobCoefficient");
            return (Criteria) this;
        }

        public Criteria andJobCoefficientNotBetween(String value1, String value2) {
            addCriterion("job_coefficient not between", value1, value2, "jobCoefficient");
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