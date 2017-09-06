package cn.ssm.project.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmazonOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmazonOrderExample() {
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

        public Criteria andClinetIdIsNull() {
            addCriterion("CLINET_ID is null");
            return (Criteria) this;
        }

        public Criteria andClinetIdIsNotNull() {
            addCriterion("CLINET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClinetIdEqualTo(Integer value) {
            addCriterion("CLINET_ID =", value, "clinetId");
            return (Criteria) this;
        }

        public Criteria andClinetIdNotEqualTo(Integer value) {
            addCriterion("CLINET_ID <>", value, "clinetId");
            return (Criteria) this;
        }

        public Criteria andClinetIdGreaterThan(Integer value) {
            addCriterion("CLINET_ID >", value, "clinetId");
            return (Criteria) this;
        }

        public Criteria andClinetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLINET_ID >=", value, "clinetId");
            return (Criteria) this;
        }

        public Criteria andClinetIdLessThan(Integer value) {
            addCriterion("CLINET_ID <", value, "clinetId");
            return (Criteria) this;
        }

        public Criteria andClinetIdLessThanOrEqualTo(Integer value) {
            addCriterion("CLINET_ID <=", value, "clinetId");
            return (Criteria) this;
        }

        public Criteria andClinetIdIn(List<Integer> values) {
            addCriterion("CLINET_ID in", values, "clinetId");
            return (Criteria) this;
        }

        public Criteria andClinetIdNotIn(List<Integer> values) {
            addCriterion("CLINET_ID not in", values, "clinetId");
            return (Criteria) this;
        }

        public Criteria andClinetIdBetween(Integer value1, Integer value2) {
            addCriterion("CLINET_ID between", value1, value2, "clinetId");
            return (Criteria) this;
        }

        public Criteria andClinetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CLINET_ID not between", value1, value2, "clinetId");
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

        public Criteria andIsImportedIsNull() {
            addCriterion("IS_IMPORTED is null");
            return (Criteria) this;
        }

        public Criteria andIsImportedIsNotNull() {
            addCriterion("IS_IMPORTED is not null");
            return (Criteria) this;
        }

        public Criteria andIsImportedEqualTo(String value) {
            addCriterion("IS_IMPORTED =", value, "isImported");
            return (Criteria) this;
        }

        public Criteria andIsImportedNotEqualTo(String value) {
            addCriterion("IS_IMPORTED <>", value, "isImported");
            return (Criteria) this;
        }

        public Criteria andIsImportedGreaterThan(String value) {
            addCriterion("IS_IMPORTED >", value, "isImported");
            return (Criteria) this;
        }

        public Criteria andIsImportedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_IMPORTED >=", value, "isImported");
            return (Criteria) this;
        }

        public Criteria andIsImportedLessThan(String value) {
            addCriterion("IS_IMPORTED <", value, "isImported");
            return (Criteria) this;
        }

        public Criteria andIsImportedLessThanOrEqualTo(String value) {
            addCriterion("IS_IMPORTED <=", value, "isImported");
            return (Criteria) this;
        }

        public Criteria andIsImportedLike(String value) {
            addCriterion("IS_IMPORTED like", value, "isImported");
            return (Criteria) this;
        }

        public Criteria andIsImportedNotLike(String value) {
            addCriterion("IS_IMPORTED not like", value, "isImported");
            return (Criteria) this;
        }

        public Criteria andIsImportedIn(List<String> values) {
            addCriterion("IS_IMPORTED in", values, "isImported");
            return (Criteria) this;
        }

        public Criteria andIsImportedNotIn(List<String> values) {
            addCriterion("IS_IMPORTED not in", values, "isImported");
            return (Criteria) this;
        }

        public Criteria andIsImportedBetween(String value1, String value2) {
            addCriterion("IS_IMPORTED between", value1, value2, "isImported");
            return (Criteria) this;
        }

        public Criteria andIsImportedNotBetween(String value1, String value2) {
            addCriterion("IS_IMPORTED not between", value1, value2, "isImported");
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