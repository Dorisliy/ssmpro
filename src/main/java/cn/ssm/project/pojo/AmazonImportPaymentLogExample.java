package cn.ssm.project.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmazonImportPaymentLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmazonImportPaymentLogExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("CREATED_AT is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("CREATED_AT is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("CREATED_AT =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("CREATED_AT <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("CREATED_AT >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_AT >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("CREATED_AT <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_AT <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("CREATED_AT in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("CREATED_AT not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("CREATED_AT between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_AT not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedIdIsNull() {
            addCriterion("CREATED_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIdIsNotNull() {
            addCriterion("CREATED_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedIdEqualTo(Integer value) {
            addCriterion("CREATED_ID =", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdNotEqualTo(Integer value) {
            addCriterion("CREATED_ID <>", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdGreaterThan(Integer value) {
            addCriterion("CREATED_ID >", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATED_ID >=", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdLessThan(Integer value) {
            addCriterion("CREATED_ID <", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdLessThanOrEqualTo(Integer value) {
            addCriterion("CREATED_ID <=", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdIn(List<Integer> values) {
            addCriterion("CREATED_ID in", values, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdNotIn(List<Integer> values) {
            addCriterion("CREATED_ID not in", values, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdBetween(Integer value1, Integer value2) {
            addCriterion("CREATED_ID between", value1, value2, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATED_ID not between", value1, value2, "createdId");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("UPDATED_AT is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("UPDATED_AT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("UPDATED_AT =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("UPDATED_AT <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("UPDATED_AT >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED_AT >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("UPDATED_AT <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("UPDATED_AT <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("UPDATED_AT in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("UPDATED_AT not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("UPDATED_AT between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("UPDATED_AT not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedIdIsNull() {
            addCriterion("UPDATED_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIdIsNotNull() {
            addCriterion("UPDATED_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIdEqualTo(Integer value) {
            addCriterion("UPDATED_ID =", value, "updatedId");
            return (Criteria) this;
        }

        public Criteria andUpdatedIdNotEqualTo(Integer value) {
            addCriterion("UPDATED_ID <>", value, "updatedId");
            return (Criteria) this;
        }

        public Criteria andUpdatedIdGreaterThan(Integer value) {
            addCriterion("UPDATED_ID >", value, "updatedId");
            return (Criteria) this;
        }

        public Criteria andUpdatedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPDATED_ID >=", value, "updatedId");
            return (Criteria) this;
        }

        public Criteria andUpdatedIdLessThan(Integer value) {
            addCriterion("UPDATED_ID <", value, "updatedId");
            return (Criteria) this;
        }

        public Criteria andUpdatedIdLessThanOrEqualTo(Integer value) {
            addCriterion("UPDATED_ID <=", value, "updatedId");
            return (Criteria) this;
        }

        public Criteria andUpdatedIdIn(List<Integer> values) {
            addCriterion("UPDATED_ID in", values, "updatedId");
            return (Criteria) this;
        }

        public Criteria andUpdatedIdNotIn(List<Integer> values) {
            addCriterion("UPDATED_ID not in", values, "updatedId");
            return (Criteria) this;
        }

        public Criteria andUpdatedIdBetween(Integer value1, Integer value2) {
            addCriterion("UPDATED_ID between", value1, value2, "updatedId");
            return (Criteria) this;
        }

        public Criteria andUpdatedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("UPDATED_ID not between", value1, value2, "updatedId");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNull() {
            addCriterion("ISACTIVE is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNotNull() {
            addCriterion("ISACTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveEqualTo(String value) {
            addCriterion("ISACTIVE =", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotEqualTo(String value) {
            addCriterion("ISACTIVE <>", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThan(String value) {
            addCriterion("ISACTIVE >", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThanOrEqualTo(String value) {
            addCriterion("ISACTIVE >=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThan(String value) {
            addCriterion("ISACTIVE <", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThanOrEqualTo(String value) {
            addCriterion("ISACTIVE <=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLike(String value) {
            addCriterion("ISACTIVE like", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotLike(String value) {
            addCriterion("ISACTIVE not like", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveIn(List<String> values) {
            addCriterion("ISACTIVE in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotIn(List<String> values) {
            addCriterion("ISACTIVE not in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveBetween(String value1, String value2) {
            addCriterion("ISACTIVE between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotBetween(String value1, String value2) {
            addCriterion("ISACTIVE not between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("CLIENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("CLIENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(Integer value) {
            addCriterion("CLIENT_ID =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(Integer value) {
            addCriterion("CLIENT_ID <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(Integer value) {
            addCriterion("CLIENT_ID >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLIENT_ID >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(Integer value) {
            addCriterion("CLIENT_ID <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(Integer value) {
            addCriterion("CLIENT_ID <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<Integer> values) {
            addCriterion("CLIENT_ID in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<Integer> values) {
            addCriterion("CLIENT_ID not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(Integer value1, Integer value2) {
            addCriterion("CLIENT_ID between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CLIENT_ID not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andReportRequestedIdIsNull() {
            addCriterion("REPORT_REQUESTED_ID is null");
            return (Criteria) this;
        }

        public Criteria andReportRequestedIdIsNotNull() {
            addCriterion("REPORT_REQUESTED_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReportRequestedIdEqualTo(String value) {
            addCriterion("REPORT_REQUESTED_ID =", value, "reportRequestedId");
            return (Criteria) this;
        }

        public Criteria andReportRequestedIdNotEqualTo(String value) {
            addCriterion("REPORT_REQUESTED_ID <>", value, "reportRequestedId");
            return (Criteria) this;
        }

        public Criteria andReportRequestedIdGreaterThan(String value) {
            addCriterion("REPORT_REQUESTED_ID >", value, "reportRequestedId");
            return (Criteria) this;
        }

        public Criteria andReportRequestedIdGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_REQUESTED_ID >=", value, "reportRequestedId");
            return (Criteria) this;
        }

        public Criteria andReportRequestedIdLessThan(String value) {
            addCriterion("REPORT_REQUESTED_ID <", value, "reportRequestedId");
            return (Criteria) this;
        }

        public Criteria andReportRequestedIdLessThanOrEqualTo(String value) {
            addCriterion("REPORT_REQUESTED_ID <=", value, "reportRequestedId");
            return (Criteria) this;
        }

        public Criteria andReportRequestedIdLike(String value) {
            addCriterion("REPORT_REQUESTED_ID like", value, "reportRequestedId");
            return (Criteria) this;
        }

        public Criteria andReportRequestedIdNotLike(String value) {
            addCriterion("REPORT_REQUESTED_ID not like", value, "reportRequestedId");
            return (Criteria) this;
        }

        public Criteria andReportRequestedIdIn(List<String> values) {
            addCriterion("REPORT_REQUESTED_ID in", values, "reportRequestedId");
            return (Criteria) this;
        }

        public Criteria andReportRequestedIdNotIn(List<String> values) {
            addCriterion("REPORT_REQUESTED_ID not in", values, "reportRequestedId");
            return (Criteria) this;
        }

        public Criteria andReportRequestedIdBetween(String value1, String value2) {
            addCriterion("REPORT_REQUESTED_ID between", value1, value2, "reportRequestedId");
            return (Criteria) this;
        }

        public Criteria andReportRequestedIdNotBetween(String value1, String value2) {
            addCriterion("REPORT_REQUESTED_ID not between", value1, value2, "reportRequestedId");
            return (Criteria) this;
        }

        public Criteria andGeneratedReportIdIsNull() {
            addCriterion("GENERATED_REPORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andGeneratedReportIdIsNotNull() {
            addCriterion("GENERATED_REPORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGeneratedReportIdEqualTo(String value) {
            addCriterion("GENERATED_REPORT_ID =", value, "generatedReportId");
            return (Criteria) this;
        }

        public Criteria andGeneratedReportIdNotEqualTo(String value) {
            addCriterion("GENERATED_REPORT_ID <>", value, "generatedReportId");
            return (Criteria) this;
        }

        public Criteria andGeneratedReportIdGreaterThan(String value) {
            addCriterion("GENERATED_REPORT_ID >", value, "generatedReportId");
            return (Criteria) this;
        }

        public Criteria andGeneratedReportIdGreaterThanOrEqualTo(String value) {
            addCriterion("GENERATED_REPORT_ID >=", value, "generatedReportId");
            return (Criteria) this;
        }

        public Criteria andGeneratedReportIdLessThan(String value) {
            addCriterion("GENERATED_REPORT_ID <", value, "generatedReportId");
            return (Criteria) this;
        }

        public Criteria andGeneratedReportIdLessThanOrEqualTo(String value) {
            addCriterion("GENERATED_REPORT_ID <=", value, "generatedReportId");
            return (Criteria) this;
        }

        public Criteria andGeneratedReportIdLike(String value) {
            addCriterion("GENERATED_REPORT_ID like", value, "generatedReportId");
            return (Criteria) this;
        }

        public Criteria andGeneratedReportIdNotLike(String value) {
            addCriterion("GENERATED_REPORT_ID not like", value, "generatedReportId");
            return (Criteria) this;
        }

        public Criteria andGeneratedReportIdIn(List<String> values) {
            addCriterion("GENERATED_REPORT_ID in", values, "generatedReportId");
            return (Criteria) this;
        }

        public Criteria andGeneratedReportIdNotIn(List<String> values) {
            addCriterion("GENERATED_REPORT_ID not in", values, "generatedReportId");
            return (Criteria) this;
        }

        public Criteria andGeneratedReportIdBetween(String value1, String value2) {
            addCriterion("GENERATED_REPORT_ID between", value1, value2, "generatedReportId");
            return (Criteria) this;
        }

        public Criteria andGeneratedReportIdNotBetween(String value1, String value2) {
            addCriterion("GENERATED_REPORT_ID not between", value1, value2, "generatedReportId");
            return (Criteria) this;
        }

        public Criteria andRequestTimestampIsNull() {
            addCriterion("REQUEST_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andRequestTimestampIsNotNull() {
            addCriterion("REQUEST_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andRequestTimestampEqualTo(Date value) {
            addCriterion("REQUEST_TIMESTAMP =", value, "requestTimestamp");
            return (Criteria) this;
        }

        public Criteria andRequestTimestampNotEqualTo(Date value) {
            addCriterion("REQUEST_TIMESTAMP <>", value, "requestTimestamp");
            return (Criteria) this;
        }

        public Criteria andRequestTimestampGreaterThan(Date value) {
            addCriterion("REQUEST_TIMESTAMP >", value, "requestTimestamp");
            return (Criteria) this;
        }

        public Criteria andRequestTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("REQUEST_TIMESTAMP >=", value, "requestTimestamp");
            return (Criteria) this;
        }

        public Criteria andRequestTimestampLessThan(Date value) {
            addCriterion("REQUEST_TIMESTAMP <", value, "requestTimestamp");
            return (Criteria) this;
        }

        public Criteria andRequestTimestampLessThanOrEqualTo(Date value) {
            addCriterion("REQUEST_TIMESTAMP <=", value, "requestTimestamp");
            return (Criteria) this;
        }

        public Criteria andRequestTimestampIn(List<Date> values) {
            addCriterion("REQUEST_TIMESTAMP in", values, "requestTimestamp");
            return (Criteria) this;
        }

        public Criteria andRequestTimestampNotIn(List<Date> values) {
            addCriterion("REQUEST_TIMESTAMP not in", values, "requestTimestamp");
            return (Criteria) this;
        }

        public Criteria andRequestTimestampBetween(Date value1, Date value2) {
            addCriterion("REQUEST_TIMESTAMP between", value1, value2, "requestTimestamp");
            return (Criteria) this;
        }

        public Criteria andRequestTimestampNotBetween(Date value1, Date value2) {
            addCriterion("REQUEST_TIMESTAMP not between", value1, value2, "requestTimestamp");
            return (Criteria) this;
        }

        public Criteria andRequestEndTimestampIsNull() {
            addCriterion("REQUEST_END_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andRequestEndTimestampIsNotNull() {
            addCriterion("REQUEST_END_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andRequestEndTimestampEqualTo(Date value) {
            addCriterion("REQUEST_END_TIMESTAMP =", value, "requestEndTimestamp");
            return (Criteria) this;
        }

        public Criteria andRequestEndTimestampNotEqualTo(Date value) {
            addCriterion("REQUEST_END_TIMESTAMP <>", value, "requestEndTimestamp");
            return (Criteria) this;
        }

        public Criteria andRequestEndTimestampGreaterThan(Date value) {
            addCriterion("REQUEST_END_TIMESTAMP >", value, "requestEndTimestamp");
            return (Criteria) this;
        }

        public Criteria andRequestEndTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("REQUEST_END_TIMESTAMP >=", value, "requestEndTimestamp");
            return (Criteria) this;
        }

        public Criteria andRequestEndTimestampLessThan(Date value) {
            addCriterion("REQUEST_END_TIMESTAMP <", value, "requestEndTimestamp");
            return (Criteria) this;
        }

        public Criteria andRequestEndTimestampLessThanOrEqualTo(Date value) {
            addCriterion("REQUEST_END_TIMESTAMP <=", value, "requestEndTimestamp");
            return (Criteria) this;
        }

        public Criteria andRequestEndTimestampIn(List<Date> values) {
            addCriterion("REQUEST_END_TIMESTAMP in", values, "requestEndTimestamp");
            return (Criteria) this;
        }

        public Criteria andRequestEndTimestampNotIn(List<Date> values) {
            addCriterion("REQUEST_END_TIMESTAMP not in", values, "requestEndTimestamp");
            return (Criteria) this;
        }

        public Criteria andRequestEndTimestampBetween(Date value1, Date value2) {
            addCriterion("REQUEST_END_TIMESTAMP between", value1, value2, "requestEndTimestamp");
            return (Criteria) this;
        }

        public Criteria andRequestEndTimestampNotBetween(Date value1, Date value2) {
            addCriterion("REQUEST_END_TIMESTAMP not between", value1, value2, "requestEndTimestamp");
            return (Criteria) this;
        }

        public Criteria andReportFilenameIsNull() {
            addCriterion("REPORT_FILENAME is null");
            return (Criteria) this;
        }

        public Criteria andReportFilenameIsNotNull() {
            addCriterion("REPORT_FILENAME is not null");
            return (Criteria) this;
        }

        public Criteria andReportFilenameEqualTo(String value) {
            addCriterion("REPORT_FILENAME =", value, "reportFilename");
            return (Criteria) this;
        }

        public Criteria andReportFilenameNotEqualTo(String value) {
            addCriterion("REPORT_FILENAME <>", value, "reportFilename");
            return (Criteria) this;
        }

        public Criteria andReportFilenameGreaterThan(String value) {
            addCriterion("REPORT_FILENAME >", value, "reportFilename");
            return (Criteria) this;
        }

        public Criteria andReportFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_FILENAME >=", value, "reportFilename");
            return (Criteria) this;
        }

        public Criteria andReportFilenameLessThan(String value) {
            addCriterion("REPORT_FILENAME <", value, "reportFilename");
            return (Criteria) this;
        }

        public Criteria andReportFilenameLessThanOrEqualTo(String value) {
            addCriterion("REPORT_FILENAME <=", value, "reportFilename");
            return (Criteria) this;
        }

        public Criteria andReportFilenameLike(String value) {
            addCriterion("REPORT_FILENAME like", value, "reportFilename");
            return (Criteria) this;
        }

        public Criteria andReportFilenameNotLike(String value) {
            addCriterion("REPORT_FILENAME not like", value, "reportFilename");
            return (Criteria) this;
        }

        public Criteria andReportFilenameIn(List<String> values) {
            addCriterion("REPORT_FILENAME in", values, "reportFilename");
            return (Criteria) this;
        }

        public Criteria andReportFilenameNotIn(List<String> values) {
            addCriterion("REPORT_FILENAME not in", values, "reportFilename");
            return (Criteria) this;
        }

        public Criteria andReportFilenameBetween(String value1, String value2) {
            addCriterion("REPORT_FILENAME between", value1, value2, "reportFilename");
            return (Criteria) this;
        }

        public Criteria andReportFilenameNotBetween(String value1, String value2) {
            addCriterion("REPORT_FILENAME not between", value1, value2, "reportFilename");
            return (Criteria) this;
        }

        public Criteria andTotalImportNumIsNull() {
            addCriterion("TOTAL_IMPORT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTotalImportNumIsNotNull() {
            addCriterion("TOTAL_IMPORT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTotalImportNumEqualTo(BigDecimal value) {
            addCriterion("TOTAL_IMPORT_NUM =", value, "totalImportNum");
            return (Criteria) this;
        }

        public Criteria andTotalImportNumNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_IMPORT_NUM <>", value, "totalImportNum");
            return (Criteria) this;
        }

        public Criteria andTotalImportNumGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_IMPORT_NUM >", value, "totalImportNum");
            return (Criteria) this;
        }

        public Criteria andTotalImportNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_IMPORT_NUM >=", value, "totalImportNum");
            return (Criteria) this;
        }

        public Criteria andTotalImportNumLessThan(BigDecimal value) {
            addCriterion("TOTAL_IMPORT_NUM <", value, "totalImportNum");
            return (Criteria) this;
        }

        public Criteria andTotalImportNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_IMPORT_NUM <=", value, "totalImportNum");
            return (Criteria) this;
        }

        public Criteria andTotalImportNumIn(List<BigDecimal> values) {
            addCriterion("TOTAL_IMPORT_NUM in", values, "totalImportNum");
            return (Criteria) this;
        }

        public Criteria andTotalImportNumNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_IMPORT_NUM not in", values, "totalImportNum");
            return (Criteria) this;
        }

        public Criteria andTotalImportNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_IMPORT_NUM between", value1, value2, "totalImportNum");
            return (Criteria) this;
        }

        public Criteria andTotalImportNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_IMPORT_NUM not between", value1, value2, "totalImportNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumIsNull() {
            addCriterion("SUCCESS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSuccessNumIsNotNull() {
            addCriterion("SUCCESS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessNumEqualTo(BigDecimal value) {
            addCriterion("SUCCESS_NUM =", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumNotEqualTo(BigDecimal value) {
            addCriterion("SUCCESS_NUM <>", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumGreaterThan(BigDecimal value) {
            addCriterion("SUCCESS_NUM >", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUCCESS_NUM >=", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumLessThan(BigDecimal value) {
            addCriterion("SUCCESS_NUM <", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUCCESS_NUM <=", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumIn(List<BigDecimal> values) {
            addCriterion("SUCCESS_NUM in", values, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumNotIn(List<BigDecimal> values) {
            addCriterion("SUCCESS_NUM not in", values, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUCCESS_NUM between", value1, value2, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUCCESS_NUM not between", value1, value2, "successNum");
            return (Criteria) this;
        }

        public Criteria andFailNumIsNull() {
            addCriterion("FAIL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andFailNumIsNotNull() {
            addCriterion("FAIL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andFailNumEqualTo(BigDecimal value) {
            addCriterion("FAIL_NUM =", value, "failNum");
            return (Criteria) this;
        }

        public Criteria andFailNumNotEqualTo(BigDecimal value) {
            addCriterion("FAIL_NUM <>", value, "failNum");
            return (Criteria) this;
        }

        public Criteria andFailNumGreaterThan(BigDecimal value) {
            addCriterion("FAIL_NUM >", value, "failNum");
            return (Criteria) this;
        }

        public Criteria andFailNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAIL_NUM >=", value, "failNum");
            return (Criteria) this;
        }

        public Criteria andFailNumLessThan(BigDecimal value) {
            addCriterion("FAIL_NUM <", value, "failNum");
            return (Criteria) this;
        }

        public Criteria andFailNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAIL_NUM <=", value, "failNum");
            return (Criteria) this;
        }

        public Criteria andFailNumIn(List<BigDecimal> values) {
            addCriterion("FAIL_NUM in", values, "failNum");
            return (Criteria) this;
        }

        public Criteria andFailNumNotIn(List<BigDecimal> values) {
            addCriterion("FAIL_NUM not in", values, "failNum");
            return (Criteria) this;
        }

        public Criteria andFailNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAIL_NUM between", value1, value2, "failNum");
            return (Criteria) this;
        }

        public Criteria andFailNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAIL_NUM not between", value1, value2, "failNum");
            return (Criteria) this;
        }

        public Criteria andTotalDealNumIsNull() {
            addCriterion("TOTAL_DEAL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTotalDealNumIsNotNull() {
            addCriterion("TOTAL_DEAL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDealNumEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DEAL_NUM =", value, "totalDealNum");
            return (Criteria) this;
        }

        public Criteria andTotalDealNumNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DEAL_NUM <>", value, "totalDealNum");
            return (Criteria) this;
        }

        public Criteria andTotalDealNumGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_DEAL_NUM >", value, "totalDealNum");
            return (Criteria) this;
        }

        public Criteria andTotalDealNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DEAL_NUM >=", value, "totalDealNum");
            return (Criteria) this;
        }

        public Criteria andTotalDealNumLessThan(BigDecimal value) {
            addCriterion("TOTAL_DEAL_NUM <", value, "totalDealNum");
            return (Criteria) this;
        }

        public Criteria andTotalDealNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DEAL_NUM <=", value, "totalDealNum");
            return (Criteria) this;
        }

        public Criteria andTotalDealNumIn(List<BigDecimal> values) {
            addCriterion("TOTAL_DEAL_NUM in", values, "totalDealNum");
            return (Criteria) this;
        }

        public Criteria andTotalDealNumNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_DEAL_NUM not in", values, "totalDealNum");
            return (Criteria) this;
        }

        public Criteria andTotalDealNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_DEAL_NUM between", value1, value2, "totalDealNum");
            return (Criteria) this;
        }

        public Criteria andTotalDealNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_DEAL_NUM not between", value1, value2, "totalDealNum");
            return (Criteria) this;
        }

        public Criteria andIsInvoicesCreatedIsNull() {
            addCriterion("IS_INVOICES_CREATED is null");
            return (Criteria) this;
        }

        public Criteria andIsInvoicesCreatedIsNotNull() {
            addCriterion("IS_INVOICES_CREATED is not null");
            return (Criteria) this;
        }

        public Criteria andIsInvoicesCreatedEqualTo(String value) {
            addCriterion("IS_INVOICES_CREATED =", value, "isInvoicesCreated");
            return (Criteria) this;
        }

        public Criteria andIsInvoicesCreatedNotEqualTo(String value) {
            addCriterion("IS_INVOICES_CREATED <>", value, "isInvoicesCreated");
            return (Criteria) this;
        }

        public Criteria andIsInvoicesCreatedGreaterThan(String value) {
            addCriterion("IS_INVOICES_CREATED >", value, "isInvoicesCreated");
            return (Criteria) this;
        }

        public Criteria andIsInvoicesCreatedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_INVOICES_CREATED >=", value, "isInvoicesCreated");
            return (Criteria) this;
        }

        public Criteria andIsInvoicesCreatedLessThan(String value) {
            addCriterion("IS_INVOICES_CREATED <", value, "isInvoicesCreated");
            return (Criteria) this;
        }

        public Criteria andIsInvoicesCreatedLessThanOrEqualTo(String value) {
            addCriterion("IS_INVOICES_CREATED <=", value, "isInvoicesCreated");
            return (Criteria) this;
        }

        public Criteria andIsInvoicesCreatedLike(String value) {
            addCriterion("IS_INVOICES_CREATED like", value, "isInvoicesCreated");
            return (Criteria) this;
        }

        public Criteria andIsInvoicesCreatedNotLike(String value) {
            addCriterion("IS_INVOICES_CREATED not like", value, "isInvoicesCreated");
            return (Criteria) this;
        }

        public Criteria andIsInvoicesCreatedIn(List<String> values) {
            addCriterion("IS_INVOICES_CREATED in", values, "isInvoicesCreated");
            return (Criteria) this;
        }

        public Criteria andIsInvoicesCreatedNotIn(List<String> values) {
            addCriterion("IS_INVOICES_CREATED not in", values, "isInvoicesCreated");
            return (Criteria) this;
        }

        public Criteria andIsInvoicesCreatedBetween(String value1, String value2) {
            addCriterion("IS_INVOICES_CREATED between", value1, value2, "isInvoicesCreated");
            return (Criteria) this;
        }

        public Criteria andIsInvoicesCreatedNotBetween(String value1, String value2) {
            addCriterion("IS_INVOICES_CREATED not between", value1, value2, "isInvoicesCreated");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumIsNull() {
            addCriterion("INVOICE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumIsNotNull() {
            addCriterion("INVOICE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumEqualTo(BigDecimal value) {
            addCriterion("INVOICE_NUM =", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumNotEqualTo(BigDecimal value) {
            addCriterion("INVOICE_NUM <>", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumGreaterThan(BigDecimal value) {
            addCriterion("INVOICE_NUM >", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICE_NUM >=", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumLessThan(BigDecimal value) {
            addCriterion("INVOICE_NUM <", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICE_NUM <=", value, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumIn(List<BigDecimal> values) {
            addCriterion("INVOICE_NUM in", values, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumNotIn(List<BigDecimal> values) {
            addCriterion("INVOICE_NUM not in", values, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICE_NUM between", value1, value2, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICE_NUM not between", value1, value2, "invoiceNum");
            return (Criteria) this;
        }

        public Criteria andCreateShipmentIsNull() {
            addCriterion("CREATE_SHIPMENT is null");
            return (Criteria) this;
        }

        public Criteria andCreateShipmentIsNotNull() {
            addCriterion("CREATE_SHIPMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCreateShipmentEqualTo(String value) {
            addCriterion("CREATE_SHIPMENT =", value, "createShipment");
            return (Criteria) this;
        }

        public Criteria andCreateShipmentNotEqualTo(String value) {
            addCriterion("CREATE_SHIPMENT <>", value, "createShipment");
            return (Criteria) this;
        }

        public Criteria andCreateShipmentGreaterThan(String value) {
            addCriterion("CREATE_SHIPMENT >", value, "createShipment");
            return (Criteria) this;
        }

        public Criteria andCreateShipmentGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_SHIPMENT >=", value, "createShipment");
            return (Criteria) this;
        }

        public Criteria andCreateShipmentLessThan(String value) {
            addCriterion("CREATE_SHIPMENT <", value, "createShipment");
            return (Criteria) this;
        }

        public Criteria andCreateShipmentLessThanOrEqualTo(String value) {
            addCriterion("CREATE_SHIPMENT <=", value, "createShipment");
            return (Criteria) this;
        }

        public Criteria andCreateShipmentLike(String value) {
            addCriterion("CREATE_SHIPMENT like", value, "createShipment");
            return (Criteria) this;
        }

        public Criteria andCreateShipmentNotLike(String value) {
            addCriterion("CREATE_SHIPMENT not like", value, "createShipment");
            return (Criteria) this;
        }

        public Criteria andCreateShipmentIn(List<String> values) {
            addCriterion("CREATE_SHIPMENT in", values, "createShipment");
            return (Criteria) this;
        }

        public Criteria andCreateShipmentNotIn(List<String> values) {
            addCriterion("CREATE_SHIPMENT not in", values, "createShipment");
            return (Criteria) this;
        }

        public Criteria andCreateShipmentBetween(String value1, String value2) {
            addCriterion("CREATE_SHIPMENT between", value1, value2, "createShipment");
            return (Criteria) this;
        }

        public Criteria andCreateShipmentNotBetween(String value1, String value2) {
            addCriterion("CREATE_SHIPMENT not between", value1, value2, "createShipment");
            return (Criteria) this;
        }

        public Criteria andCreateInvoiceIsNull() {
            addCriterion("CREATE_INVOICE is null");
            return (Criteria) this;
        }

        public Criteria andCreateInvoiceIsNotNull() {
            addCriterion("CREATE_INVOICE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateInvoiceEqualTo(String value) {
            addCriterion("CREATE_INVOICE =", value, "createInvoice");
            return (Criteria) this;
        }

        public Criteria andCreateInvoiceNotEqualTo(String value) {
            addCriterion("CREATE_INVOICE <>", value, "createInvoice");
            return (Criteria) this;
        }

        public Criteria andCreateInvoiceGreaterThan(String value) {
            addCriterion("CREATE_INVOICE >", value, "createInvoice");
            return (Criteria) this;
        }

        public Criteria andCreateInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_INVOICE >=", value, "createInvoice");
            return (Criteria) this;
        }

        public Criteria andCreateInvoiceLessThan(String value) {
            addCriterion("CREATE_INVOICE <", value, "createInvoice");
            return (Criteria) this;
        }

        public Criteria andCreateInvoiceLessThanOrEqualTo(String value) {
            addCriterion("CREATE_INVOICE <=", value, "createInvoice");
            return (Criteria) this;
        }

        public Criteria andCreateInvoiceLike(String value) {
            addCriterion("CREATE_INVOICE like", value, "createInvoice");
            return (Criteria) this;
        }

        public Criteria andCreateInvoiceNotLike(String value) {
            addCriterion("CREATE_INVOICE not like", value, "createInvoice");
            return (Criteria) this;
        }

        public Criteria andCreateInvoiceIn(List<String> values) {
            addCriterion("CREATE_INVOICE in", values, "createInvoice");
            return (Criteria) this;
        }

        public Criteria andCreateInvoiceNotIn(List<String> values) {
            addCriterion("CREATE_INVOICE not in", values, "createInvoice");
            return (Criteria) this;
        }

        public Criteria andCreateInvoiceBetween(String value1, String value2) {
            addCriterion("CREATE_INVOICE between", value1, value2, "createInvoice");
            return (Criteria) this;
        }

        public Criteria andCreateInvoiceNotBetween(String value1, String value2) {
            addCriterion("CREATE_INVOICE not between", value1, value2, "createInvoice");
            return (Criteria) this;
        }

        public Criteria andGenerateInvoiceIsNull() {
            addCriterion("GENERATE_INVOICE is null");
            return (Criteria) this;
        }

        public Criteria andGenerateInvoiceIsNotNull() {
            addCriterion("GENERATE_INVOICE is not null");
            return (Criteria) this;
        }

        public Criteria andGenerateInvoiceEqualTo(String value) {
            addCriterion("GENERATE_INVOICE =", value, "generateInvoice");
            return (Criteria) this;
        }

        public Criteria andGenerateInvoiceNotEqualTo(String value) {
            addCriterion("GENERATE_INVOICE <>", value, "generateInvoice");
            return (Criteria) this;
        }

        public Criteria andGenerateInvoiceGreaterThan(String value) {
            addCriterion("GENERATE_INVOICE >", value, "generateInvoice");
            return (Criteria) this;
        }

        public Criteria andGenerateInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("GENERATE_INVOICE >=", value, "generateInvoice");
            return (Criteria) this;
        }

        public Criteria andGenerateInvoiceLessThan(String value) {
            addCriterion("GENERATE_INVOICE <", value, "generateInvoice");
            return (Criteria) this;
        }

        public Criteria andGenerateInvoiceLessThanOrEqualTo(String value) {
            addCriterion("GENERATE_INVOICE <=", value, "generateInvoice");
            return (Criteria) this;
        }

        public Criteria andGenerateInvoiceLike(String value) {
            addCriterion("GENERATE_INVOICE like", value, "generateInvoice");
            return (Criteria) this;
        }

        public Criteria andGenerateInvoiceNotLike(String value) {
            addCriterion("GENERATE_INVOICE not like", value, "generateInvoice");
            return (Criteria) this;
        }

        public Criteria andGenerateInvoiceIn(List<String> values) {
            addCriterion("GENERATE_INVOICE in", values, "generateInvoice");
            return (Criteria) this;
        }

        public Criteria andGenerateInvoiceNotIn(List<String> values) {
            addCriterion("GENERATE_INVOICE not in", values, "generateInvoice");
            return (Criteria) this;
        }

        public Criteria andGenerateInvoiceBetween(String value1, String value2) {
            addCriterion("GENERATE_INVOICE between", value1, value2, "generateInvoice");
            return (Criteria) this;
        }

        public Criteria andGenerateInvoiceNotBetween(String value1, String value2) {
            addCriterion("GENERATE_INVOICE not between", value1, value2, "generateInvoice");
            return (Criteria) this;
        }

        public Criteria andProcessingIsNull() {
            addCriterion("PROCESSING is null");
            return (Criteria) this;
        }

        public Criteria andProcessingIsNotNull() {
            addCriterion("PROCESSING is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingEqualTo(String value) {
            addCriterion("PROCESSING =", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingNotEqualTo(String value) {
            addCriterion("PROCESSING <>", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingGreaterThan(String value) {
            addCriterion("PROCESSING >", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSING >=", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingLessThan(String value) {
            addCriterion("PROCESSING <", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingLessThanOrEqualTo(String value) {
            addCriterion("PROCESSING <=", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingLike(String value) {
            addCriterion("PROCESSING like", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingNotLike(String value) {
            addCriterion("PROCESSING not like", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingIn(List<String> values) {
            addCriterion("PROCESSING in", values, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingNotIn(List<String> values) {
            addCriterion("PROCESSING not in", values, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingBetween(String value1, String value2) {
            addCriterion("PROCESSING between", value1, value2, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingNotBetween(String value1, String value2) {
            addCriterion("PROCESSING not between", value1, value2, "processing");
            return (Criteria) this;
        }

        public Criteria andGeneratePaymentIsNull() {
            addCriterion("GENERATE_PAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andGeneratePaymentIsNotNull() {
            addCriterion("GENERATE_PAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andGeneratePaymentEqualTo(String value) {
            addCriterion("GENERATE_PAYMENT =", value, "generatePayment");
            return (Criteria) this;
        }

        public Criteria andGeneratePaymentNotEqualTo(String value) {
            addCriterion("GENERATE_PAYMENT <>", value, "generatePayment");
            return (Criteria) this;
        }

        public Criteria andGeneratePaymentGreaterThan(String value) {
            addCriterion("GENERATE_PAYMENT >", value, "generatePayment");
            return (Criteria) this;
        }

        public Criteria andGeneratePaymentGreaterThanOrEqualTo(String value) {
            addCriterion("GENERATE_PAYMENT >=", value, "generatePayment");
            return (Criteria) this;
        }

        public Criteria andGeneratePaymentLessThan(String value) {
            addCriterion("GENERATE_PAYMENT <", value, "generatePayment");
            return (Criteria) this;
        }

        public Criteria andGeneratePaymentLessThanOrEqualTo(String value) {
            addCriterion("GENERATE_PAYMENT <=", value, "generatePayment");
            return (Criteria) this;
        }

        public Criteria andGeneratePaymentLike(String value) {
            addCriterion("GENERATE_PAYMENT like", value, "generatePayment");
            return (Criteria) this;
        }

        public Criteria andGeneratePaymentNotLike(String value) {
            addCriterion("GENERATE_PAYMENT not like", value, "generatePayment");
            return (Criteria) this;
        }

        public Criteria andGeneratePaymentIn(List<String> values) {
            addCriterion("GENERATE_PAYMENT in", values, "generatePayment");
            return (Criteria) this;
        }

        public Criteria andGeneratePaymentNotIn(List<String> values) {
            addCriterion("GENERATE_PAYMENT not in", values, "generatePayment");
            return (Criteria) this;
        }

        public Criteria andGeneratePaymentBetween(String value1, String value2) {
            addCriterion("GENERATE_PAYMENT between", value1, value2, "generatePayment");
            return (Criteria) this;
        }

        public Criteria andGeneratePaymentNotBetween(String value1, String value2) {
            addCriterion("GENERATE_PAYMENT not between", value1, value2, "generatePayment");
            return (Criteria) this;
        }

        public Criteria andIsGeneratePaymentIsNull() {
            addCriterion("IS_GENERATE_PAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andIsGeneratePaymentIsNotNull() {
            addCriterion("IS_GENERATE_PAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIsGeneratePaymentEqualTo(String value) {
            addCriterion("IS_GENERATE_PAYMENT =", value, "isGeneratePayment");
            return (Criteria) this;
        }

        public Criteria andIsGeneratePaymentNotEqualTo(String value) {
            addCriterion("IS_GENERATE_PAYMENT <>", value, "isGeneratePayment");
            return (Criteria) this;
        }

        public Criteria andIsGeneratePaymentGreaterThan(String value) {
            addCriterion("IS_GENERATE_PAYMENT >", value, "isGeneratePayment");
            return (Criteria) this;
        }

        public Criteria andIsGeneratePaymentGreaterThanOrEqualTo(String value) {
            addCriterion("IS_GENERATE_PAYMENT >=", value, "isGeneratePayment");
            return (Criteria) this;
        }

        public Criteria andIsGeneratePaymentLessThan(String value) {
            addCriterion("IS_GENERATE_PAYMENT <", value, "isGeneratePayment");
            return (Criteria) this;
        }

        public Criteria andIsGeneratePaymentLessThanOrEqualTo(String value) {
            addCriterion("IS_GENERATE_PAYMENT <=", value, "isGeneratePayment");
            return (Criteria) this;
        }

        public Criteria andIsGeneratePaymentLike(String value) {
            addCriterion("IS_GENERATE_PAYMENT like", value, "isGeneratePayment");
            return (Criteria) this;
        }

        public Criteria andIsGeneratePaymentNotLike(String value) {
            addCriterion("IS_GENERATE_PAYMENT not like", value, "isGeneratePayment");
            return (Criteria) this;
        }

        public Criteria andIsGeneratePaymentIn(List<String> values) {
            addCriterion("IS_GENERATE_PAYMENT in", values, "isGeneratePayment");
            return (Criteria) this;
        }

        public Criteria andIsGeneratePaymentNotIn(List<String> values) {
            addCriterion("IS_GENERATE_PAYMENT not in", values, "isGeneratePayment");
            return (Criteria) this;
        }

        public Criteria andIsGeneratePaymentBetween(String value1, String value2) {
            addCriterion("IS_GENERATE_PAYMENT between", value1, value2, "isGeneratePayment");
            return (Criteria) this;
        }

        public Criteria andIsGeneratePaymentNotBetween(String value1, String value2) {
            addCriterion("IS_GENERATE_PAYMENT not between", value1, value2, "isGeneratePayment");
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