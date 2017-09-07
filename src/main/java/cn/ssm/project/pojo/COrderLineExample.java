package cn.ssm.project.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class COrderLineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public COrderLineExample() {
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

        public Criteria andAmazonAsinIsNull() {
            addCriterion("AMAZON_ASIN is null");
            return (Criteria) this;
        }

        public Criteria andAmazonAsinIsNotNull() {
            addCriterion("AMAZON_ASIN is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonAsinEqualTo(String value) {
            addCriterion("AMAZON_ASIN =", value, "amazonAsin");
            return (Criteria) this;
        }

        public Criteria andAmazonAsinNotEqualTo(String value) {
            addCriterion("AMAZON_ASIN <>", value, "amazonAsin");
            return (Criteria) this;
        }

        public Criteria andAmazonAsinGreaterThan(String value) {
            addCriterion("AMAZON_ASIN >", value, "amazonAsin");
            return (Criteria) this;
        }

        public Criteria andAmazonAsinGreaterThanOrEqualTo(String value) {
            addCriterion("AMAZON_ASIN >=", value, "amazonAsin");
            return (Criteria) this;
        }

        public Criteria andAmazonAsinLessThan(String value) {
            addCriterion("AMAZON_ASIN <", value, "amazonAsin");
            return (Criteria) this;
        }

        public Criteria andAmazonAsinLessThanOrEqualTo(String value) {
            addCriterion("AMAZON_ASIN <=", value, "amazonAsin");
            return (Criteria) this;
        }

        public Criteria andAmazonAsinLike(String value) {
            addCriterion("AMAZON_ASIN like", value, "amazonAsin");
            return (Criteria) this;
        }

        public Criteria andAmazonAsinNotLike(String value) {
            addCriterion("AMAZON_ASIN not like", value, "amazonAsin");
            return (Criteria) this;
        }

        public Criteria andAmazonAsinIn(List<String> values) {
            addCriterion("AMAZON_ASIN in", values, "amazonAsin");
            return (Criteria) this;
        }

        public Criteria andAmazonAsinNotIn(List<String> values) {
            addCriterion("AMAZON_ASIN not in", values, "amazonAsin");
            return (Criteria) this;
        }

        public Criteria andAmazonAsinBetween(String value1, String value2) {
            addCriterion("AMAZON_ASIN between", value1, value2, "amazonAsin");
            return (Criteria) this;
        }

        public Criteria andAmazonAsinNotBetween(String value1, String value2) {
            addCriterion("AMAZON_ASIN not between", value1, value2, "amazonAsin");
            return (Criteria) this;
        }

        public Criteria andAmazonSkuIsNull() {
            addCriterion("AMAZON_SKU is null");
            return (Criteria) this;
        }

        public Criteria andAmazonSkuIsNotNull() {
            addCriterion("AMAZON_SKU is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonSkuEqualTo(String value) {
            addCriterion("AMAZON_SKU =", value, "amazonSku");
            return (Criteria) this;
        }

        public Criteria andAmazonSkuNotEqualTo(String value) {
            addCriterion("AMAZON_SKU <>", value, "amazonSku");
            return (Criteria) this;
        }

        public Criteria andAmazonSkuGreaterThan(String value) {
            addCriterion("AMAZON_SKU >", value, "amazonSku");
            return (Criteria) this;
        }

        public Criteria andAmazonSkuGreaterThanOrEqualTo(String value) {
            addCriterion("AMAZON_SKU >=", value, "amazonSku");
            return (Criteria) this;
        }

        public Criteria andAmazonSkuLessThan(String value) {
            addCriterion("AMAZON_SKU <", value, "amazonSku");
            return (Criteria) this;
        }

        public Criteria andAmazonSkuLessThanOrEqualTo(String value) {
            addCriterion("AMAZON_SKU <=", value, "amazonSku");
            return (Criteria) this;
        }

        public Criteria andAmazonSkuLike(String value) {
            addCriterion("AMAZON_SKU like", value, "amazonSku");
            return (Criteria) this;
        }

        public Criteria andAmazonSkuNotLike(String value) {
            addCriterion("AMAZON_SKU not like", value, "amazonSku");
            return (Criteria) this;
        }

        public Criteria andAmazonSkuIn(List<String> values) {
            addCriterion("AMAZON_SKU in", values, "amazonSku");
            return (Criteria) this;
        }

        public Criteria andAmazonSkuNotIn(List<String> values) {
            addCriterion("AMAZON_SKU not in", values, "amazonSku");
            return (Criteria) this;
        }

        public Criteria andAmazonSkuBetween(String value1, String value2) {
            addCriterion("AMAZON_SKU between", value1, value2, "amazonSku");
            return (Criteria) this;
        }

        public Criteria andAmazonSkuNotBetween(String value1, String value2) {
            addCriterion("AMAZON_SKU not between", value1, value2, "amazonSku");
            return (Criteria) this;
        }

        public Criteria andAmazonItemStatusIsNull() {
            addCriterion("AMAZON_ITEM_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAmazonItemStatusIsNotNull() {
            addCriterion("AMAZON_ITEM_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonItemStatusEqualTo(String value) {
            addCriterion("AMAZON_ITEM_STATUS =", value, "amazonItemStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonItemStatusNotEqualTo(String value) {
            addCriterion("AMAZON_ITEM_STATUS <>", value, "amazonItemStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonItemStatusGreaterThan(String value) {
            addCriterion("AMAZON_ITEM_STATUS >", value, "amazonItemStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonItemStatusGreaterThanOrEqualTo(String value) {
            addCriterion("AMAZON_ITEM_STATUS >=", value, "amazonItemStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonItemStatusLessThan(String value) {
            addCriterion("AMAZON_ITEM_STATUS <", value, "amazonItemStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonItemStatusLessThanOrEqualTo(String value) {
            addCriterion("AMAZON_ITEM_STATUS <=", value, "amazonItemStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonItemStatusLike(String value) {
            addCriterion("AMAZON_ITEM_STATUS like", value, "amazonItemStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonItemStatusNotLike(String value) {
            addCriterion("AMAZON_ITEM_STATUS not like", value, "amazonItemStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonItemStatusIn(List<String> values) {
            addCriterion("AMAZON_ITEM_STATUS in", values, "amazonItemStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonItemStatusNotIn(List<String> values) {
            addCriterion("AMAZON_ITEM_STATUS not in", values, "amazonItemStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonItemStatusBetween(String value1, String value2) {
            addCriterion("AMAZON_ITEM_STATUS between", value1, value2, "amazonItemStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonItemStatusNotBetween(String value1, String value2) {
            addCriterion("AMAZON_ITEM_STATUS not between", value1, value2, "amazonItemStatus");
            return (Criteria) this;
        }

        public Criteria andAmazonProductNameIsNull() {
            addCriterion("AMAZON_PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAmazonProductNameIsNotNull() {
            addCriterion("AMAZON_PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonProductNameEqualTo(String value) {
            addCriterion("AMAZON_PRODUCT_NAME =", value, "amazonProductName");
            return (Criteria) this;
        }

        public Criteria andAmazonProductNameNotEqualTo(String value) {
            addCriterion("AMAZON_PRODUCT_NAME <>", value, "amazonProductName");
            return (Criteria) this;
        }

        public Criteria andAmazonProductNameGreaterThan(String value) {
            addCriterion("AMAZON_PRODUCT_NAME >", value, "amazonProductName");
            return (Criteria) this;
        }

        public Criteria andAmazonProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("AMAZON_PRODUCT_NAME >=", value, "amazonProductName");
            return (Criteria) this;
        }

        public Criteria andAmazonProductNameLessThan(String value) {
            addCriterion("AMAZON_PRODUCT_NAME <", value, "amazonProductName");
            return (Criteria) this;
        }

        public Criteria andAmazonProductNameLessThanOrEqualTo(String value) {
            addCriterion("AMAZON_PRODUCT_NAME <=", value, "amazonProductName");
            return (Criteria) this;
        }

        public Criteria andAmazonProductNameLike(String value) {
            addCriterion("AMAZON_PRODUCT_NAME like", value, "amazonProductName");
            return (Criteria) this;
        }

        public Criteria andAmazonProductNameNotLike(String value) {
            addCriterion("AMAZON_PRODUCT_NAME not like", value, "amazonProductName");
            return (Criteria) this;
        }

        public Criteria andAmazonProductNameIn(List<String> values) {
            addCriterion("AMAZON_PRODUCT_NAME in", values, "amazonProductName");
            return (Criteria) this;
        }

        public Criteria andAmazonProductNameNotIn(List<String> values) {
            addCriterion("AMAZON_PRODUCT_NAME not in", values, "amazonProductName");
            return (Criteria) this;
        }

        public Criteria andAmazonProductNameBetween(String value1, String value2) {
            addCriterion("AMAZON_PRODUCT_NAME between", value1, value2, "amazonProductName");
            return (Criteria) this;
        }

        public Criteria andAmazonProductNameNotBetween(String value1, String value2) {
            addCriterion("AMAZON_PRODUCT_NAME not between", value1, value2, "amazonProductName");
            return (Criteria) this;
        }

        public Criteria andAmazonQuantityIsNull() {
            addCriterion("AMAZON_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andAmazonQuantityIsNotNull() {
            addCriterion("AMAZON_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonQuantityEqualTo(BigDecimal value) {
            addCriterion("AMAZON_QUANTITY =", value, "amazonQuantity");
            return (Criteria) this;
        }

        public Criteria andAmazonQuantityNotEqualTo(BigDecimal value) {
            addCriterion("AMAZON_QUANTITY <>", value, "amazonQuantity");
            return (Criteria) this;
        }

        public Criteria andAmazonQuantityGreaterThan(BigDecimal value) {
            addCriterion("AMAZON_QUANTITY >", value, "amazonQuantity");
            return (Criteria) this;
        }

        public Criteria andAmazonQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMAZON_QUANTITY >=", value, "amazonQuantity");
            return (Criteria) this;
        }

        public Criteria andAmazonQuantityLessThan(BigDecimal value) {
            addCriterion("AMAZON_QUANTITY <", value, "amazonQuantity");
            return (Criteria) this;
        }

        public Criteria andAmazonQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMAZON_QUANTITY <=", value, "amazonQuantity");
            return (Criteria) this;
        }

        public Criteria andAmazonQuantityIn(List<BigDecimal> values) {
            addCriterion("AMAZON_QUANTITY in", values, "amazonQuantity");
            return (Criteria) this;
        }

        public Criteria andAmazonQuantityNotIn(List<BigDecimal> values) {
            addCriterion("AMAZON_QUANTITY not in", values, "amazonQuantity");
            return (Criteria) this;
        }

        public Criteria andAmazonQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMAZON_QUANTITY between", value1, value2, "amazonQuantity");
            return (Criteria) this;
        }

        public Criteria andAmazonQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMAZON_QUANTITY not between", value1, value2, "amazonQuantity");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionPromotionIdsIsNull() {
            addCriterion("AMAZON_PROMOTION_PROMOTION_IDS is null");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionPromotionIdsIsNotNull() {
            addCriterion("AMAZON_PROMOTION_PROMOTION_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionPromotionIdsEqualTo(String value) {
            addCriterion("AMAZON_PROMOTION_PROMOTION_IDS =", value, "amazonPromotionPromotionIds");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionPromotionIdsNotEqualTo(String value) {
            addCriterion("AMAZON_PROMOTION_PROMOTION_IDS <>", value, "amazonPromotionPromotionIds");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionPromotionIdsGreaterThan(String value) {
            addCriterion("AMAZON_PROMOTION_PROMOTION_IDS >", value, "amazonPromotionPromotionIds");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionPromotionIdsGreaterThanOrEqualTo(String value) {
            addCriterion("AMAZON_PROMOTION_PROMOTION_IDS >=", value, "amazonPromotionPromotionIds");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionPromotionIdsLessThan(String value) {
            addCriterion("AMAZON_PROMOTION_PROMOTION_IDS <", value, "amazonPromotionPromotionIds");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionPromotionIdsLessThanOrEqualTo(String value) {
            addCriterion("AMAZON_PROMOTION_PROMOTION_IDS <=", value, "amazonPromotionPromotionIds");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionPromotionIdsLike(String value) {
            addCriterion("AMAZON_PROMOTION_PROMOTION_IDS like", value, "amazonPromotionPromotionIds");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionPromotionIdsNotLike(String value) {
            addCriterion("AMAZON_PROMOTION_PROMOTION_IDS not like", value, "amazonPromotionPromotionIds");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionPromotionIdsIn(List<String> values) {
            addCriterion("AMAZON_PROMOTION_PROMOTION_IDS in", values, "amazonPromotionPromotionIds");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionPromotionIdsNotIn(List<String> values) {
            addCriterion("AMAZON_PROMOTION_PROMOTION_IDS not in", values, "amazonPromotionPromotionIds");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionPromotionIdsBetween(String value1, String value2) {
            addCriterion("AMAZON_PROMOTION_PROMOTION_IDS between", value1, value2, "amazonPromotionPromotionIds");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionPromotionIdsNotBetween(String value1, String value2) {
            addCriterion("AMAZON_PROMOTION_PROMOTION_IDS not between", value1, value2, "amazonPromotionPromotionIds");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionShipPromotionDiscountIsNull() {
            addCriterion("AMAZON_PROMOTION_SHIP_PROMOTION_DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionShipPromotionDiscountIsNotNull() {
            addCriterion("AMAZON_PROMOTION_SHIP_PROMOTION_DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionShipPromotionDiscountEqualTo(BigDecimal value) {
            addCriterion("AMAZON_PROMOTION_SHIP_PROMOTION_DISCOUNT =", value, "amazonPromotionShipPromotionDiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionShipPromotionDiscountNotEqualTo(BigDecimal value) {
            addCriterion("AMAZON_PROMOTION_SHIP_PROMOTION_DISCOUNT <>", value, "amazonPromotionShipPromotionDiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionShipPromotionDiscountGreaterThan(BigDecimal value) {
            addCriterion("AMAZON_PROMOTION_SHIP_PROMOTION_DISCOUNT >", value, "amazonPromotionShipPromotionDiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionShipPromotionDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMAZON_PROMOTION_SHIP_PROMOTION_DISCOUNT >=", value, "amazonPromotionShipPromotionDiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionShipPromotionDiscountLessThan(BigDecimal value) {
            addCriterion("AMAZON_PROMOTION_SHIP_PROMOTION_DISCOUNT <", value, "amazonPromotionShipPromotionDiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionShipPromotionDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMAZON_PROMOTION_SHIP_PROMOTION_DISCOUNT <=", value, "amazonPromotionShipPromotionDiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionShipPromotionDiscountIn(List<BigDecimal> values) {
            addCriterion("AMAZON_PROMOTION_SHIP_PROMOTION_DISCOUNT in", values, "amazonPromotionShipPromotionDiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionShipPromotionDiscountNotIn(List<BigDecimal> values) {
            addCriterion("AMAZON_PROMOTION_SHIP_PROMOTION_DISCOUNT not in", values, "amazonPromotionShipPromotionDiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionShipPromotionDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMAZON_PROMOTION_SHIP_PROMOTION_DISCOUNT between", value1, value2, "amazonPromotionShipPromotionDiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionShipPromotionDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMAZON_PROMOTION_SHIP_PROMOTION_DISCOUNT not between", value1, value2, "amazonPromotionShipPromotionDiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionItemPromotionDiscountIsNull() {
            addCriterion("AMAZON_PROMOTION_ITEM_PROMOTION_DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionItemPromotionDiscountIsNotNull() {
            addCriterion("AMAZON_PROMOTION_ITEM_PROMOTION_DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionItemPromotionDiscountEqualTo(BigDecimal value) {
            addCriterion("AMAZON_PROMOTION_ITEM_PROMOTION_DISCOUNT =", value, "amazonPromotionItemPromotionDiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionItemPromotionDiscountNotEqualTo(BigDecimal value) {
            addCriterion("AMAZON_PROMOTION_ITEM_PROMOTION_DISCOUNT <>", value, "amazonPromotionItemPromotionDiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionItemPromotionDiscountGreaterThan(BigDecimal value) {
            addCriterion("AMAZON_PROMOTION_ITEM_PROMOTION_DISCOUNT >", value, "amazonPromotionItemPromotionDiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionItemPromotionDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMAZON_PROMOTION_ITEM_PROMOTION_DISCOUNT >=", value, "amazonPromotionItemPromotionDiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionItemPromotionDiscountLessThan(BigDecimal value) {
            addCriterion("AMAZON_PROMOTION_ITEM_PROMOTION_DISCOUNT <", value, "amazonPromotionItemPromotionDiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionItemPromotionDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMAZON_PROMOTION_ITEM_PROMOTION_DISCOUNT <=", value, "amazonPromotionItemPromotionDiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionItemPromotionDiscountIn(List<BigDecimal> values) {
            addCriterion("AMAZON_PROMOTION_ITEM_PROMOTION_DISCOUNT in", values, "amazonPromotionItemPromotionDiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionItemPromotionDiscountNotIn(List<BigDecimal> values) {
            addCriterion("AMAZON_PROMOTION_ITEM_PROMOTION_DISCOUNT not in", values, "amazonPromotionItemPromotionDiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionItemPromotionDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMAZON_PROMOTION_ITEM_PROMOTION_DISCOUNT between", value1, value2, "amazonPromotionItemPromotionDiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonPromotionItemPromotionDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMAZON_PROMOTION_ITEM_PROMOTION_DISCOUNT not between", value1, value2, "amazonPromotionItemPromotionDiscount");
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