package cn.ssm.project.pojo;

import java.math.BigDecimal;
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

        public Criteria andMerchantOrderIdIsNull() {
            addCriterion("MERCHANT_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdIsNotNull() {
            addCriterion("MERCHANT_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_ID =", value, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdNotEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_ID <>", value, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdGreaterThan(String value) {
            addCriterion("MERCHANT_ORDER_ID >", value, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_ID >=", value, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdLessThan(String value) {
            addCriterion("MERCHANT_ORDER_ID <", value, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_ORDER_ID <=", value, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdLike(String value) {
            addCriterion("MERCHANT_ORDER_ID like", value, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdNotLike(String value) {
            addCriterion("MERCHANT_ORDER_ID not like", value, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdIn(List<String> values) {
            addCriterion("MERCHANT_ORDER_ID in", values, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdNotIn(List<String> values) {
            addCriterion("MERCHANT_ORDER_ID not in", values, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdBetween(String value1, String value2) {
            addCriterion("MERCHANT_ORDER_ID between", value1, value2, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andMerchantOrderIdNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_ORDER_ID not between", value1, value2, "merchantOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNull() {
            addCriterion("PURCHASE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNotNull() {
            addCriterion("PURCHASE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateEqualTo(Date value) {
            addCriterion("PURCHASE_DATE =", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotEqualTo(Date value) {
            addCriterion("PURCHASE_DATE <>", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThan(Date value) {
            addCriterion("PURCHASE_DATE >", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PURCHASE_DATE >=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThan(Date value) {
            addCriterion("PURCHASE_DATE <", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThanOrEqualTo(Date value) {
            addCriterion("PURCHASE_DATE <=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIn(List<Date> values) {
            addCriterion("PURCHASE_DATE in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotIn(List<Date> values) {
            addCriterion("PURCHASE_DATE not in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateBetween(Date value1, Date value2) {
            addCriterion("PURCHASE_DATE between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotBetween(Date value1, Date value2) {
            addCriterion("PURCHASE_DATE not between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andLastupdatedDateIsNull() {
            addCriterion("LASTUPDATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastupdatedDateIsNotNull() {
            addCriterion("LASTUPDATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdatedDateEqualTo(Date value) {
            addCriterion("LASTUPDATED_DATE =", value, "lastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andLastupdatedDateNotEqualTo(Date value) {
            addCriterion("LASTUPDATED_DATE <>", value, "lastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andLastupdatedDateGreaterThan(Date value) {
            addCriterion("LASTUPDATED_DATE >", value, "lastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andLastupdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTUPDATED_DATE >=", value, "lastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andLastupdatedDateLessThan(Date value) {
            addCriterion("LASTUPDATED_DATE <", value, "lastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andLastupdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("LASTUPDATED_DATE <=", value, "lastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andLastupdatedDateIn(List<Date> values) {
            addCriterion("LASTUPDATED_DATE in", values, "lastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andLastupdatedDateNotIn(List<Date> values) {
            addCriterion("LASTUPDATED_DATE not in", values, "lastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andLastupdatedDateBetween(Date value1, Date value2) {
            addCriterion("LASTUPDATED_DATE between", value1, value2, "lastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andLastupdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("LASTUPDATED_DATE not between", value1, value2, "lastupdatedDate");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("ORDER_STATUS =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("ORDER_STATUS <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("ORDER_STATUS >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("ORDER_STATUS <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("ORDER_STATUS like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("ORDER_STATUS not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("ORDER_STATUS in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("ORDER_STATUS not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andSalesChannelIsNull() {
            addCriterion("SALES_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andSalesChannelIsNotNull() {
            addCriterion("SALES_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andSalesChannelEqualTo(String value) {
            addCriterion("SALES_CHANNEL =", value, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelNotEqualTo(String value) {
            addCriterion("SALES_CHANNEL <>", value, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelGreaterThan(String value) {
            addCriterion("SALES_CHANNEL >", value, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelGreaterThanOrEqualTo(String value) {
            addCriterion("SALES_CHANNEL >=", value, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelLessThan(String value) {
            addCriterion("SALES_CHANNEL <", value, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelLessThanOrEqualTo(String value) {
            addCriterion("SALES_CHANNEL <=", value, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelLike(String value) {
            addCriterion("SALES_CHANNEL like", value, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelNotLike(String value) {
            addCriterion("SALES_CHANNEL not like", value, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelIn(List<String> values) {
            addCriterion("SALES_CHANNEL in", values, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelNotIn(List<String> values) {
            addCriterion("SALES_CHANNEL not in", values, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelBetween(String value1, String value2) {
            addCriterion("SALES_CHANNEL between", value1, value2, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andSalesChannelNotBetween(String value1, String value2) {
            addCriterion("SALES_CHANNEL not between", value1, value2, "salesChannel");
            return (Criteria) this;
        }

        public Criteria andFulfillFulfillmentChannelIsNull() {
            addCriterion("FULFILL_FULFILLMENT_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andFulfillFulfillmentChannelIsNotNull() {
            addCriterion("FULFILL_FULFILLMENT_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andFulfillFulfillmentChannelEqualTo(String value) {
            addCriterion("FULFILL_FULFILLMENT_CHANNEL =", value, "fulfillFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andFulfillFulfillmentChannelNotEqualTo(String value) {
            addCriterion("FULFILL_FULFILLMENT_CHANNEL <>", value, "fulfillFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andFulfillFulfillmentChannelGreaterThan(String value) {
            addCriterion("FULFILL_FULFILLMENT_CHANNEL >", value, "fulfillFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andFulfillFulfillmentChannelGreaterThanOrEqualTo(String value) {
            addCriterion("FULFILL_FULFILLMENT_CHANNEL >=", value, "fulfillFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andFulfillFulfillmentChannelLessThan(String value) {
            addCriterion("FULFILL_FULFILLMENT_CHANNEL <", value, "fulfillFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andFulfillFulfillmentChannelLessThanOrEqualTo(String value) {
            addCriterion("FULFILL_FULFILLMENT_CHANNEL <=", value, "fulfillFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andFulfillFulfillmentChannelLike(String value) {
            addCriterion("FULFILL_FULFILLMENT_CHANNEL like", value, "fulfillFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andFulfillFulfillmentChannelNotLike(String value) {
            addCriterion("FULFILL_FULFILLMENT_CHANNEL not like", value, "fulfillFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andFulfillFulfillmentChannelIn(List<String> values) {
            addCriterion("FULFILL_FULFILLMENT_CHANNEL in", values, "fulfillFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andFulfillFulfillmentChannelNotIn(List<String> values) {
            addCriterion("FULFILL_FULFILLMENT_CHANNEL not in", values, "fulfillFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andFulfillFulfillmentChannelBetween(String value1, String value2) {
            addCriterion("FULFILL_FULFILLMENT_CHANNEL between", value1, value2, "fulfillFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andFulfillFulfillmentChannelNotBetween(String value1, String value2) {
            addCriterion("FULFILL_FULFILLMENT_CHANNEL not between", value1, value2, "fulfillFulfillmentChannel");
            return (Criteria) this;
        }

        public Criteria andFulfillShipServiceLevelIsNull() {
            addCriterion("FULFILL_SHIP_SERVICE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andFulfillShipServiceLevelIsNotNull() {
            addCriterion("FULFILL_SHIP_SERVICE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andFulfillShipServiceLevelEqualTo(String value) {
            addCriterion("FULFILL_SHIP_SERVICE_LEVEL =", value, "fulfillShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andFulfillShipServiceLevelNotEqualTo(String value) {
            addCriterion("FULFILL_SHIP_SERVICE_LEVEL <>", value, "fulfillShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andFulfillShipServiceLevelGreaterThan(String value) {
            addCriterion("FULFILL_SHIP_SERVICE_LEVEL >", value, "fulfillShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andFulfillShipServiceLevelGreaterThanOrEqualTo(String value) {
            addCriterion("FULFILL_SHIP_SERVICE_LEVEL >=", value, "fulfillShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andFulfillShipServiceLevelLessThan(String value) {
            addCriterion("FULFILL_SHIP_SERVICE_LEVEL <", value, "fulfillShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andFulfillShipServiceLevelLessThanOrEqualTo(String value) {
            addCriterion("FULFILL_SHIP_SERVICE_LEVEL <=", value, "fulfillShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andFulfillShipServiceLevelLike(String value) {
            addCriterion("FULFILL_SHIP_SERVICE_LEVEL like", value, "fulfillShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andFulfillShipServiceLevelNotLike(String value) {
            addCriterion("FULFILL_SHIP_SERVICE_LEVEL not like", value, "fulfillShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andFulfillShipServiceLevelIn(List<String> values) {
            addCriterion("FULFILL_SHIP_SERVICE_LEVEL in", values, "fulfillShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andFulfillShipServiceLevelNotIn(List<String> values) {
            addCriterion("FULFILL_SHIP_SERVICE_LEVEL not in", values, "fulfillShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andFulfillShipServiceLevelBetween(String value1, String value2) {
            addCriterion("FULFILL_SHIP_SERVICE_LEVEL between", value1, value2, "fulfillShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andFulfillShipServiceLevelNotBetween(String value1, String value2) {
            addCriterion("FULFILL_SHIP_SERVICE_LEVEL not between", value1, value2, "fulfillShipServiceLevel");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCityIsNull() {
            addCriterion("FULFILL_ADDRESS_CITY is null");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCityIsNotNull() {
            addCriterion("FULFILL_ADDRESS_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCityEqualTo(String value) {
            addCriterion("FULFILL_ADDRESS_CITY =", value, "fulfillAddressCity");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCityNotEqualTo(String value) {
            addCriterion("FULFILL_ADDRESS_CITY <>", value, "fulfillAddressCity");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCityGreaterThan(String value) {
            addCriterion("FULFILL_ADDRESS_CITY >", value, "fulfillAddressCity");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCityGreaterThanOrEqualTo(String value) {
            addCriterion("FULFILL_ADDRESS_CITY >=", value, "fulfillAddressCity");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCityLessThan(String value) {
            addCriterion("FULFILL_ADDRESS_CITY <", value, "fulfillAddressCity");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCityLessThanOrEqualTo(String value) {
            addCriterion("FULFILL_ADDRESS_CITY <=", value, "fulfillAddressCity");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCityLike(String value) {
            addCriterion("FULFILL_ADDRESS_CITY like", value, "fulfillAddressCity");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCityNotLike(String value) {
            addCriterion("FULFILL_ADDRESS_CITY not like", value, "fulfillAddressCity");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCityIn(List<String> values) {
            addCriterion("FULFILL_ADDRESS_CITY in", values, "fulfillAddressCity");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCityNotIn(List<String> values) {
            addCriterion("FULFILL_ADDRESS_CITY not in", values, "fulfillAddressCity");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCityBetween(String value1, String value2) {
            addCriterion("FULFILL_ADDRESS_CITY between", value1, value2, "fulfillAddressCity");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCityNotBetween(String value1, String value2) {
            addCriterion("FULFILL_ADDRESS_CITY not between", value1, value2, "fulfillAddressCity");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressStateIsNull() {
            addCriterion("FULFILL_ADDRESS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressStateIsNotNull() {
            addCriterion("FULFILL_ADDRESS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressStateEqualTo(String value) {
            addCriterion("FULFILL_ADDRESS_STATE =", value, "fulfillAddressState");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressStateNotEqualTo(String value) {
            addCriterion("FULFILL_ADDRESS_STATE <>", value, "fulfillAddressState");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressStateGreaterThan(String value) {
            addCriterion("FULFILL_ADDRESS_STATE >", value, "fulfillAddressState");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressStateGreaterThanOrEqualTo(String value) {
            addCriterion("FULFILL_ADDRESS_STATE >=", value, "fulfillAddressState");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressStateLessThan(String value) {
            addCriterion("FULFILL_ADDRESS_STATE <", value, "fulfillAddressState");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressStateLessThanOrEqualTo(String value) {
            addCriterion("FULFILL_ADDRESS_STATE <=", value, "fulfillAddressState");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressStateLike(String value) {
            addCriterion("FULFILL_ADDRESS_STATE like", value, "fulfillAddressState");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressStateNotLike(String value) {
            addCriterion("FULFILL_ADDRESS_STATE not like", value, "fulfillAddressState");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressStateIn(List<String> values) {
            addCriterion("FULFILL_ADDRESS_STATE in", values, "fulfillAddressState");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressStateNotIn(List<String> values) {
            addCriterion("FULFILL_ADDRESS_STATE not in", values, "fulfillAddressState");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressStateBetween(String value1, String value2) {
            addCriterion("FULFILL_ADDRESS_STATE between", value1, value2, "fulfillAddressState");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressStateNotBetween(String value1, String value2) {
            addCriterion("FULFILL_ADDRESS_STATE not between", value1, value2, "fulfillAddressState");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressPostalCodeIsNull() {
            addCriterion("FULFILL_ADDRESS_POSTAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressPostalCodeIsNotNull() {
            addCriterion("FULFILL_ADDRESS_POSTAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressPostalCodeEqualTo(String value) {
            addCriterion("FULFILL_ADDRESS_POSTAL_CODE =", value, "fulfillAddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressPostalCodeNotEqualTo(String value) {
            addCriterion("FULFILL_ADDRESS_POSTAL_CODE <>", value, "fulfillAddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressPostalCodeGreaterThan(String value) {
            addCriterion("FULFILL_ADDRESS_POSTAL_CODE >", value, "fulfillAddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FULFILL_ADDRESS_POSTAL_CODE >=", value, "fulfillAddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressPostalCodeLessThan(String value) {
            addCriterion("FULFILL_ADDRESS_POSTAL_CODE <", value, "fulfillAddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("FULFILL_ADDRESS_POSTAL_CODE <=", value, "fulfillAddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressPostalCodeLike(String value) {
            addCriterion("FULFILL_ADDRESS_POSTAL_CODE like", value, "fulfillAddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressPostalCodeNotLike(String value) {
            addCriterion("FULFILL_ADDRESS_POSTAL_CODE not like", value, "fulfillAddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressPostalCodeIn(List<String> values) {
            addCriterion("FULFILL_ADDRESS_POSTAL_CODE in", values, "fulfillAddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressPostalCodeNotIn(List<String> values) {
            addCriterion("FULFILL_ADDRESS_POSTAL_CODE not in", values, "fulfillAddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressPostalCodeBetween(String value1, String value2) {
            addCriterion("FULFILL_ADDRESS_POSTAL_CODE between", value1, value2, "fulfillAddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressPostalCodeNotBetween(String value1, String value2) {
            addCriterion("FULFILL_ADDRESS_POSTAL_CODE not between", value1, value2, "fulfillAddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCountryIsNull() {
            addCriterion("FULFILL_ADDRESS_COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCountryIsNotNull() {
            addCriterion("FULFILL_ADDRESS_COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCountryEqualTo(String value) {
            addCriterion("FULFILL_ADDRESS_COUNTRY =", value, "fulfillAddressCountry");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCountryNotEqualTo(String value) {
            addCriterion("FULFILL_ADDRESS_COUNTRY <>", value, "fulfillAddressCountry");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCountryGreaterThan(String value) {
            addCriterion("FULFILL_ADDRESS_COUNTRY >", value, "fulfillAddressCountry");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCountryGreaterThanOrEqualTo(String value) {
            addCriterion("FULFILL_ADDRESS_COUNTRY >=", value, "fulfillAddressCountry");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCountryLessThan(String value) {
            addCriterion("FULFILL_ADDRESS_COUNTRY <", value, "fulfillAddressCountry");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCountryLessThanOrEqualTo(String value) {
            addCriterion("FULFILL_ADDRESS_COUNTRY <=", value, "fulfillAddressCountry");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCountryLike(String value) {
            addCriterion("FULFILL_ADDRESS_COUNTRY like", value, "fulfillAddressCountry");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCountryNotLike(String value) {
            addCriterion("FULFILL_ADDRESS_COUNTRY not like", value, "fulfillAddressCountry");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCountryIn(List<String> values) {
            addCriterion("FULFILL_ADDRESS_COUNTRY in", values, "fulfillAddressCountry");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCountryNotIn(List<String> values) {
            addCriterion("FULFILL_ADDRESS_COUNTRY not in", values, "fulfillAddressCountry");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCountryBetween(String value1, String value2) {
            addCriterion("FULFILL_ADDRESS_COUNTRY between", value1, value2, "fulfillAddressCountry");
            return (Criteria) this;
        }

        public Criteria andFulfillAddressCountryNotBetween(String value1, String value2) {
            addCriterion("FULFILL_ADDRESS_COUNTRY not between", value1, value2, "fulfillAddressCountry");
            return (Criteria) this;
        }

        public Criteria andIsBusinessOrderIsNull() {
            addCriterion("IS_BUSINESS_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andIsBusinessOrderIsNotNull() {
            addCriterion("IS_BUSINESS_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andIsBusinessOrderEqualTo(String value) {
            addCriterion("IS_BUSINESS_ORDER =", value, "isBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andIsBusinessOrderNotEqualTo(String value) {
            addCriterion("IS_BUSINESS_ORDER <>", value, "isBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andIsBusinessOrderGreaterThan(String value) {
            addCriterion("IS_BUSINESS_ORDER >", value, "isBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andIsBusinessOrderGreaterThanOrEqualTo(String value) {
            addCriterion("IS_BUSINESS_ORDER >=", value, "isBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andIsBusinessOrderLessThan(String value) {
            addCriterion("IS_BUSINESS_ORDER <", value, "isBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andIsBusinessOrderLessThanOrEqualTo(String value) {
            addCriterion("IS_BUSINESS_ORDER <=", value, "isBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andIsBusinessOrderLike(String value) {
            addCriterion("IS_BUSINESS_ORDER like", value, "isBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andIsBusinessOrderNotLike(String value) {
            addCriterion("IS_BUSINESS_ORDER not like", value, "isBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andIsBusinessOrderIn(List<String> values) {
            addCriterion("IS_BUSINESS_ORDER in", values, "isBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andIsBusinessOrderNotIn(List<String> values) {
            addCriterion("IS_BUSINESS_ORDER not in", values, "isBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andIsBusinessOrderBetween(String value1, String value2) {
            addCriterion("IS_BUSINESS_ORDER between", value1, value2, "isBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andIsBusinessOrderNotBetween(String value1, String value2) {
            addCriterion("IS_BUSINESS_ORDER not between", value1, value2, "isBusinessOrder");
            return (Criteria) this;
        }

        public Criteria andOrderItemAsinIsNull() {
            addCriterion("ORDER_ITEM_ASIN is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemAsinIsNotNull() {
            addCriterion("ORDER_ITEM_ASIN is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemAsinEqualTo(String value) {
            addCriterion("ORDER_ITEM_ASIN =", value, "orderItemAsin");
            return (Criteria) this;
        }

        public Criteria andOrderItemAsinNotEqualTo(String value) {
            addCriterion("ORDER_ITEM_ASIN <>", value, "orderItemAsin");
            return (Criteria) this;
        }

        public Criteria andOrderItemAsinGreaterThan(String value) {
            addCriterion("ORDER_ITEM_ASIN >", value, "orderItemAsin");
            return (Criteria) this;
        }

        public Criteria andOrderItemAsinGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ITEM_ASIN >=", value, "orderItemAsin");
            return (Criteria) this;
        }

        public Criteria andOrderItemAsinLessThan(String value) {
            addCriterion("ORDER_ITEM_ASIN <", value, "orderItemAsin");
            return (Criteria) this;
        }

        public Criteria andOrderItemAsinLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ITEM_ASIN <=", value, "orderItemAsin");
            return (Criteria) this;
        }

        public Criteria andOrderItemAsinLike(String value) {
            addCriterion("ORDER_ITEM_ASIN like", value, "orderItemAsin");
            return (Criteria) this;
        }

        public Criteria andOrderItemAsinNotLike(String value) {
            addCriterion("ORDER_ITEM_ASIN not like", value, "orderItemAsin");
            return (Criteria) this;
        }

        public Criteria andOrderItemAsinIn(List<String> values) {
            addCriterion("ORDER_ITEM_ASIN in", values, "orderItemAsin");
            return (Criteria) this;
        }

        public Criteria andOrderItemAsinNotIn(List<String> values) {
            addCriterion("ORDER_ITEM_ASIN not in", values, "orderItemAsin");
            return (Criteria) this;
        }

        public Criteria andOrderItemAsinBetween(String value1, String value2) {
            addCriterion("ORDER_ITEM_ASIN between", value1, value2, "orderItemAsin");
            return (Criteria) this;
        }

        public Criteria andOrderItemAsinNotBetween(String value1, String value2) {
            addCriterion("ORDER_ITEM_ASIN not between", value1, value2, "orderItemAsin");
            return (Criteria) this;
        }

        public Criteria andOrderItemSkuIsNull() {
            addCriterion("ORDER_ITEM_SKU is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemSkuIsNotNull() {
            addCriterion("ORDER_ITEM_SKU is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemSkuEqualTo(String value) {
            addCriterion("ORDER_ITEM_SKU =", value, "orderItemSku");
            return (Criteria) this;
        }

        public Criteria andOrderItemSkuNotEqualTo(String value) {
            addCriterion("ORDER_ITEM_SKU <>", value, "orderItemSku");
            return (Criteria) this;
        }

        public Criteria andOrderItemSkuGreaterThan(String value) {
            addCriterion("ORDER_ITEM_SKU >", value, "orderItemSku");
            return (Criteria) this;
        }

        public Criteria andOrderItemSkuGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ITEM_SKU >=", value, "orderItemSku");
            return (Criteria) this;
        }

        public Criteria andOrderItemSkuLessThan(String value) {
            addCriterion("ORDER_ITEM_SKU <", value, "orderItemSku");
            return (Criteria) this;
        }

        public Criteria andOrderItemSkuLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ITEM_SKU <=", value, "orderItemSku");
            return (Criteria) this;
        }

        public Criteria andOrderItemSkuLike(String value) {
            addCriterion("ORDER_ITEM_SKU like", value, "orderItemSku");
            return (Criteria) this;
        }

        public Criteria andOrderItemSkuNotLike(String value) {
            addCriterion("ORDER_ITEM_SKU not like", value, "orderItemSku");
            return (Criteria) this;
        }

        public Criteria andOrderItemSkuIn(List<String> values) {
            addCriterion("ORDER_ITEM_SKU in", values, "orderItemSku");
            return (Criteria) this;
        }

        public Criteria andOrderItemSkuNotIn(List<String> values) {
            addCriterion("ORDER_ITEM_SKU not in", values, "orderItemSku");
            return (Criteria) this;
        }

        public Criteria andOrderItemSkuBetween(String value1, String value2) {
            addCriterion("ORDER_ITEM_SKU between", value1, value2, "orderItemSku");
            return (Criteria) this;
        }

        public Criteria andOrderItemSkuNotBetween(String value1, String value2) {
            addCriterion("ORDER_ITEM_SKU not between", value1, value2, "orderItemSku");
            return (Criteria) this;
        }

        public Criteria andOrderItemItemStatusIsNull() {
            addCriterion("ORDER_ITEM_ITEM_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemItemStatusIsNotNull() {
            addCriterion("ORDER_ITEM_ITEM_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemItemStatusEqualTo(String value) {
            addCriterion("ORDER_ITEM_ITEM_STATUS =", value, "orderItemItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrderItemItemStatusNotEqualTo(String value) {
            addCriterion("ORDER_ITEM_ITEM_STATUS <>", value, "orderItemItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrderItemItemStatusGreaterThan(String value) {
            addCriterion("ORDER_ITEM_ITEM_STATUS >", value, "orderItemItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrderItemItemStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ITEM_ITEM_STATUS >=", value, "orderItemItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrderItemItemStatusLessThan(String value) {
            addCriterion("ORDER_ITEM_ITEM_STATUS <", value, "orderItemItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrderItemItemStatusLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ITEM_ITEM_STATUS <=", value, "orderItemItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrderItemItemStatusLike(String value) {
            addCriterion("ORDER_ITEM_ITEM_STATUS like", value, "orderItemItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrderItemItemStatusNotLike(String value) {
            addCriterion("ORDER_ITEM_ITEM_STATUS not like", value, "orderItemItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrderItemItemStatusIn(List<String> values) {
            addCriterion("ORDER_ITEM_ITEM_STATUS in", values, "orderItemItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrderItemItemStatusNotIn(List<String> values) {
            addCriterion("ORDER_ITEM_ITEM_STATUS not in", values, "orderItemItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrderItemItemStatusBetween(String value1, String value2) {
            addCriterion("ORDER_ITEM_ITEM_STATUS between", value1, value2, "orderItemItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrderItemItemStatusNotBetween(String value1, String value2) {
            addCriterion("ORDER_ITEM_ITEM_STATUS not between", value1, value2, "orderItemItemStatus");
            return (Criteria) this;
        }

        public Criteria andOrderItemProductNameIsNull() {
            addCriterion("ORDER_ITEM_PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemProductNameIsNotNull() {
            addCriterion("ORDER_ITEM_PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemProductNameEqualTo(String value) {
            addCriterion("ORDER_ITEM_PRODUCT_NAME =", value, "orderItemProductName");
            return (Criteria) this;
        }

        public Criteria andOrderItemProductNameNotEqualTo(String value) {
            addCriterion("ORDER_ITEM_PRODUCT_NAME <>", value, "orderItemProductName");
            return (Criteria) this;
        }

        public Criteria andOrderItemProductNameGreaterThan(String value) {
            addCriterion("ORDER_ITEM_PRODUCT_NAME >", value, "orderItemProductName");
            return (Criteria) this;
        }

        public Criteria andOrderItemProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ITEM_PRODUCT_NAME >=", value, "orderItemProductName");
            return (Criteria) this;
        }

        public Criteria andOrderItemProductNameLessThan(String value) {
            addCriterion("ORDER_ITEM_PRODUCT_NAME <", value, "orderItemProductName");
            return (Criteria) this;
        }

        public Criteria andOrderItemProductNameLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ITEM_PRODUCT_NAME <=", value, "orderItemProductName");
            return (Criteria) this;
        }

        public Criteria andOrderItemProductNameLike(String value) {
            addCriterion("ORDER_ITEM_PRODUCT_NAME like", value, "orderItemProductName");
            return (Criteria) this;
        }

        public Criteria andOrderItemProductNameNotLike(String value) {
            addCriterion("ORDER_ITEM_PRODUCT_NAME not like", value, "orderItemProductName");
            return (Criteria) this;
        }

        public Criteria andOrderItemProductNameIn(List<String> values) {
            addCriterion("ORDER_ITEM_PRODUCT_NAME in", values, "orderItemProductName");
            return (Criteria) this;
        }

        public Criteria andOrderItemProductNameNotIn(List<String> values) {
            addCriterion("ORDER_ITEM_PRODUCT_NAME not in", values, "orderItemProductName");
            return (Criteria) this;
        }

        public Criteria andOrderItemProductNameBetween(String value1, String value2) {
            addCriterion("ORDER_ITEM_PRODUCT_NAME between", value1, value2, "orderItemProductName");
            return (Criteria) this;
        }

        public Criteria andOrderItemProductNameNotBetween(String value1, String value2) {
            addCriterion("ORDER_ITEM_PRODUCT_NAME not between", value1, value2, "orderItemProductName");
            return (Criteria) this;
        }

        public Criteria andOrderItemQuantityIsNull() {
            addCriterion("ORDER_ITEM_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemQuantityIsNotNull() {
            addCriterion("ORDER_ITEM_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemQuantityEqualTo(BigDecimal value) {
            addCriterion("ORDER_ITEM_QUANTITY =", value, "orderItemQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderItemQuantityNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_ITEM_QUANTITY <>", value, "orderItemQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderItemQuantityGreaterThan(BigDecimal value) {
            addCriterion("ORDER_ITEM_QUANTITY >", value, "orderItemQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderItemQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_ITEM_QUANTITY >=", value, "orderItemQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderItemQuantityLessThan(BigDecimal value) {
            addCriterion("ORDER_ITEM_QUANTITY <", value, "orderItemQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderItemQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_ITEM_QUANTITY <=", value, "orderItemQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderItemQuantityIn(List<BigDecimal> values) {
            addCriterion("ORDER_ITEM_QUANTITY in", values, "orderItemQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderItemQuantityNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_ITEM_QUANTITY not in", values, "orderItemQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderItemQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_ITEM_QUANTITY between", value1, value2, "orderItemQuantity");
            return (Criteria) this;
        }

        public Criteria andOrderItemQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_ITEM_QUANTITY not between", value1, value2, "orderItemQuantity");
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