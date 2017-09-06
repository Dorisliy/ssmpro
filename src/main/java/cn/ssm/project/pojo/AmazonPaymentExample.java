package cn.ssm.project.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmazonPaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmazonPaymentExample() {
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

        public Criteria andAmazonImportPaymentLogIdIsNull() {
            addCriterion("AMAZON_IMPORT_PAYMENT_LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andAmazonImportPaymentLogIdIsNotNull() {
            addCriterion("AMAZON_IMPORT_PAYMENT_LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonImportPaymentLogIdEqualTo(Integer value) {
            addCriterion("AMAZON_IMPORT_PAYMENT_LOG_ID =", value, "amazonImportPaymentLogId");
            return (Criteria) this;
        }

        public Criteria andAmazonImportPaymentLogIdNotEqualTo(Integer value) {
            addCriterion("AMAZON_IMPORT_PAYMENT_LOG_ID <>", value, "amazonImportPaymentLogId");
            return (Criteria) this;
        }

        public Criteria andAmazonImportPaymentLogIdGreaterThan(Integer value) {
            addCriterion("AMAZON_IMPORT_PAYMENT_LOG_ID >", value, "amazonImportPaymentLogId");
            return (Criteria) this;
        }

        public Criteria andAmazonImportPaymentLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AMAZON_IMPORT_PAYMENT_LOG_ID >=", value, "amazonImportPaymentLogId");
            return (Criteria) this;
        }

        public Criteria andAmazonImportPaymentLogIdLessThan(Integer value) {
            addCriterion("AMAZON_IMPORT_PAYMENT_LOG_ID <", value, "amazonImportPaymentLogId");
            return (Criteria) this;
        }

        public Criteria andAmazonImportPaymentLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("AMAZON_IMPORT_PAYMENT_LOG_ID <=", value, "amazonImportPaymentLogId");
            return (Criteria) this;
        }

        public Criteria andAmazonImportPaymentLogIdIn(List<Integer> values) {
            addCriterion("AMAZON_IMPORT_PAYMENT_LOG_ID in", values, "amazonImportPaymentLogId");
            return (Criteria) this;
        }

        public Criteria andAmazonImportPaymentLogIdNotIn(List<Integer> values) {
            addCriterion("AMAZON_IMPORT_PAYMENT_LOG_ID not in", values, "amazonImportPaymentLogId");
            return (Criteria) this;
        }

        public Criteria andAmazonImportPaymentLogIdBetween(Integer value1, Integer value2) {
            addCriterion("AMAZON_IMPORT_PAYMENT_LOG_ID between", value1, value2, "amazonImportPaymentLogId");
            return (Criteria) this;
        }

        public Criteria andAmazonImportPaymentLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AMAZON_IMPORT_PAYMENT_LOG_ID not between", value1, value2, "amazonImportPaymentLogId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceIdIsNull() {
            addCriterion("C_INVOICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCInvoiceIdIsNotNull() {
            addCriterion("C_INVOICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCInvoiceIdEqualTo(Integer value) {
            addCriterion("C_INVOICE_ID =", value, "cInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceIdNotEqualTo(Integer value) {
            addCriterion("C_INVOICE_ID <>", value, "cInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceIdGreaterThan(Integer value) {
            addCriterion("C_INVOICE_ID >", value, "cInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_INVOICE_ID >=", value, "cInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceIdLessThan(Integer value) {
            addCriterion("C_INVOICE_ID <", value, "cInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_INVOICE_ID <=", value, "cInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceIdIn(List<Integer> values) {
            addCriterion("C_INVOICE_ID in", values, "cInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceIdNotIn(List<Integer> values) {
            addCriterion("C_INVOICE_ID not in", values, "cInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceIdBetween(Integer value1, Integer value2) {
            addCriterion("C_INVOICE_ID between", value1, value2, "cInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_INVOICE_ID not between", value1, value2, "cInvoiceId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceLineIdIsNull() {
            addCriterion("C_INVOICE_LINE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCInvoiceLineIdIsNotNull() {
            addCriterion("C_INVOICE_LINE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCInvoiceLineIdEqualTo(Integer value) {
            addCriterion("C_INVOICE_LINE_ID =", value, "cInvoiceLineId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceLineIdNotEqualTo(Integer value) {
            addCriterion("C_INVOICE_LINE_ID <>", value, "cInvoiceLineId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceLineIdGreaterThan(Integer value) {
            addCriterion("C_INVOICE_LINE_ID >", value, "cInvoiceLineId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceLineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_INVOICE_LINE_ID >=", value, "cInvoiceLineId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceLineIdLessThan(Integer value) {
            addCriterion("C_INVOICE_LINE_ID <", value, "cInvoiceLineId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceLineIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_INVOICE_LINE_ID <=", value, "cInvoiceLineId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceLineIdIn(List<Integer> values) {
            addCriterion("C_INVOICE_LINE_ID in", values, "cInvoiceLineId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceLineIdNotIn(List<Integer> values) {
            addCriterion("C_INVOICE_LINE_ID not in", values, "cInvoiceLineId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceLineIdBetween(Integer value1, Integer value2) {
            addCriterion("C_INVOICE_LINE_ID between", value1, value2, "cInvoiceLineId");
            return (Criteria) this;
        }

        public Criteria andCInvoiceLineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_INVOICE_LINE_ID not between", value1, value2, "cInvoiceLineId");
            return (Criteria) this;
        }

        public Criteria andMInoutIdIsNull() {
            addCriterion("M_INOUT_ID is null");
            return (Criteria) this;
        }

        public Criteria andMInoutIdIsNotNull() {
            addCriterion("M_INOUT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMInoutIdEqualTo(Integer value) {
            addCriterion("M_INOUT_ID =", value, "mInoutId");
            return (Criteria) this;
        }

        public Criteria andMInoutIdNotEqualTo(Integer value) {
            addCriterion("M_INOUT_ID <>", value, "mInoutId");
            return (Criteria) this;
        }

        public Criteria andMInoutIdGreaterThan(Integer value) {
            addCriterion("M_INOUT_ID >", value, "mInoutId");
            return (Criteria) this;
        }

        public Criteria andMInoutIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("M_INOUT_ID >=", value, "mInoutId");
            return (Criteria) this;
        }

        public Criteria andMInoutIdLessThan(Integer value) {
            addCriterion("M_INOUT_ID <", value, "mInoutId");
            return (Criteria) this;
        }

        public Criteria andMInoutIdLessThanOrEqualTo(Integer value) {
            addCriterion("M_INOUT_ID <=", value, "mInoutId");
            return (Criteria) this;
        }

        public Criteria andMInoutIdIn(List<Integer> values) {
            addCriterion("M_INOUT_ID in", values, "mInoutId");
            return (Criteria) this;
        }

        public Criteria andMInoutIdNotIn(List<Integer> values) {
            addCriterion("M_INOUT_ID not in", values, "mInoutId");
            return (Criteria) this;
        }

        public Criteria andMInoutIdBetween(Integer value1, Integer value2) {
            addCriterion("M_INOUT_ID between", value1, value2, "mInoutId");
            return (Criteria) this;
        }

        public Criteria andMInoutIdNotBetween(Integer value1, Integer value2) {
            addCriterion("M_INOUT_ID not between", value1, value2, "mInoutId");
            return (Criteria) this;
        }

        public Criteria andMInoutLineIdIsNull() {
            addCriterion("M_INOUT_LINE_ID is null");
            return (Criteria) this;
        }

        public Criteria andMInoutLineIdIsNotNull() {
            addCriterion("M_INOUT_LINE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMInoutLineIdEqualTo(Integer value) {
            addCriterion("M_INOUT_LINE_ID =", value, "mInoutLineId");
            return (Criteria) this;
        }

        public Criteria andMInoutLineIdNotEqualTo(Integer value) {
            addCriterion("M_INOUT_LINE_ID <>", value, "mInoutLineId");
            return (Criteria) this;
        }

        public Criteria andMInoutLineIdGreaterThan(Integer value) {
            addCriterion("M_INOUT_LINE_ID >", value, "mInoutLineId");
            return (Criteria) this;
        }

        public Criteria andMInoutLineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("M_INOUT_LINE_ID >=", value, "mInoutLineId");
            return (Criteria) this;
        }

        public Criteria andMInoutLineIdLessThan(Integer value) {
            addCriterion("M_INOUT_LINE_ID <", value, "mInoutLineId");
            return (Criteria) this;
        }

        public Criteria andMInoutLineIdLessThanOrEqualTo(Integer value) {
            addCriterion("M_INOUT_LINE_ID <=", value, "mInoutLineId");
            return (Criteria) this;
        }

        public Criteria andMInoutLineIdIn(List<Integer> values) {
            addCriterion("M_INOUT_LINE_ID in", values, "mInoutLineId");
            return (Criteria) this;
        }

        public Criteria andMInoutLineIdNotIn(List<Integer> values) {
            addCriterion("M_INOUT_LINE_ID not in", values, "mInoutLineId");
            return (Criteria) this;
        }

        public Criteria andMInoutLineIdBetween(Integer value1, Integer value2) {
            addCriterion("M_INOUT_LINE_ID between", value1, value2, "mInoutLineId");
            return (Criteria) this;
        }

        public Criteria andMInoutLineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("M_INOUT_LINE_ID not between", value1, value2, "mInoutLineId");
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

        public Criteria andCOrderLineIdIsNull() {
            addCriterion("C_ORDER_LINE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCOrderLineIdIsNotNull() {
            addCriterion("C_ORDER_LINE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCOrderLineIdEqualTo(Integer value) {
            addCriterion("C_ORDER_LINE_ID =", value, "cOrderLineId");
            return (Criteria) this;
        }

        public Criteria andCOrderLineIdNotEqualTo(Integer value) {
            addCriterion("C_ORDER_LINE_ID <>", value, "cOrderLineId");
            return (Criteria) this;
        }

        public Criteria andCOrderLineIdGreaterThan(Integer value) {
            addCriterion("C_ORDER_LINE_ID >", value, "cOrderLineId");
            return (Criteria) this;
        }

        public Criteria andCOrderLineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_ORDER_LINE_ID >=", value, "cOrderLineId");
            return (Criteria) this;
        }

        public Criteria andCOrderLineIdLessThan(Integer value) {
            addCriterion("C_ORDER_LINE_ID <", value, "cOrderLineId");
            return (Criteria) this;
        }

        public Criteria andCOrderLineIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_ORDER_LINE_ID <=", value, "cOrderLineId");
            return (Criteria) this;
        }

        public Criteria andCOrderLineIdIn(List<Integer> values) {
            addCriterion("C_ORDER_LINE_ID in", values, "cOrderLineId");
            return (Criteria) this;
        }

        public Criteria andCOrderLineIdNotIn(List<Integer> values) {
            addCriterion("C_ORDER_LINE_ID not in", values, "cOrderLineId");
            return (Criteria) this;
        }

        public Criteria andCOrderLineIdBetween(Integer value1, Integer value2) {
            addCriterion("C_ORDER_LINE_ID between", value1, value2, "cOrderLineId");
            return (Criteria) this;
        }

        public Criteria andCOrderLineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_ORDER_LINE_ID not between", value1, value2, "cOrderLineId");
            return (Criteria) this;
        }

        public Criteria andMMovementIdIsNull() {
            addCriterion("M_MOVEMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andMMovementIdIsNotNull() {
            addCriterion("M_MOVEMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMMovementIdEqualTo(Integer value) {
            addCriterion("M_MOVEMENT_ID =", value, "mMovementId");
            return (Criteria) this;
        }

        public Criteria andMMovementIdNotEqualTo(Integer value) {
            addCriterion("M_MOVEMENT_ID <>", value, "mMovementId");
            return (Criteria) this;
        }

        public Criteria andMMovementIdGreaterThan(Integer value) {
            addCriterion("M_MOVEMENT_ID >", value, "mMovementId");
            return (Criteria) this;
        }

        public Criteria andMMovementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("M_MOVEMENT_ID >=", value, "mMovementId");
            return (Criteria) this;
        }

        public Criteria andMMovementIdLessThan(Integer value) {
            addCriterion("M_MOVEMENT_ID <", value, "mMovementId");
            return (Criteria) this;
        }

        public Criteria andMMovementIdLessThanOrEqualTo(Integer value) {
            addCriterion("M_MOVEMENT_ID <=", value, "mMovementId");
            return (Criteria) this;
        }

        public Criteria andMMovementIdIn(List<Integer> values) {
            addCriterion("M_MOVEMENT_ID in", values, "mMovementId");
            return (Criteria) this;
        }

        public Criteria andMMovementIdNotIn(List<Integer> values) {
            addCriterion("M_MOVEMENT_ID not in", values, "mMovementId");
            return (Criteria) this;
        }

        public Criteria andMMovementIdBetween(Integer value1, Integer value2) {
            addCriterion("M_MOVEMENT_ID between", value1, value2, "mMovementId");
            return (Criteria) this;
        }

        public Criteria andMMovementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("M_MOVEMENT_ID not between", value1, value2, "mMovementId");
            return (Criteria) this;
        }

        public Criteria andMMovementLineIdIsNull() {
            addCriterion("M_MOVEMENT_LINE_ID is null");
            return (Criteria) this;
        }

        public Criteria andMMovementLineIdIsNotNull() {
            addCriterion("M_MOVEMENT_LINE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMMovementLineIdEqualTo(Integer value) {
            addCriterion("M_MOVEMENT_LINE_ID =", value, "mMovementLineId");
            return (Criteria) this;
        }

        public Criteria andMMovementLineIdNotEqualTo(Integer value) {
            addCriterion("M_MOVEMENT_LINE_ID <>", value, "mMovementLineId");
            return (Criteria) this;
        }

        public Criteria andMMovementLineIdGreaterThan(Integer value) {
            addCriterion("M_MOVEMENT_LINE_ID >", value, "mMovementLineId");
            return (Criteria) this;
        }

        public Criteria andMMovementLineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("M_MOVEMENT_LINE_ID >=", value, "mMovementLineId");
            return (Criteria) this;
        }

        public Criteria andMMovementLineIdLessThan(Integer value) {
            addCriterion("M_MOVEMENT_LINE_ID <", value, "mMovementLineId");
            return (Criteria) this;
        }

        public Criteria andMMovementLineIdLessThanOrEqualTo(Integer value) {
            addCriterion("M_MOVEMENT_LINE_ID <=", value, "mMovementLineId");
            return (Criteria) this;
        }

        public Criteria andMMovementLineIdIn(List<Integer> values) {
            addCriterion("M_MOVEMENT_LINE_ID in", values, "mMovementLineId");
            return (Criteria) this;
        }

        public Criteria andMMovementLineIdNotIn(List<Integer> values) {
            addCriterion("M_MOVEMENT_LINE_ID not in", values, "mMovementLineId");
            return (Criteria) this;
        }

        public Criteria andMMovementLineIdBetween(Integer value1, Integer value2) {
            addCriterion("M_MOVEMENT_LINE_ID between", value1, value2, "mMovementLineId");
            return (Criteria) this;
        }

        public Criteria andMMovementLineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("M_MOVEMENT_LINE_ID not between", value1, value2, "mMovementLineId");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNull() {
            addCriterion("DATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNotNull() {
            addCriterion("DATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDateTimeEqualTo(Date value) {
            addCriterion("DATE_TIME =", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotEqualTo(Date value) {
            addCriterion("DATE_TIME <>", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThan(Date value) {
            addCriterion("DATE_TIME >", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_TIME >=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThan(Date value) {
            addCriterion("DATE_TIME <", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("DATE_TIME <=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeIn(List<Date> values) {
            addCriterion("DATE_TIME in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotIn(List<Date> values) {
            addCriterion("DATE_TIME not in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeBetween(Date value1, Date value2) {
            addCriterion("DATE_TIME between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("DATE_TIME not between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andSettleementIdIsNull() {
            addCriterion("SETTLEEMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSettleementIdIsNotNull() {
            addCriterion("SETTLEEMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSettleementIdEqualTo(String value) {
            addCriterion("SETTLEEMENT_ID =", value, "settleementId");
            return (Criteria) this;
        }

        public Criteria andSettleementIdNotEqualTo(String value) {
            addCriterion("SETTLEEMENT_ID <>", value, "settleementId");
            return (Criteria) this;
        }

        public Criteria andSettleementIdGreaterThan(String value) {
            addCriterion("SETTLEEMENT_ID >", value, "settleementId");
            return (Criteria) this;
        }

        public Criteria andSettleementIdGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEEMENT_ID >=", value, "settleementId");
            return (Criteria) this;
        }

        public Criteria andSettleementIdLessThan(String value) {
            addCriterion("SETTLEEMENT_ID <", value, "settleementId");
            return (Criteria) this;
        }

        public Criteria andSettleementIdLessThanOrEqualTo(String value) {
            addCriterion("SETTLEEMENT_ID <=", value, "settleementId");
            return (Criteria) this;
        }

        public Criteria andSettleementIdLike(String value) {
            addCriterion("SETTLEEMENT_ID like", value, "settleementId");
            return (Criteria) this;
        }

        public Criteria andSettleementIdNotLike(String value) {
            addCriterion("SETTLEEMENT_ID not like", value, "settleementId");
            return (Criteria) this;
        }

        public Criteria andSettleementIdIn(List<String> values) {
            addCriterion("SETTLEEMENT_ID in", values, "settleementId");
            return (Criteria) this;
        }

        public Criteria andSettleementIdNotIn(List<String> values) {
            addCriterion("SETTLEEMENT_ID not in", values, "settleementId");
            return (Criteria) this;
        }

        public Criteria andSettleementIdBetween(String value1, String value2) {
            addCriterion("SETTLEEMENT_ID between", value1, value2, "settleementId");
            return (Criteria) this;
        }

        public Criteria andSettleementIdNotBetween(String value1, String value2) {
            addCriterion("SETTLEEMENT_ID not between", value1, value2, "settleementId");
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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
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

        public Criteria andQuantityIsNull() {
            addCriterion("QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(BigDecimal value) {
            addCriterion("QUANTITY =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(BigDecimal value) {
            addCriterion("QUANTITY <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(BigDecimal value) {
            addCriterion("QUANTITY >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(BigDecimal value) {
            addCriterion("QUANTITY <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<BigDecimal> values) {
            addCriterion("QUANTITY in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<BigDecimal> values) {
            addCriterion("QUANTITY not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andMarketplaceIsNull() {
            addCriterion("MARKETPLACE is null");
            return (Criteria) this;
        }

        public Criteria andMarketplaceIsNotNull() {
            addCriterion("MARKETPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andMarketplaceEqualTo(String value) {
            addCriterion("MARKETPLACE =", value, "marketplace");
            return (Criteria) this;
        }

        public Criteria andMarketplaceNotEqualTo(String value) {
            addCriterion("MARKETPLACE <>", value, "marketplace");
            return (Criteria) this;
        }

        public Criteria andMarketplaceGreaterThan(String value) {
            addCriterion("MARKETPLACE >", value, "marketplace");
            return (Criteria) this;
        }

        public Criteria andMarketplaceGreaterThanOrEqualTo(String value) {
            addCriterion("MARKETPLACE >=", value, "marketplace");
            return (Criteria) this;
        }

        public Criteria andMarketplaceLessThan(String value) {
            addCriterion("MARKETPLACE <", value, "marketplace");
            return (Criteria) this;
        }

        public Criteria andMarketplaceLessThanOrEqualTo(String value) {
            addCriterion("MARKETPLACE <=", value, "marketplace");
            return (Criteria) this;
        }

        public Criteria andMarketplaceLike(String value) {
            addCriterion("MARKETPLACE like", value, "marketplace");
            return (Criteria) this;
        }

        public Criteria andMarketplaceNotLike(String value) {
            addCriterion("MARKETPLACE not like", value, "marketplace");
            return (Criteria) this;
        }

        public Criteria andMarketplaceIn(List<String> values) {
            addCriterion("MARKETPLACE in", values, "marketplace");
            return (Criteria) this;
        }

        public Criteria andMarketplaceNotIn(List<String> values) {
            addCriterion("MARKETPLACE not in", values, "marketplace");
            return (Criteria) this;
        }

        public Criteria andMarketplaceBetween(String value1, String value2) {
            addCriterion("MARKETPLACE between", value1, value2, "marketplace");
            return (Criteria) this;
        }

        public Criteria andMarketplaceNotBetween(String value1, String value2) {
            addCriterion("MARKETPLACE not between", value1, value2, "marketplace");
            return (Criteria) this;
        }

        public Criteria andFulfillmentIsNull() {
            addCriterion("FULFILLMENT is null");
            return (Criteria) this;
        }

        public Criteria andFulfillmentIsNotNull() {
            addCriterion("FULFILLMENT is not null");
            return (Criteria) this;
        }

        public Criteria andFulfillmentEqualTo(String value) {
            addCriterion("FULFILLMENT =", value, "fulfillment");
            return (Criteria) this;
        }

        public Criteria andFulfillmentNotEqualTo(String value) {
            addCriterion("FULFILLMENT <>", value, "fulfillment");
            return (Criteria) this;
        }

        public Criteria andFulfillmentGreaterThan(String value) {
            addCriterion("FULFILLMENT >", value, "fulfillment");
            return (Criteria) this;
        }

        public Criteria andFulfillmentGreaterThanOrEqualTo(String value) {
            addCriterion("FULFILLMENT >=", value, "fulfillment");
            return (Criteria) this;
        }

        public Criteria andFulfillmentLessThan(String value) {
            addCriterion("FULFILLMENT <", value, "fulfillment");
            return (Criteria) this;
        }

        public Criteria andFulfillmentLessThanOrEqualTo(String value) {
            addCriterion("FULFILLMENT <=", value, "fulfillment");
            return (Criteria) this;
        }

        public Criteria andFulfillmentLike(String value) {
            addCriterion("FULFILLMENT like", value, "fulfillment");
            return (Criteria) this;
        }

        public Criteria andFulfillmentNotLike(String value) {
            addCriterion("FULFILLMENT not like", value, "fulfillment");
            return (Criteria) this;
        }

        public Criteria andFulfillmentIn(List<String> values) {
            addCriterion("FULFILLMENT in", values, "fulfillment");
            return (Criteria) this;
        }

        public Criteria andFulfillmentNotIn(List<String> values) {
            addCriterion("FULFILLMENT not in", values, "fulfillment");
            return (Criteria) this;
        }

        public Criteria andFulfillmentBetween(String value1, String value2) {
            addCriterion("FULFILLMENT between", value1, value2, "fulfillment");
            return (Criteria) this;
        }

        public Criteria andFulfillmentNotBetween(String value1, String value2) {
            addCriterion("FULFILLMENT not between", value1, value2, "fulfillment");
            return (Criteria) this;
        }

        public Criteria andOrderCityIsNull() {
            addCriterion("ORDER_CITY is null");
            return (Criteria) this;
        }

        public Criteria andOrderCityIsNotNull() {
            addCriterion("ORDER_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCityEqualTo(String value) {
            addCriterion("ORDER_CITY =", value, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityNotEqualTo(String value) {
            addCriterion("ORDER_CITY <>", value, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityGreaterThan(String value) {
            addCriterion("ORDER_CITY >", value, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CITY >=", value, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityLessThan(String value) {
            addCriterion("ORDER_CITY <", value, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CITY <=", value, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityLike(String value) {
            addCriterion("ORDER_CITY like", value, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityNotLike(String value) {
            addCriterion("ORDER_CITY not like", value, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityIn(List<String> values) {
            addCriterion("ORDER_CITY in", values, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityNotIn(List<String> values) {
            addCriterion("ORDER_CITY not in", values, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityBetween(String value1, String value2) {
            addCriterion("ORDER_CITY between", value1, value2, "orderCity");
            return (Criteria) this;
        }

        public Criteria andOrderCityNotBetween(String value1, String value2) {
            addCriterion("ORDER_CITY not between", value1, value2, "orderCity");
            return (Criteria) this;
        }

        public Criteria andProductSalesIsNull() {
            addCriterion("PRODUCT_SALES is null");
            return (Criteria) this;
        }

        public Criteria andProductSalesIsNotNull() {
            addCriterion("PRODUCT_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andProductSalesEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_SALES =", value, "productSales");
            return (Criteria) this;
        }

        public Criteria andProductSalesNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_SALES <>", value, "productSales");
            return (Criteria) this;
        }

        public Criteria andProductSalesGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_SALES >", value, "productSales");
            return (Criteria) this;
        }

        public Criteria andProductSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_SALES >=", value, "productSales");
            return (Criteria) this;
        }

        public Criteria andProductSalesLessThan(BigDecimal value) {
            addCriterion("PRODUCT_SALES <", value, "productSales");
            return (Criteria) this;
        }

        public Criteria andProductSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_SALES <=", value, "productSales");
            return (Criteria) this;
        }

        public Criteria andProductSalesIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_SALES in", values, "productSales");
            return (Criteria) this;
        }

        public Criteria andProductSalesNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_SALES not in", values, "productSales");
            return (Criteria) this;
        }

        public Criteria andProductSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_SALES between", value1, value2, "productSales");
            return (Criteria) this;
        }

        public Criteria andProductSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_SALES not between", value1, value2, "productSales");
            return (Criteria) this;
        }

        public Criteria andShippingCreditsIsNull() {
            addCriterion("SHIPPING_CREDITS is null");
            return (Criteria) this;
        }

        public Criteria andShippingCreditsIsNotNull() {
            addCriterion("SHIPPING_CREDITS is not null");
            return (Criteria) this;
        }

        public Criteria andShippingCreditsEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_CREDITS =", value, "shippingCredits");
            return (Criteria) this;
        }

        public Criteria andShippingCreditsNotEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_CREDITS <>", value, "shippingCredits");
            return (Criteria) this;
        }

        public Criteria andShippingCreditsGreaterThan(BigDecimal value) {
            addCriterion("SHIPPING_CREDITS >", value, "shippingCredits");
            return (Criteria) this;
        }

        public Criteria andShippingCreditsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_CREDITS >=", value, "shippingCredits");
            return (Criteria) this;
        }

        public Criteria andShippingCreditsLessThan(BigDecimal value) {
            addCriterion("SHIPPING_CREDITS <", value, "shippingCredits");
            return (Criteria) this;
        }

        public Criteria andShippingCreditsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIPPING_CREDITS <=", value, "shippingCredits");
            return (Criteria) this;
        }

        public Criteria andShippingCreditsIn(List<BigDecimal> values) {
            addCriterion("SHIPPING_CREDITS in", values, "shippingCredits");
            return (Criteria) this;
        }

        public Criteria andShippingCreditsNotIn(List<BigDecimal> values) {
            addCriterion("SHIPPING_CREDITS not in", values, "shippingCredits");
            return (Criteria) this;
        }

        public Criteria andShippingCreditsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIPPING_CREDITS between", value1, value2, "shippingCredits");
            return (Criteria) this;
        }

        public Criteria andShippingCreditsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIPPING_CREDITS not between", value1, value2, "shippingCredits");
            return (Criteria) this;
        }

        public Criteria andGiftWrapCreditsIsNull() {
            addCriterion("GIFT_WRAP_CREDITS is null");
            return (Criteria) this;
        }

        public Criteria andGiftWrapCreditsIsNotNull() {
            addCriterion("GIFT_WRAP_CREDITS is not null");
            return (Criteria) this;
        }

        public Criteria andGiftWrapCreditsEqualTo(BigDecimal value) {
            addCriterion("GIFT_WRAP_CREDITS =", value, "giftWrapCredits");
            return (Criteria) this;
        }

        public Criteria andGiftWrapCreditsNotEqualTo(BigDecimal value) {
            addCriterion("GIFT_WRAP_CREDITS <>", value, "giftWrapCredits");
            return (Criteria) this;
        }

        public Criteria andGiftWrapCreditsGreaterThan(BigDecimal value) {
            addCriterion("GIFT_WRAP_CREDITS >", value, "giftWrapCredits");
            return (Criteria) this;
        }

        public Criteria andGiftWrapCreditsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GIFT_WRAP_CREDITS >=", value, "giftWrapCredits");
            return (Criteria) this;
        }

        public Criteria andGiftWrapCreditsLessThan(BigDecimal value) {
            addCriterion("GIFT_WRAP_CREDITS <", value, "giftWrapCredits");
            return (Criteria) this;
        }

        public Criteria andGiftWrapCreditsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GIFT_WRAP_CREDITS <=", value, "giftWrapCredits");
            return (Criteria) this;
        }

        public Criteria andGiftWrapCreditsIn(List<BigDecimal> values) {
            addCriterion("GIFT_WRAP_CREDITS in", values, "giftWrapCredits");
            return (Criteria) this;
        }

        public Criteria andGiftWrapCreditsNotIn(List<BigDecimal> values) {
            addCriterion("GIFT_WRAP_CREDITS not in", values, "giftWrapCredits");
            return (Criteria) this;
        }

        public Criteria andGiftWrapCreditsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GIFT_WRAP_CREDITS between", value1, value2, "giftWrapCredits");
            return (Criteria) this;
        }

        public Criteria andGiftWrapCreditsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GIFT_WRAP_CREDITS not between", value1, value2, "giftWrapCredits");
            return (Criteria) this;
        }

        public Criteria andPromotionalRebatesIsNull() {
            addCriterion("PROMOTIONAL_REBATES is null");
            return (Criteria) this;
        }

        public Criteria andPromotionalRebatesIsNotNull() {
            addCriterion("PROMOTIONAL_REBATES is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionalRebatesEqualTo(BigDecimal value) {
            addCriterion("PROMOTIONAL_REBATES =", value, "promotionalRebates");
            return (Criteria) this;
        }

        public Criteria andPromotionalRebatesNotEqualTo(BigDecimal value) {
            addCriterion("PROMOTIONAL_REBATES <>", value, "promotionalRebates");
            return (Criteria) this;
        }

        public Criteria andPromotionalRebatesGreaterThan(BigDecimal value) {
            addCriterion("PROMOTIONAL_REBATES >", value, "promotionalRebates");
            return (Criteria) this;
        }

        public Criteria andPromotionalRebatesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMOTIONAL_REBATES >=", value, "promotionalRebates");
            return (Criteria) this;
        }

        public Criteria andPromotionalRebatesLessThan(BigDecimal value) {
            addCriterion("PROMOTIONAL_REBATES <", value, "promotionalRebates");
            return (Criteria) this;
        }

        public Criteria andPromotionalRebatesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMOTIONAL_REBATES <=", value, "promotionalRebates");
            return (Criteria) this;
        }

        public Criteria andPromotionalRebatesIn(List<BigDecimal> values) {
            addCriterion("PROMOTIONAL_REBATES in", values, "promotionalRebates");
            return (Criteria) this;
        }

        public Criteria andPromotionalRebatesNotIn(List<BigDecimal> values) {
            addCriterion("PROMOTIONAL_REBATES not in", values, "promotionalRebates");
            return (Criteria) this;
        }

        public Criteria andPromotionalRebatesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMOTIONAL_REBATES between", value1, value2, "promotionalRebates");
            return (Criteria) this;
        }

        public Criteria andPromotionalRebatesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMOTIONAL_REBATES not between", value1, value2, "promotionalRebates");
            return (Criteria) this;
        }

        public Criteria andSalesTaxCollectdIsNull() {
            addCriterion("SALES_TAX_COLLECTD is null");
            return (Criteria) this;
        }

        public Criteria andSalesTaxCollectdIsNotNull() {
            addCriterion("SALES_TAX_COLLECTD is not null");
            return (Criteria) this;
        }

        public Criteria andSalesTaxCollectdEqualTo(BigDecimal value) {
            addCriterion("SALES_TAX_COLLECTD =", value, "salesTaxCollectd");
            return (Criteria) this;
        }

        public Criteria andSalesTaxCollectdNotEqualTo(BigDecimal value) {
            addCriterion("SALES_TAX_COLLECTD <>", value, "salesTaxCollectd");
            return (Criteria) this;
        }

        public Criteria andSalesTaxCollectdGreaterThan(BigDecimal value) {
            addCriterion("SALES_TAX_COLLECTD >", value, "salesTaxCollectd");
            return (Criteria) this;
        }

        public Criteria andSalesTaxCollectdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SALES_TAX_COLLECTD >=", value, "salesTaxCollectd");
            return (Criteria) this;
        }

        public Criteria andSalesTaxCollectdLessThan(BigDecimal value) {
            addCriterion("SALES_TAX_COLLECTD <", value, "salesTaxCollectd");
            return (Criteria) this;
        }

        public Criteria andSalesTaxCollectdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SALES_TAX_COLLECTD <=", value, "salesTaxCollectd");
            return (Criteria) this;
        }

        public Criteria andSalesTaxCollectdIn(List<BigDecimal> values) {
            addCriterion("SALES_TAX_COLLECTD in", values, "salesTaxCollectd");
            return (Criteria) this;
        }

        public Criteria andSalesTaxCollectdNotIn(List<BigDecimal> values) {
            addCriterion("SALES_TAX_COLLECTD not in", values, "salesTaxCollectd");
            return (Criteria) this;
        }

        public Criteria andSalesTaxCollectdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALES_TAX_COLLECTD between", value1, value2, "salesTaxCollectd");
            return (Criteria) this;
        }

        public Criteria andSalesTaxCollectdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALES_TAX_COLLECTD not between", value1, value2, "salesTaxCollectd");
            return (Criteria) this;
        }

        public Criteria andSellingFeesIsNull() {
            addCriterion("SELLING_FEES is null");
            return (Criteria) this;
        }

        public Criteria andSellingFeesIsNotNull() {
            addCriterion("SELLING_FEES is not null");
            return (Criteria) this;
        }

        public Criteria andSellingFeesEqualTo(BigDecimal value) {
            addCriterion("SELLING_FEES =", value, "sellingFees");
            return (Criteria) this;
        }

        public Criteria andSellingFeesNotEqualTo(BigDecimal value) {
            addCriterion("SELLING_FEES <>", value, "sellingFees");
            return (Criteria) this;
        }

        public Criteria andSellingFeesGreaterThan(BigDecimal value) {
            addCriterion("SELLING_FEES >", value, "sellingFees");
            return (Criteria) this;
        }

        public Criteria andSellingFeesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SELLING_FEES >=", value, "sellingFees");
            return (Criteria) this;
        }

        public Criteria andSellingFeesLessThan(BigDecimal value) {
            addCriterion("SELLING_FEES <", value, "sellingFees");
            return (Criteria) this;
        }

        public Criteria andSellingFeesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SELLING_FEES <=", value, "sellingFees");
            return (Criteria) this;
        }

        public Criteria andSellingFeesIn(List<BigDecimal> values) {
            addCriterion("SELLING_FEES in", values, "sellingFees");
            return (Criteria) this;
        }

        public Criteria andSellingFeesNotIn(List<BigDecimal> values) {
            addCriterion("SELLING_FEES not in", values, "sellingFees");
            return (Criteria) this;
        }

        public Criteria andSellingFeesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SELLING_FEES between", value1, value2, "sellingFees");
            return (Criteria) this;
        }

        public Criteria andSellingFeesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SELLING_FEES not between", value1, value2, "sellingFees");
            return (Criteria) this;
        }

        public Criteria andFbaFeesIsNull() {
            addCriterion("FBA_FEES is null");
            return (Criteria) this;
        }

        public Criteria andFbaFeesIsNotNull() {
            addCriterion("FBA_FEES is not null");
            return (Criteria) this;
        }

        public Criteria andFbaFeesEqualTo(BigDecimal value) {
            addCriterion("FBA_FEES =", value, "fbaFees");
            return (Criteria) this;
        }

        public Criteria andFbaFeesNotEqualTo(BigDecimal value) {
            addCriterion("FBA_FEES <>", value, "fbaFees");
            return (Criteria) this;
        }

        public Criteria andFbaFeesGreaterThan(BigDecimal value) {
            addCriterion("FBA_FEES >", value, "fbaFees");
            return (Criteria) this;
        }

        public Criteria andFbaFeesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FBA_FEES >=", value, "fbaFees");
            return (Criteria) this;
        }

        public Criteria andFbaFeesLessThan(BigDecimal value) {
            addCriterion("FBA_FEES <", value, "fbaFees");
            return (Criteria) this;
        }

        public Criteria andFbaFeesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FBA_FEES <=", value, "fbaFees");
            return (Criteria) this;
        }

        public Criteria andFbaFeesIn(List<BigDecimal> values) {
            addCriterion("FBA_FEES in", values, "fbaFees");
            return (Criteria) this;
        }

        public Criteria andFbaFeesNotIn(List<BigDecimal> values) {
            addCriterion("FBA_FEES not in", values, "fbaFees");
            return (Criteria) this;
        }

        public Criteria andFbaFeesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBA_FEES between", value1, value2, "fbaFees");
            return (Criteria) this;
        }

        public Criteria andFbaFeesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBA_FEES not between", value1, value2, "fbaFees");
            return (Criteria) this;
        }

        public Criteria andOtherTransactionFeesIsNull() {
            addCriterion("OTHER_TRANSACTION_FEES is null");
            return (Criteria) this;
        }

        public Criteria andOtherTransactionFeesIsNotNull() {
            addCriterion("OTHER_TRANSACTION_FEES is not null");
            return (Criteria) this;
        }

        public Criteria andOtherTransactionFeesEqualTo(BigDecimal value) {
            addCriterion("OTHER_TRANSACTION_FEES =", value, "otherTransactionFees");
            return (Criteria) this;
        }

        public Criteria andOtherTransactionFeesNotEqualTo(BigDecimal value) {
            addCriterion("OTHER_TRANSACTION_FEES <>", value, "otherTransactionFees");
            return (Criteria) this;
        }

        public Criteria andOtherTransactionFeesGreaterThan(BigDecimal value) {
            addCriterion("OTHER_TRANSACTION_FEES >", value, "otherTransactionFees");
            return (Criteria) this;
        }

        public Criteria andOtherTransactionFeesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHER_TRANSACTION_FEES >=", value, "otherTransactionFees");
            return (Criteria) this;
        }

        public Criteria andOtherTransactionFeesLessThan(BigDecimal value) {
            addCriterion("OTHER_TRANSACTION_FEES <", value, "otherTransactionFees");
            return (Criteria) this;
        }

        public Criteria andOtherTransactionFeesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHER_TRANSACTION_FEES <=", value, "otherTransactionFees");
            return (Criteria) this;
        }

        public Criteria andOtherTransactionFeesIn(List<BigDecimal> values) {
            addCriterion("OTHER_TRANSACTION_FEES in", values, "otherTransactionFees");
            return (Criteria) this;
        }

        public Criteria andOtherTransactionFeesNotIn(List<BigDecimal> values) {
            addCriterion("OTHER_TRANSACTION_FEES not in", values, "otherTransactionFees");
            return (Criteria) this;
        }

        public Criteria andOtherTransactionFeesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHER_TRANSACTION_FEES between", value1, value2, "otherTransactionFees");
            return (Criteria) this;
        }

        public Criteria andOtherTransactionFeesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHER_TRANSACTION_FEES not between", value1, value2, "otherTransactionFees");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("OTHER is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(BigDecimal value) {
            addCriterion("OTHER =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(BigDecimal value) {
            addCriterion("OTHER <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(BigDecimal value) {
            addCriterion("OTHER >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHER >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(BigDecimal value) {
            addCriterion("OTHER <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHER <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<BigDecimal> values) {
            addCriterion("OTHER in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<BigDecimal> values) {
            addCriterion("OTHER not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHER between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHER not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(BigDecimal value) {
            addCriterion("TOTAL =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(BigDecimal value) {
            addCriterion("TOTAL >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(BigDecimal value) {
            addCriterion("TOTAL <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<BigDecimal> values) {
            addCriterion("TOTAL in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andImportDescriptionIsNull() {
            addCriterion("IMPORT_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andImportDescriptionIsNotNull() {
            addCriterion("IMPORT_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andImportDescriptionEqualTo(String value) {
            addCriterion("IMPORT_DESCRIPTION =", value, "importDescription");
            return (Criteria) this;
        }

        public Criteria andImportDescriptionNotEqualTo(String value) {
            addCriterion("IMPORT_DESCRIPTION <>", value, "importDescription");
            return (Criteria) this;
        }

        public Criteria andImportDescriptionGreaterThan(String value) {
            addCriterion("IMPORT_DESCRIPTION >", value, "importDescription");
            return (Criteria) this;
        }

        public Criteria andImportDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("IMPORT_DESCRIPTION >=", value, "importDescription");
            return (Criteria) this;
        }

        public Criteria andImportDescriptionLessThan(String value) {
            addCriterion("IMPORT_DESCRIPTION <", value, "importDescription");
            return (Criteria) this;
        }

        public Criteria andImportDescriptionLessThanOrEqualTo(String value) {
            addCriterion("IMPORT_DESCRIPTION <=", value, "importDescription");
            return (Criteria) this;
        }

        public Criteria andImportDescriptionLike(String value) {
            addCriterion("IMPORT_DESCRIPTION like", value, "importDescription");
            return (Criteria) this;
        }

        public Criteria andImportDescriptionNotLike(String value) {
            addCriterion("IMPORT_DESCRIPTION not like", value, "importDescription");
            return (Criteria) this;
        }

        public Criteria andImportDescriptionIn(List<String> values) {
            addCriterion("IMPORT_DESCRIPTION in", values, "importDescription");
            return (Criteria) this;
        }

        public Criteria andImportDescriptionNotIn(List<String> values) {
            addCriterion("IMPORT_DESCRIPTION not in", values, "importDescription");
            return (Criteria) this;
        }

        public Criteria andImportDescriptionBetween(String value1, String value2) {
            addCriterion("IMPORT_DESCRIPTION between", value1, value2, "importDescription");
            return (Criteria) this;
        }

        public Criteria andImportDescriptionNotBetween(String value1, String value2) {
            addCriterion("IMPORT_DESCRIPTION not between", value1, value2, "importDescription");
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

        public Criteria andOrderPostalIsNull() {
            addCriterion("ORDER_POSTAL is null");
            return (Criteria) this;
        }

        public Criteria andOrderPostalIsNotNull() {
            addCriterion("ORDER_POSTAL is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPostalEqualTo(String value) {
            addCriterion("ORDER_POSTAL =", value, "orderPostal");
            return (Criteria) this;
        }

        public Criteria andOrderPostalNotEqualTo(String value) {
            addCriterion("ORDER_POSTAL <>", value, "orderPostal");
            return (Criteria) this;
        }

        public Criteria andOrderPostalGreaterThan(String value) {
            addCriterion("ORDER_POSTAL >", value, "orderPostal");
            return (Criteria) this;
        }

        public Criteria andOrderPostalGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_POSTAL >=", value, "orderPostal");
            return (Criteria) this;
        }

        public Criteria andOrderPostalLessThan(String value) {
            addCriterion("ORDER_POSTAL <", value, "orderPostal");
            return (Criteria) this;
        }

        public Criteria andOrderPostalLessThanOrEqualTo(String value) {
            addCriterion("ORDER_POSTAL <=", value, "orderPostal");
            return (Criteria) this;
        }

        public Criteria andOrderPostalLike(String value) {
            addCriterion("ORDER_POSTAL like", value, "orderPostal");
            return (Criteria) this;
        }

        public Criteria andOrderPostalNotLike(String value) {
            addCriterion("ORDER_POSTAL not like", value, "orderPostal");
            return (Criteria) this;
        }

        public Criteria andOrderPostalIn(List<String> values) {
            addCriterion("ORDER_POSTAL in", values, "orderPostal");
            return (Criteria) this;
        }

        public Criteria andOrderPostalNotIn(List<String> values) {
            addCriterion("ORDER_POSTAL not in", values, "orderPostal");
            return (Criteria) this;
        }

        public Criteria andOrderPostalBetween(String value1, String value2) {
            addCriterion("ORDER_POSTAL between", value1, value2, "orderPostal");
            return (Criteria) this;
        }

        public Criteria andOrderPostalNotBetween(String value1, String value2) {
            addCriterion("ORDER_POSTAL not between", value1, value2, "orderPostal");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("ORDER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("ORDER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(String value) {
            addCriterion("ORDER_STATE =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(String value) {
            addCriterion("ORDER_STATE <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(String value) {
            addCriterion("ORDER_STATE >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_STATE >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(String value) {
            addCriterion("ORDER_STATE <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(String value) {
            addCriterion("ORDER_STATE <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLike(String value) {
            addCriterion("ORDER_STATE like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotLike(String value) {
            addCriterion("ORDER_STATE not like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<String> values) {
            addCriterion("ORDER_STATE in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<String> values) {
            addCriterion("ORDER_STATE not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(String value1, String value2) {
            addCriterion("ORDER_STATE between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(String value1, String value2) {
            addCriterion("ORDER_STATE not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andSkuIsNull() {
            addCriterion("SKU is null");
            return (Criteria) this;
        }

        public Criteria andSkuIsNotNull() {
            addCriterion("SKU is not null");
            return (Criteria) this;
        }

        public Criteria andSkuEqualTo(String value) {
            addCriterion("SKU =", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotEqualTo(String value) {
            addCriterion("SKU <>", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThan(String value) {
            addCriterion("SKU >", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThanOrEqualTo(String value) {
            addCriterion("SKU >=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThan(String value) {
            addCriterion("SKU <", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThanOrEqualTo(String value) {
            addCriterion("SKU <=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLike(String value) {
            addCriterion("SKU like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotLike(String value) {
            addCriterion("SKU not like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuIn(List<String> values) {
            addCriterion("SKU in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotIn(List<String> values) {
            addCriterion("SKU not in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuBetween(String value1, String value2) {
            addCriterion("SKU between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotBetween(String value1, String value2) {
            addCriterion("SKU not between", value1, value2, "sku");
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