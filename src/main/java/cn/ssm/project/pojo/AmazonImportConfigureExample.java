package cn.ssm.project.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmazonImportConfigureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmazonImportConfigureExample() {
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

        public Criteria andBpartnerIdIsNull() {
            addCriterion("BPARTNER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBpartnerIdIsNotNull() {
            addCriterion("BPARTNER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBpartnerIdEqualTo(Integer value) {
            addCriterion("BPARTNER_ID =", value, "bpartnerId");
            return (Criteria) this;
        }

        public Criteria andBpartnerIdNotEqualTo(Integer value) {
            addCriterion("BPARTNER_ID <>", value, "bpartnerId");
            return (Criteria) this;
        }

        public Criteria andBpartnerIdGreaterThan(Integer value) {
            addCriterion("BPARTNER_ID >", value, "bpartnerId");
            return (Criteria) this;
        }

        public Criteria andBpartnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BPARTNER_ID >=", value, "bpartnerId");
            return (Criteria) this;
        }

        public Criteria andBpartnerIdLessThan(Integer value) {
            addCriterion("BPARTNER_ID <", value, "bpartnerId");
            return (Criteria) this;
        }

        public Criteria andBpartnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("BPARTNER_ID <=", value, "bpartnerId");
            return (Criteria) this;
        }

        public Criteria andBpartnerIdIn(List<Integer> values) {
            addCriterion("BPARTNER_ID in", values, "bpartnerId");
            return (Criteria) this;
        }

        public Criteria andBpartnerIdNotIn(List<Integer> values) {
            addCriterion("BPARTNER_ID not in", values, "bpartnerId");
            return (Criteria) this;
        }

        public Criteria andBpartnerIdBetween(Integer value1, Integer value2) {
            addCriterion("BPARTNER_ID between", value1, value2, "bpartnerId");
            return (Criteria) this;
        }

        public Criteria andBpartnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BPARTNER_ID not between", value1, value2, "bpartnerId");
            return (Criteria) this;
        }

        public Criteria andDoctypeIdIsNull() {
            addCriterion("DOCTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDoctypeIdIsNotNull() {
            addCriterion("DOCTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDoctypeIdEqualTo(Integer value) {
            addCriterion("DOCTYPE_ID =", value, "doctypeId");
            return (Criteria) this;
        }

        public Criteria andDoctypeIdNotEqualTo(Integer value) {
            addCriterion("DOCTYPE_ID <>", value, "doctypeId");
            return (Criteria) this;
        }

        public Criteria andDoctypeIdGreaterThan(Integer value) {
            addCriterion("DOCTYPE_ID >", value, "doctypeId");
            return (Criteria) this;
        }

        public Criteria andDoctypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOCTYPE_ID >=", value, "doctypeId");
            return (Criteria) this;
        }

        public Criteria andDoctypeIdLessThan(Integer value) {
            addCriterion("DOCTYPE_ID <", value, "doctypeId");
            return (Criteria) this;
        }

        public Criteria andDoctypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("DOCTYPE_ID <=", value, "doctypeId");
            return (Criteria) this;
        }

        public Criteria andDoctypeIdIn(List<Integer> values) {
            addCriterion("DOCTYPE_ID in", values, "doctypeId");
            return (Criteria) this;
        }

        public Criteria andDoctypeIdNotIn(List<Integer> values) {
            addCriterion("DOCTYPE_ID not in", values, "doctypeId");
            return (Criteria) this;
        }

        public Criteria andDoctypeIdBetween(Integer value1, Integer value2) {
            addCriterion("DOCTYPE_ID between", value1, value2, "doctypeId");
            return (Criteria) this;
        }

        public Criteria andDoctypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DOCTYPE_ID not between", value1, value2, "doctypeId");
            return (Criteria) this;
        }

        public Criteria andDoctypetargetIdIsNull() {
            addCriterion("DOCTYPETARGET_ID is null");
            return (Criteria) this;
        }

        public Criteria andDoctypetargetIdIsNotNull() {
            addCriterion("DOCTYPETARGET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDoctypetargetIdEqualTo(Integer value) {
            addCriterion("DOCTYPETARGET_ID =", value, "doctypetargetId");
            return (Criteria) this;
        }

        public Criteria andDoctypetargetIdNotEqualTo(Integer value) {
            addCriterion("DOCTYPETARGET_ID <>", value, "doctypetargetId");
            return (Criteria) this;
        }

        public Criteria andDoctypetargetIdGreaterThan(Integer value) {
            addCriterion("DOCTYPETARGET_ID >", value, "doctypetargetId");
            return (Criteria) this;
        }

        public Criteria andDoctypetargetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOCTYPETARGET_ID >=", value, "doctypetargetId");
            return (Criteria) this;
        }

        public Criteria andDoctypetargetIdLessThan(Integer value) {
            addCriterion("DOCTYPETARGET_ID <", value, "doctypetargetId");
            return (Criteria) this;
        }

        public Criteria andDoctypetargetIdLessThanOrEqualTo(Integer value) {
            addCriterion("DOCTYPETARGET_ID <=", value, "doctypetargetId");
            return (Criteria) this;
        }

        public Criteria andDoctypetargetIdIn(List<Integer> values) {
            addCriterion("DOCTYPETARGET_ID in", values, "doctypetargetId");
            return (Criteria) this;
        }

        public Criteria andDoctypetargetIdNotIn(List<Integer> values) {
            addCriterion("DOCTYPETARGET_ID not in", values, "doctypetargetId");
            return (Criteria) this;
        }

        public Criteria andDoctypetargetIdBetween(Integer value1, Integer value2) {
            addCriterion("DOCTYPETARGET_ID between", value1, value2, "doctypetargetId");
            return (Criteria) this;
        }

        public Criteria andDoctypetargetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DOCTYPETARGET_ID not between", value1, value2, "doctypetargetId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("PROJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("PROJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("PROJECT_ID =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("PROJECT_ID <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("PROJECT_ID >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROJECT_ID >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("PROJECT_ID <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("PROJECT_ID <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("PROJECT_ID in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("PROJECT_ID not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("PROJECT_ID between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PROJECT_ID not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andPricelistIdIsNull() {
            addCriterion("PRICELIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andPricelistIdIsNotNull() {
            addCriterion("PRICELIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPricelistIdEqualTo(Integer value) {
            addCriterion("PRICELIST_ID =", value, "pricelistId");
            return (Criteria) this;
        }

        public Criteria andPricelistIdNotEqualTo(Integer value) {
            addCriterion("PRICELIST_ID <>", value, "pricelistId");
            return (Criteria) this;
        }

        public Criteria andPricelistIdGreaterThan(Integer value) {
            addCriterion("PRICELIST_ID >", value, "pricelistId");
            return (Criteria) this;
        }

        public Criteria andPricelistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRICELIST_ID >=", value, "pricelistId");
            return (Criteria) this;
        }

        public Criteria andPricelistIdLessThan(Integer value) {
            addCriterion("PRICELIST_ID <", value, "pricelistId");
            return (Criteria) this;
        }

        public Criteria andPricelistIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRICELIST_ID <=", value, "pricelistId");
            return (Criteria) this;
        }

        public Criteria andPricelistIdIn(List<Integer> values) {
            addCriterion("PRICELIST_ID in", values, "pricelistId");
            return (Criteria) this;
        }

        public Criteria andPricelistIdNotIn(List<Integer> values) {
            addCriterion("PRICELIST_ID not in", values, "pricelistId");
            return (Criteria) this;
        }

        public Criteria andPricelistIdBetween(Integer value1, Integer value2) {
            addCriterion("PRICELIST_ID between", value1, value2, "pricelistId");
            return (Criteria) this;
        }

        public Criteria andPricelistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRICELIST_ID not between", value1, value2, "pricelistId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNull() {
            addCriterion("WAREHOUSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("WAREHOUSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(Integer value) {
            addCriterion("WAREHOUSE_ID =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(Integer value) {
            addCriterion("WAREHOUSE_ID <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(Integer value) {
            addCriterion("WAREHOUSE_ID >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("WAREHOUSE_ID >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(Integer value) {
            addCriterion("WAREHOUSE_ID <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("WAREHOUSE_ID <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<Integer> values) {
            addCriterion("WAREHOUSE_ID in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<Integer> values) {
            addCriterion("WAREHOUSE_ID not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("WAREHOUSE_ID between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("WAREHOUSE_ID not between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andMwsAccessKeyIsNull() {
            addCriterion("MWS_ACCESS_KEY is null");
            return (Criteria) this;
        }

        public Criteria andMwsAccessKeyIsNotNull() {
            addCriterion("MWS_ACCESS_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andMwsAccessKeyEqualTo(String value) {
            addCriterion("MWS_ACCESS_KEY =", value, "mwsAccessKey");
            return (Criteria) this;
        }

        public Criteria andMwsAccessKeyNotEqualTo(String value) {
            addCriterion("MWS_ACCESS_KEY <>", value, "mwsAccessKey");
            return (Criteria) this;
        }

        public Criteria andMwsAccessKeyGreaterThan(String value) {
            addCriterion("MWS_ACCESS_KEY >", value, "mwsAccessKey");
            return (Criteria) this;
        }

        public Criteria andMwsAccessKeyGreaterThanOrEqualTo(String value) {
            addCriterion("MWS_ACCESS_KEY >=", value, "mwsAccessKey");
            return (Criteria) this;
        }

        public Criteria andMwsAccessKeyLessThan(String value) {
            addCriterion("MWS_ACCESS_KEY <", value, "mwsAccessKey");
            return (Criteria) this;
        }

        public Criteria andMwsAccessKeyLessThanOrEqualTo(String value) {
            addCriterion("MWS_ACCESS_KEY <=", value, "mwsAccessKey");
            return (Criteria) this;
        }

        public Criteria andMwsAccessKeyLike(String value) {
            addCriterion("MWS_ACCESS_KEY like", value, "mwsAccessKey");
            return (Criteria) this;
        }

        public Criteria andMwsAccessKeyNotLike(String value) {
            addCriterion("MWS_ACCESS_KEY not like", value, "mwsAccessKey");
            return (Criteria) this;
        }

        public Criteria andMwsAccessKeyIn(List<String> values) {
            addCriterion("MWS_ACCESS_KEY in", values, "mwsAccessKey");
            return (Criteria) this;
        }

        public Criteria andMwsAccessKeyNotIn(List<String> values) {
            addCriterion("MWS_ACCESS_KEY not in", values, "mwsAccessKey");
            return (Criteria) this;
        }

        public Criteria andMwsAccessKeyBetween(String value1, String value2) {
            addCriterion("MWS_ACCESS_KEY between", value1, value2, "mwsAccessKey");
            return (Criteria) this;
        }

        public Criteria andMwsAccessKeyNotBetween(String value1, String value2) {
            addCriterion("MWS_ACCESS_KEY not between", value1, value2, "mwsAccessKey");
            return (Criteria) this;
        }

        public Criteria andMwsMarketplaceIdIsNull() {
            addCriterion("MWS_MARKETPLACE_ID is null");
            return (Criteria) this;
        }

        public Criteria andMwsMarketplaceIdIsNotNull() {
            addCriterion("MWS_MARKETPLACE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMwsMarketplaceIdEqualTo(String value) {
            addCriterion("MWS_MARKETPLACE_ID =", value, "mwsMarketplaceId");
            return (Criteria) this;
        }

        public Criteria andMwsMarketplaceIdNotEqualTo(String value) {
            addCriterion("MWS_MARKETPLACE_ID <>", value, "mwsMarketplaceId");
            return (Criteria) this;
        }

        public Criteria andMwsMarketplaceIdGreaterThan(String value) {
            addCriterion("MWS_MARKETPLACE_ID >", value, "mwsMarketplaceId");
            return (Criteria) this;
        }

        public Criteria andMwsMarketplaceIdGreaterThanOrEqualTo(String value) {
            addCriterion("MWS_MARKETPLACE_ID >=", value, "mwsMarketplaceId");
            return (Criteria) this;
        }

        public Criteria andMwsMarketplaceIdLessThan(String value) {
            addCriterion("MWS_MARKETPLACE_ID <", value, "mwsMarketplaceId");
            return (Criteria) this;
        }

        public Criteria andMwsMarketplaceIdLessThanOrEqualTo(String value) {
            addCriterion("MWS_MARKETPLACE_ID <=", value, "mwsMarketplaceId");
            return (Criteria) this;
        }

        public Criteria andMwsMarketplaceIdLike(String value) {
            addCriterion("MWS_MARKETPLACE_ID like", value, "mwsMarketplaceId");
            return (Criteria) this;
        }

        public Criteria andMwsMarketplaceIdNotLike(String value) {
            addCriterion("MWS_MARKETPLACE_ID not like", value, "mwsMarketplaceId");
            return (Criteria) this;
        }

        public Criteria andMwsMarketplaceIdIn(List<String> values) {
            addCriterion("MWS_MARKETPLACE_ID in", values, "mwsMarketplaceId");
            return (Criteria) this;
        }

        public Criteria andMwsMarketplaceIdNotIn(List<String> values) {
            addCriterion("MWS_MARKETPLACE_ID not in", values, "mwsMarketplaceId");
            return (Criteria) this;
        }

        public Criteria andMwsMarketplaceIdBetween(String value1, String value2) {
            addCriterion("MWS_MARKETPLACE_ID between", value1, value2, "mwsMarketplaceId");
            return (Criteria) this;
        }

        public Criteria andMwsMarketplaceIdNotBetween(String value1, String value2) {
            addCriterion("MWS_MARKETPLACE_ID not between", value1, value2, "mwsMarketplaceId");
            return (Criteria) this;
        }

        public Criteria andMwsSecretKeyIsNull() {
            addCriterion("MWS_SECRET_KEY is null");
            return (Criteria) this;
        }

        public Criteria andMwsSecretKeyIsNotNull() {
            addCriterion("MWS_SECRET_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andMwsSecretKeyEqualTo(String value) {
            addCriterion("MWS_SECRET_KEY =", value, "mwsSecretKey");
            return (Criteria) this;
        }

        public Criteria andMwsSecretKeyNotEqualTo(String value) {
            addCriterion("MWS_SECRET_KEY <>", value, "mwsSecretKey");
            return (Criteria) this;
        }

        public Criteria andMwsSecretKeyGreaterThan(String value) {
            addCriterion("MWS_SECRET_KEY >", value, "mwsSecretKey");
            return (Criteria) this;
        }

        public Criteria andMwsSecretKeyGreaterThanOrEqualTo(String value) {
            addCriterion("MWS_SECRET_KEY >=", value, "mwsSecretKey");
            return (Criteria) this;
        }

        public Criteria andMwsSecretKeyLessThan(String value) {
            addCriterion("MWS_SECRET_KEY <", value, "mwsSecretKey");
            return (Criteria) this;
        }

        public Criteria andMwsSecretKeyLessThanOrEqualTo(String value) {
            addCriterion("MWS_SECRET_KEY <=", value, "mwsSecretKey");
            return (Criteria) this;
        }

        public Criteria andMwsSecretKeyLike(String value) {
            addCriterion("MWS_SECRET_KEY like", value, "mwsSecretKey");
            return (Criteria) this;
        }

        public Criteria andMwsSecretKeyNotLike(String value) {
            addCriterion("MWS_SECRET_KEY not like", value, "mwsSecretKey");
            return (Criteria) this;
        }

        public Criteria andMwsSecretKeyIn(List<String> values) {
            addCriterion("MWS_SECRET_KEY in", values, "mwsSecretKey");
            return (Criteria) this;
        }

        public Criteria andMwsSecretKeyNotIn(List<String> values) {
            addCriterion("MWS_SECRET_KEY not in", values, "mwsSecretKey");
            return (Criteria) this;
        }

        public Criteria andMwsSecretKeyBetween(String value1, String value2) {
            addCriterion("MWS_SECRET_KEY between", value1, value2, "mwsSecretKey");
            return (Criteria) this;
        }

        public Criteria andMwsSecretKeyNotBetween(String value1, String value2) {
            addCriterion("MWS_SECRET_KEY not between", value1, value2, "mwsSecretKey");
            return (Criteria) this;
        }

        public Criteria andMwsSellerIdIsNull() {
            addCriterion("MWS_SELLER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMwsSellerIdIsNotNull() {
            addCriterion("MWS_SELLER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMwsSellerIdEqualTo(String value) {
            addCriterion("MWS_SELLER_ID =", value, "mwsSellerId");
            return (Criteria) this;
        }

        public Criteria andMwsSellerIdNotEqualTo(String value) {
            addCriterion("MWS_SELLER_ID <>", value, "mwsSellerId");
            return (Criteria) this;
        }

        public Criteria andMwsSellerIdGreaterThan(String value) {
            addCriterion("MWS_SELLER_ID >", value, "mwsSellerId");
            return (Criteria) this;
        }

        public Criteria andMwsSellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("MWS_SELLER_ID >=", value, "mwsSellerId");
            return (Criteria) this;
        }

        public Criteria andMwsSellerIdLessThan(String value) {
            addCriterion("MWS_SELLER_ID <", value, "mwsSellerId");
            return (Criteria) this;
        }

        public Criteria andMwsSellerIdLessThanOrEqualTo(String value) {
            addCriterion("MWS_SELLER_ID <=", value, "mwsSellerId");
            return (Criteria) this;
        }

        public Criteria andMwsSellerIdLike(String value) {
            addCriterion("MWS_SELLER_ID like", value, "mwsSellerId");
            return (Criteria) this;
        }

        public Criteria andMwsSellerIdNotLike(String value) {
            addCriterion("MWS_SELLER_ID not like", value, "mwsSellerId");
            return (Criteria) this;
        }

        public Criteria andMwsSellerIdIn(List<String> values) {
            addCriterion("MWS_SELLER_ID in", values, "mwsSellerId");
            return (Criteria) this;
        }

        public Criteria andMwsSellerIdNotIn(List<String> values) {
            addCriterion("MWS_SELLER_ID not in", values, "mwsSellerId");
            return (Criteria) this;
        }

        public Criteria andMwsSellerIdBetween(String value1, String value2) {
            addCriterion("MWS_SELLER_ID between", value1, value2, "mwsSellerId");
            return (Criteria) this;
        }

        public Criteria andMwsSellerIdNotBetween(String value1, String value2) {
            addCriterion("MWS_SELLER_ID not between", value1, value2, "mwsSellerId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdIsNull() {
            addCriterion("SALESREP_ID is null");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdIsNotNull() {
            addCriterion("SALESREP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdEqualTo(Integer value) {
            addCriterion("SALESREP_ID =", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdNotEqualTo(Integer value) {
            addCriterion("SALESREP_ID <>", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdGreaterThan(Integer value) {
            addCriterion("SALESREP_ID >", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SALESREP_ID >=", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdLessThan(Integer value) {
            addCriterion("SALESREP_ID <", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdLessThanOrEqualTo(Integer value) {
            addCriterion("SALESREP_ID <=", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdIn(List<Integer> values) {
            addCriterion("SALESREP_ID in", values, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdNotIn(List<Integer> values) {
            addCriterion("SALESREP_ID not in", values, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdBetween(Integer value1, Integer value2) {
            addCriterion("SALESREP_ID between", value1, value2, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SALESREP_ID not between", value1, value2, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSelfWarehouseIdIsNull() {
            addCriterion("SELF_WAREHOUSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSelfWarehouseIdIsNotNull() {
            addCriterion("SELF_WAREHOUSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSelfWarehouseIdEqualTo(Integer value) {
            addCriterion("SELF_WAREHOUSE_ID =", value, "selfWarehouseId");
            return (Criteria) this;
        }

        public Criteria andSelfWarehouseIdNotEqualTo(Integer value) {
            addCriterion("SELF_WAREHOUSE_ID <>", value, "selfWarehouseId");
            return (Criteria) this;
        }

        public Criteria andSelfWarehouseIdGreaterThan(Integer value) {
            addCriterion("SELF_WAREHOUSE_ID >", value, "selfWarehouseId");
            return (Criteria) this;
        }

        public Criteria andSelfWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SELF_WAREHOUSE_ID >=", value, "selfWarehouseId");
            return (Criteria) this;
        }

        public Criteria andSelfWarehouseIdLessThan(Integer value) {
            addCriterion("SELF_WAREHOUSE_ID <", value, "selfWarehouseId");
            return (Criteria) this;
        }

        public Criteria andSelfWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("SELF_WAREHOUSE_ID <=", value, "selfWarehouseId");
            return (Criteria) this;
        }

        public Criteria andSelfWarehouseIdIn(List<Integer> values) {
            addCriterion("SELF_WAREHOUSE_ID in", values, "selfWarehouseId");
            return (Criteria) this;
        }

        public Criteria andSelfWarehouseIdNotIn(List<Integer> values) {
            addCriterion("SELF_WAREHOUSE_ID not in", values, "selfWarehouseId");
            return (Criteria) this;
        }

        public Criteria andSelfWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("SELF_WAREHOUSE_ID between", value1, value2, "selfWarehouseId");
            return (Criteria) this;
        }

        public Criteria andSelfWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SELF_WAREHOUSE_ID not between", value1, value2, "selfWarehouseId");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIsNull() {
            addCriterion("TIME_ZONE is null");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIsNotNull() {
            addCriterion("TIME_ZONE is not null");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEqualTo(String value) {
            addCriterion("TIME_ZONE =", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotEqualTo(String value) {
            addCriterion("TIME_ZONE <>", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneGreaterThan(String value) {
            addCriterion("TIME_ZONE >", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_ZONE >=", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneLessThan(String value) {
            addCriterion("TIME_ZONE <", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneLessThanOrEqualTo(String value) {
            addCriterion("TIME_ZONE <=", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneLike(String value) {
            addCriterion("TIME_ZONE like", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotLike(String value) {
            addCriterion("TIME_ZONE not like", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIn(List<String> values) {
            addCriterion("TIME_ZONE in", values, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotIn(List<String> values) {
            addCriterion("TIME_ZONE not in", values, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneBetween(String value1, String value2) {
            addCriterion("TIME_ZONE between", value1, value2, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotBetween(String value1, String value2) {
            addCriterion("TIME_ZONE not between", value1, value2, "timeZone");
            return (Criteria) this;
        }

        public Criteria andAmazonSalesChannelIsNull() {
            addCriterion("AMAZON_SALES_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andAmazonSalesChannelIsNotNull() {
            addCriterion("AMAZON_SALES_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonSalesChannelEqualTo(String value) {
            addCriterion("AMAZON_SALES_CHANNEL =", value, "amazonSalesChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonSalesChannelNotEqualTo(String value) {
            addCriterion("AMAZON_SALES_CHANNEL <>", value, "amazonSalesChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonSalesChannelGreaterThan(String value) {
            addCriterion("AMAZON_SALES_CHANNEL >", value, "amazonSalesChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonSalesChannelGreaterThanOrEqualTo(String value) {
            addCriterion("AMAZON_SALES_CHANNEL >=", value, "amazonSalesChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonSalesChannelLessThan(String value) {
            addCriterion("AMAZON_SALES_CHANNEL <", value, "amazonSalesChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonSalesChannelLessThanOrEqualTo(String value) {
            addCriterion("AMAZON_SALES_CHANNEL <=", value, "amazonSalesChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonSalesChannelLike(String value) {
            addCriterion("AMAZON_SALES_CHANNEL like", value, "amazonSalesChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonSalesChannelNotLike(String value) {
            addCriterion("AMAZON_SALES_CHANNEL not like", value, "amazonSalesChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonSalesChannelIn(List<String> values) {
            addCriterion("AMAZON_SALES_CHANNEL in", values, "amazonSalesChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonSalesChannelNotIn(List<String> values) {
            addCriterion("AMAZON_SALES_CHANNEL not in", values, "amazonSalesChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonSalesChannelBetween(String value1, String value2) {
            addCriterion("AMAZON_SALES_CHANNEL between", value1, value2, "amazonSalesChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonSalesChannelNotBetween(String value1, String value2) {
            addCriterion("AMAZON_SALES_CHANNEL not between", value1, value2, "amazonSalesChannel");
            return (Criteria) this;
        }

        public Criteria andIsNonamazonIncludedIsNull() {
            addCriterion("IS_NONAMAZON_INCLUDED is null");
            return (Criteria) this;
        }

        public Criteria andIsNonamazonIncludedIsNotNull() {
            addCriterion("IS_NONAMAZON_INCLUDED is not null");
            return (Criteria) this;
        }

        public Criteria andIsNonamazonIncludedEqualTo(String value) {
            addCriterion("IS_NONAMAZON_INCLUDED =", value, "isNonamazonIncluded");
            return (Criteria) this;
        }

        public Criteria andIsNonamazonIncludedNotEqualTo(String value) {
            addCriterion("IS_NONAMAZON_INCLUDED <>", value, "isNonamazonIncluded");
            return (Criteria) this;
        }

        public Criteria andIsNonamazonIncludedGreaterThan(String value) {
            addCriterion("IS_NONAMAZON_INCLUDED >", value, "isNonamazonIncluded");
            return (Criteria) this;
        }

        public Criteria andIsNonamazonIncludedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_NONAMAZON_INCLUDED >=", value, "isNonamazonIncluded");
            return (Criteria) this;
        }

        public Criteria andIsNonamazonIncludedLessThan(String value) {
            addCriterion("IS_NONAMAZON_INCLUDED <", value, "isNonamazonIncluded");
            return (Criteria) this;
        }

        public Criteria andIsNonamazonIncludedLessThanOrEqualTo(String value) {
            addCriterion("IS_NONAMAZON_INCLUDED <=", value, "isNonamazonIncluded");
            return (Criteria) this;
        }

        public Criteria andIsNonamazonIncludedLike(String value) {
            addCriterion("IS_NONAMAZON_INCLUDED like", value, "isNonamazonIncluded");
            return (Criteria) this;
        }

        public Criteria andIsNonamazonIncludedNotLike(String value) {
            addCriterion("IS_NONAMAZON_INCLUDED not like", value, "isNonamazonIncluded");
            return (Criteria) this;
        }

        public Criteria andIsNonamazonIncludedIn(List<String> values) {
            addCriterion("IS_NONAMAZON_INCLUDED in", values, "isNonamazonIncluded");
            return (Criteria) this;
        }

        public Criteria andIsNonamazonIncludedNotIn(List<String> values) {
            addCriterion("IS_NONAMAZON_INCLUDED not in", values, "isNonamazonIncluded");
            return (Criteria) this;
        }

        public Criteria andIsNonamazonIncludedBetween(String value1, String value2) {
            addCriterion("IS_NONAMAZON_INCLUDED between", value1, value2, "isNonamazonIncluded");
            return (Criteria) this;
        }

        public Criteria andIsNonamazonIncludedNotBetween(String value1, String value2) {
            addCriterion("IS_NONAMAZON_INCLUDED not between", value1, value2, "isNonamazonIncluded");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStorenameEbIsNull() {
            addCriterion("STORENAME_EB is null");
            return (Criteria) this;
        }

        public Criteria andStorenameEbIsNotNull() {
            addCriterion("STORENAME_EB is not null");
            return (Criteria) this;
        }

        public Criteria andStorenameEbEqualTo(String value) {
            addCriterion("STORENAME_EB =", value, "storenameEb");
            return (Criteria) this;
        }

        public Criteria andStorenameEbNotEqualTo(String value) {
            addCriterion("STORENAME_EB <>", value, "storenameEb");
            return (Criteria) this;
        }

        public Criteria andStorenameEbGreaterThan(String value) {
            addCriterion("STORENAME_EB >", value, "storenameEb");
            return (Criteria) this;
        }

        public Criteria andStorenameEbGreaterThanOrEqualTo(String value) {
            addCriterion("STORENAME_EB >=", value, "storenameEb");
            return (Criteria) this;
        }

        public Criteria andStorenameEbLessThan(String value) {
            addCriterion("STORENAME_EB <", value, "storenameEb");
            return (Criteria) this;
        }

        public Criteria andStorenameEbLessThanOrEqualTo(String value) {
            addCriterion("STORENAME_EB <=", value, "storenameEb");
            return (Criteria) this;
        }

        public Criteria andStorenameEbLike(String value) {
            addCriterion("STORENAME_EB like", value, "storenameEb");
            return (Criteria) this;
        }

        public Criteria andStorenameEbNotLike(String value) {
            addCriterion("STORENAME_EB not like", value, "storenameEb");
            return (Criteria) this;
        }

        public Criteria andStorenameEbIn(List<String> values) {
            addCriterion("STORENAME_EB in", values, "storenameEb");
            return (Criteria) this;
        }

        public Criteria andStorenameEbNotIn(List<String> values) {
            addCriterion("STORENAME_EB not in", values, "storenameEb");
            return (Criteria) this;
        }

        public Criteria andStorenameEbBetween(String value1, String value2) {
            addCriterion("STORENAME_EB between", value1, value2, "storenameEb");
            return (Criteria) this;
        }

        public Criteria andStorenameEbNotBetween(String value1, String value2) {
            addCriterion("STORENAME_EB not between", value1, value2, "storenameEb");
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