package cn.ssm.project.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmazonImportOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmazonImportOrderDetailExample() {
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

        public Criteria andAmazonOrderidIsNull() {
            addCriterion("AMAZON_ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderidIsNotNull() {
            addCriterion("AMAZON_ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderidEqualTo(String value) {
            addCriterion("AMAZON_ORDERID =", value, "amazonOrderid");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderidNotEqualTo(String value) {
            addCriterion("AMAZON_ORDERID <>", value, "amazonOrderid");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderidGreaterThan(String value) {
            addCriterion("AMAZON_ORDERID >", value, "amazonOrderid");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("AMAZON_ORDERID >=", value, "amazonOrderid");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderidLessThan(String value) {
            addCriterion("AMAZON_ORDERID <", value, "amazonOrderid");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderidLessThanOrEqualTo(String value) {
            addCriterion("AMAZON_ORDERID <=", value, "amazonOrderid");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderidLike(String value) {
            addCriterion("AMAZON_ORDERID like", value, "amazonOrderid");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderidNotLike(String value) {
            addCriterion("AMAZON_ORDERID not like", value, "amazonOrderid");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderidIn(List<String> values) {
            addCriterion("AMAZON_ORDERID in", values, "amazonOrderid");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderidNotIn(List<String> values) {
            addCriterion("AMAZON_ORDERID not in", values, "amazonOrderid");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderidBetween(String value1, String value2) {
            addCriterion("AMAZON_ORDERID between", value1, value2, "amazonOrderid");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderidNotBetween(String value1, String value2) {
            addCriterion("AMAZON_ORDERID not between", value1, value2, "amazonOrderid");
            return (Criteria) this;
        }

        public Criteria andAmazonImportOrderLogIdIsNull() {
            addCriterion("AMAZON_IMPORT_ORDER_LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andAmazonImportOrderLogIdIsNotNull() {
            addCriterion("AMAZON_IMPORT_ORDER_LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonImportOrderLogIdEqualTo(Integer value) {
            addCriterion("AMAZON_IMPORT_ORDER_LOG_ID =", value, "amazonImportOrderLogId");
            return (Criteria) this;
        }

        public Criteria andAmazonImportOrderLogIdNotEqualTo(Integer value) {
            addCriterion("AMAZON_IMPORT_ORDER_LOG_ID <>", value, "amazonImportOrderLogId");
            return (Criteria) this;
        }

        public Criteria andAmazonImportOrderLogIdGreaterThan(Integer value) {
            addCriterion("AMAZON_IMPORT_ORDER_LOG_ID >", value, "amazonImportOrderLogId");
            return (Criteria) this;
        }

        public Criteria andAmazonImportOrderLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AMAZON_IMPORT_ORDER_LOG_ID >=", value, "amazonImportOrderLogId");
            return (Criteria) this;
        }

        public Criteria andAmazonImportOrderLogIdLessThan(Integer value) {
            addCriterion("AMAZON_IMPORT_ORDER_LOG_ID <", value, "amazonImportOrderLogId");
            return (Criteria) this;
        }

        public Criteria andAmazonImportOrderLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("AMAZON_IMPORT_ORDER_LOG_ID <=", value, "amazonImportOrderLogId");
            return (Criteria) this;
        }

        public Criteria andAmazonImportOrderLogIdIn(List<Integer> values) {
            addCriterion("AMAZON_IMPORT_ORDER_LOG_ID in", values, "amazonImportOrderLogId");
            return (Criteria) this;
        }

        public Criteria andAmazonImportOrderLogIdNotIn(List<Integer> values) {
            addCriterion("AMAZON_IMPORT_ORDER_LOG_ID not in", values, "amazonImportOrderLogId");
            return (Criteria) this;
        }

        public Criteria andAmazonImportOrderLogIdBetween(Integer value1, Integer value2) {
            addCriterion("AMAZON_IMPORT_ORDER_LOG_ID between", value1, value2, "amazonImportOrderLogId");
            return (Criteria) this;
        }

        public Criteria andAmazonImportOrderLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AMAZON_IMPORT_ORDER_LOG_ID not between", value1, value2, "amazonImportOrderLogId");
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

        public Criteria andAmazonOrderIdEqualTo(Integer value) {
            addCriterion("AMAZON_ORDER_ID =", value, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdNotEqualTo(Integer value) {
            addCriterion("AMAZON_ORDER_ID <>", value, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdGreaterThan(Integer value) {
            addCriterion("AMAZON_ORDER_ID >", value, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AMAZON_ORDER_ID >=", value, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdLessThan(Integer value) {
            addCriterion("AMAZON_ORDER_ID <", value, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("AMAZON_ORDER_ID <=", value, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdIn(List<Integer> values) {
            addCriterion("AMAZON_ORDER_ID in", values, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdNotIn(List<Integer> values) {
            addCriterion("AMAZON_ORDER_ID not in", values, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("AMAZON_ORDER_ID between", value1, value2, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andAmazonOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AMAZON_ORDER_ID not between", value1, value2, "amazonOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdIsNull() {
            addCriterion("C_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCOrderIdIsNotNull() {
            addCriterion("C_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCOrderIdEqualTo(Integer value) {
            addCriterion("C_ORDER_ID =", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdNotEqualTo(Integer value) {
            addCriterion("C_ORDER_ID <>", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdGreaterThan(Integer value) {
            addCriterion("C_ORDER_ID >", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_ORDER_ID >=", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdLessThan(Integer value) {
            addCriterion("C_ORDER_ID <", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_ORDER_ID <=", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdIn(List<Integer> values) {
            addCriterion("C_ORDER_ID in", values, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdNotIn(List<Integer> values) {
            addCriterion("C_ORDER_ID not in", values, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("C_ORDER_ID between", value1, value2, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_ORDER_ID not between", value1, value2, "cOrderId");
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

        public Criteria andImportStatusIsNull() {
            addCriterion("IMPORT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andImportStatusIsNotNull() {
            addCriterion("IMPORT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andImportStatusEqualTo(String value) {
            addCriterion("IMPORT_STATUS =", value, "importStatus");
            return (Criteria) this;
        }

        public Criteria andImportStatusNotEqualTo(String value) {
            addCriterion("IMPORT_STATUS <>", value, "importStatus");
            return (Criteria) this;
        }

        public Criteria andImportStatusGreaterThan(String value) {
            addCriterion("IMPORT_STATUS >", value, "importStatus");
            return (Criteria) this;
        }

        public Criteria andImportStatusGreaterThanOrEqualTo(String value) {
            addCriterion("IMPORT_STATUS >=", value, "importStatus");
            return (Criteria) this;
        }

        public Criteria andImportStatusLessThan(String value) {
            addCriterion("IMPORT_STATUS <", value, "importStatus");
            return (Criteria) this;
        }

        public Criteria andImportStatusLessThanOrEqualTo(String value) {
            addCriterion("IMPORT_STATUS <=", value, "importStatus");
            return (Criteria) this;
        }

        public Criteria andImportStatusLike(String value) {
            addCriterion("IMPORT_STATUS like", value, "importStatus");
            return (Criteria) this;
        }

        public Criteria andImportStatusNotLike(String value) {
            addCriterion("IMPORT_STATUS not like", value, "importStatus");
            return (Criteria) this;
        }

        public Criteria andImportStatusIn(List<String> values) {
            addCriterion("IMPORT_STATUS in", values, "importStatus");
            return (Criteria) this;
        }

        public Criteria andImportStatusNotIn(List<String> values) {
            addCriterion("IMPORT_STATUS not in", values, "importStatus");
            return (Criteria) this;
        }

        public Criteria andImportStatusBetween(String value1, String value2) {
            addCriterion("IMPORT_STATUS between", value1, value2, "importStatus");
            return (Criteria) this;
        }

        public Criteria andImportStatusNotBetween(String value1, String value2) {
            addCriterion("IMPORT_STATUS not between", value1, value2, "importStatus");
            return (Criteria) this;
        }

        public Criteria andIsImportAllIsNull() {
            addCriterion("IS_IMPORT_ALL is null");
            return (Criteria) this;
        }

        public Criteria andIsImportAllIsNotNull() {
            addCriterion("IS_IMPORT_ALL is not null");
            return (Criteria) this;
        }

        public Criteria andIsImportAllEqualTo(String value) {
            addCriterion("IS_IMPORT_ALL =", value, "isImportAll");
            return (Criteria) this;
        }

        public Criteria andIsImportAllNotEqualTo(String value) {
            addCriterion("IS_IMPORT_ALL <>", value, "isImportAll");
            return (Criteria) this;
        }

        public Criteria andIsImportAllGreaterThan(String value) {
            addCriterion("IS_IMPORT_ALL >", value, "isImportAll");
            return (Criteria) this;
        }

        public Criteria andIsImportAllGreaterThanOrEqualTo(String value) {
            addCriterion("IS_IMPORT_ALL >=", value, "isImportAll");
            return (Criteria) this;
        }

        public Criteria andIsImportAllLessThan(String value) {
            addCriterion("IS_IMPORT_ALL <", value, "isImportAll");
            return (Criteria) this;
        }

        public Criteria andIsImportAllLessThanOrEqualTo(String value) {
            addCriterion("IS_IMPORT_ALL <=", value, "isImportAll");
            return (Criteria) this;
        }

        public Criteria andIsImportAllLike(String value) {
            addCriterion("IS_IMPORT_ALL like", value, "isImportAll");
            return (Criteria) this;
        }

        public Criteria andIsImportAllNotLike(String value) {
            addCriterion("IS_IMPORT_ALL not like", value, "isImportAll");
            return (Criteria) this;
        }

        public Criteria andIsImportAllIn(List<String> values) {
            addCriterion("IS_IMPORT_ALL in", values, "isImportAll");
            return (Criteria) this;
        }

        public Criteria andIsImportAllNotIn(List<String> values) {
            addCriterion("IS_IMPORT_ALL not in", values, "isImportAll");
            return (Criteria) this;
        }

        public Criteria andIsImportAllBetween(String value1, String value2) {
            addCriterion("IS_IMPORT_ALL between", value1, value2, "isImportAll");
            return (Criteria) this;
        }

        public Criteria andIsImportAllNotBetween(String value1, String value2) {
            addCriterion("IS_IMPORT_ALL not between", value1, value2, "isImportAll");
            return (Criteria) this;
        }

        public Criteria andImportFailorderProcessIsNull() {
            addCriterion("IMPORT_FAILORDER_PROCESS is null");
            return (Criteria) this;
        }

        public Criteria andImportFailorderProcessIsNotNull() {
            addCriterion("IMPORT_FAILORDER_PROCESS is not null");
            return (Criteria) this;
        }

        public Criteria andImportFailorderProcessEqualTo(String value) {
            addCriterion("IMPORT_FAILORDER_PROCESS =", value, "importFailorderProcess");
            return (Criteria) this;
        }

        public Criteria andImportFailorderProcessNotEqualTo(String value) {
            addCriterion("IMPORT_FAILORDER_PROCESS <>", value, "importFailorderProcess");
            return (Criteria) this;
        }

        public Criteria andImportFailorderProcessGreaterThan(String value) {
            addCriterion("IMPORT_FAILORDER_PROCESS >", value, "importFailorderProcess");
            return (Criteria) this;
        }

        public Criteria andImportFailorderProcessGreaterThanOrEqualTo(String value) {
            addCriterion("IMPORT_FAILORDER_PROCESS >=", value, "importFailorderProcess");
            return (Criteria) this;
        }

        public Criteria andImportFailorderProcessLessThan(String value) {
            addCriterion("IMPORT_FAILORDER_PROCESS <", value, "importFailorderProcess");
            return (Criteria) this;
        }

        public Criteria andImportFailorderProcessLessThanOrEqualTo(String value) {
            addCriterion("IMPORT_FAILORDER_PROCESS <=", value, "importFailorderProcess");
            return (Criteria) this;
        }

        public Criteria andImportFailorderProcessLike(String value) {
            addCriterion("IMPORT_FAILORDER_PROCESS like", value, "importFailorderProcess");
            return (Criteria) this;
        }

        public Criteria andImportFailorderProcessNotLike(String value) {
            addCriterion("IMPORT_FAILORDER_PROCESS not like", value, "importFailorderProcess");
            return (Criteria) this;
        }

        public Criteria andImportFailorderProcessIn(List<String> values) {
            addCriterion("IMPORT_FAILORDER_PROCESS in", values, "importFailorderProcess");
            return (Criteria) this;
        }

        public Criteria andImportFailorderProcessNotIn(List<String> values) {
            addCriterion("IMPORT_FAILORDER_PROCESS not in", values, "importFailorderProcess");
            return (Criteria) this;
        }

        public Criteria andImportFailorderProcessBetween(String value1, String value2) {
            addCriterion("IMPORT_FAILORDER_PROCESS between", value1, value2, "importFailorderProcess");
            return (Criteria) this;
        }

        public Criteria andImportFailorderProcessNotBetween(String value1, String value2) {
            addCriterion("IMPORT_FAILORDER_PROCESS not between", value1, value2, "importFailorderProcess");
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