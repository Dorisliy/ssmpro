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

        public Criteria andAdClientIdIsNull() {
            addCriterion("ad_client_id is null");
            return (Criteria) this;
        }

        public Criteria andAdClientIdIsNotNull() {
            addCriterion("ad_client_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdClientIdEqualTo(BigDecimal value) {
            addCriterion("ad_client_id =", value, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdNotEqualTo(BigDecimal value) {
            addCriterion("ad_client_id <>", value, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdGreaterThan(BigDecimal value) {
            addCriterion("ad_client_id >", value, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ad_client_id >=", value, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdLessThan(BigDecimal value) {
            addCriterion("ad_client_id <", value, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ad_client_id <=", value, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdIn(List<BigDecimal> values) {
            addCriterion("ad_client_id in", values, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdNotIn(List<BigDecimal> values) {
            addCriterion("ad_client_id not in", values, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ad_client_id between", value1, value2, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ad_client_id not between", value1, value2, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdIsNull() {
            addCriterion("ad_org_id is null");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdIsNotNull() {
            addCriterion("ad_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdEqualTo(BigDecimal value) {
            addCriterion("ad_org_id =", value, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdNotEqualTo(BigDecimal value) {
            addCriterion("ad_org_id <>", value, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdGreaterThan(BigDecimal value) {
            addCriterion("ad_org_id >", value, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ad_org_id >=", value, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdLessThan(BigDecimal value) {
            addCriterion("ad_org_id <", value, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ad_org_id <=", value, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdIn(List<BigDecimal> values) {
            addCriterion("ad_org_id in", values, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdNotIn(List<BigDecimal> values) {
            addCriterion("ad_org_id not in", values, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ad_org_id between", value1, value2, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ad_org_id not between", value1, value2, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNull() {
            addCriterion("isactive is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNotNull() {
            addCriterion("isactive is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveEqualTo(String value) {
            addCriterion("isactive =", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotEqualTo(String value) {
            addCriterion("isactive <>", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThan(String value) {
            addCriterion("isactive >", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThanOrEqualTo(String value) {
            addCriterion("isactive >=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThan(String value) {
            addCriterion("isactive <", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThanOrEqualTo(String value) {
            addCriterion("isactive <=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLike(String value) {
            addCriterion("isactive like", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotLike(String value) {
            addCriterion("isactive not like", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveIn(List<String> values) {
            addCriterion("isactive in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotIn(List<String> values) {
            addCriterion("isactive not in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveBetween(String value1, String value2) {
            addCriterion("isactive between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotBetween(String value1, String value2) {
            addCriterion("isactive not between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNull() {
            addCriterion("createdby is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNotNull() {
            addCriterion("createdby is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyEqualTo(BigDecimal value) {
            addCriterion("createdby =", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotEqualTo(BigDecimal value) {
            addCriterion("createdby <>", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThan(BigDecimal value) {
            addCriterion("createdby >", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("createdby >=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThan(BigDecimal value) {
            addCriterion("createdby <", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("createdby <=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIn(List<BigDecimal> values) {
            addCriterion("createdby in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotIn(List<BigDecimal> values) {
            addCriterion("createdby not in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("createdby between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("createdby not between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyIsNull() {
            addCriterion("updatedby is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyIsNotNull() {
            addCriterion("updatedby is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyEqualTo(BigDecimal value) {
            addCriterion("updatedby =", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyNotEqualTo(BigDecimal value) {
            addCriterion("updatedby <>", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyGreaterThan(BigDecimal value) {
            addCriterion("updatedby >", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("updatedby >=", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyLessThan(BigDecimal value) {
            addCriterion("updatedby <", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("updatedby <=", value, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyIn(List<BigDecimal> values) {
            addCriterion("updatedby in", values, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyNotIn(List<BigDecimal> values) {
            addCriterion("updatedby not in", values, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("updatedby between", value1, value2, "updatedby");
            return (Criteria) this;
        }

        public Criteria andUpdatedbyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("updatedby not between", value1, value2, "updatedby");
            return (Criteria) this;
        }

        public Criteria andCOrderIdIsNull() {
            addCriterion("c_order_id is null");
            return (Criteria) this;
        }

        public Criteria andCOrderIdIsNotNull() {
            addCriterion("c_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andCOrderIdEqualTo(BigDecimal value) {
            addCriterion("c_order_id =", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdNotEqualTo(BigDecimal value) {
            addCriterion("c_order_id <>", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdGreaterThan(BigDecimal value) {
            addCriterion("c_order_id >", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c_order_id >=", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdLessThan(BigDecimal value) {
            addCriterion("c_order_id <", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("c_order_id <=", value, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdIn(List<BigDecimal> values) {
            addCriterion("c_order_id in", values, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdNotIn(List<BigDecimal> values) {
            addCriterion("c_order_id not in", values, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_order_id between", value1, value2, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andCOrderIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_order_id not between", value1, value2, "cOrderId");
            return (Criteria) this;
        }

        public Criteria andLineIsNull() {
            addCriterion("line is null");
            return (Criteria) this;
        }

        public Criteria andLineIsNotNull() {
            addCriterion("line is not null");
            return (Criteria) this;
        }

        public Criteria andLineEqualTo(BigDecimal value) {
            addCriterion("line =", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotEqualTo(BigDecimal value) {
            addCriterion("line <>", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineGreaterThan(BigDecimal value) {
            addCriterion("line >", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("line >=", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineLessThan(BigDecimal value) {
            addCriterion("line <", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("line <=", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineIn(List<BigDecimal> values) {
            addCriterion("line in", values, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotIn(List<BigDecimal> values) {
            addCriterion("line not in", values, "line");
            return (Criteria) this;
        }

        public Criteria andLineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("line between", value1, value2, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("line not between", value1, value2, "line");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdIsNull() {
            addCriterion("c_bpartner_id is null");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdIsNotNull() {
            addCriterion("c_bpartner_id is not null");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdEqualTo(BigDecimal value) {
            addCriterion("c_bpartner_id =", value, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdNotEqualTo(BigDecimal value) {
            addCriterion("c_bpartner_id <>", value, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdGreaterThan(BigDecimal value) {
            addCriterion("c_bpartner_id >", value, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c_bpartner_id >=", value, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdLessThan(BigDecimal value) {
            addCriterion("c_bpartner_id <", value, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("c_bpartner_id <=", value, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdIn(List<BigDecimal> values) {
            addCriterion("c_bpartner_id in", values, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdNotIn(List<BigDecimal> values) {
            addCriterion("c_bpartner_id not in", values, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_bpartner_id between", value1, value2, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_bpartner_id not between", value1, value2, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdIsNull() {
            addCriterion("c_bpartner_location_id is null");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdIsNotNull() {
            addCriterion("c_bpartner_location_id is not null");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdEqualTo(BigDecimal value) {
            addCriterion("c_bpartner_location_id =", value, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdNotEqualTo(BigDecimal value) {
            addCriterion("c_bpartner_location_id <>", value, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdGreaterThan(BigDecimal value) {
            addCriterion("c_bpartner_location_id >", value, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c_bpartner_location_id >=", value, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdLessThan(BigDecimal value) {
            addCriterion("c_bpartner_location_id <", value, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("c_bpartner_location_id <=", value, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdIn(List<BigDecimal> values) {
            addCriterion("c_bpartner_location_id in", values, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdNotIn(List<BigDecimal> values) {
            addCriterion("c_bpartner_location_id not in", values, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_bpartner_location_id between", value1, value2, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_bpartner_location_id not between", value1, value2, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andDateorderedIsNull() {
            addCriterion("dateordered is null");
            return (Criteria) this;
        }

        public Criteria andDateorderedIsNotNull() {
            addCriterion("dateordered is not null");
            return (Criteria) this;
        }

        public Criteria andDateorderedEqualTo(Date value) {
            addCriterion("dateordered =", value, "dateordered");
            return (Criteria) this;
        }

        public Criteria andDateorderedNotEqualTo(Date value) {
            addCriterion("dateordered <>", value, "dateordered");
            return (Criteria) this;
        }

        public Criteria andDateorderedGreaterThan(Date value) {
            addCriterion("dateordered >", value, "dateordered");
            return (Criteria) this;
        }

        public Criteria andDateorderedGreaterThanOrEqualTo(Date value) {
            addCriterion("dateordered >=", value, "dateordered");
            return (Criteria) this;
        }

        public Criteria andDateorderedLessThan(Date value) {
            addCriterion("dateordered <", value, "dateordered");
            return (Criteria) this;
        }

        public Criteria andDateorderedLessThanOrEqualTo(Date value) {
            addCriterion("dateordered <=", value, "dateordered");
            return (Criteria) this;
        }

        public Criteria andDateorderedIn(List<Date> values) {
            addCriterion("dateordered in", values, "dateordered");
            return (Criteria) this;
        }

        public Criteria andDateorderedNotIn(List<Date> values) {
            addCriterion("dateordered not in", values, "dateordered");
            return (Criteria) this;
        }

        public Criteria andDateorderedBetween(Date value1, Date value2) {
            addCriterion("dateordered between", value1, value2, "dateordered");
            return (Criteria) this;
        }

        public Criteria andDateorderedNotBetween(Date value1, Date value2) {
            addCriterion("dateordered not between", value1, value2, "dateordered");
            return (Criteria) this;
        }

        public Criteria andDatepromisedIsNull() {
            addCriterion("datepromised is null");
            return (Criteria) this;
        }

        public Criteria andDatepromisedIsNotNull() {
            addCriterion("datepromised is not null");
            return (Criteria) this;
        }

        public Criteria andDatepromisedEqualTo(Date value) {
            addCriterion("datepromised =", value, "datepromised");
            return (Criteria) this;
        }

        public Criteria andDatepromisedNotEqualTo(Date value) {
            addCriterion("datepromised <>", value, "datepromised");
            return (Criteria) this;
        }

        public Criteria andDatepromisedGreaterThan(Date value) {
            addCriterion("datepromised >", value, "datepromised");
            return (Criteria) this;
        }

        public Criteria andDatepromisedGreaterThanOrEqualTo(Date value) {
            addCriterion("datepromised >=", value, "datepromised");
            return (Criteria) this;
        }

        public Criteria andDatepromisedLessThan(Date value) {
            addCriterion("datepromised <", value, "datepromised");
            return (Criteria) this;
        }

        public Criteria andDatepromisedLessThanOrEqualTo(Date value) {
            addCriterion("datepromised <=", value, "datepromised");
            return (Criteria) this;
        }

        public Criteria andDatepromisedIn(List<Date> values) {
            addCriterion("datepromised in", values, "datepromised");
            return (Criteria) this;
        }

        public Criteria andDatepromisedNotIn(List<Date> values) {
            addCriterion("datepromised not in", values, "datepromised");
            return (Criteria) this;
        }

        public Criteria andDatepromisedBetween(Date value1, Date value2) {
            addCriterion("datepromised between", value1, value2, "datepromised");
            return (Criteria) this;
        }

        public Criteria andDatepromisedNotBetween(Date value1, Date value2) {
            addCriterion("datepromised not between", value1, value2, "datepromised");
            return (Criteria) this;
        }

        public Criteria andDatedeliveredIsNull() {
            addCriterion("datedelivered is null");
            return (Criteria) this;
        }

        public Criteria andDatedeliveredIsNotNull() {
            addCriterion("datedelivered is not null");
            return (Criteria) this;
        }

        public Criteria andDatedeliveredEqualTo(Date value) {
            addCriterion("datedelivered =", value, "datedelivered");
            return (Criteria) this;
        }

        public Criteria andDatedeliveredNotEqualTo(Date value) {
            addCriterion("datedelivered <>", value, "datedelivered");
            return (Criteria) this;
        }

        public Criteria andDatedeliveredGreaterThan(Date value) {
            addCriterion("datedelivered >", value, "datedelivered");
            return (Criteria) this;
        }

        public Criteria andDatedeliveredGreaterThanOrEqualTo(Date value) {
            addCriterion("datedelivered >=", value, "datedelivered");
            return (Criteria) this;
        }

        public Criteria andDatedeliveredLessThan(Date value) {
            addCriterion("datedelivered <", value, "datedelivered");
            return (Criteria) this;
        }

        public Criteria andDatedeliveredLessThanOrEqualTo(Date value) {
            addCriterion("datedelivered <=", value, "datedelivered");
            return (Criteria) this;
        }

        public Criteria andDatedeliveredIn(List<Date> values) {
            addCriterion("datedelivered in", values, "datedelivered");
            return (Criteria) this;
        }

        public Criteria andDatedeliveredNotIn(List<Date> values) {
            addCriterion("datedelivered not in", values, "datedelivered");
            return (Criteria) this;
        }

        public Criteria andDatedeliveredBetween(Date value1, Date value2) {
            addCriterion("datedelivered between", value1, value2, "datedelivered");
            return (Criteria) this;
        }

        public Criteria andDatedeliveredNotBetween(Date value1, Date value2) {
            addCriterion("datedelivered not between", value1, value2, "datedelivered");
            return (Criteria) this;
        }

        public Criteria andDateinvoicedIsNull() {
            addCriterion("dateinvoiced is null");
            return (Criteria) this;
        }

        public Criteria andDateinvoicedIsNotNull() {
            addCriterion("dateinvoiced is not null");
            return (Criteria) this;
        }

        public Criteria andDateinvoicedEqualTo(Date value) {
            addCriterion("dateinvoiced =", value, "dateinvoiced");
            return (Criteria) this;
        }

        public Criteria andDateinvoicedNotEqualTo(Date value) {
            addCriterion("dateinvoiced <>", value, "dateinvoiced");
            return (Criteria) this;
        }

        public Criteria andDateinvoicedGreaterThan(Date value) {
            addCriterion("dateinvoiced >", value, "dateinvoiced");
            return (Criteria) this;
        }

        public Criteria andDateinvoicedGreaterThanOrEqualTo(Date value) {
            addCriterion("dateinvoiced >=", value, "dateinvoiced");
            return (Criteria) this;
        }

        public Criteria andDateinvoicedLessThan(Date value) {
            addCriterion("dateinvoiced <", value, "dateinvoiced");
            return (Criteria) this;
        }

        public Criteria andDateinvoicedLessThanOrEqualTo(Date value) {
            addCriterion("dateinvoiced <=", value, "dateinvoiced");
            return (Criteria) this;
        }

        public Criteria andDateinvoicedIn(List<Date> values) {
            addCriterion("dateinvoiced in", values, "dateinvoiced");
            return (Criteria) this;
        }

        public Criteria andDateinvoicedNotIn(List<Date> values) {
            addCriterion("dateinvoiced not in", values, "dateinvoiced");
            return (Criteria) this;
        }

        public Criteria andDateinvoicedBetween(Date value1, Date value2) {
            addCriterion("dateinvoiced between", value1, value2, "dateinvoiced");
            return (Criteria) this;
        }

        public Criteria andDateinvoicedNotBetween(Date value1, Date value2) {
            addCriterion("dateinvoiced not between", value1, value2, "dateinvoiced");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andMProductIdIsNull() {
            addCriterion("m_product_id is null");
            return (Criteria) this;
        }

        public Criteria andMProductIdIsNotNull() {
            addCriterion("m_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andMProductIdEqualTo(BigDecimal value) {
            addCriterion("m_product_id =", value, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdNotEqualTo(BigDecimal value) {
            addCriterion("m_product_id <>", value, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdGreaterThan(BigDecimal value) {
            addCriterion("m_product_id >", value, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m_product_id >=", value, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdLessThan(BigDecimal value) {
            addCriterion("m_product_id <", value, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m_product_id <=", value, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdIn(List<BigDecimal> values) {
            addCriterion("m_product_id in", values, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdNotIn(List<BigDecimal> values) {
            addCriterion("m_product_id not in", values, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_product_id between", value1, value2, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_product_id not between", value1, value2, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMWarehouseIdIsNull() {
            addCriterion("m_warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andMWarehouseIdIsNotNull() {
            addCriterion("m_warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andMWarehouseIdEqualTo(BigDecimal value) {
            addCriterion("m_warehouse_id =", value, "mWarehouseId");
            return (Criteria) this;
        }

        public Criteria andMWarehouseIdNotEqualTo(BigDecimal value) {
            addCriterion("m_warehouse_id <>", value, "mWarehouseId");
            return (Criteria) this;
        }

        public Criteria andMWarehouseIdGreaterThan(BigDecimal value) {
            addCriterion("m_warehouse_id >", value, "mWarehouseId");
            return (Criteria) this;
        }

        public Criteria andMWarehouseIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m_warehouse_id >=", value, "mWarehouseId");
            return (Criteria) this;
        }

        public Criteria andMWarehouseIdLessThan(BigDecimal value) {
            addCriterion("m_warehouse_id <", value, "mWarehouseId");
            return (Criteria) this;
        }

        public Criteria andMWarehouseIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m_warehouse_id <=", value, "mWarehouseId");
            return (Criteria) this;
        }

        public Criteria andMWarehouseIdIn(List<BigDecimal> values) {
            addCriterion("m_warehouse_id in", values, "mWarehouseId");
            return (Criteria) this;
        }

        public Criteria andMWarehouseIdNotIn(List<BigDecimal> values) {
            addCriterion("m_warehouse_id not in", values, "mWarehouseId");
            return (Criteria) this;
        }

        public Criteria andMWarehouseIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_warehouse_id between", value1, value2, "mWarehouseId");
            return (Criteria) this;
        }

        public Criteria andMWarehouseIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_warehouse_id not between", value1, value2, "mWarehouseId");
            return (Criteria) this;
        }

        public Criteria andCUomIdIsNull() {
            addCriterion("c_uom_id is null");
            return (Criteria) this;
        }

        public Criteria andCUomIdIsNotNull() {
            addCriterion("c_uom_id is not null");
            return (Criteria) this;
        }

        public Criteria andCUomIdEqualTo(BigDecimal value) {
            addCriterion("c_uom_id =", value, "cUomId");
            return (Criteria) this;
        }

        public Criteria andCUomIdNotEqualTo(BigDecimal value) {
            addCriterion("c_uom_id <>", value, "cUomId");
            return (Criteria) this;
        }

        public Criteria andCUomIdGreaterThan(BigDecimal value) {
            addCriterion("c_uom_id >", value, "cUomId");
            return (Criteria) this;
        }

        public Criteria andCUomIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c_uom_id >=", value, "cUomId");
            return (Criteria) this;
        }

        public Criteria andCUomIdLessThan(BigDecimal value) {
            addCriterion("c_uom_id <", value, "cUomId");
            return (Criteria) this;
        }

        public Criteria andCUomIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("c_uom_id <=", value, "cUomId");
            return (Criteria) this;
        }

        public Criteria andCUomIdIn(List<BigDecimal> values) {
            addCriterion("c_uom_id in", values, "cUomId");
            return (Criteria) this;
        }

        public Criteria andCUomIdNotIn(List<BigDecimal> values) {
            addCriterion("c_uom_id not in", values, "cUomId");
            return (Criteria) this;
        }

        public Criteria andCUomIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_uom_id between", value1, value2, "cUomId");
            return (Criteria) this;
        }

        public Criteria andCUomIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_uom_id not between", value1, value2, "cUomId");
            return (Criteria) this;
        }

        public Criteria andQtyorderedIsNull() {
            addCriterion("qtyordered is null");
            return (Criteria) this;
        }

        public Criteria andQtyorderedIsNotNull() {
            addCriterion("qtyordered is not null");
            return (Criteria) this;
        }

        public Criteria andQtyorderedEqualTo(BigDecimal value) {
            addCriterion("qtyordered =", value, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedNotEqualTo(BigDecimal value) {
            addCriterion("qtyordered <>", value, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedGreaterThan(BigDecimal value) {
            addCriterion("qtyordered >", value, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("qtyordered >=", value, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedLessThan(BigDecimal value) {
            addCriterion("qtyordered <", value, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("qtyordered <=", value, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedIn(List<BigDecimal> values) {
            addCriterion("qtyordered in", values, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedNotIn(List<BigDecimal> values) {
            addCriterion("qtyordered not in", values, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qtyordered between", value1, value2, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyorderedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qtyordered not between", value1, value2, "qtyordered");
            return (Criteria) this;
        }

        public Criteria andQtyreservedIsNull() {
            addCriterion("qtyreserved is null");
            return (Criteria) this;
        }

        public Criteria andQtyreservedIsNotNull() {
            addCriterion("qtyreserved is not null");
            return (Criteria) this;
        }

        public Criteria andQtyreservedEqualTo(BigDecimal value) {
            addCriterion("qtyreserved =", value, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedNotEqualTo(BigDecimal value) {
            addCriterion("qtyreserved <>", value, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedGreaterThan(BigDecimal value) {
            addCriterion("qtyreserved >", value, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("qtyreserved >=", value, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedLessThan(BigDecimal value) {
            addCriterion("qtyreserved <", value, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("qtyreserved <=", value, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedIn(List<BigDecimal> values) {
            addCriterion("qtyreserved in", values, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedNotIn(List<BigDecimal> values) {
            addCriterion("qtyreserved not in", values, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qtyreserved between", value1, value2, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtyreservedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qtyreserved not between", value1, value2, "qtyreserved");
            return (Criteria) this;
        }

        public Criteria andQtydeliveredIsNull() {
            addCriterion("qtydelivered is null");
            return (Criteria) this;
        }

        public Criteria andQtydeliveredIsNotNull() {
            addCriterion("qtydelivered is not null");
            return (Criteria) this;
        }

        public Criteria andQtydeliveredEqualTo(BigDecimal value) {
            addCriterion("qtydelivered =", value, "qtydelivered");
            return (Criteria) this;
        }

        public Criteria andQtydeliveredNotEqualTo(BigDecimal value) {
            addCriterion("qtydelivered <>", value, "qtydelivered");
            return (Criteria) this;
        }

        public Criteria andQtydeliveredGreaterThan(BigDecimal value) {
            addCriterion("qtydelivered >", value, "qtydelivered");
            return (Criteria) this;
        }

        public Criteria andQtydeliveredGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("qtydelivered >=", value, "qtydelivered");
            return (Criteria) this;
        }

        public Criteria andQtydeliveredLessThan(BigDecimal value) {
            addCriterion("qtydelivered <", value, "qtydelivered");
            return (Criteria) this;
        }

        public Criteria andQtydeliveredLessThanOrEqualTo(BigDecimal value) {
            addCriterion("qtydelivered <=", value, "qtydelivered");
            return (Criteria) this;
        }

        public Criteria andQtydeliveredIn(List<BigDecimal> values) {
            addCriterion("qtydelivered in", values, "qtydelivered");
            return (Criteria) this;
        }

        public Criteria andQtydeliveredNotIn(List<BigDecimal> values) {
            addCriterion("qtydelivered not in", values, "qtydelivered");
            return (Criteria) this;
        }

        public Criteria andQtydeliveredBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qtydelivered between", value1, value2, "qtydelivered");
            return (Criteria) this;
        }

        public Criteria andQtydeliveredNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qtydelivered not between", value1, value2, "qtydelivered");
            return (Criteria) this;
        }

        public Criteria andQtyinvoicedIsNull() {
            addCriterion("qtyinvoiced is null");
            return (Criteria) this;
        }

        public Criteria andQtyinvoicedIsNotNull() {
            addCriterion("qtyinvoiced is not null");
            return (Criteria) this;
        }

        public Criteria andQtyinvoicedEqualTo(BigDecimal value) {
            addCriterion("qtyinvoiced =", value, "qtyinvoiced");
            return (Criteria) this;
        }

        public Criteria andQtyinvoicedNotEqualTo(BigDecimal value) {
            addCriterion("qtyinvoiced <>", value, "qtyinvoiced");
            return (Criteria) this;
        }

        public Criteria andQtyinvoicedGreaterThan(BigDecimal value) {
            addCriterion("qtyinvoiced >", value, "qtyinvoiced");
            return (Criteria) this;
        }

        public Criteria andQtyinvoicedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("qtyinvoiced >=", value, "qtyinvoiced");
            return (Criteria) this;
        }

        public Criteria andQtyinvoicedLessThan(BigDecimal value) {
            addCriterion("qtyinvoiced <", value, "qtyinvoiced");
            return (Criteria) this;
        }

        public Criteria andQtyinvoicedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("qtyinvoiced <=", value, "qtyinvoiced");
            return (Criteria) this;
        }

        public Criteria andQtyinvoicedIn(List<BigDecimal> values) {
            addCriterion("qtyinvoiced in", values, "qtyinvoiced");
            return (Criteria) this;
        }

        public Criteria andQtyinvoicedNotIn(List<BigDecimal> values) {
            addCriterion("qtyinvoiced not in", values, "qtyinvoiced");
            return (Criteria) this;
        }

        public Criteria andQtyinvoicedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qtyinvoiced between", value1, value2, "qtyinvoiced");
            return (Criteria) this;
        }

        public Criteria andQtyinvoicedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qtyinvoiced not between", value1, value2, "qtyinvoiced");
            return (Criteria) this;
        }

        public Criteria andMShipperIdIsNull() {
            addCriterion("m_shipper_id is null");
            return (Criteria) this;
        }

        public Criteria andMShipperIdIsNotNull() {
            addCriterion("m_shipper_id is not null");
            return (Criteria) this;
        }

        public Criteria andMShipperIdEqualTo(BigDecimal value) {
            addCriterion("m_shipper_id =", value, "mShipperId");
            return (Criteria) this;
        }

        public Criteria andMShipperIdNotEqualTo(BigDecimal value) {
            addCriterion("m_shipper_id <>", value, "mShipperId");
            return (Criteria) this;
        }

        public Criteria andMShipperIdGreaterThan(BigDecimal value) {
            addCriterion("m_shipper_id >", value, "mShipperId");
            return (Criteria) this;
        }

        public Criteria andMShipperIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m_shipper_id >=", value, "mShipperId");
            return (Criteria) this;
        }

        public Criteria andMShipperIdLessThan(BigDecimal value) {
            addCriterion("m_shipper_id <", value, "mShipperId");
            return (Criteria) this;
        }

        public Criteria andMShipperIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m_shipper_id <=", value, "mShipperId");
            return (Criteria) this;
        }

        public Criteria andMShipperIdIn(List<BigDecimal> values) {
            addCriterion("m_shipper_id in", values, "mShipperId");
            return (Criteria) this;
        }

        public Criteria andMShipperIdNotIn(List<BigDecimal> values) {
            addCriterion("m_shipper_id not in", values, "mShipperId");
            return (Criteria) this;
        }

        public Criteria andMShipperIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_shipper_id between", value1, value2, "mShipperId");
            return (Criteria) this;
        }

        public Criteria andMShipperIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_shipper_id not between", value1, value2, "mShipperId");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdIsNull() {
            addCriterion("c_currency_id is null");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdIsNotNull() {
            addCriterion("c_currency_id is not null");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdEqualTo(BigDecimal value) {
            addCriterion("c_currency_id =", value, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdNotEqualTo(BigDecimal value) {
            addCriterion("c_currency_id <>", value, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdGreaterThan(BigDecimal value) {
            addCriterion("c_currency_id >", value, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c_currency_id >=", value, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdLessThan(BigDecimal value) {
            addCriterion("c_currency_id <", value, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("c_currency_id <=", value, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdIn(List<BigDecimal> values) {
            addCriterion("c_currency_id in", values, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdNotIn(List<BigDecimal> values) {
            addCriterion("c_currency_id not in", values, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_currency_id between", value1, value2, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_currency_id not between", value1, value2, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andPricelistIsNull() {
            addCriterion("pricelist is null");
            return (Criteria) this;
        }

        public Criteria andPricelistIsNotNull() {
            addCriterion("pricelist is not null");
            return (Criteria) this;
        }

        public Criteria andPricelistEqualTo(BigDecimal value) {
            addCriterion("pricelist =", value, "pricelist");
            return (Criteria) this;
        }

        public Criteria andPricelistNotEqualTo(BigDecimal value) {
            addCriterion("pricelist <>", value, "pricelist");
            return (Criteria) this;
        }

        public Criteria andPricelistGreaterThan(BigDecimal value) {
            addCriterion("pricelist >", value, "pricelist");
            return (Criteria) this;
        }

        public Criteria andPricelistGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pricelist >=", value, "pricelist");
            return (Criteria) this;
        }

        public Criteria andPricelistLessThan(BigDecimal value) {
            addCriterion("pricelist <", value, "pricelist");
            return (Criteria) this;
        }

        public Criteria andPricelistLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pricelist <=", value, "pricelist");
            return (Criteria) this;
        }

        public Criteria andPricelistIn(List<BigDecimal> values) {
            addCriterion("pricelist in", values, "pricelist");
            return (Criteria) this;
        }

        public Criteria andPricelistNotIn(List<BigDecimal> values) {
            addCriterion("pricelist not in", values, "pricelist");
            return (Criteria) this;
        }

        public Criteria andPricelistBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pricelist between", value1, value2, "pricelist");
            return (Criteria) this;
        }

        public Criteria andPricelistNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pricelist not between", value1, value2, "pricelist");
            return (Criteria) this;
        }

        public Criteria andPriceactualIsNull() {
            addCriterion("priceactual is null");
            return (Criteria) this;
        }

        public Criteria andPriceactualIsNotNull() {
            addCriterion("priceactual is not null");
            return (Criteria) this;
        }

        public Criteria andPriceactualEqualTo(BigDecimal value) {
            addCriterion("priceactual =", value, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualNotEqualTo(BigDecimal value) {
            addCriterion("priceactual <>", value, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualGreaterThan(BigDecimal value) {
            addCriterion("priceactual >", value, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("priceactual >=", value, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualLessThan(BigDecimal value) {
            addCriterion("priceactual <", value, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualLessThanOrEqualTo(BigDecimal value) {
            addCriterion("priceactual <=", value, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualIn(List<BigDecimal> values) {
            addCriterion("priceactual in", values, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualNotIn(List<BigDecimal> values) {
            addCriterion("priceactual not in", values, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("priceactual between", value1, value2, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("priceactual not between", value1, value2, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPricelimitIsNull() {
            addCriterion("pricelimit is null");
            return (Criteria) this;
        }

        public Criteria andPricelimitIsNotNull() {
            addCriterion("pricelimit is not null");
            return (Criteria) this;
        }

        public Criteria andPricelimitEqualTo(BigDecimal value) {
            addCriterion("pricelimit =", value, "pricelimit");
            return (Criteria) this;
        }

        public Criteria andPricelimitNotEqualTo(BigDecimal value) {
            addCriterion("pricelimit <>", value, "pricelimit");
            return (Criteria) this;
        }

        public Criteria andPricelimitGreaterThan(BigDecimal value) {
            addCriterion("pricelimit >", value, "pricelimit");
            return (Criteria) this;
        }

        public Criteria andPricelimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pricelimit >=", value, "pricelimit");
            return (Criteria) this;
        }

        public Criteria andPricelimitLessThan(BigDecimal value) {
            addCriterion("pricelimit <", value, "pricelimit");
            return (Criteria) this;
        }

        public Criteria andPricelimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pricelimit <=", value, "pricelimit");
            return (Criteria) this;
        }

        public Criteria andPricelimitIn(List<BigDecimal> values) {
            addCriterion("pricelimit in", values, "pricelimit");
            return (Criteria) this;
        }

        public Criteria andPricelimitNotIn(List<BigDecimal> values) {
            addCriterion("pricelimit not in", values, "pricelimit");
            return (Criteria) this;
        }

        public Criteria andPricelimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pricelimit between", value1, value2, "pricelimit");
            return (Criteria) this;
        }

        public Criteria andPricelimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pricelimit not between", value1, value2, "pricelimit");
            return (Criteria) this;
        }

        public Criteria andLinenetamtIsNull() {
            addCriterion("linenetamt is null");
            return (Criteria) this;
        }

        public Criteria andLinenetamtIsNotNull() {
            addCriterion("linenetamt is not null");
            return (Criteria) this;
        }

        public Criteria andLinenetamtEqualTo(BigDecimal value) {
            addCriterion("linenetamt =", value, "linenetamt");
            return (Criteria) this;
        }

        public Criteria andLinenetamtNotEqualTo(BigDecimal value) {
            addCriterion("linenetamt <>", value, "linenetamt");
            return (Criteria) this;
        }

        public Criteria andLinenetamtGreaterThan(BigDecimal value) {
            addCriterion("linenetamt >", value, "linenetamt");
            return (Criteria) this;
        }

        public Criteria andLinenetamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("linenetamt >=", value, "linenetamt");
            return (Criteria) this;
        }

        public Criteria andLinenetamtLessThan(BigDecimal value) {
            addCriterion("linenetamt <", value, "linenetamt");
            return (Criteria) this;
        }

        public Criteria andLinenetamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("linenetamt <=", value, "linenetamt");
            return (Criteria) this;
        }

        public Criteria andLinenetamtIn(List<BigDecimal> values) {
            addCriterion("linenetamt in", values, "linenetamt");
            return (Criteria) this;
        }

        public Criteria andLinenetamtNotIn(List<BigDecimal> values) {
            addCriterion("linenetamt not in", values, "linenetamt");
            return (Criteria) this;
        }

        public Criteria andLinenetamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("linenetamt between", value1, value2, "linenetamt");
            return (Criteria) this;
        }

        public Criteria andLinenetamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("linenetamt not between", value1, value2, "linenetamt");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andFreightamtIsNull() {
            addCriterion("freightamt is null");
            return (Criteria) this;
        }

        public Criteria andFreightamtIsNotNull() {
            addCriterion("freightamt is not null");
            return (Criteria) this;
        }

        public Criteria andFreightamtEqualTo(BigDecimal value) {
            addCriterion("freightamt =", value, "freightamt");
            return (Criteria) this;
        }

        public Criteria andFreightamtNotEqualTo(BigDecimal value) {
            addCriterion("freightamt <>", value, "freightamt");
            return (Criteria) this;
        }

        public Criteria andFreightamtGreaterThan(BigDecimal value) {
            addCriterion("freightamt >", value, "freightamt");
            return (Criteria) this;
        }

        public Criteria andFreightamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freightamt >=", value, "freightamt");
            return (Criteria) this;
        }

        public Criteria andFreightamtLessThan(BigDecimal value) {
            addCriterion("freightamt <", value, "freightamt");
            return (Criteria) this;
        }

        public Criteria andFreightamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freightamt <=", value, "freightamt");
            return (Criteria) this;
        }

        public Criteria andFreightamtIn(List<BigDecimal> values) {
            addCriterion("freightamt in", values, "freightamt");
            return (Criteria) this;
        }

        public Criteria andFreightamtNotIn(List<BigDecimal> values) {
            addCriterion("freightamt not in", values, "freightamt");
            return (Criteria) this;
        }

        public Criteria andFreightamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freightamt between", value1, value2, "freightamt");
            return (Criteria) this;
        }

        public Criteria andFreightamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freightamt not between", value1, value2, "freightamt");
            return (Criteria) this;
        }

        public Criteria andCChargeIdIsNull() {
            addCriterion("c_charge_id is null");
            return (Criteria) this;
        }

        public Criteria andCChargeIdIsNotNull() {
            addCriterion("c_charge_id is not null");
            return (Criteria) this;
        }

        public Criteria andCChargeIdEqualTo(BigDecimal value) {
            addCriterion("c_charge_id =", value, "cChargeId");
            return (Criteria) this;
        }

        public Criteria andCChargeIdNotEqualTo(BigDecimal value) {
            addCriterion("c_charge_id <>", value, "cChargeId");
            return (Criteria) this;
        }

        public Criteria andCChargeIdGreaterThan(BigDecimal value) {
            addCriterion("c_charge_id >", value, "cChargeId");
            return (Criteria) this;
        }

        public Criteria andCChargeIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c_charge_id >=", value, "cChargeId");
            return (Criteria) this;
        }

        public Criteria andCChargeIdLessThan(BigDecimal value) {
            addCriterion("c_charge_id <", value, "cChargeId");
            return (Criteria) this;
        }

        public Criteria andCChargeIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("c_charge_id <=", value, "cChargeId");
            return (Criteria) this;
        }

        public Criteria andCChargeIdIn(List<BigDecimal> values) {
            addCriterion("c_charge_id in", values, "cChargeId");
            return (Criteria) this;
        }

        public Criteria andCChargeIdNotIn(List<BigDecimal> values) {
            addCriterion("c_charge_id not in", values, "cChargeId");
            return (Criteria) this;
        }

        public Criteria andCChargeIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_charge_id between", value1, value2, "cChargeId");
            return (Criteria) this;
        }

        public Criteria andCChargeIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_charge_id not between", value1, value2, "cChargeId");
            return (Criteria) this;
        }

        public Criteria andCTaxIdIsNull() {
            addCriterion("c_tax_id is null");
            return (Criteria) this;
        }

        public Criteria andCTaxIdIsNotNull() {
            addCriterion("c_tax_id is not null");
            return (Criteria) this;
        }

        public Criteria andCTaxIdEqualTo(BigDecimal value) {
            addCriterion("c_tax_id =", value, "cTaxId");
            return (Criteria) this;
        }

        public Criteria andCTaxIdNotEqualTo(BigDecimal value) {
            addCriterion("c_tax_id <>", value, "cTaxId");
            return (Criteria) this;
        }

        public Criteria andCTaxIdGreaterThan(BigDecimal value) {
            addCriterion("c_tax_id >", value, "cTaxId");
            return (Criteria) this;
        }

        public Criteria andCTaxIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c_tax_id >=", value, "cTaxId");
            return (Criteria) this;
        }

        public Criteria andCTaxIdLessThan(BigDecimal value) {
            addCriterion("c_tax_id <", value, "cTaxId");
            return (Criteria) this;
        }

        public Criteria andCTaxIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("c_tax_id <=", value, "cTaxId");
            return (Criteria) this;
        }

        public Criteria andCTaxIdIn(List<BigDecimal> values) {
            addCriterion("c_tax_id in", values, "cTaxId");
            return (Criteria) this;
        }

        public Criteria andCTaxIdNotIn(List<BigDecimal> values) {
            addCriterion("c_tax_id not in", values, "cTaxId");
            return (Criteria) this;
        }

        public Criteria andCTaxIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_tax_id between", value1, value2, "cTaxId");
            return (Criteria) this;
        }

        public Criteria andCTaxIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_tax_id not between", value1, value2, "cTaxId");
            return (Criteria) this;
        }

        public Criteria andSResourceassignmentIdIsNull() {
            addCriterion("s_resourceassignment_id is null");
            return (Criteria) this;
        }

        public Criteria andSResourceassignmentIdIsNotNull() {
            addCriterion("s_resourceassignment_id is not null");
            return (Criteria) this;
        }

        public Criteria andSResourceassignmentIdEqualTo(BigDecimal value) {
            addCriterion("s_resourceassignment_id =", value, "sResourceassignmentId");
            return (Criteria) this;
        }

        public Criteria andSResourceassignmentIdNotEqualTo(BigDecimal value) {
            addCriterion("s_resourceassignment_id <>", value, "sResourceassignmentId");
            return (Criteria) this;
        }

        public Criteria andSResourceassignmentIdGreaterThan(BigDecimal value) {
            addCriterion("s_resourceassignment_id >", value, "sResourceassignmentId");
            return (Criteria) this;
        }

        public Criteria andSResourceassignmentIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("s_resourceassignment_id >=", value, "sResourceassignmentId");
            return (Criteria) this;
        }

        public Criteria andSResourceassignmentIdLessThan(BigDecimal value) {
            addCriterion("s_resourceassignment_id <", value, "sResourceassignmentId");
            return (Criteria) this;
        }

        public Criteria andSResourceassignmentIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("s_resourceassignment_id <=", value, "sResourceassignmentId");
            return (Criteria) this;
        }

        public Criteria andSResourceassignmentIdIn(List<BigDecimal> values) {
            addCriterion("s_resourceassignment_id in", values, "sResourceassignmentId");
            return (Criteria) this;
        }

        public Criteria andSResourceassignmentIdNotIn(List<BigDecimal> values) {
            addCriterion("s_resourceassignment_id not in", values, "sResourceassignmentId");
            return (Criteria) this;
        }

        public Criteria andSResourceassignmentIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("s_resourceassignment_id between", value1, value2, "sResourceassignmentId");
            return (Criteria) this;
        }

        public Criteria andSResourceassignmentIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("s_resourceassignment_id not between", value1, value2, "sResourceassignmentId");
            return (Criteria) this;
        }

        public Criteria andRefOrderlineIdIsNull() {
            addCriterion("ref_orderline_id is null");
            return (Criteria) this;
        }

        public Criteria andRefOrderlineIdIsNotNull() {
            addCriterion("ref_orderline_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefOrderlineIdEqualTo(BigDecimal value) {
            addCriterion("ref_orderline_id =", value, "refOrderlineId");
            return (Criteria) this;
        }

        public Criteria andRefOrderlineIdNotEqualTo(BigDecimal value) {
            addCriterion("ref_orderline_id <>", value, "refOrderlineId");
            return (Criteria) this;
        }

        public Criteria andRefOrderlineIdGreaterThan(BigDecimal value) {
            addCriterion("ref_orderline_id >", value, "refOrderlineId");
            return (Criteria) this;
        }

        public Criteria andRefOrderlineIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ref_orderline_id >=", value, "refOrderlineId");
            return (Criteria) this;
        }

        public Criteria andRefOrderlineIdLessThan(BigDecimal value) {
            addCriterion("ref_orderline_id <", value, "refOrderlineId");
            return (Criteria) this;
        }

        public Criteria andRefOrderlineIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ref_orderline_id <=", value, "refOrderlineId");
            return (Criteria) this;
        }

        public Criteria andRefOrderlineIdIn(List<BigDecimal> values) {
            addCriterion("ref_orderline_id in", values, "refOrderlineId");
            return (Criteria) this;
        }

        public Criteria andRefOrderlineIdNotIn(List<BigDecimal> values) {
            addCriterion("ref_orderline_id not in", values, "refOrderlineId");
            return (Criteria) this;
        }

        public Criteria andRefOrderlineIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ref_orderline_id between", value1, value2, "refOrderlineId");
            return (Criteria) this;
        }

        public Criteria andRefOrderlineIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ref_orderline_id not between", value1, value2, "refOrderlineId");
            return (Criteria) this;
        }

        public Criteria andMAttributesetinstanceIdIsNull() {
            addCriterion("m_attributesetinstance_id is null");
            return (Criteria) this;
        }

        public Criteria andMAttributesetinstanceIdIsNotNull() {
            addCriterion("m_attributesetinstance_id is not null");
            return (Criteria) this;
        }

        public Criteria andMAttributesetinstanceIdEqualTo(BigDecimal value) {
            addCriterion("m_attributesetinstance_id =", value, "mAttributesetinstanceId");
            return (Criteria) this;
        }

        public Criteria andMAttributesetinstanceIdNotEqualTo(BigDecimal value) {
            addCriterion("m_attributesetinstance_id <>", value, "mAttributesetinstanceId");
            return (Criteria) this;
        }

        public Criteria andMAttributesetinstanceIdGreaterThan(BigDecimal value) {
            addCriterion("m_attributesetinstance_id >", value, "mAttributesetinstanceId");
            return (Criteria) this;
        }

        public Criteria andMAttributesetinstanceIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m_attributesetinstance_id >=", value, "mAttributesetinstanceId");
            return (Criteria) this;
        }

        public Criteria andMAttributesetinstanceIdLessThan(BigDecimal value) {
            addCriterion("m_attributesetinstance_id <", value, "mAttributesetinstanceId");
            return (Criteria) this;
        }

        public Criteria andMAttributesetinstanceIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m_attributesetinstance_id <=", value, "mAttributesetinstanceId");
            return (Criteria) this;
        }

        public Criteria andMAttributesetinstanceIdIn(List<BigDecimal> values) {
            addCriterion("m_attributesetinstance_id in", values, "mAttributesetinstanceId");
            return (Criteria) this;
        }

        public Criteria andMAttributesetinstanceIdNotIn(List<BigDecimal> values) {
            addCriterion("m_attributesetinstance_id not in", values, "mAttributesetinstanceId");
            return (Criteria) this;
        }

        public Criteria andMAttributesetinstanceIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_attributesetinstance_id between", value1, value2, "mAttributesetinstanceId");
            return (Criteria) this;
        }

        public Criteria andMAttributesetinstanceIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_attributesetinstance_id not between", value1, value2, "mAttributesetinstanceId");
            return (Criteria) this;
        }

        public Criteria andIsdescriptionIsNull() {
            addCriterion("isdescription is null");
            return (Criteria) this;
        }

        public Criteria andIsdescriptionIsNotNull() {
            addCriterion("isdescription is not null");
            return (Criteria) this;
        }

        public Criteria andIsdescriptionEqualTo(String value) {
            addCriterion("isdescription =", value, "isdescription");
            return (Criteria) this;
        }

        public Criteria andIsdescriptionNotEqualTo(String value) {
            addCriterion("isdescription <>", value, "isdescription");
            return (Criteria) this;
        }

        public Criteria andIsdescriptionGreaterThan(String value) {
            addCriterion("isdescription >", value, "isdescription");
            return (Criteria) this;
        }

        public Criteria andIsdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("isdescription >=", value, "isdescription");
            return (Criteria) this;
        }

        public Criteria andIsdescriptionLessThan(String value) {
            addCriterion("isdescription <", value, "isdescription");
            return (Criteria) this;
        }

        public Criteria andIsdescriptionLessThanOrEqualTo(String value) {
            addCriterion("isdescription <=", value, "isdescription");
            return (Criteria) this;
        }

        public Criteria andIsdescriptionLike(String value) {
            addCriterion("isdescription like", value, "isdescription");
            return (Criteria) this;
        }

        public Criteria andIsdescriptionNotLike(String value) {
            addCriterion("isdescription not like", value, "isdescription");
            return (Criteria) this;
        }

        public Criteria andIsdescriptionIn(List<String> values) {
            addCriterion("isdescription in", values, "isdescription");
            return (Criteria) this;
        }

        public Criteria andIsdescriptionNotIn(List<String> values) {
            addCriterion("isdescription not in", values, "isdescription");
            return (Criteria) this;
        }

        public Criteria andIsdescriptionBetween(String value1, String value2) {
            addCriterion("isdescription between", value1, value2, "isdescription");
            return (Criteria) this;
        }

        public Criteria andIsdescriptionNotBetween(String value1, String value2) {
            addCriterion("isdescription not between", value1, value2, "isdescription");
            return (Criteria) this;
        }

        public Criteria andProcessedIsNull() {
            addCriterion("processed is null");
            return (Criteria) this;
        }

        public Criteria andProcessedIsNotNull() {
            addCriterion("processed is not null");
            return (Criteria) this;
        }

        public Criteria andProcessedEqualTo(String value) {
            addCriterion("processed =", value, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedNotEqualTo(String value) {
            addCriterion("processed <>", value, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedGreaterThan(String value) {
            addCriterion("processed >", value, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedGreaterThanOrEqualTo(String value) {
            addCriterion("processed >=", value, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedLessThan(String value) {
            addCriterion("processed <", value, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedLessThanOrEqualTo(String value) {
            addCriterion("processed <=", value, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedLike(String value) {
            addCriterion("processed like", value, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedNotLike(String value) {
            addCriterion("processed not like", value, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedIn(List<String> values) {
            addCriterion("processed in", values, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedNotIn(List<String> values) {
            addCriterion("processed not in", values, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedBetween(String value1, String value2) {
            addCriterion("processed between", value1, value2, "processed");
            return (Criteria) this;
        }

        public Criteria andProcessedNotBetween(String value1, String value2) {
            addCriterion("processed not between", value1, value2, "processed");
            return (Criteria) this;
        }

        public Criteria andQtyenteredIsNull() {
            addCriterion("qtyentered is null");
            return (Criteria) this;
        }

        public Criteria andQtyenteredIsNotNull() {
            addCriterion("qtyentered is not null");
            return (Criteria) this;
        }

        public Criteria andQtyenteredEqualTo(BigDecimal value) {
            addCriterion("qtyentered =", value, "qtyentered");
            return (Criteria) this;
        }

        public Criteria andQtyenteredNotEqualTo(BigDecimal value) {
            addCriterion("qtyentered <>", value, "qtyentered");
            return (Criteria) this;
        }

        public Criteria andQtyenteredGreaterThan(BigDecimal value) {
            addCriterion("qtyentered >", value, "qtyentered");
            return (Criteria) this;
        }

        public Criteria andQtyenteredGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("qtyentered >=", value, "qtyentered");
            return (Criteria) this;
        }

        public Criteria andQtyenteredLessThan(BigDecimal value) {
            addCriterion("qtyentered <", value, "qtyentered");
            return (Criteria) this;
        }

        public Criteria andQtyenteredLessThanOrEqualTo(BigDecimal value) {
            addCriterion("qtyentered <=", value, "qtyentered");
            return (Criteria) this;
        }

        public Criteria andQtyenteredIn(List<BigDecimal> values) {
            addCriterion("qtyentered in", values, "qtyentered");
            return (Criteria) this;
        }

        public Criteria andQtyenteredNotIn(List<BigDecimal> values) {
            addCriterion("qtyentered not in", values, "qtyentered");
            return (Criteria) this;
        }

        public Criteria andQtyenteredBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qtyentered between", value1, value2, "qtyentered");
            return (Criteria) this;
        }

        public Criteria andQtyenteredNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qtyentered not between", value1, value2, "qtyentered");
            return (Criteria) this;
        }

        public Criteria andPriceenteredIsNull() {
            addCriterion("priceentered is null");
            return (Criteria) this;
        }

        public Criteria andPriceenteredIsNotNull() {
            addCriterion("priceentered is not null");
            return (Criteria) this;
        }

        public Criteria andPriceenteredEqualTo(BigDecimal value) {
            addCriterion("priceentered =", value, "priceentered");
            return (Criteria) this;
        }

        public Criteria andPriceenteredNotEqualTo(BigDecimal value) {
            addCriterion("priceentered <>", value, "priceentered");
            return (Criteria) this;
        }

        public Criteria andPriceenteredGreaterThan(BigDecimal value) {
            addCriterion("priceentered >", value, "priceentered");
            return (Criteria) this;
        }

        public Criteria andPriceenteredGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("priceentered >=", value, "priceentered");
            return (Criteria) this;
        }

        public Criteria andPriceenteredLessThan(BigDecimal value) {
            addCriterion("priceentered <", value, "priceentered");
            return (Criteria) this;
        }

        public Criteria andPriceenteredLessThanOrEqualTo(BigDecimal value) {
            addCriterion("priceentered <=", value, "priceentered");
            return (Criteria) this;
        }

        public Criteria andPriceenteredIn(List<BigDecimal> values) {
            addCriterion("priceentered in", values, "priceentered");
            return (Criteria) this;
        }

        public Criteria andPriceenteredNotIn(List<BigDecimal> values) {
            addCriterion("priceentered not in", values, "priceentered");
            return (Criteria) this;
        }

        public Criteria andPriceenteredBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("priceentered between", value1, value2, "priceentered");
            return (Criteria) this;
        }

        public Criteria andPriceenteredNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("priceentered not between", value1, value2, "priceentered");
            return (Criteria) this;
        }

        public Criteria andCProjectIdIsNull() {
            addCriterion("c_project_id is null");
            return (Criteria) this;
        }

        public Criteria andCProjectIdIsNotNull() {
            addCriterion("c_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andCProjectIdEqualTo(BigDecimal value) {
            addCriterion("c_project_id =", value, "cProjectId");
            return (Criteria) this;
        }

        public Criteria andCProjectIdNotEqualTo(BigDecimal value) {
            addCriterion("c_project_id <>", value, "cProjectId");
            return (Criteria) this;
        }

        public Criteria andCProjectIdGreaterThan(BigDecimal value) {
            addCriterion("c_project_id >", value, "cProjectId");
            return (Criteria) this;
        }

        public Criteria andCProjectIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c_project_id >=", value, "cProjectId");
            return (Criteria) this;
        }

        public Criteria andCProjectIdLessThan(BigDecimal value) {
            addCriterion("c_project_id <", value, "cProjectId");
            return (Criteria) this;
        }

        public Criteria andCProjectIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("c_project_id <=", value, "cProjectId");
            return (Criteria) this;
        }

        public Criteria andCProjectIdIn(List<BigDecimal> values) {
            addCriterion("c_project_id in", values, "cProjectId");
            return (Criteria) this;
        }

        public Criteria andCProjectIdNotIn(List<BigDecimal> values) {
            addCriterion("c_project_id not in", values, "cProjectId");
            return (Criteria) this;
        }

        public Criteria andCProjectIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_project_id between", value1, value2, "cProjectId");
            return (Criteria) this;
        }

        public Criteria andCProjectIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_project_id not between", value1, value2, "cProjectId");
            return (Criteria) this;
        }

        public Criteria andPricecostIsNull() {
            addCriterion("pricecost is null");
            return (Criteria) this;
        }

        public Criteria andPricecostIsNotNull() {
            addCriterion("pricecost is not null");
            return (Criteria) this;
        }

        public Criteria andPricecostEqualTo(BigDecimal value) {
            addCriterion("pricecost =", value, "pricecost");
            return (Criteria) this;
        }

        public Criteria andPricecostNotEqualTo(BigDecimal value) {
            addCriterion("pricecost <>", value, "pricecost");
            return (Criteria) this;
        }

        public Criteria andPricecostGreaterThan(BigDecimal value) {
            addCriterion("pricecost >", value, "pricecost");
            return (Criteria) this;
        }

        public Criteria andPricecostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pricecost >=", value, "pricecost");
            return (Criteria) this;
        }

        public Criteria andPricecostLessThan(BigDecimal value) {
            addCriterion("pricecost <", value, "pricecost");
            return (Criteria) this;
        }

        public Criteria andPricecostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pricecost <=", value, "pricecost");
            return (Criteria) this;
        }

        public Criteria andPricecostIn(List<BigDecimal> values) {
            addCriterion("pricecost in", values, "pricecost");
            return (Criteria) this;
        }

        public Criteria andPricecostNotIn(List<BigDecimal> values) {
            addCriterion("pricecost not in", values, "pricecost");
            return (Criteria) this;
        }

        public Criteria andPricecostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pricecost between", value1, value2, "pricecost");
            return (Criteria) this;
        }

        public Criteria andPricecostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pricecost not between", value1, value2, "pricecost");
            return (Criteria) this;
        }

        public Criteria andQtylostsalesIsNull() {
            addCriterion("qtylostsales is null");
            return (Criteria) this;
        }

        public Criteria andQtylostsalesIsNotNull() {
            addCriterion("qtylostsales is not null");
            return (Criteria) this;
        }

        public Criteria andQtylostsalesEqualTo(BigDecimal value) {
            addCriterion("qtylostsales =", value, "qtylostsales");
            return (Criteria) this;
        }

        public Criteria andQtylostsalesNotEqualTo(BigDecimal value) {
            addCriterion("qtylostsales <>", value, "qtylostsales");
            return (Criteria) this;
        }

        public Criteria andQtylostsalesGreaterThan(BigDecimal value) {
            addCriterion("qtylostsales >", value, "qtylostsales");
            return (Criteria) this;
        }

        public Criteria andQtylostsalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("qtylostsales >=", value, "qtylostsales");
            return (Criteria) this;
        }

        public Criteria andQtylostsalesLessThan(BigDecimal value) {
            addCriterion("qtylostsales <", value, "qtylostsales");
            return (Criteria) this;
        }

        public Criteria andQtylostsalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("qtylostsales <=", value, "qtylostsales");
            return (Criteria) this;
        }

        public Criteria andQtylostsalesIn(List<BigDecimal> values) {
            addCriterion("qtylostsales in", values, "qtylostsales");
            return (Criteria) this;
        }

        public Criteria andQtylostsalesNotIn(List<BigDecimal> values) {
            addCriterion("qtylostsales not in", values, "qtylostsales");
            return (Criteria) this;
        }

        public Criteria andQtylostsalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qtylostsales between", value1, value2, "qtylostsales");
            return (Criteria) this;
        }

        public Criteria andQtylostsalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qtylostsales not between", value1, value2, "qtylostsales");
            return (Criteria) this;
        }

        public Criteria andCProjectphaseIdIsNull() {
            addCriterion("c_projectphase_id is null");
            return (Criteria) this;
        }

        public Criteria andCProjectphaseIdIsNotNull() {
            addCriterion("c_projectphase_id is not null");
            return (Criteria) this;
        }

        public Criteria andCProjectphaseIdEqualTo(BigDecimal value) {
            addCriterion("c_projectphase_id =", value, "cProjectphaseId");
            return (Criteria) this;
        }

        public Criteria andCProjectphaseIdNotEqualTo(BigDecimal value) {
            addCriterion("c_projectphase_id <>", value, "cProjectphaseId");
            return (Criteria) this;
        }

        public Criteria andCProjectphaseIdGreaterThan(BigDecimal value) {
            addCriterion("c_projectphase_id >", value, "cProjectphaseId");
            return (Criteria) this;
        }

        public Criteria andCProjectphaseIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c_projectphase_id >=", value, "cProjectphaseId");
            return (Criteria) this;
        }

        public Criteria andCProjectphaseIdLessThan(BigDecimal value) {
            addCriterion("c_projectphase_id <", value, "cProjectphaseId");
            return (Criteria) this;
        }

        public Criteria andCProjectphaseIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("c_projectphase_id <=", value, "cProjectphaseId");
            return (Criteria) this;
        }

        public Criteria andCProjectphaseIdIn(List<BigDecimal> values) {
            addCriterion("c_projectphase_id in", values, "cProjectphaseId");
            return (Criteria) this;
        }

        public Criteria andCProjectphaseIdNotIn(List<BigDecimal> values) {
            addCriterion("c_projectphase_id not in", values, "cProjectphaseId");
            return (Criteria) this;
        }

        public Criteria andCProjectphaseIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_projectphase_id between", value1, value2, "cProjectphaseId");
            return (Criteria) this;
        }

        public Criteria andCProjectphaseIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_projectphase_id not between", value1, value2, "cProjectphaseId");
            return (Criteria) this;
        }

        public Criteria andCProjecttaskIdIsNull() {
            addCriterion("c_projecttask_id is null");
            return (Criteria) this;
        }

        public Criteria andCProjecttaskIdIsNotNull() {
            addCriterion("c_projecttask_id is not null");
            return (Criteria) this;
        }

        public Criteria andCProjecttaskIdEqualTo(BigDecimal value) {
            addCriterion("c_projecttask_id =", value, "cProjecttaskId");
            return (Criteria) this;
        }

        public Criteria andCProjecttaskIdNotEqualTo(BigDecimal value) {
            addCriterion("c_projecttask_id <>", value, "cProjecttaskId");
            return (Criteria) this;
        }

        public Criteria andCProjecttaskIdGreaterThan(BigDecimal value) {
            addCriterion("c_projecttask_id >", value, "cProjecttaskId");
            return (Criteria) this;
        }

        public Criteria andCProjecttaskIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c_projecttask_id >=", value, "cProjecttaskId");
            return (Criteria) this;
        }

        public Criteria andCProjecttaskIdLessThan(BigDecimal value) {
            addCriterion("c_projecttask_id <", value, "cProjecttaskId");
            return (Criteria) this;
        }

        public Criteria andCProjecttaskIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("c_projecttask_id <=", value, "cProjecttaskId");
            return (Criteria) this;
        }

        public Criteria andCProjecttaskIdIn(List<BigDecimal> values) {
            addCriterion("c_projecttask_id in", values, "cProjecttaskId");
            return (Criteria) this;
        }

        public Criteria andCProjecttaskIdNotIn(List<BigDecimal> values) {
            addCriterion("c_projecttask_id not in", values, "cProjecttaskId");
            return (Criteria) this;
        }

        public Criteria andCProjecttaskIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_projecttask_id between", value1, value2, "cProjecttaskId");
            return (Criteria) this;
        }

        public Criteria andCProjecttaskIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_projecttask_id not between", value1, value2, "cProjecttaskId");
            return (Criteria) this;
        }

        public Criteria andRrstartdateIsNull() {
            addCriterion("rrstartdate is null");
            return (Criteria) this;
        }

        public Criteria andRrstartdateIsNotNull() {
            addCriterion("rrstartdate is not null");
            return (Criteria) this;
        }

        public Criteria andRrstartdateEqualTo(Date value) {
            addCriterion("rrstartdate =", value, "rrstartdate");
            return (Criteria) this;
        }

        public Criteria andRrstartdateNotEqualTo(Date value) {
            addCriterion("rrstartdate <>", value, "rrstartdate");
            return (Criteria) this;
        }

        public Criteria andRrstartdateGreaterThan(Date value) {
            addCriterion("rrstartdate >", value, "rrstartdate");
            return (Criteria) this;
        }

        public Criteria andRrstartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("rrstartdate >=", value, "rrstartdate");
            return (Criteria) this;
        }

        public Criteria andRrstartdateLessThan(Date value) {
            addCriterion("rrstartdate <", value, "rrstartdate");
            return (Criteria) this;
        }

        public Criteria andRrstartdateLessThanOrEqualTo(Date value) {
            addCriterion("rrstartdate <=", value, "rrstartdate");
            return (Criteria) this;
        }

        public Criteria andRrstartdateIn(List<Date> values) {
            addCriterion("rrstartdate in", values, "rrstartdate");
            return (Criteria) this;
        }

        public Criteria andRrstartdateNotIn(List<Date> values) {
            addCriterion("rrstartdate not in", values, "rrstartdate");
            return (Criteria) this;
        }

        public Criteria andRrstartdateBetween(Date value1, Date value2) {
            addCriterion("rrstartdate between", value1, value2, "rrstartdate");
            return (Criteria) this;
        }

        public Criteria andRrstartdateNotBetween(Date value1, Date value2) {
            addCriterion("rrstartdate not between", value1, value2, "rrstartdate");
            return (Criteria) this;
        }

        public Criteria andRramtIsNull() {
            addCriterion("rramt is null");
            return (Criteria) this;
        }

        public Criteria andRramtIsNotNull() {
            addCriterion("rramt is not null");
            return (Criteria) this;
        }

        public Criteria andRramtEqualTo(BigDecimal value) {
            addCriterion("rramt =", value, "rramt");
            return (Criteria) this;
        }

        public Criteria andRramtNotEqualTo(BigDecimal value) {
            addCriterion("rramt <>", value, "rramt");
            return (Criteria) this;
        }

        public Criteria andRramtGreaterThan(BigDecimal value) {
            addCriterion("rramt >", value, "rramt");
            return (Criteria) this;
        }

        public Criteria andRramtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rramt >=", value, "rramt");
            return (Criteria) this;
        }

        public Criteria andRramtLessThan(BigDecimal value) {
            addCriterion("rramt <", value, "rramt");
            return (Criteria) this;
        }

        public Criteria andRramtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rramt <=", value, "rramt");
            return (Criteria) this;
        }

        public Criteria andRramtIn(List<BigDecimal> values) {
            addCriterion("rramt in", values, "rramt");
            return (Criteria) this;
        }

        public Criteria andRramtNotIn(List<BigDecimal> values) {
            addCriterion("rramt not in", values, "rramt");
            return (Criteria) this;
        }

        public Criteria andRramtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rramt between", value1, value2, "rramt");
            return (Criteria) this;
        }

        public Criteria andRramtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rramt not between", value1, value2, "rramt");
            return (Criteria) this;
        }

        public Criteria andCCampaignIdIsNull() {
            addCriterion("c_campaign_id is null");
            return (Criteria) this;
        }

        public Criteria andCCampaignIdIsNotNull() {
            addCriterion("c_campaign_id is not null");
            return (Criteria) this;
        }

        public Criteria andCCampaignIdEqualTo(BigDecimal value) {
            addCriterion("c_campaign_id =", value, "cCampaignId");
            return (Criteria) this;
        }

        public Criteria andCCampaignIdNotEqualTo(BigDecimal value) {
            addCriterion("c_campaign_id <>", value, "cCampaignId");
            return (Criteria) this;
        }

        public Criteria andCCampaignIdGreaterThan(BigDecimal value) {
            addCriterion("c_campaign_id >", value, "cCampaignId");
            return (Criteria) this;
        }

        public Criteria andCCampaignIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c_campaign_id >=", value, "cCampaignId");
            return (Criteria) this;
        }

        public Criteria andCCampaignIdLessThan(BigDecimal value) {
            addCriterion("c_campaign_id <", value, "cCampaignId");
            return (Criteria) this;
        }

        public Criteria andCCampaignIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("c_campaign_id <=", value, "cCampaignId");
            return (Criteria) this;
        }

        public Criteria andCCampaignIdIn(List<BigDecimal> values) {
            addCriterion("c_campaign_id in", values, "cCampaignId");
            return (Criteria) this;
        }

        public Criteria andCCampaignIdNotIn(List<BigDecimal> values) {
            addCriterion("c_campaign_id not in", values, "cCampaignId");
            return (Criteria) this;
        }

        public Criteria andCCampaignIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_campaign_id between", value1, value2, "cCampaignId");
            return (Criteria) this;
        }

        public Criteria andCCampaignIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_campaign_id not between", value1, value2, "cCampaignId");
            return (Criteria) this;
        }

        public Criteria andCActivityIdIsNull() {
            addCriterion("c_activity_id is null");
            return (Criteria) this;
        }

        public Criteria andCActivityIdIsNotNull() {
            addCriterion("c_activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCActivityIdEqualTo(BigDecimal value) {
            addCriterion("c_activity_id =", value, "cActivityId");
            return (Criteria) this;
        }

        public Criteria andCActivityIdNotEqualTo(BigDecimal value) {
            addCriterion("c_activity_id <>", value, "cActivityId");
            return (Criteria) this;
        }

        public Criteria andCActivityIdGreaterThan(BigDecimal value) {
            addCriterion("c_activity_id >", value, "cActivityId");
            return (Criteria) this;
        }

        public Criteria andCActivityIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c_activity_id >=", value, "cActivityId");
            return (Criteria) this;
        }

        public Criteria andCActivityIdLessThan(BigDecimal value) {
            addCriterion("c_activity_id <", value, "cActivityId");
            return (Criteria) this;
        }

        public Criteria andCActivityIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("c_activity_id <=", value, "cActivityId");
            return (Criteria) this;
        }

        public Criteria andCActivityIdIn(List<BigDecimal> values) {
            addCriterion("c_activity_id in", values, "cActivityId");
            return (Criteria) this;
        }

        public Criteria andCActivityIdNotIn(List<BigDecimal> values) {
            addCriterion("c_activity_id not in", values, "cActivityId");
            return (Criteria) this;
        }

        public Criteria andCActivityIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_activity_id between", value1, value2, "cActivityId");
            return (Criteria) this;
        }

        public Criteria andCActivityIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_activity_id not between", value1, value2, "cActivityId");
            return (Criteria) this;
        }

        public Criteria andUser1IdIsNull() {
            addCriterion("user1_id is null");
            return (Criteria) this;
        }

        public Criteria andUser1IdIsNotNull() {
            addCriterion("user1_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser1IdEqualTo(BigDecimal value) {
            addCriterion("user1_id =", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdNotEqualTo(BigDecimal value) {
            addCriterion("user1_id <>", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdGreaterThan(BigDecimal value) {
            addCriterion("user1_id >", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("user1_id >=", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdLessThan(BigDecimal value) {
            addCriterion("user1_id <", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("user1_id <=", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdIn(List<BigDecimal> values) {
            addCriterion("user1_id in", values, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdNotIn(List<BigDecimal> values) {
            addCriterion("user1_id not in", values, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user1_id between", value1, value2, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user1_id not between", value1, value2, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdIsNull() {
            addCriterion("user2_id is null");
            return (Criteria) this;
        }

        public Criteria andUser2IdIsNotNull() {
            addCriterion("user2_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser2IdEqualTo(BigDecimal value) {
            addCriterion("user2_id =", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdNotEqualTo(BigDecimal value) {
            addCriterion("user2_id <>", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdGreaterThan(BigDecimal value) {
            addCriterion("user2_id >", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("user2_id >=", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdLessThan(BigDecimal value) {
            addCriterion("user2_id <", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("user2_id <=", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdIn(List<BigDecimal> values) {
            addCriterion("user2_id in", values, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdNotIn(List<BigDecimal> values) {
            addCriterion("user2_id not in", values, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user2_id between", value1, value2, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user2_id not between", value1, value2, "user2Id");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdIsNull() {
            addCriterion("ad_orgtrx_id is null");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdIsNotNull() {
            addCriterion("ad_orgtrx_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdEqualTo(BigDecimal value) {
            addCriterion("ad_orgtrx_id =", value, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdNotEqualTo(BigDecimal value) {
            addCriterion("ad_orgtrx_id <>", value, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdGreaterThan(BigDecimal value) {
            addCriterion("ad_orgtrx_id >", value, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ad_orgtrx_id >=", value, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdLessThan(BigDecimal value) {
            addCriterion("ad_orgtrx_id <", value, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ad_orgtrx_id <=", value, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdIn(List<BigDecimal> values) {
            addCriterion("ad_orgtrx_id in", values, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdNotIn(List<BigDecimal> values) {
            addCriterion("ad_orgtrx_id not in", values, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ad_orgtrx_id between", value1, value2, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ad_orgtrx_id not between", value1, value2, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andLinkOrderlineIdIsNull() {
            addCriterion("link_orderline_id is null");
            return (Criteria) this;
        }

        public Criteria andLinkOrderlineIdIsNotNull() {
            addCriterion("link_orderline_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinkOrderlineIdEqualTo(BigDecimal value) {
            addCriterion("link_orderline_id =", value, "linkOrderlineId");
            return (Criteria) this;
        }

        public Criteria andLinkOrderlineIdNotEqualTo(BigDecimal value) {
            addCriterion("link_orderline_id <>", value, "linkOrderlineId");
            return (Criteria) this;
        }

        public Criteria andLinkOrderlineIdGreaterThan(BigDecimal value) {
            addCriterion("link_orderline_id >", value, "linkOrderlineId");
            return (Criteria) this;
        }

        public Criteria andLinkOrderlineIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("link_orderline_id >=", value, "linkOrderlineId");
            return (Criteria) this;
        }

        public Criteria andLinkOrderlineIdLessThan(BigDecimal value) {
            addCriterion("link_orderline_id <", value, "linkOrderlineId");
            return (Criteria) this;
        }

        public Criteria andLinkOrderlineIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("link_orderline_id <=", value, "linkOrderlineId");
            return (Criteria) this;
        }

        public Criteria andLinkOrderlineIdIn(List<BigDecimal> values) {
            addCriterion("link_orderline_id in", values, "linkOrderlineId");
            return (Criteria) this;
        }

        public Criteria andLinkOrderlineIdNotIn(List<BigDecimal> values) {
            addCriterion("link_orderline_id not in", values, "linkOrderlineId");
            return (Criteria) this;
        }

        public Criteria andLinkOrderlineIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("link_orderline_id between", value1, value2, "linkOrderlineId");
            return (Criteria) this;
        }

        public Criteria andLinkOrderlineIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("link_orderline_id not between", value1, value2, "linkOrderlineId");
            return (Criteria) this;
        }

        public Criteria andPpCostCollectorIdIsNull() {
            addCriterion("pp_cost_collector_id is null");
            return (Criteria) this;
        }

        public Criteria andPpCostCollectorIdIsNotNull() {
            addCriterion("pp_cost_collector_id is not null");
            return (Criteria) this;
        }

        public Criteria andPpCostCollectorIdEqualTo(BigDecimal value) {
            addCriterion("pp_cost_collector_id =", value, "ppCostCollectorId");
            return (Criteria) this;
        }

        public Criteria andPpCostCollectorIdNotEqualTo(BigDecimal value) {
            addCriterion("pp_cost_collector_id <>", value, "ppCostCollectorId");
            return (Criteria) this;
        }

        public Criteria andPpCostCollectorIdGreaterThan(BigDecimal value) {
            addCriterion("pp_cost_collector_id >", value, "ppCostCollectorId");
            return (Criteria) this;
        }

        public Criteria andPpCostCollectorIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pp_cost_collector_id >=", value, "ppCostCollectorId");
            return (Criteria) this;
        }

        public Criteria andPpCostCollectorIdLessThan(BigDecimal value) {
            addCriterion("pp_cost_collector_id <", value, "ppCostCollectorId");
            return (Criteria) this;
        }

        public Criteria andPpCostCollectorIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pp_cost_collector_id <=", value, "ppCostCollectorId");
            return (Criteria) this;
        }

        public Criteria andPpCostCollectorIdIn(List<BigDecimal> values) {
            addCriterion("pp_cost_collector_id in", values, "ppCostCollectorId");
            return (Criteria) this;
        }

        public Criteria andPpCostCollectorIdNotIn(List<BigDecimal> values) {
            addCriterion("pp_cost_collector_id not in", values, "ppCostCollectorId");
            return (Criteria) this;
        }

        public Criteria andPpCostCollectorIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pp_cost_collector_id between", value1, value2, "ppCostCollectorId");
            return (Criteria) this;
        }

        public Criteria andPpCostCollectorIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pp_cost_collector_id not between", value1, value2, "ppCostCollectorId");
            return (Criteria) this;
        }

        public Criteria andMPromotionIdIsNull() {
            addCriterion("m_promotion_id is null");
            return (Criteria) this;
        }

        public Criteria andMPromotionIdIsNotNull() {
            addCriterion("m_promotion_id is not null");
            return (Criteria) this;
        }

        public Criteria andMPromotionIdEqualTo(BigDecimal value) {
            addCriterion("m_promotion_id =", value, "mPromotionId");
            return (Criteria) this;
        }

        public Criteria andMPromotionIdNotEqualTo(BigDecimal value) {
            addCriterion("m_promotion_id <>", value, "mPromotionId");
            return (Criteria) this;
        }

        public Criteria andMPromotionIdGreaterThan(BigDecimal value) {
            addCriterion("m_promotion_id >", value, "mPromotionId");
            return (Criteria) this;
        }

        public Criteria andMPromotionIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m_promotion_id >=", value, "mPromotionId");
            return (Criteria) this;
        }

        public Criteria andMPromotionIdLessThan(BigDecimal value) {
            addCriterion("m_promotion_id <", value, "mPromotionId");
            return (Criteria) this;
        }

        public Criteria andMPromotionIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m_promotion_id <=", value, "mPromotionId");
            return (Criteria) this;
        }

        public Criteria andMPromotionIdIn(List<BigDecimal> values) {
            addCriterion("m_promotion_id in", values, "mPromotionId");
            return (Criteria) this;
        }

        public Criteria andMPromotionIdNotIn(List<BigDecimal> values) {
            addCriterion("m_promotion_id not in", values, "mPromotionId");
            return (Criteria) this;
        }

        public Criteria andMPromotionIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_promotion_id between", value1, value2, "mPromotionId");
            return (Criteria) this;
        }

        public Criteria andMPromotionIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_promotion_id not between", value1, value2, "mPromotionId");
            return (Criteria) this;
        }

        public Criteria andIsconsumesforecastIsNull() {
            addCriterion("isconsumesforecast is null");
            return (Criteria) this;
        }

        public Criteria andIsconsumesforecastIsNotNull() {
            addCriterion("isconsumesforecast is not null");
            return (Criteria) this;
        }

        public Criteria andIsconsumesforecastEqualTo(String value) {
            addCriterion("isconsumesforecast =", value, "isconsumesforecast");
            return (Criteria) this;
        }

        public Criteria andIsconsumesforecastNotEqualTo(String value) {
            addCriterion("isconsumesforecast <>", value, "isconsumesforecast");
            return (Criteria) this;
        }

        public Criteria andIsconsumesforecastGreaterThan(String value) {
            addCriterion("isconsumesforecast >", value, "isconsumesforecast");
            return (Criteria) this;
        }

        public Criteria andIsconsumesforecastGreaterThanOrEqualTo(String value) {
            addCriterion("isconsumesforecast >=", value, "isconsumesforecast");
            return (Criteria) this;
        }

        public Criteria andIsconsumesforecastLessThan(String value) {
            addCriterion("isconsumesforecast <", value, "isconsumesforecast");
            return (Criteria) this;
        }

        public Criteria andIsconsumesforecastLessThanOrEqualTo(String value) {
            addCriterion("isconsumesforecast <=", value, "isconsumesforecast");
            return (Criteria) this;
        }

        public Criteria andIsconsumesforecastLike(String value) {
            addCriterion("isconsumesforecast like", value, "isconsumesforecast");
            return (Criteria) this;
        }

        public Criteria andIsconsumesforecastNotLike(String value) {
            addCriterion("isconsumesforecast not like", value, "isconsumesforecast");
            return (Criteria) this;
        }

        public Criteria andIsconsumesforecastIn(List<String> values) {
            addCriterion("isconsumesforecast in", values, "isconsumesforecast");
            return (Criteria) this;
        }

        public Criteria andIsconsumesforecastNotIn(List<String> values) {
            addCriterion("isconsumesforecast not in", values, "isconsumesforecast");
            return (Criteria) this;
        }

        public Criteria andIsconsumesforecastBetween(String value1, String value2) {
            addCriterion("isconsumesforecast between", value1, value2, "isconsumesforecast");
            return (Criteria) this;
        }

        public Criteria andIsconsumesforecastNotBetween(String value1, String value2) {
            addCriterion("isconsumesforecast not between", value1, value2, "isconsumesforecast");
            return (Criteria) this;
        }

        public Criteria andCreatefromIsNull() {
            addCriterion("createfrom is null");
            return (Criteria) this;
        }

        public Criteria andCreatefromIsNotNull() {
            addCriterion("createfrom is not null");
            return (Criteria) this;
        }

        public Criteria andCreatefromEqualTo(String value) {
            addCriterion("createfrom =", value, "createfrom");
            return (Criteria) this;
        }

        public Criteria andCreatefromNotEqualTo(String value) {
            addCriterion("createfrom <>", value, "createfrom");
            return (Criteria) this;
        }

        public Criteria andCreatefromGreaterThan(String value) {
            addCriterion("createfrom >", value, "createfrom");
            return (Criteria) this;
        }

        public Criteria andCreatefromGreaterThanOrEqualTo(String value) {
            addCriterion("createfrom >=", value, "createfrom");
            return (Criteria) this;
        }

        public Criteria andCreatefromLessThan(String value) {
            addCriterion("createfrom <", value, "createfrom");
            return (Criteria) this;
        }

        public Criteria andCreatefromLessThanOrEqualTo(String value) {
            addCriterion("createfrom <=", value, "createfrom");
            return (Criteria) this;
        }

        public Criteria andCreatefromLike(String value) {
            addCriterion("createfrom like", value, "createfrom");
            return (Criteria) this;
        }

        public Criteria andCreatefromNotLike(String value) {
            addCriterion("createfrom not like", value, "createfrom");
            return (Criteria) this;
        }

        public Criteria andCreatefromIn(List<String> values) {
            addCriterion("createfrom in", values, "createfrom");
            return (Criteria) this;
        }

        public Criteria andCreatefromNotIn(List<String> values) {
            addCriterion("createfrom not in", values, "createfrom");
            return (Criteria) this;
        }

        public Criteria andCreatefromBetween(String value1, String value2) {
            addCriterion("createfrom between", value1, value2, "createfrom");
            return (Criteria) this;
        }

        public Criteria andCreatefromNotBetween(String value1, String value2) {
            addCriterion("createfrom not between", value1, value2, "createfrom");
            return (Criteria) this;
        }

        public Criteria andCreateshipmentIsNull() {
            addCriterion("createshipment is null");
            return (Criteria) this;
        }

        public Criteria andCreateshipmentIsNotNull() {
            addCriterion("createshipment is not null");
            return (Criteria) this;
        }

        public Criteria andCreateshipmentEqualTo(String value) {
            addCriterion("createshipment =", value, "createshipment");
            return (Criteria) this;
        }

        public Criteria andCreateshipmentNotEqualTo(String value) {
            addCriterion("createshipment <>", value, "createshipment");
            return (Criteria) this;
        }

        public Criteria andCreateshipmentGreaterThan(String value) {
            addCriterion("createshipment >", value, "createshipment");
            return (Criteria) this;
        }

        public Criteria andCreateshipmentGreaterThanOrEqualTo(String value) {
            addCriterion("createshipment >=", value, "createshipment");
            return (Criteria) this;
        }

        public Criteria andCreateshipmentLessThan(String value) {
            addCriterion("createshipment <", value, "createshipment");
            return (Criteria) this;
        }

        public Criteria andCreateshipmentLessThanOrEqualTo(String value) {
            addCriterion("createshipment <=", value, "createshipment");
            return (Criteria) this;
        }

        public Criteria andCreateshipmentLike(String value) {
            addCriterion("createshipment like", value, "createshipment");
            return (Criteria) this;
        }

        public Criteria andCreateshipmentNotLike(String value) {
            addCriterion("createshipment not like", value, "createshipment");
            return (Criteria) this;
        }

        public Criteria andCreateshipmentIn(List<String> values) {
            addCriterion("createshipment in", values, "createshipment");
            return (Criteria) this;
        }

        public Criteria andCreateshipmentNotIn(List<String> values) {
            addCriterion("createshipment not in", values, "createshipment");
            return (Criteria) this;
        }

        public Criteria andCreateshipmentBetween(String value1, String value2) {
            addCriterion("createshipment between", value1, value2, "createshipment");
            return (Criteria) this;
        }

        public Criteria andCreateshipmentNotBetween(String value1, String value2) {
            addCriterion("createshipment not between", value1, value2, "createshipment");
            return (Criteria) this;
        }

        public Criteria andAmazonasinIsNull() {
            addCriterion("amazonasin is null");
            return (Criteria) this;
        }

        public Criteria andAmazonasinIsNotNull() {
            addCriterion("amazonasin is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonasinEqualTo(String value) {
            addCriterion("amazonasin =", value, "amazonasin");
            return (Criteria) this;
        }

        public Criteria andAmazonasinNotEqualTo(String value) {
            addCriterion("amazonasin <>", value, "amazonasin");
            return (Criteria) this;
        }

        public Criteria andAmazonasinGreaterThan(String value) {
            addCriterion("amazonasin >", value, "amazonasin");
            return (Criteria) this;
        }

        public Criteria andAmazonasinGreaterThanOrEqualTo(String value) {
            addCriterion("amazonasin >=", value, "amazonasin");
            return (Criteria) this;
        }

        public Criteria andAmazonasinLessThan(String value) {
            addCriterion("amazonasin <", value, "amazonasin");
            return (Criteria) this;
        }

        public Criteria andAmazonasinLessThanOrEqualTo(String value) {
            addCriterion("amazonasin <=", value, "amazonasin");
            return (Criteria) this;
        }

        public Criteria andAmazonasinLike(String value) {
            addCriterion("amazonasin like", value, "amazonasin");
            return (Criteria) this;
        }

        public Criteria andAmazonasinNotLike(String value) {
            addCriterion("amazonasin not like", value, "amazonasin");
            return (Criteria) this;
        }

        public Criteria andAmazonasinIn(List<String> values) {
            addCriterion("amazonasin in", values, "amazonasin");
            return (Criteria) this;
        }

        public Criteria andAmazonasinNotIn(List<String> values) {
            addCriterion("amazonasin not in", values, "amazonasin");
            return (Criteria) this;
        }

        public Criteria andAmazonasinBetween(String value1, String value2) {
            addCriterion("amazonasin between", value1, value2, "amazonasin");
            return (Criteria) this;
        }

        public Criteria andAmazonasinNotBetween(String value1, String value2) {
            addCriterion("amazonasin not between", value1, value2, "amazonasin");
            return (Criteria) this;
        }

        public Criteria andAmazonskuIsNull() {
            addCriterion("amazonsku is null");
            return (Criteria) this;
        }

        public Criteria andAmazonskuIsNotNull() {
            addCriterion("amazonsku is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonskuEqualTo(String value) {
            addCriterion("amazonsku =", value, "amazonsku");
            return (Criteria) this;
        }

        public Criteria andAmazonskuNotEqualTo(String value) {
            addCriterion("amazonsku <>", value, "amazonsku");
            return (Criteria) this;
        }

        public Criteria andAmazonskuGreaterThan(String value) {
            addCriterion("amazonsku >", value, "amazonsku");
            return (Criteria) this;
        }

        public Criteria andAmazonskuGreaterThanOrEqualTo(String value) {
            addCriterion("amazonsku >=", value, "amazonsku");
            return (Criteria) this;
        }

        public Criteria andAmazonskuLessThan(String value) {
            addCriterion("amazonsku <", value, "amazonsku");
            return (Criteria) this;
        }

        public Criteria andAmazonskuLessThanOrEqualTo(String value) {
            addCriterion("amazonsku <=", value, "amazonsku");
            return (Criteria) this;
        }

        public Criteria andAmazonskuLike(String value) {
            addCriterion("amazonsku like", value, "amazonsku");
            return (Criteria) this;
        }

        public Criteria andAmazonskuNotLike(String value) {
            addCriterion("amazonsku not like", value, "amazonsku");
            return (Criteria) this;
        }

        public Criteria andAmazonskuIn(List<String> values) {
            addCriterion("amazonsku in", values, "amazonsku");
            return (Criteria) this;
        }

        public Criteria andAmazonskuNotIn(List<String> values) {
            addCriterion("amazonsku not in", values, "amazonsku");
            return (Criteria) this;
        }

        public Criteria andAmazonskuBetween(String value1, String value2) {
            addCriterion("amazonsku between", value1, value2, "amazonsku");
            return (Criteria) this;
        }

        public Criteria andAmazonskuNotBetween(String value1, String value2) {
            addCriterion("amazonsku not between", value1, value2, "amazonsku");
            return (Criteria) this;
        }

        public Criteria andAmazonitemstatusIsNull() {
            addCriterion("amazonitemstatus is null");
            return (Criteria) this;
        }

        public Criteria andAmazonitemstatusIsNotNull() {
            addCriterion("amazonitemstatus is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonitemstatusEqualTo(String value) {
            addCriterion("amazonitemstatus =", value, "amazonitemstatus");
            return (Criteria) this;
        }

        public Criteria andAmazonitemstatusNotEqualTo(String value) {
            addCriterion("amazonitemstatus <>", value, "amazonitemstatus");
            return (Criteria) this;
        }

        public Criteria andAmazonitemstatusGreaterThan(String value) {
            addCriterion("amazonitemstatus >", value, "amazonitemstatus");
            return (Criteria) this;
        }

        public Criteria andAmazonitemstatusGreaterThanOrEqualTo(String value) {
            addCriterion("amazonitemstatus >=", value, "amazonitemstatus");
            return (Criteria) this;
        }

        public Criteria andAmazonitemstatusLessThan(String value) {
            addCriterion("amazonitemstatus <", value, "amazonitemstatus");
            return (Criteria) this;
        }

        public Criteria andAmazonitemstatusLessThanOrEqualTo(String value) {
            addCriterion("amazonitemstatus <=", value, "amazonitemstatus");
            return (Criteria) this;
        }

        public Criteria andAmazonitemstatusLike(String value) {
            addCriterion("amazonitemstatus like", value, "amazonitemstatus");
            return (Criteria) this;
        }

        public Criteria andAmazonitemstatusNotLike(String value) {
            addCriterion("amazonitemstatus not like", value, "amazonitemstatus");
            return (Criteria) this;
        }

        public Criteria andAmazonitemstatusIn(List<String> values) {
            addCriterion("amazonitemstatus in", values, "amazonitemstatus");
            return (Criteria) this;
        }

        public Criteria andAmazonitemstatusNotIn(List<String> values) {
            addCriterion("amazonitemstatus not in", values, "amazonitemstatus");
            return (Criteria) this;
        }

        public Criteria andAmazonitemstatusBetween(String value1, String value2) {
            addCriterion("amazonitemstatus between", value1, value2, "amazonitemstatus");
            return (Criteria) this;
        }

        public Criteria andAmazonitemstatusNotBetween(String value1, String value2) {
            addCriterion("amazonitemstatus not between", value1, value2, "amazonitemstatus");
            return (Criteria) this;
        }

        public Criteria andAmazonproductnameIsNull() {
            addCriterion("amazonproductname is null");
            return (Criteria) this;
        }

        public Criteria andAmazonproductnameIsNotNull() {
            addCriterion("amazonproductname is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonproductnameEqualTo(String value) {
            addCriterion("amazonproductname =", value, "amazonproductname");
            return (Criteria) this;
        }

        public Criteria andAmazonproductnameNotEqualTo(String value) {
            addCriterion("amazonproductname <>", value, "amazonproductname");
            return (Criteria) this;
        }

        public Criteria andAmazonproductnameGreaterThan(String value) {
            addCriterion("amazonproductname >", value, "amazonproductname");
            return (Criteria) this;
        }

        public Criteria andAmazonproductnameGreaterThanOrEqualTo(String value) {
            addCriterion("amazonproductname >=", value, "amazonproductname");
            return (Criteria) this;
        }

        public Criteria andAmazonproductnameLessThan(String value) {
            addCriterion("amazonproductname <", value, "amazonproductname");
            return (Criteria) this;
        }

        public Criteria andAmazonproductnameLessThanOrEqualTo(String value) {
            addCriterion("amazonproductname <=", value, "amazonproductname");
            return (Criteria) this;
        }

        public Criteria andAmazonproductnameLike(String value) {
            addCriterion("amazonproductname like", value, "amazonproductname");
            return (Criteria) this;
        }

        public Criteria andAmazonproductnameNotLike(String value) {
            addCriterion("amazonproductname not like", value, "amazonproductname");
            return (Criteria) this;
        }

        public Criteria andAmazonproductnameIn(List<String> values) {
            addCriterion("amazonproductname in", values, "amazonproductname");
            return (Criteria) this;
        }

        public Criteria andAmazonproductnameNotIn(List<String> values) {
            addCriterion("amazonproductname not in", values, "amazonproductname");
            return (Criteria) this;
        }

        public Criteria andAmazonproductnameBetween(String value1, String value2) {
            addCriterion("amazonproductname between", value1, value2, "amazonproductname");
            return (Criteria) this;
        }

        public Criteria andAmazonproductnameNotBetween(String value1, String value2) {
            addCriterion("amazonproductname not between", value1, value2, "amazonproductname");
            return (Criteria) this;
        }

        public Criteria andAmazonquantityIsNull() {
            addCriterion("amazonquantity is null");
            return (Criteria) this;
        }

        public Criteria andAmazonquantityIsNotNull() {
            addCriterion("amazonquantity is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonquantityEqualTo(BigDecimal value) {
            addCriterion("amazonquantity =", value, "amazonquantity");
            return (Criteria) this;
        }

        public Criteria andAmazonquantityNotEqualTo(BigDecimal value) {
            addCriterion("amazonquantity <>", value, "amazonquantity");
            return (Criteria) this;
        }

        public Criteria andAmazonquantityGreaterThan(BigDecimal value) {
            addCriterion("amazonquantity >", value, "amazonquantity");
            return (Criteria) this;
        }

        public Criteria andAmazonquantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amazonquantity >=", value, "amazonquantity");
            return (Criteria) this;
        }

        public Criteria andAmazonquantityLessThan(BigDecimal value) {
            addCriterion("amazonquantity <", value, "amazonquantity");
            return (Criteria) this;
        }

        public Criteria andAmazonquantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amazonquantity <=", value, "amazonquantity");
            return (Criteria) this;
        }

        public Criteria andAmazonquantityIn(List<BigDecimal> values) {
            addCriterion("amazonquantity in", values, "amazonquantity");
            return (Criteria) this;
        }

        public Criteria andAmazonquantityNotIn(List<BigDecimal> values) {
            addCriterion("amazonquantity not in", values, "amazonquantity");
            return (Criteria) this;
        }

        public Criteria andAmazonquantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amazonquantity between", value1, value2, "amazonquantity");
            return (Criteria) this;
        }

        public Criteria andAmazonquantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amazonquantity not between", value1, value2, "amazonquantity");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotionidIsNull() {
            addCriterion("amazonpromotionid is null");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotionidIsNotNull() {
            addCriterion("amazonpromotionid is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotionidEqualTo(String value) {
            addCriterion("amazonpromotionid =", value, "amazonpromotionid");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotionidNotEqualTo(String value) {
            addCriterion("amazonpromotionid <>", value, "amazonpromotionid");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotionidGreaterThan(String value) {
            addCriterion("amazonpromotionid >", value, "amazonpromotionid");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotionidGreaterThanOrEqualTo(String value) {
            addCriterion("amazonpromotionid >=", value, "amazonpromotionid");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotionidLessThan(String value) {
            addCriterion("amazonpromotionid <", value, "amazonpromotionid");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotionidLessThanOrEqualTo(String value) {
            addCriterion("amazonpromotionid <=", value, "amazonpromotionid");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotionidLike(String value) {
            addCriterion("amazonpromotionid like", value, "amazonpromotionid");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotionidNotLike(String value) {
            addCriterion("amazonpromotionid not like", value, "amazonpromotionid");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotionidIn(List<String> values) {
            addCriterion("amazonpromotionid in", values, "amazonpromotionid");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotionidNotIn(List<String> values) {
            addCriterion("amazonpromotionid not in", values, "amazonpromotionid");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotionidBetween(String value1, String value2) {
            addCriterion("amazonpromotionid between", value1, value2, "amazonpromotionid");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotionidNotBetween(String value1, String value2) {
            addCriterion("amazonpromotionid not between", value1, value2, "amazonpromotionid");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotiondiscountIsNull() {
            addCriterion("amazonpromotiondiscount is null");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotiondiscountIsNotNull() {
            addCriterion("amazonpromotiondiscount is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotiondiscountEqualTo(BigDecimal value) {
            addCriterion("amazonpromotiondiscount =", value, "amazonpromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotiondiscountNotEqualTo(BigDecimal value) {
            addCriterion("amazonpromotiondiscount <>", value, "amazonpromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotiondiscountGreaterThan(BigDecimal value) {
            addCriterion("amazonpromotiondiscount >", value, "amazonpromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotiondiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amazonpromotiondiscount >=", value, "amazonpromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotiondiscountLessThan(BigDecimal value) {
            addCriterion("amazonpromotiondiscount <", value, "amazonpromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotiondiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amazonpromotiondiscount <=", value, "amazonpromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotiondiscountIn(List<BigDecimal> values) {
            addCriterion("amazonpromotiondiscount in", values, "amazonpromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotiondiscountNotIn(List<BigDecimal> values) {
            addCriterion("amazonpromotiondiscount not in", values, "amazonpromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotiondiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amazonpromotiondiscount between", value1, value2, "amazonpromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andAmazonpromotiondiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amazonpromotiondiscount not between", value1, value2, "amazonpromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andItempromotiondiscountIsNull() {
            addCriterion("itempromotiondiscount is null");
            return (Criteria) this;
        }

        public Criteria andItempromotiondiscountIsNotNull() {
            addCriterion("itempromotiondiscount is not null");
            return (Criteria) this;
        }

        public Criteria andItempromotiondiscountEqualTo(BigDecimal value) {
            addCriterion("itempromotiondiscount =", value, "itempromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andItempromotiondiscountNotEqualTo(BigDecimal value) {
            addCriterion("itempromotiondiscount <>", value, "itempromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andItempromotiondiscountGreaterThan(BigDecimal value) {
            addCriterion("itempromotiondiscount >", value, "itempromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andItempromotiondiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("itempromotiondiscount >=", value, "itempromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andItempromotiondiscountLessThan(BigDecimal value) {
            addCriterion("itempromotiondiscount <", value, "itempromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andItempromotiondiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("itempromotiondiscount <=", value, "itempromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andItempromotiondiscountIn(List<BigDecimal> values) {
            addCriterion("itempromotiondiscount in", values, "itempromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andItempromotiondiscountNotIn(List<BigDecimal> values) {
            addCriterion("itempromotiondiscount not in", values, "itempromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andItempromotiondiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("itempromotiondiscount between", value1, value2, "itempromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andItempromotiondiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("itempromotiondiscount not between", value1, value2, "itempromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andShippromotiondiscountIsNull() {
            addCriterion("shippromotiondiscount is null");
            return (Criteria) this;
        }

        public Criteria andShippromotiondiscountIsNotNull() {
            addCriterion("shippromotiondiscount is not null");
            return (Criteria) this;
        }

        public Criteria andShippromotiondiscountEqualTo(BigDecimal value) {
            addCriterion("shippromotiondiscount =", value, "shippromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andShippromotiondiscountNotEqualTo(BigDecimal value) {
            addCriterion("shippromotiondiscount <>", value, "shippromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andShippromotiondiscountGreaterThan(BigDecimal value) {
            addCriterion("shippromotiondiscount >", value, "shippromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andShippromotiondiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shippromotiondiscount >=", value, "shippromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andShippromotiondiscountLessThan(BigDecimal value) {
            addCriterion("shippromotiondiscount <", value, "shippromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andShippromotiondiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shippromotiondiscount <=", value, "shippromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andShippromotiondiscountIn(List<BigDecimal> values) {
            addCriterion("shippromotiondiscount in", values, "shippromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andShippromotiondiscountNotIn(List<BigDecimal> values) {
            addCriterion("shippromotiondiscount not in", values, "shippromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andShippromotiondiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shippromotiondiscount between", value1, value2, "shippromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andShippromotiondiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shippromotiondiscount not between", value1, value2, "shippromotiondiscount");
            return (Criteria) this;
        }

        public Criteria andBoxQtyIsNull() {
            addCriterion("box_qty is null");
            return (Criteria) this;
        }

        public Criteria andBoxQtyIsNotNull() {
            addCriterion("box_qty is not null");
            return (Criteria) this;
        }

        public Criteria andBoxQtyEqualTo(BigDecimal value) {
            addCriterion("box_qty =", value, "boxQty");
            return (Criteria) this;
        }

        public Criteria andBoxQtyNotEqualTo(BigDecimal value) {
            addCriterion("box_qty <>", value, "boxQty");
            return (Criteria) this;
        }

        public Criteria andBoxQtyGreaterThan(BigDecimal value) {
            addCriterion("box_qty >", value, "boxQty");
            return (Criteria) this;
        }

        public Criteria andBoxQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("box_qty >=", value, "boxQty");
            return (Criteria) this;
        }

        public Criteria andBoxQtyLessThan(BigDecimal value) {
            addCriterion("box_qty <", value, "boxQty");
            return (Criteria) this;
        }

        public Criteria andBoxQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("box_qty <=", value, "boxQty");
            return (Criteria) this;
        }

        public Criteria andBoxQtyIn(List<BigDecimal> values) {
            addCriterion("box_qty in", values, "boxQty");
            return (Criteria) this;
        }

        public Criteria andBoxQtyNotIn(List<BigDecimal> values) {
            addCriterion("box_qty not in", values, "boxQty");
            return (Criteria) this;
        }

        public Criteria andBoxQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("box_qty between", value1, value2, "boxQty");
            return (Criteria) this;
        }

        public Criteria andBoxQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("box_qty not between", value1, value2, "boxQty");
            return (Criteria) this;
        }

        public Criteria andQtyBoxIsNull() {
            addCriterion("qty_box is null");
            return (Criteria) this;
        }

        public Criteria andQtyBoxIsNotNull() {
            addCriterion("qty_box is not null");
            return (Criteria) this;
        }

        public Criteria andQtyBoxEqualTo(BigDecimal value) {
            addCriterion("qty_box =", value, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andQtyBoxNotEqualTo(BigDecimal value) {
            addCriterion("qty_box <>", value, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andQtyBoxGreaterThan(BigDecimal value) {
            addCriterion("qty_box >", value, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andQtyBoxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("qty_box >=", value, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andQtyBoxLessThan(BigDecimal value) {
            addCriterion("qty_box <", value, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andQtyBoxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("qty_box <=", value, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andQtyBoxIn(List<BigDecimal> values) {
            addCriterion("qty_box in", values, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andQtyBoxNotIn(List<BigDecimal> values) {
            addCriterion("qty_box not in", values, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andQtyBoxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qty_box between", value1, value2, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andQtyBoxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qty_box not between", value1, value2, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andTaxamtIsNull() {
            addCriterion("taxamt is null");
            return (Criteria) this;
        }

        public Criteria andTaxamtIsNotNull() {
            addCriterion("taxamt is not null");
            return (Criteria) this;
        }

        public Criteria andTaxamtEqualTo(BigDecimal value) {
            addCriterion("taxamt =", value, "taxamt");
            return (Criteria) this;
        }

        public Criteria andTaxamtNotEqualTo(BigDecimal value) {
            addCriterion("taxamt <>", value, "taxamt");
            return (Criteria) this;
        }

        public Criteria andTaxamtGreaterThan(BigDecimal value) {
            addCriterion("taxamt >", value, "taxamt");
            return (Criteria) this;
        }

        public Criteria andTaxamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("taxamt >=", value, "taxamt");
            return (Criteria) this;
        }

        public Criteria andTaxamtLessThan(BigDecimal value) {
            addCriterion("taxamt <", value, "taxamt");
            return (Criteria) this;
        }

        public Criteria andTaxamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("taxamt <=", value, "taxamt");
            return (Criteria) this;
        }

        public Criteria andTaxamtIn(List<BigDecimal> values) {
            addCriterion("taxamt in", values, "taxamt");
            return (Criteria) this;
        }

        public Criteria andTaxamtNotIn(List<BigDecimal> values) {
            addCriterion("taxamt not in", values, "taxamt");
            return (Criteria) this;
        }

        public Criteria andTaxamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxamt between", value1, value2, "taxamt");
            return (Criteria) this;
        }

        public Criteria andTaxamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taxamt not between", value1, value2, "taxamt");
            return (Criteria) this;
        }

        public Criteria andChargeamtIsNull() {
            addCriterion("chargeamt is null");
            return (Criteria) this;
        }

        public Criteria andChargeamtIsNotNull() {
            addCriterion("chargeamt is not null");
            return (Criteria) this;
        }

        public Criteria andChargeamtEqualTo(BigDecimal value) {
            addCriterion("chargeamt =", value, "chargeamt");
            return (Criteria) this;
        }

        public Criteria andChargeamtNotEqualTo(BigDecimal value) {
            addCriterion("chargeamt <>", value, "chargeamt");
            return (Criteria) this;
        }

        public Criteria andChargeamtGreaterThan(BigDecimal value) {
            addCriterion("chargeamt >", value, "chargeamt");
            return (Criteria) this;
        }

        public Criteria andChargeamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("chargeamt >=", value, "chargeamt");
            return (Criteria) this;
        }

        public Criteria andChargeamtLessThan(BigDecimal value) {
            addCriterion("chargeamt <", value, "chargeamt");
            return (Criteria) this;
        }

        public Criteria andChargeamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("chargeamt <=", value, "chargeamt");
            return (Criteria) this;
        }

        public Criteria andChargeamtIn(List<BigDecimal> values) {
            addCriterion("chargeamt in", values, "chargeamt");
            return (Criteria) this;
        }

        public Criteria andChargeamtNotIn(List<BigDecimal> values) {
            addCriterion("chargeamt not in", values, "chargeamt");
            return (Criteria) this;
        }

        public Criteria andChargeamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chargeamt between", value1, value2, "chargeamt");
            return (Criteria) this;
        }

        public Criteria andChargeamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chargeamt not between", value1, value2, "chargeamt");
            return (Criteria) this;
        }

        public Criteria andLinetotalamtIsNull() {
            addCriterion("linetotalamt is null");
            return (Criteria) this;
        }

        public Criteria andLinetotalamtIsNotNull() {
            addCriterion("linetotalamt is not null");
            return (Criteria) this;
        }

        public Criteria andLinetotalamtEqualTo(BigDecimal value) {
            addCriterion("linetotalamt =", value, "linetotalamt");
            return (Criteria) this;
        }

        public Criteria andLinetotalamtNotEqualTo(BigDecimal value) {
            addCriterion("linetotalamt <>", value, "linetotalamt");
            return (Criteria) this;
        }

        public Criteria andLinetotalamtGreaterThan(BigDecimal value) {
            addCriterion("linetotalamt >", value, "linetotalamt");
            return (Criteria) this;
        }

        public Criteria andLinetotalamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("linetotalamt >=", value, "linetotalamt");
            return (Criteria) this;
        }

        public Criteria andLinetotalamtLessThan(BigDecimal value) {
            addCriterion("linetotalamt <", value, "linetotalamt");
            return (Criteria) this;
        }

        public Criteria andLinetotalamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("linetotalamt <=", value, "linetotalamt");
            return (Criteria) this;
        }

        public Criteria andLinetotalamtIn(List<BigDecimal> values) {
            addCriterion("linetotalamt in", values, "linetotalamt");
            return (Criteria) this;
        }

        public Criteria andLinetotalamtNotIn(List<BigDecimal> values) {
            addCriterion("linetotalamt not in", values, "linetotalamt");
            return (Criteria) this;
        }

        public Criteria andLinetotalamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("linetotalamt between", value1, value2, "linetotalamt");
            return (Criteria) this;
        }

        public Criteria andLinetotalamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("linetotalamt not between", value1, value2, "linetotalamt");
            return (Criteria) this;
        }

        public Criteria andBoxwidthIsNull() {
            addCriterion("boxwidth is null");
            return (Criteria) this;
        }

        public Criteria andBoxwidthIsNotNull() {
            addCriterion("boxwidth is not null");
            return (Criteria) this;
        }

        public Criteria andBoxwidthEqualTo(BigDecimal value) {
            addCriterion("boxwidth =", value, "boxwidth");
            return (Criteria) this;
        }

        public Criteria andBoxwidthNotEqualTo(BigDecimal value) {
            addCriterion("boxwidth <>", value, "boxwidth");
            return (Criteria) this;
        }

        public Criteria andBoxwidthGreaterThan(BigDecimal value) {
            addCriterion("boxwidth >", value, "boxwidth");
            return (Criteria) this;
        }

        public Criteria andBoxwidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("boxwidth >=", value, "boxwidth");
            return (Criteria) this;
        }

        public Criteria andBoxwidthLessThan(BigDecimal value) {
            addCriterion("boxwidth <", value, "boxwidth");
            return (Criteria) this;
        }

        public Criteria andBoxwidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("boxwidth <=", value, "boxwidth");
            return (Criteria) this;
        }

        public Criteria andBoxwidthIn(List<BigDecimal> values) {
            addCriterion("boxwidth in", values, "boxwidth");
            return (Criteria) this;
        }

        public Criteria andBoxwidthNotIn(List<BigDecimal> values) {
            addCriterion("boxwidth not in", values, "boxwidth");
            return (Criteria) this;
        }

        public Criteria andBoxwidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("boxwidth between", value1, value2, "boxwidth");
            return (Criteria) this;
        }

        public Criteria andBoxwidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("boxwidth not between", value1, value2, "boxwidth");
            return (Criteria) this;
        }

        public Criteria andBoxlengthIsNull() {
            addCriterion("boxlength is null");
            return (Criteria) this;
        }

        public Criteria andBoxlengthIsNotNull() {
            addCriterion("boxlength is not null");
            return (Criteria) this;
        }

        public Criteria andBoxlengthEqualTo(BigDecimal value) {
            addCriterion("boxlength =", value, "boxlength");
            return (Criteria) this;
        }

        public Criteria andBoxlengthNotEqualTo(BigDecimal value) {
            addCriterion("boxlength <>", value, "boxlength");
            return (Criteria) this;
        }

        public Criteria andBoxlengthGreaterThan(BigDecimal value) {
            addCriterion("boxlength >", value, "boxlength");
            return (Criteria) this;
        }

        public Criteria andBoxlengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("boxlength >=", value, "boxlength");
            return (Criteria) this;
        }

        public Criteria andBoxlengthLessThan(BigDecimal value) {
            addCriterion("boxlength <", value, "boxlength");
            return (Criteria) this;
        }

        public Criteria andBoxlengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("boxlength <=", value, "boxlength");
            return (Criteria) this;
        }

        public Criteria andBoxlengthIn(List<BigDecimal> values) {
            addCriterion("boxlength in", values, "boxlength");
            return (Criteria) this;
        }

        public Criteria andBoxlengthNotIn(List<BigDecimal> values) {
            addCriterion("boxlength not in", values, "boxlength");
            return (Criteria) this;
        }

        public Criteria andBoxlengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("boxlength between", value1, value2, "boxlength");
            return (Criteria) this;
        }

        public Criteria andBoxlengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("boxlength not between", value1, value2, "boxlength");
            return (Criteria) this;
        }

        public Criteria andBoxheightIsNull() {
            addCriterion("boxheight is null");
            return (Criteria) this;
        }

        public Criteria andBoxheightIsNotNull() {
            addCriterion("boxheight is not null");
            return (Criteria) this;
        }

        public Criteria andBoxheightEqualTo(BigDecimal value) {
            addCriterion("boxheight =", value, "boxheight");
            return (Criteria) this;
        }

        public Criteria andBoxheightNotEqualTo(BigDecimal value) {
            addCriterion("boxheight <>", value, "boxheight");
            return (Criteria) this;
        }

        public Criteria andBoxheightGreaterThan(BigDecimal value) {
            addCriterion("boxheight >", value, "boxheight");
            return (Criteria) this;
        }

        public Criteria andBoxheightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("boxheight >=", value, "boxheight");
            return (Criteria) this;
        }

        public Criteria andBoxheightLessThan(BigDecimal value) {
            addCriterion("boxheight <", value, "boxheight");
            return (Criteria) this;
        }

        public Criteria andBoxheightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("boxheight <=", value, "boxheight");
            return (Criteria) this;
        }

        public Criteria andBoxheightIn(List<BigDecimal> values) {
            addCriterion("boxheight in", values, "boxheight");
            return (Criteria) this;
        }

        public Criteria andBoxheightNotIn(List<BigDecimal> values) {
            addCriterion("boxheight not in", values, "boxheight");
            return (Criteria) this;
        }

        public Criteria andBoxheightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("boxheight between", value1, value2, "boxheight");
            return (Criteria) this;
        }

        public Criteria andBoxheightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("boxheight not between", value1, value2, "boxheight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIsNull() {
            addCriterion("gross_weight is null");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIsNotNull() {
            addCriterion("gross_weight is not null");
            return (Criteria) this;
        }

        public Criteria andGrossWeightEqualTo(BigDecimal value) {
            addCriterion("gross_weight =", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotEqualTo(BigDecimal value) {
            addCriterion("gross_weight <>", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightGreaterThan(BigDecimal value) {
            addCriterion("gross_weight >", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gross_weight >=", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightLessThan(BigDecimal value) {
            addCriterion("gross_weight <", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gross_weight <=", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIn(List<BigDecimal> values) {
            addCriterion("gross_weight in", values, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotIn(List<BigDecimal> values) {
            addCriterion("gross_weight not in", values, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gross_weight between", value1, value2, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gross_weight not between", value1, value2, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightIsNull() {
            addCriterion("net_weight is null");
            return (Criteria) this;
        }

        public Criteria andNetWeightIsNotNull() {
            addCriterion("net_weight is not null");
            return (Criteria) this;
        }

        public Criteria andNetWeightEqualTo(BigDecimal value) {
            addCriterion("net_weight =", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightNotEqualTo(BigDecimal value) {
            addCriterion("net_weight <>", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightGreaterThan(BigDecimal value) {
            addCriterion("net_weight >", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("net_weight >=", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightLessThan(BigDecimal value) {
            addCriterion("net_weight <", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("net_weight <=", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightIn(List<BigDecimal> values) {
            addCriterion("net_weight in", values, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightNotIn(List<BigDecimal> values) {
            addCriterion("net_weight not in", values, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_weight between", value1, value2, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("net_weight not between", value1, value2, "netWeight");
            return (Criteria) this;
        }

        public Criteria andInspectiondateIsNull() {
            addCriterion("inspectiondate is null");
            return (Criteria) this;
        }

        public Criteria andInspectiondateIsNotNull() {
            addCriterion("inspectiondate is not null");
            return (Criteria) this;
        }

        public Criteria andInspectiondateEqualTo(Date value) {
            addCriterion("inspectiondate =", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateNotEqualTo(Date value) {
            addCriterion("inspectiondate <>", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateGreaterThan(Date value) {
            addCriterion("inspectiondate >", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateGreaterThanOrEqualTo(Date value) {
            addCriterion("inspectiondate >=", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateLessThan(Date value) {
            addCriterion("inspectiondate <", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateLessThanOrEqualTo(Date value) {
            addCriterion("inspectiondate <=", value, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateIn(List<Date> values) {
            addCriterion("inspectiondate in", values, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateNotIn(List<Date> values) {
            addCriterion("inspectiondate not in", values, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateBetween(Date value1, Date value2) {
            addCriterion("inspectiondate between", value1, value2, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectiondateNotBetween(Date value1, Date value2) {
            addCriterion("inspectiondate not between", value1, value2, "inspectiondate");
            return (Criteria) this;
        }

        public Criteria andInspectionstatusIsNull() {
            addCriterion("inspectionstatus is null");
            return (Criteria) this;
        }

        public Criteria andInspectionstatusIsNotNull() {
            addCriterion("inspectionstatus is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionstatusEqualTo(String value) {
            addCriterion("inspectionstatus =", value, "inspectionstatus");
            return (Criteria) this;
        }

        public Criteria andInspectionstatusNotEqualTo(String value) {
            addCriterion("inspectionstatus <>", value, "inspectionstatus");
            return (Criteria) this;
        }

        public Criteria andInspectionstatusGreaterThan(String value) {
            addCriterion("inspectionstatus >", value, "inspectionstatus");
            return (Criteria) this;
        }

        public Criteria andInspectionstatusGreaterThanOrEqualTo(String value) {
            addCriterion("inspectionstatus >=", value, "inspectionstatus");
            return (Criteria) this;
        }

        public Criteria andInspectionstatusLessThan(String value) {
            addCriterion("inspectionstatus <", value, "inspectionstatus");
            return (Criteria) this;
        }

        public Criteria andInspectionstatusLessThanOrEqualTo(String value) {
            addCriterion("inspectionstatus <=", value, "inspectionstatus");
            return (Criteria) this;
        }

        public Criteria andInspectionstatusLike(String value) {
            addCriterion("inspectionstatus like", value, "inspectionstatus");
            return (Criteria) this;
        }

        public Criteria andInspectionstatusNotLike(String value) {
            addCriterion("inspectionstatus not like", value, "inspectionstatus");
            return (Criteria) this;
        }

        public Criteria andInspectionstatusIn(List<String> values) {
            addCriterion("inspectionstatus in", values, "inspectionstatus");
            return (Criteria) this;
        }

        public Criteria andInspectionstatusNotIn(List<String> values) {
            addCriterion("inspectionstatus not in", values, "inspectionstatus");
            return (Criteria) this;
        }

        public Criteria andInspectionstatusBetween(String value1, String value2) {
            addCriterion("inspectionstatus between", value1, value2, "inspectionstatus");
            return (Criteria) this;
        }

        public Criteria andInspectionstatusNotBetween(String value1, String value2) {
            addCriterion("inspectionstatus not between", value1, value2, "inspectionstatus");
            return (Criteria) this;
        }

        public Criteria andInspectiondescriptionIsNull() {
            addCriterion("inspectiondescription is null");
            return (Criteria) this;
        }

        public Criteria andInspectiondescriptionIsNotNull() {
            addCriterion("inspectiondescription is not null");
            return (Criteria) this;
        }

        public Criteria andInspectiondescriptionEqualTo(String value) {
            addCriterion("inspectiondescription =", value, "inspectiondescription");
            return (Criteria) this;
        }

        public Criteria andInspectiondescriptionNotEqualTo(String value) {
            addCriterion("inspectiondescription <>", value, "inspectiondescription");
            return (Criteria) this;
        }

        public Criteria andInspectiondescriptionGreaterThan(String value) {
            addCriterion("inspectiondescription >", value, "inspectiondescription");
            return (Criteria) this;
        }

        public Criteria andInspectiondescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("inspectiondescription >=", value, "inspectiondescription");
            return (Criteria) this;
        }

        public Criteria andInspectiondescriptionLessThan(String value) {
            addCriterion("inspectiondescription <", value, "inspectiondescription");
            return (Criteria) this;
        }

        public Criteria andInspectiondescriptionLessThanOrEqualTo(String value) {
            addCriterion("inspectiondescription <=", value, "inspectiondescription");
            return (Criteria) this;
        }

        public Criteria andInspectiondescriptionLike(String value) {
            addCriterion("inspectiondescription like", value, "inspectiondescription");
            return (Criteria) this;
        }

        public Criteria andInspectiondescriptionNotLike(String value) {
            addCriterion("inspectiondescription not like", value, "inspectiondescription");
            return (Criteria) this;
        }

        public Criteria andInspectiondescriptionIn(List<String> values) {
            addCriterion("inspectiondescription in", values, "inspectiondescription");
            return (Criteria) this;
        }

        public Criteria andInspectiondescriptionNotIn(List<String> values) {
            addCriterion("inspectiondescription not in", values, "inspectiondescription");
            return (Criteria) this;
        }

        public Criteria andInspectiondescriptionBetween(String value1, String value2) {
            addCriterion("inspectiondescription between", value1, value2, "inspectiondescription");
            return (Criteria) this;
        }

        public Criteria andInspectiondescriptionNotBetween(String value1, String value2) {
            addCriterion("inspectiondescription not between", value1, value2, "inspectiondescription");
            return (Criteria) this;
        }

        public Criteria andInspectorIsNull() {
            addCriterion("inspector is null");
            return (Criteria) this;
        }

        public Criteria andInspectorIsNotNull() {
            addCriterion("inspector is not null");
            return (Criteria) this;
        }

        public Criteria andInspectorEqualTo(String value) {
            addCriterion("inspector =", value, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorNotEqualTo(String value) {
            addCriterion("inspector <>", value, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorGreaterThan(String value) {
            addCriterion("inspector >", value, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorGreaterThanOrEqualTo(String value) {
            addCriterion("inspector >=", value, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorLessThan(String value) {
            addCriterion("inspector <", value, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorLessThanOrEqualTo(String value) {
            addCriterion("inspector <=", value, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorLike(String value) {
            addCriterion("inspector like", value, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorNotLike(String value) {
            addCriterion("inspector not like", value, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorIn(List<String> values) {
            addCriterion("inspector in", values, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorNotIn(List<String> values) {
            addCriterion("inspector not in", values, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorBetween(String value1, String value2) {
            addCriterion("inspector between", value1, value2, "inspector");
            return (Criteria) this;
        }

        public Criteria andInspectorNotBetween(String value1, String value2) {
            addCriterion("inspector not between", value1, value2, "inspector");
            return (Criteria) this;
        }

        public Criteria andBoxvolumeIsNull() {
            addCriterion("boxvolume is null");
            return (Criteria) this;
        }

        public Criteria andBoxvolumeIsNotNull() {
            addCriterion("boxvolume is not null");
            return (Criteria) this;
        }

        public Criteria andBoxvolumeEqualTo(BigDecimal value) {
            addCriterion("boxvolume =", value, "boxvolume");
            return (Criteria) this;
        }

        public Criteria andBoxvolumeNotEqualTo(BigDecimal value) {
            addCriterion("boxvolume <>", value, "boxvolume");
            return (Criteria) this;
        }

        public Criteria andBoxvolumeGreaterThan(BigDecimal value) {
            addCriterion("boxvolume >", value, "boxvolume");
            return (Criteria) this;
        }

        public Criteria andBoxvolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("boxvolume >=", value, "boxvolume");
            return (Criteria) this;
        }

        public Criteria andBoxvolumeLessThan(BigDecimal value) {
            addCriterion("boxvolume <", value, "boxvolume");
            return (Criteria) this;
        }

        public Criteria andBoxvolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("boxvolume <=", value, "boxvolume");
            return (Criteria) this;
        }

        public Criteria andBoxvolumeIn(List<BigDecimal> values) {
            addCriterion("boxvolume in", values, "boxvolume");
            return (Criteria) this;
        }

        public Criteria andBoxvolumeNotIn(List<BigDecimal> values) {
            addCriterion("boxvolume not in", values, "boxvolume");
            return (Criteria) this;
        }

        public Criteria andBoxvolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("boxvolume between", value1, value2, "boxvolume");
            return (Criteria) this;
        }

        public Criteria andBoxvolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("boxvolume not between", value1, value2, "boxvolume");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentIsNull() {
            addCriterion("inspectioncontent is null");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentIsNotNull() {
            addCriterion("inspectioncontent is not null");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentEqualTo(String value) {
            addCriterion("inspectioncontent =", value, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentNotEqualTo(String value) {
            addCriterion("inspectioncontent <>", value, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentGreaterThan(String value) {
            addCriterion("inspectioncontent >", value, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentGreaterThanOrEqualTo(String value) {
            addCriterion("inspectioncontent >=", value, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentLessThan(String value) {
            addCriterion("inspectioncontent <", value, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentLessThanOrEqualTo(String value) {
            addCriterion("inspectioncontent <=", value, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentLike(String value) {
            addCriterion("inspectioncontent like", value, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentNotLike(String value) {
            addCriterion("inspectioncontent not like", value, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentIn(List<String> values) {
            addCriterion("inspectioncontent in", values, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentNotIn(List<String> values) {
            addCriterion("inspectioncontent not in", values, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentBetween(String value1, String value2) {
            addCriterion("inspectioncontent between", value1, value2, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andInspectioncontentNotBetween(String value1, String value2) {
            addCriterion("inspectioncontent not between", value1, value2, "inspectioncontent");
            return (Criteria) this;
        }

        public Criteria andMFnskuIsNull() {
            addCriterion("m_fnsku is null");
            return (Criteria) this;
        }

        public Criteria andMFnskuIsNotNull() {
            addCriterion("m_fnsku is not null");
            return (Criteria) this;
        }

        public Criteria andMFnskuEqualTo(String value) {
            addCriterion("m_fnsku =", value, "mFnsku");
            return (Criteria) this;
        }

        public Criteria andMFnskuNotEqualTo(String value) {
            addCriterion("m_fnsku <>", value, "mFnsku");
            return (Criteria) this;
        }

        public Criteria andMFnskuGreaterThan(String value) {
            addCriterion("m_fnsku >", value, "mFnsku");
            return (Criteria) this;
        }

        public Criteria andMFnskuGreaterThanOrEqualTo(String value) {
            addCriterion("m_fnsku >=", value, "mFnsku");
            return (Criteria) this;
        }

        public Criteria andMFnskuLessThan(String value) {
            addCriterion("m_fnsku <", value, "mFnsku");
            return (Criteria) this;
        }

        public Criteria andMFnskuLessThanOrEqualTo(String value) {
            addCriterion("m_fnsku <=", value, "mFnsku");
            return (Criteria) this;
        }

        public Criteria andMFnskuLike(String value) {
            addCriterion("m_fnsku like", value, "mFnsku");
            return (Criteria) this;
        }

        public Criteria andMFnskuNotLike(String value) {
            addCriterion("m_fnsku not like", value, "mFnsku");
            return (Criteria) this;
        }

        public Criteria andMFnskuIn(List<String> values) {
            addCriterion("m_fnsku in", values, "mFnsku");
            return (Criteria) this;
        }

        public Criteria andMFnskuNotIn(List<String> values) {
            addCriterion("m_fnsku not in", values, "mFnsku");
            return (Criteria) this;
        }

        public Criteria andMFnskuBetween(String value1, String value2) {
            addCriterion("m_fnsku between", value1, value2, "mFnsku");
            return (Criteria) this;
        }

        public Criteria andMFnskuNotBetween(String value1, String value2) {
            addCriterion("m_fnsku not between", value1, value2, "mFnsku");
            return (Criteria) this;
        }

        public Criteria andLinkProductIdIsNull() {
            addCriterion("link_product_id is null");
            return (Criteria) this;
        }

        public Criteria andLinkProductIdIsNotNull() {
            addCriterion("link_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinkProductIdEqualTo(BigDecimal value) {
            addCriterion("link_product_id =", value, "linkProductId");
            return (Criteria) this;
        }

        public Criteria andLinkProductIdNotEqualTo(BigDecimal value) {
            addCriterion("link_product_id <>", value, "linkProductId");
            return (Criteria) this;
        }

        public Criteria andLinkProductIdGreaterThan(BigDecimal value) {
            addCriterion("link_product_id >", value, "linkProductId");
            return (Criteria) this;
        }

        public Criteria andLinkProductIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("link_product_id >=", value, "linkProductId");
            return (Criteria) this;
        }

        public Criteria andLinkProductIdLessThan(BigDecimal value) {
            addCriterion("link_product_id <", value, "linkProductId");
            return (Criteria) this;
        }

        public Criteria andLinkProductIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("link_product_id <=", value, "linkProductId");
            return (Criteria) this;
        }

        public Criteria andLinkProductIdIn(List<BigDecimal> values) {
            addCriterion("link_product_id in", values, "linkProductId");
            return (Criteria) this;
        }

        public Criteria andLinkProductIdNotIn(List<BigDecimal> values) {
            addCriterion("link_product_id not in", values, "linkProductId");
            return (Criteria) this;
        }

        public Criteria andLinkProductIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("link_product_id between", value1, value2, "linkProductId");
            return (Criteria) this;
        }

        public Criteria andLinkProductIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("link_product_id not between", value1, value2, "linkProductId");
            return (Criteria) this;
        }

        public Criteria andQtytransferIsNull() {
            addCriterion("qtytransfer is null");
            return (Criteria) this;
        }

        public Criteria andQtytransferIsNotNull() {
            addCriterion("qtytransfer is not null");
            return (Criteria) this;
        }

        public Criteria andQtytransferEqualTo(BigDecimal value) {
            addCriterion("qtytransfer =", value, "qtytransfer");
            return (Criteria) this;
        }

        public Criteria andQtytransferNotEqualTo(BigDecimal value) {
            addCriterion("qtytransfer <>", value, "qtytransfer");
            return (Criteria) this;
        }

        public Criteria andQtytransferGreaterThan(BigDecimal value) {
            addCriterion("qtytransfer >", value, "qtytransfer");
            return (Criteria) this;
        }

        public Criteria andQtytransferGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("qtytransfer >=", value, "qtytransfer");
            return (Criteria) this;
        }

        public Criteria andQtytransferLessThan(BigDecimal value) {
            addCriterion("qtytransfer <", value, "qtytransfer");
            return (Criteria) this;
        }

        public Criteria andQtytransferLessThanOrEqualTo(BigDecimal value) {
            addCriterion("qtytransfer <=", value, "qtytransfer");
            return (Criteria) this;
        }

        public Criteria andQtytransferIn(List<BigDecimal> values) {
            addCriterion("qtytransfer in", values, "qtytransfer");
            return (Criteria) this;
        }

        public Criteria andQtytransferNotIn(List<BigDecimal> values) {
            addCriterion("qtytransfer not in", values, "qtytransfer");
            return (Criteria) this;
        }

        public Criteria andQtytransferBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qtytransfer between", value1, value2, "qtytransfer");
            return (Criteria) this;
        }

        public Criteria andQtytransferNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qtytransfer not between", value1, value2, "qtytransfer");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromvIsNull() {
            addCriterion("qtyplanfromv is null");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromvIsNotNull() {
            addCriterion("qtyplanfromv is not null");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromvEqualTo(BigDecimal value) {
            addCriterion("qtyplanfromv =", value, "qtyplanfromv");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromvNotEqualTo(BigDecimal value) {
            addCriterion("qtyplanfromv <>", value, "qtyplanfromv");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromvGreaterThan(BigDecimal value) {
            addCriterion("qtyplanfromv >", value, "qtyplanfromv");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("qtyplanfromv >=", value, "qtyplanfromv");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromvLessThan(BigDecimal value) {
            addCriterion("qtyplanfromv <", value, "qtyplanfromv");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("qtyplanfromv <=", value, "qtyplanfromv");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromvIn(List<BigDecimal> values) {
            addCriterion("qtyplanfromv in", values, "qtyplanfromv");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromvNotIn(List<BigDecimal> values) {
            addCriterion("qtyplanfromv not in", values, "qtyplanfromv");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qtyplanfromv between", value1, value2, "qtyplanfromv");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qtyplanfromv not between", value1, value2, "qtyplanfromv");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromcIsNull() {
            addCriterion("qtyplanfromc is null");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromcIsNotNull() {
            addCriterion("qtyplanfromc is not null");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromcEqualTo(BigDecimal value) {
            addCriterion("qtyplanfromc =", value, "qtyplanfromc");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromcNotEqualTo(BigDecimal value) {
            addCriterion("qtyplanfromc <>", value, "qtyplanfromc");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromcGreaterThan(BigDecimal value) {
            addCriterion("qtyplanfromc >", value, "qtyplanfromc");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("qtyplanfromc >=", value, "qtyplanfromc");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromcLessThan(BigDecimal value) {
            addCriterion("qtyplanfromc <", value, "qtyplanfromc");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("qtyplanfromc <=", value, "qtyplanfromc");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromcIn(List<BigDecimal> values) {
            addCriterion("qtyplanfromc in", values, "qtyplanfromc");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromcNotIn(List<BigDecimal> values) {
            addCriterion("qtyplanfromc not in", values, "qtyplanfromc");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qtyplanfromc between", value1, value2, "qtyplanfromc");
            return (Criteria) this;
        }

        public Criteria andQtyplanfromcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("qtyplanfromc not between", value1, value2, "qtyplanfromc");
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