package com.juzi.wage.model.entity;

import java.util.ArrayList;
import java.util.List;

public class WageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WageExample() {
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

        public Criteria andZzjxjsIsNull() {
            addCriterion("zzjxjs is null");
            return (Criteria) this;
        }

        public Criteria andZzjxjsIsNotNull() {
            addCriterion("zzjxjs is not null");
            return (Criteria) this;
        }

        public Criteria andZzjxjsEqualTo(String value) {
            addCriterion("zzjxjs =", value, "zzjxjs");
            return (Criteria) this;
        }

        public Criteria andZzjxjsNotEqualTo(String value) {
            addCriterion("zzjxjs <>", value, "zzjxjs");
            return (Criteria) this;
        }

        public Criteria andZzjxjsGreaterThan(String value) {
            addCriterion("zzjxjs >", value, "zzjxjs");
            return (Criteria) this;
        }

        public Criteria andZzjxjsGreaterThanOrEqualTo(String value) {
            addCriterion("zzjxjs >=", value, "zzjxjs");
            return (Criteria) this;
        }

        public Criteria andZzjxjsLessThan(String value) {
            addCriterion("zzjxjs <", value, "zzjxjs");
            return (Criteria) this;
        }

        public Criteria andZzjxjsLessThanOrEqualTo(String value) {
            addCriterion("zzjxjs <=", value, "zzjxjs");
            return (Criteria) this;
        }

        public Criteria andZzjxjsLike(String value) {
            addCriterion("zzjxjs like", value, "zzjxjs");
            return (Criteria) this;
        }

        public Criteria andZzjxjsNotLike(String value) {
            addCriterion("zzjxjs not like", value, "zzjxjs");
            return (Criteria) this;
        }

        public Criteria andZzjxjsIn(List<String> values) {
            addCriterion("zzjxjs in", values, "zzjxjs");
            return (Criteria) this;
        }

        public Criteria andZzjxjsNotIn(List<String> values) {
            addCriterion("zzjxjs not in", values, "zzjxjs");
            return (Criteria) this;
        }

        public Criteria andZzjxjsBetween(String value1, String value2) {
            addCriterion("zzjxjs between", value1, value2, "zzjxjs");
            return (Criteria) this;
        }

        public Criteria andZzjxjsNotBetween(String value1, String value2) {
            addCriterion("zzjxjs not between", value1, value2, "zzjxjs");
            return (Criteria) this;
        }

        public Criteria andZzjxIsNull() {
            addCriterion("zzjx is null");
            return (Criteria) this;
        }

        public Criteria andZzjxIsNotNull() {
            addCriterion("zzjx is not null");
            return (Criteria) this;
        }

        public Criteria andZzjxEqualTo(String value) {
            addCriterion("zzjx =", value, "zzjx");
            return (Criteria) this;
        }

        public Criteria andZzjxNotEqualTo(String value) {
            addCriterion("zzjx <>", value, "zzjx");
            return (Criteria) this;
        }

        public Criteria andZzjxGreaterThan(String value) {
            addCriterion("zzjx >", value, "zzjx");
            return (Criteria) this;
        }

        public Criteria andZzjxGreaterThanOrEqualTo(String value) {
            addCriterion("zzjx >=", value, "zzjx");
            return (Criteria) this;
        }

        public Criteria andZzjxLessThan(String value) {
            addCriterion("zzjx <", value, "zzjx");
            return (Criteria) this;
        }

        public Criteria andZzjxLessThanOrEqualTo(String value) {
            addCriterion("zzjx <=", value, "zzjx");
            return (Criteria) this;
        }

        public Criteria andZzjxLike(String value) {
            addCriterion("zzjx like", value, "zzjx");
            return (Criteria) this;
        }

        public Criteria andZzjxNotLike(String value) {
            addCriterion("zzjx not like", value, "zzjx");
            return (Criteria) this;
        }

        public Criteria andZzjxIn(List<String> values) {
            addCriterion("zzjx in", values, "zzjx");
            return (Criteria) this;
        }

        public Criteria andZzjxNotIn(List<String> values) {
            addCriterion("zzjx not in", values, "zzjx");
            return (Criteria) this;
        }

        public Criteria andZzjxBetween(String value1, String value2) {
            addCriterion("zzjx between", value1, value2, "zzjx");
            return (Criteria) this;
        }

        public Criteria andZzjxNotBetween(String value1, String value2) {
            addCriterion("zzjx not between", value1, value2, "zzjx");
            return (Criteria) this;
        }

        public Criteria andBkjxgzlIsNull() {
            addCriterion("bkjxgzl is null");
            return (Criteria) this;
        }

        public Criteria andBkjxgzlIsNotNull() {
            addCriterion("bkjxgzl is not null");
            return (Criteria) this;
        }

        public Criteria andBkjxgzlEqualTo(String value) {
            addCriterion("bkjxgzl =", value, "bkjxgzl");
            return (Criteria) this;
        }

        public Criteria andBkjxgzlNotEqualTo(String value) {
            addCriterion("bkjxgzl <>", value, "bkjxgzl");
            return (Criteria) this;
        }

        public Criteria andBkjxgzlGreaterThan(String value) {
            addCriterion("bkjxgzl >", value, "bkjxgzl");
            return (Criteria) this;
        }

        public Criteria andBkjxgzlGreaterThanOrEqualTo(String value) {
            addCriterion("bkjxgzl >=", value, "bkjxgzl");
            return (Criteria) this;
        }

        public Criteria andBkjxgzlLessThan(String value) {
            addCriterion("bkjxgzl <", value, "bkjxgzl");
            return (Criteria) this;
        }

        public Criteria andBkjxgzlLessThanOrEqualTo(String value) {
            addCriterion("bkjxgzl <=", value, "bkjxgzl");
            return (Criteria) this;
        }

        public Criteria andBkjxgzlLike(String value) {
            addCriterion("bkjxgzl like", value, "bkjxgzl");
            return (Criteria) this;
        }

        public Criteria andBkjxgzlNotLike(String value) {
            addCriterion("bkjxgzl not like", value, "bkjxgzl");
            return (Criteria) this;
        }

        public Criteria andBkjxgzlIn(List<String> values) {
            addCriterion("bkjxgzl in", values, "bkjxgzl");
            return (Criteria) this;
        }

        public Criteria andBkjxgzlNotIn(List<String> values) {
            addCriterion("bkjxgzl not in", values, "bkjxgzl");
            return (Criteria) this;
        }

        public Criteria andBkjxgzlBetween(String value1, String value2) {
            addCriterion("bkjxgzl between", value1, value2, "bkjxgzl");
            return (Criteria) this;
        }

        public Criteria andBkjxgzlNotBetween(String value1, String value2) {
            addCriterion("bkjxgzl not between", value1, value2, "bkjxgzl");
            return (Criteria) this;
        }

        public Criteria andYjsjxgzlIsNull() {
            addCriterion("yjsjxgzl is null");
            return (Criteria) this;
        }

        public Criteria andYjsjxgzlIsNotNull() {
            addCriterion("yjsjxgzl is not null");
            return (Criteria) this;
        }

        public Criteria andYjsjxgzlEqualTo(String value) {
            addCriterion("yjsjxgzl =", value, "yjsjxgzl");
            return (Criteria) this;
        }

        public Criteria andYjsjxgzlNotEqualTo(String value) {
            addCriterion("yjsjxgzl <>", value, "yjsjxgzl");
            return (Criteria) this;
        }

        public Criteria andYjsjxgzlGreaterThan(String value) {
            addCriterion("yjsjxgzl >", value, "yjsjxgzl");
            return (Criteria) this;
        }

        public Criteria andYjsjxgzlGreaterThanOrEqualTo(String value) {
            addCriterion("yjsjxgzl >=", value, "yjsjxgzl");
            return (Criteria) this;
        }

        public Criteria andYjsjxgzlLessThan(String value) {
            addCriterion("yjsjxgzl <", value, "yjsjxgzl");
            return (Criteria) this;
        }

        public Criteria andYjsjxgzlLessThanOrEqualTo(String value) {
            addCriterion("yjsjxgzl <=", value, "yjsjxgzl");
            return (Criteria) this;
        }

        public Criteria andYjsjxgzlLike(String value) {
            addCriterion("yjsjxgzl like", value, "yjsjxgzl");
            return (Criteria) this;
        }

        public Criteria andYjsjxgzlNotLike(String value) {
            addCriterion("yjsjxgzl not like", value, "yjsjxgzl");
            return (Criteria) this;
        }

        public Criteria andYjsjxgzlIn(List<String> values) {
            addCriterion("yjsjxgzl in", values, "yjsjxgzl");
            return (Criteria) this;
        }

        public Criteria andYjsjxgzlNotIn(List<String> values) {
            addCriterion("yjsjxgzl not in", values, "yjsjxgzl");
            return (Criteria) this;
        }

        public Criteria andYjsjxgzlBetween(String value1, String value2) {
            addCriterion("yjsjxgzl between", value1, value2, "yjsjxgzl");
            return (Criteria) this;
        }

        public Criteria andYjsjxgzlNotBetween(String value1, String value2) {
            addCriterion("yjsjxgzl not between", value1, value2, "yjsjxgzl");
            return (Criteria) this;
        }

        public Criteria andZjrsIsNull() {
            addCriterion("zjrs is null");
            return (Criteria) this;
        }

        public Criteria andZjrsIsNotNull() {
            addCriterion("zjrs is not null");
            return (Criteria) this;
        }

        public Criteria andZjrsEqualTo(String value) {
            addCriterion("zjrs =", value, "zjrs");
            return (Criteria) this;
        }

        public Criteria andZjrsNotEqualTo(String value) {
            addCriterion("zjrs <>", value, "zjrs");
            return (Criteria) this;
        }

        public Criteria andZjrsGreaterThan(String value) {
            addCriterion("zjrs >", value, "zjrs");
            return (Criteria) this;
        }

        public Criteria andZjrsGreaterThanOrEqualTo(String value) {
            addCriterion("zjrs >=", value, "zjrs");
            return (Criteria) this;
        }

        public Criteria andZjrsLessThan(String value) {
            addCriterion("zjrs <", value, "zjrs");
            return (Criteria) this;
        }

        public Criteria andZjrsLessThanOrEqualTo(String value) {
            addCriterion("zjrs <=", value, "zjrs");
            return (Criteria) this;
        }

        public Criteria andZjrsLike(String value) {
            addCriterion("zjrs like", value, "zjrs");
            return (Criteria) this;
        }

        public Criteria andZjrsNotLike(String value) {
            addCriterion("zjrs not like", value, "zjrs");
            return (Criteria) this;
        }

        public Criteria andZjrsIn(List<String> values) {
            addCriterion("zjrs in", values, "zjrs");
            return (Criteria) this;
        }

        public Criteria andZjrsNotIn(List<String> values) {
            addCriterion("zjrs not in", values, "zjrs");
            return (Criteria) this;
        }

        public Criteria andZjrsBetween(String value1, String value2) {
            addCriterion("zjrs between", value1, value2, "zjrs");
            return (Criteria) this;
        }

        public Criteria andZjrsNotBetween(String value1, String value2) {
            addCriterion("zjrs not between", value1, value2, "zjrs");
            return (Criteria) this;
        }

        public Criteria andJbwcjrIsNull() {
            addCriterion("jbwcjr is null");
            return (Criteria) this;
        }

        public Criteria andJbwcjrIsNotNull() {
            addCriterion("jbwcjr is not null");
            return (Criteria) this;
        }

        public Criteria andJbwcjrEqualTo(String value) {
            addCriterion("jbwcjr =", value, "jbwcjr");
            return (Criteria) this;
        }

        public Criteria andJbwcjrNotEqualTo(String value) {
            addCriterion("jbwcjr <>", value, "jbwcjr");
            return (Criteria) this;
        }

        public Criteria andJbwcjrGreaterThan(String value) {
            addCriterion("jbwcjr >", value, "jbwcjr");
            return (Criteria) this;
        }

        public Criteria andJbwcjrGreaterThanOrEqualTo(String value) {
            addCriterion("jbwcjr >=", value, "jbwcjr");
            return (Criteria) this;
        }

        public Criteria andJbwcjrLessThan(String value) {
            addCriterion("jbwcjr <", value, "jbwcjr");
            return (Criteria) this;
        }

        public Criteria andJbwcjrLessThanOrEqualTo(String value) {
            addCriterion("jbwcjr <=", value, "jbwcjr");
            return (Criteria) this;
        }

        public Criteria andJbwcjrLike(String value) {
            addCriterion("jbwcjr like", value, "jbwcjr");
            return (Criteria) this;
        }

        public Criteria andJbwcjrNotLike(String value) {
            addCriterion("jbwcjr not like", value, "jbwcjr");
            return (Criteria) this;
        }

        public Criteria andJbwcjrIn(List<String> values) {
            addCriterion("jbwcjr in", values, "jbwcjr");
            return (Criteria) this;
        }

        public Criteria andJbwcjrNotIn(List<String> values) {
            addCriterion("jbwcjr not in", values, "jbwcjr");
            return (Criteria) this;
        }

        public Criteria andJbwcjrBetween(String value1, String value2) {
            addCriterion("jbwcjr between", value1, value2, "jbwcjr");
            return (Criteria) this;
        }

        public Criteria andJbwcjrNotBetween(String value1, String value2) {
            addCriterion("jbwcjr not between", value1, value2, "jbwcjr");
            return (Criteria) this;
        }

        public Criteria andSjffjrIsNull() {
            addCriterion("sjffjr is null");
            return (Criteria) this;
        }

        public Criteria andSjffjrIsNotNull() {
            addCriterion("sjffjr is not null");
            return (Criteria) this;
        }

        public Criteria andSjffjrEqualTo(String value) {
            addCriterion("sjffjr =", value, "sjffjr");
            return (Criteria) this;
        }

        public Criteria andSjffjrNotEqualTo(String value) {
            addCriterion("sjffjr <>", value, "sjffjr");
            return (Criteria) this;
        }

        public Criteria andSjffjrGreaterThan(String value) {
            addCriterion("sjffjr >", value, "sjffjr");
            return (Criteria) this;
        }

        public Criteria andSjffjrGreaterThanOrEqualTo(String value) {
            addCriterion("sjffjr >=", value, "sjffjr");
            return (Criteria) this;
        }

        public Criteria andSjffjrLessThan(String value) {
            addCriterion("sjffjr <", value, "sjffjr");
            return (Criteria) this;
        }

        public Criteria andSjffjrLessThanOrEqualTo(String value) {
            addCriterion("sjffjr <=", value, "sjffjr");
            return (Criteria) this;
        }

        public Criteria andSjffjrLike(String value) {
            addCriterion("sjffjr like", value, "sjffjr");
            return (Criteria) this;
        }

        public Criteria andSjffjrNotLike(String value) {
            addCriterion("sjffjr not like", value, "sjffjr");
            return (Criteria) this;
        }

        public Criteria andSjffjrIn(List<String> values) {
            addCriterion("sjffjr in", values, "sjffjr");
            return (Criteria) this;
        }

        public Criteria andSjffjrNotIn(List<String> values) {
            addCriterion("sjffjr not in", values, "sjffjr");
            return (Criteria) this;
        }

        public Criteria andSjffjrBetween(String value1, String value2) {
            addCriterion("sjffjr between", value1, value2, "sjffjr");
            return (Criteria) this;
        }

        public Criteria andSjffjrNotBetween(String value1, String value2) {
            addCriterion("sjffjr not between", value1, value2, "sjffjr");
            return (Criteria) this;
        }

        public Criteria andDjXIsNull() {
            addCriterion("dj_x is null");
            return (Criteria) this;
        }

        public Criteria andDjXIsNotNull() {
            addCriterion("dj_x is not null");
            return (Criteria) this;
        }

        public Criteria andDjXEqualTo(String value) {
            addCriterion("dj_x =", value, "djX");
            return (Criteria) this;
        }

        public Criteria andDjXNotEqualTo(String value) {
            addCriterion("dj_x <>", value, "djX");
            return (Criteria) this;
        }

        public Criteria andDjXGreaterThan(String value) {
            addCriterion("dj_x >", value, "djX");
            return (Criteria) this;
        }

        public Criteria andDjXGreaterThanOrEqualTo(String value) {
            addCriterion("dj_x >=", value, "djX");
            return (Criteria) this;
        }

        public Criteria andDjXLessThan(String value) {
            addCriterion("dj_x <", value, "djX");
            return (Criteria) this;
        }

        public Criteria andDjXLessThanOrEqualTo(String value) {
            addCriterion("dj_x <=", value, "djX");
            return (Criteria) this;
        }

        public Criteria andDjXLike(String value) {
            addCriterion("dj_x like", value, "djX");
            return (Criteria) this;
        }

        public Criteria andDjXNotLike(String value) {
            addCriterion("dj_x not like", value, "djX");
            return (Criteria) this;
        }

        public Criteria andDjXIn(List<String> values) {
            addCriterion("dj_x in", values, "djX");
            return (Criteria) this;
        }

        public Criteria andDjXNotIn(List<String> values) {
            addCriterion("dj_x not in", values, "djX");
            return (Criteria) this;
        }

        public Criteria andDjXBetween(String value1, String value2) {
            addCriterion("dj_x between", value1, value2, "djX");
            return (Criteria) this;
        }

        public Criteria andDjXNotBetween(String value1, String value2) {
            addCriterion("dj_x not between", value1, value2, "djX");
            return (Criteria) this;
        }

        public Criteria andJxjrjtIsNull() {
            addCriterion("jxjrjt is null");
            return (Criteria) this;
        }

        public Criteria andJxjrjtIsNotNull() {
            addCriterion("jxjrjt is not null");
            return (Criteria) this;
        }

        public Criteria andJxjrjtEqualTo(String value) {
            addCriterion("jxjrjt =", value, "jxjrjt");
            return (Criteria) this;
        }

        public Criteria andJxjrjtNotEqualTo(String value) {
            addCriterion("jxjrjt <>", value, "jxjrjt");
            return (Criteria) this;
        }

        public Criteria andJxjrjtGreaterThan(String value) {
            addCriterion("jxjrjt >", value, "jxjrjt");
            return (Criteria) this;
        }

        public Criteria andJxjrjtGreaterThanOrEqualTo(String value) {
            addCriterion("jxjrjt >=", value, "jxjrjt");
            return (Criteria) this;
        }

        public Criteria andJxjrjtLessThan(String value) {
            addCriterion("jxjrjt <", value, "jxjrjt");
            return (Criteria) this;
        }

        public Criteria andJxjrjtLessThanOrEqualTo(String value) {
            addCriterion("jxjrjt <=", value, "jxjrjt");
            return (Criteria) this;
        }

        public Criteria andJxjrjtLike(String value) {
            addCriterion("jxjrjt like", value, "jxjrjt");
            return (Criteria) this;
        }

        public Criteria andJxjrjtNotLike(String value) {
            addCriterion("jxjrjt not like", value, "jxjrjt");
            return (Criteria) this;
        }

        public Criteria andJxjrjtIn(List<String> values) {
            addCriterion("jxjrjt in", values, "jxjrjt");
            return (Criteria) this;
        }

        public Criteria andJxjrjtNotIn(List<String> values) {
            addCriterion("jxjrjt not in", values, "jxjrjt");
            return (Criteria) this;
        }

        public Criteria andJxjrjtBetween(String value1, String value2) {
            addCriterion("jxjrjt between", value1, value2, "jxjrjt");
            return (Criteria) this;
        }

        public Criteria andJxjrjtNotBetween(String value1, String value2) {
            addCriterion("jxjrjt not between", value1, value2, "jxjrjt");
            return (Criteria) this;
        }

        public Criteria andYjsqtjxgzjtIsNull() {
            addCriterion("yjsqtjxgzjt is null");
            return (Criteria) this;
        }

        public Criteria andYjsqtjxgzjtIsNotNull() {
            addCriterion("yjsqtjxgzjt is not null");
            return (Criteria) this;
        }

        public Criteria andYjsqtjxgzjtEqualTo(String value) {
            addCriterion("yjsqtjxgzjt =", value, "yjsqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andYjsqtjxgzjtNotEqualTo(String value) {
            addCriterion("yjsqtjxgzjt <>", value, "yjsqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andYjsqtjxgzjtGreaterThan(String value) {
            addCriterion("yjsqtjxgzjt >", value, "yjsqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andYjsqtjxgzjtGreaterThanOrEqualTo(String value) {
            addCriterion("yjsqtjxgzjt >=", value, "yjsqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andYjsqtjxgzjtLessThan(String value) {
            addCriterion("yjsqtjxgzjt <", value, "yjsqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andYjsqtjxgzjtLessThanOrEqualTo(String value) {
            addCriterion("yjsqtjxgzjt <=", value, "yjsqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andYjsqtjxgzjtLike(String value) {
            addCriterion("yjsqtjxgzjt like", value, "yjsqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andYjsqtjxgzjtNotLike(String value) {
            addCriterion("yjsqtjxgzjt not like", value, "yjsqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andYjsqtjxgzjtIn(List<String> values) {
            addCriterion("yjsqtjxgzjt in", values, "yjsqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andYjsqtjxgzjtNotIn(List<String> values) {
            addCriterion("yjsqtjxgzjt not in", values, "yjsqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andYjsqtjxgzjtBetween(String value1, String value2) {
            addCriterion("yjsqtjxgzjt between", value1, value2, "yjsqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andYjsqtjxgzjtNotBetween(String value1, String value2) {
            addCriterion("yjsqtjxgzjt not between", value1, value2, "yjsqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andBkqtjxgzjtIsNull() {
            addCriterion("bkqtjxgzjt is null");
            return (Criteria) this;
        }

        public Criteria andBkqtjxgzjtIsNotNull() {
            addCriterion("bkqtjxgzjt is not null");
            return (Criteria) this;
        }

        public Criteria andBkqtjxgzjtEqualTo(String value) {
            addCriterion("bkqtjxgzjt =", value, "bkqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andBkqtjxgzjtNotEqualTo(String value) {
            addCriterion("bkqtjxgzjt <>", value, "bkqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andBkqtjxgzjtGreaterThan(String value) {
            addCriterion("bkqtjxgzjt >", value, "bkqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andBkqtjxgzjtGreaterThanOrEqualTo(String value) {
            addCriterion("bkqtjxgzjt >=", value, "bkqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andBkqtjxgzjtLessThan(String value) {
            addCriterion("bkqtjxgzjt <", value, "bkqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andBkqtjxgzjtLessThanOrEqualTo(String value) {
            addCriterion("bkqtjxgzjt <=", value, "bkqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andBkqtjxgzjtLike(String value) {
            addCriterion("bkqtjxgzjt like", value, "bkqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andBkqtjxgzjtNotLike(String value) {
            addCriterion("bkqtjxgzjt not like", value, "bkqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andBkqtjxgzjtIn(List<String> values) {
            addCriterion("bkqtjxgzjt in", values, "bkqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andBkqtjxgzjtNotIn(List<String> values) {
            addCriterion("bkqtjxgzjt not in", values, "bkqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andBkqtjxgzjtBetween(String value1, String value2) {
            addCriterion("bkqtjxgzjt between", value1, value2, "bkqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andBkqtjxgzjtNotBetween(String value1, String value2) {
            addCriterion("bkqtjxgzjt not between", value1, value2, "bkqtjxgzjt");
            return (Criteria) this;
        }

        public Criteria andJxgzjthjIsNull() {
            addCriterion("jxgzjthj is null");
            return (Criteria) this;
        }

        public Criteria andJxgzjthjIsNotNull() {
            addCriterion("jxgzjthj is not null");
            return (Criteria) this;
        }

        public Criteria andJxgzjthjEqualTo(String value) {
            addCriterion("jxgzjthj =", value, "jxgzjthj");
            return (Criteria) this;
        }

        public Criteria andJxgzjthjNotEqualTo(String value) {
            addCriterion("jxgzjthj <>", value, "jxgzjthj");
            return (Criteria) this;
        }

        public Criteria andJxgzjthjGreaterThan(String value) {
            addCriterion("jxgzjthj >", value, "jxgzjthj");
            return (Criteria) this;
        }

        public Criteria andJxgzjthjGreaterThanOrEqualTo(String value) {
            addCriterion("jxgzjthj >=", value, "jxgzjthj");
            return (Criteria) this;
        }

        public Criteria andJxgzjthjLessThan(String value) {
            addCriterion("jxgzjthj <", value, "jxgzjthj");
            return (Criteria) this;
        }

        public Criteria andJxgzjthjLessThanOrEqualTo(String value) {
            addCriterion("jxgzjthj <=", value, "jxgzjthj");
            return (Criteria) this;
        }

        public Criteria andJxgzjthjLike(String value) {
            addCriterion("jxgzjthj like", value, "jxgzjthj");
            return (Criteria) this;
        }

        public Criteria andJxgzjthjNotLike(String value) {
            addCriterion("jxgzjthj not like", value, "jxgzjthj");
            return (Criteria) this;
        }

        public Criteria andJxgzjthjIn(List<String> values) {
            addCriterion("jxgzjthj in", values, "jxgzjthj");
            return (Criteria) this;
        }

        public Criteria andJxgzjthjNotIn(List<String> values) {
            addCriterion("jxgzjthj not in", values, "jxgzjthj");
            return (Criteria) this;
        }

        public Criteria andJxgzjthjBetween(String value1, String value2) {
            addCriterion("jxgzjthj between", value1, value2, "jxgzjthj");
            return (Criteria) this;
        }

        public Criteria andJxgzjthjNotBetween(String value1, String value2) {
            addCriterion("jxgzjthj not between", value1, value2, "jxgzjthj");
            return (Criteria) this;
        }

        public Criteria andKcqjsgzjtIsNull() {
            addCriterion("kcqjsgzjt is null");
            return (Criteria) this;
        }

        public Criteria andKcqjsgzjtIsNotNull() {
            addCriterion("kcqjsgzjt is not null");
            return (Criteria) this;
        }

        public Criteria andKcqjsgzjtEqualTo(String value) {
            addCriterion("kcqjsgzjt =", value, "kcqjsgzjt");
            return (Criteria) this;
        }

        public Criteria andKcqjsgzjtNotEqualTo(String value) {
            addCriterion("kcqjsgzjt <>", value, "kcqjsgzjt");
            return (Criteria) this;
        }

        public Criteria andKcqjsgzjtGreaterThan(String value) {
            addCriterion("kcqjsgzjt >", value, "kcqjsgzjt");
            return (Criteria) this;
        }

        public Criteria andKcqjsgzjtGreaterThanOrEqualTo(String value) {
            addCriterion("kcqjsgzjt >=", value, "kcqjsgzjt");
            return (Criteria) this;
        }

        public Criteria andKcqjsgzjtLessThan(String value) {
            addCriterion("kcqjsgzjt <", value, "kcqjsgzjt");
            return (Criteria) this;
        }

        public Criteria andKcqjsgzjtLessThanOrEqualTo(String value) {
            addCriterion("kcqjsgzjt <=", value, "kcqjsgzjt");
            return (Criteria) this;
        }

        public Criteria andKcqjsgzjtLike(String value) {
            addCriterion("kcqjsgzjt like", value, "kcqjsgzjt");
            return (Criteria) this;
        }

        public Criteria andKcqjsgzjtNotLike(String value) {
            addCriterion("kcqjsgzjt not like", value, "kcqjsgzjt");
            return (Criteria) this;
        }

        public Criteria andKcqjsgzjtIn(List<String> values) {
            addCriterion("kcqjsgzjt in", values, "kcqjsgzjt");
            return (Criteria) this;
        }

        public Criteria andKcqjsgzjtNotIn(List<String> values) {
            addCriterion("kcqjsgzjt not in", values, "kcqjsgzjt");
            return (Criteria) this;
        }

        public Criteria andKcqjsgzjtBetween(String value1, String value2) {
            addCriterion("kcqjsgzjt between", value1, value2, "kcqjsgzjt");
            return (Criteria) this;
        }

        public Criteria andKcqjsgzjtNotBetween(String value1, String value2) {
            addCriterion("kcqjsgzjt not between", value1, value2, "kcqjsgzjt");
            return (Criteria) this;
        }

        public Criteria andJxyjjxzjIsNull() {
            addCriterion("jxyjjxzj is null");
            return (Criteria) this;
        }

        public Criteria andJxyjjxzjIsNotNull() {
            addCriterion("jxyjjxzj is not null");
            return (Criteria) this;
        }

        public Criteria andJxyjjxzjEqualTo(String value) {
            addCriterion("jxyjjxzj =", value, "jxyjjxzj");
            return (Criteria) this;
        }

        public Criteria andJxyjjxzjNotEqualTo(String value) {
            addCriterion("jxyjjxzj <>", value, "jxyjjxzj");
            return (Criteria) this;
        }

        public Criteria andJxyjjxzjGreaterThan(String value) {
            addCriterion("jxyjjxzj >", value, "jxyjjxzj");
            return (Criteria) this;
        }

        public Criteria andJxyjjxzjGreaterThanOrEqualTo(String value) {
            addCriterion("jxyjjxzj >=", value, "jxyjjxzj");
            return (Criteria) this;
        }

        public Criteria andJxyjjxzjLessThan(String value) {
            addCriterion("jxyjjxzj <", value, "jxyjjxzj");
            return (Criteria) this;
        }

        public Criteria andJxyjjxzjLessThanOrEqualTo(String value) {
            addCriterion("jxyjjxzj <=", value, "jxyjjxzj");
            return (Criteria) this;
        }

        public Criteria andJxyjjxzjLike(String value) {
            addCriterion("jxyjjxzj like", value, "jxyjjxzj");
            return (Criteria) this;
        }

        public Criteria andJxyjjxzjNotLike(String value) {
            addCriterion("jxyjjxzj not like", value, "jxyjjxzj");
            return (Criteria) this;
        }

        public Criteria andJxyjjxzjIn(List<String> values) {
            addCriterion("jxyjjxzj in", values, "jxyjjxzj");
            return (Criteria) this;
        }

        public Criteria andJxyjjxzjNotIn(List<String> values) {
            addCriterion("jxyjjxzj not in", values, "jxyjjxzj");
            return (Criteria) this;
        }

        public Criteria andJxyjjxzjBetween(String value1, String value2) {
            addCriterion("jxyjjxzj between", value1, value2, "jxyjjxzj");
            return (Criteria) this;
        }

        public Criteria andJxyjjxzjNotBetween(String value1, String value2) {
            addCriterion("jxyjjxzj not between", value1, value2, "jxyjjxzj");
            return (Criteria) this;
        }

        public Criteria andKygzlIsNull() {
            addCriterion("kygzl is null");
            return (Criteria) this;
        }

        public Criteria andKygzlIsNotNull() {
            addCriterion("kygzl is not null");
            return (Criteria) this;
        }

        public Criteria andKygzlEqualTo(String value) {
            addCriterion("kygzl =", value, "kygzl");
            return (Criteria) this;
        }

        public Criteria andKygzlNotEqualTo(String value) {
            addCriterion("kygzl <>", value, "kygzl");
            return (Criteria) this;
        }

        public Criteria andKygzlGreaterThan(String value) {
            addCriterion("kygzl >", value, "kygzl");
            return (Criteria) this;
        }

        public Criteria andKygzlGreaterThanOrEqualTo(String value) {
            addCriterion("kygzl >=", value, "kygzl");
            return (Criteria) this;
        }

        public Criteria andKygzlLessThan(String value) {
            addCriterion("kygzl <", value, "kygzl");
            return (Criteria) this;
        }

        public Criteria andKygzlLessThanOrEqualTo(String value) {
            addCriterion("kygzl <=", value, "kygzl");
            return (Criteria) this;
        }

        public Criteria andKygzlLike(String value) {
            addCriterion("kygzl like", value, "kygzl");
            return (Criteria) this;
        }

        public Criteria andKygzlNotLike(String value) {
            addCriterion("kygzl not like", value, "kygzl");
            return (Criteria) this;
        }

        public Criteria andKygzlIn(List<String> values) {
            addCriterion("kygzl in", values, "kygzl");
            return (Criteria) this;
        }

        public Criteria andKygzlNotIn(List<String> values) {
            addCriterion("kygzl not in", values, "kygzl");
            return (Criteria) this;
        }

        public Criteria andKygzlBetween(String value1, String value2) {
            addCriterion("kygzl between", value1, value2, "kygzl");
            return (Criteria) this;
        }

        public Criteria andKygzlNotBetween(String value1, String value2) {
            addCriterion("kygzl not between", value1, value2, "kygzl");
            return (Criteria) this;
        }

        public Criteria andDjYIsNull() {
            addCriterion("dj_y is null");
            return (Criteria) this;
        }

        public Criteria andDjYIsNotNull() {
            addCriterion("dj_y is not null");
            return (Criteria) this;
        }

        public Criteria andDjYEqualTo(String value) {
            addCriterion("dj_y =", value, "djY");
            return (Criteria) this;
        }

        public Criteria andDjYNotEqualTo(String value) {
            addCriterion("dj_y <>", value, "djY");
            return (Criteria) this;
        }

        public Criteria andDjYGreaterThan(String value) {
            addCriterion("dj_y >", value, "djY");
            return (Criteria) this;
        }

        public Criteria andDjYGreaterThanOrEqualTo(String value) {
            addCriterion("dj_y >=", value, "djY");
            return (Criteria) this;
        }

        public Criteria andDjYLessThan(String value) {
            addCriterion("dj_y <", value, "djY");
            return (Criteria) this;
        }

        public Criteria andDjYLessThanOrEqualTo(String value) {
            addCriterion("dj_y <=", value, "djY");
            return (Criteria) this;
        }

        public Criteria andDjYLike(String value) {
            addCriterion("dj_y like", value, "djY");
            return (Criteria) this;
        }

        public Criteria andDjYNotLike(String value) {
            addCriterion("dj_y not like", value, "djY");
            return (Criteria) this;
        }

        public Criteria andDjYIn(List<String> values) {
            addCriterion("dj_y in", values, "djY");
            return (Criteria) this;
        }

        public Criteria andDjYNotIn(List<String> values) {
            addCriterion("dj_y not in", values, "djY");
            return (Criteria) this;
        }

        public Criteria andDjYBetween(String value1, String value2) {
            addCriterion("dj_y between", value1, value2, "djY");
            return (Criteria) this;
        }

        public Criteria andDjYNotBetween(String value1, String value2) {
            addCriterion("dj_y not between", value1, value2, "djY");
            return (Criteria) this;
        }

        public Criteria andKyyjjxzjIsNull() {
            addCriterion("kyyjjxzj is null");
            return (Criteria) this;
        }

        public Criteria andKyyjjxzjIsNotNull() {
            addCriterion("kyyjjxzj is not null");
            return (Criteria) this;
        }

        public Criteria andKyyjjxzjEqualTo(String value) {
            addCriterion("kyyjjxzj =", value, "kyyjjxzj");
            return (Criteria) this;
        }

        public Criteria andKyyjjxzjNotEqualTo(String value) {
            addCriterion("kyyjjxzj <>", value, "kyyjjxzj");
            return (Criteria) this;
        }

        public Criteria andKyyjjxzjGreaterThan(String value) {
            addCriterion("kyyjjxzj >", value, "kyyjjxzj");
            return (Criteria) this;
        }

        public Criteria andKyyjjxzjGreaterThanOrEqualTo(String value) {
            addCriterion("kyyjjxzj >=", value, "kyyjjxzj");
            return (Criteria) this;
        }

        public Criteria andKyyjjxzjLessThan(String value) {
            addCriterion("kyyjjxzj <", value, "kyyjjxzj");
            return (Criteria) this;
        }

        public Criteria andKyyjjxzjLessThanOrEqualTo(String value) {
            addCriterion("kyyjjxzj <=", value, "kyyjjxzj");
            return (Criteria) this;
        }

        public Criteria andKyyjjxzjLike(String value) {
            addCriterion("kyyjjxzj like", value, "kyyjjxzj");
            return (Criteria) this;
        }

        public Criteria andKyyjjxzjNotLike(String value) {
            addCriterion("kyyjjxzj not like", value, "kyyjjxzj");
            return (Criteria) this;
        }

        public Criteria andKyyjjxzjIn(List<String> values) {
            addCriterion("kyyjjxzj in", values, "kyyjjxzj");
            return (Criteria) this;
        }

        public Criteria andKyyjjxzjNotIn(List<String> values) {
            addCriterion("kyyjjxzj not in", values, "kyyjjxzj");
            return (Criteria) this;
        }

        public Criteria andKyyjjxzjBetween(String value1, String value2) {
            addCriterion("kyyjjxzj between", value1, value2, "kyyjjxzj");
            return (Criteria) this;
        }

        public Criteria andKyyjjxzjNotBetween(String value1, String value2) {
            addCriterion("kyyjjxzj not between", value1, value2, "kyyjjxzj");
            return (Criteria) this;
        }

        public Criteria andXkjsgzlIsNull() {
            addCriterion("xkjsgzl is null");
            return (Criteria) this;
        }

        public Criteria andXkjsgzlIsNotNull() {
            addCriterion("xkjsgzl is not null");
            return (Criteria) this;
        }

        public Criteria andXkjsgzlEqualTo(String value) {
            addCriterion("xkjsgzl =", value, "xkjsgzl");
            return (Criteria) this;
        }

        public Criteria andXkjsgzlNotEqualTo(String value) {
            addCriterion("xkjsgzl <>", value, "xkjsgzl");
            return (Criteria) this;
        }

        public Criteria andXkjsgzlGreaterThan(String value) {
            addCriterion("xkjsgzl >", value, "xkjsgzl");
            return (Criteria) this;
        }

        public Criteria andXkjsgzlGreaterThanOrEqualTo(String value) {
            addCriterion("xkjsgzl >=", value, "xkjsgzl");
            return (Criteria) this;
        }

        public Criteria andXkjsgzlLessThan(String value) {
            addCriterion("xkjsgzl <", value, "xkjsgzl");
            return (Criteria) this;
        }

        public Criteria andXkjsgzlLessThanOrEqualTo(String value) {
            addCriterion("xkjsgzl <=", value, "xkjsgzl");
            return (Criteria) this;
        }

        public Criteria andXkjsgzlLike(String value) {
            addCriterion("xkjsgzl like", value, "xkjsgzl");
            return (Criteria) this;
        }

        public Criteria andXkjsgzlNotLike(String value) {
            addCriterion("xkjsgzl not like", value, "xkjsgzl");
            return (Criteria) this;
        }

        public Criteria andXkjsgzlIn(List<String> values) {
            addCriterion("xkjsgzl in", values, "xkjsgzl");
            return (Criteria) this;
        }

        public Criteria andXkjsgzlNotIn(List<String> values) {
            addCriterion("xkjsgzl not in", values, "xkjsgzl");
            return (Criteria) this;
        }

        public Criteria andXkjsgzlBetween(String value1, String value2) {
            addCriterion("xkjsgzl between", value1, value2, "xkjsgzl");
            return (Criteria) this;
        }

        public Criteria andXkjsgzlNotBetween(String value1, String value2) {
            addCriterion("xkjsgzl not between", value1, value2, "xkjsgzl");
            return (Criteria) this;
        }

        public Criteria andDjZIsNull() {
            addCriterion("dj_z is null");
            return (Criteria) this;
        }

        public Criteria andDjZIsNotNull() {
            addCriterion("dj_z is not null");
            return (Criteria) this;
        }

        public Criteria andDjZEqualTo(String value) {
            addCriterion("dj_z =", value, "djZ");
            return (Criteria) this;
        }

        public Criteria andDjZNotEqualTo(String value) {
            addCriterion("dj_z <>", value, "djZ");
            return (Criteria) this;
        }

        public Criteria andDjZGreaterThan(String value) {
            addCriterion("dj_z >", value, "djZ");
            return (Criteria) this;
        }

        public Criteria andDjZGreaterThanOrEqualTo(String value) {
            addCriterion("dj_z >=", value, "djZ");
            return (Criteria) this;
        }

        public Criteria andDjZLessThan(String value) {
            addCriterion("dj_z <", value, "djZ");
            return (Criteria) this;
        }

        public Criteria andDjZLessThanOrEqualTo(String value) {
            addCriterion("dj_z <=", value, "djZ");
            return (Criteria) this;
        }

        public Criteria andDjZLike(String value) {
            addCriterion("dj_z like", value, "djZ");
            return (Criteria) this;
        }

        public Criteria andDjZNotLike(String value) {
            addCriterion("dj_z not like", value, "djZ");
            return (Criteria) this;
        }

        public Criteria andDjZIn(List<String> values) {
            addCriterion("dj_z in", values, "djZ");
            return (Criteria) this;
        }

        public Criteria andDjZNotIn(List<String> values) {
            addCriterion("dj_z not in", values, "djZ");
            return (Criteria) this;
        }

        public Criteria andDjZBetween(String value1, String value2) {
            addCriterion("dj_z between", value1, value2, "djZ");
            return (Criteria) this;
        }

        public Criteria andDjZNotBetween(String value1, String value2) {
            addCriterion("dj_z not between", value1, value2, "djZ");
            return (Criteria) this;
        }

        public Criteria andXkjsjxzjIsNull() {
            addCriterion("xkjsjxzj is null");
            return (Criteria) this;
        }

        public Criteria andXkjsjxzjIsNotNull() {
            addCriterion("xkjsjxzj is not null");
            return (Criteria) this;
        }

        public Criteria andXkjsjxzjEqualTo(String value) {
            addCriterion("xkjsjxzj =", value, "xkjsjxzj");
            return (Criteria) this;
        }

        public Criteria andXkjsjxzjNotEqualTo(String value) {
            addCriterion("xkjsjxzj <>", value, "xkjsjxzj");
            return (Criteria) this;
        }

        public Criteria andXkjsjxzjGreaterThan(String value) {
            addCriterion("xkjsjxzj >", value, "xkjsjxzj");
            return (Criteria) this;
        }

        public Criteria andXkjsjxzjGreaterThanOrEqualTo(String value) {
            addCriterion("xkjsjxzj >=", value, "xkjsjxzj");
            return (Criteria) this;
        }

        public Criteria andXkjsjxzjLessThan(String value) {
            addCriterion("xkjsjxzj <", value, "xkjsjxzj");
            return (Criteria) this;
        }

        public Criteria andXkjsjxzjLessThanOrEqualTo(String value) {
            addCriterion("xkjsjxzj <=", value, "xkjsjxzj");
            return (Criteria) this;
        }

        public Criteria andXkjsjxzjLike(String value) {
            addCriterion("xkjsjxzj like", value, "xkjsjxzj");
            return (Criteria) this;
        }

        public Criteria andXkjsjxzjNotLike(String value) {
            addCriterion("xkjsjxzj not like", value, "xkjsjxzj");
            return (Criteria) this;
        }

        public Criteria andXkjsjxzjIn(List<String> values) {
            addCriterion("xkjsjxzj in", values, "xkjsjxzj");
            return (Criteria) this;
        }

        public Criteria andXkjsjxzjNotIn(List<String> values) {
            addCriterion("xkjsjxzj not in", values, "xkjsjxzj");
            return (Criteria) this;
        }

        public Criteria andXkjsjxzjBetween(String value1, String value2) {
            addCriterion("xkjsjxzj between", value1, value2, "xkjsjxzj");
            return (Criteria) this;
        }

        public Criteria andXkjsjxzjNotBetween(String value1, String value2) {
            addCriterion("xkjsjxzj not between", value1, value2, "xkjsjxzj");
            return (Criteria) this;
        }

        public Criteria andZrjsggwyjjxhjIsNull() {
            addCriterion("zrjsggwyjjxhj is null");
            return (Criteria) this;
        }

        public Criteria andZrjsggwyjjxhjIsNotNull() {
            addCriterion("zrjsggwyjjxhj is not null");
            return (Criteria) this;
        }

        public Criteria andZrjsggwyjjxhjEqualTo(String value) {
            addCriterion("zrjsggwyjjxhj =", value, "zrjsggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsggwyjjxhjNotEqualTo(String value) {
            addCriterion("zrjsggwyjjxhj <>", value, "zrjsggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsggwyjjxhjGreaterThan(String value) {
            addCriterion("zrjsggwyjjxhj >", value, "zrjsggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsggwyjjxhjGreaterThanOrEqualTo(String value) {
            addCriterion("zrjsggwyjjxhj >=", value, "zrjsggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsggwyjjxhjLessThan(String value) {
            addCriterion("zrjsggwyjjxhj <", value, "zrjsggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsggwyjjxhjLessThanOrEqualTo(String value) {
            addCriterion("zrjsggwyjjxhj <=", value, "zrjsggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsggwyjjxhjLike(String value) {
            addCriterion("zrjsggwyjjxhj like", value, "zrjsggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsggwyjjxhjNotLike(String value) {
            addCriterion("zrjsggwyjjxhj not like", value, "zrjsggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsggwyjjxhjIn(List<String> values) {
            addCriterion("zrjsggwyjjxhj in", values, "zrjsggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsggwyjjxhjNotIn(List<String> values) {
            addCriterion("zrjsggwyjjxhj not in", values, "zrjsggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsggwyjjxhjBetween(String value1, String value2) {
            addCriterion("zrjsggwyjjxhj between", value1, value2, "zrjsggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsggwyjjxhjNotBetween(String value1, String value2) {
            addCriterion("zrjsggwyjjxhj not between", value1, value2, "zrjsggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGzlIsNull() {
            addCriterion("gzl is null");
            return (Criteria) this;
        }

        public Criteria andGzlIsNotNull() {
            addCriterion("gzl is not null");
            return (Criteria) this;
        }

        public Criteria andGzlEqualTo(String value) {
            addCriterion("gzl =", value, "gzl");
            return (Criteria) this;
        }

        public Criteria andGzlNotEqualTo(String value) {
            addCriterion("gzl <>", value, "gzl");
            return (Criteria) this;
        }

        public Criteria andGzlGreaterThan(String value) {
            addCriterion("gzl >", value, "gzl");
            return (Criteria) this;
        }

        public Criteria andGzlGreaterThanOrEqualTo(String value) {
            addCriterion("gzl >=", value, "gzl");
            return (Criteria) this;
        }

        public Criteria andGzlLessThan(String value) {
            addCriterion("gzl <", value, "gzl");
            return (Criteria) this;
        }

        public Criteria andGzlLessThanOrEqualTo(String value) {
            addCriterion("gzl <=", value, "gzl");
            return (Criteria) this;
        }

        public Criteria andGzlLike(String value) {
            addCriterion("gzl like", value, "gzl");
            return (Criteria) this;
        }

        public Criteria andGzlNotLike(String value) {
            addCriterion("gzl not like", value, "gzl");
            return (Criteria) this;
        }

        public Criteria andGzlIn(List<String> values) {
            addCriterion("gzl in", values, "gzl");
            return (Criteria) this;
        }

        public Criteria andGzlNotIn(List<String> values) {
            addCriterion("gzl not in", values, "gzl");
            return (Criteria) this;
        }

        public Criteria andGzlBetween(String value1, String value2) {
            addCriterion("gzl between", value1, value2, "gzl");
            return (Criteria) this;
        }

        public Criteria andGzlNotBetween(String value1, String value2) {
            addCriterion("gzl not between", value1, value2, "gzl");
            return (Criteria) this;
        }

        public Criteria andDjGzljxIsNull() {
            addCriterion("dj_gzljx is null");
            return (Criteria) this;
        }

        public Criteria andDjGzljxIsNotNull() {
            addCriterion("dj_gzljx is not null");
            return (Criteria) this;
        }

        public Criteria andDjGzljxEqualTo(String value) {
            addCriterion("dj_gzljx =", value, "djGzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzljxNotEqualTo(String value) {
            addCriterion("dj_gzljx <>", value, "djGzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzljxGreaterThan(String value) {
            addCriterion("dj_gzljx >", value, "djGzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzljxGreaterThanOrEqualTo(String value) {
            addCriterion("dj_gzljx >=", value, "djGzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzljxLessThan(String value) {
            addCriterion("dj_gzljx <", value, "djGzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzljxLessThanOrEqualTo(String value) {
            addCriterion("dj_gzljx <=", value, "djGzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzljxLike(String value) {
            addCriterion("dj_gzljx like", value, "djGzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzljxNotLike(String value) {
            addCriterion("dj_gzljx not like", value, "djGzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzljxIn(List<String> values) {
            addCriterion("dj_gzljx in", values, "djGzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzljxNotIn(List<String> values) {
            addCriterion("dj_gzljx not in", values, "djGzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzljxBetween(String value1, String value2) {
            addCriterion("dj_gzljx between", value1, value2, "djGzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzljxNotBetween(String value1, String value2) {
            addCriterion("dj_gzljx not between", value1, value2, "djGzljx");
            return (Criteria) this;
        }

        public Criteria andGzljxIsNull() {
            addCriterion("gzljx is null");
            return (Criteria) this;
        }

        public Criteria andGzljxIsNotNull() {
            addCriterion("gzljx is not null");
            return (Criteria) this;
        }

        public Criteria andGzljxEqualTo(String value) {
            addCriterion("gzljx =", value, "gzljx");
            return (Criteria) this;
        }

        public Criteria andGzljxNotEqualTo(String value) {
            addCriterion("gzljx <>", value, "gzljx");
            return (Criteria) this;
        }

        public Criteria andGzljxGreaterThan(String value) {
            addCriterion("gzljx >", value, "gzljx");
            return (Criteria) this;
        }

        public Criteria andGzljxGreaterThanOrEqualTo(String value) {
            addCriterion("gzljx >=", value, "gzljx");
            return (Criteria) this;
        }

        public Criteria andGzljxLessThan(String value) {
            addCriterion("gzljx <", value, "gzljx");
            return (Criteria) this;
        }

        public Criteria andGzljxLessThanOrEqualTo(String value) {
            addCriterion("gzljx <=", value, "gzljx");
            return (Criteria) this;
        }

        public Criteria andGzljxLike(String value) {
            addCriterion("gzljx like", value, "gzljx");
            return (Criteria) this;
        }

        public Criteria andGzljxNotLike(String value) {
            addCriterion("gzljx not like", value, "gzljx");
            return (Criteria) this;
        }

        public Criteria andGzljxIn(List<String> values) {
            addCriterion("gzljx in", values, "gzljx");
            return (Criteria) this;
        }

        public Criteria andGzljxNotIn(List<String> values) {
            addCriterion("gzljx not in", values, "gzljx");
            return (Criteria) this;
        }

        public Criteria andGzljxBetween(String value1, String value2) {
            addCriterion("gzljx between", value1, value2, "gzljx");
            return (Criteria) this;
        }

        public Criteria andGzljxNotBetween(String value1, String value2) {
            addCriterion("gzljx not between", value1, value2, "gzljx");
            return (Criteria) this;
        }

        public Criteria andGzzlIsNull() {
            addCriterion("gzzl is null");
            return (Criteria) this;
        }

        public Criteria andGzzlIsNotNull() {
            addCriterion("gzzl is not null");
            return (Criteria) this;
        }

        public Criteria andGzzlEqualTo(String value) {
            addCriterion("gzzl =", value, "gzzl");
            return (Criteria) this;
        }

        public Criteria andGzzlNotEqualTo(String value) {
            addCriterion("gzzl <>", value, "gzzl");
            return (Criteria) this;
        }

        public Criteria andGzzlGreaterThan(String value) {
            addCriterion("gzzl >", value, "gzzl");
            return (Criteria) this;
        }

        public Criteria andGzzlGreaterThanOrEqualTo(String value) {
            addCriterion("gzzl >=", value, "gzzl");
            return (Criteria) this;
        }

        public Criteria andGzzlLessThan(String value) {
            addCriterion("gzzl <", value, "gzzl");
            return (Criteria) this;
        }

        public Criteria andGzzlLessThanOrEqualTo(String value) {
            addCriterion("gzzl <=", value, "gzzl");
            return (Criteria) this;
        }

        public Criteria andGzzlLike(String value) {
            addCriterion("gzzl like", value, "gzzl");
            return (Criteria) this;
        }

        public Criteria andGzzlNotLike(String value) {
            addCriterion("gzzl not like", value, "gzzl");
            return (Criteria) this;
        }

        public Criteria andGzzlIn(List<String> values) {
            addCriterion("gzzl in", values, "gzzl");
            return (Criteria) this;
        }

        public Criteria andGzzlNotIn(List<String> values) {
            addCriterion("gzzl not in", values, "gzzl");
            return (Criteria) this;
        }

        public Criteria andGzzlBetween(String value1, String value2) {
            addCriterion("gzzl between", value1, value2, "gzzl");
            return (Criteria) this;
        }

        public Criteria andGzzlNotBetween(String value1, String value2) {
            addCriterion("gzzl not between", value1, value2, "gzzl");
            return (Criteria) this;
        }

        public Criteria andDjGzzljxIsNull() {
            addCriterion("dj_gzzljx is null");
            return (Criteria) this;
        }

        public Criteria andDjGzzljxIsNotNull() {
            addCriterion("dj_gzzljx is not null");
            return (Criteria) this;
        }

        public Criteria andDjGzzljxEqualTo(String value) {
            addCriterion("dj_gzzljx =", value, "djGzzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzzljxNotEqualTo(String value) {
            addCriterion("dj_gzzljx <>", value, "djGzzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzzljxGreaterThan(String value) {
            addCriterion("dj_gzzljx >", value, "djGzzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzzljxGreaterThanOrEqualTo(String value) {
            addCriterion("dj_gzzljx >=", value, "djGzzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzzljxLessThan(String value) {
            addCriterion("dj_gzzljx <", value, "djGzzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzzljxLessThanOrEqualTo(String value) {
            addCriterion("dj_gzzljx <=", value, "djGzzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzzljxLike(String value) {
            addCriterion("dj_gzzljx like", value, "djGzzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzzljxNotLike(String value) {
            addCriterion("dj_gzzljx not like", value, "djGzzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzzljxIn(List<String> values) {
            addCriterion("dj_gzzljx in", values, "djGzzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzzljxNotIn(List<String> values) {
            addCriterion("dj_gzzljx not in", values, "djGzzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzzljxBetween(String value1, String value2) {
            addCriterion("dj_gzzljx between", value1, value2, "djGzzljx");
            return (Criteria) this;
        }

        public Criteria andDjGzzljxNotBetween(String value1, String value2) {
            addCriterion("dj_gzzljx not between", value1, value2, "djGzzljx");
            return (Criteria) this;
        }

        public Criteria andHzzljxIsNull() {
            addCriterion("hzzljx is null");
            return (Criteria) this;
        }

        public Criteria andHzzljxIsNotNull() {
            addCriterion("hzzljx is not null");
            return (Criteria) this;
        }

        public Criteria andHzzljxEqualTo(String value) {
            addCriterion("hzzljx =", value, "hzzljx");
            return (Criteria) this;
        }

        public Criteria andHzzljxNotEqualTo(String value) {
            addCriterion("hzzljx <>", value, "hzzljx");
            return (Criteria) this;
        }

        public Criteria andHzzljxGreaterThan(String value) {
            addCriterion("hzzljx >", value, "hzzljx");
            return (Criteria) this;
        }

        public Criteria andHzzljxGreaterThanOrEqualTo(String value) {
            addCriterion("hzzljx >=", value, "hzzljx");
            return (Criteria) this;
        }

        public Criteria andHzzljxLessThan(String value) {
            addCriterion("hzzljx <", value, "hzzljx");
            return (Criteria) this;
        }

        public Criteria andHzzljxLessThanOrEqualTo(String value) {
            addCriterion("hzzljx <=", value, "hzzljx");
            return (Criteria) this;
        }

        public Criteria andHzzljxLike(String value) {
            addCriterion("hzzljx like", value, "hzzljx");
            return (Criteria) this;
        }

        public Criteria andHzzljxNotLike(String value) {
            addCriterion("hzzljx not like", value, "hzzljx");
            return (Criteria) this;
        }

        public Criteria andHzzljxIn(List<String> values) {
            addCriterion("hzzljx in", values, "hzzljx");
            return (Criteria) this;
        }

        public Criteria andHzzljxNotIn(List<String> values) {
            addCriterion("hzzljx not in", values, "hzzljx");
            return (Criteria) this;
        }

        public Criteria andHzzljxBetween(String value1, String value2) {
            addCriterion("hzzljx between", value1, value2, "hzzljx");
            return (Criteria) this;
        }

        public Criteria andHzzljxNotBetween(String value1, String value2) {
            addCriterion("hzzljx not between", value1, value2, "hzzljx");
            return (Criteria) this;
        }

        public Criteria andPjjxIsNull() {
            addCriterion("pjjx is null");
            return (Criteria) this;
        }

        public Criteria andPjjxIsNotNull() {
            addCriterion("pjjx is not null");
            return (Criteria) this;
        }

        public Criteria andPjjxEqualTo(String value) {
            addCriterion("pjjx =", value, "pjjx");
            return (Criteria) this;
        }

        public Criteria andPjjxNotEqualTo(String value) {
            addCriterion("pjjx <>", value, "pjjx");
            return (Criteria) this;
        }

        public Criteria andPjjxGreaterThan(String value) {
            addCriterion("pjjx >", value, "pjjx");
            return (Criteria) this;
        }

        public Criteria andPjjxGreaterThanOrEqualTo(String value) {
            addCriterion("pjjx >=", value, "pjjx");
            return (Criteria) this;
        }

        public Criteria andPjjxLessThan(String value) {
            addCriterion("pjjx <", value, "pjjx");
            return (Criteria) this;
        }

        public Criteria andPjjxLessThanOrEqualTo(String value) {
            addCriterion("pjjx <=", value, "pjjx");
            return (Criteria) this;
        }

        public Criteria andPjjxLike(String value) {
            addCriterion("pjjx like", value, "pjjx");
            return (Criteria) this;
        }

        public Criteria andPjjxNotLike(String value) {
            addCriterion("pjjx not like", value, "pjjx");
            return (Criteria) this;
        }

        public Criteria andPjjxIn(List<String> values) {
            addCriterion("pjjx in", values, "pjjx");
            return (Criteria) this;
        }

        public Criteria andPjjxNotIn(List<String> values) {
            addCriterion("pjjx not in", values, "pjjx");
            return (Criteria) this;
        }

        public Criteria andPjjxBetween(String value1, String value2) {
            addCriterion("pjjx between", value1, value2, "pjjx");
            return (Criteria) this;
        }

        public Criteria andPjjxNotBetween(String value1, String value2) {
            addCriterion("pjjx not between", value1, value2, "pjjx");
            return (Criteria) this;
        }

        public Criteria andFdygzjxhjIsNull() {
            addCriterion("fdygzjxhj is null");
            return (Criteria) this;
        }

        public Criteria andFdygzjxhjIsNotNull() {
            addCriterion("fdygzjxhj is not null");
            return (Criteria) this;
        }

        public Criteria andFdygzjxhjEqualTo(String value) {
            addCriterion("fdygzjxhj =", value, "fdygzjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzjxhjNotEqualTo(String value) {
            addCriterion("fdygzjxhj <>", value, "fdygzjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzjxhjGreaterThan(String value) {
            addCriterion("fdygzjxhj >", value, "fdygzjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzjxhjGreaterThanOrEqualTo(String value) {
            addCriterion("fdygzjxhj >=", value, "fdygzjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzjxhjLessThan(String value) {
            addCriterion("fdygzjxhj <", value, "fdygzjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzjxhjLessThanOrEqualTo(String value) {
            addCriterion("fdygzjxhj <=", value, "fdygzjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzjxhjLike(String value) {
            addCriterion("fdygzjxhj like", value, "fdygzjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzjxhjNotLike(String value) {
            addCriterion("fdygzjxhj not like", value, "fdygzjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzjxhjIn(List<String> values) {
            addCriterion("fdygzjxhj in", values, "fdygzjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzjxhjNotIn(List<String> values) {
            addCriterion("fdygzjxhj not in", values, "fdygzjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzjxhjBetween(String value1, String value2) {
            addCriterion("fdygzjxhj between", value1, value2, "fdygzjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzjxhjNotBetween(String value1, String value2) {
            addCriterion("fdygzjxhj not between", value1, value2, "fdygzjxhj");
            return (Criteria) this;
        }

        public Criteria andFdyggwyjjxIsNull() {
            addCriterion("fdyggwyjjx is null");
            return (Criteria) this;
        }

        public Criteria andFdyggwyjjxIsNotNull() {
            addCriterion("fdyggwyjjx is not null");
            return (Criteria) this;
        }

        public Criteria andFdyggwyjjxEqualTo(String value) {
            addCriterion("fdyggwyjjx =", value, "fdyggwyjjx");
            return (Criteria) this;
        }

        public Criteria andFdyggwyjjxNotEqualTo(String value) {
            addCriterion("fdyggwyjjx <>", value, "fdyggwyjjx");
            return (Criteria) this;
        }

        public Criteria andFdyggwyjjxGreaterThan(String value) {
            addCriterion("fdyggwyjjx >", value, "fdyggwyjjx");
            return (Criteria) this;
        }

        public Criteria andFdyggwyjjxGreaterThanOrEqualTo(String value) {
            addCriterion("fdyggwyjjx >=", value, "fdyggwyjjx");
            return (Criteria) this;
        }

        public Criteria andFdyggwyjjxLessThan(String value) {
            addCriterion("fdyggwyjjx <", value, "fdyggwyjjx");
            return (Criteria) this;
        }

        public Criteria andFdyggwyjjxLessThanOrEqualTo(String value) {
            addCriterion("fdyggwyjjx <=", value, "fdyggwyjjx");
            return (Criteria) this;
        }

        public Criteria andFdyggwyjjxLike(String value) {
            addCriterion("fdyggwyjjx like", value, "fdyggwyjjx");
            return (Criteria) this;
        }

        public Criteria andFdyggwyjjxNotLike(String value) {
            addCriterion("fdyggwyjjx not like", value, "fdyggwyjjx");
            return (Criteria) this;
        }

        public Criteria andFdyggwyjjxIn(List<String> values) {
            addCriterion("fdyggwyjjx in", values, "fdyggwyjjx");
            return (Criteria) this;
        }

        public Criteria andFdyggwyjjxNotIn(List<String> values) {
            addCriterion("fdyggwyjjx not in", values, "fdyggwyjjx");
            return (Criteria) this;
        }

        public Criteria andFdyggwyjjxBetween(String value1, String value2) {
            addCriterion("fdyggwyjjx between", value1, value2, "fdyggwyjjx");
            return (Criteria) this;
        }

        public Criteria andFdyggwyjjxNotBetween(String value1, String value2) {
            addCriterion("fdyggwyjjx not between", value1, value2, "fdyggwyjjx");
            return (Criteria) this;
        }

        public Criteria andGlgxsIsNull() {
            addCriterion("glgxs is null");
            return (Criteria) this;
        }

        public Criteria andGlgxsIsNotNull() {
            addCriterion("glgxs is not null");
            return (Criteria) this;
        }

        public Criteria andGlgxsEqualTo(String value) {
            addCriterion("glgxs =", value, "glgxs");
            return (Criteria) this;
        }

        public Criteria andGlgxsNotEqualTo(String value) {
            addCriterion("glgxs <>", value, "glgxs");
            return (Criteria) this;
        }

        public Criteria andGlgxsGreaterThan(String value) {
            addCriterion("glgxs >", value, "glgxs");
            return (Criteria) this;
        }

        public Criteria andGlgxsGreaterThanOrEqualTo(String value) {
            addCriterion("glgxs >=", value, "glgxs");
            return (Criteria) this;
        }

        public Criteria andGlgxsLessThan(String value) {
            addCriterion("glgxs <", value, "glgxs");
            return (Criteria) this;
        }

        public Criteria andGlgxsLessThanOrEqualTo(String value) {
            addCriterion("glgxs <=", value, "glgxs");
            return (Criteria) this;
        }

        public Criteria andGlgxsLike(String value) {
            addCriterion("glgxs like", value, "glgxs");
            return (Criteria) this;
        }

        public Criteria andGlgxsNotLike(String value) {
            addCriterion("glgxs not like", value, "glgxs");
            return (Criteria) this;
        }

        public Criteria andGlgxsIn(List<String> values) {
            addCriterion("glgxs in", values, "glgxs");
            return (Criteria) this;
        }

        public Criteria andGlgxsNotIn(List<String> values) {
            addCriterion("glgxs not in", values, "glgxs");
            return (Criteria) this;
        }

        public Criteria andGlgxsBetween(String value1, String value2) {
            addCriterion("glgxs between", value1, value2, "glgxs");
            return (Criteria) this;
        }

        public Criteria andGlgxsNotBetween(String value1, String value2) {
            addCriterion("glgxs not between", value1, value2, "glgxs");
            return (Criteria) this;
        }

        public Criteria andDjNIsNull() {
            addCriterion("dj_n is null");
            return (Criteria) this;
        }

        public Criteria andDjNIsNotNull() {
            addCriterion("dj_n is not null");
            return (Criteria) this;
        }

        public Criteria andDjNEqualTo(String value) {
            addCriterion("dj_n =", value, "djN");
            return (Criteria) this;
        }

        public Criteria andDjNNotEqualTo(String value) {
            addCriterion("dj_n <>", value, "djN");
            return (Criteria) this;
        }

        public Criteria andDjNGreaterThan(String value) {
            addCriterion("dj_n >", value, "djN");
            return (Criteria) this;
        }

        public Criteria andDjNGreaterThanOrEqualTo(String value) {
            addCriterion("dj_n >=", value, "djN");
            return (Criteria) this;
        }

        public Criteria andDjNLessThan(String value) {
            addCriterion("dj_n <", value, "djN");
            return (Criteria) this;
        }

        public Criteria andDjNLessThanOrEqualTo(String value) {
            addCriterion("dj_n <=", value, "djN");
            return (Criteria) this;
        }

        public Criteria andDjNLike(String value) {
            addCriterion("dj_n like", value, "djN");
            return (Criteria) this;
        }

        public Criteria andDjNNotLike(String value) {
            addCriterion("dj_n not like", value, "djN");
            return (Criteria) this;
        }

        public Criteria andDjNIn(List<String> values) {
            addCriterion("dj_n in", values, "djN");
            return (Criteria) this;
        }

        public Criteria andDjNNotIn(List<String> values) {
            addCriterion("dj_n not in", values, "djN");
            return (Criteria) this;
        }

        public Criteria andDjNBetween(String value1, String value2) {
            addCriterion("dj_n between", value1, value2, "djN");
            return (Criteria) this;
        }

        public Criteria andDjNNotBetween(String value1, String value2) {
            addCriterion("dj_n not between", value1, value2, "djN");
            return (Criteria) this;
        }

        public Criteria andGlgzjxhjIsNull() {
            addCriterion("glgzjxhj is null");
            return (Criteria) this;
        }

        public Criteria andGlgzjxhjIsNotNull() {
            addCriterion("glgzjxhj is not null");
            return (Criteria) this;
        }

        public Criteria andGlgzjxhjEqualTo(String value) {
            addCriterion("glgzjxhj =", value, "glgzjxhj");
            return (Criteria) this;
        }

        public Criteria andGlgzjxhjNotEqualTo(String value) {
            addCriterion("glgzjxhj <>", value, "glgzjxhj");
            return (Criteria) this;
        }

        public Criteria andGlgzjxhjGreaterThan(String value) {
            addCriterion("glgzjxhj >", value, "glgzjxhj");
            return (Criteria) this;
        }

        public Criteria andGlgzjxhjGreaterThanOrEqualTo(String value) {
            addCriterion("glgzjxhj >=", value, "glgzjxhj");
            return (Criteria) this;
        }

        public Criteria andGlgzjxhjLessThan(String value) {
            addCriterion("glgzjxhj <", value, "glgzjxhj");
            return (Criteria) this;
        }

        public Criteria andGlgzjxhjLessThanOrEqualTo(String value) {
            addCriterion("glgzjxhj <=", value, "glgzjxhj");
            return (Criteria) this;
        }

        public Criteria andGlgzjxhjLike(String value) {
            addCriterion("glgzjxhj like", value, "glgzjxhj");
            return (Criteria) this;
        }

        public Criteria andGlgzjxhjNotLike(String value) {
            addCriterion("glgzjxhj not like", value, "glgzjxhj");
            return (Criteria) this;
        }

        public Criteria andGlgzjxhjIn(List<String> values) {
            addCriterion("glgzjxhj in", values, "glgzjxhj");
            return (Criteria) this;
        }

        public Criteria andGlgzjxhjNotIn(List<String> values) {
            addCriterion("glgzjxhj not in", values, "glgzjxhj");
            return (Criteria) this;
        }

        public Criteria andGlgzjxhjBetween(String value1, String value2) {
            addCriterion("glgzjxhj between", value1, value2, "glgzjxhj");
            return (Criteria) this;
        }

        public Criteria andGlgzjxhjNotBetween(String value1, String value2) {
            addCriterion("glgzjxhj not between", value1, value2, "glgzjxhj");
            return (Criteria) this;
        }

        public Criteria andGlggwyjjxhjIsNull() {
            addCriterion("glggwyjjxhj is null");
            return (Criteria) this;
        }

        public Criteria andGlggwyjjxhjIsNotNull() {
            addCriterion("glggwyjjxhj is not null");
            return (Criteria) this;
        }

        public Criteria andGlggwyjjxhjEqualTo(String value) {
            addCriterion("glggwyjjxhj =", value, "glggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGlggwyjjxhjNotEqualTo(String value) {
            addCriterion("glggwyjjxhj <>", value, "glggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGlggwyjjxhjGreaterThan(String value) {
            addCriterion("glggwyjjxhj >", value, "glggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGlggwyjjxhjGreaterThanOrEqualTo(String value) {
            addCriterion("glggwyjjxhj >=", value, "glggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGlggwyjjxhjLessThan(String value) {
            addCriterion("glggwyjjxhj <", value, "glggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGlggwyjjxhjLessThanOrEqualTo(String value) {
            addCriterion("glggwyjjxhj <=", value, "glggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGlggwyjjxhjLike(String value) {
            addCriterion("glggwyjjxhj like", value, "glggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGlggwyjjxhjNotLike(String value) {
            addCriterion("glggwyjjxhj not like", value, "glggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGlggwyjjxhjIn(List<String> values) {
            addCriterion("glggwyjjxhj in", values, "glggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGlggwyjjxhjNotIn(List<String> values) {
            addCriterion("glggwyjjxhj not in", values, "glggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGlggwyjjxhjBetween(String value1, String value2) {
            addCriterion("glggwyjjxhj between", value1, value2, "glggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGlggwyjjxhjNotBetween(String value1, String value2) {
            addCriterion("glggwyjjxhj not between", value1, value2, "glggwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGwyjjxhjIsNull() {
            addCriterion("gwyjjxhj is null");
            return (Criteria) this;
        }

        public Criteria andGwyjjxhjIsNotNull() {
            addCriterion("gwyjjxhj is not null");
            return (Criteria) this;
        }

        public Criteria andGwyjjxhjEqualTo(String value) {
            addCriterion("gwyjjxhj =", value, "gwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGwyjjxhjNotEqualTo(String value) {
            addCriterion("gwyjjxhj <>", value, "gwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGwyjjxhjGreaterThan(String value) {
            addCriterion("gwyjjxhj >", value, "gwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGwyjjxhjGreaterThanOrEqualTo(String value) {
            addCriterion("gwyjjxhj >=", value, "gwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGwyjjxhjLessThan(String value) {
            addCriterion("gwyjjxhj <", value, "gwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGwyjjxhjLessThanOrEqualTo(String value) {
            addCriterion("gwyjjxhj <=", value, "gwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGwyjjxhjLike(String value) {
            addCriterion("gwyjjxhj like", value, "gwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGwyjjxhjNotLike(String value) {
            addCriterion("gwyjjxhj not like", value, "gwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGwyjjxhjIn(List<String> values) {
            addCriterion("gwyjjxhj in", values, "gwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGwyjjxhjNotIn(List<String> values) {
            addCriterion("gwyjjxhj not in", values, "gwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGwyjjxhjBetween(String value1, String value2) {
            addCriterion("gwyjjxhj between", value1, value2, "gwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGwyjjxhjNotBetween(String value1, String value2) {
            addCriterion("gwyjjxhj not between", value1, value2, "gwyjjxhj");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtHbjxbIsNull() {
            addCriterion("jyhdjbt_hbjxb is null");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtHbjxbIsNotNull() {
            addCriterion("jyhdjbt_hbjxb is not null");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtHbjxbEqualTo(String value) {
            addCriterion("jyhdjbt_hbjxb =", value, "jyhdjbtHbjxb");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtHbjxbNotEqualTo(String value) {
            addCriterion("jyhdjbt_hbjxb <>", value, "jyhdjbtHbjxb");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtHbjxbGreaterThan(String value) {
            addCriterion("jyhdjbt_hbjxb >", value, "jyhdjbtHbjxb");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtHbjxbGreaterThanOrEqualTo(String value) {
            addCriterion("jyhdjbt_hbjxb >=", value, "jyhdjbtHbjxb");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtHbjxbLessThan(String value) {
            addCriterion("jyhdjbt_hbjxb <", value, "jyhdjbtHbjxb");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtHbjxbLessThanOrEqualTo(String value) {
            addCriterion("jyhdjbt_hbjxb <=", value, "jyhdjbtHbjxb");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtHbjxbLike(String value) {
            addCriterion("jyhdjbt_hbjxb like", value, "jyhdjbtHbjxb");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtHbjxbNotLike(String value) {
            addCriterion("jyhdjbt_hbjxb not like", value, "jyhdjbtHbjxb");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtHbjxbIn(List<String> values) {
            addCriterion("jyhdjbt_hbjxb in", values, "jyhdjbtHbjxb");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtHbjxbNotIn(List<String> values) {
            addCriterion("jyhdjbt_hbjxb not in", values, "jyhdjbtHbjxb");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtHbjxbBetween(String value1, String value2) {
            addCriterion("jyhdjbt_hbjxb between", value1, value2, "jyhdjbtHbjxb");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtHbjxbNotBetween(String value1, String value2) {
            addCriterion("jyhdjbt_hbjxb not between", value1, value2, "jyhdjbtHbjxb");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtXytcIsNull() {
            addCriterion("jyhdjbt_xytc is null");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtXytcIsNotNull() {
            addCriterion("jyhdjbt_xytc is not null");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtXytcEqualTo(String value) {
            addCriterion("jyhdjbt_xytc =", value, "jyhdjbtXytc");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtXytcNotEqualTo(String value) {
            addCriterion("jyhdjbt_xytc <>", value, "jyhdjbtXytc");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtXytcGreaterThan(String value) {
            addCriterion("jyhdjbt_xytc >", value, "jyhdjbtXytc");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtXytcGreaterThanOrEqualTo(String value) {
            addCriterion("jyhdjbt_xytc >=", value, "jyhdjbtXytc");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtXytcLessThan(String value) {
            addCriterion("jyhdjbt_xytc <", value, "jyhdjbtXytc");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtXytcLessThanOrEqualTo(String value) {
            addCriterion("jyhdjbt_xytc <=", value, "jyhdjbtXytc");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtXytcLike(String value) {
            addCriterion("jyhdjbt_xytc like", value, "jyhdjbtXytc");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtXytcNotLike(String value) {
            addCriterion("jyhdjbt_xytc not like", value, "jyhdjbtXytc");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtXytcIn(List<String> values) {
            addCriterion("jyhdjbt_xytc in", values, "jyhdjbtXytc");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtXytcNotIn(List<String> values) {
            addCriterion("jyhdjbt_xytc not in", values, "jyhdjbtXytc");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtXytcBetween(String value1, String value2) {
            addCriterion("jyhdjbt_xytc between", value1, value2, "jyhdjbtXytc");
            return (Criteria) this;
        }

        public Criteria andJyhdjbtXytcNotBetween(String value1, String value2) {
            addCriterion("jyhdjbt_xytc not between", value1, value2, "jyhdjbtXytc");
            return (Criteria) this;
        }

        public Criteria andKyxkjsgljbtIsNull() {
            addCriterion("kyxkjsgljbt is null");
            return (Criteria) this;
        }

        public Criteria andKyxkjsgljbtIsNotNull() {
            addCriterion("kyxkjsgljbt is not null");
            return (Criteria) this;
        }

        public Criteria andKyxkjsgljbtEqualTo(String value) {
            addCriterion("kyxkjsgljbt =", value, "kyxkjsgljbt");
            return (Criteria) this;
        }

        public Criteria andKyxkjsgljbtNotEqualTo(String value) {
            addCriterion("kyxkjsgljbt <>", value, "kyxkjsgljbt");
            return (Criteria) this;
        }

        public Criteria andKyxkjsgljbtGreaterThan(String value) {
            addCriterion("kyxkjsgljbt >", value, "kyxkjsgljbt");
            return (Criteria) this;
        }

        public Criteria andKyxkjsgljbtGreaterThanOrEqualTo(String value) {
            addCriterion("kyxkjsgljbt >=", value, "kyxkjsgljbt");
            return (Criteria) this;
        }

        public Criteria andKyxkjsgljbtLessThan(String value) {
            addCriterion("kyxkjsgljbt <", value, "kyxkjsgljbt");
            return (Criteria) this;
        }

        public Criteria andKyxkjsgljbtLessThanOrEqualTo(String value) {
            addCriterion("kyxkjsgljbt <=", value, "kyxkjsgljbt");
            return (Criteria) this;
        }

        public Criteria andKyxkjsgljbtLike(String value) {
            addCriterion("kyxkjsgljbt like", value, "kyxkjsgljbt");
            return (Criteria) this;
        }

        public Criteria andKyxkjsgljbtNotLike(String value) {
            addCriterion("kyxkjsgljbt not like", value, "kyxkjsgljbt");
            return (Criteria) this;
        }

        public Criteria andKyxkjsgljbtIn(List<String> values) {
            addCriterion("kyxkjsgljbt in", values, "kyxkjsgljbt");
            return (Criteria) this;
        }

        public Criteria andKyxkjsgljbtNotIn(List<String> values) {
            addCriterion("kyxkjsgljbt not in", values, "kyxkjsgljbt");
            return (Criteria) this;
        }

        public Criteria andKyxkjsgljbtBetween(String value1, String value2) {
            addCriterion("kyxkjsgljbt between", value1, value2, "kyxkjsgljbt");
            return (Criteria) this;
        }

        public Criteria andKyxkjsgljbtNotBetween(String value1, String value2) {
            addCriterion("kyxkjsgljbt not between", value1, value2, "kyxkjsgljbt");
            return (Criteria) this;
        }

        public Criteria andJzmsjtIsNull() {
            addCriterion("jzmsjt is null");
            return (Criteria) this;
        }

        public Criteria andJzmsjtIsNotNull() {
            addCriterion("jzmsjt is not null");
            return (Criteria) this;
        }

        public Criteria andJzmsjtEqualTo(String value) {
            addCriterion("jzmsjt =", value, "jzmsjt");
            return (Criteria) this;
        }

        public Criteria andJzmsjtNotEqualTo(String value) {
            addCriterion("jzmsjt <>", value, "jzmsjt");
            return (Criteria) this;
        }

        public Criteria andJzmsjtGreaterThan(String value) {
            addCriterion("jzmsjt >", value, "jzmsjt");
            return (Criteria) this;
        }

        public Criteria andJzmsjtGreaterThanOrEqualTo(String value) {
            addCriterion("jzmsjt >=", value, "jzmsjt");
            return (Criteria) this;
        }

        public Criteria andJzmsjtLessThan(String value) {
            addCriterion("jzmsjt <", value, "jzmsjt");
            return (Criteria) this;
        }

        public Criteria andJzmsjtLessThanOrEqualTo(String value) {
            addCriterion("jzmsjt <=", value, "jzmsjt");
            return (Criteria) this;
        }

        public Criteria andJzmsjtLike(String value) {
            addCriterion("jzmsjt like", value, "jzmsjt");
            return (Criteria) this;
        }

        public Criteria andJzmsjtNotLike(String value) {
            addCriterion("jzmsjt not like", value, "jzmsjt");
            return (Criteria) this;
        }

        public Criteria andJzmsjtIn(List<String> values) {
            addCriterion("jzmsjt in", values, "jzmsjt");
            return (Criteria) this;
        }

        public Criteria andJzmsjtNotIn(List<String> values) {
            addCriterion("jzmsjt not in", values, "jzmsjt");
            return (Criteria) this;
        }

        public Criteria andJzmsjtBetween(String value1, String value2) {
            addCriterion("jzmsjt between", value1, value2, "jzmsjt");
            return (Criteria) this;
        }

        public Criteria andJzmsjtNotBetween(String value1, String value2) {
            addCriterion("jzmsjt not between", value1, value2, "jzmsjt");
            return (Criteria) this;
        }

        public Criteria andYddzjtIsNull() {
            addCriterion("yddzjt is null");
            return (Criteria) this;
        }

        public Criteria andYddzjtIsNotNull() {
            addCriterion("yddzjt is not null");
            return (Criteria) this;
        }

        public Criteria andYddzjtEqualTo(String value) {
            addCriterion("yddzjt =", value, "yddzjt");
            return (Criteria) this;
        }

        public Criteria andYddzjtNotEqualTo(String value) {
            addCriterion("yddzjt <>", value, "yddzjt");
            return (Criteria) this;
        }

        public Criteria andYddzjtGreaterThan(String value) {
            addCriterion("yddzjt >", value, "yddzjt");
            return (Criteria) this;
        }

        public Criteria andYddzjtGreaterThanOrEqualTo(String value) {
            addCriterion("yddzjt >=", value, "yddzjt");
            return (Criteria) this;
        }

        public Criteria andYddzjtLessThan(String value) {
            addCriterion("yddzjt <", value, "yddzjt");
            return (Criteria) this;
        }

        public Criteria andYddzjtLessThanOrEqualTo(String value) {
            addCriterion("yddzjt <=", value, "yddzjt");
            return (Criteria) this;
        }

        public Criteria andYddzjtLike(String value) {
            addCriterion("yddzjt like", value, "yddzjt");
            return (Criteria) this;
        }

        public Criteria andYddzjtNotLike(String value) {
            addCriterion("yddzjt not like", value, "yddzjt");
            return (Criteria) this;
        }

        public Criteria andYddzjtIn(List<String> values) {
            addCriterion("yddzjt in", values, "yddzjt");
            return (Criteria) this;
        }

        public Criteria andYddzjtNotIn(List<String> values) {
            addCriterion("yddzjt not in", values, "yddzjt");
            return (Criteria) this;
        }

        public Criteria andYddzjtBetween(String value1, String value2) {
            addCriterion("yddzjt between", value1, value2, "yddzjt");
            return (Criteria) this;
        }

        public Criteria andYddzjtNotBetween(String value1, String value2) {
            addCriterion("yddzjt not between", value1, value2, "yddzjt");
            return (Criteria) this;
        }

        public Criteria andZdqnjsgzjtIsNull() {
            addCriterion("zdqnjsgzjt is null");
            return (Criteria) this;
        }

        public Criteria andZdqnjsgzjtIsNotNull() {
            addCriterion("zdqnjsgzjt is not null");
            return (Criteria) this;
        }

        public Criteria andZdqnjsgzjtEqualTo(String value) {
            addCriterion("zdqnjsgzjt =", value, "zdqnjsgzjt");
            return (Criteria) this;
        }

        public Criteria andZdqnjsgzjtNotEqualTo(String value) {
            addCriterion("zdqnjsgzjt <>", value, "zdqnjsgzjt");
            return (Criteria) this;
        }

        public Criteria andZdqnjsgzjtGreaterThan(String value) {
            addCriterion("zdqnjsgzjt >", value, "zdqnjsgzjt");
            return (Criteria) this;
        }

        public Criteria andZdqnjsgzjtGreaterThanOrEqualTo(String value) {
            addCriterion("zdqnjsgzjt >=", value, "zdqnjsgzjt");
            return (Criteria) this;
        }

        public Criteria andZdqnjsgzjtLessThan(String value) {
            addCriterion("zdqnjsgzjt <", value, "zdqnjsgzjt");
            return (Criteria) this;
        }

        public Criteria andZdqnjsgzjtLessThanOrEqualTo(String value) {
            addCriterion("zdqnjsgzjt <=", value, "zdqnjsgzjt");
            return (Criteria) this;
        }

        public Criteria andZdqnjsgzjtLike(String value) {
            addCriterion("zdqnjsgzjt like", value, "zdqnjsgzjt");
            return (Criteria) this;
        }

        public Criteria andZdqnjsgzjtNotLike(String value) {
            addCriterion("zdqnjsgzjt not like", value, "zdqnjsgzjt");
            return (Criteria) this;
        }

        public Criteria andZdqnjsgzjtIn(List<String> values) {
            addCriterion("zdqnjsgzjt in", values, "zdqnjsgzjt");
            return (Criteria) this;
        }

        public Criteria andZdqnjsgzjtNotIn(List<String> values) {
            addCriterion("zdqnjsgzjt not in", values, "zdqnjsgzjt");
            return (Criteria) this;
        }

        public Criteria andZdqnjsgzjtBetween(String value1, String value2) {
            addCriterion("zdqnjsgzjt between", value1, value2, "zdqnjsgzjt");
            return (Criteria) this;
        }

        public Criteria andZdqnjsgzjtNotBetween(String value1, String value2) {
            addCriterion("zdqnjsgzjt not between", value1, value2, "zdqnjsgzjt");
            return (Criteria) this;
        }

        public Criteria andBkbylwyxjlIsNull() {
            addCriterion("bkbylwyxjl is null");
            return (Criteria) this;
        }

        public Criteria andBkbylwyxjlIsNotNull() {
            addCriterion("bkbylwyxjl is not null");
            return (Criteria) this;
        }

        public Criteria andBkbylwyxjlEqualTo(String value) {
            addCriterion("bkbylwyxjl =", value, "bkbylwyxjl");
            return (Criteria) this;
        }

        public Criteria andBkbylwyxjlNotEqualTo(String value) {
            addCriterion("bkbylwyxjl <>", value, "bkbylwyxjl");
            return (Criteria) this;
        }

        public Criteria andBkbylwyxjlGreaterThan(String value) {
            addCriterion("bkbylwyxjl >", value, "bkbylwyxjl");
            return (Criteria) this;
        }

        public Criteria andBkbylwyxjlGreaterThanOrEqualTo(String value) {
            addCriterion("bkbylwyxjl >=", value, "bkbylwyxjl");
            return (Criteria) this;
        }

        public Criteria andBkbylwyxjlLessThan(String value) {
            addCriterion("bkbylwyxjl <", value, "bkbylwyxjl");
            return (Criteria) this;
        }

        public Criteria andBkbylwyxjlLessThanOrEqualTo(String value) {
            addCriterion("bkbylwyxjl <=", value, "bkbylwyxjl");
            return (Criteria) this;
        }

        public Criteria andBkbylwyxjlLike(String value) {
            addCriterion("bkbylwyxjl like", value, "bkbylwyxjl");
            return (Criteria) this;
        }

        public Criteria andBkbylwyxjlNotLike(String value) {
            addCriterion("bkbylwyxjl not like", value, "bkbylwyxjl");
            return (Criteria) this;
        }

        public Criteria andBkbylwyxjlIn(List<String> values) {
            addCriterion("bkbylwyxjl in", values, "bkbylwyxjl");
            return (Criteria) this;
        }

        public Criteria andBkbylwyxjlNotIn(List<String> values) {
            addCriterion("bkbylwyxjl not in", values, "bkbylwyxjl");
            return (Criteria) this;
        }

        public Criteria andBkbylwyxjlBetween(String value1, String value2) {
            addCriterion("bkbylwyxjl between", value1, value2, "bkbylwyxjl");
            return (Criteria) this;
        }

        public Criteria andBkbylwyxjlNotBetween(String value1, String value2) {
            addCriterion("bkbylwyxjl not between", value1, value2, "bkbylwyxjl");
            return (Criteria) this;
        }

        public Criteria andBkbydbjbtIsNull() {
            addCriterion("bkbydbjbt is null");
            return (Criteria) this;
        }

        public Criteria andBkbydbjbtIsNotNull() {
            addCriterion("bkbydbjbt is not null");
            return (Criteria) this;
        }

        public Criteria andBkbydbjbtEqualTo(String value) {
            addCriterion("bkbydbjbt =", value, "bkbydbjbt");
            return (Criteria) this;
        }

        public Criteria andBkbydbjbtNotEqualTo(String value) {
            addCriterion("bkbydbjbt <>", value, "bkbydbjbt");
            return (Criteria) this;
        }

        public Criteria andBkbydbjbtGreaterThan(String value) {
            addCriterion("bkbydbjbt >", value, "bkbydbjbt");
            return (Criteria) this;
        }

        public Criteria andBkbydbjbtGreaterThanOrEqualTo(String value) {
            addCriterion("bkbydbjbt >=", value, "bkbydbjbt");
            return (Criteria) this;
        }

        public Criteria andBkbydbjbtLessThan(String value) {
            addCriterion("bkbydbjbt <", value, "bkbydbjbt");
            return (Criteria) this;
        }

        public Criteria andBkbydbjbtLessThanOrEqualTo(String value) {
            addCriterion("bkbydbjbt <=", value, "bkbydbjbt");
            return (Criteria) this;
        }

        public Criteria andBkbydbjbtLike(String value) {
            addCriterion("bkbydbjbt like", value, "bkbydbjbt");
            return (Criteria) this;
        }

        public Criteria andBkbydbjbtNotLike(String value) {
            addCriterion("bkbydbjbt not like", value, "bkbydbjbt");
            return (Criteria) this;
        }

        public Criteria andBkbydbjbtIn(List<String> values) {
            addCriterion("bkbydbjbt in", values, "bkbydbjbt");
            return (Criteria) this;
        }

        public Criteria andBkbydbjbtNotIn(List<String> values) {
            addCriterion("bkbydbjbt not in", values, "bkbydbjbt");
            return (Criteria) this;
        }

        public Criteria andBkbydbjbtBetween(String value1, String value2) {
            addCriterion("bkbydbjbt between", value1, value2, "bkbydbjbt");
            return (Criteria) this;
        }

        public Criteria andBkbydbjbtNotBetween(String value1, String value2) {
            addCriterion("bkbydbjbt not between", value1, value2, "bkbydbjbt");
            return (Criteria) this;
        }

        public Criteria andZrjsgzxjxhjIsNull() {
            addCriterion("zrjsgzxjxhj is null");
            return (Criteria) this;
        }

        public Criteria andZrjsgzxjxhjIsNotNull() {
            addCriterion("zrjsgzxjxhj is not null");
            return (Criteria) this;
        }

        public Criteria andZrjsgzxjxhjEqualTo(String value) {
            addCriterion("zrjsgzxjxhj =", value, "zrjsgzxjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsgzxjxhjNotEqualTo(String value) {
            addCriterion("zrjsgzxjxhj <>", value, "zrjsgzxjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsgzxjxhjGreaterThan(String value) {
            addCriterion("zrjsgzxjxhj >", value, "zrjsgzxjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsgzxjxhjGreaterThanOrEqualTo(String value) {
            addCriterion("zrjsgzxjxhj >=", value, "zrjsgzxjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsgzxjxhjLessThan(String value) {
            addCriterion("zrjsgzxjxhj <", value, "zrjsgzxjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsgzxjxhjLessThanOrEqualTo(String value) {
            addCriterion("zrjsgzxjxhj <=", value, "zrjsgzxjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsgzxjxhjLike(String value) {
            addCriterion("zrjsgzxjxhj like", value, "zrjsgzxjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsgzxjxhjNotLike(String value) {
            addCriterion("zrjsgzxjxhj not like", value, "zrjsgzxjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsgzxjxhjIn(List<String> values) {
            addCriterion("zrjsgzxjxhj in", values, "zrjsgzxjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsgzxjxhjNotIn(List<String> values) {
            addCriterion("zrjsgzxjxhj not in", values, "zrjsgzxjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsgzxjxhjBetween(String value1, String value2) {
            addCriterion("zrjsgzxjxhj between", value1, value2, "zrjsgzxjxhj");
            return (Criteria) this;
        }

        public Criteria andZrjsgzxjxhjNotBetween(String value1, String value2) {
            addCriterion("zrjsgzxjxhj not between", value1, value2, "zrjsgzxjxhj");
            return (Criteria) this;
        }

        public Criteria andJxjyhdjbtIsNull() {
            addCriterion("jxjyhdjbt is null");
            return (Criteria) this;
        }

        public Criteria andJxjyhdjbtIsNotNull() {
            addCriterion("jxjyhdjbt is not null");
            return (Criteria) this;
        }

        public Criteria andJxjyhdjbtEqualTo(String value) {
            addCriterion("jxjyhdjbt =", value, "jxjyhdjbt");
            return (Criteria) this;
        }

        public Criteria andJxjyhdjbtNotEqualTo(String value) {
            addCriterion("jxjyhdjbt <>", value, "jxjyhdjbt");
            return (Criteria) this;
        }

        public Criteria andJxjyhdjbtGreaterThan(String value) {
            addCriterion("jxjyhdjbt >", value, "jxjyhdjbt");
            return (Criteria) this;
        }

        public Criteria andJxjyhdjbtGreaterThanOrEqualTo(String value) {
            addCriterion("jxjyhdjbt >=", value, "jxjyhdjbt");
            return (Criteria) this;
        }

        public Criteria andJxjyhdjbtLessThan(String value) {
            addCriterion("jxjyhdjbt <", value, "jxjyhdjbt");
            return (Criteria) this;
        }

        public Criteria andJxjyhdjbtLessThanOrEqualTo(String value) {
            addCriterion("jxjyhdjbt <=", value, "jxjyhdjbt");
            return (Criteria) this;
        }

        public Criteria andJxjyhdjbtLike(String value) {
            addCriterion("jxjyhdjbt like", value, "jxjyhdjbt");
            return (Criteria) this;
        }

        public Criteria andJxjyhdjbtNotLike(String value) {
            addCriterion("jxjyhdjbt not like", value, "jxjyhdjbt");
            return (Criteria) this;
        }

        public Criteria andJxjyhdjbtIn(List<String> values) {
            addCriterion("jxjyhdjbt in", values, "jxjyhdjbt");
            return (Criteria) this;
        }

        public Criteria andJxjyhdjbtNotIn(List<String> values) {
            addCriterion("jxjyhdjbt not in", values, "jxjyhdjbt");
            return (Criteria) this;
        }

        public Criteria andJxjyhdjbtBetween(String value1, String value2) {
            addCriterion("jxjyhdjbt between", value1, value2, "jxjyhdjbt");
            return (Criteria) this;
        }

        public Criteria andJxjyhdjbtNotBetween(String value1, String value2) {
            addCriterion("jxjyhdjbt not between", value1, value2, "jxjyhdjbt");
            return (Criteria) this;
        }

        public Criteria andFdygzxjxhjIsNull() {
            addCriterion("fdygzxjxhj is null");
            return (Criteria) this;
        }

        public Criteria andFdygzxjxhjIsNotNull() {
            addCriterion("fdygzxjxhj is not null");
            return (Criteria) this;
        }

        public Criteria andFdygzxjxhjEqualTo(String value) {
            addCriterion("fdygzxjxhj =", value, "fdygzxjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzxjxhjNotEqualTo(String value) {
            addCriterion("fdygzxjxhj <>", value, "fdygzxjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzxjxhjGreaterThan(String value) {
            addCriterion("fdygzxjxhj >", value, "fdygzxjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzxjxhjGreaterThanOrEqualTo(String value) {
            addCriterion("fdygzxjxhj >=", value, "fdygzxjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzxjxhjLessThan(String value) {
            addCriterion("fdygzxjxhj <", value, "fdygzxjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzxjxhjLessThanOrEqualTo(String value) {
            addCriterion("fdygzxjxhj <=", value, "fdygzxjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzxjxhjLike(String value) {
            addCriterion("fdygzxjxhj like", value, "fdygzxjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzxjxhjNotLike(String value) {
            addCriterion("fdygzxjxhj not like", value, "fdygzxjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzxjxhjIn(List<String> values) {
            addCriterion("fdygzxjxhj in", values, "fdygzxjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzxjxhjNotIn(List<String> values) {
            addCriterion("fdygzxjxhj not in", values, "fdygzxjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzxjxhjBetween(String value1, String value2) {
            addCriterion("fdygzxjxhj between", value1, value2, "fdygzxjxhj");
            return (Criteria) this;
        }

        public Criteria andFdygzxjxhjNotBetween(String value1, String value2) {
            addCriterion("fdygzxjxhj not between", value1, value2, "fdygzxjxhj");
            return (Criteria) this;
        }

        public Criteria andZxyjjxhjIsNull() {
            addCriterion("zxyjjxhj is null");
            return (Criteria) this;
        }

        public Criteria andZxyjjxhjIsNotNull() {
            addCriterion("zxyjjxhj is not null");
            return (Criteria) this;
        }

        public Criteria andZxyjjxhjEqualTo(String value) {
            addCriterion("zxyjjxhj =", value, "zxyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZxyjjxhjNotEqualTo(String value) {
            addCriterion("zxyjjxhj <>", value, "zxyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZxyjjxhjGreaterThan(String value) {
            addCriterion("zxyjjxhj >", value, "zxyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZxyjjxhjGreaterThanOrEqualTo(String value) {
            addCriterion("zxyjjxhj >=", value, "zxyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZxyjjxhjLessThan(String value) {
            addCriterion("zxyjjxhj <", value, "zxyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZxyjjxhjLessThanOrEqualTo(String value) {
            addCriterion("zxyjjxhj <=", value, "zxyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZxyjjxhjLike(String value) {
            addCriterion("zxyjjxhj like", value, "zxyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZxyjjxhjNotLike(String value) {
            addCriterion("zxyjjxhj not like", value, "zxyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZxyjjxhjIn(List<String> values) {
            addCriterion("zxyjjxhj in", values, "zxyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZxyjjxhjNotIn(List<String> values) {
            addCriterion("zxyjjxhj not in", values, "zxyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZxyjjxhjBetween(String value1, String value2) {
            addCriterion("zxyjjxhj between", value1, value2, "zxyjjxhj");
            return (Criteria) this;
        }

        public Criteria andZxyjjxhjNotBetween(String value1, String value2) {
            addCriterion("zxyjjxhj not between", value1, value2, "zxyjjxhj");
            return (Criteria) this;
        }

        public Criteria andGzjtIsNull() {
            addCriterion("gzjt is null");
            return (Criteria) this;
        }

        public Criteria andGzjtIsNotNull() {
            addCriterion("gzjt is not null");
            return (Criteria) this;
        }

        public Criteria andGzjtEqualTo(String value) {
            addCriterion("gzjt =", value, "gzjt");
            return (Criteria) this;
        }

        public Criteria andGzjtNotEqualTo(String value) {
            addCriterion("gzjt <>", value, "gzjt");
            return (Criteria) this;
        }

        public Criteria andGzjtGreaterThan(String value) {
            addCriterion("gzjt >", value, "gzjt");
            return (Criteria) this;
        }

        public Criteria andGzjtGreaterThanOrEqualTo(String value) {
            addCriterion("gzjt >=", value, "gzjt");
            return (Criteria) this;
        }

        public Criteria andGzjtLessThan(String value) {
            addCriterion("gzjt <", value, "gzjt");
            return (Criteria) this;
        }

        public Criteria andGzjtLessThanOrEqualTo(String value) {
            addCriterion("gzjt <=", value, "gzjt");
            return (Criteria) this;
        }

        public Criteria andGzjtLike(String value) {
            addCriterion("gzjt like", value, "gzjt");
            return (Criteria) this;
        }

        public Criteria andGzjtNotLike(String value) {
            addCriterion("gzjt not like", value, "gzjt");
            return (Criteria) this;
        }

        public Criteria andGzjtIn(List<String> values) {
            addCriterion("gzjt in", values, "gzjt");
            return (Criteria) this;
        }

        public Criteria andGzjtNotIn(List<String> values) {
            addCriterion("gzjt not in", values, "gzjt");
            return (Criteria) this;
        }

        public Criteria andGzjtBetween(String value1, String value2) {
            addCriterion("gzjt between", value1, value2, "gzjt");
            return (Criteria) this;
        }

        public Criteria andGzjtNotBetween(String value1, String value2) {
            addCriterion("gzjt not between", value1, value2, "gzjt");
            return (Criteria) this;
        }

        public Criteria andNdkhyjyxIsNull() {
            addCriterion("ndkhyjyx is null");
            return (Criteria) this;
        }

        public Criteria andNdkhyjyxIsNotNull() {
            addCriterion("ndkhyjyx is not null");
            return (Criteria) this;
        }

        public Criteria andNdkhyjyxEqualTo(String value) {
            addCriterion("ndkhyjyx =", value, "ndkhyjyx");
            return (Criteria) this;
        }

        public Criteria andNdkhyjyxNotEqualTo(String value) {
            addCriterion("ndkhyjyx <>", value, "ndkhyjyx");
            return (Criteria) this;
        }

        public Criteria andNdkhyjyxGreaterThan(String value) {
            addCriterion("ndkhyjyx >", value, "ndkhyjyx");
            return (Criteria) this;
        }

        public Criteria andNdkhyjyxGreaterThanOrEqualTo(String value) {
            addCriterion("ndkhyjyx >=", value, "ndkhyjyx");
            return (Criteria) this;
        }

        public Criteria andNdkhyjyxLessThan(String value) {
            addCriterion("ndkhyjyx <", value, "ndkhyjyx");
            return (Criteria) this;
        }

        public Criteria andNdkhyjyxLessThanOrEqualTo(String value) {
            addCriterion("ndkhyjyx <=", value, "ndkhyjyx");
            return (Criteria) this;
        }

        public Criteria andNdkhyjyxLike(String value) {
            addCriterion("ndkhyjyx like", value, "ndkhyjyx");
            return (Criteria) this;
        }

        public Criteria andNdkhyjyxNotLike(String value) {
            addCriterion("ndkhyjyx not like", value, "ndkhyjyx");
            return (Criteria) this;
        }

        public Criteria andNdkhyjyxIn(List<String> values) {
            addCriterion("ndkhyjyx in", values, "ndkhyjyx");
            return (Criteria) this;
        }

        public Criteria andNdkhyjyxNotIn(List<String> values) {
            addCriterion("ndkhyjyx not in", values, "ndkhyjyx");
            return (Criteria) this;
        }

        public Criteria andNdkhyjyxBetween(String value1, String value2) {
            addCriterion("ndkhyjyx between", value1, value2, "ndkhyjyx");
            return (Criteria) this;
        }

        public Criteria andNdkhyjyxNotBetween(String value1, String value2) {
            addCriterion("ndkhyjyx not between", value1, value2, "ndkhyjyx");
            return (Criteria) this;
        }

        public Criteria andBdsjtIsNull() {
            addCriterion("bdsjt is null");
            return (Criteria) this;
        }

        public Criteria andBdsjtIsNotNull() {
            addCriterion("bdsjt is not null");
            return (Criteria) this;
        }

        public Criteria andBdsjtEqualTo(String value) {
            addCriterion("bdsjt =", value, "bdsjt");
            return (Criteria) this;
        }

        public Criteria andBdsjtNotEqualTo(String value) {
            addCriterion("bdsjt <>", value, "bdsjt");
            return (Criteria) this;
        }

        public Criteria andBdsjtGreaterThan(String value) {
            addCriterion("bdsjt >", value, "bdsjt");
            return (Criteria) this;
        }

        public Criteria andBdsjtGreaterThanOrEqualTo(String value) {
            addCriterion("bdsjt >=", value, "bdsjt");
            return (Criteria) this;
        }

        public Criteria andBdsjtLessThan(String value) {
            addCriterion("bdsjt <", value, "bdsjt");
            return (Criteria) this;
        }

        public Criteria andBdsjtLessThanOrEqualTo(String value) {
            addCriterion("bdsjt <=", value, "bdsjt");
            return (Criteria) this;
        }

        public Criteria andBdsjtLike(String value) {
            addCriterion("bdsjt like", value, "bdsjt");
            return (Criteria) this;
        }

        public Criteria andBdsjtNotLike(String value) {
            addCriterion("bdsjt not like", value, "bdsjt");
            return (Criteria) this;
        }

        public Criteria andBdsjtIn(List<String> values) {
            addCriterion("bdsjt in", values, "bdsjt");
            return (Criteria) this;
        }

        public Criteria andBdsjtNotIn(List<String> values) {
            addCriterion("bdsjt not in", values, "bdsjt");
            return (Criteria) this;
        }

        public Criteria andBdsjtBetween(String value1, String value2) {
            addCriterion("bdsjt between", value1, value2, "bdsjt");
            return (Criteria) this;
        }

        public Criteria andBdsjtNotBetween(String value1, String value2) {
            addCriterion("bdsjt not between", value1, value2, "bdsjt");
            return (Criteria) this;
        }

        public Criteria andBkzsxcjtIsNull() {
            addCriterion("bkzsxcjt is null");
            return (Criteria) this;
        }

        public Criteria andBkzsxcjtIsNotNull() {
            addCriterion("bkzsxcjt is not null");
            return (Criteria) this;
        }

        public Criteria andBkzsxcjtEqualTo(String value) {
            addCriterion("bkzsxcjt =", value, "bkzsxcjt");
            return (Criteria) this;
        }

        public Criteria andBkzsxcjtNotEqualTo(String value) {
            addCriterion("bkzsxcjt <>", value, "bkzsxcjt");
            return (Criteria) this;
        }

        public Criteria andBkzsxcjtGreaterThan(String value) {
            addCriterion("bkzsxcjt >", value, "bkzsxcjt");
            return (Criteria) this;
        }

        public Criteria andBkzsxcjtGreaterThanOrEqualTo(String value) {
            addCriterion("bkzsxcjt >=", value, "bkzsxcjt");
            return (Criteria) this;
        }

        public Criteria andBkzsxcjtLessThan(String value) {
            addCriterion("bkzsxcjt <", value, "bkzsxcjt");
            return (Criteria) this;
        }

        public Criteria andBkzsxcjtLessThanOrEqualTo(String value) {
            addCriterion("bkzsxcjt <=", value, "bkzsxcjt");
            return (Criteria) this;
        }

        public Criteria andBkzsxcjtLike(String value) {
            addCriterion("bkzsxcjt like", value, "bkzsxcjt");
            return (Criteria) this;
        }

        public Criteria andBkzsxcjtNotLike(String value) {
            addCriterion("bkzsxcjt not like", value, "bkzsxcjt");
            return (Criteria) this;
        }

        public Criteria andBkzsxcjtIn(List<String> values) {
            addCriterion("bkzsxcjt in", values, "bkzsxcjt");
            return (Criteria) this;
        }

        public Criteria andBkzsxcjtNotIn(List<String> values) {
            addCriterion("bkzsxcjt not in", values, "bkzsxcjt");
            return (Criteria) this;
        }

        public Criteria andBkzsxcjtBetween(String value1, String value2) {
            addCriterion("bkzsxcjt between", value1, value2, "bkzsxcjt");
            return (Criteria) this;
        }

        public Criteria andBkzsxcjtNotBetween(String value1, String value2) {
            addCriterion("bkzsxcjt not between", value1, value2, "bkzsxcjt");
            return (Criteria) this;
        }

        public Criteria andDjxsgzjbtIsNull() {
            addCriterion("djxsgzjbt is null");
            return (Criteria) this;
        }

        public Criteria andDjxsgzjbtIsNotNull() {
            addCriterion("djxsgzjbt is not null");
            return (Criteria) this;
        }

        public Criteria andDjxsgzjbtEqualTo(String value) {
            addCriterion("djxsgzjbt =", value, "djxsgzjbt");
            return (Criteria) this;
        }

        public Criteria andDjxsgzjbtNotEqualTo(String value) {
            addCriterion("djxsgzjbt <>", value, "djxsgzjbt");
            return (Criteria) this;
        }

        public Criteria andDjxsgzjbtGreaterThan(String value) {
            addCriterion("djxsgzjbt >", value, "djxsgzjbt");
            return (Criteria) this;
        }

        public Criteria andDjxsgzjbtGreaterThanOrEqualTo(String value) {
            addCriterion("djxsgzjbt >=", value, "djxsgzjbt");
            return (Criteria) this;
        }

        public Criteria andDjxsgzjbtLessThan(String value) {
            addCriterion("djxsgzjbt <", value, "djxsgzjbt");
            return (Criteria) this;
        }

        public Criteria andDjxsgzjbtLessThanOrEqualTo(String value) {
            addCriterion("djxsgzjbt <=", value, "djxsgzjbt");
            return (Criteria) this;
        }

        public Criteria andDjxsgzjbtLike(String value) {
            addCriterion("djxsgzjbt like", value, "djxsgzjbt");
            return (Criteria) this;
        }

        public Criteria andDjxsgzjbtNotLike(String value) {
            addCriterion("djxsgzjbt not like", value, "djxsgzjbt");
            return (Criteria) this;
        }

        public Criteria andDjxsgzjbtIn(List<String> values) {
            addCriterion("djxsgzjbt in", values, "djxsgzjbt");
            return (Criteria) this;
        }

        public Criteria andDjxsgzjbtNotIn(List<String> values) {
            addCriterion("djxsgzjbt not in", values, "djxsgzjbt");
            return (Criteria) this;
        }

        public Criteria andDjxsgzjbtBetween(String value1, String value2) {
            addCriterion("djxsgzjbt between", value1, value2, "djxsgzjbt");
            return (Criteria) this;
        }

        public Criteria andDjxsgzjbtNotBetween(String value1, String value2) {
            addCriterion("djxsgzjbt not between", value1, value2, "djxsgzjbt");
            return (Criteria) this;
        }

        public Criteria andSgwyhgzjbtIsNull() {
            addCriterion("sgwyhgzjbt is null");
            return (Criteria) this;
        }

        public Criteria andSgwyhgzjbtIsNotNull() {
            addCriterion("sgwyhgzjbt is not null");
            return (Criteria) this;
        }

        public Criteria andSgwyhgzjbtEqualTo(String value) {
            addCriterion("sgwyhgzjbt =", value, "sgwyhgzjbt");
            return (Criteria) this;
        }

        public Criteria andSgwyhgzjbtNotEqualTo(String value) {
            addCriterion("sgwyhgzjbt <>", value, "sgwyhgzjbt");
            return (Criteria) this;
        }

        public Criteria andSgwyhgzjbtGreaterThan(String value) {
            addCriterion("sgwyhgzjbt >", value, "sgwyhgzjbt");
            return (Criteria) this;
        }

        public Criteria andSgwyhgzjbtGreaterThanOrEqualTo(String value) {
            addCriterion("sgwyhgzjbt >=", value, "sgwyhgzjbt");
            return (Criteria) this;
        }

        public Criteria andSgwyhgzjbtLessThan(String value) {
            addCriterion("sgwyhgzjbt <", value, "sgwyhgzjbt");
            return (Criteria) this;
        }

        public Criteria andSgwyhgzjbtLessThanOrEqualTo(String value) {
            addCriterion("sgwyhgzjbt <=", value, "sgwyhgzjbt");
            return (Criteria) this;
        }

        public Criteria andSgwyhgzjbtLike(String value) {
            addCriterion("sgwyhgzjbt like", value, "sgwyhgzjbt");
            return (Criteria) this;
        }

        public Criteria andSgwyhgzjbtNotLike(String value) {
            addCriterion("sgwyhgzjbt not like", value, "sgwyhgzjbt");
            return (Criteria) this;
        }

        public Criteria andSgwyhgzjbtIn(List<String> values) {
            addCriterion("sgwyhgzjbt in", values, "sgwyhgzjbt");
            return (Criteria) this;
        }

        public Criteria andSgwyhgzjbtNotIn(List<String> values) {
            addCriterion("sgwyhgzjbt not in", values, "sgwyhgzjbt");
            return (Criteria) this;
        }

        public Criteria andSgwyhgzjbtBetween(String value1, String value2) {
            addCriterion("sgwyhgzjbt between", value1, value2, "sgwyhgzjbt");
            return (Criteria) this;
        }

        public Criteria andSgwyhgzjbtNotBetween(String value1, String value2) {
            addCriterion("sgwyhgzjbt not between", value1, value2, "sgwyhgzjbt");
            return (Criteria) this;
        }

        public Criteria andQtlsxtfxzzxgzjbtIsNull() {
            addCriterion("qtlsxtfxzzxgzjbt is null");
            return (Criteria) this;
        }

        public Criteria andQtlsxtfxzzxgzjbtIsNotNull() {
            addCriterion("qtlsxtfxzzxgzjbt is not null");
            return (Criteria) this;
        }

        public Criteria andQtlsxtfxzzxgzjbtEqualTo(String value) {
            addCriterion("qtlsxtfxzzxgzjbt =", value, "qtlsxtfxzzxgzjbt");
            return (Criteria) this;
        }

        public Criteria andQtlsxtfxzzxgzjbtNotEqualTo(String value) {
            addCriterion("qtlsxtfxzzxgzjbt <>", value, "qtlsxtfxzzxgzjbt");
            return (Criteria) this;
        }

        public Criteria andQtlsxtfxzzxgzjbtGreaterThan(String value) {
            addCriterion("qtlsxtfxzzxgzjbt >", value, "qtlsxtfxzzxgzjbt");
            return (Criteria) this;
        }

        public Criteria andQtlsxtfxzzxgzjbtGreaterThanOrEqualTo(String value) {
            addCriterion("qtlsxtfxzzxgzjbt >=", value, "qtlsxtfxzzxgzjbt");
            return (Criteria) this;
        }

        public Criteria andQtlsxtfxzzxgzjbtLessThan(String value) {
            addCriterion("qtlsxtfxzzxgzjbt <", value, "qtlsxtfxzzxgzjbt");
            return (Criteria) this;
        }

        public Criteria andQtlsxtfxzzxgzjbtLessThanOrEqualTo(String value) {
            addCriterion("qtlsxtfxzzxgzjbt <=", value, "qtlsxtfxzzxgzjbt");
            return (Criteria) this;
        }

        public Criteria andQtlsxtfxzzxgzjbtLike(String value) {
            addCriterion("qtlsxtfxzzxgzjbt like", value, "qtlsxtfxzzxgzjbt");
            return (Criteria) this;
        }

        public Criteria andQtlsxtfxzzxgzjbtNotLike(String value) {
            addCriterion("qtlsxtfxzzxgzjbt not like", value, "qtlsxtfxzzxgzjbt");
            return (Criteria) this;
        }

        public Criteria andQtlsxtfxzzxgzjbtIn(List<String> values) {
            addCriterion("qtlsxtfxzzxgzjbt in", values, "qtlsxtfxzzxgzjbt");
            return (Criteria) this;
        }

        public Criteria andQtlsxtfxzzxgzjbtNotIn(List<String> values) {
            addCriterion("qtlsxtfxzzxgzjbt not in", values, "qtlsxtfxzzxgzjbt");
            return (Criteria) this;
        }

        public Criteria andQtlsxtfxzzxgzjbtBetween(String value1, String value2) {
            addCriterion("qtlsxtfxzzxgzjbt between", value1, value2, "qtlsxtfxzzxgzjbt");
            return (Criteria) this;
        }

        public Criteria andQtlsxtfxzzxgzjbtNotBetween(String value1, String value2) {
            addCriterion("qtlsxtfxzzxgzjbt not between", value1, value2, "qtlsxtfxzzxgzjbt");
            return (Criteria) this;
        }

        public Criteria andJdjfhjIsNull() {
            addCriterion("jdjfhj is null");
            return (Criteria) this;
        }

        public Criteria andJdjfhjIsNotNull() {
            addCriterion("jdjfhj is not null");
            return (Criteria) this;
        }

        public Criteria andJdjfhjEqualTo(String value) {
            addCriterion("jdjfhj =", value, "jdjfhj");
            return (Criteria) this;
        }

        public Criteria andJdjfhjNotEqualTo(String value) {
            addCriterion("jdjfhj <>", value, "jdjfhj");
            return (Criteria) this;
        }

        public Criteria andJdjfhjGreaterThan(String value) {
            addCriterion("jdjfhj >", value, "jdjfhj");
            return (Criteria) this;
        }

        public Criteria andJdjfhjGreaterThanOrEqualTo(String value) {
            addCriterion("jdjfhj >=", value, "jdjfhj");
            return (Criteria) this;
        }

        public Criteria andJdjfhjLessThan(String value) {
            addCriterion("jdjfhj <", value, "jdjfhj");
            return (Criteria) this;
        }

        public Criteria andJdjfhjLessThanOrEqualTo(String value) {
            addCriterion("jdjfhj <=", value, "jdjfhj");
            return (Criteria) this;
        }

        public Criteria andJdjfhjLike(String value) {
            addCriterion("jdjfhj like", value, "jdjfhj");
            return (Criteria) this;
        }

        public Criteria andJdjfhjNotLike(String value) {
            addCriterion("jdjfhj not like", value, "jdjfhj");
            return (Criteria) this;
        }

        public Criteria andJdjfhjIn(List<String> values) {
            addCriterion("jdjfhj in", values, "jdjfhj");
            return (Criteria) this;
        }

        public Criteria andJdjfhjNotIn(List<String> values) {
            addCriterion("jdjfhj not in", values, "jdjfhj");
            return (Criteria) this;
        }

        public Criteria andJdjfhjBetween(String value1, String value2) {
            addCriterion("jdjfhj between", value1, value2, "jdjfhj");
            return (Criteria) this;
        }

        public Criteria andJdjfhjNotBetween(String value1, String value2) {
            addCriterion("jdjfhj not between", value1, value2, "jdjfhj");
            return (Criteria) this;
        }

        public Criteria andGrndkhyxjlIsNull() {
            addCriterion("grndkhyxjl is null");
            return (Criteria) this;
        }

        public Criteria andGrndkhyxjlIsNotNull() {
            addCriterion("grndkhyxjl is not null");
            return (Criteria) this;
        }

        public Criteria andGrndkhyxjlEqualTo(String value) {
            addCriterion("grndkhyxjl =", value, "grndkhyxjl");
            return (Criteria) this;
        }

        public Criteria andGrndkhyxjlNotEqualTo(String value) {
            addCriterion("grndkhyxjl <>", value, "grndkhyxjl");
            return (Criteria) this;
        }

        public Criteria andGrndkhyxjlGreaterThan(String value) {
            addCriterion("grndkhyxjl >", value, "grndkhyxjl");
            return (Criteria) this;
        }

        public Criteria andGrndkhyxjlGreaterThanOrEqualTo(String value) {
            addCriterion("grndkhyxjl >=", value, "grndkhyxjl");
            return (Criteria) this;
        }

        public Criteria andGrndkhyxjlLessThan(String value) {
            addCriterion("grndkhyxjl <", value, "grndkhyxjl");
            return (Criteria) this;
        }

        public Criteria andGrndkhyxjlLessThanOrEqualTo(String value) {
            addCriterion("grndkhyxjl <=", value, "grndkhyxjl");
            return (Criteria) this;
        }

        public Criteria andGrndkhyxjlLike(String value) {
            addCriterion("grndkhyxjl like", value, "grndkhyxjl");
            return (Criteria) this;
        }

        public Criteria andGrndkhyxjlNotLike(String value) {
            addCriterion("grndkhyxjl not like", value, "grndkhyxjl");
            return (Criteria) this;
        }

        public Criteria andGrndkhyxjlIn(List<String> values) {
            addCriterion("grndkhyxjl in", values, "grndkhyxjl");
            return (Criteria) this;
        }

        public Criteria andGrndkhyxjlNotIn(List<String> values) {
            addCriterion("grndkhyxjl not in", values, "grndkhyxjl");
            return (Criteria) this;
        }

        public Criteria andGrndkhyxjlBetween(String value1, String value2) {
            addCriterion("grndkhyxjl between", value1, value2, "grndkhyxjl");
            return (Criteria) this;
        }

        public Criteria andGrndkhyxjlNotBetween(String value1, String value2) {
            addCriterion("grndkhyxjl not between", value1, value2, "grndkhyxjl");
            return (Criteria) this;
        }

        public Criteria andXyndkhjlIsNull() {
            addCriterion("xyndkhjl is null");
            return (Criteria) this;
        }

        public Criteria andXyndkhjlIsNotNull() {
            addCriterion("xyndkhjl is not null");
            return (Criteria) this;
        }

        public Criteria andXyndkhjlEqualTo(String value) {
            addCriterion("xyndkhjl =", value, "xyndkhjl");
            return (Criteria) this;
        }

        public Criteria andXyndkhjlNotEqualTo(String value) {
            addCriterion("xyndkhjl <>", value, "xyndkhjl");
            return (Criteria) this;
        }

        public Criteria andXyndkhjlGreaterThan(String value) {
            addCriterion("xyndkhjl >", value, "xyndkhjl");
            return (Criteria) this;
        }

        public Criteria andXyndkhjlGreaterThanOrEqualTo(String value) {
            addCriterion("xyndkhjl >=", value, "xyndkhjl");
            return (Criteria) this;
        }

        public Criteria andXyndkhjlLessThan(String value) {
            addCriterion("xyndkhjl <", value, "xyndkhjl");
            return (Criteria) this;
        }

        public Criteria andXyndkhjlLessThanOrEqualTo(String value) {
            addCriterion("xyndkhjl <=", value, "xyndkhjl");
            return (Criteria) this;
        }

        public Criteria andXyndkhjlLike(String value) {
            addCriterion("xyndkhjl like", value, "xyndkhjl");
            return (Criteria) this;
        }

        public Criteria andXyndkhjlNotLike(String value) {
            addCriterion("xyndkhjl not like", value, "xyndkhjl");
            return (Criteria) this;
        }

        public Criteria andXyndkhjlIn(List<String> values) {
            addCriterion("xyndkhjl in", values, "xyndkhjl");
            return (Criteria) this;
        }

        public Criteria andXyndkhjlNotIn(List<String> values) {
            addCriterion("xyndkhjl not in", values, "xyndkhjl");
            return (Criteria) this;
        }

        public Criteria andXyndkhjlBetween(String value1, String value2) {
            addCriterion("xyndkhjl between", value1, value2, "xyndkhjl");
            return (Criteria) this;
        }

        public Criteria andXyndkhjlNotBetween(String value1, String value2) {
            addCriterion("xyndkhjl not between", value1, value2, "xyndkhjl");
            return (Criteria) this;
        }

        public Criteria andPyjlbthjIsNull() {
            addCriterion("pyjlbthj is null");
            return (Criteria) this;
        }

        public Criteria andPyjlbthjIsNotNull() {
            addCriterion("pyjlbthj is not null");
            return (Criteria) this;
        }

        public Criteria andPyjlbthjEqualTo(String value) {
            addCriterion("pyjlbthj =", value, "pyjlbthj");
            return (Criteria) this;
        }

        public Criteria andPyjlbthjNotEqualTo(String value) {
            addCriterion("pyjlbthj <>", value, "pyjlbthj");
            return (Criteria) this;
        }

        public Criteria andPyjlbthjGreaterThan(String value) {
            addCriterion("pyjlbthj >", value, "pyjlbthj");
            return (Criteria) this;
        }

        public Criteria andPyjlbthjGreaterThanOrEqualTo(String value) {
            addCriterion("pyjlbthj >=", value, "pyjlbthj");
            return (Criteria) this;
        }

        public Criteria andPyjlbthjLessThan(String value) {
            addCriterion("pyjlbthj <", value, "pyjlbthj");
            return (Criteria) this;
        }

        public Criteria andPyjlbthjLessThanOrEqualTo(String value) {
            addCriterion("pyjlbthj <=", value, "pyjlbthj");
            return (Criteria) this;
        }

        public Criteria andPyjlbthjLike(String value) {
            addCriterion("pyjlbthj like", value, "pyjlbthj");
            return (Criteria) this;
        }

        public Criteria andPyjlbthjNotLike(String value) {
            addCriterion("pyjlbthj not like", value, "pyjlbthj");
            return (Criteria) this;
        }

        public Criteria andPyjlbthjIn(List<String> values) {
            addCriterion("pyjlbthj in", values, "pyjlbthj");
            return (Criteria) this;
        }

        public Criteria andPyjlbthjNotIn(List<String> values) {
            addCriterion("pyjlbthj not in", values, "pyjlbthj");
            return (Criteria) this;
        }

        public Criteria andPyjlbthjBetween(String value1, String value2) {
            addCriterion("pyjlbthj between", value1, value2, "pyjlbthj");
            return (Criteria) this;
        }

        public Criteria andPyjlbthjNotBetween(String value1, String value2) {
            addCriterion("pyjlbthj not between", value1, value2, "pyjlbthj");
            return (Criteria) this;
        }

        public Criteria andPxjxxjyfIsNull() {
            addCriterion("pxjxxjyf is null");
            return (Criteria) this;
        }

        public Criteria andPxjxxjyfIsNotNull() {
            addCriterion("pxjxxjyf is not null");
            return (Criteria) this;
        }

        public Criteria andPxjxxjyfEqualTo(String value) {
            addCriterion("pxjxxjyf =", value, "pxjxxjyf");
            return (Criteria) this;
        }

        public Criteria andPxjxxjyfNotEqualTo(String value) {
            addCriterion("pxjxxjyf <>", value, "pxjxxjyf");
            return (Criteria) this;
        }

        public Criteria andPxjxxjyfGreaterThan(String value) {
            addCriterion("pxjxxjyf >", value, "pxjxxjyf");
            return (Criteria) this;
        }

        public Criteria andPxjxxjyfGreaterThanOrEqualTo(String value) {
            addCriterion("pxjxxjyf >=", value, "pxjxxjyf");
            return (Criteria) this;
        }

        public Criteria andPxjxxjyfLessThan(String value) {
            addCriterion("pxjxxjyf <", value, "pxjxxjyf");
            return (Criteria) this;
        }

        public Criteria andPxjxxjyfLessThanOrEqualTo(String value) {
            addCriterion("pxjxxjyf <=", value, "pxjxxjyf");
            return (Criteria) this;
        }

        public Criteria andPxjxxjyfLike(String value) {
            addCriterion("pxjxxjyf like", value, "pxjxxjyf");
            return (Criteria) this;
        }

        public Criteria andPxjxxjyfNotLike(String value) {
            addCriterion("pxjxxjyf not like", value, "pxjxxjyf");
            return (Criteria) this;
        }

        public Criteria andPxjxxjyfIn(List<String> values) {
            addCriterion("pxjxxjyf in", values, "pxjxxjyf");
            return (Criteria) this;
        }

        public Criteria andPxjxxjyfNotIn(List<String> values) {
            addCriterion("pxjxxjyf not in", values, "pxjxxjyf");
            return (Criteria) this;
        }

        public Criteria andPxjxxjyfBetween(String value1, String value2) {
            addCriterion("pxjxxjyf between", value1, value2, "pxjxxjyf");
            return (Criteria) this;
        }

        public Criteria andPxjxxjyfNotBetween(String value1, String value2) {
            addCriterion("pxjxxjyf not between", value1, value2, "pxjxxjyf");
            return (Criteria) this;
        }

        public Criteria andDyglgwIsNull() {
            addCriterion("dyglgw is null");
            return (Criteria) this;
        }

        public Criteria andDyglgwIsNotNull() {
            addCriterion("dyglgw is not null");
            return (Criteria) this;
        }

        public Criteria andDyglgwEqualTo(String value) {
            addCriterion("dyglgw =", value, "dyglgw");
            return (Criteria) this;
        }

        public Criteria andDyglgwNotEqualTo(String value) {
            addCriterion("dyglgw <>", value, "dyglgw");
            return (Criteria) this;
        }

        public Criteria andDyglgwGreaterThan(String value) {
            addCriterion("dyglgw >", value, "dyglgw");
            return (Criteria) this;
        }

        public Criteria andDyglgwGreaterThanOrEqualTo(String value) {
            addCriterion("dyglgw >=", value, "dyglgw");
            return (Criteria) this;
        }

        public Criteria andDyglgwLessThan(String value) {
            addCriterion("dyglgw <", value, "dyglgw");
            return (Criteria) this;
        }

        public Criteria andDyglgwLessThanOrEqualTo(String value) {
            addCriterion("dyglgw <=", value, "dyglgw");
            return (Criteria) this;
        }

        public Criteria andDyglgwLike(String value) {
            addCriterion("dyglgw like", value, "dyglgw");
            return (Criteria) this;
        }

        public Criteria andDyglgwNotLike(String value) {
            addCriterion("dyglgw not like", value, "dyglgw");
            return (Criteria) this;
        }

        public Criteria andDyglgwIn(List<String> values) {
            addCriterion("dyglgw in", values, "dyglgw");
            return (Criteria) this;
        }

        public Criteria andDyglgwNotIn(List<String> values) {
            addCriterion("dyglgw not in", values, "dyglgw");
            return (Criteria) this;
        }

        public Criteria andDyglgwBetween(String value1, String value2) {
            addCriterion("dyglgw between", value1, value2, "dyglgw");
            return (Criteria) this;
        }

        public Criteria andDyglgwNotBetween(String value1, String value2) {
            addCriterion("dyglgw not between", value1, value2, "dyglgw");
            return (Criteria) this;
        }

        public Criteria andZzjxPxjxIsNull() {
            addCriterion("zzjx_pxjx is null");
            return (Criteria) this;
        }

        public Criteria andZzjxPxjxIsNotNull() {
            addCriterion("zzjx_pxjx is not null");
            return (Criteria) this;
        }

        public Criteria andZzjxPxjxEqualTo(String value) {
            addCriterion("zzjx_pxjx =", value, "zzjxPxjx");
            return (Criteria) this;
        }

        public Criteria andZzjxPxjxNotEqualTo(String value) {
            addCriterion("zzjx_pxjx <>", value, "zzjxPxjx");
            return (Criteria) this;
        }

        public Criteria andZzjxPxjxGreaterThan(String value) {
            addCriterion("zzjx_pxjx >", value, "zzjxPxjx");
            return (Criteria) this;
        }

        public Criteria andZzjxPxjxGreaterThanOrEqualTo(String value) {
            addCriterion("zzjx_pxjx >=", value, "zzjxPxjx");
            return (Criteria) this;
        }

        public Criteria andZzjxPxjxLessThan(String value) {
            addCriterion("zzjx_pxjx <", value, "zzjxPxjx");
            return (Criteria) this;
        }

        public Criteria andZzjxPxjxLessThanOrEqualTo(String value) {
            addCriterion("zzjx_pxjx <=", value, "zzjxPxjx");
            return (Criteria) this;
        }

        public Criteria andZzjxPxjxLike(String value) {
            addCriterion("zzjx_pxjx like", value, "zzjxPxjx");
            return (Criteria) this;
        }

        public Criteria andZzjxPxjxNotLike(String value) {
            addCriterion("zzjx_pxjx not like", value, "zzjxPxjx");
            return (Criteria) this;
        }

        public Criteria andZzjxPxjxIn(List<String> values) {
            addCriterion("zzjx_pxjx in", values, "zzjxPxjx");
            return (Criteria) this;
        }

        public Criteria andZzjxPxjxNotIn(List<String> values) {
            addCriterion("zzjx_pxjx not in", values, "zzjxPxjx");
            return (Criteria) this;
        }

        public Criteria andZzjxPxjxBetween(String value1, String value2) {
            addCriterion("zzjx_pxjx between", value1, value2, "zzjxPxjx");
            return (Criteria) this;
        }

        public Criteria andZzjxPxjxNotBetween(String value1, String value2) {
            addCriterion("zzjx_pxjx not between", value1, value2, "zzjxPxjx");
            return (Criteria) this;
        }

        public Criteria andXsIsNull() {
            addCriterion("xs is null");
            return (Criteria) this;
        }

        public Criteria andXsIsNotNull() {
            addCriterion("xs is not null");
            return (Criteria) this;
        }

        public Criteria andXsEqualTo(String value) {
            addCriterion("xs =", value, "xs");
            return (Criteria) this;
        }

        public Criteria andXsNotEqualTo(String value) {
            addCriterion("xs <>", value, "xs");
            return (Criteria) this;
        }

        public Criteria andXsGreaterThan(String value) {
            addCriterion("xs >", value, "xs");
            return (Criteria) this;
        }

        public Criteria andXsGreaterThanOrEqualTo(String value) {
            addCriterion("xs >=", value, "xs");
            return (Criteria) this;
        }

        public Criteria andXsLessThan(String value) {
            addCriterion("xs <", value, "xs");
            return (Criteria) this;
        }

        public Criteria andXsLessThanOrEqualTo(String value) {
            addCriterion("xs <=", value, "xs");
            return (Criteria) this;
        }

        public Criteria andXsLike(String value) {
            addCriterion("xs like", value, "xs");
            return (Criteria) this;
        }

        public Criteria andXsNotLike(String value) {
            addCriterion("xs not like", value, "xs");
            return (Criteria) this;
        }

        public Criteria andXsIn(List<String> values) {
            addCriterion("xs in", values, "xs");
            return (Criteria) this;
        }

        public Criteria andXsNotIn(List<String> values) {
            addCriterion("xs not in", values, "xs");
            return (Criteria) this;
        }

        public Criteria andXsBetween(String value1, String value2) {
            addCriterion("xs between", value1, value2, "xs");
            return (Criteria) this;
        }

        public Criteria andXsNotBetween(String value1, String value2) {
            addCriterion("xs not between", value1, value2, "xs");
            return (Criteria) this;
        }

        public Criteria andYjjxhjIsNull() {
            addCriterion("yjjxhj is null");
            return (Criteria) this;
        }

        public Criteria andYjjxhjIsNotNull() {
            addCriterion("yjjxhj is not null");
            return (Criteria) this;
        }

        public Criteria andYjjxhjEqualTo(String value) {
            addCriterion("yjjxhj =", value, "yjjxhj");
            return (Criteria) this;
        }

        public Criteria andYjjxhjNotEqualTo(String value) {
            addCriterion("yjjxhj <>", value, "yjjxhj");
            return (Criteria) this;
        }

        public Criteria andYjjxhjGreaterThan(String value) {
            addCriterion("yjjxhj >", value, "yjjxhj");
            return (Criteria) this;
        }

        public Criteria andYjjxhjGreaterThanOrEqualTo(String value) {
            addCriterion("yjjxhj >=", value, "yjjxhj");
            return (Criteria) this;
        }

        public Criteria andYjjxhjLessThan(String value) {
            addCriterion("yjjxhj <", value, "yjjxhj");
            return (Criteria) this;
        }

        public Criteria andYjjxhjLessThanOrEqualTo(String value) {
            addCriterion("yjjxhj <=", value, "yjjxhj");
            return (Criteria) this;
        }

        public Criteria andYjjxhjLike(String value) {
            addCriterion("yjjxhj like", value, "yjjxhj");
            return (Criteria) this;
        }

        public Criteria andYjjxhjNotLike(String value) {
            addCriterion("yjjxhj not like", value, "yjjxhj");
            return (Criteria) this;
        }

        public Criteria andYjjxhjIn(List<String> values) {
            addCriterion("yjjxhj in", values, "yjjxhj");
            return (Criteria) this;
        }

        public Criteria andYjjxhjNotIn(List<String> values) {
            addCriterion("yjjxhj not in", values, "yjjxhj");
            return (Criteria) this;
        }

        public Criteria andYjjxhjBetween(String value1, String value2) {
            addCriterion("yjjxhj between", value1, value2, "yjjxhj");
            return (Criteria) this;
        }

        public Criteria andYjjxhjNotBetween(String value1, String value2) {
            addCriterion("yjjxhj not between", value1, value2, "yjjxhj");
            return (Criteria) this;
        }

        public Criteria andPxjxxjqjjxhjIsNull() {
            addCriterion("pxjxxjqjjxhj is null");
            return (Criteria) this;
        }

        public Criteria andPxjxxjqjjxhjIsNotNull() {
            addCriterion("pxjxxjqjjxhj is not null");
            return (Criteria) this;
        }

        public Criteria andPxjxxjqjjxhjEqualTo(String value) {
            addCriterion("pxjxxjqjjxhj =", value, "pxjxxjqjjxhj");
            return (Criteria) this;
        }

        public Criteria andPxjxxjqjjxhjNotEqualTo(String value) {
            addCriterion("pxjxxjqjjxhj <>", value, "pxjxxjqjjxhj");
            return (Criteria) this;
        }

        public Criteria andPxjxxjqjjxhjGreaterThan(String value) {
            addCriterion("pxjxxjqjjxhj >", value, "pxjxxjqjjxhj");
            return (Criteria) this;
        }

        public Criteria andPxjxxjqjjxhjGreaterThanOrEqualTo(String value) {
            addCriterion("pxjxxjqjjxhj >=", value, "pxjxxjqjjxhj");
            return (Criteria) this;
        }

        public Criteria andPxjxxjqjjxhjLessThan(String value) {
            addCriterion("pxjxxjqjjxhj <", value, "pxjxxjqjjxhj");
            return (Criteria) this;
        }

        public Criteria andPxjxxjqjjxhjLessThanOrEqualTo(String value) {
            addCriterion("pxjxxjqjjxhj <=", value, "pxjxxjqjjxhj");
            return (Criteria) this;
        }

        public Criteria andPxjxxjqjjxhjLike(String value) {
            addCriterion("pxjxxjqjjxhj like", value, "pxjxxjqjjxhj");
            return (Criteria) this;
        }

        public Criteria andPxjxxjqjjxhjNotLike(String value) {
            addCriterion("pxjxxjqjjxhj not like", value, "pxjxxjqjjxhj");
            return (Criteria) this;
        }

        public Criteria andPxjxxjqjjxhjIn(List<String> values) {
            addCriterion("pxjxxjqjjxhj in", values, "pxjxxjqjjxhj");
            return (Criteria) this;
        }

        public Criteria andPxjxxjqjjxhjNotIn(List<String> values) {
            addCriterion("pxjxxjqjjxhj not in", values, "pxjxxjqjjxhj");
            return (Criteria) this;
        }

        public Criteria andPxjxxjqjjxhjBetween(String value1, String value2) {
            addCriterion("pxjxxjqjjxhj between", value1, value2, "pxjxxjqjjxhj");
            return (Criteria) this;
        }

        public Criteria andPxjxxjqjjxhjNotBetween(String value1, String value2) {
            addCriterion("pxjxxjqjjxhj not between", value1, value2, "pxjxxjqjjxhj");
            return (Criteria) this;
        }

        public Criteria andNjxhjIsNull() {
            addCriterion("njxhj is null");
            return (Criteria) this;
        }

        public Criteria andNjxhjIsNotNull() {
            addCriterion("njxhj is not null");
            return (Criteria) this;
        }

        public Criteria andNjxhjEqualTo(String value) {
            addCriterion("njxhj =", value, "njxhj");
            return (Criteria) this;
        }

        public Criteria andNjxhjNotEqualTo(String value) {
            addCriterion("njxhj <>", value, "njxhj");
            return (Criteria) this;
        }

        public Criteria andNjxhjGreaterThan(String value) {
            addCriterion("njxhj >", value, "njxhj");
            return (Criteria) this;
        }

        public Criteria andNjxhjGreaterThanOrEqualTo(String value) {
            addCriterion("njxhj >=", value, "njxhj");
            return (Criteria) this;
        }

        public Criteria andNjxhjLessThan(String value) {
            addCriterion("njxhj <", value, "njxhj");
            return (Criteria) this;
        }

        public Criteria andNjxhjLessThanOrEqualTo(String value) {
            addCriterion("njxhj <=", value, "njxhj");
            return (Criteria) this;
        }

        public Criteria andNjxhjLike(String value) {
            addCriterion("njxhj like", value, "njxhj");
            return (Criteria) this;
        }

        public Criteria andNjxhjNotLike(String value) {
            addCriterion("njxhj not like", value, "njxhj");
            return (Criteria) this;
        }

        public Criteria andNjxhjIn(List<String> values) {
            addCriterion("njxhj in", values, "njxhj");
            return (Criteria) this;
        }

        public Criteria andNjxhjNotIn(List<String> values) {
            addCriterion("njxhj not in", values, "njxhj");
            return (Criteria) this;
        }

        public Criteria andNjxhjBetween(String value1, String value2) {
            addCriterion("njxhj between", value1, value2, "njxhj");
            return (Criteria) this;
        }

        public Criteria andNjxhjNotBetween(String value1, String value2) {
            addCriterion("njxhj not between", value1, value2, "njxhj");
            return (Criteria) this;
        }

        public Criteria andNyyjjtIsNull() {
            addCriterion("nyyjjt is null");
            return (Criteria) this;
        }

        public Criteria andNyyjjtIsNotNull() {
            addCriterion("nyyjjt is not null");
            return (Criteria) this;
        }

        public Criteria andNyyjjtEqualTo(String value) {
            addCriterion("nyyjjt =", value, "nyyjjt");
            return (Criteria) this;
        }

        public Criteria andNyyjjtNotEqualTo(String value) {
            addCriterion("nyyjjt <>", value, "nyyjjt");
            return (Criteria) this;
        }

        public Criteria andNyyjjtGreaterThan(String value) {
            addCriterion("nyyjjt >", value, "nyyjjt");
            return (Criteria) this;
        }

        public Criteria andNyyjjtGreaterThanOrEqualTo(String value) {
            addCriterion("nyyjjt >=", value, "nyyjjt");
            return (Criteria) this;
        }

        public Criteria andNyyjjtLessThan(String value) {
            addCriterion("nyyjjt <", value, "nyyjjt");
            return (Criteria) this;
        }

        public Criteria andNyyjjtLessThanOrEqualTo(String value) {
            addCriterion("nyyjjt <=", value, "nyyjjt");
            return (Criteria) this;
        }

        public Criteria andNyyjjtLike(String value) {
            addCriterion("nyyjjt like", value, "nyyjjt");
            return (Criteria) this;
        }

        public Criteria andNyyjjtNotLike(String value) {
            addCriterion("nyyjjt not like", value, "nyyjjt");
            return (Criteria) this;
        }

        public Criteria andNyyjjtIn(List<String> values) {
            addCriterion("nyyjjt in", values, "nyyjjt");
            return (Criteria) this;
        }

        public Criteria andNyyjjtNotIn(List<String> values) {
            addCriterion("nyyjjt not in", values, "nyyjjt");
            return (Criteria) this;
        }

        public Criteria andNyyjjtBetween(String value1, String value2) {
            addCriterion("nyyjjt between", value1, value2, "nyyjjt");
            return (Criteria) this;
        }

        public Criteria andNyyjjtNotBetween(String value1, String value2) {
            addCriterion("nyyjjt not between", value1, value2, "nyyjjt");
            return (Criteria) this;
        }

        public Criteria andNyffjthjIsNull() {
            addCriterion("nyffjthj is null");
            return (Criteria) this;
        }

        public Criteria andNyffjthjIsNotNull() {
            addCriterion("nyffjthj is not null");
            return (Criteria) this;
        }

        public Criteria andNyffjthjEqualTo(String value) {
            addCriterion("nyffjthj =", value, "nyffjthj");
            return (Criteria) this;
        }

        public Criteria andNyffjthjNotEqualTo(String value) {
            addCriterion("nyffjthj <>", value, "nyffjthj");
            return (Criteria) this;
        }

        public Criteria andNyffjthjGreaterThan(String value) {
            addCriterion("nyffjthj >", value, "nyffjthj");
            return (Criteria) this;
        }

        public Criteria andNyffjthjGreaterThanOrEqualTo(String value) {
            addCriterion("nyffjthj >=", value, "nyffjthj");
            return (Criteria) this;
        }

        public Criteria andNyffjthjLessThan(String value) {
            addCriterion("nyffjthj <", value, "nyffjthj");
            return (Criteria) this;
        }

        public Criteria andNyffjthjLessThanOrEqualTo(String value) {
            addCriterion("nyffjthj <=", value, "nyffjthj");
            return (Criteria) this;
        }

        public Criteria andNyffjthjLike(String value) {
            addCriterion("nyffjthj like", value, "nyffjthj");
            return (Criteria) this;
        }

        public Criteria andNyffjthjNotLike(String value) {
            addCriterion("nyffjthj not like", value, "nyffjthj");
            return (Criteria) this;
        }

        public Criteria andNyffjthjIn(List<String> values) {
            addCriterion("nyffjthj in", values, "nyffjthj");
            return (Criteria) this;
        }

        public Criteria andNyffjthjNotIn(List<String> values) {
            addCriterion("nyffjthj not in", values, "nyffjthj");
            return (Criteria) this;
        }

        public Criteria andNyffjthjBetween(String value1, String value2) {
            addCriterion("nyffjthj between", value1, value2, "nyffjthj");
            return (Criteria) this;
        }

        public Criteria andNyffjthjNotBetween(String value1, String value2) {
            addCriterion("nyffjthj not between", value1, value2, "nyffjthj");
            return (Criteria) this;
        }

        public Criteria andNbfjxjtIsNull() {
            addCriterion("nbfjxjt is null");
            return (Criteria) this;
        }

        public Criteria andNbfjxjtIsNotNull() {
            addCriterion("nbfjxjt is not null");
            return (Criteria) this;
        }

        public Criteria andNbfjxjtEqualTo(String value) {
            addCriterion("nbfjxjt =", value, "nbfjxjt");
            return (Criteria) this;
        }

        public Criteria andNbfjxjtNotEqualTo(String value) {
            addCriterion("nbfjxjt <>", value, "nbfjxjt");
            return (Criteria) this;
        }

        public Criteria andNbfjxjtGreaterThan(String value) {
            addCriterion("nbfjxjt >", value, "nbfjxjt");
            return (Criteria) this;
        }

        public Criteria andNbfjxjtGreaterThanOrEqualTo(String value) {
            addCriterion("nbfjxjt >=", value, "nbfjxjt");
            return (Criteria) this;
        }

        public Criteria andNbfjxjtLessThan(String value) {
            addCriterion("nbfjxjt <", value, "nbfjxjt");
            return (Criteria) this;
        }

        public Criteria andNbfjxjtLessThanOrEqualTo(String value) {
            addCriterion("nbfjxjt <=", value, "nbfjxjt");
            return (Criteria) this;
        }

        public Criteria andNbfjxjtLike(String value) {
            addCriterion("nbfjxjt like", value, "nbfjxjt");
            return (Criteria) this;
        }

        public Criteria andNbfjxjtNotLike(String value) {
            addCriterion("nbfjxjt not like", value, "nbfjxjt");
            return (Criteria) this;
        }

        public Criteria andNbfjxjtIn(List<String> values) {
            addCriterion("nbfjxjt in", values, "nbfjxjt");
            return (Criteria) this;
        }

        public Criteria andNbfjxjtNotIn(List<String> values) {
            addCriterion("nbfjxjt not in", values, "nbfjxjt");
            return (Criteria) this;
        }

        public Criteria andNbfjxjtBetween(String value1, String value2) {
            addCriterion("nbfjxjt between", value1, value2, "nbfjxjt");
            return (Criteria) this;
        }

        public Criteria andNbfjxjtNotBetween(String value1, String value2) {
            addCriterion("nbfjxjt not between", value1, value2, "nbfjxjt");
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