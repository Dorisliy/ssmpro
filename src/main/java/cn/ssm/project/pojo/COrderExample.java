package cn.ssm.project.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class COrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public COrderExample() {
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

        public Criteria andIsSotrxIsNull() {
            addCriterion("IS_SOTRX is null");
            return (Criteria) this;
        }

        public Criteria andIsSotrxIsNotNull() {
            addCriterion("IS_SOTRX is not null");
            return (Criteria) this;
        }

        public Criteria andIsSotrxEqualTo(String value) {
            addCriterion("IS_SOTRX =", value, "isSotrx");
            return (Criteria) this;
        }

        public Criteria andIsSotrxNotEqualTo(String value) {
            addCriterion("IS_SOTRX <>", value, "isSotrx");
            return (Criteria) this;
        }

        public Criteria andIsSotrxGreaterThan(String value) {
            addCriterion("IS_SOTRX >", value, "isSotrx");
            return (Criteria) this;
        }

        public Criteria andIsSotrxGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SOTRX >=", value, "isSotrx");
            return (Criteria) this;
        }

        public Criteria andIsSotrxLessThan(String value) {
            addCriterion("IS_SOTRX <", value, "isSotrx");
            return (Criteria) this;
        }

        public Criteria andIsSotrxLessThanOrEqualTo(String value) {
            addCriterion("IS_SOTRX <=", value, "isSotrx");
            return (Criteria) this;
        }

        public Criteria andIsSotrxLike(String value) {
            addCriterion("IS_SOTRX like", value, "isSotrx");
            return (Criteria) this;
        }

        public Criteria andIsSotrxNotLike(String value) {
            addCriterion("IS_SOTRX not like", value, "isSotrx");
            return (Criteria) this;
        }

        public Criteria andIsSotrxIn(List<String> values) {
            addCriterion("IS_SOTRX in", values, "isSotrx");
            return (Criteria) this;
        }

        public Criteria andIsSotrxNotIn(List<String> values) {
            addCriterion("IS_SOTRX not in", values, "isSotrx");
            return (Criteria) this;
        }

        public Criteria andIsSotrxBetween(String value1, String value2) {
            addCriterion("IS_SOTRX between", value1, value2, "isSotrx");
            return (Criteria) this;
        }

        public Criteria andIsSotrxNotBetween(String value1, String value2) {
            addCriterion("IS_SOTRX not between", value1, value2, "isSotrx");
            return (Criteria) this;
        }

        public Criteria andDocumentNoIsNull() {
            addCriterion("DOCUMENT_NO is null");
            return (Criteria) this;
        }

        public Criteria andDocumentNoIsNotNull() {
            addCriterion("DOCUMENT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentNoEqualTo(String value) {
            addCriterion("DOCUMENT_NO =", value, "documentNo");
            return (Criteria) this;
        }

        public Criteria andDocumentNoNotEqualTo(String value) {
            addCriterion("DOCUMENT_NO <>", value, "documentNo");
            return (Criteria) this;
        }

        public Criteria andDocumentNoGreaterThan(String value) {
            addCriterion("DOCUMENT_NO >", value, "documentNo");
            return (Criteria) this;
        }

        public Criteria andDocumentNoGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_NO >=", value, "documentNo");
            return (Criteria) this;
        }

        public Criteria andDocumentNoLessThan(String value) {
            addCriterion("DOCUMENT_NO <", value, "documentNo");
            return (Criteria) this;
        }

        public Criteria andDocumentNoLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_NO <=", value, "documentNo");
            return (Criteria) this;
        }

        public Criteria andDocumentNoLike(String value) {
            addCriterion("DOCUMENT_NO like", value, "documentNo");
            return (Criteria) this;
        }

        public Criteria andDocumentNoNotLike(String value) {
            addCriterion("DOCUMENT_NO not like", value, "documentNo");
            return (Criteria) this;
        }

        public Criteria andDocumentNoIn(List<String> values) {
            addCriterion("DOCUMENT_NO in", values, "documentNo");
            return (Criteria) this;
        }

        public Criteria andDocumentNoNotIn(List<String> values) {
            addCriterion("DOCUMENT_NO not in", values, "documentNo");
            return (Criteria) this;
        }

        public Criteria andDocumentNoBetween(String value1, String value2) {
            addCriterion("DOCUMENT_NO between", value1, value2, "documentNo");
            return (Criteria) this;
        }

        public Criteria andDocumentNoNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_NO not between", value1, value2, "documentNo");
            return (Criteria) this;
        }

        public Criteria andDocStatusIsNull() {
            addCriterion("DOC_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDocStatusIsNotNull() {
            addCriterion("DOC_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDocStatusEqualTo(String value) {
            addCriterion("DOC_STATUS =", value, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusNotEqualTo(String value) {
            addCriterion("DOC_STATUS <>", value, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusGreaterThan(String value) {
            addCriterion("DOC_STATUS >", value, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_STATUS >=", value, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusLessThan(String value) {
            addCriterion("DOC_STATUS <", value, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusLessThanOrEqualTo(String value) {
            addCriterion("DOC_STATUS <=", value, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusLike(String value) {
            addCriterion("DOC_STATUS like", value, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusNotLike(String value) {
            addCriterion("DOC_STATUS not like", value, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusIn(List<String> values) {
            addCriterion("DOC_STATUS in", values, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusNotIn(List<String> values) {
            addCriterion("DOC_STATUS not in", values, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusBetween(String value1, String value2) {
            addCriterion("DOC_STATUS between", value1, value2, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocStatusNotBetween(String value1, String value2) {
            addCriterion("DOC_STATUS not between", value1, value2, "docStatus");
            return (Criteria) this;
        }

        public Criteria andDocActionIsNull() {
            addCriterion("DOC_ACTION is null");
            return (Criteria) this;
        }

        public Criteria andDocActionIsNotNull() {
            addCriterion("DOC_ACTION is not null");
            return (Criteria) this;
        }

        public Criteria andDocActionEqualTo(String value) {
            addCriterion("DOC_ACTION =", value, "docAction");
            return (Criteria) this;
        }

        public Criteria andDocActionNotEqualTo(String value) {
            addCriterion("DOC_ACTION <>", value, "docAction");
            return (Criteria) this;
        }

        public Criteria andDocActionGreaterThan(String value) {
            addCriterion("DOC_ACTION >", value, "docAction");
            return (Criteria) this;
        }

        public Criteria andDocActionGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_ACTION >=", value, "docAction");
            return (Criteria) this;
        }

        public Criteria andDocActionLessThan(String value) {
            addCriterion("DOC_ACTION <", value, "docAction");
            return (Criteria) this;
        }

        public Criteria andDocActionLessThanOrEqualTo(String value) {
            addCriterion("DOC_ACTION <=", value, "docAction");
            return (Criteria) this;
        }

        public Criteria andDocActionLike(String value) {
            addCriterion("DOC_ACTION like", value, "docAction");
            return (Criteria) this;
        }

        public Criteria andDocActionNotLike(String value) {
            addCriterion("DOC_ACTION not like", value, "docAction");
            return (Criteria) this;
        }

        public Criteria andDocActionIn(List<String> values) {
            addCriterion("DOC_ACTION in", values, "docAction");
            return (Criteria) this;
        }

        public Criteria andDocActionNotIn(List<String> values) {
            addCriterion("DOC_ACTION not in", values, "docAction");
            return (Criteria) this;
        }

        public Criteria andDocActionBetween(String value1, String value2) {
            addCriterion("DOC_ACTION between", value1, value2, "docAction");
            return (Criteria) this;
        }

        public Criteria andDocActionNotBetween(String value1, String value2) {
            addCriterion("DOC_ACTION not between", value1, value2, "docAction");
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

        public Criteria andProcessedIsNull() {
            addCriterion("PROCESSED is null");
            return (Criteria) this;
        }

        public Criteria andProcessedIsNotNull() {
            addCriterion("PROCESSED is not null");
            return (Criteria) this;
        }

        public Criteria andProcessedEqualTo(String value) {
            addCriterion("PROCESSED =", value, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedNotEqualTo(String value) {
            addCriterion("PROCESSED <>", value, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedGreaterThan(String value) {
            addCriterion("PROCESSED >", value, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSED >=", value, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedLessThan(String value) {
            addCriterion("PROCESSED <", value, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedLessThanOrEqualTo(String value) {
            addCriterion("PROCESSED <=", value, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedLike(String value) {
            addCriterion("PROCESSED like", value, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedNotLike(String value) {
            addCriterion("PROCESSED not like", value, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedIn(List<String> values) {
            addCriterion("PROCESSED in", values, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedNotIn(List<String> values) {
            addCriterion("PROCESSED not in", values, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedBetween(String value1, String value2) {
            addCriterion("PROCESSED between", value1, value2, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedNotBetween(String value1, String value2) {
            addCriterion("PROCESSED not between", value1, value2, "processed");
            return (Criteria) this;
        }

        public Criteria andCDoctpyeIdIsNull() {
            addCriterion("C_DOCTPYE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCDoctpyeIdIsNotNull() {
            addCriterion("C_DOCTPYE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCDoctpyeIdEqualTo(Integer value) {
            addCriterion("C_DOCTPYE_ID =", value, "cDoctpyeId");
            return (Criteria) this;
        }

        public Criteria andCDoctpyeIdNotEqualTo(Integer value) {
            addCriterion("C_DOCTPYE_ID <>", value, "cDoctpyeId");
            return (Criteria) this;
        }

        public Criteria andCDoctpyeIdGreaterThan(Integer value) {
            addCriterion("C_DOCTPYE_ID >", value, "cDoctpyeId");
            return (Criteria) this;
        }

        public Criteria andCDoctpyeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_DOCTPYE_ID >=", value, "cDoctpyeId");
            return (Criteria) this;
        }

        public Criteria andCDoctpyeIdLessThan(Integer value) {
            addCriterion("C_DOCTPYE_ID <", value, "cDoctpyeId");
            return (Criteria) this;
        }

        public Criteria andCDoctpyeIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_DOCTPYE_ID <=", value, "cDoctpyeId");
            return (Criteria) this;
        }

        public Criteria andCDoctpyeIdIn(List<Integer> values) {
            addCriterion("C_DOCTPYE_ID in", values, "cDoctpyeId");
            return (Criteria) this;
        }

        public Criteria andCDoctpyeIdNotIn(List<Integer> values) {
            addCriterion("C_DOCTPYE_ID not in", values, "cDoctpyeId");
            return (Criteria) this;
        }

        public Criteria andCDoctpyeIdBetween(Integer value1, Integer value2) {
            addCriterion("C_DOCTPYE_ID between", value1, value2, "cDoctpyeId");
            return (Criteria) this;
        }

        public Criteria andCDoctpyeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_DOCTPYE_ID not between", value1, value2, "cDoctpyeId");
            return (Criteria) this;
        }

        public Criteria andCDoctypetargetIdIsNull() {
            addCriterion("C_DOCTYPETARGET_ID is null");
            return (Criteria) this;
        }

        public Criteria andCDoctypetargetIdIsNotNull() {
            addCriterion("C_DOCTYPETARGET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCDoctypetargetIdEqualTo(Integer value) {
            addCriterion("C_DOCTYPETARGET_ID =", value, "cDoctypetargetId");
            return (Criteria) this;
        }

        public Criteria andCDoctypetargetIdNotEqualTo(Integer value) {
            addCriterion("C_DOCTYPETARGET_ID <>", value, "cDoctypetargetId");
            return (Criteria) this;
        }

        public Criteria andCDoctypetargetIdGreaterThan(Integer value) {
            addCriterion("C_DOCTYPETARGET_ID >", value, "cDoctypetargetId");
            return (Criteria) this;
        }

        public Criteria andCDoctypetargetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_DOCTYPETARGET_ID >=", value, "cDoctypetargetId");
            return (Criteria) this;
        }

        public Criteria andCDoctypetargetIdLessThan(Integer value) {
            addCriterion("C_DOCTYPETARGET_ID <", value, "cDoctypetargetId");
            return (Criteria) this;
        }

        public Criteria andCDoctypetargetIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_DOCTYPETARGET_ID <=", value, "cDoctypetargetId");
            return (Criteria) this;
        }

        public Criteria andCDoctypetargetIdIn(List<Integer> values) {
            addCriterion("C_DOCTYPETARGET_ID in", values, "cDoctypetargetId");
            return (Criteria) this;
        }

        public Criteria andCDoctypetargetIdNotIn(List<Integer> values) {
            addCriterion("C_DOCTYPETARGET_ID not in", values, "cDoctypetargetId");
            return (Criteria) this;
        }

        public Criteria andCDoctypetargetIdBetween(Integer value1, Integer value2) {
            addCriterion("C_DOCTYPETARGET_ID between", value1, value2, "cDoctypetargetId");
            return (Criteria) this;
        }

        public Criteria andCDoctypetargetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_DOCTYPETARGET_ID not between", value1, value2, "cDoctypetargetId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andIsApprovedIsNull() {
            addCriterion("IS_APPROVED is null");
            return (Criteria) this;
        }

        public Criteria andIsApprovedIsNotNull() {
            addCriterion("IS_APPROVED is not null");
            return (Criteria) this;
        }

        public Criteria andIsApprovedEqualTo(String value) {
            addCriterion("IS_APPROVED =", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedNotEqualTo(String value) {
            addCriterion("IS_APPROVED <>", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedGreaterThan(String value) {
            addCriterion("IS_APPROVED >", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_APPROVED >=", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedLessThan(String value) {
            addCriterion("IS_APPROVED <", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedLessThanOrEqualTo(String value) {
            addCriterion("IS_APPROVED <=", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedLike(String value) {
            addCriterion("IS_APPROVED like", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedNotLike(String value) {
            addCriterion("IS_APPROVED not like", value, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedIn(List<String> values) {
            addCriterion("IS_APPROVED in", values, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedNotIn(List<String> values) {
            addCriterion("IS_APPROVED not in", values, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedBetween(String value1, String value2) {
            addCriterion("IS_APPROVED between", value1, value2, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsApprovedNotBetween(String value1, String value2) {
            addCriterion("IS_APPROVED not between", value1, value2, "isApproved");
            return (Criteria) this;
        }

        public Criteria andIsCreditApprovedIsNull() {
            addCriterion("IS_CREDIT_APPROVED is null");
            return (Criteria) this;
        }

        public Criteria andIsCreditApprovedIsNotNull() {
            addCriterion("IS_CREDIT_APPROVED is not null");
            return (Criteria) this;
        }

        public Criteria andIsCreditApprovedEqualTo(String value) {
            addCriterion("IS_CREDIT_APPROVED =", value, "isCreditApproved");
            return (Criteria) this;
        }

        public Criteria andIsCreditApprovedNotEqualTo(String value) {
            addCriterion("IS_CREDIT_APPROVED <>", value, "isCreditApproved");
            return (Criteria) this;
        }

        public Criteria andIsCreditApprovedGreaterThan(String value) {
            addCriterion("IS_CREDIT_APPROVED >", value, "isCreditApproved");
            return (Criteria) this;
        }

        public Criteria andIsCreditApprovedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CREDIT_APPROVED >=", value, "isCreditApproved");
            return (Criteria) this;
        }

        public Criteria andIsCreditApprovedLessThan(String value) {
            addCriterion("IS_CREDIT_APPROVED <", value, "isCreditApproved");
            return (Criteria) this;
        }

        public Criteria andIsCreditApprovedLessThanOrEqualTo(String value) {
            addCriterion("IS_CREDIT_APPROVED <=", value, "isCreditApproved");
            return (Criteria) this;
        }

        public Criteria andIsCreditApprovedLike(String value) {
            addCriterion("IS_CREDIT_APPROVED like", value, "isCreditApproved");
            return (Criteria) this;
        }

        public Criteria andIsCreditApprovedNotLike(String value) {
            addCriterion("IS_CREDIT_APPROVED not like", value, "isCreditApproved");
            return (Criteria) this;
        }

        public Criteria andIsCreditApprovedIn(List<String> values) {
            addCriterion("IS_CREDIT_APPROVED in", values, "isCreditApproved");
            return (Criteria) this;
        }

        public Criteria andIsCreditApprovedNotIn(List<String> values) {
            addCriterion("IS_CREDIT_APPROVED not in", values, "isCreditApproved");
            return (Criteria) this;
        }

        public Criteria andIsCreditApprovedBetween(String value1, String value2) {
            addCriterion("IS_CREDIT_APPROVED between", value1, value2, "isCreditApproved");
            return (Criteria) this;
        }

        public Criteria andIsCreditApprovedNotBetween(String value1, String value2) {
            addCriterion("IS_CREDIT_APPROVED not between", value1, value2, "isCreditApproved");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredIsNull() {
            addCriterion("IS_DELIVERED is null");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredIsNotNull() {
            addCriterion("IS_DELIVERED is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredEqualTo(String value) {
            addCriterion("IS_DELIVERED =", value, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredNotEqualTo(String value) {
            addCriterion("IS_DELIVERED <>", value, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredGreaterThan(String value) {
            addCriterion("IS_DELIVERED >", value, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DELIVERED >=", value, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredLessThan(String value) {
            addCriterion("IS_DELIVERED <", value, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredLessThanOrEqualTo(String value) {
            addCriterion("IS_DELIVERED <=", value, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredLike(String value) {
            addCriterion("IS_DELIVERED like", value, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredNotLike(String value) {
            addCriterion("IS_DELIVERED not like", value, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredIn(List<String> values) {
            addCriterion("IS_DELIVERED in", values, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredNotIn(List<String> values) {
            addCriterion("IS_DELIVERED not in", values, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredBetween(String value1, String value2) {
            addCriterion("IS_DELIVERED between", value1, value2, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsDeliveredNotBetween(String value1, String value2) {
            addCriterion("IS_DELIVERED not between", value1, value2, "isDelivered");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedIsNull() {
            addCriterion("IS_INVOICED is null");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedIsNotNull() {
            addCriterion("IS_INVOICED is not null");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedEqualTo(String value) {
            addCriterion("IS_INVOICED =", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedNotEqualTo(String value) {
            addCriterion("IS_INVOICED <>", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedGreaterThan(String value) {
            addCriterion("IS_INVOICED >", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_INVOICED >=", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedLessThan(String value) {
            addCriterion("IS_INVOICED <", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedLessThanOrEqualTo(String value) {
            addCriterion("IS_INVOICED <=", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedLike(String value) {
            addCriterion("IS_INVOICED like", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedNotLike(String value) {
            addCriterion("IS_INVOICED not like", value, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedIn(List<String> values) {
            addCriterion("IS_INVOICED in", values, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedNotIn(List<String> values) {
            addCriterion("IS_INVOICED not in", values, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedBetween(String value1, String value2) {
            addCriterion("IS_INVOICED between", value1, value2, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsInvoicedNotBetween(String value1, String value2) {
            addCriterion("IS_INVOICED not between", value1, value2, "isInvoiced");
            return (Criteria) this;
        }

        public Criteria andIsPrintedIsNull() {
            addCriterion("IS_PRINTED is null");
            return (Criteria) this;
        }

        public Criteria andIsPrintedIsNotNull() {
            addCriterion("IS_PRINTED is not null");
            return (Criteria) this;
        }

        public Criteria andIsPrintedEqualTo(String value) {
            addCriterion("IS_PRINTED =", value, "isPrinted");
            return (Criteria) this;
        }

        public Criteria andIsPrintedNotEqualTo(String value) {
            addCriterion("IS_PRINTED <>", value, "isPrinted");
            return (Criteria) this;
        }

        public Criteria andIsPrintedGreaterThan(String value) {
            addCriterion("IS_PRINTED >", value, "isPrinted");
            return (Criteria) this;
        }

        public Criteria andIsPrintedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PRINTED >=", value, "isPrinted");
            return (Criteria) this;
        }

        public Criteria andIsPrintedLessThan(String value) {
            addCriterion("IS_PRINTED <", value, "isPrinted");
            return (Criteria) this;
        }

        public Criteria andIsPrintedLessThanOrEqualTo(String value) {
            addCriterion("IS_PRINTED <=", value, "isPrinted");
            return (Criteria) this;
        }

        public Criteria andIsPrintedLike(String value) {
            addCriterion("IS_PRINTED like", value, "isPrinted");
            return (Criteria) this;
        }

        public Criteria andIsPrintedNotLike(String value) {
            addCriterion("IS_PRINTED not like", value, "isPrinted");
            return (Criteria) this;
        }

        public Criteria andIsPrintedIn(List<String> values) {
            addCriterion("IS_PRINTED in", values, "isPrinted");
            return (Criteria) this;
        }

        public Criteria andIsPrintedNotIn(List<String> values) {
            addCriterion("IS_PRINTED not in", values, "isPrinted");
            return (Criteria) this;
        }

        public Criteria andIsPrintedBetween(String value1, String value2) {
            addCriterion("IS_PRINTED between", value1, value2, "isPrinted");
            return (Criteria) this;
        }

        public Criteria andIsPrintedNotBetween(String value1, String value2) {
            addCriterion("IS_PRINTED not between", value1, value2, "isPrinted");
            return (Criteria) this;
        }

        public Criteria andIsTransferredIsNull() {
            addCriterion("IS_TRANSFERRED is null");
            return (Criteria) this;
        }

        public Criteria andIsTransferredIsNotNull() {
            addCriterion("IS_TRANSFERRED is not null");
            return (Criteria) this;
        }

        public Criteria andIsTransferredEqualTo(String value) {
            addCriterion("IS_TRANSFERRED =", value, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredNotEqualTo(String value) {
            addCriterion("IS_TRANSFERRED <>", value, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredGreaterThan(String value) {
            addCriterion("IS_TRANSFERRED >", value, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredGreaterThanOrEqualTo(String value) {
            addCriterion("IS_TRANSFERRED >=", value, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredLessThan(String value) {
            addCriterion("IS_TRANSFERRED <", value, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredLessThanOrEqualTo(String value) {
            addCriterion("IS_TRANSFERRED <=", value, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredLike(String value) {
            addCriterion("IS_TRANSFERRED like", value, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredNotLike(String value) {
            addCriterion("IS_TRANSFERRED not like", value, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredIn(List<String> values) {
            addCriterion("IS_TRANSFERRED in", values, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredNotIn(List<String> values) {
            addCriterion("IS_TRANSFERRED not in", values, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredBetween(String value1, String value2) {
            addCriterion("IS_TRANSFERRED between", value1, value2, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredNotBetween(String value1, String value2) {
            addCriterion("IS_TRANSFERRED not between", value1, value2, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsSelectedIsNull() {
            addCriterion("IS_SELECTED is null");
            return (Criteria) this;
        }

        public Criteria andIsSelectedIsNotNull() {
            addCriterion("IS_SELECTED is not null");
            return (Criteria) this;
        }

        public Criteria andIsSelectedEqualTo(String value) {
            addCriterion("IS_SELECTED =", value, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedNotEqualTo(String value) {
            addCriterion("IS_SELECTED <>", value, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedGreaterThan(String value) {
            addCriterion("IS_SELECTED >", value, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SELECTED >=", value, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedLessThan(String value) {
            addCriterion("IS_SELECTED <", value, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedLessThanOrEqualTo(String value) {
            addCriterion("IS_SELECTED <=", value, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedLike(String value) {
            addCriterion("IS_SELECTED like", value, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedNotLike(String value) {
            addCriterion("IS_SELECTED not like", value, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedIn(List<String> values) {
            addCriterion("IS_SELECTED in", values, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedNotIn(List<String> values) {
            addCriterion("IS_SELECTED not in", values, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedBetween(String value1, String value2) {
            addCriterion("IS_SELECTED between", value1, value2, "isSelected");
            return (Criteria) this;
        }

        public Criteria andIsSelectedNotBetween(String value1, String value2) {
            addCriterion("IS_SELECTED not between", value1, value2, "isSelected");
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

        public Criteria andDateOrderedIsNull() {
            addCriterion("DATE_ORDERED is null");
            return (Criteria) this;
        }

        public Criteria andDateOrderedIsNotNull() {
            addCriterion("DATE_ORDERED is not null");
            return (Criteria) this;
        }

        public Criteria andDateOrderedEqualTo(Date value) {
            addCriterion("DATE_ORDERED =", value, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDateOrderedNotEqualTo(Date value) {
            addCriterion("DATE_ORDERED <>", value, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDateOrderedGreaterThan(Date value) {
            addCriterion("DATE_ORDERED >", value, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDateOrderedGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_ORDERED >=", value, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDateOrderedLessThan(Date value) {
            addCriterion("DATE_ORDERED <", value, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDateOrderedLessThanOrEqualTo(Date value) {
            addCriterion("DATE_ORDERED <=", value, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDateOrderedIn(List<Date> values) {
            addCriterion("DATE_ORDERED in", values, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDateOrderedNotIn(List<Date> values) {
            addCriterion("DATE_ORDERED not in", values, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDateOrderedBetween(Date value1, Date value2) {
            addCriterion("DATE_ORDERED between", value1, value2, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDateOrderedNotBetween(Date value1, Date value2) {
            addCriterion("DATE_ORDERED not between", value1, value2, "dateOrdered");
            return (Criteria) this;
        }

        public Criteria andDatePromisedIsNull() {
            addCriterion("DATE_PROMISED is null");
            return (Criteria) this;
        }

        public Criteria andDatePromisedIsNotNull() {
            addCriterion("DATE_PROMISED is not null");
            return (Criteria) this;
        }

        public Criteria andDatePromisedEqualTo(Date value) {
            addCriterion("DATE_PROMISED =", value, "datePromised");
            return (Criteria) this;
        }

        public Criteria andDatePromisedNotEqualTo(Date value) {
            addCriterion("DATE_PROMISED <>", value, "datePromised");
            return (Criteria) this;
        }

        public Criteria andDatePromisedGreaterThan(Date value) {
            addCriterion("DATE_PROMISED >", value, "datePromised");
            return (Criteria) this;
        }

        public Criteria andDatePromisedGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_PROMISED >=", value, "datePromised");
            return (Criteria) this;
        }

        public Criteria andDatePromisedLessThan(Date value) {
            addCriterion("DATE_PROMISED <", value, "datePromised");
            return (Criteria) this;
        }

        public Criteria andDatePromisedLessThanOrEqualTo(Date value) {
            addCriterion("DATE_PROMISED <=", value, "datePromised");
            return (Criteria) this;
        }

        public Criteria andDatePromisedIn(List<Date> values) {
            addCriterion("DATE_PROMISED in", values, "datePromised");
            return (Criteria) this;
        }

        public Criteria andDatePromisedNotIn(List<Date> values) {
            addCriterion("DATE_PROMISED not in", values, "datePromised");
            return (Criteria) this;
        }

        public Criteria andDatePromisedBetween(Date value1, Date value2) {
            addCriterion("DATE_PROMISED between", value1, value2, "datePromised");
            return (Criteria) this;
        }

        public Criteria andDatePromisedNotBetween(Date value1, Date value2) {
            addCriterion("DATE_PROMISED not between", value1, value2, "datePromised");
            return (Criteria) this;
        }

        public Criteria andDatePrintedIsNull() {
            addCriterion("DATE_PRINTED is null");
            return (Criteria) this;
        }

        public Criteria andDatePrintedIsNotNull() {
            addCriterion("DATE_PRINTED is not null");
            return (Criteria) this;
        }

        public Criteria andDatePrintedEqualTo(Date value) {
            addCriterion("DATE_PRINTED =", value, "datePrinted");
            return (Criteria) this;
        }

        public Criteria andDatePrintedNotEqualTo(Date value) {
            addCriterion("DATE_PRINTED <>", value, "datePrinted");
            return (Criteria) this;
        }

        public Criteria andDatePrintedGreaterThan(Date value) {
            addCriterion("DATE_PRINTED >", value, "datePrinted");
            return (Criteria) this;
        }

        public Criteria andDatePrintedGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_PRINTED >=", value, "datePrinted");
            return (Criteria) this;
        }

        public Criteria andDatePrintedLessThan(Date value) {
            addCriterion("DATE_PRINTED <", value, "datePrinted");
            return (Criteria) this;
        }

        public Criteria andDatePrintedLessThanOrEqualTo(Date value) {
            addCriterion("DATE_PRINTED <=", value, "datePrinted");
            return (Criteria) this;
        }

        public Criteria andDatePrintedIn(List<Date> values) {
            addCriterion("DATE_PRINTED in", values, "datePrinted");
            return (Criteria) this;
        }

        public Criteria andDatePrintedNotIn(List<Date> values) {
            addCriterion("DATE_PRINTED not in", values, "datePrinted");
            return (Criteria) this;
        }

        public Criteria andDatePrintedBetween(Date value1, Date value2) {
            addCriterion("DATE_PRINTED between", value1, value2, "datePrinted");
            return (Criteria) this;
        }

        public Criteria andDatePrintedNotBetween(Date value1, Date value2) {
            addCriterion("DATE_PRINTED not between", value1, value2, "datePrinted");
            return (Criteria) this;
        }

        public Criteria andDateAcctIsNull() {
            addCriterion("DATE_ACCT is null");
            return (Criteria) this;
        }

        public Criteria andDateAcctIsNotNull() {
            addCriterion("DATE_ACCT is not null");
            return (Criteria) this;
        }

        public Criteria andDateAcctEqualTo(Date value) {
            addCriterion("DATE_ACCT =", value, "dateAcct");
            return (Criteria) this;
        }

        public Criteria andDateAcctNotEqualTo(Date value) {
            addCriterion("DATE_ACCT <>", value, "dateAcct");
            return (Criteria) this;
        }

        public Criteria andDateAcctGreaterThan(Date value) {
            addCriterion("DATE_ACCT >", value, "dateAcct");
            return (Criteria) this;
        }

        public Criteria andDateAcctGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_ACCT >=", value, "dateAcct");
            return (Criteria) this;
        }

        public Criteria andDateAcctLessThan(Date value) {
            addCriterion("DATE_ACCT <", value, "dateAcct");
            return (Criteria) this;
        }

        public Criteria andDateAcctLessThanOrEqualTo(Date value) {
            addCriterion("DATE_ACCT <=", value, "dateAcct");
            return (Criteria) this;
        }

        public Criteria andDateAcctIn(List<Date> values) {
            addCriterion("DATE_ACCT in", values, "dateAcct");
            return (Criteria) this;
        }

        public Criteria andDateAcctNotIn(List<Date> values) {
            addCriterion("DATE_ACCT not in", values, "dateAcct");
            return (Criteria) this;
        }

        public Criteria andDateAcctBetween(Date value1, Date value2) {
            addCriterion("DATE_ACCT between", value1, value2, "dateAcct");
            return (Criteria) this;
        }

        public Criteria andDateAcctNotBetween(Date value1, Date value2) {
            addCriterion("DATE_ACCT not between", value1, value2, "dateAcct");
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

        public Criteria andBpartnerLocationIdIsNull() {
            addCriterion("BPARTNER_LOCATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andBpartnerLocationIdIsNotNull() {
            addCriterion("BPARTNER_LOCATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBpartnerLocationIdEqualTo(Integer value) {
            addCriterion("BPARTNER_LOCATION_ID =", value, "bpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andBpartnerLocationIdNotEqualTo(Integer value) {
            addCriterion("BPARTNER_LOCATION_ID <>", value, "bpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andBpartnerLocationIdGreaterThan(Integer value) {
            addCriterion("BPARTNER_LOCATION_ID >", value, "bpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andBpartnerLocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BPARTNER_LOCATION_ID >=", value, "bpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andBpartnerLocationIdLessThan(Integer value) {
            addCriterion("BPARTNER_LOCATION_ID <", value, "bpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andBpartnerLocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("BPARTNER_LOCATION_ID <=", value, "bpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andBpartnerLocationIdIn(List<Integer> values) {
            addCriterion("BPARTNER_LOCATION_ID in", values, "bpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andBpartnerLocationIdNotIn(List<Integer> values) {
            addCriterion("BPARTNER_LOCATION_ID not in", values, "bpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andBpartnerLocationIdBetween(Integer value1, Integer value2) {
            addCriterion("BPARTNER_LOCATION_ID between", value1, value2, "bpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andBpartnerLocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BPARTNER_LOCATION_ID not between", value1, value2, "bpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andPoreferenceIsNull() {
            addCriterion("POREFERENCE is null");
            return (Criteria) this;
        }

        public Criteria andPoreferenceIsNotNull() {
            addCriterion("POREFERENCE is not null");
            return (Criteria) this;
        }

        public Criteria andPoreferenceEqualTo(String value) {
            addCriterion("POREFERENCE =", value, "poreference");
            return (Criteria) this;
        }

        public Criteria andPoreferenceNotEqualTo(String value) {
            addCriterion("POREFERENCE <>", value, "poreference");
            return (Criteria) this;
        }

        public Criteria andPoreferenceGreaterThan(String value) {
            addCriterion("POREFERENCE >", value, "poreference");
            return (Criteria) this;
        }

        public Criteria andPoreferenceGreaterThanOrEqualTo(String value) {
            addCriterion("POREFERENCE >=", value, "poreference");
            return (Criteria) this;
        }

        public Criteria andPoreferenceLessThan(String value) {
            addCriterion("POREFERENCE <", value, "poreference");
            return (Criteria) this;
        }

        public Criteria andPoreferenceLessThanOrEqualTo(String value) {
            addCriterion("POREFERENCE <=", value, "poreference");
            return (Criteria) this;
        }

        public Criteria andPoreferenceLike(String value) {
            addCriterion("POREFERENCE like", value, "poreference");
            return (Criteria) this;
        }

        public Criteria andPoreferenceNotLike(String value) {
            addCriterion("POREFERENCE not like", value, "poreference");
            return (Criteria) this;
        }

        public Criteria andPoreferenceIn(List<String> values) {
            addCriterion("POREFERENCE in", values, "poreference");
            return (Criteria) this;
        }

        public Criteria andPoreferenceNotIn(List<String> values) {
            addCriterion("POREFERENCE not in", values, "poreference");
            return (Criteria) this;
        }

        public Criteria andPoreferenceBetween(String value1, String value2) {
            addCriterion("POREFERENCE between", value1, value2, "poreference");
            return (Criteria) this;
        }

        public Criteria andPoreferenceNotBetween(String value1, String value2) {
            addCriterion("POREFERENCE not between", value1, value2, "poreference");
            return (Criteria) this;
        }

        public Criteria andIsDiscountPrintedIsNull() {
            addCriterion("IS_DISCOUNT_PRINTED is null");
            return (Criteria) this;
        }

        public Criteria andIsDiscountPrintedIsNotNull() {
            addCriterion("IS_DISCOUNT_PRINTED is not null");
            return (Criteria) this;
        }

        public Criteria andIsDiscountPrintedEqualTo(String value) {
            addCriterion("IS_DISCOUNT_PRINTED =", value, "isDiscountPrinted");
            return (Criteria) this;
        }

        public Criteria andIsDiscountPrintedNotEqualTo(String value) {
            addCriterion("IS_DISCOUNT_PRINTED <>", value, "isDiscountPrinted");
            return (Criteria) this;
        }

        public Criteria andIsDiscountPrintedGreaterThan(String value) {
            addCriterion("IS_DISCOUNT_PRINTED >", value, "isDiscountPrinted");
            return (Criteria) this;
        }

        public Criteria andIsDiscountPrintedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DISCOUNT_PRINTED >=", value, "isDiscountPrinted");
            return (Criteria) this;
        }

        public Criteria andIsDiscountPrintedLessThan(String value) {
            addCriterion("IS_DISCOUNT_PRINTED <", value, "isDiscountPrinted");
            return (Criteria) this;
        }

        public Criteria andIsDiscountPrintedLessThanOrEqualTo(String value) {
            addCriterion("IS_DISCOUNT_PRINTED <=", value, "isDiscountPrinted");
            return (Criteria) this;
        }

        public Criteria andIsDiscountPrintedLike(String value) {
            addCriterion("IS_DISCOUNT_PRINTED like", value, "isDiscountPrinted");
            return (Criteria) this;
        }

        public Criteria andIsDiscountPrintedNotLike(String value) {
            addCriterion("IS_DISCOUNT_PRINTED not like", value, "isDiscountPrinted");
            return (Criteria) this;
        }

        public Criteria andIsDiscountPrintedIn(List<String> values) {
            addCriterion("IS_DISCOUNT_PRINTED in", values, "isDiscountPrinted");
            return (Criteria) this;
        }

        public Criteria andIsDiscountPrintedNotIn(List<String> values) {
            addCriterion("IS_DISCOUNT_PRINTED not in", values, "isDiscountPrinted");
            return (Criteria) this;
        }

        public Criteria andIsDiscountPrintedBetween(String value1, String value2) {
            addCriterion("IS_DISCOUNT_PRINTED between", value1, value2, "isDiscountPrinted");
            return (Criteria) this;
        }

        public Criteria andIsDiscountPrintedNotBetween(String value1, String value2) {
            addCriterion("IS_DISCOUNT_PRINTED not between", value1, value2, "isDiscountPrinted");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNull() {
            addCriterion("CURRENCY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNotNull() {
            addCriterion("CURRENCY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdEqualTo(Integer value) {
            addCriterion("CURRENCY_ID =", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotEqualTo(Integer value) {
            addCriterion("CURRENCY_ID <>", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThan(Integer value) {
            addCriterion("CURRENCY_ID >", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CURRENCY_ID >=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThan(Integer value) {
            addCriterion("CURRENCY_ID <", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThanOrEqualTo(Integer value) {
            addCriterion("CURRENCY_ID <=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIn(List<Integer> values) {
            addCriterion("CURRENCY_ID in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotIn(List<Integer> values) {
            addCriterion("CURRENCY_ID not in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdBetween(Integer value1, Integer value2) {
            addCriterion("CURRENCY_ID between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CURRENCY_ID not between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andPaymentRuleIsNull() {
            addCriterion("PAYMENT_RULE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentRuleIsNotNull() {
            addCriterion("PAYMENT_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentRuleEqualTo(String value) {
            addCriterion("PAYMENT_RULE =", value, "paymentRule");
            return (Criteria) this;
        }

        public Criteria andPaymentRuleNotEqualTo(String value) {
            addCriterion("PAYMENT_RULE <>", value, "paymentRule");
            return (Criteria) this;
        }

        public Criteria andPaymentRuleGreaterThan(String value) {
            addCriterion("PAYMENT_RULE >", value, "paymentRule");
            return (Criteria) this;
        }

        public Criteria andPaymentRuleGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_RULE >=", value, "paymentRule");
            return (Criteria) this;
        }

        public Criteria andPaymentRuleLessThan(String value) {
            addCriterion("PAYMENT_RULE <", value, "paymentRule");
            return (Criteria) this;
        }

        public Criteria andPaymentRuleLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_RULE <=", value, "paymentRule");
            return (Criteria) this;
        }

        public Criteria andPaymentRuleLike(String value) {
            addCriterion("PAYMENT_RULE like", value, "paymentRule");
            return (Criteria) this;
        }

        public Criteria andPaymentRuleNotLike(String value) {
            addCriterion("PAYMENT_RULE not like", value, "paymentRule");
            return (Criteria) this;
        }

        public Criteria andPaymentRuleIn(List<String> values) {
            addCriterion("PAYMENT_RULE in", values, "paymentRule");
            return (Criteria) this;
        }

        public Criteria andPaymentRuleNotIn(List<String> values) {
            addCriterion("PAYMENT_RULE not in", values, "paymentRule");
            return (Criteria) this;
        }

        public Criteria andPaymentRuleBetween(String value1, String value2) {
            addCriterion("PAYMENT_RULE between", value1, value2, "paymentRule");
            return (Criteria) this;
        }

        public Criteria andPaymentRuleNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_RULE not between", value1, value2, "paymentRule");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdIsNull() {
            addCriterion("PAYMENT_TERM_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdIsNotNull() {
            addCriterion("PAYMENT_TERM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdEqualTo(Integer value) {
            addCriterion("PAYMENT_TERM_ID =", value, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdNotEqualTo(Integer value) {
            addCriterion("PAYMENT_TERM_ID <>", value, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdGreaterThan(Integer value) {
            addCriterion("PAYMENT_TERM_ID >", value, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_TERM_ID >=", value, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdLessThan(Integer value) {
            addCriterion("PAYMENT_TERM_ID <", value, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_TERM_ID <=", value, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdIn(List<Integer> values) {
            addCriterion("PAYMENT_TERM_ID in", values, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdNotIn(List<Integer> values) {
            addCriterion("PAYMENT_TERM_ID not in", values, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_TERM_ID between", value1, value2, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_TERM_ID not between", value1, value2, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andInvoiceRuleIsNull() {
            addCriterion("INVOICE_RULE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceRuleIsNotNull() {
            addCriterion("INVOICE_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceRuleEqualTo(String value) {
            addCriterion("INVOICE_RULE =", value, "invoiceRule");
            return (Criteria) this;
        }

        public Criteria andInvoiceRuleNotEqualTo(String value) {
            addCriterion("INVOICE_RULE <>", value, "invoiceRule");
            return (Criteria) this;
        }

        public Criteria andInvoiceRuleGreaterThan(String value) {
            addCriterion("INVOICE_RULE >", value, "invoiceRule");
            return (Criteria) this;
        }

        public Criteria andInvoiceRuleGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_RULE >=", value, "invoiceRule");
            return (Criteria) this;
        }

        public Criteria andInvoiceRuleLessThan(String value) {
            addCriterion("INVOICE_RULE <", value, "invoiceRule");
            return (Criteria) this;
        }

        public Criteria andInvoiceRuleLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_RULE <=", value, "invoiceRule");
            return (Criteria) this;
        }

        public Criteria andInvoiceRuleLike(String value) {
            addCriterion("INVOICE_RULE like", value, "invoiceRule");
            return (Criteria) this;
        }

        public Criteria andInvoiceRuleNotLike(String value) {
            addCriterion("INVOICE_RULE not like", value, "invoiceRule");
            return (Criteria) this;
        }

        public Criteria andInvoiceRuleIn(List<String> values) {
            addCriterion("INVOICE_RULE in", values, "invoiceRule");
            return (Criteria) this;
        }

        public Criteria andInvoiceRuleNotIn(List<String> values) {
            addCriterion("INVOICE_RULE not in", values, "invoiceRule");
            return (Criteria) this;
        }

        public Criteria andInvoiceRuleBetween(String value1, String value2) {
            addCriterion("INVOICE_RULE between", value1, value2, "invoiceRule");
            return (Criteria) this;
        }

        public Criteria andInvoiceRuleNotBetween(String value1, String value2) {
            addCriterion("INVOICE_RULE not between", value1, value2, "invoiceRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryRuleIsNull() {
            addCriterion("DELIVERY_RULE is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryRuleIsNotNull() {
            addCriterion("DELIVERY_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryRuleEqualTo(String value) {
            addCriterion("DELIVERY_RULE =", value, "deliveryRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryRuleNotEqualTo(String value) {
            addCriterion("DELIVERY_RULE <>", value, "deliveryRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryRuleGreaterThan(String value) {
            addCriterion("DELIVERY_RULE >", value, "deliveryRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryRuleGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_RULE >=", value, "deliveryRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryRuleLessThan(String value) {
            addCriterion("DELIVERY_RULE <", value, "deliveryRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryRuleLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_RULE <=", value, "deliveryRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryRuleLike(String value) {
            addCriterion("DELIVERY_RULE like", value, "deliveryRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryRuleNotLike(String value) {
            addCriterion("DELIVERY_RULE not like", value, "deliveryRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryRuleIn(List<String> values) {
            addCriterion("DELIVERY_RULE in", values, "deliveryRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryRuleNotIn(List<String> values) {
            addCriterion("DELIVERY_RULE not in", values, "deliveryRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryRuleBetween(String value1, String value2) {
            addCriterion("DELIVERY_RULE between", value1, value2, "deliveryRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryRuleNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_RULE not between", value1, value2, "deliveryRule");
            return (Criteria) this;
        }

        public Criteria andFreightcostRuleIsNull() {
            addCriterion("FREIGHTCOST_RULE is null");
            return (Criteria) this;
        }

        public Criteria andFreightcostRuleIsNotNull() {
            addCriterion("FREIGHTCOST_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andFreightcostRuleEqualTo(String value) {
            addCriterion("FREIGHTCOST_RULE =", value, "freightcostRule");
            return (Criteria) this;
        }

        public Criteria andFreightcostRuleNotEqualTo(String value) {
            addCriterion("FREIGHTCOST_RULE <>", value, "freightcostRule");
            return (Criteria) this;
        }

        public Criteria andFreightcostRuleGreaterThan(String value) {
            addCriterion("FREIGHTCOST_RULE >", value, "freightcostRule");
            return (Criteria) this;
        }

        public Criteria andFreightcostRuleGreaterThanOrEqualTo(String value) {
            addCriterion("FREIGHTCOST_RULE >=", value, "freightcostRule");
            return (Criteria) this;
        }

        public Criteria andFreightcostRuleLessThan(String value) {
            addCriterion("FREIGHTCOST_RULE <", value, "freightcostRule");
            return (Criteria) this;
        }

        public Criteria andFreightcostRuleLessThanOrEqualTo(String value) {
            addCriterion("FREIGHTCOST_RULE <=", value, "freightcostRule");
            return (Criteria) this;
        }

        public Criteria andFreightcostRuleLike(String value) {
            addCriterion("FREIGHTCOST_RULE like", value, "freightcostRule");
            return (Criteria) this;
        }

        public Criteria andFreightcostRuleNotLike(String value) {
            addCriterion("FREIGHTCOST_RULE not like", value, "freightcostRule");
            return (Criteria) this;
        }

        public Criteria andFreightcostRuleIn(List<String> values) {
            addCriterion("FREIGHTCOST_RULE in", values, "freightcostRule");
            return (Criteria) this;
        }

        public Criteria andFreightcostRuleNotIn(List<String> values) {
            addCriterion("FREIGHTCOST_RULE not in", values, "freightcostRule");
            return (Criteria) this;
        }

        public Criteria andFreightcostRuleBetween(String value1, String value2) {
            addCriterion("FREIGHTCOST_RULE between", value1, value2, "freightcostRule");
            return (Criteria) this;
        }

        public Criteria andFreightcostRuleNotBetween(String value1, String value2) {
            addCriterion("FREIGHTCOST_RULE not between", value1, value2, "freightcostRule");
            return (Criteria) this;
        }

        public Criteria andFreightAmtIsNull() {
            addCriterion("FREIGHT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFreightAmtIsNotNull() {
            addCriterion("FREIGHT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFreightAmtEqualTo(BigDecimal value) {
            addCriterion("FREIGHT_AMT =", value, "freightAmt");
            return (Criteria) this;
        }

        public Criteria andFreightAmtNotEqualTo(BigDecimal value) {
            addCriterion("FREIGHT_AMT <>", value, "freightAmt");
            return (Criteria) this;
        }

        public Criteria andFreightAmtGreaterThan(BigDecimal value) {
            addCriterion("FREIGHT_AMT >", value, "freightAmt");
            return (Criteria) this;
        }

        public Criteria andFreightAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FREIGHT_AMT >=", value, "freightAmt");
            return (Criteria) this;
        }

        public Criteria andFreightAmtLessThan(BigDecimal value) {
            addCriterion("FREIGHT_AMT <", value, "freightAmt");
            return (Criteria) this;
        }

        public Criteria andFreightAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FREIGHT_AMT <=", value, "freightAmt");
            return (Criteria) this;
        }

        public Criteria andFreightAmtIn(List<BigDecimal> values) {
            addCriterion("FREIGHT_AMT in", values, "freightAmt");
            return (Criteria) this;
        }

        public Criteria andFreightAmtNotIn(List<BigDecimal> values) {
            addCriterion("FREIGHT_AMT not in", values, "freightAmt");
            return (Criteria) this;
        }

        public Criteria andFreightAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FREIGHT_AMT between", value1, value2, "freightAmt");
            return (Criteria) this;
        }

        public Criteria andFreightAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FREIGHT_AMT not between", value1, value2, "freightAmt");
            return (Criteria) this;
        }

        public Criteria andDeliveryViaRuleIsNull() {
            addCriterion("DELIVERY_VIA_RULE is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryViaRuleIsNotNull() {
            addCriterion("DELIVERY_VIA_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryViaRuleEqualTo(String value) {
            addCriterion("DELIVERY_VIA_RULE =", value, "deliveryViaRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryViaRuleNotEqualTo(String value) {
            addCriterion("DELIVERY_VIA_RULE <>", value, "deliveryViaRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryViaRuleGreaterThan(String value) {
            addCriterion("DELIVERY_VIA_RULE >", value, "deliveryViaRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryViaRuleGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_VIA_RULE >=", value, "deliveryViaRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryViaRuleLessThan(String value) {
            addCriterion("DELIVERY_VIA_RULE <", value, "deliveryViaRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryViaRuleLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_VIA_RULE <=", value, "deliveryViaRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryViaRuleLike(String value) {
            addCriterion("DELIVERY_VIA_RULE like", value, "deliveryViaRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryViaRuleNotLike(String value) {
            addCriterion("DELIVERY_VIA_RULE not like", value, "deliveryViaRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryViaRuleIn(List<String> values) {
            addCriterion("DELIVERY_VIA_RULE in", values, "deliveryViaRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryViaRuleNotIn(List<String> values) {
            addCriterion("DELIVERY_VIA_RULE not in", values, "deliveryViaRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryViaRuleBetween(String value1, String value2) {
            addCriterion("DELIVERY_VIA_RULE between", value1, value2, "deliveryViaRule");
            return (Criteria) this;
        }

        public Criteria andDeliveryViaRuleNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_VIA_RULE not between", value1, value2, "deliveryViaRule");
            return (Criteria) this;
        }

        public Criteria andShipperIdIsNull() {
            addCriterion("SHIPPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andShipperIdIsNotNull() {
            addCriterion("SHIPPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShipperIdEqualTo(Integer value) {
            addCriterion("SHIPPER_ID =", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdNotEqualTo(Integer value) {
            addCriterion("SHIPPER_ID <>", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdGreaterThan(Integer value) {
            addCriterion("SHIPPER_ID >", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHIPPER_ID >=", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdLessThan(Integer value) {
            addCriterion("SHIPPER_ID <", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdLessThanOrEqualTo(Integer value) {
            addCriterion("SHIPPER_ID <=", value, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdIn(List<Integer> values) {
            addCriterion("SHIPPER_ID in", values, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdNotIn(List<Integer> values) {
            addCriterion("SHIPPER_ID not in", values, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdBetween(Integer value1, Integer value2) {
            addCriterion("SHIPPER_ID between", value1, value2, "shipperId");
            return (Criteria) this;
        }

        public Criteria andShipperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SHIPPER_ID not between", value1, value2, "shipperId");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNull() {
            addCriterion("CHARGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNotNull() {
            addCriterion("CHARGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChargeIdEqualTo(Integer value) {
            addCriterion("CHARGE_ID =", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotEqualTo(Integer value) {
            addCriterion("CHARGE_ID <>", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThan(Integer value) {
            addCriterion("CHARGE_ID >", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHARGE_ID >=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThan(Integer value) {
            addCriterion("CHARGE_ID <", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThanOrEqualTo(Integer value) {
            addCriterion("CHARGE_ID <=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdIn(List<Integer> values) {
            addCriterion("CHARGE_ID in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotIn(List<Integer> values) {
            addCriterion("CHARGE_ID not in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdBetween(Integer value1, Integer value2) {
            addCriterion("CHARGE_ID between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CHARGE_ID not between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeAmtIsNull() {
            addCriterion("CHARGE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andChargeAmtIsNotNull() {
            addCriterion("CHARGE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andChargeAmtEqualTo(BigDecimal value) {
            addCriterion("CHARGE_AMT =", value, "chargeAmt");
            return (Criteria) this;
        }

        public Criteria andChargeAmtNotEqualTo(BigDecimal value) {
            addCriterion("CHARGE_AMT <>", value, "chargeAmt");
            return (Criteria) this;
        }

        public Criteria andChargeAmtGreaterThan(BigDecimal value) {
            addCriterion("CHARGE_AMT >", value, "chargeAmt");
            return (Criteria) this;
        }

        public Criteria andChargeAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHARGE_AMT >=", value, "chargeAmt");
            return (Criteria) this;
        }

        public Criteria andChargeAmtLessThan(BigDecimal value) {
            addCriterion("CHARGE_AMT <", value, "chargeAmt");
            return (Criteria) this;
        }

        public Criteria andChargeAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHARGE_AMT <=", value, "chargeAmt");
            return (Criteria) this;
        }

        public Criteria andChargeAmtIn(List<BigDecimal> values) {
            addCriterion("CHARGE_AMT in", values, "chargeAmt");
            return (Criteria) this;
        }

        public Criteria andChargeAmtNotIn(List<BigDecimal> values) {
            addCriterion("CHARGE_AMT not in", values, "chargeAmt");
            return (Criteria) this;
        }

        public Criteria andChargeAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHARGE_AMT between", value1, value2, "chargeAmt");
            return (Criteria) this;
        }

        public Criteria andChargeAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHARGE_AMT not between", value1, value2, "chargeAmt");
            return (Criteria) this;
        }

        public Criteria andPriortyRuleIsNull() {
            addCriterion("PRIORTY_RULE is null");
            return (Criteria) this;
        }

        public Criteria andPriortyRuleIsNotNull() {
            addCriterion("PRIORTY_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andPriortyRuleEqualTo(String value) {
            addCriterion("PRIORTY_RULE =", value, "priortyRule");
            return (Criteria) this;
        }

        public Criteria andPriortyRuleNotEqualTo(String value) {
            addCriterion("PRIORTY_RULE <>", value, "priortyRule");
            return (Criteria) this;
        }

        public Criteria andPriortyRuleGreaterThan(String value) {
            addCriterion("PRIORTY_RULE >", value, "priortyRule");
            return (Criteria) this;
        }

        public Criteria andPriortyRuleGreaterThanOrEqualTo(String value) {
            addCriterion("PRIORTY_RULE >=", value, "priortyRule");
            return (Criteria) this;
        }

        public Criteria andPriortyRuleLessThan(String value) {
            addCriterion("PRIORTY_RULE <", value, "priortyRule");
            return (Criteria) this;
        }

        public Criteria andPriortyRuleLessThanOrEqualTo(String value) {
            addCriterion("PRIORTY_RULE <=", value, "priortyRule");
            return (Criteria) this;
        }

        public Criteria andPriortyRuleLike(String value) {
            addCriterion("PRIORTY_RULE like", value, "priortyRule");
            return (Criteria) this;
        }

        public Criteria andPriortyRuleNotLike(String value) {
            addCriterion("PRIORTY_RULE not like", value, "priortyRule");
            return (Criteria) this;
        }

        public Criteria andPriortyRuleIn(List<String> values) {
            addCriterion("PRIORTY_RULE in", values, "priortyRule");
            return (Criteria) this;
        }

        public Criteria andPriortyRuleNotIn(List<String> values) {
            addCriterion("PRIORTY_RULE not in", values, "priortyRule");
            return (Criteria) this;
        }

        public Criteria andPriortyRuleBetween(String value1, String value2) {
            addCriterion("PRIORTY_RULE between", value1, value2, "priortyRule");
            return (Criteria) this;
        }

        public Criteria andPriortyRuleNotBetween(String value1, String value2) {
            addCriterion("PRIORTY_RULE not between", value1, value2, "priortyRule");
            return (Criteria) this;
        }

        public Criteria andTotalLinesIsNull() {
            addCriterion("TOTAL_LINES is null");
            return (Criteria) this;
        }

        public Criteria andTotalLinesIsNotNull() {
            addCriterion("TOTAL_LINES is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLinesEqualTo(BigDecimal value) {
            addCriterion("TOTAL_LINES =", value, "totalLines");
            return (Criteria) this;
        }

        public Criteria andTotalLinesNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_LINES <>", value, "totalLines");
            return (Criteria) this;
        }

        public Criteria andTotalLinesGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_LINES >", value, "totalLines");
            return (Criteria) this;
        }

        public Criteria andTotalLinesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_LINES >=", value, "totalLines");
            return (Criteria) this;
        }

        public Criteria andTotalLinesLessThan(BigDecimal value) {
            addCriterion("TOTAL_LINES <", value, "totalLines");
            return (Criteria) this;
        }

        public Criteria andTotalLinesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_LINES <=", value, "totalLines");
            return (Criteria) this;
        }

        public Criteria andTotalLinesIn(List<BigDecimal> values) {
            addCriterion("TOTAL_LINES in", values, "totalLines");
            return (Criteria) this;
        }

        public Criteria andTotalLinesNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_LINES not in", values, "totalLines");
            return (Criteria) this;
        }

        public Criteria andTotalLinesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_LINES between", value1, value2, "totalLines");
            return (Criteria) this;
        }

        public Criteria andTotalLinesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_LINES not between", value1, value2, "totalLines");
            return (Criteria) this;
        }

        public Criteria andGrandTotalIsNull() {
            addCriterion("GRAND_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andGrandTotalIsNotNull() {
            addCriterion("GRAND_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andGrandTotalEqualTo(BigDecimal value) {
            addCriterion("GRAND_TOTAL =", value, "grandTotal");
            return (Criteria) this;
        }

        public Criteria andGrandTotalNotEqualTo(BigDecimal value) {
            addCriterion("GRAND_TOTAL <>", value, "grandTotal");
            return (Criteria) this;
        }

        public Criteria andGrandTotalGreaterThan(BigDecimal value) {
            addCriterion("GRAND_TOTAL >", value, "grandTotal");
            return (Criteria) this;
        }

        public Criteria andGrandTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GRAND_TOTAL >=", value, "grandTotal");
            return (Criteria) this;
        }

        public Criteria andGrandTotalLessThan(BigDecimal value) {
            addCriterion("GRAND_TOTAL <", value, "grandTotal");
            return (Criteria) this;
        }

        public Criteria andGrandTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GRAND_TOTAL <=", value, "grandTotal");
            return (Criteria) this;
        }

        public Criteria andGrandTotalIn(List<BigDecimal> values) {
            addCriterion("GRAND_TOTAL in", values, "grandTotal");
            return (Criteria) this;
        }

        public Criteria andGrandTotalNotIn(List<BigDecimal> values) {
            addCriterion("GRAND_TOTAL not in", values, "grandTotal");
            return (Criteria) this;
        }

        public Criteria andGrandTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRAND_TOTAL between", value1, value2, "grandTotal");
            return (Criteria) this;
        }

        public Criteria andGrandTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRAND_TOTAL not between", value1, value2, "grandTotal");
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

        public Criteria andIsTaxincludedIsNull() {
            addCriterion("IS_TAXINCLUDED is null");
            return (Criteria) this;
        }

        public Criteria andIsTaxincludedIsNotNull() {
            addCriterion("IS_TAXINCLUDED is not null");
            return (Criteria) this;
        }

        public Criteria andIsTaxincludedEqualTo(String value) {
            addCriterion("IS_TAXINCLUDED =", value, "isTaxincluded");
            return (Criteria) this;
        }

        public Criteria andIsTaxincludedNotEqualTo(String value) {
            addCriterion("IS_TAXINCLUDED <>", value, "isTaxincluded");
            return (Criteria) this;
        }

        public Criteria andIsTaxincludedGreaterThan(String value) {
            addCriterion("IS_TAXINCLUDED >", value, "isTaxincluded");
            return (Criteria) this;
        }

        public Criteria andIsTaxincludedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_TAXINCLUDED >=", value, "isTaxincluded");
            return (Criteria) this;
        }

        public Criteria andIsTaxincludedLessThan(String value) {
            addCriterion("IS_TAXINCLUDED <", value, "isTaxincluded");
            return (Criteria) this;
        }

        public Criteria andIsTaxincludedLessThanOrEqualTo(String value) {
            addCriterion("IS_TAXINCLUDED <=", value, "isTaxincluded");
            return (Criteria) this;
        }

        public Criteria andIsTaxincludedLike(String value) {
            addCriterion("IS_TAXINCLUDED like", value, "isTaxincluded");
            return (Criteria) this;
        }

        public Criteria andIsTaxincludedNotLike(String value) {
            addCriterion("IS_TAXINCLUDED not like", value, "isTaxincluded");
            return (Criteria) this;
        }

        public Criteria andIsTaxincludedIn(List<String> values) {
            addCriterion("IS_TAXINCLUDED in", values, "isTaxincluded");
            return (Criteria) this;
        }

        public Criteria andIsTaxincludedNotIn(List<String> values) {
            addCriterion("IS_TAXINCLUDED not in", values, "isTaxincluded");
            return (Criteria) this;
        }

        public Criteria andIsTaxincludedBetween(String value1, String value2) {
            addCriterion("IS_TAXINCLUDED between", value1, value2, "isTaxincluded");
            return (Criteria) this;
        }

        public Criteria andIsTaxincludedNotBetween(String value1, String value2) {
            addCriterion("IS_TAXINCLUDED not between", value1, value2, "isTaxincluded");
            return (Criteria) this;
        }

        public Criteria andCampaignIdIsNull() {
            addCriterion("CAMPAIGN_ID is null");
            return (Criteria) this;
        }

        public Criteria andCampaignIdIsNotNull() {
            addCriterion("CAMPAIGN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCampaignIdEqualTo(Integer value) {
            addCriterion("CAMPAIGN_ID =", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdNotEqualTo(Integer value) {
            addCriterion("CAMPAIGN_ID <>", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdGreaterThan(Integer value) {
            addCriterion("CAMPAIGN_ID >", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAMPAIGN_ID >=", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdLessThan(Integer value) {
            addCriterion("CAMPAIGN_ID <", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdLessThanOrEqualTo(Integer value) {
            addCriterion("CAMPAIGN_ID <=", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdIn(List<Integer> values) {
            addCriterion("CAMPAIGN_ID in", values, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdNotIn(List<Integer> values) {
            addCriterion("CAMPAIGN_ID not in", values, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdBetween(Integer value1, Integer value2) {
            addCriterion("CAMPAIGN_ID between", value1, value2, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CAMPAIGN_ID not between", value1, value2, "campaignId");
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

        public Criteria andActivityIdIsNull() {
            addCriterion("ACTIVITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("ACTIVITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("ACTIVITY_ID =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("ACTIVITY_ID <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("ACTIVITY_ID >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACTIVITY_ID >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("ACTIVITY_ID <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("ACTIVITY_ID <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("ACTIVITY_ID in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("ACTIVITY_ID not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVITY_ID between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVITY_ID not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andPoestedIsNull() {
            addCriterion("POESTED is null");
            return (Criteria) this;
        }

        public Criteria andPoestedIsNotNull() {
            addCriterion("POESTED is not null");
            return (Criteria) this;
        }

        public Criteria andPoestedEqualTo(String value) {
            addCriterion("POESTED =", value, "poested");
            return (Criteria) this;
        }

        public Criteria andPoestedNotEqualTo(String value) {
            addCriterion("POESTED <>", value, "poested");
            return (Criteria) this;
        }

        public Criteria andPoestedGreaterThan(String value) {
            addCriterion("POESTED >", value, "poested");
            return (Criteria) this;
        }

        public Criteria andPoestedGreaterThanOrEqualTo(String value) {
            addCriterion("POESTED >=", value, "poested");
            return (Criteria) this;
        }

        public Criteria andPoestedLessThan(String value) {
            addCriterion("POESTED <", value, "poested");
            return (Criteria) this;
        }

        public Criteria andPoestedLessThanOrEqualTo(String value) {
            addCriterion("POESTED <=", value, "poested");
            return (Criteria) this;
        }

        public Criteria andPoestedLike(String value) {
            addCriterion("POESTED like", value, "poested");
            return (Criteria) this;
        }

        public Criteria andPoestedNotLike(String value) {
            addCriterion("POESTED not like", value, "poested");
            return (Criteria) this;
        }

        public Criteria andPoestedIn(List<String> values) {
            addCriterion("POESTED in", values, "poested");
            return (Criteria) this;
        }

        public Criteria andPoestedNotIn(List<String> values) {
            addCriterion("POESTED not in", values, "poested");
            return (Criteria) this;
        }

        public Criteria andPoestedBetween(String value1, String value2) {
            addCriterion("POESTED between", value1, value2, "poested");
            return (Criteria) this;
        }

        public Criteria andPoestedNotBetween(String value1, String value2) {
            addCriterion("POESTED not between", value1, value2, "poested");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNull() {
            addCriterion("PAYMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNotNull() {
            addCriterion("PAYMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdEqualTo(Integer value) {
            addCriterion("PAYMENT_ID =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(Integer value) {
            addCriterion("PAYMENT_ID <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(Integer value) {
            addCriterion("PAYMENT_ID >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_ID >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(Integer value) {
            addCriterion("PAYMENT_ID <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_ID <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<Integer> values) {
            addCriterion("PAYMENT_ID in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<Integer> values) {
            addCriterion("PAYMENT_ID not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_ID between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_ID not between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andCashlineIdIsNull() {
            addCriterion("CASHLINE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCashlineIdIsNotNull() {
            addCriterion("CASHLINE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCashlineIdEqualTo(Integer value) {
            addCriterion("CASHLINE_ID =", value, "cashlineId");
            return (Criteria) this;
        }

        public Criteria andCashlineIdNotEqualTo(Integer value) {
            addCriterion("CASHLINE_ID <>", value, "cashlineId");
            return (Criteria) this;
        }

        public Criteria andCashlineIdGreaterThan(Integer value) {
            addCriterion("CASHLINE_ID >", value, "cashlineId");
            return (Criteria) this;
        }

        public Criteria andCashlineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CASHLINE_ID >=", value, "cashlineId");
            return (Criteria) this;
        }

        public Criteria andCashlineIdLessThan(Integer value) {
            addCriterion("CASHLINE_ID <", value, "cashlineId");
            return (Criteria) this;
        }

        public Criteria andCashlineIdLessThanOrEqualTo(Integer value) {
            addCriterion("CASHLINE_ID <=", value, "cashlineId");
            return (Criteria) this;
        }

        public Criteria andCashlineIdIn(List<Integer> values) {
            addCriterion("CASHLINE_ID in", values, "cashlineId");
            return (Criteria) this;
        }

        public Criteria andCashlineIdNotIn(List<Integer> values) {
            addCriterion("CASHLINE_ID not in", values, "cashlineId");
            return (Criteria) this;
        }

        public Criteria andCashlineIdBetween(Integer value1, Integer value2) {
            addCriterion("CASHLINE_ID between", value1, value2, "cashlineId");
            return (Criteria) this;
        }

        public Criteria andCashlineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CASHLINE_ID not between", value1, value2, "cashlineId");
            return (Criteria) this;
        }

        public Criteria andSendEmailIsNull() {
            addCriterion("SEND_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andSendEmailIsNotNull() {
            addCriterion("SEND_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andSendEmailEqualTo(String value) {
            addCriterion("SEND_EMAIL =", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailNotEqualTo(String value) {
            addCriterion("SEND_EMAIL <>", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailGreaterThan(String value) {
            addCriterion("SEND_EMAIL >", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_EMAIL >=", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailLessThan(String value) {
            addCriterion("SEND_EMAIL <", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailLessThanOrEqualTo(String value) {
            addCriterion("SEND_EMAIL <=", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailLike(String value) {
            addCriterion("SEND_EMAIL like", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailNotLike(String value) {
            addCriterion("SEND_EMAIL not like", value, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailIn(List<String> values) {
            addCriterion("SEND_EMAIL in", values, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailNotIn(List<String> values) {
            addCriterion("SEND_EMAIL not in", values, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailBetween(String value1, String value2) {
            addCriterion("SEND_EMAIL between", value1, value2, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andSendEmailNotBetween(String value1, String value2) {
            addCriterion("SEND_EMAIL not between", value1, value2, "sendEmail");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCopyfromIsNull() {
            addCriterion("COPYFROM is null");
            return (Criteria) this;
        }

        public Criteria andCopyfromIsNotNull() {
            addCriterion("COPYFROM is not null");
            return (Criteria) this;
        }

        public Criteria andCopyfromEqualTo(String value) {
            addCriterion("COPYFROM =", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromNotEqualTo(String value) {
            addCriterion("COPYFROM <>", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromGreaterThan(String value) {
            addCriterion("COPYFROM >", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromGreaterThanOrEqualTo(String value) {
            addCriterion("COPYFROM >=", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromLessThan(String value) {
            addCriterion("COPYFROM <", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromLessThanOrEqualTo(String value) {
            addCriterion("COPYFROM <=", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromLike(String value) {
            addCriterion("COPYFROM like", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromNotLike(String value) {
            addCriterion("COPYFROM not like", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromIn(List<String> values) {
            addCriterion("COPYFROM in", values, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromNotIn(List<String> values) {
            addCriterion("COPYFROM not in", values, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromBetween(String value1, String value2) {
            addCriterion("COPYFROM between", value1, value2, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromNotBetween(String value1, String value2) {
            addCriterion("COPYFROM not between", value1, value2, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andIsSelfserviceIsNull() {
            addCriterion("IS_SELFSERVICE is null");
            return (Criteria) this;
        }

        public Criteria andIsSelfserviceIsNotNull() {
            addCriterion("IS_SELFSERVICE is not null");
            return (Criteria) this;
        }

        public Criteria andIsSelfserviceEqualTo(String value) {
            addCriterion("IS_SELFSERVICE =", value, "isSelfservice");
            return (Criteria) this;
        }

        public Criteria andIsSelfserviceNotEqualTo(String value) {
            addCriterion("IS_SELFSERVICE <>", value, "isSelfservice");
            return (Criteria) this;
        }

        public Criteria andIsSelfserviceGreaterThan(String value) {
            addCriterion("IS_SELFSERVICE >", value, "isSelfservice");
            return (Criteria) this;
        }

        public Criteria andIsSelfserviceGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SELFSERVICE >=", value, "isSelfservice");
            return (Criteria) this;
        }

        public Criteria andIsSelfserviceLessThan(String value) {
            addCriterion("IS_SELFSERVICE <", value, "isSelfservice");
            return (Criteria) this;
        }

        public Criteria andIsSelfserviceLessThanOrEqualTo(String value) {
            addCriterion("IS_SELFSERVICE <=", value, "isSelfservice");
            return (Criteria) this;
        }

        public Criteria andIsSelfserviceLike(String value) {
            addCriterion("IS_SELFSERVICE like", value, "isSelfservice");
            return (Criteria) this;
        }

        public Criteria andIsSelfserviceNotLike(String value) {
            addCriterion("IS_SELFSERVICE not like", value, "isSelfservice");
            return (Criteria) this;
        }

        public Criteria andIsSelfserviceIn(List<String> values) {
            addCriterion("IS_SELFSERVICE in", values, "isSelfservice");
            return (Criteria) this;
        }

        public Criteria andIsSelfserviceNotIn(List<String> values) {
            addCriterion("IS_SELFSERVICE not in", values, "isSelfservice");
            return (Criteria) this;
        }

        public Criteria andIsSelfserviceBetween(String value1, String value2) {
            addCriterion("IS_SELFSERVICE between", value1, value2, "isSelfservice");
            return (Criteria) this;
        }

        public Criteria andIsSelfserviceNotBetween(String value1, String value2) {
            addCriterion("IS_SELFSERVICE not between", value1, value2, "isSelfservice");
            return (Criteria) this;
        }

        public Criteria andOrgtrxIdIsNull() {
            addCriterion("ORGTRX_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgtrxIdIsNotNull() {
            addCriterion("ORGTRX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtrxIdEqualTo(Integer value) {
            addCriterion("ORGTRX_ID =", value, "orgtrxId");
            return (Criteria) this;
        }

        public Criteria andOrgtrxIdNotEqualTo(Integer value) {
            addCriterion("ORGTRX_ID <>", value, "orgtrxId");
            return (Criteria) this;
        }

        public Criteria andOrgtrxIdGreaterThan(Integer value) {
            addCriterion("ORGTRX_ID >", value, "orgtrxId");
            return (Criteria) this;
        }

        public Criteria andOrgtrxIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORGTRX_ID >=", value, "orgtrxId");
            return (Criteria) this;
        }

        public Criteria andOrgtrxIdLessThan(Integer value) {
            addCriterion("ORGTRX_ID <", value, "orgtrxId");
            return (Criteria) this;
        }

        public Criteria andOrgtrxIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORGTRX_ID <=", value, "orgtrxId");
            return (Criteria) this;
        }

        public Criteria andOrgtrxIdIn(List<Integer> values) {
            addCriterion("ORGTRX_ID in", values, "orgtrxId");
            return (Criteria) this;
        }

        public Criteria andOrgtrxIdNotIn(List<Integer> values) {
            addCriterion("ORGTRX_ID not in", values, "orgtrxId");
            return (Criteria) this;
        }

        public Criteria andOrgtrxIdBetween(Integer value1, Integer value2) {
            addCriterion("ORGTRX_ID between", value1, value2, "orgtrxId");
            return (Criteria) this;
        }

        public Criteria andOrgtrxIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORGTRX_ID not between", value1, value2, "orgtrxId");
            return (Criteria) this;
        }

        public Criteria andUser1IdIsNull() {
            addCriterion("USER1_ID is null");
            return (Criteria) this;
        }

        public Criteria andUser1IdIsNotNull() {
            addCriterion("USER1_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUser1IdEqualTo(Integer value) {
            addCriterion("USER1_ID =", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdNotEqualTo(Integer value) {
            addCriterion("USER1_ID <>", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdGreaterThan(Integer value) {
            addCriterion("USER1_ID >", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER1_ID >=", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdLessThan(Integer value) {
            addCriterion("USER1_ID <", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdLessThanOrEqualTo(Integer value) {
            addCriterion("USER1_ID <=", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdIn(List<Integer> values) {
            addCriterion("USER1_ID in", values, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdNotIn(List<Integer> values) {
            addCriterion("USER1_ID not in", values, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdBetween(Integer value1, Integer value2) {
            addCriterion("USER1_ID between", value1, value2, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER1_ID not between", value1, value2, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdIsNull() {
            addCriterion("USER2_ID is null");
            return (Criteria) this;
        }

        public Criteria andUser2IdIsNotNull() {
            addCriterion("USER2_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUser2IdEqualTo(Integer value) {
            addCriterion("USER2_ID =", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdNotEqualTo(Integer value) {
            addCriterion("USER2_ID <>", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdGreaterThan(Integer value) {
            addCriterion("USER2_ID >", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER2_ID >=", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdLessThan(Integer value) {
            addCriterion("USER2_ID <", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdLessThanOrEqualTo(Integer value) {
            addCriterion("USER2_ID <=", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdIn(List<Integer> values) {
            addCriterion("USER2_ID in", values, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdNotIn(List<Integer> values) {
            addCriterion("USER2_ID not in", values, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdBetween(Integer value1, Integer value2) {
            addCriterion("USER2_ID between", value1, value2, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER2_ID not between", value1, value2, "user2Id");
            return (Criteria) this;
        }

        public Criteria andConversiontypeIdIsNull() {
            addCriterion("CONVERSIONTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andConversiontypeIdIsNotNull() {
            addCriterion("CONVERSIONTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConversiontypeIdEqualTo(Integer value) {
            addCriterion("CONVERSIONTYPE_ID =", value, "conversiontypeId");
            return (Criteria) this;
        }

        public Criteria andConversiontypeIdNotEqualTo(Integer value) {
            addCriterion("CONVERSIONTYPE_ID <>", value, "conversiontypeId");
            return (Criteria) this;
        }

        public Criteria andConversiontypeIdGreaterThan(Integer value) {
            addCriterion("CONVERSIONTYPE_ID >", value, "conversiontypeId");
            return (Criteria) this;
        }

        public Criteria andConversiontypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONVERSIONTYPE_ID >=", value, "conversiontypeId");
            return (Criteria) this;
        }

        public Criteria andConversiontypeIdLessThan(Integer value) {
            addCriterion("CONVERSIONTYPE_ID <", value, "conversiontypeId");
            return (Criteria) this;
        }

        public Criteria andConversiontypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("CONVERSIONTYPE_ID <=", value, "conversiontypeId");
            return (Criteria) this;
        }

        public Criteria andConversiontypeIdIn(List<Integer> values) {
            addCriterion("CONVERSIONTYPE_ID in", values, "conversiontypeId");
            return (Criteria) this;
        }

        public Criteria andConversiontypeIdNotIn(List<Integer> values) {
            addCriterion("CONVERSIONTYPE_ID not in", values, "conversiontypeId");
            return (Criteria) this;
        }

        public Criteria andConversiontypeIdBetween(Integer value1, Integer value2) {
            addCriterion("CONVERSIONTYPE_ID between", value1, value2, "conversiontypeId");
            return (Criteria) this;
        }

        public Criteria andConversiontypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CONVERSIONTYPE_ID not between", value1, value2, "conversiontypeId");
            return (Criteria) this;
        }

        public Criteria andBillBpartnerIdIsNull() {
            addCriterion("BILL_BPARTNER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillBpartnerIdIsNotNull() {
            addCriterion("BILL_BPARTNER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillBpartnerIdEqualTo(Integer value) {
            addCriterion("BILL_BPARTNER_ID =", value, "billBpartnerId");
            return (Criteria) this;
        }

        public Criteria andBillBpartnerIdNotEqualTo(Integer value) {
            addCriterion("BILL_BPARTNER_ID <>", value, "billBpartnerId");
            return (Criteria) this;
        }

        public Criteria andBillBpartnerIdGreaterThan(Integer value) {
            addCriterion("BILL_BPARTNER_ID >", value, "billBpartnerId");
            return (Criteria) this;
        }

        public Criteria andBillBpartnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BILL_BPARTNER_ID >=", value, "billBpartnerId");
            return (Criteria) this;
        }

        public Criteria andBillBpartnerIdLessThan(Integer value) {
            addCriterion("BILL_BPARTNER_ID <", value, "billBpartnerId");
            return (Criteria) this;
        }

        public Criteria andBillBpartnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("BILL_BPARTNER_ID <=", value, "billBpartnerId");
            return (Criteria) this;
        }

        public Criteria andBillBpartnerIdIn(List<Integer> values) {
            addCriterion("BILL_BPARTNER_ID in", values, "billBpartnerId");
            return (Criteria) this;
        }

        public Criteria andBillBpartnerIdNotIn(List<Integer> values) {
            addCriterion("BILL_BPARTNER_ID not in", values, "billBpartnerId");
            return (Criteria) this;
        }

        public Criteria andBillBpartnerIdBetween(Integer value1, Integer value2) {
            addCriterion("BILL_BPARTNER_ID between", value1, value2, "billBpartnerId");
            return (Criteria) this;
        }

        public Criteria andBillBpartnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BILL_BPARTNER_ID not between", value1, value2, "billBpartnerId");
            return (Criteria) this;
        }

        public Criteria andBillLocationIdIsNull() {
            addCriterion("BILL_LOCATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillLocationIdIsNotNull() {
            addCriterion("BILL_LOCATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillLocationIdEqualTo(Integer value) {
            addCriterion("BILL_LOCATION_ID =", value, "billLocationId");
            return (Criteria) this;
        }

        public Criteria andBillLocationIdNotEqualTo(Integer value) {
            addCriterion("BILL_LOCATION_ID <>", value, "billLocationId");
            return (Criteria) this;
        }

        public Criteria andBillLocationIdGreaterThan(Integer value) {
            addCriterion("BILL_LOCATION_ID >", value, "billLocationId");
            return (Criteria) this;
        }

        public Criteria andBillLocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BILL_LOCATION_ID >=", value, "billLocationId");
            return (Criteria) this;
        }

        public Criteria andBillLocationIdLessThan(Integer value) {
            addCriterion("BILL_LOCATION_ID <", value, "billLocationId");
            return (Criteria) this;
        }

        public Criteria andBillLocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("BILL_LOCATION_ID <=", value, "billLocationId");
            return (Criteria) this;
        }

        public Criteria andBillLocationIdIn(List<Integer> values) {
            addCriterion("BILL_LOCATION_ID in", values, "billLocationId");
            return (Criteria) this;
        }

        public Criteria andBillLocationIdNotIn(List<Integer> values) {
            addCriterion("BILL_LOCATION_ID not in", values, "billLocationId");
            return (Criteria) this;
        }

        public Criteria andBillLocationIdBetween(Integer value1, Integer value2) {
            addCriterion("BILL_LOCATION_ID between", value1, value2, "billLocationId");
            return (Criteria) this;
        }

        public Criteria andBillLocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BILL_LOCATION_ID not between", value1, value2, "billLocationId");
            return (Criteria) this;
        }

        public Criteria andBillUserIdIsNull() {
            addCriterion("BILL_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillUserIdIsNotNull() {
            addCriterion("BILL_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillUserIdEqualTo(Integer value) {
            addCriterion("BILL_USER_ID =", value, "billUserId");
            return (Criteria) this;
        }

        public Criteria andBillUserIdNotEqualTo(Integer value) {
            addCriterion("BILL_USER_ID <>", value, "billUserId");
            return (Criteria) this;
        }

        public Criteria andBillUserIdGreaterThan(Integer value) {
            addCriterion("BILL_USER_ID >", value, "billUserId");
            return (Criteria) this;
        }

        public Criteria andBillUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BILL_USER_ID >=", value, "billUserId");
            return (Criteria) this;
        }

        public Criteria andBillUserIdLessThan(Integer value) {
            addCriterion("BILL_USER_ID <", value, "billUserId");
            return (Criteria) this;
        }

        public Criteria andBillUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("BILL_USER_ID <=", value, "billUserId");
            return (Criteria) this;
        }

        public Criteria andBillUserIdIn(List<Integer> values) {
            addCriterion("BILL_USER_ID in", values, "billUserId");
            return (Criteria) this;
        }

        public Criteria andBillUserIdNotIn(List<Integer> values) {
            addCriterion("BILL_USER_ID not in", values, "billUserId");
            return (Criteria) this;
        }

        public Criteria andBillUserIdBetween(Integer value1, Integer value2) {
            addCriterion("BILL_USER_ID between", value1, value2, "billUserId");
            return (Criteria) this;
        }

        public Criteria andBillUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BILL_USER_ID not between", value1, value2, "billUserId");
            return (Criteria) this;
        }

        public Criteria andPayBpartnerIdIsNull() {
            addCriterion("PAY_BPARTNER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayBpartnerIdIsNotNull() {
            addCriterion("PAY_BPARTNER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayBpartnerIdEqualTo(Integer value) {
            addCriterion("PAY_BPARTNER_ID =", value, "payBpartnerId");
            return (Criteria) this;
        }

        public Criteria andPayBpartnerIdNotEqualTo(Integer value) {
            addCriterion("PAY_BPARTNER_ID <>", value, "payBpartnerId");
            return (Criteria) this;
        }

        public Criteria andPayBpartnerIdGreaterThan(Integer value) {
            addCriterion("PAY_BPARTNER_ID >", value, "payBpartnerId");
            return (Criteria) this;
        }

        public Criteria andPayBpartnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAY_BPARTNER_ID >=", value, "payBpartnerId");
            return (Criteria) this;
        }

        public Criteria andPayBpartnerIdLessThan(Integer value) {
            addCriterion("PAY_BPARTNER_ID <", value, "payBpartnerId");
            return (Criteria) this;
        }

        public Criteria andPayBpartnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAY_BPARTNER_ID <=", value, "payBpartnerId");
            return (Criteria) this;
        }

        public Criteria andPayBpartnerIdIn(List<Integer> values) {
            addCriterion("PAY_BPARTNER_ID in", values, "payBpartnerId");
            return (Criteria) this;
        }

        public Criteria andPayBpartnerIdNotIn(List<Integer> values) {
            addCriterion("PAY_BPARTNER_ID not in", values, "payBpartnerId");
            return (Criteria) this;
        }

        public Criteria andPayBpartnerIdBetween(Integer value1, Integer value2) {
            addCriterion("PAY_BPARTNER_ID between", value1, value2, "payBpartnerId");
            return (Criteria) this;
        }

        public Criteria andPayBpartnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAY_BPARTNER_ID not between", value1, value2, "payBpartnerId");
            return (Criteria) this;
        }

        public Criteria andPayLocationIdIsNull() {
            addCriterion("PAY_LOCATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayLocationIdIsNotNull() {
            addCriterion("PAY_LOCATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayLocationIdEqualTo(Integer value) {
            addCriterion("PAY_LOCATION_ID =", value, "payLocationId");
            return (Criteria) this;
        }

        public Criteria andPayLocationIdNotEqualTo(Integer value) {
            addCriterion("PAY_LOCATION_ID <>", value, "payLocationId");
            return (Criteria) this;
        }

        public Criteria andPayLocationIdGreaterThan(Integer value) {
            addCriterion("PAY_LOCATION_ID >", value, "payLocationId");
            return (Criteria) this;
        }

        public Criteria andPayLocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAY_LOCATION_ID >=", value, "payLocationId");
            return (Criteria) this;
        }

        public Criteria andPayLocationIdLessThan(Integer value) {
            addCriterion("PAY_LOCATION_ID <", value, "payLocationId");
            return (Criteria) this;
        }

        public Criteria andPayLocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAY_LOCATION_ID <=", value, "payLocationId");
            return (Criteria) this;
        }

        public Criteria andPayLocationIdIn(List<Integer> values) {
            addCriterion("PAY_LOCATION_ID in", values, "payLocationId");
            return (Criteria) this;
        }

        public Criteria andPayLocationIdNotIn(List<Integer> values) {
            addCriterion("PAY_LOCATION_ID not in", values, "payLocationId");
            return (Criteria) this;
        }

        public Criteria andPayLocationIdBetween(Integer value1, Integer value2) {
            addCriterion("PAY_LOCATION_ID between", value1, value2, "payLocationId");
            return (Criteria) this;
        }

        public Criteria andPayLocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAY_LOCATION_ID not between", value1, value2, "payLocationId");
            return (Criteria) this;
        }

        public Criteria andRefOrderIdIsNull() {
            addCriterion("REF_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andRefOrderIdIsNotNull() {
            addCriterion("REF_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRefOrderIdEqualTo(Integer value) {
            addCriterion("REF_ORDER_ID =", value, "refOrderId");
            return (Criteria) this;
        }

        public Criteria andRefOrderIdNotEqualTo(Integer value) {
            addCriterion("REF_ORDER_ID <>", value, "refOrderId");
            return (Criteria) this;
        }

        public Criteria andRefOrderIdGreaterThan(Integer value) {
            addCriterion("REF_ORDER_ID >", value, "refOrderId");
            return (Criteria) this;
        }

        public Criteria andRefOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("REF_ORDER_ID >=", value, "refOrderId");
            return (Criteria) this;
        }

        public Criteria andRefOrderIdLessThan(Integer value) {
            addCriterion("REF_ORDER_ID <", value, "refOrderId");
            return (Criteria) this;
        }

        public Criteria andRefOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("REF_ORDER_ID <=", value, "refOrderId");
            return (Criteria) this;
        }

        public Criteria andRefOrderIdIn(List<Integer> values) {
            addCriterion("REF_ORDER_ID in", values, "refOrderId");
            return (Criteria) this;
        }

        public Criteria andRefOrderIdNotIn(List<Integer> values) {
            addCriterion("REF_ORDER_ID not in", values, "refOrderId");
            return (Criteria) this;
        }

        public Criteria andRefOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("REF_ORDER_ID between", value1, value2, "refOrderId");
            return (Criteria) this;
        }

        public Criteria andRefOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("REF_ORDER_ID not between", value1, value2, "refOrderId");
            return (Criteria) this;
        }

        public Criteria andIsDropshipIsNull() {
            addCriterion("IS_DROPSHIP is null");
            return (Criteria) this;
        }

        public Criteria andIsDropshipIsNotNull() {
            addCriterion("IS_DROPSHIP is not null");
            return (Criteria) this;
        }

        public Criteria andIsDropshipEqualTo(String value) {
            addCriterion("IS_DROPSHIP =", value, "isDropship");
            return (Criteria) this;
        }

        public Criteria andIsDropshipNotEqualTo(String value) {
            addCriterion("IS_DROPSHIP <>", value, "isDropship");
            return (Criteria) this;
        }

        public Criteria andIsDropshipGreaterThan(String value) {
            addCriterion("IS_DROPSHIP >", value, "isDropship");
            return (Criteria) this;
        }

        public Criteria andIsDropshipGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DROPSHIP >=", value, "isDropship");
            return (Criteria) this;
        }

        public Criteria andIsDropshipLessThan(String value) {
            addCriterion("IS_DROPSHIP <", value, "isDropship");
            return (Criteria) this;
        }

        public Criteria andIsDropshipLessThanOrEqualTo(String value) {
            addCriterion("IS_DROPSHIP <=", value, "isDropship");
            return (Criteria) this;
        }

        public Criteria andIsDropshipLike(String value) {
            addCriterion("IS_DROPSHIP like", value, "isDropship");
            return (Criteria) this;
        }

        public Criteria andIsDropshipNotLike(String value) {
            addCriterion("IS_DROPSHIP not like", value, "isDropship");
            return (Criteria) this;
        }

        public Criteria andIsDropshipIn(List<String> values) {
            addCriterion("IS_DROPSHIP in", values, "isDropship");
            return (Criteria) this;
        }

        public Criteria andIsDropshipNotIn(List<String> values) {
            addCriterion("IS_DROPSHIP not in", values, "isDropship");
            return (Criteria) this;
        }

        public Criteria andIsDropshipBetween(String value1, String value2) {
            addCriterion("IS_DROPSHIP between", value1, value2, "isDropship");
            return (Criteria) this;
        }

        public Criteria andIsDropshipNotBetween(String value1, String value2) {
            addCriterion("IS_DROPSHIP not between", value1, value2, "isDropship");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("VOLUME is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("VOLUME is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(BigDecimal value) {
            addCriterion("VOLUME =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(BigDecimal value) {
            addCriterion("VOLUME <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(BigDecimal value) {
            addCriterion("VOLUME >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VOLUME >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(BigDecimal value) {
            addCriterion("VOLUME <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VOLUME <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<BigDecimal> values) {
            addCriterion("VOLUME in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<BigDecimal> values) {
            addCriterion("VOLUME not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOLUME between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOLUME not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("WEIGHT =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("WEIGHT >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("WEIGHT <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("WEIGHT in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("WEIGHT not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("ORDER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("ORDER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("ORDER_TYPE =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("ORDER_TYPE <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("ORDER_TYPE >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("ORDER_TYPE <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("ORDER_TYPE like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("ORDER_TYPE not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("ORDER_TYPE in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("ORDER_TYPE not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andCPosIdIsNull() {
            addCriterion("C_POS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCPosIdIsNotNull() {
            addCriterion("C_POS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCPosIdEqualTo(Integer value) {
            addCriterion("C_POS_ID =", value, "cPosId");
            return (Criteria) this;
        }

        public Criteria andCPosIdNotEqualTo(Integer value) {
            addCriterion("C_POS_ID <>", value, "cPosId");
            return (Criteria) this;
        }

        public Criteria andCPosIdGreaterThan(Integer value) {
            addCriterion("C_POS_ID >", value, "cPosId");
            return (Criteria) this;
        }

        public Criteria andCPosIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_POS_ID >=", value, "cPosId");
            return (Criteria) this;
        }

        public Criteria andCPosIdLessThan(Integer value) {
            addCriterion("C_POS_ID <", value, "cPosId");
            return (Criteria) this;
        }

        public Criteria andCPosIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_POS_ID <=", value, "cPosId");
            return (Criteria) this;
        }

        public Criteria andCPosIdIn(List<Integer> values) {
            addCriterion("C_POS_ID in", values, "cPosId");
            return (Criteria) this;
        }

        public Criteria andCPosIdNotIn(List<Integer> values) {
            addCriterion("C_POS_ID not in", values, "cPosId");
            return (Criteria) this;
        }

        public Criteria andCPosIdBetween(Integer value1, Integer value2) {
            addCriterion("C_POS_ID between", value1, value2, "cPosId");
            return (Criteria) this;
        }

        public Criteria andCPosIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_POS_ID not between", value1, value2, "cPosId");
            return (Criteria) this;
        }

        public Criteria andAmountTenderedIsNull() {
            addCriterion("AMOUNT_TENDERED is null");
            return (Criteria) this;
        }

        public Criteria andAmountTenderedIsNotNull() {
            addCriterion("AMOUNT_TENDERED is not null");
            return (Criteria) this;
        }

        public Criteria andAmountTenderedEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_TENDERED =", value, "amountTendered");
            return (Criteria) this;
        }

        public Criteria andAmountTenderedNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_TENDERED <>", value, "amountTendered");
            return (Criteria) this;
        }

        public Criteria andAmountTenderedGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT_TENDERED >", value, "amountTendered");
            return (Criteria) this;
        }

        public Criteria andAmountTenderedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_TENDERED >=", value, "amountTendered");
            return (Criteria) this;
        }

        public Criteria andAmountTenderedLessThan(BigDecimal value) {
            addCriterion("AMOUNT_TENDERED <", value, "amountTendered");
            return (Criteria) this;
        }

        public Criteria andAmountTenderedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_TENDERED <=", value, "amountTendered");
            return (Criteria) this;
        }

        public Criteria andAmountTenderedIn(List<BigDecimal> values) {
            addCriterion("AMOUNT_TENDERED in", values, "amountTendered");
            return (Criteria) this;
        }

        public Criteria andAmountTenderedNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT_TENDERED not in", values, "amountTendered");
            return (Criteria) this;
        }

        public Criteria andAmountTenderedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT_TENDERED between", value1, value2, "amountTendered");
            return (Criteria) this;
        }

        public Criteria andAmountTenderedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT_TENDERED not between", value1, value2, "amountTendered");
            return (Criteria) this;
        }

        public Criteria andAmountRefundedIsNull() {
            addCriterion("AMOUNT_REFUNDED is null");
            return (Criteria) this;
        }

        public Criteria andAmountRefundedIsNotNull() {
            addCriterion("AMOUNT_REFUNDED is not null");
            return (Criteria) this;
        }

        public Criteria andAmountRefundedEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_REFUNDED =", value, "amountRefunded");
            return (Criteria) this;
        }

        public Criteria andAmountRefundedNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_REFUNDED <>", value, "amountRefunded");
            return (Criteria) this;
        }

        public Criteria andAmountRefundedGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT_REFUNDED >", value, "amountRefunded");
            return (Criteria) this;
        }

        public Criteria andAmountRefundedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_REFUNDED >=", value, "amountRefunded");
            return (Criteria) this;
        }

        public Criteria andAmountRefundedLessThan(BigDecimal value) {
            addCriterion("AMOUNT_REFUNDED <", value, "amountRefunded");
            return (Criteria) this;
        }

        public Criteria andAmountRefundedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_REFUNDED <=", value, "amountRefunded");
            return (Criteria) this;
        }

        public Criteria andAmountRefundedIn(List<BigDecimal> values) {
            addCriterion("AMOUNT_REFUNDED in", values, "amountRefunded");
            return (Criteria) this;
        }

        public Criteria andAmountRefundedNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT_REFUNDED not in", values, "amountRefunded");
            return (Criteria) this;
        }

        public Criteria andAmountRefundedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT_REFUNDED between", value1, value2, "amountRefunded");
            return (Criteria) this;
        }

        public Criteria andAmountRefundedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT_REFUNDED not between", value1, value2, "amountRefunded");
            return (Criteria) this;
        }

        public Criteria andLinkOrderIdIsNull() {
            addCriterion("LINK_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andLinkOrderIdIsNotNull() {
            addCriterion("LINK_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLinkOrderIdEqualTo(Integer value) {
            addCriterion("LINK_ORDER_ID =", value, "linkOrderId");
            return (Criteria) this;
        }

        public Criteria andLinkOrderIdNotEqualTo(Integer value) {
            addCriterion("LINK_ORDER_ID <>", value, "linkOrderId");
            return (Criteria) this;
        }

        public Criteria andLinkOrderIdGreaterThan(Integer value) {
            addCriterion("LINK_ORDER_ID >", value, "linkOrderId");
            return (Criteria) this;
        }

        public Criteria andLinkOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LINK_ORDER_ID >=", value, "linkOrderId");
            return (Criteria) this;
        }

        public Criteria andLinkOrderIdLessThan(Integer value) {
            addCriterion("LINK_ORDER_ID <", value, "linkOrderId");
            return (Criteria) this;
        }

        public Criteria andLinkOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("LINK_ORDER_ID <=", value, "linkOrderId");
            return (Criteria) this;
        }

        public Criteria andLinkOrderIdIn(List<Integer> values) {
            addCriterion("LINK_ORDER_ID in", values, "linkOrderId");
            return (Criteria) this;
        }

        public Criteria andLinkOrderIdNotIn(List<Integer> values) {
            addCriterion("LINK_ORDER_ID not in", values, "linkOrderId");
            return (Criteria) this;
        }

        public Criteria andLinkOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("LINK_ORDER_ID between", value1, value2, "linkOrderId");
            return (Criteria) this;
        }

        public Criteria andLinkOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LINK_ORDER_ID not between", value1, value2, "linkOrderId");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdIsNull() {
            addCriterion("M_FREIGHTCATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdIsNotNull() {
            addCriterion("M_FREIGHTCATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdEqualTo(Integer value) {
            addCriterion("M_FREIGHTCATEGORY_ID =", value, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdNotEqualTo(Integer value) {
            addCriterion("M_FREIGHTCATEGORY_ID <>", value, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdGreaterThan(Integer value) {
            addCriterion("M_FREIGHTCATEGORY_ID >", value, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("M_FREIGHTCATEGORY_ID >=", value, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdLessThan(Integer value) {
            addCriterion("M_FREIGHTCATEGORY_ID <", value, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("M_FREIGHTCATEGORY_ID <=", value, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdIn(List<Integer> values) {
            addCriterion("M_FREIGHTCATEGORY_ID in", values, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdNotIn(List<Integer> values) {
            addCriterion("M_FREIGHTCATEGORY_ID not in", values, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("M_FREIGHTCATEGORY_ID between", value1, value2, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("M_FREIGHTCATEGORY_ID not between", value1, value2, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andDropshipBpartnerIdIsNull() {
            addCriterion("DROPSHIP_BPARTNER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDropshipBpartnerIdIsNotNull() {
            addCriterion("DROPSHIP_BPARTNER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDropshipBpartnerIdEqualTo(Integer value) {
            addCriterion("DROPSHIP_BPARTNER_ID =", value, "dropshipBpartnerId");
            return (Criteria) this;
        }

        public Criteria andDropshipBpartnerIdNotEqualTo(Integer value) {
            addCriterion("DROPSHIP_BPARTNER_ID <>", value, "dropshipBpartnerId");
            return (Criteria) this;
        }

        public Criteria andDropshipBpartnerIdGreaterThan(Integer value) {
            addCriterion("DROPSHIP_BPARTNER_ID >", value, "dropshipBpartnerId");
            return (Criteria) this;
        }

        public Criteria andDropshipBpartnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DROPSHIP_BPARTNER_ID >=", value, "dropshipBpartnerId");
            return (Criteria) this;
        }

        public Criteria andDropshipBpartnerIdLessThan(Integer value) {
            addCriterion("DROPSHIP_BPARTNER_ID <", value, "dropshipBpartnerId");
            return (Criteria) this;
        }

        public Criteria andDropshipBpartnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("DROPSHIP_BPARTNER_ID <=", value, "dropshipBpartnerId");
            return (Criteria) this;
        }

        public Criteria andDropshipBpartnerIdIn(List<Integer> values) {
            addCriterion("DROPSHIP_BPARTNER_ID in", values, "dropshipBpartnerId");
            return (Criteria) this;
        }

        public Criteria andDropshipBpartnerIdNotIn(List<Integer> values) {
            addCriterion("DROPSHIP_BPARTNER_ID not in", values, "dropshipBpartnerId");
            return (Criteria) this;
        }

        public Criteria andDropshipBpartnerIdBetween(Integer value1, Integer value2) {
            addCriterion("DROPSHIP_BPARTNER_ID between", value1, value2, "dropshipBpartnerId");
            return (Criteria) this;
        }

        public Criteria andDropshipBpartnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DROPSHIP_BPARTNER_ID not between", value1, value2, "dropshipBpartnerId");
            return (Criteria) this;
        }

        public Criteria andDropshipLocationIdIsNull() {
            addCriterion("DROPSHIP_LOCATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andDropshipLocationIdIsNotNull() {
            addCriterion("DROPSHIP_LOCATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDropshipLocationIdEqualTo(Integer value) {
            addCriterion("DROPSHIP_LOCATION_ID =", value, "dropshipLocationId");
            return (Criteria) this;
        }

        public Criteria andDropshipLocationIdNotEqualTo(Integer value) {
            addCriterion("DROPSHIP_LOCATION_ID <>", value, "dropshipLocationId");
            return (Criteria) this;
        }

        public Criteria andDropshipLocationIdGreaterThan(Integer value) {
            addCriterion("DROPSHIP_LOCATION_ID >", value, "dropshipLocationId");
            return (Criteria) this;
        }

        public Criteria andDropshipLocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DROPSHIP_LOCATION_ID >=", value, "dropshipLocationId");
            return (Criteria) this;
        }

        public Criteria andDropshipLocationIdLessThan(Integer value) {
            addCriterion("DROPSHIP_LOCATION_ID <", value, "dropshipLocationId");
            return (Criteria) this;
        }

        public Criteria andDropshipLocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("DROPSHIP_LOCATION_ID <=", value, "dropshipLocationId");
            return (Criteria) this;
        }

        public Criteria andDropshipLocationIdIn(List<Integer> values) {
            addCriterion("DROPSHIP_LOCATION_ID in", values, "dropshipLocationId");
            return (Criteria) this;
        }

        public Criteria andDropshipLocationIdNotIn(List<Integer> values) {
            addCriterion("DROPSHIP_LOCATION_ID not in", values, "dropshipLocationId");
            return (Criteria) this;
        }

        public Criteria andDropshipLocationIdBetween(Integer value1, Integer value2) {
            addCriterion("DROPSHIP_LOCATION_ID between", value1, value2, "dropshipLocationId");
            return (Criteria) this;
        }

        public Criteria andDropshipLocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DROPSHIP_LOCATION_ID not between", value1, value2, "dropshipLocationId");
            return (Criteria) this;
        }

        public Criteria andDropshipUserIdIsNull() {
            addCriterion("DROPSHIP_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDropshipUserIdIsNotNull() {
            addCriterion("DROPSHIP_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDropshipUserIdEqualTo(Integer value) {
            addCriterion("DROPSHIP_USER_ID =", value, "dropshipUserId");
            return (Criteria) this;
        }

        public Criteria andDropshipUserIdNotEqualTo(Integer value) {
            addCriterion("DROPSHIP_USER_ID <>", value, "dropshipUserId");
            return (Criteria) this;
        }

        public Criteria andDropshipUserIdGreaterThan(Integer value) {
            addCriterion("DROPSHIP_USER_ID >", value, "dropshipUserId");
            return (Criteria) this;
        }

        public Criteria andDropshipUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DROPSHIP_USER_ID >=", value, "dropshipUserId");
            return (Criteria) this;
        }

        public Criteria andDropshipUserIdLessThan(Integer value) {
            addCriterion("DROPSHIP_USER_ID <", value, "dropshipUserId");
            return (Criteria) this;
        }

        public Criteria andDropshipUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("DROPSHIP_USER_ID <=", value, "dropshipUserId");
            return (Criteria) this;
        }

        public Criteria andDropshipUserIdIn(List<Integer> values) {
            addCriterion("DROPSHIP_USER_ID in", values, "dropshipUserId");
            return (Criteria) this;
        }

        public Criteria andDropshipUserIdNotIn(List<Integer> values) {
            addCriterion("DROPSHIP_USER_ID not in", values, "dropshipUserId");
            return (Criteria) this;
        }

        public Criteria andDropshipUserIdBetween(Integer value1, Integer value2) {
            addCriterion("DROPSHIP_USER_ID between", value1, value2, "dropshipUserId");
            return (Criteria) this;
        }

        public Criteria andDropshipUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DROPSHIP_USER_ID not between", value1, value2, "dropshipUserId");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeIsNull() {
            addCriterion("PROMOTION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeIsNotNull() {
            addCriterion("PROMOTION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeEqualTo(String value) {
            addCriterion("PROMOTION_CODE =", value, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeNotEqualTo(String value) {
            addCriterion("PROMOTION_CODE <>", value, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeGreaterThan(String value) {
            addCriterion("PROMOTION_CODE >", value, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROMOTION_CODE >=", value, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeLessThan(String value) {
            addCriterion("PROMOTION_CODE <", value, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeLessThanOrEqualTo(String value) {
            addCriterion("PROMOTION_CODE <=", value, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeLike(String value) {
            addCriterion("PROMOTION_CODE like", value, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeNotLike(String value) {
            addCriterion("PROMOTION_CODE not like", value, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeIn(List<String> values) {
            addCriterion("PROMOTION_CODE in", values, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeNotIn(List<String> values) {
            addCriterion("PROMOTION_CODE not in", values, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeBetween(String value1, String value2) {
            addCriterion("PROMOTION_CODE between", value1, value2, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andPromotionCodeNotBetween(String value1, String value2) {
            addCriterion("PROMOTION_CODE not between", value1, value2, "promotionCode");
            return (Criteria) this;
        }

        public Criteria andCOrdersourceIdIsNull() {
            addCriterion("C_ORDERSOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCOrdersourceIdIsNotNull() {
            addCriterion("C_ORDERSOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCOrdersourceIdEqualTo(Integer value) {
            addCriterion("C_ORDERSOURCE_ID =", value, "cOrdersourceId");
            return (Criteria) this;
        }

        public Criteria andCOrdersourceIdNotEqualTo(Integer value) {
            addCriterion("C_ORDERSOURCE_ID <>", value, "cOrdersourceId");
            return (Criteria) this;
        }

        public Criteria andCOrdersourceIdGreaterThan(Integer value) {
            addCriterion("C_ORDERSOURCE_ID >", value, "cOrdersourceId");
            return (Criteria) this;
        }

        public Criteria andCOrdersourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_ORDERSOURCE_ID >=", value, "cOrdersourceId");
            return (Criteria) this;
        }

        public Criteria andCOrdersourceIdLessThan(Integer value) {
            addCriterion("C_ORDERSOURCE_ID <", value, "cOrdersourceId");
            return (Criteria) this;
        }

        public Criteria andCOrdersourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_ORDERSOURCE_ID <=", value, "cOrdersourceId");
            return (Criteria) this;
        }

        public Criteria andCOrdersourceIdIn(List<Integer> values) {
            addCriterion("C_ORDERSOURCE_ID in", values, "cOrdersourceId");
            return (Criteria) this;
        }

        public Criteria andCOrdersourceIdNotIn(List<Integer> values) {
            addCriterion("C_ORDERSOURCE_ID not in", values, "cOrdersourceId");
            return (Criteria) this;
        }

        public Criteria andCOrdersourceIdBetween(Integer value1, Integer value2) {
            addCriterion("C_ORDERSOURCE_ID between", value1, value2, "cOrdersourceId");
            return (Criteria) this;
        }

        public Criteria andCOrdersourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_ORDERSOURCE_ID not between", value1, value2, "cOrdersourceId");
            return (Criteria) this;
        }

        public Criteria andProcessdOnIsNull() {
            addCriterion("PROCESSD_ON is null");
            return (Criteria) this;
        }

        public Criteria andProcessdOnIsNotNull() {
            addCriterion("PROCESSD_ON is not null");
            return (Criteria) this;
        }

        public Criteria andProcessdOnEqualTo(BigDecimal value) {
            addCriterion("PROCESSD_ON =", value, "processdOn");
            return (Criteria) this;
        }

        public Criteria andProcessdOnNotEqualTo(BigDecimal value) {
            addCriterion("PROCESSD_ON <>", value, "processdOn");
            return (Criteria) this;
        }

        public Criteria andProcessdOnGreaterThan(BigDecimal value) {
            addCriterion("PROCESSD_ON >", value, "processdOn");
            return (Criteria) this;
        }

        public Criteria andProcessdOnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROCESSD_ON >=", value, "processdOn");
            return (Criteria) this;
        }

        public Criteria andProcessdOnLessThan(BigDecimal value) {
            addCriterion("PROCESSD_ON <", value, "processdOn");
            return (Criteria) this;
        }

        public Criteria andProcessdOnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROCESSD_ON <=", value, "processdOn");
            return (Criteria) this;
        }

        public Criteria andProcessdOnIn(List<BigDecimal> values) {
            addCriterion("PROCESSD_ON in", values, "processdOn");
            return (Criteria) this;
        }

        public Criteria andProcessdOnNotIn(List<BigDecimal> values) {
            addCriterion("PROCESSD_ON not in", values, "processdOn");
            return (Criteria) this;
        }

        public Criteria andProcessdOnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROCESSD_ON between", value1, value2, "processdOn");
            return (Criteria) this;
        }

        public Criteria andProcessdOnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROCESSD_ON not between", value1, value2, "processdOn");
            return (Criteria) this;
        }

        public Criteria andCOpportunityIdIsNull() {
            addCriterion("C_OPPORTUNITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCOpportunityIdIsNotNull() {
            addCriterion("C_OPPORTUNITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCOpportunityIdEqualTo(Integer value) {
            addCriterion("C_OPPORTUNITY_ID =", value, "cOpportunityId");
            return (Criteria) this;
        }

        public Criteria andCOpportunityIdNotEqualTo(Integer value) {
            addCriterion("C_OPPORTUNITY_ID <>", value, "cOpportunityId");
            return (Criteria) this;
        }

        public Criteria andCOpportunityIdGreaterThan(Integer value) {
            addCriterion("C_OPPORTUNITY_ID >", value, "cOpportunityId");
            return (Criteria) this;
        }

        public Criteria andCOpportunityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_OPPORTUNITY_ID >=", value, "cOpportunityId");
            return (Criteria) this;
        }

        public Criteria andCOpportunityIdLessThan(Integer value) {
            addCriterion("C_OPPORTUNITY_ID <", value, "cOpportunityId");
            return (Criteria) this;
        }

        public Criteria andCOpportunityIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_OPPORTUNITY_ID <=", value, "cOpportunityId");
            return (Criteria) this;
        }

        public Criteria andCOpportunityIdIn(List<Integer> values) {
            addCriterion("C_OPPORTUNITY_ID in", values, "cOpportunityId");
            return (Criteria) this;
        }

        public Criteria andCOpportunityIdNotIn(List<Integer> values) {
            addCriterion("C_OPPORTUNITY_ID not in", values, "cOpportunityId");
            return (Criteria) this;
        }

        public Criteria andCOpportunityIdBetween(Integer value1, Integer value2) {
            addCriterion("C_OPPORTUNITY_ID between", value1, value2, "cOpportunityId");
            return (Criteria) this;
        }

        public Criteria andCOpportunityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_OPPORTUNITY_ID not between", value1, value2, "cOpportunityId");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromSoIsNull() {
            addCriterion("INOUTGENFROM_SO is null");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromSoIsNotNull() {
            addCriterion("INOUTGENFROM_SO is not null");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromSoEqualTo(String value) {
            addCriterion("INOUTGENFROM_SO =", value, "inoutgenfromSo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromSoNotEqualTo(String value) {
            addCriterion("INOUTGENFROM_SO <>", value, "inoutgenfromSo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromSoGreaterThan(String value) {
            addCriterion("INOUTGENFROM_SO >", value, "inoutgenfromSo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromSoGreaterThanOrEqualTo(String value) {
            addCriterion("INOUTGENFROM_SO >=", value, "inoutgenfromSo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromSoLessThan(String value) {
            addCriterion("INOUTGENFROM_SO <", value, "inoutgenfromSo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromSoLessThanOrEqualTo(String value) {
            addCriterion("INOUTGENFROM_SO <=", value, "inoutgenfromSo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromSoLike(String value) {
            addCriterion("INOUTGENFROM_SO like", value, "inoutgenfromSo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromSoNotLike(String value) {
            addCriterion("INOUTGENFROM_SO not like", value, "inoutgenfromSo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromSoIn(List<String> values) {
            addCriterion("INOUTGENFROM_SO in", values, "inoutgenfromSo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromSoNotIn(List<String> values) {
            addCriterion("INOUTGENFROM_SO not in", values, "inoutgenfromSo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromSoBetween(String value1, String value2) {
            addCriterion("INOUTGENFROM_SO between", value1, value2, "inoutgenfromSo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromSoNotBetween(String value1, String value2) {
            addCriterion("INOUTGENFROM_SO not between", value1, value2, "inoutgenfromSo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromPoIsNull() {
            addCriterion("INOUTGENFROM_PO is null");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromPoIsNotNull() {
            addCriterion("INOUTGENFROM_PO is not null");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromPoEqualTo(String value) {
            addCriterion("INOUTGENFROM_PO =", value, "inoutgenfromPo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromPoNotEqualTo(String value) {
            addCriterion("INOUTGENFROM_PO <>", value, "inoutgenfromPo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromPoGreaterThan(String value) {
            addCriterion("INOUTGENFROM_PO >", value, "inoutgenfromPo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromPoGreaterThanOrEqualTo(String value) {
            addCriterion("INOUTGENFROM_PO >=", value, "inoutgenfromPo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromPoLessThan(String value) {
            addCriterion("INOUTGENFROM_PO <", value, "inoutgenfromPo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromPoLessThanOrEqualTo(String value) {
            addCriterion("INOUTGENFROM_PO <=", value, "inoutgenfromPo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromPoLike(String value) {
            addCriterion("INOUTGENFROM_PO like", value, "inoutgenfromPo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromPoNotLike(String value) {
            addCriterion("INOUTGENFROM_PO not like", value, "inoutgenfromPo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromPoIn(List<String> values) {
            addCriterion("INOUTGENFROM_PO in", values, "inoutgenfromPo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromPoNotIn(List<String> values) {
            addCriterion("INOUTGENFROM_PO not in", values, "inoutgenfromPo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromPoBetween(String value1, String value2) {
            addCriterion("INOUTGENFROM_PO between", value1, value2, "inoutgenfromPo");
            return (Criteria) this;
        }

        public Criteria andInoutgenfromPoNotBetween(String value1, String value2) {
            addCriterion("INOUTGENFROM_PO not between", value1, value2, "inoutgenfromPo");
            return (Criteria) this;
        }

        public Criteria andProformaInvoiceIsNull() {
            addCriterion("PROFORMA_INVOICE is null");
            return (Criteria) this;
        }

        public Criteria andProformaInvoiceIsNotNull() {
            addCriterion("PROFORMA_INVOICE is not null");
            return (Criteria) this;
        }

        public Criteria andProformaInvoiceEqualTo(String value) {
            addCriterion("PROFORMA_INVOICE =", value, "proformaInvoice");
            return (Criteria) this;
        }

        public Criteria andProformaInvoiceNotEqualTo(String value) {
            addCriterion("PROFORMA_INVOICE <>", value, "proformaInvoice");
            return (Criteria) this;
        }

        public Criteria andProformaInvoiceGreaterThan(String value) {
            addCriterion("PROFORMA_INVOICE >", value, "proformaInvoice");
            return (Criteria) this;
        }

        public Criteria andProformaInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("PROFORMA_INVOICE >=", value, "proformaInvoice");
            return (Criteria) this;
        }

        public Criteria andProformaInvoiceLessThan(String value) {
            addCriterion("PROFORMA_INVOICE <", value, "proformaInvoice");
            return (Criteria) this;
        }

        public Criteria andProformaInvoiceLessThanOrEqualTo(String value) {
            addCriterion("PROFORMA_INVOICE <=", value, "proformaInvoice");
            return (Criteria) this;
        }

        public Criteria andProformaInvoiceLike(String value) {
            addCriterion("PROFORMA_INVOICE like", value, "proformaInvoice");
            return (Criteria) this;
        }

        public Criteria andProformaInvoiceNotLike(String value) {
            addCriterion("PROFORMA_INVOICE not like", value, "proformaInvoice");
            return (Criteria) this;
        }

        public Criteria andProformaInvoiceIn(List<String> values) {
            addCriterion("PROFORMA_INVOICE in", values, "proformaInvoice");
            return (Criteria) this;
        }

        public Criteria andProformaInvoiceNotIn(List<String> values) {
            addCriterion("PROFORMA_INVOICE not in", values, "proformaInvoice");
            return (Criteria) this;
        }

        public Criteria andProformaInvoiceBetween(String value1, String value2) {
            addCriterion("PROFORMA_INVOICE between", value1, value2, "proformaInvoice");
            return (Criteria) this;
        }

        public Criteria andProformaInvoiceNotBetween(String value1, String value2) {
            addCriterion("PROFORMA_INVOICE not between", value1, value2, "proformaInvoice");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdIsNull() {
            addCriterion("AMAZON_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdIsNotNull() {
            addCriterion("AMAZON_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdEqualTo(String value) {
            addCriterion("AMAZON_ORDER_ID =", value, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdNotEqualTo(String value) {
            addCriterion("AMAZON_ORDER_ID <>", value, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdGreaterThan(String value) {
            addCriterion("AMAZON_ORDER_ID >", value, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("AMAZON_ORDER_ID >=", value, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdLessThan(String value) {
            addCriterion("AMAZON_ORDER_ID <", value, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdLessThanOrEqualTo(String value) {
            addCriterion("AMAZON_ORDER_ID <=", value, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdLike(String value) {
            addCriterion("AMAZON_ORDER_ID like", value, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdNotLike(String value) {
            addCriterion("AMAZON_ORDER_ID not like", value, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdIn(List<String> values) {
            addCriterion("AMAZON_ORDER_ID in", values, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdNotIn(List<String> values) {
            addCriterion("AMAZON_ORDER_ID not in", values, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdBetween(String value1, String value2) {
            addCriterion("AMAZON_ORDER_ID between", value1, value2, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdNotBetween(String value1, String value2) {
            addCriterion("AMAZON_ORDER_ID not between", value1, value2, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonPurchaseDateIsNull() {
            addCriterion("AMAZON_PURCHASE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAmazonPurchaseDateIsNotNull() {
            addCriterion("AMAZON_PURCHASE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonPurchaseDateEqualTo(Date value) {
            addCriterion("AMAZON_PURCHASE_DATE =", value, "amazonPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andAmazonPurchaseDateNotEqualTo(Date value) {
            addCriterion("AMAZON_PURCHASE_DATE <>", value, "amazonPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andAmazonPurchaseDateGreaterThan(Date value) {
            addCriterion("AMAZON_PURCHASE_DATE >", value, "amazonPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andAmazonPurchaseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("AMAZON_PURCHASE_DATE >=", value, "amazonPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andAmazonPurchaseDateLessThan(Date value) {
            addCriterion("AMAZON_PURCHASE_DATE <", value, "amazonPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andAmazonPurchaseDateLessThanOrEqualTo(Date value) {
            addCriterion("AMAZON_PURCHASE_DATE <=", value, "amazonPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andAmazonPurchaseDateIn(List<Date> values) {
            addCriterion("AMAZON_PURCHASE_DATE in", values, "amazonPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andAmazonPurchaseDateNotIn(List<Date> values) {
            addCriterion("AMAZON_PURCHASE_DATE not in", values, "amazonPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andAmazonPurchaseDateBetween(Date value1, Date value2) {
            addCriterion("AMAZON_PURCHASE_DATE between", value1, value2, "amazonPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andAmazonPurchaseDateNotBetween(Date value1, Date value2) {
            addCriterion("AMAZON_PURCHASE_DATE not between", value1, value2, "amazonPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andAmazonLastupdatedDateIsNull() {
            addCriterion("AMAZON_LASTUPDATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAmazonLastupdatedDateIsNotNull() {
            addCriterion("AMAZON_LASTUPDATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonLastupdatedDateEqualTo(Date value) {
            addCriterion("AMAZON_LASTUPDATED_DATE =", value, "amazonLastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andAmazonLastupdatedDateNotEqualTo(Date value) {
            addCriterion("AMAZON_LASTUPDATED_DATE <>", value, "amazonLastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andAmazonLastupdatedDateGreaterThan(Date value) {
            addCriterion("AMAZON_LASTUPDATED_DATE >", value, "amazonLastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andAmazonLastupdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("AMAZON_LASTUPDATED_DATE >=", value, "amazonLastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andAmazonLastupdatedDateLessThan(Date value) {
            addCriterion("AMAZON_LASTUPDATED_DATE <", value, "amazonLastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andAmazonLastupdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("AMAZON_LASTUPDATED_DATE <=", value, "amazonLastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andAmazonLastupdatedDateIn(List<Date> values) {
            addCriterion("AMAZON_LASTUPDATED_DATE in", values, "amazonLastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andAmazonLastupdatedDateNotIn(List<Date> values) {
            addCriterion("AMAZON_LASTUPDATED_DATE not in", values, "amazonLastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andAmazonLastupdatedDateBetween(Date value1, Date value2) {
            addCriterion("AMAZON_LASTUPDATED_DATE between", value1, value2, "amazonLastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andAmazonLastupdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("AMAZON_LASTUPDATED_DATE not between", value1, value2, "amazonLastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderStatusIsNull() {
            addCriterion("AMAZON_ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderStatusIsNotNull() {
            addCriterion("AMAZON_ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderStatusEqualTo(String value) {
            addCriterion("AMAZON_ORDER_STATUS =", value, "amazonOrderStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderStatusNotEqualTo(String value) {
            addCriterion("AMAZON_ORDER_STATUS <>", value, "amazonOrderStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderStatusGreaterThan(String value) {
            addCriterion("AMAZON_ORDER_STATUS >", value, "amazonOrderStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("AMAZON_ORDER_STATUS >=", value, "amazonOrderStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderStatusLessThan(String value) {
            addCriterion("AMAZON_ORDER_STATUS <", value, "amazonOrderStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("AMAZON_ORDER_STATUS <=", value, "amazonOrderStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderStatusLike(String value) {
            addCriterion("AMAZON_ORDER_STATUS like", value, "amazonOrderStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderStatusNotLike(String value) {
            addCriterion("AMAZON_ORDER_STATUS not like", value, "amazonOrderStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderStatusIn(List<String> values) {
            addCriterion("AMAZON_ORDER_STATUS in", values, "amazonOrderStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderStatusNotIn(List<String> values) {
            addCriterion("AMAZON_ORDER_STATUS not in", values, "amazonOrderStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderStatusBetween(String value1, String value2) {
            addCriterion("AMAZON_ORDER_STATUS between", value1, value2, "amazonOrderStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderStatusNotBetween(String value1, String value2) {
            addCriterion("AMAZON_ORDER_STATUS not between", value1, value2, "amazonOrderStatus");
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

        public Criteria andAmazonFulfillmentChannelIsNull() {
            addCriterion("AMAZON_FULFILLMENT_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andAmazonFulfillmentChannelIsNotNull() {
            addCriterion("AMAZON_FULFILLMENT_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonFulfillmentChannelEqualTo(String value) {
            addCriterion("AMAZON_FULFILLMENT_CHANNEL =", value, "amazonFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonFulfillmentChannelNotEqualTo(String value) {
            addCriterion("AMAZON_FULFILLMENT_CHANNEL <>", value, "amazonFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonFulfillmentChannelGreaterThan(String value) {
            addCriterion("AMAZON_FULFILLMENT_CHANNEL >", value, "amazonFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonFulfillmentChannelGreaterThanOrEqualTo(String value) {
            addCriterion("AMAZON_FULFILLMENT_CHANNEL >=", value, "amazonFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonFulfillmentChannelLessThan(String value) {
            addCriterion("AMAZON_FULFILLMENT_CHANNEL <", value, "amazonFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonFulfillmentChannelLessThanOrEqualTo(String value) {
            addCriterion("AMAZON_FULFILLMENT_CHANNEL <=", value, "amazonFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonFulfillmentChannelLike(String value) {
            addCriterion("AMAZON_FULFILLMENT_CHANNEL like", value, "amazonFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonFulfillmentChannelNotLike(String value) {
            addCriterion("AMAZON_FULFILLMENT_CHANNEL not like", value, "amazonFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonFulfillmentChannelIn(List<String> values) {
            addCriterion("AMAZON_FULFILLMENT_CHANNEL in", values, "amazonFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonFulfillmentChannelNotIn(List<String> values) {
            addCriterion("AMAZON_FULFILLMENT_CHANNEL not in", values, "amazonFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonFulfillmentChannelBetween(String value1, String value2) {
            addCriterion("AMAZON_FULFILLMENT_CHANNEL between", value1, value2, "amazonFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonFulfillmentChannelNotBetween(String value1, String value2) {
            addCriterion("AMAZON_FULFILLMENT_CHANNEL not between", value1, value2, "amazonFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andAmazonShipServiceLevelIsNull() {
            addCriterion("AMAZON_SHIP_SERVICE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andAmazonShipServiceLevelIsNotNull() {
            addCriterion("AMAZON_SHIP_SERVICE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonShipServiceLevelEqualTo(String value) {
            addCriterion("AMAZON_SHIP_SERVICE_LEVEL =", value, "amazonShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andAmazonShipServiceLevelNotEqualTo(String value) {
            addCriterion("AMAZON_SHIP_SERVICE_LEVEL <>", value, "amazonShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andAmazonShipServiceLevelGreaterThan(String value) {
            addCriterion("AMAZON_SHIP_SERVICE_LEVEL >", value, "amazonShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andAmazonShipServiceLevelGreaterThanOrEqualTo(String value) {
            addCriterion("AMAZON_SHIP_SERVICE_LEVEL >=", value, "amazonShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andAmazonShipServiceLevelLessThan(String value) {
            addCriterion("AMAZON_SHIP_SERVICE_LEVEL <", value, "amazonShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andAmazonShipServiceLevelLessThanOrEqualTo(String value) {
            addCriterion("AMAZON_SHIP_SERVICE_LEVEL <=", value, "amazonShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andAmazonShipServiceLevelLike(String value) {
            addCriterion("AMAZON_SHIP_SERVICE_LEVEL like", value, "amazonShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andAmazonShipServiceLevelNotLike(String value) {
            addCriterion("AMAZON_SHIP_SERVICE_LEVEL not like", value, "amazonShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andAmazonShipServiceLevelIn(List<String> values) {
            addCriterion("AMAZON_SHIP_SERVICE_LEVEL in", values, "amazonShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andAmazonShipServiceLevelNotIn(List<String> values) {
            addCriterion("AMAZON_SHIP_SERVICE_LEVEL not in", values, "amazonShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andAmazonShipServiceLevelBetween(String value1, String value2) {
            addCriterion("AMAZON_SHIP_SERVICE_LEVEL between", value1, value2, "amazonShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andAmazonShipServiceLevelNotBetween(String value1, String value2) {
            addCriterion("AMAZON_SHIP_SERVICE_LEVEL not between", value1, value2, "amazonShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andAmazonShipStateIsNull() {
            addCriterion("AMAZON_SHIP_STATE is null");
            return (Criteria) this;
        }

        public Criteria andAmazonShipStateIsNotNull() {
            addCriterion("AMAZON_SHIP_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonShipStateEqualTo(String value) {
            addCriterion("AMAZON_SHIP_STATE =", value, "amazonShipState");
            return (Criteria) this;
        }

        public Criteria andAmazonShipStateNotEqualTo(String value) {
            addCriterion("AMAZON_SHIP_STATE <>", value, "amazonShipState");
            return (Criteria) this;
        }

        public Criteria andAmazonShipStateGreaterThan(String value) {
            addCriterion("AMAZON_SHIP_STATE >", value, "amazonShipState");
            return (Criteria) this;
        }

        public Criteria andAmazonShipStateGreaterThanOrEqualTo(String value) {
            addCriterion("AMAZON_SHIP_STATE >=", value, "amazonShipState");
            return (Criteria) this;
        }

        public Criteria andAmazonShipStateLessThan(String value) {
            addCriterion("AMAZON_SHIP_STATE <", value, "amazonShipState");
            return (Criteria) this;
        }

        public Criteria andAmazonShipStateLessThanOrEqualTo(String value) {
            addCriterion("AMAZON_SHIP_STATE <=", value, "amazonShipState");
            return (Criteria) this;
        }

        public Criteria andAmazonShipStateLike(String value) {
            addCriterion("AMAZON_SHIP_STATE like", value, "amazonShipState");
            return (Criteria) this;
        }

        public Criteria andAmazonShipStateNotLike(String value) {
            addCriterion("AMAZON_SHIP_STATE not like", value, "amazonShipState");
            return (Criteria) this;
        }

        public Criteria andAmazonShipStateIn(List<String> values) {
            addCriterion("AMAZON_SHIP_STATE in", values, "amazonShipState");
            return (Criteria) this;
        }

        public Criteria andAmazonShipStateNotIn(List<String> values) {
            addCriterion("AMAZON_SHIP_STATE not in", values, "amazonShipState");
            return (Criteria) this;
        }

        public Criteria andAmazonShipStateBetween(String value1, String value2) {
            addCriterion("AMAZON_SHIP_STATE between", value1, value2, "amazonShipState");
            return (Criteria) this;
        }

        public Criteria andAmazonShipStateNotBetween(String value1, String value2) {
            addCriterion("AMAZON_SHIP_STATE not between", value1, value2, "amazonShipState");
            return (Criteria) this;
        }

        public Criteria andAmazonShipPostalCodeIsNull() {
            addCriterion("AMAZON_SHIP_POSTAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAmazonShipPostalCodeIsNotNull() {
            addCriterion("AMAZON_SHIP_POSTAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonShipPostalCodeEqualTo(String value) {
            addCriterion("AMAZON_SHIP_POSTAL_CODE =", value, "amazonShipPostalCode");
            return (Criteria) this;
        }

        public Criteria andAmazonShipPostalCodeNotEqualTo(String value) {
            addCriterion("AMAZON_SHIP_POSTAL_CODE <>", value, "amazonShipPostalCode");
            return (Criteria) this;
        }

        public Criteria andAmazonShipPostalCodeGreaterThan(String value) {
            addCriterion("AMAZON_SHIP_POSTAL_CODE >", value, "amazonShipPostalCode");
            return (Criteria) this;
        }

        public Criteria andAmazonShipPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AMAZON_SHIP_POSTAL_CODE >=", value, "amazonShipPostalCode");
            return (Criteria) this;
        }

        public Criteria andAmazonShipPostalCodeLessThan(String value) {
            addCriterion("AMAZON_SHIP_POSTAL_CODE <", value, "amazonShipPostalCode");
            return (Criteria) this;
        }

        public Criteria andAmazonShipPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("AMAZON_SHIP_POSTAL_CODE <=", value, "amazonShipPostalCode");
            return (Criteria) this;
        }

        public Criteria andAmazonShipPostalCodeLike(String value) {
            addCriterion("AMAZON_SHIP_POSTAL_CODE like", value, "amazonShipPostalCode");
            return (Criteria) this;
        }

        public Criteria andAmazonShipPostalCodeNotLike(String value) {
            addCriterion("AMAZON_SHIP_POSTAL_CODE not like", value, "amazonShipPostalCode");
            return (Criteria) this;
        }

        public Criteria andAmazonShipPostalCodeIn(List<String> values) {
            addCriterion("AMAZON_SHIP_POSTAL_CODE in", values, "amazonShipPostalCode");
            return (Criteria) this;
        }

        public Criteria andAmazonShipPostalCodeNotIn(List<String> values) {
            addCriterion("AMAZON_SHIP_POSTAL_CODE not in", values, "amazonShipPostalCode");
            return (Criteria) this;
        }

        public Criteria andAmazonShipPostalCodeBetween(String value1, String value2) {
            addCriterion("AMAZON_SHIP_POSTAL_CODE between", value1, value2, "amazonShipPostalCode");
            return (Criteria) this;
        }

        public Criteria andAmazonShipPostalCodeNotBetween(String value1, String value2) {
            addCriterion("AMAZON_SHIP_POSTAL_CODE not between", value1, value2, "amazonShipPostalCode");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCountryIsNull() {
            addCriterion("AMAZON_SHIP_COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCountryIsNotNull() {
            addCriterion("AMAZON_SHIP_COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCountryEqualTo(String value) {
            addCriterion("AMAZON_SHIP_COUNTRY =", value, "amazonShipCountry");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCountryNotEqualTo(String value) {
            addCriterion("AMAZON_SHIP_COUNTRY <>", value, "amazonShipCountry");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCountryGreaterThan(String value) {
            addCriterion("AMAZON_SHIP_COUNTRY >", value, "amazonShipCountry");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCountryGreaterThanOrEqualTo(String value) {
            addCriterion("AMAZON_SHIP_COUNTRY >=", value, "amazonShipCountry");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCountryLessThan(String value) {
            addCriterion("AMAZON_SHIP_COUNTRY <", value, "amazonShipCountry");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCountryLessThanOrEqualTo(String value) {
            addCriterion("AMAZON_SHIP_COUNTRY <=", value, "amazonShipCountry");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCountryLike(String value) {
            addCriterion("AMAZON_SHIP_COUNTRY like", value, "amazonShipCountry");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCountryNotLike(String value) {
            addCriterion("AMAZON_SHIP_COUNTRY not like", value, "amazonShipCountry");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCountryIn(List<String> values) {
            addCriterion("AMAZON_SHIP_COUNTRY in", values, "amazonShipCountry");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCountryNotIn(List<String> values) {
            addCriterion("AMAZON_SHIP_COUNTRY not in", values, "amazonShipCountry");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCountryBetween(String value1, String value2) {
            addCriterion("AMAZON_SHIP_COUNTRY between", value1, value2, "amazonShipCountry");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCountryNotBetween(String value1, String value2) {
            addCriterion("AMAZON_SHIP_COUNTRY not between", value1, value2, "amazonShipCountry");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCityIsNull() {
            addCriterion("AMAZON_SHIP_CITY is null");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCityIsNotNull() {
            addCriterion("AMAZON_SHIP_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCityEqualTo(String value) {
            addCriterion("AMAZON_SHIP_CITY =", value, "amazonShipCity");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCityNotEqualTo(String value) {
            addCriterion("AMAZON_SHIP_CITY <>", value, "amazonShipCity");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCityGreaterThan(String value) {
            addCriterion("AMAZON_SHIP_CITY >", value, "amazonShipCity");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCityGreaterThanOrEqualTo(String value) {
            addCriterion("AMAZON_SHIP_CITY >=", value, "amazonShipCity");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCityLessThan(String value) {
            addCriterion("AMAZON_SHIP_CITY <", value, "amazonShipCity");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCityLessThanOrEqualTo(String value) {
            addCriterion("AMAZON_SHIP_CITY <=", value, "amazonShipCity");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCityLike(String value) {
            addCriterion("AMAZON_SHIP_CITY like", value, "amazonShipCity");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCityNotLike(String value) {
            addCriterion("AMAZON_SHIP_CITY not like", value, "amazonShipCity");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCityIn(List<String> values) {
            addCriterion("AMAZON_SHIP_CITY in", values, "amazonShipCity");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCityNotIn(List<String> values) {
            addCriterion("AMAZON_SHIP_CITY not in", values, "amazonShipCity");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCityBetween(String value1, String value2) {
            addCriterion("AMAZON_SHIP_CITY between", value1, value2, "amazonShipCity");
            return (Criteria) this;
        }

        public Criteria andAmazonShipCityNotBetween(String value1, String value2) {
            addCriterion("AMAZON_SHIP_CITY not between", value1, value2, "amazonShipCity");
            return (Criteria) this;
        }

        public Criteria andShipmentGeneratedIsNull() {
            addCriterion("SHIPMENT_GENERATED is null");
            return (Criteria) this;
        }

        public Criteria andShipmentGeneratedIsNotNull() {
            addCriterion("SHIPMENT_GENERATED is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentGeneratedEqualTo(String value) {
            addCriterion("SHIPMENT_GENERATED =", value, "shipmentGenerated");
            return (Criteria) this;
        }

        public Criteria andShipmentGeneratedNotEqualTo(String value) {
            addCriterion("SHIPMENT_GENERATED <>", value, "shipmentGenerated");
            return (Criteria) this;
        }

        public Criteria andShipmentGeneratedGreaterThan(String value) {
            addCriterion("SHIPMENT_GENERATED >", value, "shipmentGenerated");
            return (Criteria) this;
        }

        public Criteria andShipmentGeneratedGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_GENERATED >=", value, "shipmentGenerated");
            return (Criteria) this;
        }

        public Criteria andShipmentGeneratedLessThan(String value) {
            addCriterion("SHIPMENT_GENERATED <", value, "shipmentGenerated");
            return (Criteria) this;
        }

        public Criteria andShipmentGeneratedLessThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_GENERATED <=", value, "shipmentGenerated");
            return (Criteria) this;
        }

        public Criteria andShipmentGeneratedLike(String value) {
            addCriterion("SHIPMENT_GENERATED like", value, "shipmentGenerated");
            return (Criteria) this;
        }

        public Criteria andShipmentGeneratedNotLike(String value) {
            addCriterion("SHIPMENT_GENERATED not like", value, "shipmentGenerated");
            return (Criteria) this;
        }

        public Criteria andShipmentGeneratedIn(List<String> values) {
            addCriterion("SHIPMENT_GENERATED in", values, "shipmentGenerated");
            return (Criteria) this;
        }

        public Criteria andShipmentGeneratedNotIn(List<String> values) {
            addCriterion("SHIPMENT_GENERATED not in", values, "shipmentGenerated");
            return (Criteria) this;
        }

        public Criteria andShipmentGeneratedBetween(String value1, String value2) {
            addCriterion("SHIPMENT_GENERATED between", value1, value2, "shipmentGenerated");
            return (Criteria) this;
        }

        public Criteria andShipmentGeneratedNotBetween(String value1, String value2) {
            addCriterion("SHIPMENT_GENERATED not between", value1, value2, "shipmentGenerated");
            return (Criteria) this;
        }

        public Criteria andIsInspectedIsNull() {
            addCriterion("IS_INSPECTED is null");
            return (Criteria) this;
        }

        public Criteria andIsInspectedIsNotNull() {
            addCriterion("IS_INSPECTED is not null");
            return (Criteria) this;
        }

        public Criteria andIsInspectedEqualTo(String value) {
            addCriterion("IS_INSPECTED =", value, "isInspected");
            return (Criteria) this;
        }

        public Criteria andIsInspectedNotEqualTo(String value) {
            addCriterion("IS_INSPECTED <>", value, "isInspected");
            return (Criteria) this;
        }

        public Criteria andIsInspectedGreaterThan(String value) {
            addCriterion("IS_INSPECTED >", value, "isInspected");
            return (Criteria) this;
        }

        public Criteria andIsInspectedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_INSPECTED >=", value, "isInspected");
            return (Criteria) this;
        }

        public Criteria andIsInspectedLessThan(String value) {
            addCriterion("IS_INSPECTED <", value, "isInspected");
            return (Criteria) this;
        }

        public Criteria andIsInspectedLessThanOrEqualTo(String value) {
            addCriterion("IS_INSPECTED <=", value, "isInspected");
            return (Criteria) this;
        }

        public Criteria andIsInspectedLike(String value) {
            addCriterion("IS_INSPECTED like", value, "isInspected");
            return (Criteria) this;
        }

        public Criteria andIsInspectedNotLike(String value) {
            addCriterion("IS_INSPECTED not like", value, "isInspected");
            return (Criteria) this;
        }

        public Criteria andIsInspectedIn(List<String> values) {
            addCriterion("IS_INSPECTED in", values, "isInspected");
            return (Criteria) this;
        }

        public Criteria andIsInspectedNotIn(List<String> values) {
            addCriterion("IS_INSPECTED not in", values, "isInspected");
            return (Criteria) this;
        }

        public Criteria andIsInspectedBetween(String value1, String value2) {
            addCriterion("IS_INSPECTED between", value1, value2, "isInspected");
            return (Criteria) this;
        }

        public Criteria andIsInspectedNotBetween(String value1, String value2) {
            addCriterion("IS_INSPECTED not between", value1, value2, "isInspected");
            return (Criteria) this;
        }

        public Criteria andMultiplyRateIsNull() {
            addCriterion("MULTIPLY_RATE is null");
            return (Criteria) this;
        }

        public Criteria andMultiplyRateIsNotNull() {
            addCriterion("MULTIPLY_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andMultiplyRateEqualTo(BigDecimal value) {
            addCriterion("MULTIPLY_RATE =", value, "multiplyRate");
            return (Criteria) this;
        }

        public Criteria andMultiplyRateNotEqualTo(BigDecimal value) {
            addCriterion("MULTIPLY_RATE <>", value, "multiplyRate");
            return (Criteria) this;
        }

        public Criteria andMultiplyRateGreaterThan(BigDecimal value) {
            addCriterion("MULTIPLY_RATE >", value, "multiplyRate");
            return (Criteria) this;
        }

        public Criteria andMultiplyRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MULTIPLY_RATE >=", value, "multiplyRate");
            return (Criteria) this;
        }

        public Criteria andMultiplyRateLessThan(BigDecimal value) {
            addCriterion("MULTIPLY_RATE <", value, "multiplyRate");
            return (Criteria) this;
        }

        public Criteria andMultiplyRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MULTIPLY_RATE <=", value, "multiplyRate");
            return (Criteria) this;
        }

        public Criteria andMultiplyRateIn(List<BigDecimal> values) {
            addCriterion("MULTIPLY_RATE in", values, "multiplyRate");
            return (Criteria) this;
        }

        public Criteria andMultiplyRateNotIn(List<BigDecimal> values) {
            addCriterion("MULTIPLY_RATE not in", values, "multiplyRate");
            return (Criteria) this;
        }

        public Criteria andMultiplyRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MULTIPLY_RATE between", value1, value2, "multiplyRate");
            return (Criteria) this;
        }

        public Criteria andMultiplyRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MULTIPLY_RATE not between", value1, value2, "multiplyRate");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdIsNull() {
            addCriterion("MERCHANDISER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdIsNotNull() {
            addCriterion("MERCHANDISER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdEqualTo(BigDecimal value) {
            addCriterion("MERCHANDISER_ID =", value, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdNotEqualTo(BigDecimal value) {
            addCriterion("MERCHANDISER_ID <>", value, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdGreaterThan(BigDecimal value) {
            addCriterion("MERCHANDISER_ID >", value, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MERCHANDISER_ID >=", value, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdLessThan(BigDecimal value) {
            addCriterion("MERCHANDISER_ID <", value, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MERCHANDISER_ID <=", value, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdIn(List<BigDecimal> values) {
            addCriterion("MERCHANDISER_ID in", values, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdNotIn(List<BigDecimal> values) {
            addCriterion("MERCHANDISER_ID not in", values, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MERCHANDISER_ID between", value1, value2, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MERCHANDISER_ID not between", value1, value2, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andCheckByIdIsNull() {
            addCriterion("CHECK_BY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCheckByIdIsNotNull() {
            addCriterion("CHECK_BY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckByIdEqualTo(Integer value) {
            addCriterion("CHECK_BY_ID =", value, "checkById");
            return (Criteria) this;
        }

        public Criteria andCheckByIdNotEqualTo(Integer value) {
            addCriterion("CHECK_BY_ID <>", value, "checkById");
            return (Criteria) this;
        }

        public Criteria andCheckByIdGreaterThan(Integer value) {
            addCriterion("CHECK_BY_ID >", value, "checkById");
            return (Criteria) this;
        }

        public Criteria andCheckByIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHECK_BY_ID >=", value, "checkById");
            return (Criteria) this;
        }

        public Criteria andCheckByIdLessThan(Integer value) {
            addCriterion("CHECK_BY_ID <", value, "checkById");
            return (Criteria) this;
        }

        public Criteria andCheckByIdLessThanOrEqualTo(Integer value) {
            addCriterion("CHECK_BY_ID <=", value, "checkById");
            return (Criteria) this;
        }

        public Criteria andCheckByIdIn(List<Integer> values) {
            addCriterion("CHECK_BY_ID in", values, "checkById");
            return (Criteria) this;
        }

        public Criteria andCheckByIdNotIn(List<Integer> values) {
            addCriterion("CHECK_BY_ID not in", values, "checkById");
            return (Criteria) this;
        }

        public Criteria andCheckByIdBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_BY_ID between", value1, value2, "checkById");
            return (Criteria) this;
        }

        public Criteria andCheckByIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_BY_ID not between", value1, value2, "checkById");
            return (Criteria) this;
        }

        public Criteria andApproverIdIsNull() {
            addCriterion("APPROVER_ID is null");
            return (Criteria) this;
        }

        public Criteria andApproverIdIsNotNull() {
            addCriterion("APPROVER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApproverIdEqualTo(Integer value) {
            addCriterion("APPROVER_ID =", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdNotEqualTo(Integer value) {
            addCriterion("APPROVER_ID <>", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdGreaterThan(Integer value) {
            addCriterion("APPROVER_ID >", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("APPROVER_ID >=", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdLessThan(Integer value) {
            addCriterion("APPROVER_ID <", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdLessThanOrEqualTo(Integer value) {
            addCriterion("APPROVER_ID <=", value, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdIn(List<Integer> values) {
            addCriterion("APPROVER_ID in", values, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdNotIn(List<Integer> values) {
            addCriterion("APPROVER_ID not in", values, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdBetween(Integer value1, Integer value2) {
            addCriterion("APPROVER_ID between", value1, value2, "approverId");
            return (Criteria) this;
        }

        public Criteria andApproverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("APPROVER_ID not between", value1, value2, "approverId");
            return (Criteria) this;
        }

        public Criteria andGenPaymentRequestIsNull() {
            addCriterion("GEN_PAYMENT_REQUEST is null");
            return (Criteria) this;
        }

        public Criteria andGenPaymentRequestIsNotNull() {
            addCriterion("GEN_PAYMENT_REQUEST is not null");
            return (Criteria) this;
        }

        public Criteria andGenPaymentRequestEqualTo(String value) {
            addCriterion("GEN_PAYMENT_REQUEST =", value, "genPaymentRequest");
            return (Criteria) this;
        }

        public Criteria andGenPaymentRequestNotEqualTo(String value) {
            addCriterion("GEN_PAYMENT_REQUEST <>", value, "genPaymentRequest");
            return (Criteria) this;
        }

        public Criteria andGenPaymentRequestGreaterThan(String value) {
            addCriterion("GEN_PAYMENT_REQUEST >", value, "genPaymentRequest");
            return (Criteria) this;
        }

        public Criteria andGenPaymentRequestGreaterThanOrEqualTo(String value) {
            addCriterion("GEN_PAYMENT_REQUEST >=", value, "genPaymentRequest");
            return (Criteria) this;
        }

        public Criteria andGenPaymentRequestLessThan(String value) {
            addCriterion("GEN_PAYMENT_REQUEST <", value, "genPaymentRequest");
            return (Criteria) this;
        }

        public Criteria andGenPaymentRequestLessThanOrEqualTo(String value) {
            addCriterion("GEN_PAYMENT_REQUEST <=", value, "genPaymentRequest");
            return (Criteria) this;
        }

        public Criteria andGenPaymentRequestLike(String value) {
            addCriterion("GEN_PAYMENT_REQUEST like", value, "genPaymentRequest");
            return (Criteria) this;
        }

        public Criteria andGenPaymentRequestNotLike(String value) {
            addCriterion("GEN_PAYMENT_REQUEST not like", value, "genPaymentRequest");
            return (Criteria) this;
        }

        public Criteria andGenPaymentRequestIn(List<String> values) {
            addCriterion("GEN_PAYMENT_REQUEST in", values, "genPaymentRequest");
            return (Criteria) this;
        }

        public Criteria andGenPaymentRequestNotIn(List<String> values) {
            addCriterion("GEN_PAYMENT_REQUEST not in", values, "genPaymentRequest");
            return (Criteria) this;
        }

        public Criteria andGenPaymentRequestBetween(String value1, String value2) {
            addCriterion("GEN_PAYMENT_REQUEST between", value1, value2, "genPaymentRequest");
            return (Criteria) this;
        }

        public Criteria andGenPaymentRequestNotBetween(String value1, String value2) {
            addCriterion("GEN_PAYMENT_REQUEST not between", value1, value2, "genPaymentRequest");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNull() {
            addCriterion("PAYMENT_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNotNull() {
            addCriterion("PAYMENT_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodEqualTo(String value) {
            addCriterion("PAYMENT_METHOD =", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotEqualTo(String value) {
            addCriterion("PAYMENT_METHOD <>", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThan(String value) {
            addCriterion("PAYMENT_METHOD >", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_METHOD >=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThan(String value) {
            addCriterion("PAYMENT_METHOD <", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_METHOD <=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLike(String value) {
            addCriterion("PAYMENT_METHOD like", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotLike(String value) {
            addCriterion("PAYMENT_METHOD not like", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIn(List<String> values) {
            addCriterion("PAYMENT_METHOD in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotIn(List<String> values) {
            addCriterion("PAYMENT_METHOD not in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodBetween(String value1, String value2) {
            addCriterion("PAYMENT_METHOD between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_METHOD not between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andIsFullpaymentIsNull() {
            addCriterion("IS_FULLPAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andIsFullpaymentIsNotNull() {
            addCriterion("IS_FULLPAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIsFullpaymentEqualTo(String value) {
            addCriterion("IS_FULLPAYMENT =", value, "isFullpayment");
            return (Criteria) this;
        }

        public Criteria andIsFullpaymentNotEqualTo(String value) {
            addCriterion("IS_FULLPAYMENT <>", value, "isFullpayment");
            return (Criteria) this;
        }

        public Criteria andIsFullpaymentGreaterThan(String value) {
            addCriterion("IS_FULLPAYMENT >", value, "isFullpayment");
            return (Criteria) this;
        }

        public Criteria andIsFullpaymentGreaterThanOrEqualTo(String value) {
            addCriterion("IS_FULLPAYMENT >=", value, "isFullpayment");
            return (Criteria) this;
        }

        public Criteria andIsFullpaymentLessThan(String value) {
            addCriterion("IS_FULLPAYMENT <", value, "isFullpayment");
            return (Criteria) this;
        }

        public Criteria andIsFullpaymentLessThanOrEqualTo(String value) {
            addCriterion("IS_FULLPAYMENT <=", value, "isFullpayment");
            return (Criteria) this;
        }

        public Criteria andIsFullpaymentLike(String value) {
            addCriterion("IS_FULLPAYMENT like", value, "isFullpayment");
            return (Criteria) this;
        }

        public Criteria andIsFullpaymentNotLike(String value) {
            addCriterion("IS_FULLPAYMENT not like", value, "isFullpayment");
            return (Criteria) this;
        }

        public Criteria andIsFullpaymentIn(List<String> values) {
            addCriterion("IS_FULLPAYMENT in", values, "isFullpayment");
            return (Criteria) this;
        }

        public Criteria andIsFullpaymentNotIn(List<String> values) {
            addCriterion("IS_FULLPAYMENT not in", values, "isFullpayment");
            return (Criteria) this;
        }

        public Criteria andIsFullpaymentBetween(String value1, String value2) {
            addCriterion("IS_FULLPAYMENT between", value1, value2, "isFullpayment");
            return (Criteria) this;
        }

        public Criteria andIsFullpaymentNotBetween(String value1, String value2) {
            addCriterion("IS_FULLPAYMENT not between", value1, value2, "isFullpayment");
            return (Criteria) this;
        }

        public Criteria andAmazonMerchantOrderIdIsNull() {
            addCriterion("AMAZON_MERCHANT_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andAmazonMerchantOrderIdIsNotNull() {
            addCriterion("AMAZON_MERCHANT_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonMerchantOrderIdEqualTo(String value) {
            addCriterion("AMAZON_MERCHANT_ORDER_ID =", value, "amazonMerchantOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonMerchantOrderIdNotEqualTo(String value) {
            addCriterion("AMAZON_MERCHANT_ORDER_ID <>", value, "amazonMerchantOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonMerchantOrderIdGreaterThan(String value) {
            addCriterion("AMAZON_MERCHANT_ORDER_ID >", value, "amazonMerchantOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonMerchantOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("AMAZON_MERCHANT_ORDER_ID >=", value, "amazonMerchantOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonMerchantOrderIdLessThan(String value) {
            addCriterion("AMAZON_MERCHANT_ORDER_ID <", value, "amazonMerchantOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonMerchantOrderIdLessThanOrEqualTo(String value) {
            addCriterion("AMAZON_MERCHANT_ORDER_ID <=", value, "amazonMerchantOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonMerchantOrderIdLike(String value) {
            addCriterion("AMAZON_MERCHANT_ORDER_ID like", value, "amazonMerchantOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonMerchantOrderIdNotLike(String value) {
            addCriterion("AMAZON_MERCHANT_ORDER_ID not like", value, "amazonMerchantOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonMerchantOrderIdIn(List<String> values) {
            addCriterion("AMAZON_MERCHANT_ORDER_ID in", values, "amazonMerchantOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonMerchantOrderIdNotIn(List<String> values) {
            addCriterion("AMAZON_MERCHANT_ORDER_ID not in", values, "amazonMerchantOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonMerchantOrderIdBetween(String value1, String value2) {
            addCriterion("AMAZON_MERCHANT_ORDER_ID between", value1, value2, "amazonMerchantOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonMerchantOrderIdNotBetween(String value1, String value2) {
            addCriterion("AMAZON_MERCHANT_ORDER_ID not between", value1, value2, "amazonMerchantOrderId");
            return (Criteria) this;
        }

        public Criteria andIsTransferIsNull() {
            addCriterion("IS_TRANSFER is null");
            return (Criteria) this;
        }

        public Criteria andIsTransferIsNotNull() {
            addCriterion("IS_TRANSFER is not null");
            return (Criteria) this;
        }

        public Criteria andIsTransferEqualTo(String value) {
            addCriterion("IS_TRANSFER =", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferNotEqualTo(String value) {
            addCriterion("IS_TRANSFER <>", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferGreaterThan(String value) {
            addCriterion("IS_TRANSFER >", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferGreaterThanOrEqualTo(String value) {
            addCriterion("IS_TRANSFER >=", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferLessThan(String value) {
            addCriterion("IS_TRANSFER <", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferLessThanOrEqualTo(String value) {
            addCriterion("IS_TRANSFER <=", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferLike(String value) {
            addCriterion("IS_TRANSFER like", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferNotLike(String value) {
            addCriterion("IS_TRANSFER not like", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferIn(List<String> values) {
            addCriterion("IS_TRANSFER in", values, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferNotIn(List<String> values) {
            addCriterion("IS_TRANSFER not in", values, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferBetween(String value1, String value2) {
            addCriterion("IS_TRANSFER between", value1, value2, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferNotBetween(String value1, String value2) {
            addCriterion("IS_TRANSFER not between", value1, value2, "isTransfer");
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