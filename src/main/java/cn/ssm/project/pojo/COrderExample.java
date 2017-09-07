package cn.ssm.project.pojo;

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

        public Criteria andAmazonIsBusinessOrderIsNull() {
            addCriterion("AMAZON_IS_BUSINESS_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andAmazonIsBusinessOrderIsNotNull() {
            addCriterion("AMAZON_IS_BUSINESS_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonIsBusinessOrderEqualTo(String value) {
            addCriterion("AMAZON_IS_BUSINESS_ORDER =", value, "amazonIsBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andAmazonIsBusinessOrderNotEqualTo(String value) {
            addCriterion("AMAZON_IS_BUSINESS_ORDER <>", value, "amazonIsBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andAmazonIsBusinessOrderGreaterThan(String value) {
            addCriterion("AMAZON_IS_BUSINESS_ORDER >", value, "amazonIsBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andAmazonIsBusinessOrderGreaterThanOrEqualTo(String value) {
            addCriterion("AMAZON_IS_BUSINESS_ORDER >=", value, "amazonIsBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andAmazonIsBusinessOrderLessThan(String value) {
            addCriterion("AMAZON_IS_BUSINESS_ORDER <", value, "amazonIsBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andAmazonIsBusinessOrderLessThanOrEqualTo(String value) {
            addCriterion("AMAZON_IS_BUSINESS_ORDER <=", value, "amazonIsBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andAmazonIsBusinessOrderLike(String value) {
            addCriterion("AMAZON_IS_BUSINESS_ORDER like", value, "amazonIsBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andAmazonIsBusinessOrderNotLike(String value) {
            addCriterion("AMAZON_IS_BUSINESS_ORDER not like", value, "amazonIsBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andAmazonIsBusinessOrderIn(List<String> values) {
            addCriterion("AMAZON_IS_BUSINESS_ORDER in", values, "amazonIsBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andAmazonIsBusinessOrderNotIn(List<String> values) {
            addCriterion("AMAZON_IS_BUSINESS_ORDER not in", values, "amazonIsBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andAmazonIsBusinessOrderBetween(String value1, String value2) {
            addCriterion("AMAZON_IS_BUSINESS_ORDER between", value1, value2, "amazonIsBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andAmazonIsBusinessOrderNotBetween(String value1, String value2) {
            addCriterion("AMAZON_IS_BUSINESS_ORDER not between", value1, value2, "amazonIsBusinessOrder");
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