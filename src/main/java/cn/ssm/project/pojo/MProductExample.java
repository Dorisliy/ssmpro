package cn.ssm.project.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MProductExample() {
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

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("value like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("value not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andUpcIsNull() {
            addCriterion("upc is null");
            return (Criteria) this;
        }

        public Criteria andUpcIsNotNull() {
            addCriterion("upc is not null");
            return (Criteria) this;
        }

        public Criteria andUpcEqualTo(String value) {
            addCriterion("upc =", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcNotEqualTo(String value) {
            addCriterion("upc <>", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcGreaterThan(String value) {
            addCriterion("upc >", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcGreaterThanOrEqualTo(String value) {
            addCriterion("upc >=", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcLessThan(String value) {
            addCriterion("upc <", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcLessThanOrEqualTo(String value) {
            addCriterion("upc <=", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcLike(String value) {
            addCriterion("upc like", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcNotLike(String value) {
            addCriterion("upc not like", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcIn(List<String> values) {
            addCriterion("upc in", values, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcNotIn(List<String> values) {
            addCriterion("upc not in", values, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcBetween(String value1, String value2) {
            addCriterion("upc between", value1, value2, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcNotBetween(String value1, String value2) {
            addCriterion("upc not between", value1, value2, "upc");
            return (Criteria) this;
        }

        public Criteria andSkuIsNull() {
            addCriterion("sku is null");
            return (Criteria) this;
        }

        public Criteria andSkuIsNotNull() {
            addCriterion("sku is not null");
            return (Criteria) this;
        }

        public Criteria andSkuEqualTo(String value) {
            addCriterion("sku =", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotEqualTo(String value) {
            addCriterion("sku <>", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThan(String value) {
            addCriterion("sku >", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThanOrEqualTo(String value) {
            addCriterion("sku >=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThan(String value) {
            addCriterion("sku <", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThanOrEqualTo(String value) {
            addCriterion("sku <=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLike(String value) {
            addCriterion("sku like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotLike(String value) {
            addCriterion("sku not like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuIn(List<String> values) {
            addCriterion("sku in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotIn(List<String> values) {
            addCriterion("sku not in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuBetween(String value1, String value2) {
            addCriterion("sku between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotBetween(String value1, String value2) {
            addCriterion("sku not between", value1, value2, "sku");
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

        public Criteria andSalesrepIdIsNull() {
            addCriterion("salesrep_id is null");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdIsNotNull() {
            addCriterion("salesrep_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdEqualTo(BigDecimal value) {
            addCriterion("salesrep_id =", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdNotEqualTo(BigDecimal value) {
            addCriterion("salesrep_id <>", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdGreaterThan(BigDecimal value) {
            addCriterion("salesrep_id >", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("salesrep_id >=", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdLessThan(BigDecimal value) {
            addCriterion("salesrep_id <", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("salesrep_id <=", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdIn(List<BigDecimal> values) {
            addCriterion("salesrep_id in", values, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdNotIn(List<BigDecimal> values) {
            addCriterion("salesrep_id not in", values, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salesrep_id between", value1, value2, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salesrep_id not between", value1, value2, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andIssummaryIsNull() {
            addCriterion("issummary is null");
            return (Criteria) this;
        }

        public Criteria andIssummaryIsNotNull() {
            addCriterion("issummary is not null");
            return (Criteria) this;
        }

        public Criteria andIssummaryEqualTo(String value) {
            addCriterion("issummary =", value, "issummary");
            return (Criteria) this;
        }

        public Criteria andIssummaryNotEqualTo(String value) {
            addCriterion("issummary <>", value, "issummary");
            return (Criteria) this;
        }

        public Criteria andIssummaryGreaterThan(String value) {
            addCriterion("issummary >", value, "issummary");
            return (Criteria) this;
        }

        public Criteria andIssummaryGreaterThanOrEqualTo(String value) {
            addCriterion("issummary >=", value, "issummary");
            return (Criteria) this;
        }

        public Criteria andIssummaryLessThan(String value) {
            addCriterion("issummary <", value, "issummary");
            return (Criteria) this;
        }

        public Criteria andIssummaryLessThanOrEqualTo(String value) {
            addCriterion("issummary <=", value, "issummary");
            return (Criteria) this;
        }

        public Criteria andIssummaryLike(String value) {
            addCriterion("issummary like", value, "issummary");
            return (Criteria) this;
        }

        public Criteria andIssummaryNotLike(String value) {
            addCriterion("issummary not like", value, "issummary");
            return (Criteria) this;
        }

        public Criteria andIssummaryIn(List<String> values) {
            addCriterion("issummary in", values, "issummary");
            return (Criteria) this;
        }

        public Criteria andIssummaryNotIn(List<String> values) {
            addCriterion("issummary not in", values, "issummary");
            return (Criteria) this;
        }

        public Criteria andIssummaryBetween(String value1, String value2) {
            addCriterion("issummary between", value1, value2, "issummary");
            return (Criteria) this;
        }

        public Criteria andIssummaryNotBetween(String value1, String value2) {
            addCriterion("issummary not between", value1, value2, "issummary");
            return (Criteria) this;
        }

        public Criteria andIsstockedIsNull() {
            addCriterion("isstocked is null");
            return (Criteria) this;
        }

        public Criteria andIsstockedIsNotNull() {
            addCriterion("isstocked is not null");
            return (Criteria) this;
        }

        public Criteria andIsstockedEqualTo(String value) {
            addCriterion("isstocked =", value, "isstocked");
            return (Criteria) this;
        }

        public Criteria andIsstockedNotEqualTo(String value) {
            addCriterion("isstocked <>", value, "isstocked");
            return (Criteria) this;
        }

        public Criteria andIsstockedGreaterThan(String value) {
            addCriterion("isstocked >", value, "isstocked");
            return (Criteria) this;
        }

        public Criteria andIsstockedGreaterThanOrEqualTo(String value) {
            addCriterion("isstocked >=", value, "isstocked");
            return (Criteria) this;
        }

        public Criteria andIsstockedLessThan(String value) {
            addCriterion("isstocked <", value, "isstocked");
            return (Criteria) this;
        }

        public Criteria andIsstockedLessThanOrEqualTo(String value) {
            addCriterion("isstocked <=", value, "isstocked");
            return (Criteria) this;
        }

        public Criteria andIsstockedLike(String value) {
            addCriterion("isstocked like", value, "isstocked");
            return (Criteria) this;
        }

        public Criteria andIsstockedNotLike(String value) {
            addCriterion("isstocked not like", value, "isstocked");
            return (Criteria) this;
        }

        public Criteria andIsstockedIn(List<String> values) {
            addCriterion("isstocked in", values, "isstocked");
            return (Criteria) this;
        }

        public Criteria andIsstockedNotIn(List<String> values) {
            addCriterion("isstocked not in", values, "isstocked");
            return (Criteria) this;
        }

        public Criteria andIsstockedBetween(String value1, String value2) {
            addCriterion("isstocked between", value1, value2, "isstocked");
            return (Criteria) this;
        }

        public Criteria andIsstockedNotBetween(String value1, String value2) {
            addCriterion("isstocked not between", value1, value2, "isstocked");
            return (Criteria) this;
        }

        public Criteria andIspurchasedIsNull() {
            addCriterion("ispurchased is null");
            return (Criteria) this;
        }

        public Criteria andIspurchasedIsNotNull() {
            addCriterion("ispurchased is not null");
            return (Criteria) this;
        }

        public Criteria andIspurchasedEqualTo(String value) {
            addCriterion("ispurchased =", value, "ispurchased");
            return (Criteria) this;
        }

        public Criteria andIspurchasedNotEqualTo(String value) {
            addCriterion("ispurchased <>", value, "ispurchased");
            return (Criteria) this;
        }

        public Criteria andIspurchasedGreaterThan(String value) {
            addCriterion("ispurchased >", value, "ispurchased");
            return (Criteria) this;
        }

        public Criteria andIspurchasedGreaterThanOrEqualTo(String value) {
            addCriterion("ispurchased >=", value, "ispurchased");
            return (Criteria) this;
        }

        public Criteria andIspurchasedLessThan(String value) {
            addCriterion("ispurchased <", value, "ispurchased");
            return (Criteria) this;
        }

        public Criteria andIspurchasedLessThanOrEqualTo(String value) {
            addCriterion("ispurchased <=", value, "ispurchased");
            return (Criteria) this;
        }

        public Criteria andIspurchasedLike(String value) {
            addCriterion("ispurchased like", value, "ispurchased");
            return (Criteria) this;
        }

        public Criteria andIspurchasedNotLike(String value) {
            addCriterion("ispurchased not like", value, "ispurchased");
            return (Criteria) this;
        }

        public Criteria andIspurchasedIn(List<String> values) {
            addCriterion("ispurchased in", values, "ispurchased");
            return (Criteria) this;
        }

        public Criteria andIspurchasedNotIn(List<String> values) {
            addCriterion("ispurchased not in", values, "ispurchased");
            return (Criteria) this;
        }

        public Criteria andIspurchasedBetween(String value1, String value2) {
            addCriterion("ispurchased between", value1, value2, "ispurchased");
            return (Criteria) this;
        }

        public Criteria andIspurchasedNotBetween(String value1, String value2) {
            addCriterion("ispurchased not between", value1, value2, "ispurchased");
            return (Criteria) this;
        }

        public Criteria andIssoldIsNull() {
            addCriterion("issold is null");
            return (Criteria) this;
        }

        public Criteria andIssoldIsNotNull() {
            addCriterion("issold is not null");
            return (Criteria) this;
        }

        public Criteria andIssoldEqualTo(String value) {
            addCriterion("issold =", value, "issold");
            return (Criteria) this;
        }

        public Criteria andIssoldNotEqualTo(String value) {
            addCriterion("issold <>", value, "issold");
            return (Criteria) this;
        }

        public Criteria andIssoldGreaterThan(String value) {
            addCriterion("issold >", value, "issold");
            return (Criteria) this;
        }

        public Criteria andIssoldGreaterThanOrEqualTo(String value) {
            addCriterion("issold >=", value, "issold");
            return (Criteria) this;
        }

        public Criteria andIssoldLessThan(String value) {
            addCriterion("issold <", value, "issold");
            return (Criteria) this;
        }

        public Criteria andIssoldLessThanOrEqualTo(String value) {
            addCriterion("issold <=", value, "issold");
            return (Criteria) this;
        }

        public Criteria andIssoldLike(String value) {
            addCriterion("issold like", value, "issold");
            return (Criteria) this;
        }

        public Criteria andIssoldNotLike(String value) {
            addCriterion("issold not like", value, "issold");
            return (Criteria) this;
        }

        public Criteria andIssoldIn(List<String> values) {
            addCriterion("issold in", values, "issold");
            return (Criteria) this;
        }

        public Criteria andIssoldNotIn(List<String> values) {
            addCriterion("issold not in", values, "issold");
            return (Criteria) this;
        }

        public Criteria andIssoldBetween(String value1, String value2) {
            addCriterion("issold between", value1, value2, "issold");
            return (Criteria) this;
        }

        public Criteria andIssoldNotBetween(String value1, String value2) {
            addCriterion("issold not between", value1, value2, "issold");
            return (Criteria) this;
        }

        public Criteria andIsbomIsNull() {
            addCriterion("isbom is null");
            return (Criteria) this;
        }

        public Criteria andIsbomIsNotNull() {
            addCriterion("isbom is not null");
            return (Criteria) this;
        }

        public Criteria andIsbomEqualTo(String value) {
            addCriterion("isbom =", value, "isbom");
            return (Criteria) this;
        }

        public Criteria andIsbomNotEqualTo(String value) {
            addCriterion("isbom <>", value, "isbom");
            return (Criteria) this;
        }

        public Criteria andIsbomGreaterThan(String value) {
            addCriterion("isbom >", value, "isbom");
            return (Criteria) this;
        }

        public Criteria andIsbomGreaterThanOrEqualTo(String value) {
            addCriterion("isbom >=", value, "isbom");
            return (Criteria) this;
        }

        public Criteria andIsbomLessThan(String value) {
            addCriterion("isbom <", value, "isbom");
            return (Criteria) this;
        }

        public Criteria andIsbomLessThanOrEqualTo(String value) {
            addCriterion("isbom <=", value, "isbom");
            return (Criteria) this;
        }

        public Criteria andIsbomLike(String value) {
            addCriterion("isbom like", value, "isbom");
            return (Criteria) this;
        }

        public Criteria andIsbomNotLike(String value) {
            addCriterion("isbom not like", value, "isbom");
            return (Criteria) this;
        }

        public Criteria andIsbomIn(List<String> values) {
            addCriterion("isbom in", values, "isbom");
            return (Criteria) this;
        }

        public Criteria andIsbomNotIn(List<String> values) {
            addCriterion("isbom not in", values, "isbom");
            return (Criteria) this;
        }

        public Criteria andIsbomBetween(String value1, String value2) {
            addCriterion("isbom between", value1, value2, "isbom");
            return (Criteria) this;
        }

        public Criteria andIsbomNotBetween(String value1, String value2) {
            addCriterion("isbom not between", value1, value2, "isbom");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceprintdetailsIsNull() {
            addCriterion("isinvoiceprintdetails is null");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceprintdetailsIsNotNull() {
            addCriterion("isinvoiceprintdetails is not null");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceprintdetailsEqualTo(String value) {
            addCriterion("isinvoiceprintdetails =", value, "isinvoiceprintdetails");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceprintdetailsNotEqualTo(String value) {
            addCriterion("isinvoiceprintdetails <>", value, "isinvoiceprintdetails");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceprintdetailsGreaterThan(String value) {
            addCriterion("isinvoiceprintdetails >", value, "isinvoiceprintdetails");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceprintdetailsGreaterThanOrEqualTo(String value) {
            addCriterion("isinvoiceprintdetails >=", value, "isinvoiceprintdetails");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceprintdetailsLessThan(String value) {
            addCriterion("isinvoiceprintdetails <", value, "isinvoiceprintdetails");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceprintdetailsLessThanOrEqualTo(String value) {
            addCriterion("isinvoiceprintdetails <=", value, "isinvoiceprintdetails");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceprintdetailsLike(String value) {
            addCriterion("isinvoiceprintdetails like", value, "isinvoiceprintdetails");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceprintdetailsNotLike(String value) {
            addCriterion("isinvoiceprintdetails not like", value, "isinvoiceprintdetails");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceprintdetailsIn(List<String> values) {
            addCriterion("isinvoiceprintdetails in", values, "isinvoiceprintdetails");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceprintdetailsNotIn(List<String> values) {
            addCriterion("isinvoiceprintdetails not in", values, "isinvoiceprintdetails");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceprintdetailsBetween(String value1, String value2) {
            addCriterion("isinvoiceprintdetails between", value1, value2, "isinvoiceprintdetails");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceprintdetailsNotBetween(String value1, String value2) {
            addCriterion("isinvoiceprintdetails not between", value1, value2, "isinvoiceprintdetails");
            return (Criteria) this;
        }

        public Criteria andIspicklistprintdetailsIsNull() {
            addCriterion("ispicklistprintdetails is null");
            return (Criteria) this;
        }

        public Criteria andIspicklistprintdetailsIsNotNull() {
            addCriterion("ispicklistprintdetails is not null");
            return (Criteria) this;
        }

        public Criteria andIspicklistprintdetailsEqualTo(String value) {
            addCriterion("ispicklistprintdetails =", value, "ispicklistprintdetails");
            return (Criteria) this;
        }

        public Criteria andIspicklistprintdetailsNotEqualTo(String value) {
            addCriterion("ispicklistprintdetails <>", value, "ispicklistprintdetails");
            return (Criteria) this;
        }

        public Criteria andIspicklistprintdetailsGreaterThan(String value) {
            addCriterion("ispicklistprintdetails >", value, "ispicklistprintdetails");
            return (Criteria) this;
        }

        public Criteria andIspicklistprintdetailsGreaterThanOrEqualTo(String value) {
            addCriterion("ispicklistprintdetails >=", value, "ispicklistprintdetails");
            return (Criteria) this;
        }

        public Criteria andIspicklistprintdetailsLessThan(String value) {
            addCriterion("ispicklistprintdetails <", value, "ispicklistprintdetails");
            return (Criteria) this;
        }

        public Criteria andIspicklistprintdetailsLessThanOrEqualTo(String value) {
            addCriterion("ispicklistprintdetails <=", value, "ispicklistprintdetails");
            return (Criteria) this;
        }

        public Criteria andIspicklistprintdetailsLike(String value) {
            addCriterion("ispicklistprintdetails like", value, "ispicklistprintdetails");
            return (Criteria) this;
        }

        public Criteria andIspicklistprintdetailsNotLike(String value) {
            addCriterion("ispicklistprintdetails not like", value, "ispicklistprintdetails");
            return (Criteria) this;
        }

        public Criteria andIspicklistprintdetailsIn(List<String> values) {
            addCriterion("ispicklistprintdetails in", values, "ispicklistprintdetails");
            return (Criteria) this;
        }

        public Criteria andIspicklistprintdetailsNotIn(List<String> values) {
            addCriterion("ispicklistprintdetails not in", values, "ispicklistprintdetails");
            return (Criteria) this;
        }

        public Criteria andIspicklistprintdetailsBetween(String value1, String value2) {
            addCriterion("ispicklistprintdetails between", value1, value2, "ispicklistprintdetails");
            return (Criteria) this;
        }

        public Criteria andIspicklistprintdetailsNotBetween(String value1, String value2) {
            addCriterion("ispicklistprintdetails not between", value1, value2, "ispicklistprintdetails");
            return (Criteria) this;
        }

        public Criteria andIsverifiedIsNull() {
            addCriterion("isverified is null");
            return (Criteria) this;
        }

        public Criteria andIsverifiedIsNotNull() {
            addCriterion("isverified is not null");
            return (Criteria) this;
        }

        public Criteria andIsverifiedEqualTo(String value) {
            addCriterion("isverified =", value, "isverified");
            return (Criteria) this;
        }

        public Criteria andIsverifiedNotEqualTo(String value) {
            addCriterion("isverified <>", value, "isverified");
            return (Criteria) this;
        }

        public Criteria andIsverifiedGreaterThan(String value) {
            addCriterion("isverified >", value, "isverified");
            return (Criteria) this;
        }

        public Criteria andIsverifiedGreaterThanOrEqualTo(String value) {
            addCriterion("isverified >=", value, "isverified");
            return (Criteria) this;
        }

        public Criteria andIsverifiedLessThan(String value) {
            addCriterion("isverified <", value, "isverified");
            return (Criteria) this;
        }

        public Criteria andIsverifiedLessThanOrEqualTo(String value) {
            addCriterion("isverified <=", value, "isverified");
            return (Criteria) this;
        }

        public Criteria andIsverifiedLike(String value) {
            addCriterion("isverified like", value, "isverified");
            return (Criteria) this;
        }

        public Criteria andIsverifiedNotLike(String value) {
            addCriterion("isverified not like", value, "isverified");
            return (Criteria) this;
        }

        public Criteria andIsverifiedIn(List<String> values) {
            addCriterion("isverified in", values, "isverified");
            return (Criteria) this;
        }

        public Criteria andIsverifiedNotIn(List<String> values) {
            addCriterion("isverified not in", values, "isverified");
            return (Criteria) this;
        }

        public Criteria andIsverifiedBetween(String value1, String value2) {
            addCriterion("isverified between", value1, value2, "isverified");
            return (Criteria) this;
        }

        public Criteria andIsverifiedNotBetween(String value1, String value2) {
            addCriterion("isverified not between", value1, value2, "isverified");
            return (Criteria) this;
        }

        public Criteria andCRevenuerecognitionIdIsNull() {
            addCriterion("c_revenuerecognition_id is null");
            return (Criteria) this;
        }

        public Criteria andCRevenuerecognitionIdIsNotNull() {
            addCriterion("c_revenuerecognition_id is not null");
            return (Criteria) this;
        }

        public Criteria andCRevenuerecognitionIdEqualTo(BigDecimal value) {
            addCriterion("c_revenuerecognition_id =", value, "cRevenuerecognitionId");
            return (Criteria) this;
        }

        public Criteria andCRevenuerecognitionIdNotEqualTo(BigDecimal value) {
            addCriterion("c_revenuerecognition_id <>", value, "cRevenuerecognitionId");
            return (Criteria) this;
        }

        public Criteria andCRevenuerecognitionIdGreaterThan(BigDecimal value) {
            addCriterion("c_revenuerecognition_id >", value, "cRevenuerecognitionId");
            return (Criteria) this;
        }

        public Criteria andCRevenuerecognitionIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c_revenuerecognition_id >=", value, "cRevenuerecognitionId");
            return (Criteria) this;
        }

        public Criteria andCRevenuerecognitionIdLessThan(BigDecimal value) {
            addCriterion("c_revenuerecognition_id <", value, "cRevenuerecognitionId");
            return (Criteria) this;
        }

        public Criteria andCRevenuerecognitionIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("c_revenuerecognition_id <=", value, "cRevenuerecognitionId");
            return (Criteria) this;
        }

        public Criteria andCRevenuerecognitionIdIn(List<BigDecimal> values) {
            addCriterion("c_revenuerecognition_id in", values, "cRevenuerecognitionId");
            return (Criteria) this;
        }

        public Criteria andCRevenuerecognitionIdNotIn(List<BigDecimal> values) {
            addCriterion("c_revenuerecognition_id not in", values, "cRevenuerecognitionId");
            return (Criteria) this;
        }

        public Criteria andCRevenuerecognitionIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_revenuerecognition_id between", value1, value2, "cRevenuerecognitionId");
            return (Criteria) this;
        }

        public Criteria andCRevenuerecognitionIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_revenuerecognition_id not between", value1, value2, "cRevenuerecognitionId");
            return (Criteria) this;
        }

        public Criteria andMProductCategoryIdIsNull() {
            addCriterion("m_product_category_id is null");
            return (Criteria) this;
        }

        public Criteria andMProductCategoryIdIsNotNull() {
            addCriterion("m_product_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andMProductCategoryIdEqualTo(BigDecimal value) {
            addCriterion("m_product_category_id =", value, "mProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andMProductCategoryIdNotEqualTo(BigDecimal value) {
            addCriterion("m_product_category_id <>", value, "mProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andMProductCategoryIdGreaterThan(BigDecimal value) {
            addCriterion("m_product_category_id >", value, "mProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andMProductCategoryIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m_product_category_id >=", value, "mProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andMProductCategoryIdLessThan(BigDecimal value) {
            addCriterion("m_product_category_id <", value, "mProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andMProductCategoryIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m_product_category_id <=", value, "mProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andMProductCategoryIdIn(List<BigDecimal> values) {
            addCriterion("m_product_category_id in", values, "mProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andMProductCategoryIdNotIn(List<BigDecimal> values) {
            addCriterion("m_product_category_id not in", values, "mProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andMProductCategoryIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_product_category_id between", value1, value2, "mProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andMProductCategoryIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_product_category_id not between", value1, value2, "mProductCategoryId");
            return (Criteria) this;
        }

        public Criteria andClassificationIsNull() {
            addCriterion("classification is null");
            return (Criteria) this;
        }

        public Criteria andClassificationIsNotNull() {
            addCriterion("classification is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationEqualTo(String value) {
            addCriterion("classification =", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotEqualTo(String value) {
            addCriterion("classification <>", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationGreaterThan(String value) {
            addCriterion("classification >", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationGreaterThanOrEqualTo(String value) {
            addCriterion("classification >=", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationLessThan(String value) {
            addCriterion("classification <", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationLessThanOrEqualTo(String value) {
            addCriterion("classification <=", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationLike(String value) {
            addCriterion("classification like", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotLike(String value) {
            addCriterion("classification not like", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationIn(List<String> values) {
            addCriterion("classification in", values, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotIn(List<String> values) {
            addCriterion("classification not in", values, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationBetween(String value1, String value2) {
            addCriterion("classification between", value1, value2, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotBetween(String value1, String value2) {
            addCriterion("classification not between", value1, value2, "classification");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(BigDecimal value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(BigDecimal value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(BigDecimal value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(BigDecimal value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<BigDecimal> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<BigDecimal> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andShelfwidthIsNull() {
            addCriterion("shelfwidth is null");
            return (Criteria) this;
        }

        public Criteria andShelfwidthIsNotNull() {
            addCriterion("shelfwidth is not null");
            return (Criteria) this;
        }

        public Criteria andShelfwidthEqualTo(BigDecimal value) {
            addCriterion("shelfwidth =", value, "shelfwidth");
            return (Criteria) this;
        }

        public Criteria andShelfwidthNotEqualTo(BigDecimal value) {
            addCriterion("shelfwidth <>", value, "shelfwidth");
            return (Criteria) this;
        }

        public Criteria andShelfwidthGreaterThan(BigDecimal value) {
            addCriterion("shelfwidth >", value, "shelfwidth");
            return (Criteria) this;
        }

        public Criteria andShelfwidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shelfwidth >=", value, "shelfwidth");
            return (Criteria) this;
        }

        public Criteria andShelfwidthLessThan(BigDecimal value) {
            addCriterion("shelfwidth <", value, "shelfwidth");
            return (Criteria) this;
        }

        public Criteria andShelfwidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shelfwidth <=", value, "shelfwidth");
            return (Criteria) this;
        }

        public Criteria andShelfwidthIn(List<BigDecimal> values) {
            addCriterion("shelfwidth in", values, "shelfwidth");
            return (Criteria) this;
        }

        public Criteria andShelfwidthNotIn(List<BigDecimal> values) {
            addCriterion("shelfwidth not in", values, "shelfwidth");
            return (Criteria) this;
        }

        public Criteria andShelfwidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shelfwidth between", value1, value2, "shelfwidth");
            return (Criteria) this;
        }

        public Criteria andShelfwidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shelfwidth not between", value1, value2, "shelfwidth");
            return (Criteria) this;
        }

        public Criteria andShelfheightIsNull() {
            addCriterion("shelfheight is null");
            return (Criteria) this;
        }

        public Criteria andShelfheightIsNotNull() {
            addCriterion("shelfheight is not null");
            return (Criteria) this;
        }

        public Criteria andShelfheightEqualTo(BigDecimal value) {
            addCriterion("shelfheight =", value, "shelfheight");
            return (Criteria) this;
        }

        public Criteria andShelfheightNotEqualTo(BigDecimal value) {
            addCriterion("shelfheight <>", value, "shelfheight");
            return (Criteria) this;
        }

        public Criteria andShelfheightGreaterThan(BigDecimal value) {
            addCriterion("shelfheight >", value, "shelfheight");
            return (Criteria) this;
        }

        public Criteria andShelfheightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shelfheight >=", value, "shelfheight");
            return (Criteria) this;
        }

        public Criteria andShelfheightLessThan(BigDecimal value) {
            addCriterion("shelfheight <", value, "shelfheight");
            return (Criteria) this;
        }

        public Criteria andShelfheightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shelfheight <=", value, "shelfheight");
            return (Criteria) this;
        }

        public Criteria andShelfheightIn(List<BigDecimal> values) {
            addCriterion("shelfheight in", values, "shelfheight");
            return (Criteria) this;
        }

        public Criteria andShelfheightNotIn(List<BigDecimal> values) {
            addCriterion("shelfheight not in", values, "shelfheight");
            return (Criteria) this;
        }

        public Criteria andShelfheightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shelfheight between", value1, value2, "shelfheight");
            return (Criteria) this;
        }

        public Criteria andShelfheightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shelfheight not between", value1, value2, "shelfheight");
            return (Criteria) this;
        }

        public Criteria andShelfdepthIsNull() {
            addCriterion("shelfdepth is null");
            return (Criteria) this;
        }

        public Criteria andShelfdepthIsNotNull() {
            addCriterion("shelfdepth is not null");
            return (Criteria) this;
        }

        public Criteria andShelfdepthEqualTo(BigDecimal value) {
            addCriterion("shelfdepth =", value, "shelfdepth");
            return (Criteria) this;
        }

        public Criteria andShelfdepthNotEqualTo(BigDecimal value) {
            addCriterion("shelfdepth <>", value, "shelfdepth");
            return (Criteria) this;
        }

        public Criteria andShelfdepthGreaterThan(BigDecimal value) {
            addCriterion("shelfdepth >", value, "shelfdepth");
            return (Criteria) this;
        }

        public Criteria andShelfdepthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shelfdepth >=", value, "shelfdepth");
            return (Criteria) this;
        }

        public Criteria andShelfdepthLessThan(BigDecimal value) {
            addCriterion("shelfdepth <", value, "shelfdepth");
            return (Criteria) this;
        }

        public Criteria andShelfdepthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shelfdepth <=", value, "shelfdepth");
            return (Criteria) this;
        }

        public Criteria andShelfdepthIn(List<BigDecimal> values) {
            addCriterion("shelfdepth in", values, "shelfdepth");
            return (Criteria) this;
        }

        public Criteria andShelfdepthNotIn(List<BigDecimal> values) {
            addCriterion("shelfdepth not in", values, "shelfdepth");
            return (Criteria) this;
        }

        public Criteria andShelfdepthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shelfdepth between", value1, value2, "shelfdepth");
            return (Criteria) this;
        }

        public Criteria andShelfdepthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shelfdepth not between", value1, value2, "shelfdepth");
            return (Criteria) this;
        }

        public Criteria andUnitsperpalletIsNull() {
            addCriterion("unitsperpallet is null");
            return (Criteria) this;
        }

        public Criteria andUnitsperpalletIsNotNull() {
            addCriterion("unitsperpallet is not null");
            return (Criteria) this;
        }

        public Criteria andUnitsperpalletEqualTo(BigDecimal value) {
            addCriterion("unitsperpallet =", value, "unitsperpallet");
            return (Criteria) this;
        }

        public Criteria andUnitsperpalletNotEqualTo(BigDecimal value) {
            addCriterion("unitsperpallet <>", value, "unitsperpallet");
            return (Criteria) this;
        }

        public Criteria andUnitsperpalletGreaterThan(BigDecimal value) {
            addCriterion("unitsperpallet >", value, "unitsperpallet");
            return (Criteria) this;
        }

        public Criteria andUnitsperpalletGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unitsperpallet >=", value, "unitsperpallet");
            return (Criteria) this;
        }

        public Criteria andUnitsperpalletLessThan(BigDecimal value) {
            addCriterion("unitsperpallet <", value, "unitsperpallet");
            return (Criteria) this;
        }

        public Criteria andUnitsperpalletLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unitsperpallet <=", value, "unitsperpallet");
            return (Criteria) this;
        }

        public Criteria andUnitsperpalletIn(List<BigDecimal> values) {
            addCriterion("unitsperpallet in", values, "unitsperpallet");
            return (Criteria) this;
        }

        public Criteria andUnitsperpalletNotIn(List<BigDecimal> values) {
            addCriterion("unitsperpallet not in", values, "unitsperpallet");
            return (Criteria) this;
        }

        public Criteria andUnitsperpalletBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unitsperpallet between", value1, value2, "unitsperpallet");
            return (Criteria) this;
        }

        public Criteria andUnitsperpalletNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unitsperpallet not between", value1, value2, "unitsperpallet");
            return (Criteria) this;
        }

        public Criteria andCTaxcategoryIdIsNull() {
            addCriterion("c_taxcategory_id is null");
            return (Criteria) this;
        }

        public Criteria andCTaxcategoryIdIsNotNull() {
            addCriterion("c_taxcategory_id is not null");
            return (Criteria) this;
        }

        public Criteria andCTaxcategoryIdEqualTo(BigDecimal value) {
            addCriterion("c_taxcategory_id =", value, "cTaxcategoryId");
            return (Criteria) this;
        }

        public Criteria andCTaxcategoryIdNotEqualTo(BigDecimal value) {
            addCriterion("c_taxcategory_id <>", value, "cTaxcategoryId");
            return (Criteria) this;
        }

        public Criteria andCTaxcategoryIdGreaterThan(BigDecimal value) {
            addCriterion("c_taxcategory_id >", value, "cTaxcategoryId");
            return (Criteria) this;
        }

        public Criteria andCTaxcategoryIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c_taxcategory_id >=", value, "cTaxcategoryId");
            return (Criteria) this;
        }

        public Criteria andCTaxcategoryIdLessThan(BigDecimal value) {
            addCriterion("c_taxcategory_id <", value, "cTaxcategoryId");
            return (Criteria) this;
        }

        public Criteria andCTaxcategoryIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("c_taxcategory_id <=", value, "cTaxcategoryId");
            return (Criteria) this;
        }

        public Criteria andCTaxcategoryIdIn(List<BigDecimal> values) {
            addCriterion("c_taxcategory_id in", values, "cTaxcategoryId");
            return (Criteria) this;
        }

        public Criteria andCTaxcategoryIdNotIn(List<BigDecimal> values) {
            addCriterion("c_taxcategory_id not in", values, "cTaxcategoryId");
            return (Criteria) this;
        }

        public Criteria andCTaxcategoryIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_taxcategory_id between", value1, value2, "cTaxcategoryId");
            return (Criteria) this;
        }

        public Criteria andCTaxcategoryIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_taxcategory_id not between", value1, value2, "cTaxcategoryId");
            return (Criteria) this;
        }

        public Criteria andSResourceIdIsNull() {
            addCriterion("s_resource_id is null");
            return (Criteria) this;
        }

        public Criteria andSResourceIdIsNotNull() {
            addCriterion("s_resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andSResourceIdEqualTo(BigDecimal value) {
            addCriterion("s_resource_id =", value, "sResourceId");
            return (Criteria) this;
        }

        public Criteria andSResourceIdNotEqualTo(BigDecimal value) {
            addCriterion("s_resource_id <>", value, "sResourceId");
            return (Criteria) this;
        }

        public Criteria andSResourceIdGreaterThan(BigDecimal value) {
            addCriterion("s_resource_id >", value, "sResourceId");
            return (Criteria) this;
        }

        public Criteria andSResourceIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("s_resource_id >=", value, "sResourceId");
            return (Criteria) this;
        }

        public Criteria andSResourceIdLessThan(BigDecimal value) {
            addCriterion("s_resource_id <", value, "sResourceId");
            return (Criteria) this;
        }

        public Criteria andSResourceIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("s_resource_id <=", value, "sResourceId");
            return (Criteria) this;
        }

        public Criteria andSResourceIdIn(List<BigDecimal> values) {
            addCriterion("s_resource_id in", values, "sResourceId");
            return (Criteria) this;
        }

        public Criteria andSResourceIdNotIn(List<BigDecimal> values) {
            addCriterion("s_resource_id not in", values, "sResourceId");
            return (Criteria) this;
        }

        public Criteria andSResourceIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("s_resource_id between", value1, value2, "sResourceId");
            return (Criteria) this;
        }

        public Criteria andSResourceIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("s_resource_id not between", value1, value2, "sResourceId");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedIsNull() {
            addCriterion("discontinued is null");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedIsNotNull() {
            addCriterion("discontinued is not null");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedEqualTo(String value) {
            addCriterion("discontinued =", value, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedNotEqualTo(String value) {
            addCriterion("discontinued <>", value, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedGreaterThan(String value) {
            addCriterion("discontinued >", value, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedGreaterThanOrEqualTo(String value) {
            addCriterion("discontinued >=", value, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedLessThan(String value) {
            addCriterion("discontinued <", value, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedLessThanOrEqualTo(String value) {
            addCriterion("discontinued <=", value, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedLike(String value) {
            addCriterion("discontinued like", value, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedNotLike(String value) {
            addCriterion("discontinued not like", value, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedIn(List<String> values) {
            addCriterion("discontinued in", values, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedNotIn(List<String> values) {
            addCriterion("discontinued not in", values, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedBetween(String value1, String value2) {
            addCriterion("discontinued between", value1, value2, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedNotBetween(String value1, String value2) {
            addCriterion("discontinued not between", value1, value2, "discontinued");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedbyIsNull() {
            addCriterion("discontinuedby is null");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedbyIsNotNull() {
            addCriterion("discontinuedby is not null");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedbyEqualTo(Date value) {
            addCriterion("discontinuedby =", value, "discontinuedby");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedbyNotEqualTo(Date value) {
            addCriterion("discontinuedby <>", value, "discontinuedby");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedbyGreaterThan(Date value) {
            addCriterion("discontinuedby >", value, "discontinuedby");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedbyGreaterThanOrEqualTo(Date value) {
            addCriterion("discontinuedby >=", value, "discontinuedby");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedbyLessThan(Date value) {
            addCriterion("discontinuedby <", value, "discontinuedby");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedbyLessThanOrEqualTo(Date value) {
            addCriterion("discontinuedby <=", value, "discontinuedby");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedbyIn(List<Date> values) {
            addCriterion("discontinuedby in", values, "discontinuedby");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedbyNotIn(List<Date> values) {
            addCriterion("discontinuedby not in", values, "discontinuedby");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedbyBetween(Date value1, Date value2) {
            addCriterion("discontinuedby between", value1, value2, "discontinuedby");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedbyNotBetween(Date value1, Date value2) {
            addCriterion("discontinuedby not between", value1, value2, "discontinuedby");
            return (Criteria) this;
        }

        public Criteria andProcessingIsNull() {
            addCriterion("processing is null");
            return (Criteria) this;
        }

        public Criteria andProcessingIsNotNull() {
            addCriterion("processing is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingEqualTo(String value) {
            addCriterion("processing =", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingNotEqualTo(String value) {
            addCriterion("processing <>", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingGreaterThan(String value) {
            addCriterion("processing >", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingGreaterThanOrEqualTo(String value) {
            addCriterion("processing >=", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingLessThan(String value) {
            addCriterion("processing <", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingLessThanOrEqualTo(String value) {
            addCriterion("processing <=", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingLike(String value) {
            addCriterion("processing like", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingNotLike(String value) {
            addCriterion("processing not like", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingIn(List<String> values) {
            addCriterion("processing in", values, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingNotIn(List<String> values) {
            addCriterion("processing not in", values, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingBetween(String value1, String value2) {
            addCriterion("processing between", value1, value2, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingNotBetween(String value1, String value2) {
            addCriterion("processing not between", value1, value2, "processing");
            return (Criteria) this;
        }

        public Criteria andSExpensetypeIdIsNull() {
            addCriterion("s_expensetype_id is null");
            return (Criteria) this;
        }

        public Criteria andSExpensetypeIdIsNotNull() {
            addCriterion("s_expensetype_id is not null");
            return (Criteria) this;
        }

        public Criteria andSExpensetypeIdEqualTo(BigDecimal value) {
            addCriterion("s_expensetype_id =", value, "sExpensetypeId");
            return (Criteria) this;
        }

        public Criteria andSExpensetypeIdNotEqualTo(BigDecimal value) {
            addCriterion("s_expensetype_id <>", value, "sExpensetypeId");
            return (Criteria) this;
        }

        public Criteria andSExpensetypeIdGreaterThan(BigDecimal value) {
            addCriterion("s_expensetype_id >", value, "sExpensetypeId");
            return (Criteria) this;
        }

        public Criteria andSExpensetypeIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("s_expensetype_id >=", value, "sExpensetypeId");
            return (Criteria) this;
        }

        public Criteria andSExpensetypeIdLessThan(BigDecimal value) {
            addCriterion("s_expensetype_id <", value, "sExpensetypeId");
            return (Criteria) this;
        }

        public Criteria andSExpensetypeIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("s_expensetype_id <=", value, "sExpensetypeId");
            return (Criteria) this;
        }

        public Criteria andSExpensetypeIdIn(List<BigDecimal> values) {
            addCriterion("s_expensetype_id in", values, "sExpensetypeId");
            return (Criteria) this;
        }

        public Criteria andSExpensetypeIdNotIn(List<BigDecimal> values) {
            addCriterion("s_expensetype_id not in", values, "sExpensetypeId");
            return (Criteria) this;
        }

        public Criteria andSExpensetypeIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("s_expensetype_id between", value1, value2, "sExpensetypeId");
            return (Criteria) this;
        }

        public Criteria andSExpensetypeIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("s_expensetype_id not between", value1, value2, "sExpensetypeId");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNull() {
            addCriterion("producttype is null");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNotNull() {
            addCriterion("producttype is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypeEqualTo(String value) {
            addCriterion("producttype =", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotEqualTo(String value) {
            addCriterion("producttype <>", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThan(String value) {
            addCriterion("producttype >", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThanOrEqualTo(String value) {
            addCriterion("producttype >=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThan(String value) {
            addCriterion("producttype <", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThanOrEqualTo(String value) {
            addCriterion("producttype <=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLike(String value) {
            addCriterion("producttype like", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotLike(String value) {
            addCriterion("producttype not like", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeIn(List<String> values) {
            addCriterion("producttype in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotIn(List<String> values) {
            addCriterion("producttype not in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeBetween(String value1, String value2) {
            addCriterion("producttype between", value1, value2, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotBetween(String value1, String value2) {
            addCriterion("producttype not between", value1, value2, "producttype");
            return (Criteria) this;
        }

        public Criteria andImageurlIsNull() {
            addCriterion("imageurl is null");
            return (Criteria) this;
        }

        public Criteria andImageurlIsNotNull() {
            addCriterion("imageurl is not null");
            return (Criteria) this;
        }

        public Criteria andImageurlEqualTo(String value) {
            addCriterion("imageurl =", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotEqualTo(String value) {
            addCriterion("imageurl <>", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlGreaterThan(String value) {
            addCriterion("imageurl >", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlGreaterThanOrEqualTo(String value) {
            addCriterion("imageurl >=", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLessThan(String value) {
            addCriterion("imageurl <", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLessThanOrEqualTo(String value) {
            addCriterion("imageurl <=", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLike(String value) {
            addCriterion("imageurl like", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotLike(String value) {
            addCriterion("imageurl not like", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlIn(List<String> values) {
            addCriterion("imageurl in", values, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotIn(List<String> values) {
            addCriterion("imageurl not in", values, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlBetween(String value1, String value2) {
            addCriterion("imageurl between", value1, value2, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotBetween(String value1, String value2) {
            addCriterion("imageurl not between", value1, value2, "imageurl");
            return (Criteria) this;
        }

        public Criteria andDescriptionurlIsNull() {
            addCriterion("descriptionurl is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionurlIsNotNull() {
            addCriterion("descriptionurl is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionurlEqualTo(String value) {
            addCriterion("descriptionurl =", value, "descriptionurl");
            return (Criteria) this;
        }

        public Criteria andDescriptionurlNotEqualTo(String value) {
            addCriterion("descriptionurl <>", value, "descriptionurl");
            return (Criteria) this;
        }

        public Criteria andDescriptionurlGreaterThan(String value) {
            addCriterion("descriptionurl >", value, "descriptionurl");
            return (Criteria) this;
        }

        public Criteria andDescriptionurlGreaterThanOrEqualTo(String value) {
            addCriterion("descriptionurl >=", value, "descriptionurl");
            return (Criteria) this;
        }

        public Criteria andDescriptionurlLessThan(String value) {
            addCriterion("descriptionurl <", value, "descriptionurl");
            return (Criteria) this;
        }

        public Criteria andDescriptionurlLessThanOrEqualTo(String value) {
            addCriterion("descriptionurl <=", value, "descriptionurl");
            return (Criteria) this;
        }

        public Criteria andDescriptionurlLike(String value) {
            addCriterion("descriptionurl like", value, "descriptionurl");
            return (Criteria) this;
        }

        public Criteria andDescriptionurlNotLike(String value) {
            addCriterion("descriptionurl not like", value, "descriptionurl");
            return (Criteria) this;
        }

        public Criteria andDescriptionurlIn(List<String> values) {
            addCriterion("descriptionurl in", values, "descriptionurl");
            return (Criteria) this;
        }

        public Criteria andDescriptionurlNotIn(List<String> values) {
            addCriterion("descriptionurl not in", values, "descriptionurl");
            return (Criteria) this;
        }

        public Criteria andDescriptionurlBetween(String value1, String value2) {
            addCriterion("descriptionurl between", value1, value2, "descriptionurl");
            return (Criteria) this;
        }

        public Criteria andDescriptionurlNotBetween(String value1, String value2) {
            addCriterion("descriptionurl not between", value1, value2, "descriptionurl");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysIsNull() {
            addCriterion("guaranteedays is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysIsNotNull() {
            addCriterion("guaranteedays is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysEqualTo(BigDecimal value) {
            addCriterion("guaranteedays =", value, "guaranteedays");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysNotEqualTo(BigDecimal value) {
            addCriterion("guaranteedays <>", value, "guaranteedays");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysGreaterThan(BigDecimal value) {
            addCriterion("guaranteedays >", value, "guaranteedays");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("guaranteedays >=", value, "guaranteedays");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysLessThan(BigDecimal value) {
            addCriterion("guaranteedays <", value, "guaranteedays");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("guaranteedays <=", value, "guaranteedays");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysIn(List<BigDecimal> values) {
            addCriterion("guaranteedays in", values, "guaranteedays");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysNotIn(List<BigDecimal> values) {
            addCriterion("guaranteedays not in", values, "guaranteedays");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("guaranteedays between", value1, value2, "guaranteedays");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("guaranteedays not between", value1, value2, "guaranteedays");
            return (Criteria) this;
        }

        public Criteria andRMailtextIdIsNull() {
            addCriterion("r_mailtext_id is null");
            return (Criteria) this;
        }

        public Criteria andRMailtextIdIsNotNull() {
            addCriterion("r_mailtext_id is not null");
            return (Criteria) this;
        }

        public Criteria andRMailtextIdEqualTo(BigDecimal value) {
            addCriterion("r_mailtext_id =", value, "rMailtextId");
            return (Criteria) this;
        }

        public Criteria andRMailtextIdNotEqualTo(BigDecimal value) {
            addCriterion("r_mailtext_id <>", value, "rMailtextId");
            return (Criteria) this;
        }

        public Criteria andRMailtextIdGreaterThan(BigDecimal value) {
            addCriterion("r_mailtext_id >", value, "rMailtextId");
            return (Criteria) this;
        }

        public Criteria andRMailtextIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("r_mailtext_id >=", value, "rMailtextId");
            return (Criteria) this;
        }

        public Criteria andRMailtextIdLessThan(BigDecimal value) {
            addCriterion("r_mailtext_id <", value, "rMailtextId");
            return (Criteria) this;
        }

        public Criteria andRMailtextIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("r_mailtext_id <=", value, "rMailtextId");
            return (Criteria) this;
        }

        public Criteria andRMailtextIdIn(List<BigDecimal> values) {
            addCriterion("r_mailtext_id in", values, "rMailtextId");
            return (Criteria) this;
        }

        public Criteria andRMailtextIdNotIn(List<BigDecimal> values) {
            addCriterion("r_mailtext_id not in", values, "rMailtextId");
            return (Criteria) this;
        }

        public Criteria andRMailtextIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("r_mailtext_id between", value1, value2, "rMailtextId");
            return (Criteria) this;
        }

        public Criteria andRMailtextIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("r_mailtext_id not between", value1, value2, "rMailtextId");
            return (Criteria) this;
        }

        public Criteria andVersionnoIsNull() {
            addCriterion("versionno is null");
            return (Criteria) this;
        }

        public Criteria andVersionnoIsNotNull() {
            addCriterion("versionno is not null");
            return (Criteria) this;
        }

        public Criteria andVersionnoEqualTo(String value) {
            addCriterion("versionno =", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotEqualTo(String value) {
            addCriterion("versionno <>", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoGreaterThan(String value) {
            addCriterion("versionno >", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoGreaterThanOrEqualTo(String value) {
            addCriterion("versionno >=", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLessThan(String value) {
            addCriterion("versionno <", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLessThanOrEqualTo(String value) {
            addCriterion("versionno <=", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLike(String value) {
            addCriterion("versionno like", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotLike(String value) {
            addCriterion("versionno not like", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoIn(List<String> values) {
            addCriterion("versionno in", values, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotIn(List<String> values) {
            addCriterion("versionno not in", values, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoBetween(String value1, String value2) {
            addCriterion("versionno between", value1, value2, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotBetween(String value1, String value2) {
            addCriterion("versionno not between", value1, value2, "versionno");
            return (Criteria) this;
        }

        public Criteria andMAttributesetIdIsNull() {
            addCriterion("m_attributeset_id is null");
            return (Criteria) this;
        }

        public Criteria andMAttributesetIdIsNotNull() {
            addCriterion("m_attributeset_id is not null");
            return (Criteria) this;
        }

        public Criteria andMAttributesetIdEqualTo(BigDecimal value) {
            addCriterion("m_attributeset_id =", value, "mAttributesetId");
            return (Criteria) this;
        }

        public Criteria andMAttributesetIdNotEqualTo(BigDecimal value) {
            addCriterion("m_attributeset_id <>", value, "mAttributesetId");
            return (Criteria) this;
        }

        public Criteria andMAttributesetIdGreaterThan(BigDecimal value) {
            addCriterion("m_attributeset_id >", value, "mAttributesetId");
            return (Criteria) this;
        }

        public Criteria andMAttributesetIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m_attributeset_id >=", value, "mAttributesetId");
            return (Criteria) this;
        }

        public Criteria andMAttributesetIdLessThan(BigDecimal value) {
            addCriterion("m_attributeset_id <", value, "mAttributesetId");
            return (Criteria) this;
        }

        public Criteria andMAttributesetIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m_attributeset_id <=", value, "mAttributesetId");
            return (Criteria) this;
        }

        public Criteria andMAttributesetIdIn(List<BigDecimal> values) {
            addCriterion("m_attributeset_id in", values, "mAttributesetId");
            return (Criteria) this;
        }

        public Criteria andMAttributesetIdNotIn(List<BigDecimal> values) {
            addCriterion("m_attributeset_id not in", values, "mAttributesetId");
            return (Criteria) this;
        }

        public Criteria andMAttributesetIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_attributeset_id between", value1, value2, "mAttributesetId");
            return (Criteria) this;
        }

        public Criteria andMAttributesetIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_attributeset_id not between", value1, value2, "mAttributesetId");
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

        public Criteria andDownloadurlIsNull() {
            addCriterion("downloadurl is null");
            return (Criteria) this;
        }

        public Criteria andDownloadurlIsNotNull() {
            addCriterion("downloadurl is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadurlEqualTo(String value) {
            addCriterion("downloadurl =", value, "downloadurl");
            return (Criteria) this;
        }

        public Criteria andDownloadurlNotEqualTo(String value) {
            addCriterion("downloadurl <>", value, "downloadurl");
            return (Criteria) this;
        }

        public Criteria andDownloadurlGreaterThan(String value) {
            addCriterion("downloadurl >", value, "downloadurl");
            return (Criteria) this;
        }

        public Criteria andDownloadurlGreaterThanOrEqualTo(String value) {
            addCriterion("downloadurl >=", value, "downloadurl");
            return (Criteria) this;
        }

        public Criteria andDownloadurlLessThan(String value) {
            addCriterion("downloadurl <", value, "downloadurl");
            return (Criteria) this;
        }

        public Criteria andDownloadurlLessThanOrEqualTo(String value) {
            addCriterion("downloadurl <=", value, "downloadurl");
            return (Criteria) this;
        }

        public Criteria andDownloadurlLike(String value) {
            addCriterion("downloadurl like", value, "downloadurl");
            return (Criteria) this;
        }

        public Criteria andDownloadurlNotLike(String value) {
            addCriterion("downloadurl not like", value, "downloadurl");
            return (Criteria) this;
        }

        public Criteria andDownloadurlIn(List<String> values) {
            addCriterion("downloadurl in", values, "downloadurl");
            return (Criteria) this;
        }

        public Criteria andDownloadurlNotIn(List<String> values) {
            addCriterion("downloadurl not in", values, "downloadurl");
            return (Criteria) this;
        }

        public Criteria andDownloadurlBetween(String value1, String value2) {
            addCriterion("downloadurl between", value1, value2, "downloadurl");
            return (Criteria) this;
        }

        public Criteria andDownloadurlNotBetween(String value1, String value2) {
            addCriterion("downloadurl not between", value1, value2, "downloadurl");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdIsNull() {
            addCriterion("m_freightcategory_id is null");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdIsNotNull() {
            addCriterion("m_freightcategory_id is not null");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdEqualTo(BigDecimal value) {
            addCriterion("m_freightcategory_id =", value, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdNotEqualTo(BigDecimal value) {
            addCriterion("m_freightcategory_id <>", value, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdGreaterThan(BigDecimal value) {
            addCriterion("m_freightcategory_id >", value, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m_freightcategory_id >=", value, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdLessThan(BigDecimal value) {
            addCriterion("m_freightcategory_id <", value, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m_freightcategory_id <=", value, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdIn(List<BigDecimal> values) {
            addCriterion("m_freightcategory_id in", values, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdNotIn(List<BigDecimal> values) {
            addCriterion("m_freightcategory_id not in", values, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_freightcategory_id between", value1, value2, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andMFreightcategoryIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_freightcategory_id not between", value1, value2, "mFreightcategoryId");
            return (Criteria) this;
        }

        public Criteria andMLocatorIdIsNull() {
            addCriterion("m_locator_id is null");
            return (Criteria) this;
        }

        public Criteria andMLocatorIdIsNotNull() {
            addCriterion("m_locator_id is not null");
            return (Criteria) this;
        }

        public Criteria andMLocatorIdEqualTo(BigDecimal value) {
            addCriterion("m_locator_id =", value, "mLocatorId");
            return (Criteria) this;
        }

        public Criteria andMLocatorIdNotEqualTo(BigDecimal value) {
            addCriterion("m_locator_id <>", value, "mLocatorId");
            return (Criteria) this;
        }

        public Criteria andMLocatorIdGreaterThan(BigDecimal value) {
            addCriterion("m_locator_id >", value, "mLocatorId");
            return (Criteria) this;
        }

        public Criteria andMLocatorIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m_locator_id >=", value, "mLocatorId");
            return (Criteria) this;
        }

        public Criteria andMLocatorIdLessThan(BigDecimal value) {
            addCriterion("m_locator_id <", value, "mLocatorId");
            return (Criteria) this;
        }

        public Criteria andMLocatorIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m_locator_id <=", value, "mLocatorId");
            return (Criteria) this;
        }

        public Criteria andMLocatorIdIn(List<BigDecimal> values) {
            addCriterion("m_locator_id in", values, "mLocatorId");
            return (Criteria) this;
        }

        public Criteria andMLocatorIdNotIn(List<BigDecimal> values) {
            addCriterion("m_locator_id not in", values, "mLocatorId");
            return (Criteria) this;
        }

        public Criteria andMLocatorIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_locator_id between", value1, value2, "mLocatorId");
            return (Criteria) this;
        }

        public Criteria andMLocatorIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_locator_id not between", value1, value2, "mLocatorId");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysminIsNull() {
            addCriterion("guaranteedaysmin is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysminIsNotNull() {
            addCriterion("guaranteedaysmin is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysminEqualTo(BigDecimal value) {
            addCriterion("guaranteedaysmin =", value, "guaranteedaysmin");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysminNotEqualTo(BigDecimal value) {
            addCriterion("guaranteedaysmin <>", value, "guaranteedaysmin");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysminGreaterThan(BigDecimal value) {
            addCriterion("guaranteedaysmin >", value, "guaranteedaysmin");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysminGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("guaranteedaysmin >=", value, "guaranteedaysmin");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysminLessThan(BigDecimal value) {
            addCriterion("guaranteedaysmin <", value, "guaranteedaysmin");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysminLessThanOrEqualTo(BigDecimal value) {
            addCriterion("guaranteedaysmin <=", value, "guaranteedaysmin");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysminIn(List<BigDecimal> values) {
            addCriterion("guaranteedaysmin in", values, "guaranteedaysmin");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysminNotIn(List<BigDecimal> values) {
            addCriterion("guaranteedaysmin not in", values, "guaranteedaysmin");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysminBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("guaranteedaysmin between", value1, value2, "guaranteedaysmin");
            return (Criteria) this;
        }

        public Criteria andGuaranteedaysminNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("guaranteedaysmin not between", value1, value2, "guaranteedaysmin");
            return (Criteria) this;
        }

        public Criteria andIswebstorefeaturedIsNull() {
            addCriterion("iswebstorefeatured is null");
            return (Criteria) this;
        }

        public Criteria andIswebstorefeaturedIsNotNull() {
            addCriterion("iswebstorefeatured is not null");
            return (Criteria) this;
        }

        public Criteria andIswebstorefeaturedEqualTo(String value) {
            addCriterion("iswebstorefeatured =", value, "iswebstorefeatured");
            return (Criteria) this;
        }

        public Criteria andIswebstorefeaturedNotEqualTo(String value) {
            addCriterion("iswebstorefeatured <>", value, "iswebstorefeatured");
            return (Criteria) this;
        }

        public Criteria andIswebstorefeaturedGreaterThan(String value) {
            addCriterion("iswebstorefeatured >", value, "iswebstorefeatured");
            return (Criteria) this;
        }

        public Criteria andIswebstorefeaturedGreaterThanOrEqualTo(String value) {
            addCriterion("iswebstorefeatured >=", value, "iswebstorefeatured");
            return (Criteria) this;
        }

        public Criteria andIswebstorefeaturedLessThan(String value) {
            addCriterion("iswebstorefeatured <", value, "iswebstorefeatured");
            return (Criteria) this;
        }

        public Criteria andIswebstorefeaturedLessThanOrEqualTo(String value) {
            addCriterion("iswebstorefeatured <=", value, "iswebstorefeatured");
            return (Criteria) this;
        }

        public Criteria andIswebstorefeaturedLike(String value) {
            addCriterion("iswebstorefeatured like", value, "iswebstorefeatured");
            return (Criteria) this;
        }

        public Criteria andIswebstorefeaturedNotLike(String value) {
            addCriterion("iswebstorefeatured not like", value, "iswebstorefeatured");
            return (Criteria) this;
        }

        public Criteria andIswebstorefeaturedIn(List<String> values) {
            addCriterion("iswebstorefeatured in", values, "iswebstorefeatured");
            return (Criteria) this;
        }

        public Criteria andIswebstorefeaturedNotIn(List<String> values) {
            addCriterion("iswebstorefeatured not in", values, "iswebstorefeatured");
            return (Criteria) this;
        }

        public Criteria andIswebstorefeaturedBetween(String value1, String value2) {
            addCriterion("iswebstorefeatured between", value1, value2, "iswebstorefeatured");
            return (Criteria) this;
        }

        public Criteria andIswebstorefeaturedNotBetween(String value1, String value2) {
            addCriterion("iswebstorefeatured not between", value1, value2, "iswebstorefeatured");
            return (Criteria) this;
        }

        public Criteria andIsselfserviceIsNull() {
            addCriterion("isselfservice is null");
            return (Criteria) this;
        }

        public Criteria andIsselfserviceIsNotNull() {
            addCriterion("isselfservice is not null");
            return (Criteria) this;
        }

        public Criteria andIsselfserviceEqualTo(String value) {
            addCriterion("isselfservice =", value, "isselfservice");
            return (Criteria) this;
        }

        public Criteria andIsselfserviceNotEqualTo(String value) {
            addCriterion("isselfservice <>", value, "isselfservice");
            return (Criteria) this;
        }

        public Criteria andIsselfserviceGreaterThan(String value) {
            addCriterion("isselfservice >", value, "isselfservice");
            return (Criteria) this;
        }

        public Criteria andIsselfserviceGreaterThanOrEqualTo(String value) {
            addCriterion("isselfservice >=", value, "isselfservice");
            return (Criteria) this;
        }

        public Criteria andIsselfserviceLessThan(String value) {
            addCriterion("isselfservice <", value, "isselfservice");
            return (Criteria) this;
        }

        public Criteria andIsselfserviceLessThanOrEqualTo(String value) {
            addCriterion("isselfservice <=", value, "isselfservice");
            return (Criteria) this;
        }

        public Criteria andIsselfserviceLike(String value) {
            addCriterion("isselfservice like", value, "isselfservice");
            return (Criteria) this;
        }

        public Criteria andIsselfserviceNotLike(String value) {
            addCriterion("isselfservice not like", value, "isselfservice");
            return (Criteria) this;
        }

        public Criteria andIsselfserviceIn(List<String> values) {
            addCriterion("isselfservice in", values, "isselfservice");
            return (Criteria) this;
        }

        public Criteria andIsselfserviceNotIn(List<String> values) {
            addCriterion("isselfservice not in", values, "isselfservice");
            return (Criteria) this;
        }

        public Criteria andIsselfserviceBetween(String value1, String value2) {
            addCriterion("isselfservice between", value1, value2, "isselfservice");
            return (Criteria) this;
        }

        public Criteria andIsselfserviceNotBetween(String value1, String value2) {
            addCriterion("isselfservice not between", value1, value2, "isselfservice");
            return (Criteria) this;
        }

        public Criteria andCSubscriptiontypeIdIsNull() {
            addCriterion("c_subscriptiontype_id is null");
            return (Criteria) this;
        }

        public Criteria andCSubscriptiontypeIdIsNotNull() {
            addCriterion("c_subscriptiontype_id is not null");
            return (Criteria) this;
        }

        public Criteria andCSubscriptiontypeIdEqualTo(BigDecimal value) {
            addCriterion("c_subscriptiontype_id =", value, "cSubscriptiontypeId");
            return (Criteria) this;
        }

        public Criteria andCSubscriptiontypeIdNotEqualTo(BigDecimal value) {
            addCriterion("c_subscriptiontype_id <>", value, "cSubscriptiontypeId");
            return (Criteria) this;
        }

        public Criteria andCSubscriptiontypeIdGreaterThan(BigDecimal value) {
            addCriterion("c_subscriptiontype_id >", value, "cSubscriptiontypeId");
            return (Criteria) this;
        }

        public Criteria andCSubscriptiontypeIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c_subscriptiontype_id >=", value, "cSubscriptiontypeId");
            return (Criteria) this;
        }

        public Criteria andCSubscriptiontypeIdLessThan(BigDecimal value) {
            addCriterion("c_subscriptiontype_id <", value, "cSubscriptiontypeId");
            return (Criteria) this;
        }

        public Criteria andCSubscriptiontypeIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("c_subscriptiontype_id <=", value, "cSubscriptiontypeId");
            return (Criteria) this;
        }

        public Criteria andCSubscriptiontypeIdIn(List<BigDecimal> values) {
            addCriterion("c_subscriptiontype_id in", values, "cSubscriptiontypeId");
            return (Criteria) this;
        }

        public Criteria andCSubscriptiontypeIdNotIn(List<BigDecimal> values) {
            addCriterion("c_subscriptiontype_id not in", values, "cSubscriptiontypeId");
            return (Criteria) this;
        }

        public Criteria andCSubscriptiontypeIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_subscriptiontype_id between", value1, value2, "cSubscriptiontypeId");
            return (Criteria) this;
        }

        public Criteria andCSubscriptiontypeIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_subscriptiontype_id not between", value1, value2, "cSubscriptiontypeId");
            return (Criteria) this;
        }

        public Criteria andIsdropshipIsNull() {
            addCriterion("isdropship is null");
            return (Criteria) this;
        }

        public Criteria andIsdropshipIsNotNull() {
            addCriterion("isdropship is not null");
            return (Criteria) this;
        }

        public Criteria andIsdropshipEqualTo(String value) {
            addCriterion("isdropship =", value, "isdropship");
            return (Criteria) this;
        }

        public Criteria andIsdropshipNotEqualTo(String value) {
            addCriterion("isdropship <>", value, "isdropship");
            return (Criteria) this;
        }

        public Criteria andIsdropshipGreaterThan(String value) {
            addCriterion("isdropship >", value, "isdropship");
            return (Criteria) this;
        }

        public Criteria andIsdropshipGreaterThanOrEqualTo(String value) {
            addCriterion("isdropship >=", value, "isdropship");
            return (Criteria) this;
        }

        public Criteria andIsdropshipLessThan(String value) {
            addCriterion("isdropship <", value, "isdropship");
            return (Criteria) this;
        }

        public Criteria andIsdropshipLessThanOrEqualTo(String value) {
            addCriterion("isdropship <=", value, "isdropship");
            return (Criteria) this;
        }

        public Criteria andIsdropshipLike(String value) {
            addCriterion("isdropship like", value, "isdropship");
            return (Criteria) this;
        }

        public Criteria andIsdropshipNotLike(String value) {
            addCriterion("isdropship not like", value, "isdropship");
            return (Criteria) this;
        }

        public Criteria andIsdropshipIn(List<String> values) {
            addCriterion("isdropship in", values, "isdropship");
            return (Criteria) this;
        }

        public Criteria andIsdropshipNotIn(List<String> values) {
            addCriterion("isdropship not in", values, "isdropship");
            return (Criteria) this;
        }

        public Criteria andIsdropshipBetween(String value1, String value2) {
            addCriterion("isdropship between", value1, value2, "isdropship");
            return (Criteria) this;
        }

        public Criteria andIsdropshipNotBetween(String value1, String value2) {
            addCriterion("isdropship not between", value1, value2, "isdropship");
            return (Criteria) this;
        }

        public Criteria andIsexcludeautodeliveryIsNull() {
            addCriterion("isexcludeautodelivery is null");
            return (Criteria) this;
        }

        public Criteria andIsexcludeautodeliveryIsNotNull() {
            addCriterion("isexcludeautodelivery is not null");
            return (Criteria) this;
        }

        public Criteria andIsexcludeautodeliveryEqualTo(String value) {
            addCriterion("isexcludeautodelivery =", value, "isexcludeautodelivery");
            return (Criteria) this;
        }

        public Criteria andIsexcludeautodeliveryNotEqualTo(String value) {
            addCriterion("isexcludeautodelivery <>", value, "isexcludeautodelivery");
            return (Criteria) this;
        }

        public Criteria andIsexcludeautodeliveryGreaterThan(String value) {
            addCriterion("isexcludeautodelivery >", value, "isexcludeautodelivery");
            return (Criteria) this;
        }

        public Criteria andIsexcludeautodeliveryGreaterThanOrEqualTo(String value) {
            addCriterion("isexcludeautodelivery >=", value, "isexcludeautodelivery");
            return (Criteria) this;
        }

        public Criteria andIsexcludeautodeliveryLessThan(String value) {
            addCriterion("isexcludeautodelivery <", value, "isexcludeautodelivery");
            return (Criteria) this;
        }

        public Criteria andIsexcludeautodeliveryLessThanOrEqualTo(String value) {
            addCriterion("isexcludeautodelivery <=", value, "isexcludeautodelivery");
            return (Criteria) this;
        }

        public Criteria andIsexcludeautodeliveryLike(String value) {
            addCriterion("isexcludeautodelivery like", value, "isexcludeautodelivery");
            return (Criteria) this;
        }

        public Criteria andIsexcludeautodeliveryNotLike(String value) {
            addCriterion("isexcludeautodelivery not like", value, "isexcludeautodelivery");
            return (Criteria) this;
        }

        public Criteria andIsexcludeautodeliveryIn(List<String> values) {
            addCriterion("isexcludeautodelivery in", values, "isexcludeautodelivery");
            return (Criteria) this;
        }

        public Criteria andIsexcludeautodeliveryNotIn(List<String> values) {
            addCriterion("isexcludeautodelivery not in", values, "isexcludeautodelivery");
            return (Criteria) this;
        }

        public Criteria andIsexcludeautodeliveryBetween(String value1, String value2) {
            addCriterion("isexcludeautodelivery between", value1, value2, "isexcludeautodelivery");
            return (Criteria) this;
        }

        public Criteria andIsexcludeautodeliveryNotBetween(String value1, String value2) {
            addCriterion("isexcludeautodelivery not between", value1, value2, "isexcludeautodelivery");
            return (Criteria) this;
        }

        public Criteria andGroup1IsNull() {
            addCriterion("group1 is null");
            return (Criteria) this;
        }

        public Criteria andGroup1IsNotNull() {
            addCriterion("group1 is not null");
            return (Criteria) this;
        }

        public Criteria andGroup1EqualTo(String value) {
            addCriterion("group1 =", value, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1NotEqualTo(String value) {
            addCriterion("group1 <>", value, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1GreaterThan(String value) {
            addCriterion("group1 >", value, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1GreaterThanOrEqualTo(String value) {
            addCriterion("group1 >=", value, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1LessThan(String value) {
            addCriterion("group1 <", value, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1LessThanOrEqualTo(String value) {
            addCriterion("group1 <=", value, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1Like(String value) {
            addCriterion("group1 like", value, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1NotLike(String value) {
            addCriterion("group1 not like", value, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1In(List<String> values) {
            addCriterion("group1 in", values, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1NotIn(List<String> values) {
            addCriterion("group1 not in", values, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1Between(String value1, String value2) {
            addCriterion("group1 between", value1, value2, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1NotBetween(String value1, String value2) {
            addCriterion("group1 not between", value1, value2, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup2IsNull() {
            addCriterion("group2 is null");
            return (Criteria) this;
        }

        public Criteria andGroup2IsNotNull() {
            addCriterion("group2 is not null");
            return (Criteria) this;
        }

        public Criteria andGroup2EqualTo(String value) {
            addCriterion("group2 =", value, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2NotEqualTo(String value) {
            addCriterion("group2 <>", value, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2GreaterThan(String value) {
            addCriterion("group2 >", value, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2GreaterThanOrEqualTo(String value) {
            addCriterion("group2 >=", value, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2LessThan(String value) {
            addCriterion("group2 <", value, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2LessThanOrEqualTo(String value) {
            addCriterion("group2 <=", value, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2Like(String value) {
            addCriterion("group2 like", value, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2NotLike(String value) {
            addCriterion("group2 not like", value, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2In(List<String> values) {
            addCriterion("group2 in", values, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2NotIn(List<String> values) {
            addCriterion("group2 not in", values, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2Between(String value1, String value2) {
            addCriterion("group2 between", value1, value2, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2NotBetween(String value1, String value2) {
            addCriterion("group2 not between", value1, value2, "group2");
            return (Criteria) this;
        }

        public Criteria andIstoformuleIsNull() {
            addCriterion("istoformule is null");
            return (Criteria) this;
        }

        public Criteria andIstoformuleIsNotNull() {
            addCriterion("istoformule is not null");
            return (Criteria) this;
        }

        public Criteria andIstoformuleEqualTo(String value) {
            addCriterion("istoformule =", value, "istoformule");
            return (Criteria) this;
        }

        public Criteria andIstoformuleNotEqualTo(String value) {
            addCriterion("istoformule <>", value, "istoformule");
            return (Criteria) this;
        }

        public Criteria andIstoformuleGreaterThan(String value) {
            addCriterion("istoformule >", value, "istoformule");
            return (Criteria) this;
        }

        public Criteria andIstoformuleGreaterThanOrEqualTo(String value) {
            addCriterion("istoformule >=", value, "istoformule");
            return (Criteria) this;
        }

        public Criteria andIstoformuleLessThan(String value) {
            addCriterion("istoformule <", value, "istoformule");
            return (Criteria) this;
        }

        public Criteria andIstoformuleLessThanOrEqualTo(String value) {
            addCriterion("istoformule <=", value, "istoformule");
            return (Criteria) this;
        }

        public Criteria andIstoformuleLike(String value) {
            addCriterion("istoformule like", value, "istoformule");
            return (Criteria) this;
        }

        public Criteria andIstoformuleNotLike(String value) {
            addCriterion("istoformule not like", value, "istoformule");
            return (Criteria) this;
        }

        public Criteria andIstoformuleIn(List<String> values) {
            addCriterion("istoformule in", values, "istoformule");
            return (Criteria) this;
        }

        public Criteria andIstoformuleNotIn(List<String> values) {
            addCriterion("istoformule not in", values, "istoformule");
            return (Criteria) this;
        }

        public Criteria andIstoformuleBetween(String value1, String value2) {
            addCriterion("istoformule between", value1, value2, "istoformule");
            return (Criteria) this;
        }

        public Criteria andIstoformuleNotBetween(String value1, String value2) {
            addCriterion("istoformule not between", value1, value2, "istoformule");
            return (Criteria) this;
        }

        public Criteria andLowlevelIsNull() {
            addCriterion("lowlevel is null");
            return (Criteria) this;
        }

        public Criteria andLowlevelIsNotNull() {
            addCriterion("lowlevel is not null");
            return (Criteria) this;
        }

        public Criteria andLowlevelEqualTo(BigDecimal value) {
            addCriterion("lowlevel =", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelNotEqualTo(BigDecimal value) {
            addCriterion("lowlevel <>", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelGreaterThan(BigDecimal value) {
            addCriterion("lowlevel >", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lowlevel >=", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelLessThan(BigDecimal value) {
            addCriterion("lowlevel <", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lowlevel <=", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelIn(List<BigDecimal> values) {
            addCriterion("lowlevel in", values, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelNotIn(List<BigDecimal> values) {
            addCriterion("lowlevel not in", values, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lowlevel between", value1, value2, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lowlevel not between", value1, value2, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andUnitsperpackIsNull() {
            addCriterion("unitsperpack is null");
            return (Criteria) this;
        }

        public Criteria andUnitsperpackIsNotNull() {
            addCriterion("unitsperpack is not null");
            return (Criteria) this;
        }

        public Criteria andUnitsperpackEqualTo(BigDecimal value) {
            addCriterion("unitsperpack =", value, "unitsperpack");
            return (Criteria) this;
        }

        public Criteria andUnitsperpackNotEqualTo(BigDecimal value) {
            addCriterion("unitsperpack <>", value, "unitsperpack");
            return (Criteria) this;
        }

        public Criteria andUnitsperpackGreaterThan(BigDecimal value) {
            addCriterion("unitsperpack >", value, "unitsperpack");
            return (Criteria) this;
        }

        public Criteria andUnitsperpackGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unitsperpack >=", value, "unitsperpack");
            return (Criteria) this;
        }

        public Criteria andUnitsperpackLessThan(BigDecimal value) {
            addCriterion("unitsperpack <", value, "unitsperpack");
            return (Criteria) this;
        }

        public Criteria andUnitsperpackLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unitsperpack <=", value, "unitsperpack");
            return (Criteria) this;
        }

        public Criteria andUnitsperpackIn(List<BigDecimal> values) {
            addCriterion("unitsperpack in", values, "unitsperpack");
            return (Criteria) this;
        }

        public Criteria andUnitsperpackNotIn(List<BigDecimal> values) {
            addCriterion("unitsperpack not in", values, "unitsperpack");
            return (Criteria) this;
        }

        public Criteria andUnitsperpackBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unitsperpack between", value1, value2, "unitsperpack");
            return (Criteria) this;
        }

        public Criteria andUnitsperpackNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unitsperpack not between", value1, value2, "unitsperpack");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedatIsNull() {
            addCriterion("discontinuedat is null");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedatIsNotNull() {
            addCriterion("discontinuedat is not null");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedatEqualTo(Date value) {
            addCriterion("discontinuedat =", value, "discontinuedat");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedatNotEqualTo(Date value) {
            addCriterion("discontinuedat <>", value, "discontinuedat");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedatGreaterThan(Date value) {
            addCriterion("discontinuedat >", value, "discontinuedat");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedatGreaterThanOrEqualTo(Date value) {
            addCriterion("discontinuedat >=", value, "discontinuedat");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedatLessThan(Date value) {
            addCriterion("discontinuedat <", value, "discontinuedat");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedatLessThanOrEqualTo(Date value) {
            addCriterion("discontinuedat <=", value, "discontinuedat");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedatIn(List<Date> values) {
            addCriterion("discontinuedat in", values, "discontinuedat");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedatNotIn(List<Date> values) {
            addCriterion("discontinuedat not in", values, "discontinuedat");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedatBetween(Date value1, Date value2) {
            addCriterion("discontinuedat between", value1, value2, "discontinuedat");
            return (Criteria) this;
        }

        public Criteria andDiscontinuedatNotBetween(Date value1, Date value2) {
            addCriterion("discontinuedat not between", value1, value2, "discontinuedat");
            return (Criteria) this;
        }

        public Criteria andCopyfromIsNull() {
            addCriterion("copyfrom is null");
            return (Criteria) this;
        }

        public Criteria andCopyfromIsNotNull() {
            addCriterion("copyfrom is not null");
            return (Criteria) this;
        }

        public Criteria andCopyfromEqualTo(String value) {
            addCriterion("copyfrom =", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromNotEqualTo(String value) {
            addCriterion("copyfrom <>", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromGreaterThan(String value) {
            addCriterion("copyfrom >", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromGreaterThanOrEqualTo(String value) {
            addCriterion("copyfrom >=", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromLessThan(String value) {
            addCriterion("copyfrom <", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromLessThanOrEqualTo(String value) {
            addCriterion("copyfrom <=", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromLike(String value) {
            addCriterion("copyfrom like", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromNotLike(String value) {
            addCriterion("copyfrom not like", value, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromIn(List<String> values) {
            addCriterion("copyfrom in", values, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromNotIn(List<String> values) {
            addCriterion("copyfrom not in", values, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromBetween(String value1, String value2) {
            addCriterion("copyfrom between", value1, value2, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andCopyfromNotBetween(String value1, String value2) {
            addCriterion("copyfrom not between", value1, value2, "copyfrom");
            return (Criteria) this;
        }

        public Criteria andMParttypeIdIsNull() {
            addCriterion("m_parttype_id is null");
            return (Criteria) this;
        }

        public Criteria andMParttypeIdIsNotNull() {
            addCriterion("m_parttype_id is not null");
            return (Criteria) this;
        }

        public Criteria andMParttypeIdEqualTo(BigDecimal value) {
            addCriterion("m_parttype_id =", value, "mParttypeId");
            return (Criteria) this;
        }

        public Criteria andMParttypeIdNotEqualTo(BigDecimal value) {
            addCriterion("m_parttype_id <>", value, "mParttypeId");
            return (Criteria) this;
        }

        public Criteria andMParttypeIdGreaterThan(BigDecimal value) {
            addCriterion("m_parttype_id >", value, "mParttypeId");
            return (Criteria) this;
        }

        public Criteria andMParttypeIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m_parttype_id >=", value, "mParttypeId");
            return (Criteria) this;
        }

        public Criteria andMParttypeIdLessThan(BigDecimal value) {
            addCriterion("m_parttype_id <", value, "mParttypeId");
            return (Criteria) this;
        }

        public Criteria andMParttypeIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m_parttype_id <=", value, "mParttypeId");
            return (Criteria) this;
        }

        public Criteria andMParttypeIdIn(List<BigDecimal> values) {
            addCriterion("m_parttype_id in", values, "mParttypeId");
            return (Criteria) this;
        }

        public Criteria andMParttypeIdNotIn(List<BigDecimal> values) {
            addCriterion("m_parttype_id not in", values, "mParttypeId");
            return (Criteria) this;
        }

        public Criteria andMParttypeIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_parttype_id between", value1, value2, "mParttypeId");
            return (Criteria) this;
        }

        public Criteria andMParttypeIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_parttype_id not between", value1, value2, "mParttypeId");
            return (Criteria) this;
        }

        public Criteria andIskanbanIsNull() {
            addCriterion("iskanban is null");
            return (Criteria) this;
        }

        public Criteria andIskanbanIsNotNull() {
            addCriterion("iskanban is not null");
            return (Criteria) this;
        }

        public Criteria andIskanbanEqualTo(String value) {
            addCriterion("iskanban =", value, "iskanban");
            return (Criteria) this;
        }

        public Criteria andIskanbanNotEqualTo(String value) {
            addCriterion("iskanban <>", value, "iskanban");
            return (Criteria) this;
        }

        public Criteria andIskanbanGreaterThan(String value) {
            addCriterion("iskanban >", value, "iskanban");
            return (Criteria) this;
        }

        public Criteria andIskanbanGreaterThanOrEqualTo(String value) {
            addCriterion("iskanban >=", value, "iskanban");
            return (Criteria) this;
        }

        public Criteria andIskanbanLessThan(String value) {
            addCriterion("iskanban <", value, "iskanban");
            return (Criteria) this;
        }

        public Criteria andIskanbanLessThanOrEqualTo(String value) {
            addCriterion("iskanban <=", value, "iskanban");
            return (Criteria) this;
        }

        public Criteria andIskanbanLike(String value) {
            addCriterion("iskanban like", value, "iskanban");
            return (Criteria) this;
        }

        public Criteria andIskanbanNotLike(String value) {
            addCriterion("iskanban not like", value, "iskanban");
            return (Criteria) this;
        }

        public Criteria andIskanbanIn(List<String> values) {
            addCriterion("iskanban in", values, "iskanban");
            return (Criteria) this;
        }

        public Criteria andIskanbanNotIn(List<String> values) {
            addCriterion("iskanban not in", values, "iskanban");
            return (Criteria) this;
        }

        public Criteria andIskanbanBetween(String value1, String value2) {
            addCriterion("iskanban between", value1, value2, "iskanban");
            return (Criteria) this;
        }

        public Criteria andIskanbanNotBetween(String value1, String value2) {
            addCriterion("iskanban not between", value1, value2, "iskanban");
            return (Criteria) this;
        }

        public Criteria andIsmanufacturedIsNull() {
            addCriterion("ismanufactured is null");
            return (Criteria) this;
        }

        public Criteria andIsmanufacturedIsNotNull() {
            addCriterion("ismanufactured is not null");
            return (Criteria) this;
        }

        public Criteria andIsmanufacturedEqualTo(String value) {
            addCriterion("ismanufactured =", value, "ismanufactured");
            return (Criteria) this;
        }

        public Criteria andIsmanufacturedNotEqualTo(String value) {
            addCriterion("ismanufactured <>", value, "ismanufactured");
            return (Criteria) this;
        }

        public Criteria andIsmanufacturedGreaterThan(String value) {
            addCriterion("ismanufactured >", value, "ismanufactured");
            return (Criteria) this;
        }

        public Criteria andIsmanufacturedGreaterThanOrEqualTo(String value) {
            addCriterion("ismanufactured >=", value, "ismanufactured");
            return (Criteria) this;
        }

        public Criteria andIsmanufacturedLessThan(String value) {
            addCriterion("ismanufactured <", value, "ismanufactured");
            return (Criteria) this;
        }

        public Criteria andIsmanufacturedLessThanOrEqualTo(String value) {
            addCriterion("ismanufactured <=", value, "ismanufactured");
            return (Criteria) this;
        }

        public Criteria andIsmanufacturedLike(String value) {
            addCriterion("ismanufactured like", value, "ismanufactured");
            return (Criteria) this;
        }

        public Criteria andIsmanufacturedNotLike(String value) {
            addCriterion("ismanufactured not like", value, "ismanufactured");
            return (Criteria) this;
        }

        public Criteria andIsmanufacturedIn(List<String> values) {
            addCriterion("ismanufactured in", values, "ismanufactured");
            return (Criteria) this;
        }

        public Criteria andIsmanufacturedNotIn(List<String> values) {
            addCriterion("ismanufactured not in", values, "ismanufactured");
            return (Criteria) this;
        }

        public Criteria andIsmanufacturedBetween(String value1, String value2) {
            addCriterion("ismanufactured between", value1, value2, "ismanufactured");
            return (Criteria) this;
        }

        public Criteria andIsmanufacturedNotBetween(String value1, String value2) {
            addCriterion("ismanufactured not between", value1, value2, "ismanufactured");
            return (Criteria) this;
        }

        public Criteria andMProductClassIdIsNull() {
            addCriterion("m_product_class_id is null");
            return (Criteria) this;
        }

        public Criteria andMProductClassIdIsNotNull() {
            addCriterion("m_product_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andMProductClassIdEqualTo(BigDecimal value) {
            addCriterion("m_product_class_id =", value, "mProductClassId");
            return (Criteria) this;
        }

        public Criteria andMProductClassIdNotEqualTo(BigDecimal value) {
            addCriterion("m_product_class_id <>", value, "mProductClassId");
            return (Criteria) this;
        }

        public Criteria andMProductClassIdGreaterThan(BigDecimal value) {
            addCriterion("m_product_class_id >", value, "mProductClassId");
            return (Criteria) this;
        }

        public Criteria andMProductClassIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m_product_class_id >=", value, "mProductClassId");
            return (Criteria) this;
        }

        public Criteria andMProductClassIdLessThan(BigDecimal value) {
            addCriterion("m_product_class_id <", value, "mProductClassId");
            return (Criteria) this;
        }

        public Criteria andMProductClassIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m_product_class_id <=", value, "mProductClassId");
            return (Criteria) this;
        }

        public Criteria andMProductClassIdIn(List<BigDecimal> values) {
            addCriterion("m_product_class_id in", values, "mProductClassId");
            return (Criteria) this;
        }

        public Criteria andMProductClassIdNotIn(List<BigDecimal> values) {
            addCriterion("m_product_class_id not in", values, "mProductClassId");
            return (Criteria) this;
        }

        public Criteria andMProductClassIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_product_class_id between", value1, value2, "mProductClassId");
            return (Criteria) this;
        }

        public Criteria andMProductClassIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_product_class_id not between", value1, value2, "mProductClassId");
            return (Criteria) this;
        }

        public Criteria andMProductGroupIdIsNull() {
            addCriterion("m_product_group_id is null");
            return (Criteria) this;
        }

        public Criteria andMProductGroupIdIsNotNull() {
            addCriterion("m_product_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andMProductGroupIdEqualTo(BigDecimal value) {
            addCriterion("m_product_group_id =", value, "mProductGroupId");
            return (Criteria) this;
        }

        public Criteria andMProductGroupIdNotEqualTo(BigDecimal value) {
            addCriterion("m_product_group_id <>", value, "mProductGroupId");
            return (Criteria) this;
        }

        public Criteria andMProductGroupIdGreaterThan(BigDecimal value) {
            addCriterion("m_product_group_id >", value, "mProductGroupId");
            return (Criteria) this;
        }

        public Criteria andMProductGroupIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m_product_group_id >=", value, "mProductGroupId");
            return (Criteria) this;
        }

        public Criteria andMProductGroupIdLessThan(BigDecimal value) {
            addCriterion("m_product_group_id <", value, "mProductGroupId");
            return (Criteria) this;
        }

        public Criteria andMProductGroupIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m_product_group_id <=", value, "mProductGroupId");
            return (Criteria) this;
        }

        public Criteria andMProductGroupIdIn(List<BigDecimal> values) {
            addCriterion("m_product_group_id in", values, "mProductGroupId");
            return (Criteria) this;
        }

        public Criteria andMProductGroupIdNotIn(List<BigDecimal> values) {
            addCriterion("m_product_group_id not in", values, "mProductGroupId");
            return (Criteria) this;
        }

        public Criteria andMProductGroupIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_product_group_id between", value1, value2, "mProductGroupId");
            return (Criteria) this;
        }

        public Criteria andMProductGroupIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_product_group_id not between", value1, value2, "mProductGroupId");
            return (Criteria) this;
        }

        public Criteria andMProductClassificationIdIsNull() {
            addCriterion("m_product_classification_id is null");
            return (Criteria) this;
        }

        public Criteria andMProductClassificationIdIsNotNull() {
            addCriterion("m_product_classification_id is not null");
            return (Criteria) this;
        }

        public Criteria andMProductClassificationIdEqualTo(BigDecimal value) {
            addCriterion("m_product_classification_id =", value, "mProductClassificationId");
            return (Criteria) this;
        }

        public Criteria andMProductClassificationIdNotEqualTo(BigDecimal value) {
            addCriterion("m_product_classification_id <>", value, "mProductClassificationId");
            return (Criteria) this;
        }

        public Criteria andMProductClassificationIdGreaterThan(BigDecimal value) {
            addCriterion("m_product_classification_id >", value, "mProductClassificationId");
            return (Criteria) this;
        }

        public Criteria andMProductClassificationIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("m_product_classification_id >=", value, "mProductClassificationId");
            return (Criteria) this;
        }

        public Criteria andMProductClassificationIdLessThan(BigDecimal value) {
            addCriterion("m_product_classification_id <", value, "mProductClassificationId");
            return (Criteria) this;
        }

        public Criteria andMProductClassificationIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("m_product_classification_id <=", value, "mProductClassificationId");
            return (Criteria) this;
        }

        public Criteria andMProductClassificationIdIn(List<BigDecimal> values) {
            addCriterion("m_product_classification_id in", values, "mProductClassificationId");
            return (Criteria) this;
        }

        public Criteria andMProductClassificationIdNotIn(List<BigDecimal> values) {
            addCriterion("m_product_classification_id not in", values, "mProductClassificationId");
            return (Criteria) this;
        }

        public Criteria andMProductClassificationIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_product_classification_id between", value1, value2, "mProductClassificationId");
            return (Criteria) this;
        }

        public Criteria andMProductClassificationIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("m_product_classification_id not between", value1, value2, "mProductClassificationId");
            return (Criteria) this;
        }

        public Criteria andIsphantomIsNull() {
            addCriterion("isphantom is null");
            return (Criteria) this;
        }

        public Criteria andIsphantomIsNotNull() {
            addCriterion("isphantom is not null");
            return (Criteria) this;
        }

        public Criteria andIsphantomEqualTo(String value) {
            addCriterion("isphantom =", value, "isphantom");
            return (Criteria) this;
        }

        public Criteria andIsphantomNotEqualTo(String value) {
            addCriterion("isphantom <>", value, "isphantom");
            return (Criteria) this;
        }

        public Criteria andIsphantomGreaterThan(String value) {
            addCriterion("isphantom >", value, "isphantom");
            return (Criteria) this;
        }

        public Criteria andIsphantomGreaterThanOrEqualTo(String value) {
            addCriterion("isphantom >=", value, "isphantom");
            return (Criteria) this;
        }

        public Criteria andIsphantomLessThan(String value) {
            addCriterion("isphantom <", value, "isphantom");
            return (Criteria) this;
        }

        public Criteria andIsphantomLessThanOrEqualTo(String value) {
            addCriterion("isphantom <=", value, "isphantom");
            return (Criteria) this;
        }

        public Criteria andIsphantomLike(String value) {
            addCriterion("isphantom like", value, "isphantom");
            return (Criteria) this;
        }

        public Criteria andIsphantomNotLike(String value) {
            addCriterion("isphantom not like", value, "isphantom");
            return (Criteria) this;
        }

        public Criteria andIsphantomIn(List<String> values) {
            addCriterion("isphantom in", values, "isphantom");
            return (Criteria) this;
        }

        public Criteria andIsphantomNotIn(List<String> values) {
            addCriterion("isphantom not in", values, "isphantom");
            return (Criteria) this;
        }

        public Criteria andIsphantomBetween(String value1, String value2) {
            addCriterion("isphantom between", value1, value2, "isphantom");
            return (Criteria) this;
        }

        public Criteria andIsphantomNotBetween(String value1, String value2) {
            addCriterion("isphantom not between", value1, value2, "isphantom");
            return (Criteria) this;
        }

        public Criteria andLockedFeeIsNull() {
            addCriterion("locked_fee is null");
            return (Criteria) this;
        }

        public Criteria andLockedFeeIsNotNull() {
            addCriterion("locked_fee is not null");
            return (Criteria) this;
        }

        public Criteria andLockedFeeEqualTo(BigDecimal value) {
            addCriterion("locked_fee =", value, "lockedFee");
            return (Criteria) this;
        }

        public Criteria andLockedFeeNotEqualTo(BigDecimal value) {
            addCriterion("locked_fee <>", value, "lockedFee");
            return (Criteria) this;
        }

        public Criteria andLockedFeeGreaterThan(BigDecimal value) {
            addCriterion("locked_fee >", value, "lockedFee");
            return (Criteria) this;
        }

        public Criteria andLockedFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("locked_fee >=", value, "lockedFee");
            return (Criteria) this;
        }

        public Criteria andLockedFeeLessThan(BigDecimal value) {
            addCriterion("locked_fee <", value, "lockedFee");
            return (Criteria) this;
        }

        public Criteria andLockedFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("locked_fee <=", value, "lockedFee");
            return (Criteria) this;
        }

        public Criteria andLockedFeeIn(List<BigDecimal> values) {
            addCriterion("locked_fee in", values, "lockedFee");
            return (Criteria) this;
        }

        public Criteria andLockedFeeNotIn(List<BigDecimal> values) {
            addCriterion("locked_fee not in", values, "lockedFee");
            return (Criteria) this;
        }

        public Criteria andLockedFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("locked_fee between", value1, value2, "lockedFee");
            return (Criteria) this;
        }

        public Criteria andLockedFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("locked_fee not between", value1, value2, "lockedFee");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andOceanFreightIsNull() {
            addCriterion("ocean_freight is null");
            return (Criteria) this;
        }

        public Criteria andOceanFreightIsNotNull() {
            addCriterion("ocean_freight is not null");
            return (Criteria) this;
        }

        public Criteria andOceanFreightEqualTo(BigDecimal value) {
            addCriterion("ocean_freight =", value, "oceanFreight");
            return (Criteria) this;
        }

        public Criteria andOceanFreightNotEqualTo(BigDecimal value) {
            addCriterion("ocean_freight <>", value, "oceanFreight");
            return (Criteria) this;
        }

        public Criteria andOceanFreightGreaterThan(BigDecimal value) {
            addCriterion("ocean_freight >", value, "oceanFreight");
            return (Criteria) this;
        }

        public Criteria andOceanFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ocean_freight >=", value, "oceanFreight");
            return (Criteria) this;
        }

        public Criteria andOceanFreightLessThan(BigDecimal value) {
            addCriterion("ocean_freight <", value, "oceanFreight");
            return (Criteria) this;
        }

        public Criteria andOceanFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ocean_freight <=", value, "oceanFreight");
            return (Criteria) this;
        }

        public Criteria andOceanFreightIn(List<BigDecimal> values) {
            addCriterion("ocean_freight in", values, "oceanFreight");
            return (Criteria) this;
        }

        public Criteria andOceanFreightNotIn(List<BigDecimal> values) {
            addCriterion("ocean_freight not in", values, "oceanFreight");
            return (Criteria) this;
        }

        public Criteria andOceanFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ocean_freight between", value1, value2, "oceanFreight");
            return (Criteria) this;
        }

        public Criteria andOceanFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ocean_freight not between", value1, value2, "oceanFreight");
            return (Criteria) this;
        }

        public Criteria andChargedWeightIsNull() {
            addCriterion("charged_weight is null");
            return (Criteria) this;
        }

        public Criteria andChargedWeightIsNotNull() {
            addCriterion("charged_weight is not null");
            return (Criteria) this;
        }

        public Criteria andChargedWeightEqualTo(BigDecimal value) {
            addCriterion("charged_weight =", value, "chargedWeight");
            return (Criteria) this;
        }

        public Criteria andChargedWeightNotEqualTo(BigDecimal value) {
            addCriterion("charged_weight <>", value, "chargedWeight");
            return (Criteria) this;
        }

        public Criteria andChargedWeightGreaterThan(BigDecimal value) {
            addCriterion("charged_weight >", value, "chargedWeight");
            return (Criteria) this;
        }

        public Criteria andChargedWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("charged_weight >=", value, "chargedWeight");
            return (Criteria) this;
        }

        public Criteria andChargedWeightLessThan(BigDecimal value) {
            addCriterion("charged_weight <", value, "chargedWeight");
            return (Criteria) this;
        }

        public Criteria andChargedWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("charged_weight <=", value, "chargedWeight");
            return (Criteria) this;
        }

        public Criteria andChargedWeightIn(List<BigDecimal> values) {
            addCriterion("charged_weight in", values, "chargedWeight");
            return (Criteria) this;
        }

        public Criteria andChargedWeightNotIn(List<BigDecimal> values) {
            addCriterion("charged_weight not in", values, "chargedWeight");
            return (Criteria) this;
        }

        public Criteria andChargedWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("charged_weight between", value1, value2, "chargedWeight");
            return (Criteria) this;
        }

        public Criteria andChargedWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("charged_weight not between", value1, value2, "chargedWeight");
            return (Criteria) this;
        }

        public Criteria andAirFreightIsNull() {
            addCriterion("air_freight is null");
            return (Criteria) this;
        }

        public Criteria andAirFreightIsNotNull() {
            addCriterion("air_freight is not null");
            return (Criteria) this;
        }

        public Criteria andAirFreightEqualTo(BigDecimal value) {
            addCriterion("air_freight =", value, "airFreight");
            return (Criteria) this;
        }

        public Criteria andAirFreightNotEqualTo(BigDecimal value) {
            addCriterion("air_freight <>", value, "airFreight");
            return (Criteria) this;
        }

        public Criteria andAirFreightGreaterThan(BigDecimal value) {
            addCriterion("air_freight >", value, "airFreight");
            return (Criteria) this;
        }

        public Criteria andAirFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("air_freight >=", value, "airFreight");
            return (Criteria) this;
        }

        public Criteria andAirFreightLessThan(BigDecimal value) {
            addCriterion("air_freight <", value, "airFreight");
            return (Criteria) this;
        }

        public Criteria andAirFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("air_freight <=", value, "airFreight");
            return (Criteria) this;
        }

        public Criteria andAirFreightIn(List<BigDecimal> values) {
            addCriterion("air_freight in", values, "airFreight");
            return (Criteria) this;
        }

        public Criteria andAirFreightNotIn(List<BigDecimal> values) {
            addCriterion("air_freight not in", values, "airFreight");
            return (Criteria) this;
        }

        public Criteria andAirFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("air_freight between", value1, value2, "airFreight");
            return (Criteria) this;
        }

        public Criteria andAirFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("air_freight not between", value1, value2, "airFreight");
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

        public Criteria andFnskuIsNull() {
            addCriterion("fnsku is null");
            return (Criteria) this;
        }

        public Criteria andFnskuIsNotNull() {
            addCriterion("fnsku is not null");
            return (Criteria) this;
        }

        public Criteria andFnskuEqualTo(String value) {
            addCriterion("fnsku =", value, "fnsku");
            return (Criteria) this;
        }

        public Criteria andFnskuNotEqualTo(String value) {
            addCriterion("fnsku <>", value, "fnsku");
            return (Criteria) this;
        }

        public Criteria andFnskuGreaterThan(String value) {
            addCriterion("fnsku >", value, "fnsku");
            return (Criteria) this;
        }

        public Criteria andFnskuGreaterThanOrEqualTo(String value) {
            addCriterion("fnsku >=", value, "fnsku");
            return (Criteria) this;
        }

        public Criteria andFnskuLessThan(String value) {
            addCriterion("fnsku <", value, "fnsku");
            return (Criteria) this;
        }

        public Criteria andFnskuLessThanOrEqualTo(String value) {
            addCriterion("fnsku <=", value, "fnsku");
            return (Criteria) this;
        }

        public Criteria andFnskuLike(String value) {
            addCriterion("fnsku like", value, "fnsku");
            return (Criteria) this;
        }

        public Criteria andFnskuNotLike(String value) {
            addCriterion("fnsku not like", value, "fnsku");
            return (Criteria) this;
        }

        public Criteria andFnskuIn(List<String> values) {
            addCriterion("fnsku in", values, "fnsku");
            return (Criteria) this;
        }

        public Criteria andFnskuNotIn(List<String> values) {
            addCriterion("fnsku not in", values, "fnsku");
            return (Criteria) this;
        }

        public Criteria andFnskuBetween(String value1, String value2) {
            addCriterion("fnsku between", value1, value2, "fnsku");
            return (Criteria) this;
        }

        public Criteria andFnskuNotBetween(String value1, String value2) {
            addCriterion("fnsku not between", value1, value2, "fnsku");
            return (Criteria) this;
        }

        public Criteria andEanIsNull() {
            addCriterion("ean is null");
            return (Criteria) this;
        }

        public Criteria andEanIsNotNull() {
            addCriterion("ean is not null");
            return (Criteria) this;
        }

        public Criteria andEanEqualTo(String value) {
            addCriterion("ean =", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanNotEqualTo(String value) {
            addCriterion("ean <>", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanGreaterThan(String value) {
            addCriterion("ean >", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanGreaterThanOrEqualTo(String value) {
            addCriterion("ean >=", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanLessThan(String value) {
            addCriterion("ean <", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanLessThanOrEqualTo(String value) {
            addCriterion("ean <=", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanLike(String value) {
            addCriterion("ean like", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanNotLike(String value) {
            addCriterion("ean not like", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanIn(List<String> values) {
            addCriterion("ean in", values, "ean");
            return (Criteria) this;
        }

        public Criteria andEanNotIn(List<String> values) {
            addCriterion("ean not in", values, "ean");
            return (Criteria) this;
        }

        public Criteria andEanBetween(String value1, String value2) {
            addCriterion("ean between", value1, value2, "ean");
            return (Criteria) this;
        }

        public Criteria andEanNotBetween(String value1, String value2) {
            addCriterion("ean not between", value1, value2, "ean");
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

        public Criteria andOboInnerskuIdIsNull() {
            addCriterion("obo_innersku_id is null");
            return (Criteria) this;
        }

        public Criteria andOboInnerskuIdIsNotNull() {
            addCriterion("obo_innersku_id is not null");
            return (Criteria) this;
        }

        public Criteria andOboInnerskuIdEqualTo(BigDecimal value) {
            addCriterion("obo_innersku_id =", value, "oboInnerskuId");
            return (Criteria) this;
        }

        public Criteria andOboInnerskuIdNotEqualTo(BigDecimal value) {
            addCriterion("obo_innersku_id <>", value, "oboInnerskuId");
            return (Criteria) this;
        }

        public Criteria andOboInnerskuIdGreaterThan(BigDecimal value) {
            addCriterion("obo_innersku_id >", value, "oboInnerskuId");
            return (Criteria) this;
        }

        public Criteria andOboInnerskuIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("obo_innersku_id >=", value, "oboInnerskuId");
            return (Criteria) this;
        }

        public Criteria andOboInnerskuIdLessThan(BigDecimal value) {
            addCriterion("obo_innersku_id <", value, "oboInnerskuId");
            return (Criteria) this;
        }

        public Criteria andOboInnerskuIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("obo_innersku_id <=", value, "oboInnerskuId");
            return (Criteria) this;
        }

        public Criteria andOboInnerskuIdIn(List<BigDecimal> values) {
            addCriterion("obo_innersku_id in", values, "oboInnerskuId");
            return (Criteria) this;
        }

        public Criteria andOboInnerskuIdNotIn(List<BigDecimal> values) {
            addCriterion("obo_innersku_id not in", values, "oboInnerskuId");
            return (Criteria) this;
        }

        public Criteria andOboInnerskuIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("obo_innersku_id between", value1, value2, "oboInnerskuId");
            return (Criteria) this;
        }

        public Criteria andOboInnerskuIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("obo_innersku_id not between", value1, value2, "oboInnerskuId");
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

        public Criteria andPacketwidthIsNull() {
            addCriterion("packetwidth is null");
            return (Criteria) this;
        }

        public Criteria andPacketwidthIsNotNull() {
            addCriterion("packetwidth is not null");
            return (Criteria) this;
        }

        public Criteria andPacketwidthEqualTo(BigDecimal value) {
            addCriterion("packetwidth =", value, "packetwidth");
            return (Criteria) this;
        }

        public Criteria andPacketwidthNotEqualTo(BigDecimal value) {
            addCriterion("packetwidth <>", value, "packetwidth");
            return (Criteria) this;
        }

        public Criteria andPacketwidthGreaterThan(BigDecimal value) {
            addCriterion("packetwidth >", value, "packetwidth");
            return (Criteria) this;
        }

        public Criteria andPacketwidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("packetwidth >=", value, "packetwidth");
            return (Criteria) this;
        }

        public Criteria andPacketwidthLessThan(BigDecimal value) {
            addCriterion("packetwidth <", value, "packetwidth");
            return (Criteria) this;
        }

        public Criteria andPacketwidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("packetwidth <=", value, "packetwidth");
            return (Criteria) this;
        }

        public Criteria andPacketwidthIn(List<BigDecimal> values) {
            addCriterion("packetwidth in", values, "packetwidth");
            return (Criteria) this;
        }

        public Criteria andPacketwidthNotIn(List<BigDecimal> values) {
            addCriterion("packetwidth not in", values, "packetwidth");
            return (Criteria) this;
        }

        public Criteria andPacketwidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("packetwidth between", value1, value2, "packetwidth");
            return (Criteria) this;
        }

        public Criteria andPacketwidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("packetwidth not between", value1, value2, "packetwidth");
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

        public Criteria andPacketlengthIsNull() {
            addCriterion("packetlength is null");
            return (Criteria) this;
        }

        public Criteria andPacketlengthIsNotNull() {
            addCriterion("packetlength is not null");
            return (Criteria) this;
        }

        public Criteria andPacketlengthEqualTo(BigDecimal value) {
            addCriterion("packetlength =", value, "packetlength");
            return (Criteria) this;
        }

        public Criteria andPacketlengthNotEqualTo(BigDecimal value) {
            addCriterion("packetlength <>", value, "packetlength");
            return (Criteria) this;
        }

        public Criteria andPacketlengthGreaterThan(BigDecimal value) {
            addCriterion("packetlength >", value, "packetlength");
            return (Criteria) this;
        }

        public Criteria andPacketlengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("packetlength >=", value, "packetlength");
            return (Criteria) this;
        }

        public Criteria andPacketlengthLessThan(BigDecimal value) {
            addCriterion("packetlength <", value, "packetlength");
            return (Criteria) this;
        }

        public Criteria andPacketlengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("packetlength <=", value, "packetlength");
            return (Criteria) this;
        }

        public Criteria andPacketlengthIn(List<BigDecimal> values) {
            addCriterion("packetlength in", values, "packetlength");
            return (Criteria) this;
        }

        public Criteria andPacketlengthNotIn(List<BigDecimal> values) {
            addCriterion("packetlength not in", values, "packetlength");
            return (Criteria) this;
        }

        public Criteria andPacketlengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("packetlength between", value1, value2, "packetlength");
            return (Criteria) this;
        }

        public Criteria andPacketlengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("packetlength not between", value1, value2, "packetlength");
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

        public Criteria andPacketheightIsNull() {
            addCriterion("packetheight is null");
            return (Criteria) this;
        }

        public Criteria andPacketheightIsNotNull() {
            addCriterion("packetheight is not null");
            return (Criteria) this;
        }

        public Criteria andPacketheightEqualTo(BigDecimal value) {
            addCriterion("packetheight =", value, "packetheight");
            return (Criteria) this;
        }

        public Criteria andPacketheightNotEqualTo(BigDecimal value) {
            addCriterion("packetheight <>", value, "packetheight");
            return (Criteria) this;
        }

        public Criteria andPacketheightGreaterThan(BigDecimal value) {
            addCriterion("packetheight >", value, "packetheight");
            return (Criteria) this;
        }

        public Criteria andPacketheightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("packetheight >=", value, "packetheight");
            return (Criteria) this;
        }

        public Criteria andPacketheightLessThan(BigDecimal value) {
            addCriterion("packetheight <", value, "packetheight");
            return (Criteria) this;
        }

        public Criteria andPacketheightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("packetheight <=", value, "packetheight");
            return (Criteria) this;
        }

        public Criteria andPacketheightIn(List<BigDecimal> values) {
            addCriterion("packetheight in", values, "packetheight");
            return (Criteria) this;
        }

        public Criteria andPacketheightNotIn(List<BigDecimal> values) {
            addCriterion("packetheight not in", values, "packetheight");
            return (Criteria) this;
        }

        public Criteria andPacketheightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("packetheight between", value1, value2, "packetheight");
            return (Criteria) this;
        }

        public Criteria andPacketheightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("packetheight not between", value1, value2, "packetheight");
            return (Criteria) this;
        }

        public Criteria andOboProductCategory1IdIsNull() {
            addCriterion("obo_product_category1_id is null");
            return (Criteria) this;
        }

        public Criteria andOboProductCategory1IdIsNotNull() {
            addCriterion("obo_product_category1_id is not null");
            return (Criteria) this;
        }

        public Criteria andOboProductCategory1IdEqualTo(BigDecimal value) {
            addCriterion("obo_product_category1_id =", value, "oboProductCategory1Id");
            return (Criteria) this;
        }

        public Criteria andOboProductCategory1IdNotEqualTo(BigDecimal value) {
            addCriterion("obo_product_category1_id <>", value, "oboProductCategory1Id");
            return (Criteria) this;
        }

        public Criteria andOboProductCategory1IdGreaterThan(BigDecimal value) {
            addCriterion("obo_product_category1_id >", value, "oboProductCategory1Id");
            return (Criteria) this;
        }

        public Criteria andOboProductCategory1IdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("obo_product_category1_id >=", value, "oboProductCategory1Id");
            return (Criteria) this;
        }

        public Criteria andOboProductCategory1IdLessThan(BigDecimal value) {
            addCriterion("obo_product_category1_id <", value, "oboProductCategory1Id");
            return (Criteria) this;
        }

        public Criteria andOboProductCategory1IdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("obo_product_category1_id <=", value, "oboProductCategory1Id");
            return (Criteria) this;
        }

        public Criteria andOboProductCategory1IdIn(List<BigDecimal> values) {
            addCriterion("obo_product_category1_id in", values, "oboProductCategory1Id");
            return (Criteria) this;
        }

        public Criteria andOboProductCategory1IdNotIn(List<BigDecimal> values) {
            addCriterion("obo_product_category1_id not in", values, "oboProductCategory1Id");
            return (Criteria) this;
        }

        public Criteria andOboProductCategory1IdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("obo_product_category1_id between", value1, value2, "oboProductCategory1Id");
            return (Criteria) this;
        }

        public Criteria andOboProductCategory1IdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("obo_product_category1_id not between", value1, value2, "oboProductCategory1Id");
            return (Criteria) this;
        }

        public Criteria andMoqIsNull() {
            addCriterion("moq is null");
            return (Criteria) this;
        }

        public Criteria andMoqIsNotNull() {
            addCriterion("moq is not null");
            return (Criteria) this;
        }

        public Criteria andMoqEqualTo(BigDecimal value) {
            addCriterion("moq =", value, "moq");
            return (Criteria) this;
        }

        public Criteria andMoqNotEqualTo(BigDecimal value) {
            addCriterion("moq <>", value, "moq");
            return (Criteria) this;
        }

        public Criteria andMoqGreaterThan(BigDecimal value) {
            addCriterion("moq >", value, "moq");
            return (Criteria) this;
        }

        public Criteria andMoqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("moq >=", value, "moq");
            return (Criteria) this;
        }

        public Criteria andMoqLessThan(BigDecimal value) {
            addCriterion("moq <", value, "moq");
            return (Criteria) this;
        }

        public Criteria andMoqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("moq <=", value, "moq");
            return (Criteria) this;
        }

        public Criteria andMoqIn(List<BigDecimal> values) {
            addCriterion("moq in", values, "moq");
            return (Criteria) this;
        }

        public Criteria andMoqNotIn(List<BigDecimal> values) {
            addCriterion("moq not in", values, "moq");
            return (Criteria) this;
        }

        public Criteria andMoqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("moq between", value1, value2, "moq");
            return (Criteria) this;
        }

        public Criteria andMoqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("moq not between", value1, value2, "moq");
            return (Criteria) this;
        }

        public Criteria andIsglobalIsNull() {
            addCriterion("isglobal is null");
            return (Criteria) this;
        }

        public Criteria andIsglobalIsNotNull() {
            addCriterion("isglobal is not null");
            return (Criteria) this;
        }

        public Criteria andIsglobalEqualTo(String value) {
            addCriterion("isglobal =", value, "isglobal");
            return (Criteria) this;
        }

        public Criteria andIsglobalNotEqualTo(String value) {
            addCriterion("isglobal <>", value, "isglobal");
            return (Criteria) this;
        }

        public Criteria andIsglobalGreaterThan(String value) {
            addCriterion("isglobal >", value, "isglobal");
            return (Criteria) this;
        }

        public Criteria andIsglobalGreaterThanOrEqualTo(String value) {
            addCriterion("isglobal >=", value, "isglobal");
            return (Criteria) this;
        }

        public Criteria andIsglobalLessThan(String value) {
            addCriterion("isglobal <", value, "isglobal");
            return (Criteria) this;
        }

        public Criteria andIsglobalLessThanOrEqualTo(String value) {
            addCriterion("isglobal <=", value, "isglobal");
            return (Criteria) this;
        }

        public Criteria andIsglobalLike(String value) {
            addCriterion("isglobal like", value, "isglobal");
            return (Criteria) this;
        }

        public Criteria andIsglobalNotLike(String value) {
            addCriterion("isglobal not like", value, "isglobal");
            return (Criteria) this;
        }

        public Criteria andIsglobalIn(List<String> values) {
            addCriterion("isglobal in", values, "isglobal");
            return (Criteria) this;
        }

        public Criteria andIsglobalNotIn(List<String> values) {
            addCriterion("isglobal not in", values, "isglobal");
            return (Criteria) this;
        }

        public Criteria andIsglobalBetween(String value1, String value2) {
            addCriterion("isglobal between", value1, value2, "isglobal");
            return (Criteria) this;
        }

        public Criteria andIsglobalNotBetween(String value1, String value2) {
            addCriterion("isglobal not between", value1, value2, "isglobal");
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

        public Criteria andBoxweightIsNull() {
            addCriterion("boxweight is null");
            return (Criteria) this;
        }

        public Criteria andBoxweightIsNotNull() {
            addCriterion("boxweight is not null");
            return (Criteria) this;
        }

        public Criteria andBoxweightEqualTo(BigDecimal value) {
            addCriterion("boxweight =", value, "boxweight");
            return (Criteria) this;
        }

        public Criteria andBoxweightNotEqualTo(BigDecimal value) {
            addCriterion("boxweight <>", value, "boxweight");
            return (Criteria) this;
        }

        public Criteria andBoxweightGreaterThan(BigDecimal value) {
            addCriterion("boxweight >", value, "boxweight");
            return (Criteria) this;
        }

        public Criteria andBoxweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("boxweight >=", value, "boxweight");
            return (Criteria) this;
        }

        public Criteria andBoxweightLessThan(BigDecimal value) {
            addCriterion("boxweight <", value, "boxweight");
            return (Criteria) this;
        }

        public Criteria andBoxweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("boxweight <=", value, "boxweight");
            return (Criteria) this;
        }

        public Criteria andBoxweightIn(List<BigDecimal> values) {
            addCriterion("boxweight in", values, "boxweight");
            return (Criteria) this;
        }

        public Criteria andBoxweightNotIn(List<BigDecimal> values) {
            addCriterion("boxweight not in", values, "boxweight");
            return (Criteria) this;
        }

        public Criteria andBoxweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("boxweight between", value1, value2, "boxweight");
            return (Criteria) this;
        }

        public Criteria andBoxweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("boxweight not between", value1, value2, "boxweight");
            return (Criteria) this;
        }

        public Criteria andPacketvolumeIsNull() {
            addCriterion("packetvolume is null");
            return (Criteria) this;
        }

        public Criteria andPacketvolumeIsNotNull() {
            addCriterion("packetvolume is not null");
            return (Criteria) this;
        }

        public Criteria andPacketvolumeEqualTo(BigDecimal value) {
            addCriterion("packetvolume =", value, "packetvolume");
            return (Criteria) this;
        }

        public Criteria andPacketvolumeNotEqualTo(BigDecimal value) {
            addCriterion("packetvolume <>", value, "packetvolume");
            return (Criteria) this;
        }

        public Criteria andPacketvolumeGreaterThan(BigDecimal value) {
            addCriterion("packetvolume >", value, "packetvolume");
            return (Criteria) this;
        }

        public Criteria andPacketvolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("packetvolume >=", value, "packetvolume");
            return (Criteria) this;
        }

        public Criteria andPacketvolumeLessThan(BigDecimal value) {
            addCriterion("packetvolume <", value, "packetvolume");
            return (Criteria) this;
        }

        public Criteria andPacketvolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("packetvolume <=", value, "packetvolume");
            return (Criteria) this;
        }

        public Criteria andPacketvolumeIn(List<BigDecimal> values) {
            addCriterion("packetvolume in", values, "packetvolume");
            return (Criteria) this;
        }

        public Criteria andPacketvolumeNotIn(List<BigDecimal> values) {
            addCriterion("packetvolume not in", values, "packetvolume");
            return (Criteria) this;
        }

        public Criteria andPacketvolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("packetvolume between", value1, value2, "packetvolume");
            return (Criteria) this;
        }

        public Criteria andPacketvolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("packetvolume not between", value1, value2, "packetvolume");
            return (Criteria) this;
        }

        public Criteria andPacketweightIsNull() {
            addCriterion("packetweight is null");
            return (Criteria) this;
        }

        public Criteria andPacketweightIsNotNull() {
            addCriterion("packetweight is not null");
            return (Criteria) this;
        }

        public Criteria andPacketweightEqualTo(BigDecimal value) {
            addCriterion("packetweight =", value, "packetweight");
            return (Criteria) this;
        }

        public Criteria andPacketweightNotEqualTo(BigDecimal value) {
            addCriterion("packetweight <>", value, "packetweight");
            return (Criteria) this;
        }

        public Criteria andPacketweightGreaterThan(BigDecimal value) {
            addCriterion("packetweight >", value, "packetweight");
            return (Criteria) this;
        }

        public Criteria andPacketweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("packetweight >=", value, "packetweight");
            return (Criteria) this;
        }

        public Criteria andPacketweightLessThan(BigDecimal value) {
            addCriterion("packetweight <", value, "packetweight");
            return (Criteria) this;
        }

        public Criteria andPacketweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("packetweight <=", value, "packetweight");
            return (Criteria) this;
        }

        public Criteria andPacketweightIn(List<BigDecimal> values) {
            addCriterion("packetweight in", values, "packetweight");
            return (Criteria) this;
        }

        public Criteria andPacketweightNotIn(List<BigDecimal> values) {
            addCriterion("packetweight not in", values, "packetweight");
            return (Criteria) this;
        }

        public Criteria andPacketweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("packetweight between", value1, value2, "packetweight");
            return (Criteria) this;
        }

        public Criteria andPacketweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("packetweight not between", value1, value2, "packetweight");
            return (Criteria) this;
        }

        public Criteria andIs1byonebrandIsNull() {
            addCriterion("is1byonebrand is null");
            return (Criteria) this;
        }

        public Criteria andIs1byonebrandIsNotNull() {
            addCriterion("is1byonebrand is not null");
            return (Criteria) this;
        }

        public Criteria andIs1byonebrandEqualTo(String value) {
            addCriterion("is1byonebrand =", value, "is1byonebrand");
            return (Criteria) this;
        }

        public Criteria andIs1byonebrandNotEqualTo(String value) {
            addCriterion("is1byonebrand <>", value, "is1byonebrand");
            return (Criteria) this;
        }

        public Criteria andIs1byonebrandGreaterThan(String value) {
            addCriterion("is1byonebrand >", value, "is1byonebrand");
            return (Criteria) this;
        }

        public Criteria andIs1byonebrandGreaterThanOrEqualTo(String value) {
            addCriterion("is1byonebrand >=", value, "is1byonebrand");
            return (Criteria) this;
        }

        public Criteria andIs1byonebrandLessThan(String value) {
            addCriterion("is1byonebrand <", value, "is1byonebrand");
            return (Criteria) this;
        }

        public Criteria andIs1byonebrandLessThanOrEqualTo(String value) {
            addCriterion("is1byonebrand <=", value, "is1byonebrand");
            return (Criteria) this;
        }

        public Criteria andIs1byonebrandLike(String value) {
            addCriterion("is1byonebrand like", value, "is1byonebrand");
            return (Criteria) this;
        }

        public Criteria andIs1byonebrandNotLike(String value) {
            addCriterion("is1byonebrand not like", value, "is1byonebrand");
            return (Criteria) this;
        }

        public Criteria andIs1byonebrandIn(List<String> values) {
            addCriterion("is1byonebrand in", values, "is1byonebrand");
            return (Criteria) this;
        }

        public Criteria andIs1byonebrandNotIn(List<String> values) {
            addCriterion("is1byonebrand not in", values, "is1byonebrand");
            return (Criteria) this;
        }

        public Criteria andIs1byonebrandBetween(String value1, String value2) {
            addCriterion("is1byonebrand between", value1, value2, "is1byonebrand");
            return (Criteria) this;
        }

        public Criteria andIs1byonebrandNotBetween(String value1, String value2) {
            addCriterion("is1byonebrand not between", value1, value2, "is1byonebrand");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeIsNull() {
            addCriterion("customs_code is null");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeIsNotNull() {
            addCriterion("customs_code is not null");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeEqualTo(String value) {
            addCriterion("customs_code =", value, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeNotEqualTo(String value) {
            addCriterion("customs_code <>", value, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeGreaterThan(String value) {
            addCriterion("customs_code >", value, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("customs_code >=", value, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeLessThan(String value) {
            addCriterion("customs_code <", value, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeLessThanOrEqualTo(String value) {
            addCriterion("customs_code <=", value, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeLike(String value) {
            addCriterion("customs_code like", value, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeNotLike(String value) {
            addCriterion("customs_code not like", value, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeIn(List<String> values) {
            addCriterion("customs_code in", values, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeNotIn(List<String> values) {
            addCriterion("customs_code not in", values, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeBetween(String value1, String value2) {
            addCriterion("customs_code between", value1, value2, "customsCode");
            return (Criteria) this;
        }

        public Criteria andCustomsCodeNotBetween(String value1, String value2) {
            addCriterion("customs_code not between", value1, value2, "customsCode");
            return (Criteria) this;
        }

        public Criteria andMaterialQualityIsNull() {
            addCriterion("material_quality is null");
            return (Criteria) this;
        }

        public Criteria andMaterialQualityIsNotNull() {
            addCriterion("material_quality is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialQualityEqualTo(String value) {
            addCriterion("material_quality =", value, "materialQuality");
            return (Criteria) this;
        }

        public Criteria andMaterialQualityNotEqualTo(String value) {
            addCriterion("material_quality <>", value, "materialQuality");
            return (Criteria) this;
        }

        public Criteria andMaterialQualityGreaterThan(String value) {
            addCriterion("material_quality >", value, "materialQuality");
            return (Criteria) this;
        }

        public Criteria andMaterialQualityGreaterThanOrEqualTo(String value) {
            addCriterion("material_quality >=", value, "materialQuality");
            return (Criteria) this;
        }

        public Criteria andMaterialQualityLessThan(String value) {
            addCriterion("material_quality <", value, "materialQuality");
            return (Criteria) this;
        }

        public Criteria andMaterialQualityLessThanOrEqualTo(String value) {
            addCriterion("material_quality <=", value, "materialQuality");
            return (Criteria) this;
        }

        public Criteria andMaterialQualityLike(String value) {
            addCriterion("material_quality like", value, "materialQuality");
            return (Criteria) this;
        }

        public Criteria andMaterialQualityNotLike(String value) {
            addCriterion("material_quality not like", value, "materialQuality");
            return (Criteria) this;
        }

        public Criteria andMaterialQualityIn(List<String> values) {
            addCriterion("material_quality in", values, "materialQuality");
            return (Criteria) this;
        }

        public Criteria andMaterialQualityNotIn(List<String> values) {
            addCriterion("material_quality not in", values, "materialQuality");
            return (Criteria) this;
        }

        public Criteria andMaterialQualityBetween(String value1, String value2) {
            addCriterion("material_quality between", value1, value2, "materialQuality");
            return (Criteria) this;
        }

        public Criteria andMaterialQualityNotBetween(String value1, String value2) {
            addCriterion("material_quality not between", value1, value2, "materialQuality");
            return (Criteria) this;
        }

        public Criteria andUsesIsNull() {
            addCriterion("uses is null");
            return (Criteria) this;
        }

        public Criteria andUsesIsNotNull() {
            addCriterion("uses is not null");
            return (Criteria) this;
        }

        public Criteria andUsesEqualTo(String value) {
            addCriterion("uses =", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesNotEqualTo(String value) {
            addCriterion("uses <>", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesGreaterThan(String value) {
            addCriterion("uses >", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesGreaterThanOrEqualTo(String value) {
            addCriterion("uses >=", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesLessThan(String value) {
            addCriterion("uses <", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesLessThanOrEqualTo(String value) {
            addCriterion("uses <=", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesLike(String value) {
            addCriterion("uses like", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesNotLike(String value) {
            addCriterion("uses not like", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesIn(List<String> values) {
            addCriterion("uses in", values, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesNotIn(List<String> values) {
            addCriterion("uses not in", values, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesBetween(String value1, String value2) {
            addCriterion("uses between", value1, value2, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesNotBetween(String value1, String value2) {
            addCriterion("uses not between", value1, value2, "uses");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("power is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(String value) {
            addCriterion("power =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(String value) {
            addCriterion("power <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(String value) {
            addCriterion("power >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(String value) {
            addCriterion("power >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(String value) {
            addCriterion("power <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(String value) {
            addCriterion("power <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLike(String value) {
            addCriterion("power like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotLike(String value) {
            addCriterion("power not like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<String> values) {
            addCriterion("power in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<String> values) {
            addCriterion("power not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(String value1, String value2) {
            addCriterion("power between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(String value1, String value2) {
            addCriterion("power not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andBatteryCapacityIsNull() {
            addCriterion("battery_capacity is null");
            return (Criteria) this;
        }

        public Criteria andBatteryCapacityIsNotNull() {
            addCriterion("battery_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andBatteryCapacityEqualTo(String value) {
            addCriterion("battery_capacity =", value, "batteryCapacity");
            return (Criteria) this;
        }

        public Criteria andBatteryCapacityNotEqualTo(String value) {
            addCriterion("battery_capacity <>", value, "batteryCapacity");
            return (Criteria) this;
        }

        public Criteria andBatteryCapacityGreaterThan(String value) {
            addCriterion("battery_capacity >", value, "batteryCapacity");
            return (Criteria) this;
        }

        public Criteria andBatteryCapacityGreaterThanOrEqualTo(String value) {
            addCriterion("battery_capacity >=", value, "batteryCapacity");
            return (Criteria) this;
        }

        public Criteria andBatteryCapacityLessThan(String value) {
            addCriterion("battery_capacity <", value, "batteryCapacity");
            return (Criteria) this;
        }

        public Criteria andBatteryCapacityLessThanOrEqualTo(String value) {
            addCriterion("battery_capacity <=", value, "batteryCapacity");
            return (Criteria) this;
        }

        public Criteria andBatteryCapacityLike(String value) {
            addCriterion("battery_capacity like", value, "batteryCapacity");
            return (Criteria) this;
        }

        public Criteria andBatteryCapacityNotLike(String value) {
            addCriterion("battery_capacity not like", value, "batteryCapacity");
            return (Criteria) this;
        }

        public Criteria andBatteryCapacityIn(List<String> values) {
            addCriterion("battery_capacity in", values, "batteryCapacity");
            return (Criteria) this;
        }

        public Criteria andBatteryCapacityNotIn(List<String> values) {
            addCriterion("battery_capacity not in", values, "batteryCapacity");
            return (Criteria) this;
        }

        public Criteria andBatteryCapacityBetween(String value1, String value2) {
            addCriterion("battery_capacity between", value1, value2, "batteryCapacity");
            return (Criteria) this;
        }

        public Criteria andBatteryCapacityNotBetween(String value1, String value2) {
            addCriterion("battery_capacity not between", value1, value2, "batteryCapacity");
            return (Criteria) this;
        }

        public Criteria andVoltageIsNull() {
            addCriterion("voltage is null");
            return (Criteria) this;
        }

        public Criteria andVoltageIsNotNull() {
            addCriterion("voltage is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageEqualTo(String value) {
            addCriterion("voltage =", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotEqualTo(String value) {
            addCriterion("voltage <>", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageGreaterThan(String value) {
            addCriterion("voltage >", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageGreaterThanOrEqualTo(String value) {
            addCriterion("voltage >=", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLessThan(String value) {
            addCriterion("voltage <", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLessThanOrEqualTo(String value) {
            addCriterion("voltage <=", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLike(String value) {
            addCriterion("voltage like", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotLike(String value) {
            addCriterion("voltage not like", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageIn(List<String> values) {
            addCriterion("voltage in", values, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotIn(List<String> values) {
            addCriterion("voltage not in", values, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageBetween(String value1, String value2) {
            addCriterion("voltage between", value1, value2, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotBetween(String value1, String value2) {
            addCriterion("voltage not between", value1, value2, "voltage");
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

        public Criteria andVolumeWeightIsNull() {
            addCriterion("volume_weight is null");
            return (Criteria) this;
        }

        public Criteria andVolumeWeightIsNotNull() {
            addCriterion("volume_weight is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeWeightEqualTo(BigDecimal value) {
            addCriterion("volume_weight =", value, "volumeWeight");
            return (Criteria) this;
        }

        public Criteria andVolumeWeightNotEqualTo(BigDecimal value) {
            addCriterion("volume_weight <>", value, "volumeWeight");
            return (Criteria) this;
        }

        public Criteria andVolumeWeightGreaterThan(BigDecimal value) {
            addCriterion("volume_weight >", value, "volumeWeight");
            return (Criteria) this;
        }

        public Criteria andVolumeWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("volume_weight >=", value, "volumeWeight");
            return (Criteria) this;
        }

        public Criteria andVolumeWeightLessThan(BigDecimal value) {
            addCriterion("volume_weight <", value, "volumeWeight");
            return (Criteria) this;
        }

        public Criteria andVolumeWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("volume_weight <=", value, "volumeWeight");
            return (Criteria) this;
        }

        public Criteria andVolumeWeightIn(List<BigDecimal> values) {
            addCriterion("volume_weight in", values, "volumeWeight");
            return (Criteria) this;
        }

        public Criteria andVolumeWeightNotIn(List<BigDecimal> values) {
            addCriterion("volume_weight not in", values, "volumeWeight");
            return (Criteria) this;
        }

        public Criteria andVolumeWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("volume_weight between", value1, value2, "volumeWeight");
            return (Criteria) this;
        }

        public Criteria andVolumeWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("volume_weight not between", value1, value2, "volumeWeight");
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

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(BigDecimal value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(BigDecimal value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(BigDecimal value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(BigDecimal value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<BigDecimal> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<BigDecimal> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(BigDecimal value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(BigDecimal value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(BigDecimal value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(BigDecimal value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<BigDecimal> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<BigDecimal> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(BigDecimal value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(BigDecimal value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(BigDecimal value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(BigDecimal value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<BigDecimal> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<BigDecimal> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andCustomsCategoryIsNull() {
            addCriterion("customs_category is null");
            return (Criteria) this;
        }

        public Criteria andCustomsCategoryIsNotNull() {
            addCriterion("customs_category is not null");
            return (Criteria) this;
        }

        public Criteria andCustomsCategoryEqualTo(String value) {
            addCriterion("customs_category =", value, "customsCategory");
            return (Criteria) this;
        }

        public Criteria andCustomsCategoryNotEqualTo(String value) {
            addCriterion("customs_category <>", value, "customsCategory");
            return (Criteria) this;
        }

        public Criteria andCustomsCategoryGreaterThan(String value) {
            addCriterion("customs_category >", value, "customsCategory");
            return (Criteria) this;
        }

        public Criteria andCustomsCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("customs_category >=", value, "customsCategory");
            return (Criteria) this;
        }

        public Criteria andCustomsCategoryLessThan(String value) {
            addCriterion("customs_category <", value, "customsCategory");
            return (Criteria) this;
        }

        public Criteria andCustomsCategoryLessThanOrEqualTo(String value) {
            addCriterion("customs_category <=", value, "customsCategory");
            return (Criteria) this;
        }

        public Criteria andCustomsCategoryLike(String value) {
            addCriterion("customs_category like", value, "customsCategory");
            return (Criteria) this;
        }

        public Criteria andCustomsCategoryNotLike(String value) {
            addCriterion("customs_category not like", value, "customsCategory");
            return (Criteria) this;
        }

        public Criteria andCustomsCategoryIn(List<String> values) {
            addCriterion("customs_category in", values, "customsCategory");
            return (Criteria) this;
        }

        public Criteria andCustomsCategoryNotIn(List<String> values) {
            addCriterion("customs_category not in", values, "customsCategory");
            return (Criteria) this;
        }

        public Criteria andCustomsCategoryBetween(String value1, String value2) {
            addCriterion("customs_category between", value1, value2, "customsCategory");
            return (Criteria) this;
        }

        public Criteria andCustomsCategoryNotBetween(String value1, String value2) {
            addCriterion("customs_category not between", value1, value2, "customsCategory");
            return (Criteria) this;
        }

        public Criteria andHolidayOrderedCycleIsNull() {
            addCriterion("holiday_ordered_cycle is null");
            return (Criteria) this;
        }

        public Criteria andHolidayOrderedCycleIsNotNull() {
            addCriterion("holiday_ordered_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andHolidayOrderedCycleEqualTo(BigDecimal value) {
            addCriterion("holiday_ordered_cycle =", value, "holidayOrderedCycle");
            return (Criteria) this;
        }

        public Criteria andHolidayOrderedCycleNotEqualTo(BigDecimal value) {
            addCriterion("holiday_ordered_cycle <>", value, "holidayOrderedCycle");
            return (Criteria) this;
        }

        public Criteria andHolidayOrderedCycleGreaterThan(BigDecimal value) {
            addCriterion("holiday_ordered_cycle >", value, "holidayOrderedCycle");
            return (Criteria) this;
        }

        public Criteria andHolidayOrderedCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("holiday_ordered_cycle >=", value, "holidayOrderedCycle");
            return (Criteria) this;
        }

        public Criteria andHolidayOrderedCycleLessThan(BigDecimal value) {
            addCriterion("holiday_ordered_cycle <", value, "holidayOrderedCycle");
            return (Criteria) this;
        }

        public Criteria andHolidayOrderedCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("holiday_ordered_cycle <=", value, "holidayOrderedCycle");
            return (Criteria) this;
        }

        public Criteria andHolidayOrderedCycleIn(List<BigDecimal> values) {
            addCriterion("holiday_ordered_cycle in", values, "holidayOrderedCycle");
            return (Criteria) this;
        }

        public Criteria andHolidayOrderedCycleNotIn(List<BigDecimal> values) {
            addCriterion("holiday_ordered_cycle not in", values, "holidayOrderedCycle");
            return (Criteria) this;
        }

        public Criteria andHolidayOrderedCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("holiday_ordered_cycle between", value1, value2, "holidayOrderedCycle");
            return (Criteria) this;
        }

        public Criteria andHolidayOrderedCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("holiday_ordered_cycle not between", value1, value2, "holidayOrderedCycle");
            return (Criteria) this;
        }

        public Criteria andOrderedCycleIsNull() {
            addCriterion("ordered_cycle is null");
            return (Criteria) this;
        }

        public Criteria andOrderedCycleIsNotNull() {
            addCriterion("ordered_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andOrderedCycleEqualTo(BigDecimal value) {
            addCriterion("ordered_cycle =", value, "orderedCycle");
            return (Criteria) this;
        }

        public Criteria andOrderedCycleNotEqualTo(BigDecimal value) {
            addCriterion("ordered_cycle <>", value, "orderedCycle");
            return (Criteria) this;
        }

        public Criteria andOrderedCycleGreaterThan(BigDecimal value) {
            addCriterion("ordered_cycle >", value, "orderedCycle");
            return (Criteria) this;
        }

        public Criteria andOrderedCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ordered_cycle >=", value, "orderedCycle");
            return (Criteria) this;
        }

        public Criteria andOrderedCycleLessThan(BigDecimal value) {
            addCriterion("ordered_cycle <", value, "orderedCycle");
            return (Criteria) this;
        }

        public Criteria andOrderedCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ordered_cycle <=", value, "orderedCycle");
            return (Criteria) this;
        }

        public Criteria andOrderedCycleIn(List<BigDecimal> values) {
            addCriterion("ordered_cycle in", values, "orderedCycle");
            return (Criteria) this;
        }

        public Criteria andOrderedCycleNotIn(List<BigDecimal> values) {
            addCriterion("ordered_cycle not in", values, "orderedCycle");
            return (Criteria) this;
        }

        public Criteria andOrderedCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ordered_cycle between", value1, value2, "orderedCycle");
            return (Criteria) this;
        }

        public Criteria andOrderedCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ordered_cycle not between", value1, value2, "orderedCycle");
            return (Criteria) this;
        }

        public Criteria andIssellingwellIsNull() {
            addCriterion("issellingwell is null");
            return (Criteria) this;
        }

        public Criteria andIssellingwellIsNotNull() {
            addCriterion("issellingwell is not null");
            return (Criteria) this;
        }

        public Criteria andIssellingwellEqualTo(String value) {
            addCriterion("issellingwell =", value, "issellingwell");
            return (Criteria) this;
        }

        public Criteria andIssellingwellNotEqualTo(String value) {
            addCriterion("issellingwell <>", value, "issellingwell");
            return (Criteria) this;
        }

        public Criteria andIssellingwellGreaterThan(String value) {
            addCriterion("issellingwell >", value, "issellingwell");
            return (Criteria) this;
        }

        public Criteria andIssellingwellGreaterThanOrEqualTo(String value) {
            addCriterion("issellingwell >=", value, "issellingwell");
            return (Criteria) this;
        }

        public Criteria andIssellingwellLessThan(String value) {
            addCriterion("issellingwell <", value, "issellingwell");
            return (Criteria) this;
        }

        public Criteria andIssellingwellLessThanOrEqualTo(String value) {
            addCriterion("issellingwell <=", value, "issellingwell");
            return (Criteria) this;
        }

        public Criteria andIssellingwellLike(String value) {
            addCriterion("issellingwell like", value, "issellingwell");
            return (Criteria) this;
        }

        public Criteria andIssellingwellNotLike(String value) {
            addCriterion("issellingwell not like", value, "issellingwell");
            return (Criteria) this;
        }

        public Criteria andIssellingwellIn(List<String> values) {
            addCriterion("issellingwell in", values, "issellingwell");
            return (Criteria) this;
        }

        public Criteria andIssellingwellNotIn(List<String> values) {
            addCriterion("issellingwell not in", values, "issellingwell");
            return (Criteria) this;
        }

        public Criteria andIssellingwellBetween(String value1, String value2) {
            addCriterion("issellingwell between", value1, value2, "issellingwell");
            return (Criteria) this;
        }

        public Criteria andIssellingwellNotBetween(String value1, String value2) {
            addCriterion("issellingwell not between", value1, value2, "issellingwell");
            return (Criteria) this;
        }

        public Criteria andPlanningTimeIsNull() {
            addCriterion("planning_time is null");
            return (Criteria) this;
        }

        public Criteria andPlanningTimeIsNotNull() {
            addCriterion("planning_time is not null");
            return (Criteria) this;
        }

        public Criteria andPlanningTimeEqualTo(BigDecimal value) {
            addCriterion("planning_time =", value, "planningTime");
            return (Criteria) this;
        }

        public Criteria andPlanningTimeNotEqualTo(BigDecimal value) {
            addCriterion("planning_time <>", value, "planningTime");
            return (Criteria) this;
        }

        public Criteria andPlanningTimeGreaterThan(BigDecimal value) {
            addCriterion("planning_time >", value, "planningTime");
            return (Criteria) this;
        }

        public Criteria andPlanningTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("planning_time >=", value, "planningTime");
            return (Criteria) this;
        }

        public Criteria andPlanningTimeLessThan(BigDecimal value) {
            addCriterion("planning_time <", value, "planningTime");
            return (Criteria) this;
        }

        public Criteria andPlanningTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("planning_time <=", value, "planningTime");
            return (Criteria) this;
        }

        public Criteria andPlanningTimeIn(List<BigDecimal> values) {
            addCriterion("planning_time in", values, "planningTime");
            return (Criteria) this;
        }

        public Criteria andPlanningTimeNotIn(List<BigDecimal> values) {
            addCriterion("planning_time not in", values, "planningTime");
            return (Criteria) this;
        }

        public Criteria andPlanningTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("planning_time between", value1, value2, "planningTime");
            return (Criteria) this;
        }

        public Criteria andPlanningTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("planning_time not between", value1, value2, "planningTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNull() {
            addCriterion("shipping_time is null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNotNull() {
            addCriterion("shipping_time is not null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeEqualTo(BigDecimal value) {
            addCriterion("shipping_time =", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotEqualTo(BigDecimal value) {
            addCriterion("shipping_time <>", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThan(BigDecimal value) {
            addCriterion("shipping_time >", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_time >=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThan(BigDecimal value) {
            addCriterion("shipping_time <", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_time <=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIn(List<BigDecimal> values) {
            addCriterion("shipping_time in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotIn(List<BigDecimal> values) {
            addCriterion("shipping_time not in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_time between", value1, value2, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_time not between", value1, value2, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andDatedeliveryIsNull() {
            addCriterion("datedelivery is null");
            return (Criteria) this;
        }

        public Criteria andDatedeliveryIsNotNull() {
            addCriterion("datedelivery is not null");
            return (Criteria) this;
        }

        public Criteria andDatedeliveryEqualTo(BigDecimal value) {
            addCriterion("datedelivery =", value, "datedelivery");
            return (Criteria) this;
        }

        public Criteria andDatedeliveryNotEqualTo(BigDecimal value) {
            addCriterion("datedelivery <>", value, "datedelivery");
            return (Criteria) this;
        }

        public Criteria andDatedeliveryGreaterThan(BigDecimal value) {
            addCriterion("datedelivery >", value, "datedelivery");
            return (Criteria) this;
        }

        public Criteria andDatedeliveryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("datedelivery >=", value, "datedelivery");
            return (Criteria) this;
        }

        public Criteria andDatedeliveryLessThan(BigDecimal value) {
            addCriterion("datedelivery <", value, "datedelivery");
            return (Criteria) this;
        }

        public Criteria andDatedeliveryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("datedelivery <=", value, "datedelivery");
            return (Criteria) this;
        }

        public Criteria andDatedeliveryIn(List<BigDecimal> values) {
            addCriterion("datedelivery in", values, "datedelivery");
            return (Criteria) this;
        }

        public Criteria andDatedeliveryNotIn(List<BigDecimal> values) {
            addCriterion("datedelivery not in", values, "datedelivery");
            return (Criteria) this;
        }

        public Criteria andDatedeliveryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("datedelivery between", value1, value2, "datedelivery");
            return (Criteria) this;
        }

        public Criteria andDatedeliveryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("datedelivery not between", value1, value2, "datedelivery");
            return (Criteria) this;
        }

        public Criteria andShiptypeIsNull() {
            addCriterion("shiptype is null");
            return (Criteria) this;
        }

        public Criteria andShiptypeIsNotNull() {
            addCriterion("shiptype is not null");
            return (Criteria) this;
        }

        public Criteria andShiptypeEqualTo(String value) {
            addCriterion("shiptype =", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeNotEqualTo(String value) {
            addCriterion("shiptype <>", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeGreaterThan(String value) {
            addCriterion("shiptype >", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeGreaterThanOrEqualTo(String value) {
            addCriterion("shiptype >=", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeLessThan(String value) {
            addCriterion("shiptype <", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeLessThanOrEqualTo(String value) {
            addCriterion("shiptype <=", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeLike(String value) {
            addCriterion("shiptype like", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeNotLike(String value) {
            addCriterion("shiptype not like", value, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeIn(List<String> values) {
            addCriterion("shiptype in", values, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeNotIn(List<String> values) {
            addCriterion("shiptype not in", values, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeBetween(String value1, String value2) {
            addCriterion("shiptype between", value1, value2, "shiptype");
            return (Criteria) this;
        }

        public Criteria andShiptypeNotBetween(String value1, String value2) {
            addCriterion("shiptype not between", value1, value2, "shiptype");
            return (Criteria) this;
        }

        public Criteria andIscombinationIsNull() {
            addCriterion("iscombination is null");
            return (Criteria) this;
        }

        public Criteria andIscombinationIsNotNull() {
            addCriterion("iscombination is not null");
            return (Criteria) this;
        }

        public Criteria andIscombinationEqualTo(String value) {
            addCriterion("iscombination =", value, "iscombination");
            return (Criteria) this;
        }

        public Criteria andIscombinationNotEqualTo(String value) {
            addCriterion("iscombination <>", value, "iscombination");
            return (Criteria) this;
        }

        public Criteria andIscombinationGreaterThan(String value) {
            addCriterion("iscombination >", value, "iscombination");
            return (Criteria) this;
        }

        public Criteria andIscombinationGreaterThanOrEqualTo(String value) {
            addCriterion("iscombination >=", value, "iscombination");
            return (Criteria) this;
        }

        public Criteria andIscombinationLessThan(String value) {
            addCriterion("iscombination <", value, "iscombination");
            return (Criteria) this;
        }

        public Criteria andIscombinationLessThanOrEqualTo(String value) {
            addCriterion("iscombination <=", value, "iscombination");
            return (Criteria) this;
        }

        public Criteria andIscombinationLike(String value) {
            addCriterion("iscombination like", value, "iscombination");
            return (Criteria) this;
        }

        public Criteria andIscombinationNotLike(String value) {
            addCriterion("iscombination not like", value, "iscombination");
            return (Criteria) this;
        }

        public Criteria andIscombinationIn(List<String> values) {
            addCriterion("iscombination in", values, "iscombination");
            return (Criteria) this;
        }

        public Criteria andIscombinationNotIn(List<String> values) {
            addCriterion("iscombination not in", values, "iscombination");
            return (Criteria) this;
        }

        public Criteria andIscombinationBetween(String value1, String value2) {
            addCriterion("iscombination between", value1, value2, "iscombination");
            return (Criteria) this;
        }

        public Criteria andIscombinationNotBetween(String value1, String value2) {
            addCriterion("iscombination not between", value1, value2, "iscombination");
            return (Criteria) this;
        }

        public Criteria andMakeuprateIsNull() {
            addCriterion("makeuprate is null");
            return (Criteria) this;
        }

        public Criteria andMakeuprateIsNotNull() {
            addCriterion("makeuprate is not null");
            return (Criteria) this;
        }

        public Criteria andMakeuprateEqualTo(BigDecimal value) {
            addCriterion("makeuprate =", value, "makeuprate");
            return (Criteria) this;
        }

        public Criteria andMakeuprateNotEqualTo(BigDecimal value) {
            addCriterion("makeuprate <>", value, "makeuprate");
            return (Criteria) this;
        }

        public Criteria andMakeuprateGreaterThan(BigDecimal value) {
            addCriterion("makeuprate >", value, "makeuprate");
            return (Criteria) this;
        }

        public Criteria andMakeuprateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("makeuprate >=", value, "makeuprate");
            return (Criteria) this;
        }

        public Criteria andMakeuprateLessThan(BigDecimal value) {
            addCriterion("makeuprate <", value, "makeuprate");
            return (Criteria) this;
        }

        public Criteria andMakeuprateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("makeuprate <=", value, "makeuprate");
            return (Criteria) this;
        }

        public Criteria andMakeuprateIn(List<BigDecimal> values) {
            addCriterion("makeuprate in", values, "makeuprate");
            return (Criteria) this;
        }

        public Criteria andMakeuprateNotIn(List<BigDecimal> values) {
            addCriterion("makeuprate not in", values, "makeuprate");
            return (Criteria) this;
        }

        public Criteria andMakeuprateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("makeuprate between", value1, value2, "makeuprate");
            return (Criteria) this;
        }

        public Criteria andMakeuprateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("makeuprate not between", value1, value2, "makeuprate");
            return (Criteria) this;
        }

        public Criteria andOriginalPlaceIsNull() {
            addCriterion("original_place is null");
            return (Criteria) this;
        }

        public Criteria andOriginalPlaceIsNotNull() {
            addCriterion("original_place is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalPlaceEqualTo(String value) {
            addCriterion("original_place =", value, "originalPlace");
            return (Criteria) this;
        }

        public Criteria andOriginalPlaceNotEqualTo(String value) {
            addCriterion("original_place <>", value, "originalPlace");
            return (Criteria) this;
        }

        public Criteria andOriginalPlaceGreaterThan(String value) {
            addCriterion("original_place >", value, "originalPlace");
            return (Criteria) this;
        }

        public Criteria andOriginalPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("original_place >=", value, "originalPlace");
            return (Criteria) this;
        }

        public Criteria andOriginalPlaceLessThan(String value) {
            addCriterion("original_place <", value, "originalPlace");
            return (Criteria) this;
        }

        public Criteria andOriginalPlaceLessThanOrEqualTo(String value) {
            addCriterion("original_place <=", value, "originalPlace");
            return (Criteria) this;
        }

        public Criteria andOriginalPlaceLike(String value) {
            addCriterion("original_place like", value, "originalPlace");
            return (Criteria) this;
        }

        public Criteria andOriginalPlaceNotLike(String value) {
            addCriterion("original_place not like", value, "originalPlace");
            return (Criteria) this;
        }

        public Criteria andOriginalPlaceIn(List<String> values) {
            addCriterion("original_place in", values, "originalPlace");
            return (Criteria) this;
        }

        public Criteria andOriginalPlaceNotIn(List<String> values) {
            addCriterion("original_place not in", values, "originalPlace");
            return (Criteria) this;
        }

        public Criteria andOriginalPlaceBetween(String value1, String value2) {
            addCriterion("original_place between", value1, value2, "originalPlace");
            return (Criteria) this;
        }

        public Criteria andOriginalPlaceNotBetween(String value1, String value2) {
            addCriterion("original_place not between", value1, value2, "originalPlace");
            return (Criteria) this;
        }

        public Criteria andDeclarationElementsIsNull() {
            addCriterion("declaration_elements is null");
            return (Criteria) this;
        }

        public Criteria andDeclarationElementsIsNotNull() {
            addCriterion("declaration_elements is not null");
            return (Criteria) this;
        }

        public Criteria andDeclarationElementsEqualTo(String value) {
            addCriterion("declaration_elements =", value, "declarationElements");
            return (Criteria) this;
        }

        public Criteria andDeclarationElementsNotEqualTo(String value) {
            addCriterion("declaration_elements <>", value, "declarationElements");
            return (Criteria) this;
        }

        public Criteria andDeclarationElementsGreaterThan(String value) {
            addCriterion("declaration_elements >", value, "declarationElements");
            return (Criteria) this;
        }

        public Criteria andDeclarationElementsGreaterThanOrEqualTo(String value) {
            addCriterion("declaration_elements >=", value, "declarationElements");
            return (Criteria) this;
        }

        public Criteria andDeclarationElementsLessThan(String value) {
            addCriterion("declaration_elements <", value, "declarationElements");
            return (Criteria) this;
        }

        public Criteria andDeclarationElementsLessThanOrEqualTo(String value) {
            addCriterion("declaration_elements <=", value, "declarationElements");
            return (Criteria) this;
        }

        public Criteria andDeclarationElementsLike(String value) {
            addCriterion("declaration_elements like", value, "declarationElements");
            return (Criteria) this;
        }

        public Criteria andDeclarationElementsNotLike(String value) {
            addCriterion("declaration_elements not like", value, "declarationElements");
            return (Criteria) this;
        }

        public Criteria andDeclarationElementsIn(List<String> values) {
            addCriterion("declaration_elements in", values, "declarationElements");
            return (Criteria) this;
        }

        public Criteria andDeclarationElementsNotIn(List<String> values) {
            addCriterion("declaration_elements not in", values, "declarationElements");
            return (Criteria) this;
        }

        public Criteria andDeclarationElementsBetween(String value1, String value2) {
            addCriterion("declaration_elements between", value1, value2, "declarationElements");
            return (Criteria) this;
        }

        public Criteria andDeclarationElementsNotBetween(String value1, String value2) {
            addCriterion("declaration_elements not between", value1, value2, "declarationElements");
            return (Criteria) this;
        }

        public Criteria andCostingmethodIsNull() {
            addCriterion("costingmethod is null");
            return (Criteria) this;
        }

        public Criteria andCostingmethodIsNotNull() {
            addCriterion("costingmethod is not null");
            return (Criteria) this;
        }

        public Criteria andCostingmethodEqualTo(String value) {
            addCriterion("costingmethod =", value, "costingmethod");
            return (Criteria) this;
        }

        public Criteria andCostingmethodNotEqualTo(String value) {
            addCriterion("costingmethod <>", value, "costingmethod");
            return (Criteria) this;
        }

        public Criteria andCostingmethodGreaterThan(String value) {
            addCriterion("costingmethod >", value, "costingmethod");
            return (Criteria) this;
        }

        public Criteria andCostingmethodGreaterThanOrEqualTo(String value) {
            addCriterion("costingmethod >=", value, "costingmethod");
            return (Criteria) this;
        }

        public Criteria andCostingmethodLessThan(String value) {
            addCriterion("costingmethod <", value, "costingmethod");
            return (Criteria) this;
        }

        public Criteria andCostingmethodLessThanOrEqualTo(String value) {
            addCriterion("costingmethod <=", value, "costingmethod");
            return (Criteria) this;
        }

        public Criteria andCostingmethodLike(String value) {
            addCriterion("costingmethod like", value, "costingmethod");
            return (Criteria) this;
        }

        public Criteria andCostingmethodNotLike(String value) {
            addCriterion("costingmethod not like", value, "costingmethod");
            return (Criteria) this;
        }

        public Criteria andCostingmethodIn(List<String> values) {
            addCriterion("costingmethod in", values, "costingmethod");
            return (Criteria) this;
        }

        public Criteria andCostingmethodNotIn(List<String> values) {
            addCriterion("costingmethod not in", values, "costingmethod");
            return (Criteria) this;
        }

        public Criteria andCostingmethodBetween(String value1, String value2) {
            addCriterion("costingmethod between", value1, value2, "costingmethod");
            return (Criteria) this;
        }

        public Criteria andCostingmethodNotBetween(String value1, String value2) {
            addCriterion("costingmethod not between", value1, value2, "costingmethod");
            return (Criteria) this;
        }

        public Criteria andPricetaxincludedIsNull() {
            addCriterion("pricetaxincluded is null");
            return (Criteria) this;
        }

        public Criteria andPricetaxincludedIsNotNull() {
            addCriterion("pricetaxincluded is not null");
            return (Criteria) this;
        }

        public Criteria andPricetaxincludedEqualTo(BigDecimal value) {
            addCriterion("pricetaxincluded =", value, "pricetaxincluded");
            return (Criteria) this;
        }

        public Criteria andPricetaxincludedNotEqualTo(BigDecimal value) {
            addCriterion("pricetaxincluded <>", value, "pricetaxincluded");
            return (Criteria) this;
        }

        public Criteria andPricetaxincludedGreaterThan(BigDecimal value) {
            addCriterion("pricetaxincluded >", value, "pricetaxincluded");
            return (Criteria) this;
        }

        public Criteria andPricetaxincludedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pricetaxincluded >=", value, "pricetaxincluded");
            return (Criteria) this;
        }

        public Criteria andPricetaxincludedLessThan(BigDecimal value) {
            addCriterion("pricetaxincluded <", value, "pricetaxincluded");
            return (Criteria) this;
        }

        public Criteria andPricetaxincludedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pricetaxincluded <=", value, "pricetaxincluded");
            return (Criteria) this;
        }

        public Criteria andPricetaxincludedIn(List<BigDecimal> values) {
            addCriterion("pricetaxincluded in", values, "pricetaxincluded");
            return (Criteria) this;
        }

        public Criteria andPricetaxincludedNotIn(List<BigDecimal> values) {
            addCriterion("pricetaxincluded not in", values, "pricetaxincluded");
            return (Criteria) this;
        }

        public Criteria andPricetaxincludedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pricetaxincluded between", value1, value2, "pricetaxincluded");
            return (Criteria) this;
        }

        public Criteria andPricetaxincludedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pricetaxincluded not between", value1, value2, "pricetaxincluded");
            return (Criteria) this;
        }

        public Criteria andPrice1IsNull() {
            addCriterion("price1 is null");
            return (Criteria) this;
        }

        public Criteria andPrice1IsNotNull() {
            addCriterion("price1 is not null");
            return (Criteria) this;
        }

        public Criteria andPrice1EqualTo(BigDecimal value) {
            addCriterion("price1 =", value, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1NotEqualTo(BigDecimal value) {
            addCriterion("price1 <>", value, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1GreaterThan(BigDecimal value) {
            addCriterion("price1 >", value, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price1 >=", value, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1LessThan(BigDecimal value) {
            addCriterion("price1 <", value, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("price1 <=", value, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1In(List<BigDecimal> values) {
            addCriterion("price1 in", values, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1NotIn(List<BigDecimal> values) {
            addCriterion("price1 not in", values, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("price1 between", value1, value2, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price1 not between", value1, value2, "price1");
            return (Criteria) this;
        }

        public Criteria andPrice2IsNull() {
            addCriterion("price2 is null");
            return (Criteria) this;
        }

        public Criteria andPrice2IsNotNull() {
            addCriterion("price2 is not null");
            return (Criteria) this;
        }

        public Criteria andPrice2EqualTo(BigDecimal value) {
            addCriterion("price2 =", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2NotEqualTo(BigDecimal value) {
            addCriterion("price2 <>", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2GreaterThan(BigDecimal value) {
            addCriterion("price2 >", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price2 >=", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2LessThan(BigDecimal value) {
            addCriterion("price2 <", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("price2 <=", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2In(List<BigDecimal> values) {
            addCriterion("price2 in", values, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2NotIn(List<BigDecimal> values) {
            addCriterion("price2 not in", values, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("price2 between", value1, value2, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price2 not between", value1, value2, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice3IsNull() {
            addCriterion("price3 is null");
            return (Criteria) this;
        }

        public Criteria andPrice3IsNotNull() {
            addCriterion("price3 is not null");
            return (Criteria) this;
        }

        public Criteria andPrice3EqualTo(BigDecimal value) {
            addCriterion("price3 =", value, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice3NotEqualTo(BigDecimal value) {
            addCriterion("price3 <>", value, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice3GreaterThan(BigDecimal value) {
            addCriterion("price3 >", value, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price3 >=", value, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice3LessThan(BigDecimal value) {
            addCriterion("price3 <", value, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("price3 <=", value, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice3In(List<BigDecimal> values) {
            addCriterion("price3 in", values, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice3NotIn(List<BigDecimal> values) {
            addCriterion("price3 not in", values, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("price3 between", value1, value2, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price3 not between", value1, value2, "price3");
            return (Criteria) this;
        }

        public Criteria andPrice4IsNull() {
            addCriterion("price4 is null");
            return (Criteria) this;
        }

        public Criteria andPrice4IsNotNull() {
            addCriterion("price4 is not null");
            return (Criteria) this;
        }

        public Criteria andPrice4EqualTo(BigDecimal value) {
            addCriterion("price4 =", value, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice4NotEqualTo(BigDecimal value) {
            addCriterion("price4 <>", value, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice4GreaterThan(BigDecimal value) {
            addCriterion("price4 >", value, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price4 >=", value, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice4LessThan(BigDecimal value) {
            addCriterion("price4 <", value, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("price4 <=", value, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice4In(List<BigDecimal> values) {
            addCriterion("price4 in", values, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice4NotIn(List<BigDecimal> values) {
            addCriterion("price4 not in", values, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("price4 between", value1, value2, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price4 not between", value1, value2, "price4");
            return (Criteria) this;
        }

        public Criteria andPrice5IsNull() {
            addCriterion("price5 is null");
            return (Criteria) this;
        }

        public Criteria andPrice5IsNotNull() {
            addCriterion("price5 is not null");
            return (Criteria) this;
        }

        public Criteria andPrice5EqualTo(BigDecimal value) {
            addCriterion("price5 =", value, "price5");
            return (Criteria) this;
        }

        public Criteria andPrice5NotEqualTo(BigDecimal value) {
            addCriterion("price5 <>", value, "price5");
            return (Criteria) this;
        }

        public Criteria andPrice5GreaterThan(BigDecimal value) {
            addCriterion("price5 >", value, "price5");
            return (Criteria) this;
        }

        public Criteria andPrice5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price5 >=", value, "price5");
            return (Criteria) this;
        }

        public Criteria andPrice5LessThan(BigDecimal value) {
            addCriterion("price5 <", value, "price5");
            return (Criteria) this;
        }

        public Criteria andPrice5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("price5 <=", value, "price5");
            return (Criteria) this;
        }

        public Criteria andPrice5In(List<BigDecimal> values) {
            addCriterion("price5 in", values, "price5");
            return (Criteria) this;
        }

        public Criteria andPrice5NotIn(List<BigDecimal> values) {
            addCriterion("price5 not in", values, "price5");
            return (Criteria) this;
        }

        public Criteria andPrice5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("price5 between", value1, value2, "price5");
            return (Criteria) this;
        }

        public Criteria andPrice5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price5 not between", value1, value2, "price5");
            return (Criteria) this;
        }

        public Criteria andQtyFclIsNull() {
            addCriterion("qty_fcl is null");
            return (Criteria) this;
        }

        public Criteria andQtyFclIsNotNull() {
            addCriterion("qty_fcl is not null");
            return (Criteria) this;
        }

        public Criteria andQtyFclEqualTo(String value) {
            addCriterion("qty_fcl =", value, "qtyFcl");
            return (Criteria) this;
        }

        public Criteria andQtyFclNotEqualTo(String value) {
            addCriterion("qty_fcl <>", value, "qtyFcl");
            return (Criteria) this;
        }

        public Criteria andQtyFclGreaterThan(String value) {
            addCriterion("qty_fcl >", value, "qtyFcl");
            return (Criteria) this;
        }

        public Criteria andQtyFclGreaterThanOrEqualTo(String value) {
            addCriterion("qty_fcl >=", value, "qtyFcl");
            return (Criteria) this;
        }

        public Criteria andQtyFclLessThan(String value) {
            addCriterion("qty_fcl <", value, "qtyFcl");
            return (Criteria) this;
        }

        public Criteria andQtyFclLessThanOrEqualTo(String value) {
            addCriterion("qty_fcl <=", value, "qtyFcl");
            return (Criteria) this;
        }

        public Criteria andQtyFclLike(String value) {
            addCriterion("qty_fcl like", value, "qtyFcl");
            return (Criteria) this;
        }

        public Criteria andQtyFclNotLike(String value) {
            addCriterion("qty_fcl not like", value, "qtyFcl");
            return (Criteria) this;
        }

        public Criteria andQtyFclIn(List<String> values) {
            addCriterion("qty_fcl in", values, "qtyFcl");
            return (Criteria) this;
        }

        public Criteria andQtyFclNotIn(List<String> values) {
            addCriterion("qty_fcl not in", values, "qtyFcl");
            return (Criteria) this;
        }

        public Criteria andQtyFclBetween(String value1, String value2) {
            addCriterion("qty_fcl between", value1, value2, "qtyFcl");
            return (Criteria) this;
        }

        public Criteria andQtyFclNotBetween(String value1, String value2) {
            addCriterion("qty_fcl not between", value1, value2, "qtyFcl");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysIsNull() {
            addCriterion("deliverydays is null");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysIsNotNull() {
            addCriterion("deliverydays is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysEqualTo(BigDecimal value) {
            addCriterion("deliverydays =", value, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysNotEqualTo(BigDecimal value) {
            addCriterion("deliverydays <>", value, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysGreaterThan(BigDecimal value) {
            addCriterion("deliverydays >", value, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deliverydays >=", value, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysLessThan(BigDecimal value) {
            addCriterion("deliverydays <", value, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deliverydays <=", value, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysIn(List<BigDecimal> values) {
            addCriterion("deliverydays in", values, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysNotIn(List<BigDecimal> values) {
            addCriterion("deliverydays not in", values, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deliverydays between", value1, value2, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andDeliverydaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deliverydays not between", value1, value2, "deliverydays");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(BigDecimal value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(BigDecimal value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(BigDecimal value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(BigDecimal value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<BigDecimal> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<BigDecimal> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("barcode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("barcode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("barcode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barcode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barcode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barcode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("barcode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barcode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("barcode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("barcode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("barcode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("barcode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barcode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barcode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andSalestatusIsNull() {
            addCriterion("salestatus is null");
            return (Criteria) this;
        }

        public Criteria andSalestatusIsNotNull() {
            addCriterion("salestatus is not null");
            return (Criteria) this;
        }

        public Criteria andSalestatusEqualTo(String value) {
            addCriterion("salestatus =", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotEqualTo(String value) {
            addCriterion("salestatus <>", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusGreaterThan(String value) {
            addCriterion("salestatus >", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusGreaterThanOrEqualTo(String value) {
            addCriterion("salestatus >=", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusLessThan(String value) {
            addCriterion("salestatus <", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusLessThanOrEqualTo(String value) {
            addCriterion("salestatus <=", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusLike(String value) {
            addCriterion("salestatus like", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotLike(String value) {
            addCriterion("salestatus not like", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusIn(List<String> values) {
            addCriterion("salestatus in", values, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotIn(List<String> values) {
            addCriterion("salestatus not in", values, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusBetween(String value1, String value2) {
            addCriterion("salestatus between", value1, value2, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotBetween(String value1, String value2) {
            addCriterion("salestatus not between", value1, value2, "salestatus");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAmazonsizeIsNull() {
            addCriterion("amazonsize is null");
            return (Criteria) this;
        }

        public Criteria andAmazonsizeIsNotNull() {
            addCriterion("amazonsize is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonsizeEqualTo(String value) {
            addCriterion("amazonsize =", value, "amazonsize");
            return (Criteria) this;
        }

        public Criteria andAmazonsizeNotEqualTo(String value) {
            addCriterion("amazonsize <>", value, "amazonsize");
            return (Criteria) this;
        }

        public Criteria andAmazonsizeGreaterThan(String value) {
            addCriterion("amazonsize >", value, "amazonsize");
            return (Criteria) this;
        }

        public Criteria andAmazonsizeGreaterThanOrEqualTo(String value) {
            addCriterion("amazonsize >=", value, "amazonsize");
            return (Criteria) this;
        }

        public Criteria andAmazonsizeLessThan(String value) {
            addCriterion("amazonsize <", value, "amazonsize");
            return (Criteria) this;
        }

        public Criteria andAmazonsizeLessThanOrEqualTo(String value) {
            addCriterion("amazonsize <=", value, "amazonsize");
            return (Criteria) this;
        }

        public Criteria andAmazonsizeLike(String value) {
            addCriterion("amazonsize like", value, "amazonsize");
            return (Criteria) this;
        }

        public Criteria andAmazonsizeNotLike(String value) {
            addCriterion("amazonsize not like", value, "amazonsize");
            return (Criteria) this;
        }

        public Criteria andAmazonsizeIn(List<String> values) {
            addCriterion("amazonsize in", values, "amazonsize");
            return (Criteria) this;
        }

        public Criteria andAmazonsizeNotIn(List<String> values) {
            addCriterion("amazonsize not in", values, "amazonsize");
            return (Criteria) this;
        }

        public Criteria andAmazonsizeBetween(String value1, String value2) {
            addCriterion("amazonsize between", value1, value2, "amazonsize");
            return (Criteria) this;
        }

        public Criteria andAmazonsizeNotBetween(String value1, String value2) {
            addCriterion("amazonsize not between", value1, value2, "amazonsize");
            return (Criteria) this;
        }

        public Criteria andPregoodsdaysIsNull() {
            addCriterion("pregoodsdays is null");
            return (Criteria) this;
        }

        public Criteria andPregoodsdaysIsNotNull() {
            addCriterion("pregoodsdays is not null");
            return (Criteria) this;
        }

        public Criteria andPregoodsdaysEqualTo(BigDecimal value) {
            addCriterion("pregoodsdays =", value, "pregoodsdays");
            return (Criteria) this;
        }

        public Criteria andPregoodsdaysNotEqualTo(BigDecimal value) {
            addCriterion("pregoodsdays <>", value, "pregoodsdays");
            return (Criteria) this;
        }

        public Criteria andPregoodsdaysGreaterThan(BigDecimal value) {
            addCriterion("pregoodsdays >", value, "pregoodsdays");
            return (Criteria) this;
        }

        public Criteria andPregoodsdaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pregoodsdays >=", value, "pregoodsdays");
            return (Criteria) this;
        }

        public Criteria andPregoodsdaysLessThan(BigDecimal value) {
            addCriterion("pregoodsdays <", value, "pregoodsdays");
            return (Criteria) this;
        }

        public Criteria andPregoodsdaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pregoodsdays <=", value, "pregoodsdays");
            return (Criteria) this;
        }

        public Criteria andPregoodsdaysIn(List<BigDecimal> values) {
            addCriterion("pregoodsdays in", values, "pregoodsdays");
            return (Criteria) this;
        }

        public Criteria andPregoodsdaysNotIn(List<BigDecimal> values) {
            addCriterion("pregoodsdays not in", values, "pregoodsdays");
            return (Criteria) this;
        }

        public Criteria andPregoodsdaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pregoodsdays between", value1, value2, "pregoodsdays");
            return (Criteria) this;
        }

        public Criteria andPregoodsdaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pregoodsdays not between", value1, value2, "pregoodsdays");
            return (Criteria) this;
        }

        public Criteria andOnshelvesdateIsNull() {
            addCriterion("onshelvesdate is null");
            return (Criteria) this;
        }

        public Criteria andOnshelvesdateIsNotNull() {
            addCriterion("onshelvesdate is not null");
            return (Criteria) this;
        }

        public Criteria andOnshelvesdateEqualTo(BigDecimal value) {
            addCriterion("onshelvesdate =", value, "onshelvesdate");
            return (Criteria) this;
        }

        public Criteria andOnshelvesdateNotEqualTo(BigDecimal value) {
            addCriterion("onshelvesdate <>", value, "onshelvesdate");
            return (Criteria) this;
        }

        public Criteria andOnshelvesdateGreaterThan(BigDecimal value) {
            addCriterion("onshelvesdate >", value, "onshelvesdate");
            return (Criteria) this;
        }

        public Criteria andOnshelvesdateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("onshelvesdate >=", value, "onshelvesdate");
            return (Criteria) this;
        }

        public Criteria andOnshelvesdateLessThan(BigDecimal value) {
            addCriterion("onshelvesdate <", value, "onshelvesdate");
            return (Criteria) this;
        }

        public Criteria andOnshelvesdateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("onshelvesdate <=", value, "onshelvesdate");
            return (Criteria) this;
        }

        public Criteria andOnshelvesdateIn(List<BigDecimal> values) {
            addCriterion("onshelvesdate in", values, "onshelvesdate");
            return (Criteria) this;
        }

        public Criteria andOnshelvesdateNotIn(List<BigDecimal> values) {
            addCriterion("onshelvesdate not in", values, "onshelvesdate");
            return (Criteria) this;
        }

        public Criteria andOnshelvesdateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("onshelvesdate between", value1, value2, "onshelvesdate");
            return (Criteria) this;
        }

        public Criteria andOnshelvesdateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("onshelvesdate not between", value1, value2, "onshelvesdate");
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

        public Criteria andItemTypeIsNull() {
            addCriterion("item_type is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(String value) {
            addCriterion("item_type =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(String value) {
            addCriterion("item_type <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(String value) {
            addCriterion("item_type >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("item_type >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(String value) {
            addCriterion("item_type <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(String value) {
            addCriterion("item_type <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLike(String value) {
            addCriterion("item_type like", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotLike(String value) {
            addCriterion("item_type not like", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<String> values) {
            addCriterion("item_type in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<String> values) {
            addCriterion("item_type not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(String value1, String value2) {
            addCriterion("item_type between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(String value1, String value2) {
            addCriterion("item_type not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andFeedProductTypeIsNull() {
            addCriterion("feed_product_type is null");
            return (Criteria) this;
        }

        public Criteria andFeedProductTypeIsNotNull() {
            addCriterion("feed_product_type is not null");
            return (Criteria) this;
        }

        public Criteria andFeedProductTypeEqualTo(String value) {
            addCriterion("feed_product_type =", value, "feedProductType");
            return (Criteria) this;
        }

        public Criteria andFeedProductTypeNotEqualTo(String value) {
            addCriterion("feed_product_type <>", value, "feedProductType");
            return (Criteria) this;
        }

        public Criteria andFeedProductTypeGreaterThan(String value) {
            addCriterion("feed_product_type >", value, "feedProductType");
            return (Criteria) this;
        }

        public Criteria andFeedProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("feed_product_type >=", value, "feedProductType");
            return (Criteria) this;
        }

        public Criteria andFeedProductTypeLessThan(String value) {
            addCriterion("feed_product_type <", value, "feedProductType");
            return (Criteria) this;
        }

        public Criteria andFeedProductTypeLessThanOrEqualTo(String value) {
            addCriterion("feed_product_type <=", value, "feedProductType");
            return (Criteria) this;
        }

        public Criteria andFeedProductTypeLike(String value) {
            addCriterion("feed_product_type like", value, "feedProductType");
            return (Criteria) this;
        }

        public Criteria andFeedProductTypeNotLike(String value) {
            addCriterion("feed_product_type not like", value, "feedProductType");
            return (Criteria) this;
        }

        public Criteria andFeedProductTypeIn(List<String> values) {
            addCriterion("feed_product_type in", values, "feedProductType");
            return (Criteria) this;
        }

        public Criteria andFeedProductTypeNotIn(List<String> values) {
            addCriterion("feed_product_type not in", values, "feedProductType");
            return (Criteria) this;
        }

        public Criteria andFeedProductTypeBetween(String value1, String value2) {
            addCriterion("feed_product_type between", value1, value2, "feedProductType");
            return (Criteria) this;
        }

        public Criteria andFeedProductTypeNotBetween(String value1, String value2) {
            addCriterion("feed_product_type not between", value1, value2, "feedProductType");
            return (Criteria) this;
        }

        public Criteria andPartNumberIsNull() {
            addCriterion("part_number is null");
            return (Criteria) this;
        }

        public Criteria andPartNumberIsNotNull() {
            addCriterion("part_number is not null");
            return (Criteria) this;
        }

        public Criteria andPartNumberEqualTo(String value) {
            addCriterion("part_number =", value, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberNotEqualTo(String value) {
            addCriterion("part_number <>", value, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberGreaterThan(String value) {
            addCriterion("part_number >", value, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberGreaterThanOrEqualTo(String value) {
            addCriterion("part_number >=", value, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberLessThan(String value) {
            addCriterion("part_number <", value, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberLessThanOrEqualTo(String value) {
            addCriterion("part_number <=", value, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberLike(String value) {
            addCriterion("part_number like", value, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberNotLike(String value) {
            addCriterion("part_number not like", value, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberIn(List<String> values) {
            addCriterion("part_number in", values, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberNotIn(List<String> values) {
            addCriterion("part_number not in", values, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberBetween(String value1, String value2) {
            addCriterion("part_number between", value1, value2, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberNotBetween(String value1, String value2) {
            addCriterion("part_number not between", value1, value2, "partNumber");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andExternalProductIsNull() {
            addCriterion("external_product is null");
            return (Criteria) this;
        }

        public Criteria andExternalProductIsNotNull() {
            addCriterion("external_product is not null");
            return (Criteria) this;
        }

        public Criteria andExternalProductEqualTo(BigDecimal value) {
            addCriterion("external_product =", value, "externalProduct");
            return (Criteria) this;
        }

        public Criteria andExternalProductNotEqualTo(BigDecimal value) {
            addCriterion("external_product <>", value, "externalProduct");
            return (Criteria) this;
        }

        public Criteria andExternalProductGreaterThan(BigDecimal value) {
            addCriterion("external_product >", value, "externalProduct");
            return (Criteria) this;
        }

        public Criteria andExternalProductGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("external_product >=", value, "externalProduct");
            return (Criteria) this;
        }

        public Criteria andExternalProductLessThan(BigDecimal value) {
            addCriterion("external_product <", value, "externalProduct");
            return (Criteria) this;
        }

        public Criteria andExternalProductLessThanOrEqualTo(BigDecimal value) {
            addCriterion("external_product <=", value, "externalProduct");
            return (Criteria) this;
        }

        public Criteria andExternalProductIn(List<BigDecimal> values) {
            addCriterion("external_product in", values, "externalProduct");
            return (Criteria) this;
        }

        public Criteria andExternalProductNotIn(List<BigDecimal> values) {
            addCriterion("external_product not in", values, "externalProduct");
            return (Criteria) this;
        }

        public Criteria andExternalProductBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("external_product between", value1, value2, "externalProduct");
            return (Criteria) this;
        }

        public Criteria andExternalProductNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("external_product not between", value1, value2, "externalProduct");
            return (Criteria) this;
        }

        public Criteria andExternalProductIdTypeIsNull() {
            addCriterion("external_product_id_type is null");
            return (Criteria) this;
        }

        public Criteria andExternalProductIdTypeIsNotNull() {
            addCriterion("external_product_id_type is not null");
            return (Criteria) this;
        }

        public Criteria andExternalProductIdTypeEqualTo(String value) {
            addCriterion("external_product_id_type =", value, "externalProductIdType");
            return (Criteria) this;
        }

        public Criteria andExternalProductIdTypeNotEqualTo(String value) {
            addCriterion("external_product_id_type <>", value, "externalProductIdType");
            return (Criteria) this;
        }

        public Criteria andExternalProductIdTypeGreaterThan(String value) {
            addCriterion("external_product_id_type >", value, "externalProductIdType");
            return (Criteria) this;
        }

        public Criteria andExternalProductIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("external_product_id_type >=", value, "externalProductIdType");
            return (Criteria) this;
        }

        public Criteria andExternalProductIdTypeLessThan(String value) {
            addCriterion("external_product_id_type <", value, "externalProductIdType");
            return (Criteria) this;
        }

        public Criteria andExternalProductIdTypeLessThanOrEqualTo(String value) {
            addCriterion("external_product_id_type <=", value, "externalProductIdType");
            return (Criteria) this;
        }

        public Criteria andExternalProductIdTypeLike(String value) {
            addCriterion("external_product_id_type like", value, "externalProductIdType");
            return (Criteria) this;
        }

        public Criteria andExternalProductIdTypeNotLike(String value) {
            addCriterion("external_product_id_type not like", value, "externalProductIdType");
            return (Criteria) this;
        }

        public Criteria andExternalProductIdTypeIn(List<String> values) {
            addCriterion("external_product_id_type in", values, "externalProductIdType");
            return (Criteria) this;
        }

        public Criteria andExternalProductIdTypeNotIn(List<String> values) {
            addCriterion("external_product_id_type not in", values, "externalProductIdType");
            return (Criteria) this;
        }

        public Criteria andExternalProductIdTypeBetween(String value1, String value2) {
            addCriterion("external_product_id_type between", value1, value2, "externalProductIdType");
            return (Criteria) this;
        }

        public Criteria andExternalProductIdTypeNotBetween(String value1, String value2) {
            addCriterion("external_product_id_type not between", value1, value2, "externalProductIdType");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andProductTaxCodeIsNull() {
            addCriterion("product_tax_code is null");
            return (Criteria) this;
        }

        public Criteria andProductTaxCodeIsNotNull() {
            addCriterion("product_tax_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductTaxCodeEqualTo(String value) {
            addCriterion("product_tax_code =", value, "productTaxCode");
            return (Criteria) this;
        }

        public Criteria andProductTaxCodeNotEqualTo(String value) {
            addCriterion("product_tax_code <>", value, "productTaxCode");
            return (Criteria) this;
        }

        public Criteria andProductTaxCodeGreaterThan(String value) {
            addCriterion("product_tax_code >", value, "productTaxCode");
            return (Criteria) this;
        }

        public Criteria andProductTaxCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_tax_code >=", value, "productTaxCode");
            return (Criteria) this;
        }

        public Criteria andProductTaxCodeLessThan(String value) {
            addCriterion("product_tax_code <", value, "productTaxCode");
            return (Criteria) this;
        }

        public Criteria andProductTaxCodeLessThanOrEqualTo(String value) {
            addCriterion("product_tax_code <=", value, "productTaxCode");
            return (Criteria) this;
        }

        public Criteria andProductTaxCodeLike(String value) {
            addCriterion("product_tax_code like", value, "productTaxCode");
            return (Criteria) this;
        }

        public Criteria andProductTaxCodeNotLike(String value) {
            addCriterion("product_tax_code not like", value, "productTaxCode");
            return (Criteria) this;
        }

        public Criteria andProductTaxCodeIn(List<String> values) {
            addCriterion("product_tax_code in", values, "productTaxCode");
            return (Criteria) this;
        }

        public Criteria andProductTaxCodeNotIn(List<String> values) {
            addCriterion("product_tax_code not in", values, "productTaxCode");
            return (Criteria) this;
        }

        public Criteria andProductTaxCodeBetween(String value1, String value2) {
            addCriterion("product_tax_code between", value1, value2, "productTaxCode");
            return (Criteria) this;
        }

        public Criteria andProductTaxCodeNotBetween(String value1, String value2) {
            addCriterion("product_tax_code not between", value1, value2, "productTaxCode");
            return (Criteria) this;
        }

        public Criteria andFulfillmentCenterIdIsNull() {
            addCriterion("fulfillment_center_id is null");
            return (Criteria) this;
        }

        public Criteria andFulfillmentCenterIdIsNotNull() {
            addCriterion("fulfillment_center_id is not null");
            return (Criteria) this;
        }

        public Criteria andFulfillmentCenterIdEqualTo(BigDecimal value) {
            addCriterion("fulfillment_center_id =", value, "fulfillmentCenterId");
            return (Criteria) this;
        }

        public Criteria andFulfillmentCenterIdNotEqualTo(BigDecimal value) {
            addCriterion("fulfillment_center_id <>", value, "fulfillmentCenterId");
            return (Criteria) this;
        }

        public Criteria andFulfillmentCenterIdGreaterThan(BigDecimal value) {
            addCriterion("fulfillment_center_id >", value, "fulfillmentCenterId");
            return (Criteria) this;
        }

        public Criteria andFulfillmentCenterIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fulfillment_center_id >=", value, "fulfillmentCenterId");
            return (Criteria) this;
        }

        public Criteria andFulfillmentCenterIdLessThan(BigDecimal value) {
            addCriterion("fulfillment_center_id <", value, "fulfillmentCenterId");
            return (Criteria) this;
        }

        public Criteria andFulfillmentCenterIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fulfillment_center_id <=", value, "fulfillmentCenterId");
            return (Criteria) this;
        }

        public Criteria andFulfillmentCenterIdIn(List<BigDecimal> values) {
            addCriterion("fulfillment_center_id in", values, "fulfillmentCenterId");
            return (Criteria) this;
        }

        public Criteria andFulfillmentCenterIdNotIn(List<BigDecimal> values) {
            addCriterion("fulfillment_center_id not in", values, "fulfillmentCenterId");
            return (Criteria) this;
        }

        public Criteria andFulfillmentCenterIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fulfillment_center_id between", value1, value2, "fulfillmentCenterId");
            return (Criteria) this;
        }

        public Criteria andFulfillmentCenterIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fulfillment_center_id not between", value1, value2, "fulfillmentCenterId");
            return (Criteria) this;
        }

        public Criteria andConditionTypeIsNull() {
            addCriterion("condition_type is null");
            return (Criteria) this;
        }

        public Criteria andConditionTypeIsNotNull() {
            addCriterion("condition_type is not null");
            return (Criteria) this;
        }

        public Criteria andConditionTypeEqualTo(String value) {
            addCriterion("condition_type =", value, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeNotEqualTo(String value) {
            addCriterion("condition_type <>", value, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeGreaterThan(String value) {
            addCriterion("condition_type >", value, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("condition_type >=", value, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeLessThan(String value) {
            addCriterion("condition_type <", value, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeLessThanOrEqualTo(String value) {
            addCriterion("condition_type <=", value, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeLike(String value) {
            addCriterion("condition_type like", value, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeNotLike(String value) {
            addCriterion("condition_type not like", value, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeIn(List<String> values) {
            addCriterion("condition_type in", values, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeNotIn(List<String> values) {
            addCriterion("condition_type not in", values, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeBetween(String value1, String value2) {
            addCriterion("condition_type between", value1, value2, "conditionType");
            return (Criteria) this;
        }

        public Criteria andConditionTypeNotBetween(String value1, String value2) {
            addCriterion("condition_type not between", value1, value2, "conditionType");
            return (Criteria) this;
        }

        public Criteria andUpdateDeleteIsNull() {
            addCriterion("update_delete is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDeleteIsNotNull() {
            addCriterion("update_delete is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDeleteEqualTo(String value) {
            addCriterion("update_delete =", value, "updateDelete");
            return (Criteria) this;
        }

        public Criteria andUpdateDeleteNotEqualTo(String value) {
            addCriterion("update_delete <>", value, "updateDelete");
            return (Criteria) this;
        }

        public Criteria andUpdateDeleteGreaterThan(String value) {
            addCriterion("update_delete >", value, "updateDelete");
            return (Criteria) this;
        }

        public Criteria andUpdateDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("update_delete >=", value, "updateDelete");
            return (Criteria) this;
        }

        public Criteria andUpdateDeleteLessThan(String value) {
            addCriterion("update_delete <", value, "updateDelete");
            return (Criteria) this;
        }

        public Criteria andUpdateDeleteLessThanOrEqualTo(String value) {
            addCriterion("update_delete <=", value, "updateDelete");
            return (Criteria) this;
        }

        public Criteria andUpdateDeleteLike(String value) {
            addCriterion("update_delete like", value, "updateDelete");
            return (Criteria) this;
        }

        public Criteria andUpdateDeleteNotLike(String value) {
            addCriterion("update_delete not like", value, "updateDelete");
            return (Criteria) this;
        }

        public Criteria andUpdateDeleteIn(List<String> values) {
            addCriterion("update_delete in", values, "updateDelete");
            return (Criteria) this;
        }

        public Criteria andUpdateDeleteNotIn(List<String> values) {
            addCriterion("update_delete not in", values, "updateDelete");
            return (Criteria) this;
        }

        public Criteria andUpdateDeleteBetween(String value1, String value2) {
            addCriterion("update_delete between", value1, value2, "updateDelete");
            return (Criteria) this;
        }

        public Criteria andUpdateDeleteNotBetween(String value1, String value2) {
            addCriterion("update_delete not between", value1, value2, "updateDelete");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlIsNull() {
            addCriterion("main_image_url is null");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlIsNotNull() {
            addCriterion("main_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlEqualTo(String value) {
            addCriterion("main_image_url =", value, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlNotEqualTo(String value) {
            addCriterion("main_image_url <>", value, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlGreaterThan(String value) {
            addCriterion("main_image_url >", value, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("main_image_url >=", value, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlLessThan(String value) {
            addCriterion("main_image_url <", value, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlLessThanOrEqualTo(String value) {
            addCriterion("main_image_url <=", value, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlLike(String value) {
            addCriterion("main_image_url like", value, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlNotLike(String value) {
            addCriterion("main_image_url not like", value, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlIn(List<String> values) {
            addCriterion("main_image_url in", values, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlNotIn(List<String> values) {
            addCriterion("main_image_url not in", values, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlBetween(String value1, String value2) {
            addCriterion("main_image_url between", value1, value2, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andMainImageUrlNotBetween(String value1, String value2) {
            addCriterion("main_image_url not between", value1, value2, "mainImageUrl");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl1IsNull() {
            addCriterion("other_image_url1 is null");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl1IsNotNull() {
            addCriterion("other_image_url1 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl1EqualTo(String value) {
            addCriterion("other_image_url1 =", value, "otherImageUrl1");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl1NotEqualTo(String value) {
            addCriterion("other_image_url1 <>", value, "otherImageUrl1");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl1GreaterThan(String value) {
            addCriterion("other_image_url1 >", value, "otherImageUrl1");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl1GreaterThanOrEqualTo(String value) {
            addCriterion("other_image_url1 >=", value, "otherImageUrl1");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl1LessThan(String value) {
            addCriterion("other_image_url1 <", value, "otherImageUrl1");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl1LessThanOrEqualTo(String value) {
            addCriterion("other_image_url1 <=", value, "otherImageUrl1");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl1Like(String value) {
            addCriterion("other_image_url1 like", value, "otherImageUrl1");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl1NotLike(String value) {
            addCriterion("other_image_url1 not like", value, "otherImageUrl1");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl1In(List<String> values) {
            addCriterion("other_image_url1 in", values, "otherImageUrl1");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl1NotIn(List<String> values) {
            addCriterion("other_image_url1 not in", values, "otherImageUrl1");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl1Between(String value1, String value2) {
            addCriterion("other_image_url1 between", value1, value2, "otherImageUrl1");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl1NotBetween(String value1, String value2) {
            addCriterion("other_image_url1 not between", value1, value2, "otherImageUrl1");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl2IsNull() {
            addCriterion("other_image_url2 is null");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl2IsNotNull() {
            addCriterion("other_image_url2 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl2EqualTo(String value) {
            addCriterion("other_image_url2 =", value, "otherImageUrl2");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl2NotEqualTo(String value) {
            addCriterion("other_image_url2 <>", value, "otherImageUrl2");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl2GreaterThan(String value) {
            addCriterion("other_image_url2 >", value, "otherImageUrl2");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl2GreaterThanOrEqualTo(String value) {
            addCriterion("other_image_url2 >=", value, "otherImageUrl2");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl2LessThan(String value) {
            addCriterion("other_image_url2 <", value, "otherImageUrl2");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl2LessThanOrEqualTo(String value) {
            addCriterion("other_image_url2 <=", value, "otherImageUrl2");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl2Like(String value) {
            addCriterion("other_image_url2 like", value, "otherImageUrl2");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl2NotLike(String value) {
            addCriterion("other_image_url2 not like", value, "otherImageUrl2");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl2In(List<String> values) {
            addCriterion("other_image_url2 in", values, "otherImageUrl2");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl2NotIn(List<String> values) {
            addCriterion("other_image_url2 not in", values, "otherImageUrl2");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl2Between(String value1, String value2) {
            addCriterion("other_image_url2 between", value1, value2, "otherImageUrl2");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl2NotBetween(String value1, String value2) {
            addCriterion("other_image_url2 not between", value1, value2, "otherImageUrl2");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl3IsNull() {
            addCriterion("other_image_url3 is null");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl3IsNotNull() {
            addCriterion("other_image_url3 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl3EqualTo(String value) {
            addCriterion("other_image_url3 =", value, "otherImageUrl3");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl3NotEqualTo(String value) {
            addCriterion("other_image_url3 <>", value, "otherImageUrl3");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl3GreaterThan(String value) {
            addCriterion("other_image_url3 >", value, "otherImageUrl3");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl3GreaterThanOrEqualTo(String value) {
            addCriterion("other_image_url3 >=", value, "otherImageUrl3");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl3LessThan(String value) {
            addCriterion("other_image_url3 <", value, "otherImageUrl3");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl3LessThanOrEqualTo(String value) {
            addCriterion("other_image_url3 <=", value, "otherImageUrl3");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl3Like(String value) {
            addCriterion("other_image_url3 like", value, "otherImageUrl3");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl3NotLike(String value) {
            addCriterion("other_image_url3 not like", value, "otherImageUrl3");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl3In(List<String> values) {
            addCriterion("other_image_url3 in", values, "otherImageUrl3");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl3NotIn(List<String> values) {
            addCriterion("other_image_url3 not in", values, "otherImageUrl3");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl3Between(String value1, String value2) {
            addCriterion("other_image_url3 between", value1, value2, "otherImageUrl3");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl3NotBetween(String value1, String value2) {
            addCriterion("other_image_url3 not between", value1, value2, "otherImageUrl3");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl4IsNull() {
            addCriterion("other_image_url4 is null");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl4IsNotNull() {
            addCriterion("other_image_url4 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl4EqualTo(String value) {
            addCriterion("other_image_url4 =", value, "otherImageUrl4");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl4NotEqualTo(String value) {
            addCriterion("other_image_url4 <>", value, "otherImageUrl4");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl4GreaterThan(String value) {
            addCriterion("other_image_url4 >", value, "otherImageUrl4");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl4GreaterThanOrEqualTo(String value) {
            addCriterion("other_image_url4 >=", value, "otherImageUrl4");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl4LessThan(String value) {
            addCriterion("other_image_url4 <", value, "otherImageUrl4");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl4LessThanOrEqualTo(String value) {
            addCriterion("other_image_url4 <=", value, "otherImageUrl4");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl4Like(String value) {
            addCriterion("other_image_url4 like", value, "otherImageUrl4");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl4NotLike(String value) {
            addCriterion("other_image_url4 not like", value, "otherImageUrl4");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl4In(List<String> values) {
            addCriterion("other_image_url4 in", values, "otherImageUrl4");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl4NotIn(List<String> values) {
            addCriterion("other_image_url4 not in", values, "otherImageUrl4");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl4Between(String value1, String value2) {
            addCriterion("other_image_url4 between", value1, value2, "otherImageUrl4");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl4NotBetween(String value1, String value2) {
            addCriterion("other_image_url4 not between", value1, value2, "otherImageUrl4");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl5IsNull() {
            addCriterion("other_image_url5 is null");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl5IsNotNull() {
            addCriterion("other_image_url5 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl5EqualTo(String value) {
            addCriterion("other_image_url5 =", value, "otherImageUrl5");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl5NotEqualTo(String value) {
            addCriterion("other_image_url5 <>", value, "otherImageUrl5");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl5GreaterThan(String value) {
            addCriterion("other_image_url5 >", value, "otherImageUrl5");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl5GreaterThanOrEqualTo(String value) {
            addCriterion("other_image_url5 >=", value, "otherImageUrl5");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl5LessThan(String value) {
            addCriterion("other_image_url5 <", value, "otherImageUrl5");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl5LessThanOrEqualTo(String value) {
            addCriterion("other_image_url5 <=", value, "otherImageUrl5");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl5Like(String value) {
            addCriterion("other_image_url5 like", value, "otherImageUrl5");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl5NotLike(String value) {
            addCriterion("other_image_url5 not like", value, "otherImageUrl5");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl5In(List<String> values) {
            addCriterion("other_image_url5 in", values, "otherImageUrl5");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl5NotIn(List<String> values) {
            addCriterion("other_image_url5 not in", values, "otherImageUrl5");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl5Between(String value1, String value2) {
            addCriterion("other_image_url5 between", value1, value2, "otherImageUrl5");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl5NotBetween(String value1, String value2) {
            addCriterion("other_image_url5 not between", value1, value2, "otherImageUrl5");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl6IsNull() {
            addCriterion("other_image_url6 is null");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl6IsNotNull() {
            addCriterion("other_image_url6 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl6EqualTo(String value) {
            addCriterion("other_image_url6 =", value, "otherImageUrl6");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl6NotEqualTo(String value) {
            addCriterion("other_image_url6 <>", value, "otherImageUrl6");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl6GreaterThan(String value) {
            addCriterion("other_image_url6 >", value, "otherImageUrl6");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl6GreaterThanOrEqualTo(String value) {
            addCriterion("other_image_url6 >=", value, "otherImageUrl6");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl6LessThan(String value) {
            addCriterion("other_image_url6 <", value, "otherImageUrl6");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl6LessThanOrEqualTo(String value) {
            addCriterion("other_image_url6 <=", value, "otherImageUrl6");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl6Like(String value) {
            addCriterion("other_image_url6 like", value, "otherImageUrl6");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl6NotLike(String value) {
            addCriterion("other_image_url6 not like", value, "otherImageUrl6");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl6In(List<String> values) {
            addCriterion("other_image_url6 in", values, "otherImageUrl6");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl6NotIn(List<String> values) {
            addCriterion("other_image_url6 not in", values, "otherImageUrl6");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl6Between(String value1, String value2) {
            addCriterion("other_image_url6 between", value1, value2, "otherImageUrl6");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl6NotBetween(String value1, String value2) {
            addCriterion("other_image_url6 not between", value1, value2, "otherImageUrl6");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl7IsNull() {
            addCriterion("other_image_url7 is null");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl7IsNotNull() {
            addCriterion("other_image_url7 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl7EqualTo(String value) {
            addCriterion("other_image_url7 =", value, "otherImageUrl7");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl7NotEqualTo(String value) {
            addCriterion("other_image_url7 <>", value, "otherImageUrl7");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl7GreaterThan(String value) {
            addCriterion("other_image_url7 >", value, "otherImageUrl7");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl7GreaterThanOrEqualTo(String value) {
            addCriterion("other_image_url7 >=", value, "otherImageUrl7");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl7LessThan(String value) {
            addCriterion("other_image_url7 <", value, "otherImageUrl7");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl7LessThanOrEqualTo(String value) {
            addCriterion("other_image_url7 <=", value, "otherImageUrl7");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl7Like(String value) {
            addCriterion("other_image_url7 like", value, "otherImageUrl7");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl7NotLike(String value) {
            addCriterion("other_image_url7 not like", value, "otherImageUrl7");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl7In(List<String> values) {
            addCriterion("other_image_url7 in", values, "otherImageUrl7");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl7NotIn(List<String> values) {
            addCriterion("other_image_url7 not in", values, "otherImageUrl7");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl7Between(String value1, String value2) {
            addCriterion("other_image_url7 between", value1, value2, "otherImageUrl7");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl7NotBetween(String value1, String value2) {
            addCriterion("other_image_url7 not between", value1, value2, "otherImageUrl7");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl8IsNull() {
            addCriterion("other_image_url8 is null");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl8IsNotNull() {
            addCriterion("other_image_url8 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl8EqualTo(String value) {
            addCriterion("other_image_url8 =", value, "otherImageUrl8");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl8NotEqualTo(String value) {
            addCriterion("other_image_url8 <>", value, "otherImageUrl8");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl8GreaterThan(String value) {
            addCriterion("other_image_url8 >", value, "otherImageUrl8");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl8GreaterThanOrEqualTo(String value) {
            addCriterion("other_image_url8 >=", value, "otherImageUrl8");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl8LessThan(String value) {
            addCriterion("other_image_url8 <", value, "otherImageUrl8");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl8LessThanOrEqualTo(String value) {
            addCriterion("other_image_url8 <=", value, "otherImageUrl8");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl8Like(String value) {
            addCriterion("other_image_url8 like", value, "otherImageUrl8");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl8NotLike(String value) {
            addCriterion("other_image_url8 not like", value, "otherImageUrl8");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl8In(List<String> values) {
            addCriterion("other_image_url8 in", values, "otherImageUrl8");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl8NotIn(List<String> values) {
            addCriterion("other_image_url8 not in", values, "otherImageUrl8");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl8Between(String value1, String value2) {
            addCriterion("other_image_url8 between", value1, value2, "otherImageUrl8");
            return (Criteria) this;
        }

        public Criteria andOtherImageUrl8NotBetween(String value1, String value2) {
            addCriterion("other_image_url8 not between", value1, value2, "otherImageUrl8");
            return (Criteria) this;
        }

        public Criteria andVideoIsNull() {
            addCriterion("video is null");
            return (Criteria) this;
        }

        public Criteria andVideoIsNotNull() {
            addCriterion("video is not null");
            return (Criteria) this;
        }

        public Criteria andVideoEqualTo(String value) {
            addCriterion("video =", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotEqualTo(String value) {
            addCriterion("video <>", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThan(String value) {
            addCriterion("video >", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThanOrEqualTo(String value) {
            addCriterion("video >=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThan(String value) {
            addCriterion("video <", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThanOrEqualTo(String value) {
            addCriterion("video <=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLike(String value) {
            addCriterion("video like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotLike(String value) {
            addCriterion("video not like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoIn(List<String> values) {
            addCriterion("video in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotIn(List<String> values) {
            addCriterion("video not in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoBetween(String value1, String value2) {
            addCriterion("video between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotBetween(String value1, String value2) {
            addCriterion("video not between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andInstructionIsNull() {
            addCriterion("instruction is null");
            return (Criteria) this;
        }

        public Criteria andInstructionIsNotNull() {
            addCriterion("instruction is not null");
            return (Criteria) this;
        }

        public Criteria andInstructionEqualTo(String value) {
            addCriterion("instruction =", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotEqualTo(String value) {
            addCriterion("instruction <>", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionGreaterThan(String value) {
            addCriterion("instruction >", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionGreaterThanOrEqualTo(String value) {
            addCriterion("instruction >=", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionLessThan(String value) {
            addCriterion("instruction <", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionLessThanOrEqualTo(String value) {
            addCriterion("instruction <=", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionLike(String value) {
            addCriterion("instruction like", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotLike(String value) {
            addCriterion("instruction not like", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionIn(List<String> values) {
            addCriterion("instruction in", values, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotIn(List<String> values) {
            addCriterion("instruction not in", values, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionBetween(String value1, String value2) {
            addCriterion("instruction between", value1, value2, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotBetween(String value1, String value2) {
            addCriterion("instruction not between", value1, value2, "instruction");
            return (Criteria) this;
        }

        public Criteria andDriverIsNull() {
            addCriterion("driver is null");
            return (Criteria) this;
        }

        public Criteria andDriverIsNotNull() {
            addCriterion("driver is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEqualTo(String value) {
            addCriterion("driver =", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotEqualTo(String value) {
            addCriterion("driver <>", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThan(String value) {
            addCriterion("driver >", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThanOrEqualTo(String value) {
            addCriterion("driver >=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThan(String value) {
            addCriterion("driver <", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThanOrEqualTo(String value) {
            addCriterion("driver <=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLike(String value) {
            addCriterion("driver like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotLike(String value) {
            addCriterion("driver not like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverIn(List<String> values) {
            addCriterion("driver in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotIn(List<String> values) {
            addCriterion("driver not in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverBetween(String value1, String value2) {
            addCriterion("driver between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotBetween(String value1, String value2) {
            addCriterion("driver not between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andListPriceIsNull() {
            addCriterion("list_price is null");
            return (Criteria) this;
        }

        public Criteria andListPriceIsNotNull() {
            addCriterion("list_price is not null");
            return (Criteria) this;
        }

        public Criteria andListPriceEqualTo(BigDecimal value) {
            addCriterion("list_price =", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceNotEqualTo(BigDecimal value) {
            addCriterion("list_price <>", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceGreaterThan(BigDecimal value) {
            addCriterion("list_price >", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("list_price >=", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceLessThan(BigDecimal value) {
            addCriterion("list_price <", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("list_price <=", value, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceIn(List<BigDecimal> values) {
            addCriterion("list_price in", values, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceNotIn(List<BigDecimal> values) {
            addCriterion("list_price not in", values, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("list_price between", value1, value2, "listPrice");
            return (Criteria) this;
        }

        public Criteria andListPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("list_price not between", value1, value2, "listPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceIsNull() {
            addCriterion("standard_price is null");
            return (Criteria) this;
        }

        public Criteria andStandardPriceIsNotNull() {
            addCriterion("standard_price is not null");
            return (Criteria) this;
        }

        public Criteria andStandardPriceEqualTo(BigDecimal value) {
            addCriterion("standard_price =", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceNotEqualTo(BigDecimal value) {
            addCriterion("standard_price <>", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceGreaterThan(BigDecimal value) {
            addCriterion("standard_price >", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_price >=", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceLessThan(BigDecimal value) {
            addCriterion("standard_price <", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_price <=", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceIn(List<BigDecimal> values) {
            addCriterion("standard_price in", values, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceNotIn(List<BigDecimal> values) {
            addCriterion("standard_price not in", values, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standard_price between", value1, value2, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standard_price not between", value1, value2, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNull() {
            addCriterion("sale_price is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(BigDecimal value) {
            addCriterion("sale_price =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(BigDecimal value) {
            addCriterion("sale_price <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(BigDecimal value) {
            addCriterion("sale_price >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_price >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(BigDecimal value) {
            addCriterion("sale_price <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_price <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<BigDecimal> values) {
            addCriterion("sale_price in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<BigDecimal> values) {
            addCriterion("sale_price not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_price between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_price not between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andFbaFeeIsNull() {
            addCriterion("fba_fee is null");
            return (Criteria) this;
        }

        public Criteria andFbaFeeIsNotNull() {
            addCriterion("fba_fee is not null");
            return (Criteria) this;
        }

        public Criteria andFbaFeeEqualTo(BigDecimal value) {
            addCriterion("fba_fee =", value, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andFbaFeeNotEqualTo(BigDecimal value) {
            addCriterion("fba_fee <>", value, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andFbaFeeGreaterThan(BigDecimal value) {
            addCriterion("fba_fee >", value, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andFbaFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fba_fee >=", value, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andFbaFeeLessThan(BigDecimal value) {
            addCriterion("fba_fee <", value, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andFbaFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fba_fee <=", value, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andFbaFeeIn(List<BigDecimal> values) {
            addCriterion("fba_fee in", values, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andFbaFeeNotIn(List<BigDecimal> values) {
            addCriterion("fba_fee not in", values, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andFbaFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fba_fee between", value1, value2, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andFbaFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fba_fee not between", value1, value2, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andSaleFromDateIsNull() {
            addCriterion("sale_from_date is null");
            return (Criteria) this;
        }

        public Criteria andSaleFromDateIsNotNull() {
            addCriterion("sale_from_date is not null");
            return (Criteria) this;
        }

        public Criteria andSaleFromDateEqualTo(Date value) {
            addCriterion("sale_from_date =", value, "saleFromDate");
            return (Criteria) this;
        }

        public Criteria andSaleFromDateNotEqualTo(Date value) {
            addCriterion("sale_from_date <>", value, "saleFromDate");
            return (Criteria) this;
        }

        public Criteria andSaleFromDateGreaterThan(Date value) {
            addCriterion("sale_from_date >", value, "saleFromDate");
            return (Criteria) this;
        }

        public Criteria andSaleFromDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sale_from_date >=", value, "saleFromDate");
            return (Criteria) this;
        }

        public Criteria andSaleFromDateLessThan(Date value) {
            addCriterion("sale_from_date <", value, "saleFromDate");
            return (Criteria) this;
        }

        public Criteria andSaleFromDateLessThanOrEqualTo(Date value) {
            addCriterion("sale_from_date <=", value, "saleFromDate");
            return (Criteria) this;
        }

        public Criteria andSaleFromDateIn(List<Date> values) {
            addCriterion("sale_from_date in", values, "saleFromDate");
            return (Criteria) this;
        }

        public Criteria andSaleFromDateNotIn(List<Date> values) {
            addCriterion("sale_from_date not in", values, "saleFromDate");
            return (Criteria) this;
        }

        public Criteria andSaleFromDateBetween(Date value1, Date value2) {
            addCriterion("sale_from_date between", value1, value2, "saleFromDate");
            return (Criteria) this;
        }

        public Criteria andSaleFromDateNotBetween(Date value1, Date value2) {
            addCriterion("sale_from_date not between", value1, value2, "saleFromDate");
            return (Criteria) this;
        }

        public Criteria andSaleEndDateIsNull() {
            addCriterion("sale_end_date is null");
            return (Criteria) this;
        }

        public Criteria andSaleEndDateIsNotNull() {
            addCriterion("sale_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andSaleEndDateEqualTo(Date value) {
            addCriterion("sale_end_date =", value, "saleEndDate");
            return (Criteria) this;
        }

        public Criteria andSaleEndDateNotEqualTo(Date value) {
            addCriterion("sale_end_date <>", value, "saleEndDate");
            return (Criteria) this;
        }

        public Criteria andSaleEndDateGreaterThan(Date value) {
            addCriterion("sale_end_date >", value, "saleEndDate");
            return (Criteria) this;
        }

        public Criteria andSaleEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sale_end_date >=", value, "saleEndDate");
            return (Criteria) this;
        }

        public Criteria andSaleEndDateLessThan(Date value) {
            addCriterion("sale_end_date <", value, "saleEndDate");
            return (Criteria) this;
        }

        public Criteria andSaleEndDateLessThanOrEqualTo(Date value) {
            addCriterion("sale_end_date <=", value, "saleEndDate");
            return (Criteria) this;
        }

        public Criteria andSaleEndDateIn(List<Date> values) {
            addCriterion("sale_end_date in", values, "saleEndDate");
            return (Criteria) this;
        }

        public Criteria andSaleEndDateNotIn(List<Date> values) {
            addCriterion("sale_end_date not in", values, "saleEndDate");
            return (Criteria) this;
        }

        public Criteria andSaleEndDateBetween(Date value1, Date value2) {
            addCriterion("sale_end_date between", value1, value2, "saleEndDate");
            return (Criteria) this;
        }

        public Criteria andSaleEndDateNotBetween(Date value1, Date value2) {
            addCriterion("sale_end_date not between", value1, value2, "saleEndDate");
            return (Criteria) this;
        }

        public Criteria andItemWeightIsNull() {
            addCriterion("item_weight is null");
            return (Criteria) this;
        }

        public Criteria andItemWeightIsNotNull() {
            addCriterion("item_weight is not null");
            return (Criteria) this;
        }

        public Criteria andItemWeightEqualTo(BigDecimal value) {
            addCriterion("item_weight =", value, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightNotEqualTo(BigDecimal value) {
            addCriterion("item_weight <>", value, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightGreaterThan(BigDecimal value) {
            addCriterion("item_weight >", value, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("item_weight >=", value, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightLessThan(BigDecimal value) {
            addCriterion("item_weight <", value, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("item_weight <=", value, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightIn(List<BigDecimal> values) {
            addCriterion("item_weight in", values, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightNotIn(List<BigDecimal> values) {
            addCriterion("item_weight not in", values, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_weight between", value1, value2, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_weight not between", value1, value2, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightUnitOfMeasureIsNull() {
            addCriterion("item_weight_unit_of_measure is null");
            return (Criteria) this;
        }

        public Criteria andItemWeightUnitOfMeasureIsNotNull() {
            addCriterion("item_weight_unit_of_measure is not null");
            return (Criteria) this;
        }

        public Criteria andItemWeightUnitOfMeasureEqualTo(String value) {
            addCriterion("item_weight_unit_of_measure =", value, "itemWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemWeightUnitOfMeasureNotEqualTo(String value) {
            addCriterion("item_weight_unit_of_measure <>", value, "itemWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemWeightUnitOfMeasureGreaterThan(String value) {
            addCriterion("item_weight_unit_of_measure >", value, "itemWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemWeightUnitOfMeasureGreaterThanOrEqualTo(String value) {
            addCriterion("item_weight_unit_of_measure >=", value, "itemWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemWeightUnitOfMeasureLessThan(String value) {
            addCriterion("item_weight_unit_of_measure <", value, "itemWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemWeightUnitOfMeasureLessThanOrEqualTo(String value) {
            addCriterion("item_weight_unit_of_measure <=", value, "itemWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemWeightUnitOfMeasureLike(String value) {
            addCriterion("item_weight_unit_of_measure like", value, "itemWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemWeightUnitOfMeasureNotLike(String value) {
            addCriterion("item_weight_unit_of_measure not like", value, "itemWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemWeightUnitOfMeasureIn(List<String> values) {
            addCriterion("item_weight_unit_of_measure in", values, "itemWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemWeightUnitOfMeasureNotIn(List<String> values) {
            addCriterion("item_weight_unit_of_measure not in", values, "itemWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemWeightUnitOfMeasureBetween(String value1, String value2) {
            addCriterion("item_weight_unit_of_measure between", value1, value2, "itemWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemWeightUnitOfMeasureNotBetween(String value1, String value2) {
            addCriterion("item_weight_unit_of_measure not between", value1, value2, "itemWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemLengthIsNull() {
            addCriterion("item_length is null");
            return (Criteria) this;
        }

        public Criteria andItemLengthIsNotNull() {
            addCriterion("item_length is not null");
            return (Criteria) this;
        }

        public Criteria andItemLengthEqualTo(BigDecimal value) {
            addCriterion("item_length =", value, "itemLength");
            return (Criteria) this;
        }

        public Criteria andItemLengthNotEqualTo(BigDecimal value) {
            addCriterion("item_length <>", value, "itemLength");
            return (Criteria) this;
        }

        public Criteria andItemLengthGreaterThan(BigDecimal value) {
            addCriterion("item_length >", value, "itemLength");
            return (Criteria) this;
        }

        public Criteria andItemLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("item_length >=", value, "itemLength");
            return (Criteria) this;
        }

        public Criteria andItemLengthLessThan(BigDecimal value) {
            addCriterion("item_length <", value, "itemLength");
            return (Criteria) this;
        }

        public Criteria andItemLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("item_length <=", value, "itemLength");
            return (Criteria) this;
        }

        public Criteria andItemLengthIn(List<BigDecimal> values) {
            addCriterion("item_length in", values, "itemLength");
            return (Criteria) this;
        }

        public Criteria andItemLengthNotIn(List<BigDecimal> values) {
            addCriterion("item_length not in", values, "itemLength");
            return (Criteria) this;
        }

        public Criteria andItemLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_length between", value1, value2, "itemLength");
            return (Criteria) this;
        }

        public Criteria andItemLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_length not between", value1, value2, "itemLength");
            return (Criteria) this;
        }

        public Criteria andItemWidthIsNull() {
            addCriterion("item_width is null");
            return (Criteria) this;
        }

        public Criteria andItemWidthIsNotNull() {
            addCriterion("item_width is not null");
            return (Criteria) this;
        }

        public Criteria andItemWidthEqualTo(BigDecimal value) {
            addCriterion("item_width =", value, "itemWidth");
            return (Criteria) this;
        }

        public Criteria andItemWidthNotEqualTo(BigDecimal value) {
            addCriterion("item_width <>", value, "itemWidth");
            return (Criteria) this;
        }

        public Criteria andItemWidthGreaterThan(BigDecimal value) {
            addCriterion("item_width >", value, "itemWidth");
            return (Criteria) this;
        }

        public Criteria andItemWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("item_width >=", value, "itemWidth");
            return (Criteria) this;
        }

        public Criteria andItemWidthLessThan(BigDecimal value) {
            addCriterion("item_width <", value, "itemWidth");
            return (Criteria) this;
        }

        public Criteria andItemWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("item_width <=", value, "itemWidth");
            return (Criteria) this;
        }

        public Criteria andItemWidthIn(List<BigDecimal> values) {
            addCriterion("item_width in", values, "itemWidth");
            return (Criteria) this;
        }

        public Criteria andItemWidthNotIn(List<BigDecimal> values) {
            addCriterion("item_width not in", values, "itemWidth");
            return (Criteria) this;
        }

        public Criteria andItemWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_width between", value1, value2, "itemWidth");
            return (Criteria) this;
        }

        public Criteria andItemWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_width not between", value1, value2, "itemWidth");
            return (Criteria) this;
        }

        public Criteria andItemHeightIsNull() {
            addCriterion("item_height is null");
            return (Criteria) this;
        }

        public Criteria andItemHeightIsNotNull() {
            addCriterion("item_height is not null");
            return (Criteria) this;
        }

        public Criteria andItemHeightEqualTo(BigDecimal value) {
            addCriterion("item_height =", value, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightNotEqualTo(BigDecimal value) {
            addCriterion("item_height <>", value, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightGreaterThan(BigDecimal value) {
            addCriterion("item_height >", value, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("item_height >=", value, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightLessThan(BigDecimal value) {
            addCriterion("item_height <", value, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("item_height <=", value, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightIn(List<BigDecimal> values) {
            addCriterion("item_height in", values, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightNotIn(List<BigDecimal> values) {
            addCriterion("item_height not in", values, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_height between", value1, value2, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_height not between", value1, value2, "itemHeight");
            return (Criteria) this;
        }

        public Criteria andItemLengthUnitOfMeasureIsNull() {
            addCriterion("item_length_unit_of_measure is null");
            return (Criteria) this;
        }

        public Criteria andItemLengthUnitOfMeasureIsNotNull() {
            addCriterion("item_length_unit_of_measure is not null");
            return (Criteria) this;
        }

        public Criteria andItemLengthUnitOfMeasureEqualTo(String value) {
            addCriterion("item_length_unit_of_measure =", value, "itemLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemLengthUnitOfMeasureNotEqualTo(String value) {
            addCriterion("item_length_unit_of_measure <>", value, "itemLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemLengthUnitOfMeasureGreaterThan(String value) {
            addCriterion("item_length_unit_of_measure >", value, "itemLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemLengthUnitOfMeasureGreaterThanOrEqualTo(String value) {
            addCriterion("item_length_unit_of_measure >=", value, "itemLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemLengthUnitOfMeasureLessThan(String value) {
            addCriterion("item_length_unit_of_measure <", value, "itemLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemLengthUnitOfMeasureLessThanOrEqualTo(String value) {
            addCriterion("item_length_unit_of_measure <=", value, "itemLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemLengthUnitOfMeasureLike(String value) {
            addCriterion("item_length_unit_of_measure like", value, "itemLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemLengthUnitOfMeasureNotLike(String value) {
            addCriterion("item_length_unit_of_measure not like", value, "itemLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemLengthUnitOfMeasureIn(List<String> values) {
            addCriterion("item_length_unit_of_measure in", values, "itemLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemLengthUnitOfMeasureNotIn(List<String> values) {
            addCriterion("item_length_unit_of_measure not in", values, "itemLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemLengthUnitOfMeasureBetween(String value1, String value2) {
            addCriterion("item_length_unit_of_measure between", value1, value2, "itemLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andItemLengthUnitOfMeasureNotBetween(String value1, String value2) {
            addCriterion("item_length_unit_of_measure not between", value1, value2, "itemLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageWeightIsNull() {
            addCriterion("package_weight is null");
            return (Criteria) this;
        }

        public Criteria andPackageWeightIsNotNull() {
            addCriterion("package_weight is not null");
            return (Criteria) this;
        }

        public Criteria andPackageWeightEqualTo(BigDecimal value) {
            addCriterion("package_weight =", value, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightNotEqualTo(BigDecimal value) {
            addCriterion("package_weight <>", value, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightGreaterThan(BigDecimal value) {
            addCriterion("package_weight >", value, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("package_weight >=", value, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightLessThan(BigDecimal value) {
            addCriterion("package_weight <", value, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("package_weight <=", value, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightIn(List<BigDecimal> values) {
            addCriterion("package_weight in", values, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightNotIn(List<BigDecimal> values) {
            addCriterion("package_weight not in", values, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_weight between", value1, value2, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_weight not between", value1, value2, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightUnitOfMeasureIsNull() {
            addCriterion("package_weight_unit_of_measure is null");
            return (Criteria) this;
        }

        public Criteria andPackageWeightUnitOfMeasureIsNotNull() {
            addCriterion("package_weight_unit_of_measure is not null");
            return (Criteria) this;
        }

        public Criteria andPackageWeightUnitOfMeasureEqualTo(String value) {
            addCriterion("package_weight_unit_of_measure =", value, "packageWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageWeightUnitOfMeasureNotEqualTo(String value) {
            addCriterion("package_weight_unit_of_measure <>", value, "packageWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageWeightUnitOfMeasureGreaterThan(String value) {
            addCriterion("package_weight_unit_of_measure >", value, "packageWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageWeightUnitOfMeasureGreaterThanOrEqualTo(String value) {
            addCriterion("package_weight_unit_of_measure >=", value, "packageWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageWeightUnitOfMeasureLessThan(String value) {
            addCriterion("package_weight_unit_of_measure <", value, "packageWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageWeightUnitOfMeasureLessThanOrEqualTo(String value) {
            addCriterion("package_weight_unit_of_measure <=", value, "packageWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageWeightUnitOfMeasureLike(String value) {
            addCriterion("package_weight_unit_of_measure like", value, "packageWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageWeightUnitOfMeasureNotLike(String value) {
            addCriterion("package_weight_unit_of_measure not like", value, "packageWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageWeightUnitOfMeasureIn(List<String> values) {
            addCriterion("package_weight_unit_of_measure in", values, "packageWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageWeightUnitOfMeasureNotIn(List<String> values) {
            addCriterion("package_weight_unit_of_measure not in", values, "packageWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageWeightUnitOfMeasureBetween(String value1, String value2) {
            addCriterion("package_weight_unit_of_measure between", value1, value2, "packageWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageWeightUnitOfMeasureNotBetween(String value1, String value2) {
            addCriterion("package_weight_unit_of_measure not between", value1, value2, "packageWeightUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageLengthIsNull() {
            addCriterion("package_length is null");
            return (Criteria) this;
        }

        public Criteria andPackageLengthIsNotNull() {
            addCriterion("package_length is not null");
            return (Criteria) this;
        }

        public Criteria andPackageLengthEqualTo(BigDecimal value) {
            addCriterion("package_length =", value, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageLengthNotEqualTo(BigDecimal value) {
            addCriterion("package_length <>", value, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageLengthGreaterThan(BigDecimal value) {
            addCriterion("package_length >", value, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("package_length >=", value, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageLengthLessThan(BigDecimal value) {
            addCriterion("package_length <", value, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("package_length <=", value, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageLengthIn(List<BigDecimal> values) {
            addCriterion("package_length in", values, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageLengthNotIn(List<BigDecimal> values) {
            addCriterion("package_length not in", values, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_length between", value1, value2, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_length not between", value1, value2, "packageLength");
            return (Criteria) this;
        }

        public Criteria andPackageWidthIsNull() {
            addCriterion("package_width is null");
            return (Criteria) this;
        }

        public Criteria andPackageWidthIsNotNull() {
            addCriterion("package_width is not null");
            return (Criteria) this;
        }

        public Criteria andPackageWidthEqualTo(BigDecimal value) {
            addCriterion("package_width =", value, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthNotEqualTo(BigDecimal value) {
            addCriterion("package_width <>", value, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthGreaterThan(BigDecimal value) {
            addCriterion("package_width >", value, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("package_width >=", value, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthLessThan(BigDecimal value) {
            addCriterion("package_width <", value, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("package_width <=", value, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthIn(List<BigDecimal> values) {
            addCriterion("package_width in", values, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthNotIn(List<BigDecimal> values) {
            addCriterion("package_width not in", values, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_width between", value1, value2, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_width not between", value1, value2, "packageWidth");
            return (Criteria) this;
        }

        public Criteria andPackageHeightIsNull() {
            addCriterion("package_height is null");
            return (Criteria) this;
        }

        public Criteria andPackageHeightIsNotNull() {
            addCriterion("package_height is not null");
            return (Criteria) this;
        }

        public Criteria andPackageHeightEqualTo(BigDecimal value) {
            addCriterion("package_height =", value, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageHeightNotEqualTo(BigDecimal value) {
            addCriterion("package_height <>", value, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageHeightGreaterThan(BigDecimal value) {
            addCriterion("package_height >", value, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("package_height >=", value, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageHeightLessThan(BigDecimal value) {
            addCriterion("package_height <", value, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("package_height <=", value, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageHeightIn(List<BigDecimal> values) {
            addCriterion("package_height in", values, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageHeightNotIn(List<BigDecimal> values) {
            addCriterion("package_height not in", values, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_height between", value1, value2, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_height not between", value1, value2, "packageHeight");
            return (Criteria) this;
        }

        public Criteria andPackageLengthUnitOfMeasureIsNull() {
            addCriterion("package_length_unit_of_measure is null");
            return (Criteria) this;
        }

        public Criteria andPackageLengthUnitOfMeasureIsNotNull() {
            addCriterion("package_length_unit_of_measure is not null");
            return (Criteria) this;
        }

        public Criteria andPackageLengthUnitOfMeasureEqualTo(String value) {
            addCriterion("package_length_unit_of_measure =", value, "packageLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageLengthUnitOfMeasureNotEqualTo(String value) {
            addCriterion("package_length_unit_of_measure <>", value, "packageLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageLengthUnitOfMeasureGreaterThan(String value) {
            addCriterion("package_length_unit_of_measure >", value, "packageLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageLengthUnitOfMeasureGreaterThanOrEqualTo(String value) {
            addCriterion("package_length_unit_of_measure >=", value, "packageLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageLengthUnitOfMeasureLessThan(String value) {
            addCriterion("package_length_unit_of_measure <", value, "packageLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageLengthUnitOfMeasureLessThanOrEqualTo(String value) {
            addCriterion("package_length_unit_of_measure <=", value, "packageLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageLengthUnitOfMeasureLike(String value) {
            addCriterion("package_length_unit_of_measure like", value, "packageLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageLengthUnitOfMeasureNotLike(String value) {
            addCriterion("package_length_unit_of_measure not like", value, "packageLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageLengthUnitOfMeasureIn(List<String> values) {
            addCriterion("package_length_unit_of_measure in", values, "packageLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageLengthUnitOfMeasureNotIn(List<String> values) {
            addCriterion("package_length_unit_of_measure not in", values, "packageLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageLengthUnitOfMeasureBetween(String value1, String value2) {
            addCriterion("package_length_unit_of_measure between", value1, value2, "packageLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andPackageLengthUnitOfMeasureNotBetween(String value1, String value2) {
            addCriterion("package_length_unit_of_measure not between", value1, value2, "packageLengthUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthIsNull() {
            addCriterion("out_package_length is null");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthIsNotNull() {
            addCriterion("out_package_length is not null");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthEqualTo(BigDecimal value) {
            addCriterion("out_package_length =", value, "outPackageLength");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthNotEqualTo(BigDecimal value) {
            addCriterion("out_package_length <>", value, "outPackageLength");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthGreaterThan(BigDecimal value) {
            addCriterion("out_package_length >", value, "outPackageLength");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("out_package_length >=", value, "outPackageLength");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthLessThan(BigDecimal value) {
            addCriterion("out_package_length <", value, "outPackageLength");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("out_package_length <=", value, "outPackageLength");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthIn(List<BigDecimal> values) {
            addCriterion("out_package_length in", values, "outPackageLength");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthNotIn(List<BigDecimal> values) {
            addCriterion("out_package_length not in", values, "outPackageLength");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("out_package_length between", value1, value2, "outPackageLength");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("out_package_length not between", value1, value2, "outPackageLength");
            return (Criteria) this;
        }

        public Criteria andOutPackageWidthIsNull() {
            addCriterion("out_package_width is null");
            return (Criteria) this;
        }

        public Criteria andOutPackageWidthIsNotNull() {
            addCriterion("out_package_width is not null");
            return (Criteria) this;
        }

        public Criteria andOutPackageWidthEqualTo(BigDecimal value) {
            addCriterion("out_package_width =", value, "outPackageWidth");
            return (Criteria) this;
        }

        public Criteria andOutPackageWidthNotEqualTo(BigDecimal value) {
            addCriterion("out_package_width <>", value, "outPackageWidth");
            return (Criteria) this;
        }

        public Criteria andOutPackageWidthGreaterThan(BigDecimal value) {
            addCriterion("out_package_width >", value, "outPackageWidth");
            return (Criteria) this;
        }

        public Criteria andOutPackageWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("out_package_width >=", value, "outPackageWidth");
            return (Criteria) this;
        }

        public Criteria andOutPackageWidthLessThan(BigDecimal value) {
            addCriterion("out_package_width <", value, "outPackageWidth");
            return (Criteria) this;
        }

        public Criteria andOutPackageWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("out_package_width <=", value, "outPackageWidth");
            return (Criteria) this;
        }

        public Criteria andOutPackageWidthIn(List<BigDecimal> values) {
            addCriterion("out_package_width in", values, "outPackageWidth");
            return (Criteria) this;
        }

        public Criteria andOutPackageWidthNotIn(List<BigDecimal> values) {
            addCriterion("out_package_width not in", values, "outPackageWidth");
            return (Criteria) this;
        }

        public Criteria andOutPackageWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("out_package_width between", value1, value2, "outPackageWidth");
            return (Criteria) this;
        }

        public Criteria andOutPackageWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("out_package_width not between", value1, value2, "outPackageWidth");
            return (Criteria) this;
        }

        public Criteria andOutPackageHeightIsNull() {
            addCriterion("out_package_height is null");
            return (Criteria) this;
        }

        public Criteria andOutPackageHeightIsNotNull() {
            addCriterion("out_package_height is not null");
            return (Criteria) this;
        }

        public Criteria andOutPackageHeightEqualTo(BigDecimal value) {
            addCriterion("out_package_height =", value, "outPackageHeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageHeightNotEqualTo(BigDecimal value) {
            addCriterion("out_package_height <>", value, "outPackageHeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageHeightGreaterThan(BigDecimal value) {
            addCriterion("out_package_height >", value, "outPackageHeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("out_package_height >=", value, "outPackageHeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageHeightLessThan(BigDecimal value) {
            addCriterion("out_package_height <", value, "outPackageHeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("out_package_height <=", value, "outPackageHeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageHeightIn(List<BigDecimal> values) {
            addCriterion("out_package_height in", values, "outPackageHeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageHeightNotIn(List<BigDecimal> values) {
            addCriterion("out_package_height not in", values, "outPackageHeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("out_package_height between", value1, value2, "outPackageHeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("out_package_height not between", value1, value2, "outPackageHeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthUnitIsNull() {
            addCriterion("out_package_length_unit is null");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthUnitIsNotNull() {
            addCriterion("out_package_length_unit is not null");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthUnitEqualTo(String value) {
            addCriterion("out_package_length_unit =", value, "outPackageLengthUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthUnitNotEqualTo(String value) {
            addCriterion("out_package_length_unit <>", value, "outPackageLengthUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthUnitGreaterThan(String value) {
            addCriterion("out_package_length_unit >", value, "outPackageLengthUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthUnitGreaterThanOrEqualTo(String value) {
            addCriterion("out_package_length_unit >=", value, "outPackageLengthUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthUnitLessThan(String value) {
            addCriterion("out_package_length_unit <", value, "outPackageLengthUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthUnitLessThanOrEqualTo(String value) {
            addCriterion("out_package_length_unit <=", value, "outPackageLengthUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthUnitLike(String value) {
            addCriterion("out_package_length_unit like", value, "outPackageLengthUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthUnitNotLike(String value) {
            addCriterion("out_package_length_unit not like", value, "outPackageLengthUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthUnitIn(List<String> values) {
            addCriterion("out_package_length_unit in", values, "outPackageLengthUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthUnitNotIn(List<String> values) {
            addCriterion("out_package_length_unit not in", values, "outPackageLengthUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthUnitBetween(String value1, String value2) {
            addCriterion("out_package_length_unit between", value1, value2, "outPackageLengthUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageLengthUnitNotBetween(String value1, String value2) {
            addCriterion("out_package_length_unit not between", value1, value2, "outPackageLengthUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageQuantityIsNull() {
            addCriterion("out_package_quantity is null");
            return (Criteria) this;
        }

        public Criteria andOutPackageQuantityIsNotNull() {
            addCriterion("out_package_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andOutPackageQuantityEqualTo(BigDecimal value) {
            addCriterion("out_package_quantity =", value, "outPackageQuantity");
            return (Criteria) this;
        }

        public Criteria andOutPackageQuantityNotEqualTo(BigDecimal value) {
            addCriterion("out_package_quantity <>", value, "outPackageQuantity");
            return (Criteria) this;
        }

        public Criteria andOutPackageQuantityGreaterThan(BigDecimal value) {
            addCriterion("out_package_quantity >", value, "outPackageQuantity");
            return (Criteria) this;
        }

        public Criteria andOutPackageQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("out_package_quantity >=", value, "outPackageQuantity");
            return (Criteria) this;
        }

        public Criteria andOutPackageQuantityLessThan(BigDecimal value) {
            addCriterion("out_package_quantity <", value, "outPackageQuantity");
            return (Criteria) this;
        }

        public Criteria andOutPackageQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("out_package_quantity <=", value, "outPackageQuantity");
            return (Criteria) this;
        }

        public Criteria andOutPackageQuantityIn(List<BigDecimal> values) {
            addCriterion("out_package_quantity in", values, "outPackageQuantity");
            return (Criteria) this;
        }

        public Criteria andOutPackageQuantityNotIn(List<BigDecimal> values) {
            addCriterion("out_package_quantity not in", values, "outPackageQuantity");
            return (Criteria) this;
        }

        public Criteria andOutPackageQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("out_package_quantity between", value1, value2, "outPackageQuantity");
            return (Criteria) this;
        }

        public Criteria andOutPackageQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("out_package_quantity not between", value1, value2, "outPackageQuantity");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightIsNull() {
            addCriterion("out_package_weight is null");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightIsNotNull() {
            addCriterion("out_package_weight is not null");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightEqualTo(BigDecimal value) {
            addCriterion("out_package_weight =", value, "outPackageWeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightNotEqualTo(BigDecimal value) {
            addCriterion("out_package_weight <>", value, "outPackageWeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightGreaterThan(BigDecimal value) {
            addCriterion("out_package_weight >", value, "outPackageWeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("out_package_weight >=", value, "outPackageWeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightLessThan(BigDecimal value) {
            addCriterion("out_package_weight <", value, "outPackageWeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("out_package_weight <=", value, "outPackageWeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightIn(List<BigDecimal> values) {
            addCriterion("out_package_weight in", values, "outPackageWeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightNotIn(List<BigDecimal> values) {
            addCriterion("out_package_weight not in", values, "outPackageWeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("out_package_weight between", value1, value2, "outPackageWeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("out_package_weight not between", value1, value2, "outPackageWeight");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightUnitIsNull() {
            addCriterion("out_package_weight_unit is null");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightUnitIsNotNull() {
            addCriterion("out_package_weight_unit is not null");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightUnitEqualTo(String value) {
            addCriterion("out_package_weight_unit =", value, "outPackageWeightUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightUnitNotEqualTo(String value) {
            addCriterion("out_package_weight_unit <>", value, "outPackageWeightUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightUnitGreaterThan(String value) {
            addCriterion("out_package_weight_unit >", value, "outPackageWeightUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightUnitGreaterThanOrEqualTo(String value) {
            addCriterion("out_package_weight_unit >=", value, "outPackageWeightUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightUnitLessThan(String value) {
            addCriterion("out_package_weight_unit <", value, "outPackageWeightUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightUnitLessThanOrEqualTo(String value) {
            addCriterion("out_package_weight_unit <=", value, "outPackageWeightUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightUnitLike(String value) {
            addCriterion("out_package_weight_unit like", value, "outPackageWeightUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightUnitNotLike(String value) {
            addCriterion("out_package_weight_unit not like", value, "outPackageWeightUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightUnitIn(List<String> values) {
            addCriterion("out_package_weight_unit in", values, "outPackageWeightUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightUnitNotIn(List<String> values) {
            addCriterion("out_package_weight_unit not in", values, "outPackageWeightUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightUnitBetween(String value1, String value2) {
            addCriterion("out_package_weight_unit between", value1, value2, "outPackageWeightUnit");
            return (Criteria) this;
        }

        public Criteria andOutPackageWeightUnitNotBetween(String value1, String value2) {
            addCriterion("out_package_weight_unit not between", value1, value2, "outPackageWeightUnit");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(BigDecimal value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(BigDecimal value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(BigDecimal value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(BigDecimal value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<BigDecimal> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<BigDecimal> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQuantityIsNull() {
            addCriterion("max_order_quantity is null");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQuantityIsNotNull() {
            addCriterion("max_order_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQuantityEqualTo(String value) {
            addCriterion("max_order_quantity =", value, "maxOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQuantityNotEqualTo(String value) {
            addCriterion("max_order_quantity <>", value, "maxOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQuantityGreaterThan(String value) {
            addCriterion("max_order_quantity >", value, "maxOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("max_order_quantity >=", value, "maxOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQuantityLessThan(String value) {
            addCriterion("max_order_quantity <", value, "maxOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQuantityLessThanOrEqualTo(String value) {
            addCriterion("max_order_quantity <=", value, "maxOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQuantityLike(String value) {
            addCriterion("max_order_quantity like", value, "maxOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQuantityNotLike(String value) {
            addCriterion("max_order_quantity not like", value, "maxOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQuantityIn(List<String> values) {
            addCriterion("max_order_quantity in", values, "maxOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQuantityNotIn(List<String> values) {
            addCriterion("max_order_quantity not in", values, "maxOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQuantityBetween(String value1, String value2) {
            addCriterion("max_order_quantity between", value1, value2, "maxOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQuantityNotBetween(String value1, String value2) {
            addCriterion("max_order_quantity not between", value1, value2, "maxOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andWebNameIsNull() {
            addCriterion("web_name is null");
            return (Criteria) this;
        }

        public Criteria andWebNameIsNotNull() {
            addCriterion("web_name is not null");
            return (Criteria) this;
        }

        public Criteria andWebNameEqualTo(String value) {
            addCriterion("web_name =", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotEqualTo(String value) {
            addCriterion("web_name <>", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameGreaterThan(String value) {
            addCriterion("web_name >", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameGreaterThanOrEqualTo(String value) {
            addCriterion("web_name >=", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameLessThan(String value) {
            addCriterion("web_name <", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameLessThanOrEqualTo(String value) {
            addCriterion("web_name <=", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameLike(String value) {
            addCriterion("web_name like", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotLike(String value) {
            addCriterion("web_name not like", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameIn(List<String> values) {
            addCriterion("web_name in", values, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotIn(List<String> values) {
            addCriterion("web_name not in", values, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameBetween(String value1, String value2) {
            addCriterion("web_name between", value1, value2, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotBetween(String value1, String value2) {
            addCriterion("web_name not between", value1, value2, "webName");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andParentChildIsNull() {
            addCriterion("parent_child is null");
            return (Criteria) this;
        }

        public Criteria andParentChildIsNotNull() {
            addCriterion("parent_child is not null");
            return (Criteria) this;
        }

        public Criteria andParentChildEqualTo(String value) {
            addCriterion("parent_child =", value, "parentChild");
            return (Criteria) this;
        }

        public Criteria andParentChildNotEqualTo(String value) {
            addCriterion("parent_child <>", value, "parentChild");
            return (Criteria) this;
        }

        public Criteria andParentChildGreaterThan(String value) {
            addCriterion("parent_child >", value, "parentChild");
            return (Criteria) this;
        }

        public Criteria andParentChildGreaterThanOrEqualTo(String value) {
            addCriterion("parent_child >=", value, "parentChild");
            return (Criteria) this;
        }

        public Criteria andParentChildLessThan(String value) {
            addCriterion("parent_child <", value, "parentChild");
            return (Criteria) this;
        }

        public Criteria andParentChildLessThanOrEqualTo(String value) {
            addCriterion("parent_child <=", value, "parentChild");
            return (Criteria) this;
        }

        public Criteria andParentChildLike(String value) {
            addCriterion("parent_child like", value, "parentChild");
            return (Criteria) this;
        }

        public Criteria andParentChildNotLike(String value) {
            addCriterion("parent_child not like", value, "parentChild");
            return (Criteria) this;
        }

        public Criteria andParentChildIn(List<String> values) {
            addCriterion("parent_child in", values, "parentChild");
            return (Criteria) this;
        }

        public Criteria andParentChildNotIn(List<String> values) {
            addCriterion("parent_child not in", values, "parentChild");
            return (Criteria) this;
        }

        public Criteria andParentChildBetween(String value1, String value2) {
            addCriterion("parent_child between", value1, value2, "parentChild");
            return (Criteria) this;
        }

        public Criteria andParentChildNotBetween(String value1, String value2) {
            addCriterion("parent_child not between", value1, value2, "parentChild");
            return (Criteria) this;
        }

        public Criteria andParentSkuIsNull() {
            addCriterion("parent_sku is null");
            return (Criteria) this;
        }

        public Criteria andParentSkuIsNotNull() {
            addCriterion("parent_sku is not null");
            return (Criteria) this;
        }

        public Criteria andParentSkuEqualTo(String value) {
            addCriterion("parent_sku =", value, "parentSku");
            return (Criteria) this;
        }

        public Criteria andParentSkuNotEqualTo(String value) {
            addCriterion("parent_sku <>", value, "parentSku");
            return (Criteria) this;
        }

        public Criteria andParentSkuGreaterThan(String value) {
            addCriterion("parent_sku >", value, "parentSku");
            return (Criteria) this;
        }

        public Criteria andParentSkuGreaterThanOrEqualTo(String value) {
            addCriterion("parent_sku >=", value, "parentSku");
            return (Criteria) this;
        }

        public Criteria andParentSkuLessThan(String value) {
            addCriterion("parent_sku <", value, "parentSku");
            return (Criteria) this;
        }

        public Criteria andParentSkuLessThanOrEqualTo(String value) {
            addCriterion("parent_sku <=", value, "parentSku");
            return (Criteria) this;
        }

        public Criteria andParentSkuLike(String value) {
            addCriterion("parent_sku like", value, "parentSku");
            return (Criteria) this;
        }

        public Criteria andParentSkuNotLike(String value) {
            addCriterion("parent_sku not like", value, "parentSku");
            return (Criteria) this;
        }

        public Criteria andParentSkuIn(List<String> values) {
            addCriterion("parent_sku in", values, "parentSku");
            return (Criteria) this;
        }

        public Criteria andParentSkuNotIn(List<String> values) {
            addCriterion("parent_sku not in", values, "parentSku");
            return (Criteria) this;
        }

        public Criteria andParentSkuBetween(String value1, String value2) {
            addCriterion("parent_sku between", value1, value2, "parentSku");
            return (Criteria) this;
        }

        public Criteria andParentSkuNotBetween(String value1, String value2) {
            addCriterion("parent_sku not between", value1, value2, "parentSku");
            return (Criteria) this;
        }

        public Criteria andVariationThemeIsNull() {
            addCriterion("variation_theme is null");
            return (Criteria) this;
        }

        public Criteria andVariationThemeIsNotNull() {
            addCriterion("variation_theme is not null");
            return (Criteria) this;
        }

        public Criteria andVariationThemeEqualTo(String value) {
            addCriterion("variation_theme =", value, "variationTheme");
            return (Criteria) this;
        }

        public Criteria andVariationThemeNotEqualTo(String value) {
            addCriterion("variation_theme <>", value, "variationTheme");
            return (Criteria) this;
        }

        public Criteria andVariationThemeGreaterThan(String value) {
            addCriterion("variation_theme >", value, "variationTheme");
            return (Criteria) this;
        }

        public Criteria andVariationThemeGreaterThanOrEqualTo(String value) {
            addCriterion("variation_theme >=", value, "variationTheme");
            return (Criteria) this;
        }

        public Criteria andVariationThemeLessThan(String value) {
            addCriterion("variation_theme <", value, "variationTheme");
            return (Criteria) this;
        }

        public Criteria andVariationThemeLessThanOrEqualTo(String value) {
            addCriterion("variation_theme <=", value, "variationTheme");
            return (Criteria) this;
        }

        public Criteria andVariationThemeLike(String value) {
            addCriterion("variation_theme like", value, "variationTheme");
            return (Criteria) this;
        }

        public Criteria andVariationThemeNotLike(String value) {
            addCriterion("variation_theme not like", value, "variationTheme");
            return (Criteria) this;
        }

        public Criteria andVariationThemeIn(List<String> values) {
            addCriterion("variation_theme in", values, "variationTheme");
            return (Criteria) this;
        }

        public Criteria andVariationThemeNotIn(List<String> values) {
            addCriterion("variation_theme not in", values, "variationTheme");
            return (Criteria) this;
        }

        public Criteria andVariationThemeBetween(String value1, String value2) {
            addCriterion("variation_theme between", value1, value2, "variationTheme");
            return (Criteria) this;
        }

        public Criteria andVariationThemeNotBetween(String value1, String value2) {
            addCriterion("variation_theme not between", value1, value2, "variationTheme");
            return (Criteria) this;
        }

        public Criteria andSizeNameIsNull() {
            addCriterion("size_name is null");
            return (Criteria) this;
        }

        public Criteria andSizeNameIsNotNull() {
            addCriterion("size_name is not null");
            return (Criteria) this;
        }

        public Criteria andSizeNameEqualTo(String value) {
            addCriterion("size_name =", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotEqualTo(String value) {
            addCriterion("size_name <>", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameGreaterThan(String value) {
            addCriterion("size_name >", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("size_name >=", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameLessThan(String value) {
            addCriterion("size_name <", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameLessThanOrEqualTo(String value) {
            addCriterion("size_name <=", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameLike(String value) {
            addCriterion("size_name like", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotLike(String value) {
            addCriterion("size_name not like", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameIn(List<String> values) {
            addCriterion("size_name in", values, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotIn(List<String> values) {
            addCriterion("size_name not in", values, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameBetween(String value1, String value2) {
            addCriterion("size_name between", value1, value2, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotBetween(String value1, String value2) {
            addCriterion("size_name not between", value1, value2, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeMapIsNull() {
            addCriterion("size_map is null");
            return (Criteria) this;
        }

        public Criteria andSizeMapIsNotNull() {
            addCriterion("size_map is not null");
            return (Criteria) this;
        }

        public Criteria andSizeMapEqualTo(String value) {
            addCriterion("size_map =", value, "sizeMap");
            return (Criteria) this;
        }

        public Criteria andSizeMapNotEqualTo(String value) {
            addCriterion("size_map <>", value, "sizeMap");
            return (Criteria) this;
        }

        public Criteria andSizeMapGreaterThan(String value) {
            addCriterion("size_map >", value, "sizeMap");
            return (Criteria) this;
        }

        public Criteria andSizeMapGreaterThanOrEqualTo(String value) {
            addCriterion("size_map >=", value, "sizeMap");
            return (Criteria) this;
        }

        public Criteria andSizeMapLessThan(String value) {
            addCriterion("size_map <", value, "sizeMap");
            return (Criteria) this;
        }

        public Criteria andSizeMapLessThanOrEqualTo(String value) {
            addCriterion("size_map <=", value, "sizeMap");
            return (Criteria) this;
        }

        public Criteria andSizeMapLike(String value) {
            addCriterion("size_map like", value, "sizeMap");
            return (Criteria) this;
        }

        public Criteria andSizeMapNotLike(String value) {
            addCriterion("size_map not like", value, "sizeMap");
            return (Criteria) this;
        }

        public Criteria andSizeMapIn(List<String> values) {
            addCriterion("size_map in", values, "sizeMap");
            return (Criteria) this;
        }

        public Criteria andSizeMapNotIn(List<String> values) {
            addCriterion("size_map not in", values, "sizeMap");
            return (Criteria) this;
        }

        public Criteria andSizeMapBetween(String value1, String value2) {
            addCriterion("size_map between", value1, value2, "sizeMap");
            return (Criteria) this;
        }

        public Criteria andSizeMapNotBetween(String value1, String value2) {
            addCriterion("size_map not between", value1, value2, "sizeMap");
            return (Criteria) this;
        }

        public Criteria andColorNameIsNull() {
            addCriterion("color_name is null");
            return (Criteria) this;
        }

        public Criteria andColorNameIsNotNull() {
            addCriterion("color_name is not null");
            return (Criteria) this;
        }

        public Criteria andColorNameEqualTo(String value) {
            addCriterion("color_name =", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotEqualTo(String value) {
            addCriterion("color_name <>", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameGreaterThan(String value) {
            addCriterion("color_name >", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameGreaterThanOrEqualTo(String value) {
            addCriterion("color_name >=", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameLessThan(String value) {
            addCriterion("color_name <", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameLessThanOrEqualTo(String value) {
            addCriterion("color_name <=", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameLike(String value) {
            addCriterion("color_name like", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotLike(String value) {
            addCriterion("color_name not like", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameIn(List<String> values) {
            addCriterion("color_name in", values, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotIn(List<String> values) {
            addCriterion("color_name not in", values, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameBetween(String value1, String value2) {
            addCriterion("color_name between", value1, value2, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotBetween(String value1, String value2) {
            addCriterion("color_name not between", value1, value2, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorMapIsNull() {
            addCriterion("color_map is null");
            return (Criteria) this;
        }

        public Criteria andColorMapIsNotNull() {
            addCriterion("color_map is not null");
            return (Criteria) this;
        }

        public Criteria andColorMapEqualTo(String value) {
            addCriterion("color_map =", value, "colorMap");
            return (Criteria) this;
        }

        public Criteria andColorMapNotEqualTo(String value) {
            addCriterion("color_map <>", value, "colorMap");
            return (Criteria) this;
        }

        public Criteria andColorMapGreaterThan(String value) {
            addCriterion("color_map >", value, "colorMap");
            return (Criteria) this;
        }

        public Criteria andColorMapGreaterThanOrEqualTo(String value) {
            addCriterion("color_map >=", value, "colorMap");
            return (Criteria) this;
        }

        public Criteria andColorMapLessThan(String value) {
            addCriterion("color_map <", value, "colorMap");
            return (Criteria) this;
        }

        public Criteria andColorMapLessThanOrEqualTo(String value) {
            addCriterion("color_map <=", value, "colorMap");
            return (Criteria) this;
        }

        public Criteria andColorMapLike(String value) {
            addCriterion("color_map like", value, "colorMap");
            return (Criteria) this;
        }

        public Criteria andColorMapNotLike(String value) {
            addCriterion("color_map not like", value, "colorMap");
            return (Criteria) this;
        }

        public Criteria andColorMapIn(List<String> values) {
            addCriterion("color_map in", values, "colorMap");
            return (Criteria) this;
        }

        public Criteria andColorMapNotIn(List<String> values) {
            addCriterion("color_map not in", values, "colorMap");
            return (Criteria) this;
        }

        public Criteria andColorMapBetween(String value1, String value2) {
            addCriterion("color_map between", value1, value2, "colorMap");
            return (Criteria) this;
        }

        public Criteria andColorMapNotBetween(String value1, String value2) {
            addCriterion("color_map not between", value1, value2, "colorMap");
            return (Criteria) this;
        }

        public Criteria andStyleNameIsNull() {
            addCriterion("style_name is null");
            return (Criteria) this;
        }

        public Criteria andStyleNameIsNotNull() {
            addCriterion("style_name is not null");
            return (Criteria) this;
        }

        public Criteria andStyleNameEqualTo(String value) {
            addCriterion("style_name =", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotEqualTo(String value) {
            addCriterion("style_name <>", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameGreaterThan(String value) {
            addCriterion("style_name >", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameGreaterThanOrEqualTo(String value) {
            addCriterion("style_name >=", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameLessThan(String value) {
            addCriterion("style_name <", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameLessThanOrEqualTo(String value) {
            addCriterion("style_name <=", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameLike(String value) {
            addCriterion("style_name like", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotLike(String value) {
            addCriterion("style_name not like", value, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameIn(List<String> values) {
            addCriterion("style_name in", values, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotIn(List<String> values) {
            addCriterion("style_name not in", values, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameBetween(String value1, String value2) {
            addCriterion("style_name between", value1, value2, "styleName");
            return (Criteria) this;
        }

        public Criteria andStyleNameNotBetween(String value1, String value2) {
            addCriterion("style_name not between", value1, value2, "styleName");
            return (Criteria) this;
        }

        public Criteria andPatternNameIsNull() {
            addCriterion("pattern_name is null");
            return (Criteria) this;
        }

        public Criteria andPatternNameIsNotNull() {
            addCriterion("pattern_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatternNameEqualTo(String value) {
            addCriterion("pattern_name =", value, "patternName");
            return (Criteria) this;
        }

        public Criteria andPatternNameNotEqualTo(String value) {
            addCriterion("pattern_name <>", value, "patternName");
            return (Criteria) this;
        }

        public Criteria andPatternNameGreaterThan(String value) {
            addCriterion("pattern_name >", value, "patternName");
            return (Criteria) this;
        }

        public Criteria andPatternNameGreaterThanOrEqualTo(String value) {
            addCriterion("pattern_name >=", value, "patternName");
            return (Criteria) this;
        }

        public Criteria andPatternNameLessThan(String value) {
            addCriterion("pattern_name <", value, "patternName");
            return (Criteria) this;
        }

        public Criteria andPatternNameLessThanOrEqualTo(String value) {
            addCriterion("pattern_name <=", value, "patternName");
            return (Criteria) this;
        }

        public Criteria andPatternNameLike(String value) {
            addCriterion("pattern_name like", value, "patternName");
            return (Criteria) this;
        }

        public Criteria andPatternNameNotLike(String value) {
            addCriterion("pattern_name not like", value, "patternName");
            return (Criteria) this;
        }

        public Criteria andPatternNameIn(List<String> values) {
            addCriterion("pattern_name in", values, "patternName");
            return (Criteria) this;
        }

        public Criteria andPatternNameNotIn(List<String> values) {
            addCriterion("pattern_name not in", values, "patternName");
            return (Criteria) this;
        }

        public Criteria andPatternNameBetween(String value1, String value2) {
            addCriterion("pattern_name between", value1, value2, "patternName");
            return (Criteria) this;
        }

        public Criteria andPatternNameNotBetween(String value1, String value2) {
            addCriterion("pattern_name not between", value1, value2, "patternName");
            return (Criteria) this;
        }

        public Criteria andWebsiteVariationIsNull() {
            addCriterion("website_variation is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteVariationIsNotNull() {
            addCriterion("website_variation is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteVariationEqualTo(String value) {
            addCriterion("website_variation =", value, "websiteVariation");
            return (Criteria) this;
        }

        public Criteria andWebsiteVariationNotEqualTo(String value) {
            addCriterion("website_variation <>", value, "websiteVariation");
            return (Criteria) this;
        }

        public Criteria andWebsiteVariationGreaterThan(String value) {
            addCriterion("website_variation >", value, "websiteVariation");
            return (Criteria) this;
        }

        public Criteria andWebsiteVariationGreaterThanOrEqualTo(String value) {
            addCriterion("website_variation >=", value, "websiteVariation");
            return (Criteria) this;
        }

        public Criteria andWebsiteVariationLessThan(String value) {
            addCriterion("website_variation <", value, "websiteVariation");
            return (Criteria) this;
        }

        public Criteria andWebsiteVariationLessThanOrEqualTo(String value) {
            addCriterion("website_variation <=", value, "websiteVariation");
            return (Criteria) this;
        }

        public Criteria andWebsiteVariationLike(String value) {
            addCriterion("website_variation like", value, "websiteVariation");
            return (Criteria) this;
        }

        public Criteria andWebsiteVariationNotLike(String value) {
            addCriterion("website_variation not like", value, "websiteVariation");
            return (Criteria) this;
        }

        public Criteria andWebsiteVariationIn(List<String> values) {
            addCriterion("website_variation in", values, "websiteVariation");
            return (Criteria) this;
        }

        public Criteria andWebsiteVariationNotIn(List<String> values) {
            addCriterion("website_variation not in", values, "websiteVariation");
            return (Criteria) this;
        }

        public Criteria andWebsiteVariationBetween(String value1, String value2) {
            addCriterion("website_variation between", value1, value2, "websiteVariation");
            return (Criteria) this;
        }

        public Criteria andWebsiteVariationNotBetween(String value1, String value2) {
            addCriterion("website_variation not between", value1, value2, "websiteVariation");
            return (Criteria) this;
        }

        public Criteria andMainSkuIsNull() {
            addCriterion("main_sku is null");
            return (Criteria) this;
        }

        public Criteria andMainSkuIsNotNull() {
            addCriterion("main_sku is not null");
            return (Criteria) this;
        }

        public Criteria andMainSkuEqualTo(String value) {
            addCriterion("main_sku =", value, "mainSku");
            return (Criteria) this;
        }

        public Criteria andMainSkuNotEqualTo(String value) {
            addCriterion("main_sku <>", value, "mainSku");
            return (Criteria) this;
        }

        public Criteria andMainSkuGreaterThan(String value) {
            addCriterion("main_sku >", value, "mainSku");
            return (Criteria) this;
        }

        public Criteria andMainSkuGreaterThanOrEqualTo(String value) {
            addCriterion("main_sku >=", value, "mainSku");
            return (Criteria) this;
        }

        public Criteria andMainSkuLessThan(String value) {
            addCriterion("main_sku <", value, "mainSku");
            return (Criteria) this;
        }

        public Criteria andMainSkuLessThanOrEqualTo(String value) {
            addCriterion("main_sku <=", value, "mainSku");
            return (Criteria) this;
        }

        public Criteria andMainSkuLike(String value) {
            addCriterion("main_sku like", value, "mainSku");
            return (Criteria) this;
        }

        public Criteria andMainSkuNotLike(String value) {
            addCriterion("main_sku not like", value, "mainSku");
            return (Criteria) this;
        }

        public Criteria andMainSkuIn(List<String> values) {
            addCriterion("main_sku in", values, "mainSku");
            return (Criteria) this;
        }

        public Criteria andMainSkuNotIn(List<String> values) {
            addCriterion("main_sku not in", values, "mainSku");
            return (Criteria) this;
        }

        public Criteria andMainSkuBetween(String value1, String value2) {
            addCriterion("main_sku between", value1, value2, "mainSku");
            return (Criteria) this;
        }

        public Criteria andMainSkuNotBetween(String value1, String value2) {
            addCriterion("main_sku not between", value1, value2, "mainSku");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNull() {
            addCriterion("template_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(String value) {
            addCriterion("template_id =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(String value) {
            addCriterion("template_id <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(String value) {
            addCriterion("template_id >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("template_id >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(String value) {
            addCriterion("template_id <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(String value) {
            addCriterion("template_id <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLike(String value) {
            addCriterion("template_id like", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotLike(String value) {
            addCriterion("template_id not like", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<String> values) {
            addCriterion("template_id in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<String> values) {
            addCriterion("template_id not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(String value1, String value2) {
            addCriterion("template_id between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(String value1, String value2) {
            addCriterion("template_id not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNull() {
            addCriterion("item_status is null");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNotNull() {
            addCriterion("item_status is not null");
            return (Criteria) this;
        }

        public Criteria andItemStatusEqualTo(String value) {
            addCriterion("item_status =", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotEqualTo(String value) {
            addCriterion("item_status <>", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThan(String value) {
            addCriterion("item_status >", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThanOrEqualTo(String value) {
            addCriterion("item_status >=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThan(String value) {
            addCriterion("item_status <", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThanOrEqualTo(String value) {
            addCriterion("item_status <=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLike(String value) {
            addCriterion("item_status like", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotLike(String value) {
            addCriterion("item_status not like", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusIn(List<String> values) {
            addCriterion("item_status in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotIn(List<String> values) {
            addCriterion("item_status not in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusBetween(String value1, String value2) {
            addCriterion("item_status between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotBetween(String value1, String value2) {
            addCriterion("item_status not between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andTemplateIsNull() {
            addCriterion("template is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIsNotNull() {
            addCriterion("template is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateEqualTo(String value) {
            addCriterion("template =", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotEqualTo(String value) {
            addCriterion("template <>", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateGreaterThan(String value) {
            addCriterion("template >", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("template >=", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLessThan(String value) {
            addCriterion("template <", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLessThanOrEqualTo(String value) {
            addCriterion("template <=", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLike(String value) {
            addCriterion("template like", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotLike(String value) {
            addCriterion("template not like", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateIn(List<String> values) {
            addCriterion("template in", values, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotIn(List<String> values) {
            addCriterion("template not in", values, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateBetween(String value1, String value2) {
            addCriterion("template between", value1, value2, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotBetween(String value1, String value2) {
            addCriterion("template not between", value1, value2, "template");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andAsinIsNull() {
            addCriterion("asin is null");
            return (Criteria) this;
        }

        public Criteria andAsinIsNotNull() {
            addCriterion("asin is not null");
            return (Criteria) this;
        }

        public Criteria andAsinEqualTo(String value) {
            addCriterion("asin =", value, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinNotEqualTo(String value) {
            addCriterion("asin <>", value, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinGreaterThan(String value) {
            addCriterion("asin >", value, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinGreaterThanOrEqualTo(String value) {
            addCriterion("asin >=", value, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinLessThan(String value) {
            addCriterion("asin <", value, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinLessThanOrEqualTo(String value) {
            addCriterion("asin <=", value, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinLike(String value) {
            addCriterion("asin like", value, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinNotLike(String value) {
            addCriterion("asin not like", value, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinIn(List<String> values) {
            addCriterion("asin in", values, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinNotIn(List<String> values) {
            addCriterion("asin not in", values, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinBetween(String value1, String value2) {
            addCriterion("asin between", value1, value2, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinNotBetween(String value1, String value2) {
            addCriterion("asin not between", value1, value2, "asin");
            return (Criteria) this;
        }

        public Criteria andIsseasonalIsNull() {
            addCriterion("isseasonal is null");
            return (Criteria) this;
        }

        public Criteria andIsseasonalIsNotNull() {
            addCriterion("isseasonal is not null");
            return (Criteria) this;
        }

        public Criteria andIsseasonalEqualTo(String value) {
            addCriterion("isseasonal =", value, "isseasonal");
            return (Criteria) this;
        }

        public Criteria andIsseasonalNotEqualTo(String value) {
            addCriterion("isseasonal <>", value, "isseasonal");
            return (Criteria) this;
        }

        public Criteria andIsseasonalGreaterThan(String value) {
            addCriterion("isseasonal >", value, "isseasonal");
            return (Criteria) this;
        }

        public Criteria andIsseasonalGreaterThanOrEqualTo(String value) {
            addCriterion("isseasonal >=", value, "isseasonal");
            return (Criteria) this;
        }

        public Criteria andIsseasonalLessThan(String value) {
            addCriterion("isseasonal <", value, "isseasonal");
            return (Criteria) this;
        }

        public Criteria andIsseasonalLessThanOrEqualTo(String value) {
            addCriterion("isseasonal <=", value, "isseasonal");
            return (Criteria) this;
        }

        public Criteria andIsseasonalLike(String value) {
            addCriterion("isseasonal like", value, "isseasonal");
            return (Criteria) this;
        }

        public Criteria andIsseasonalNotLike(String value) {
            addCriterion("isseasonal not like", value, "isseasonal");
            return (Criteria) this;
        }

        public Criteria andIsseasonalIn(List<String> values) {
            addCriterion("isseasonal in", values, "isseasonal");
            return (Criteria) this;
        }

        public Criteria andIsseasonalNotIn(List<String> values) {
            addCriterion("isseasonal not in", values, "isseasonal");
            return (Criteria) this;
        }

        public Criteria andIsseasonalBetween(String value1, String value2) {
            addCriterion("isseasonal between", value1, value2, "isseasonal");
            return (Criteria) this;
        }

        public Criteria andIsseasonalNotBetween(String value1, String value2) {
            addCriterion("isseasonal not between", value1, value2, "isseasonal");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIsNull() {
            addCriterion("englishname is null");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIsNotNull() {
            addCriterion("englishname is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishnameEqualTo(String value) {
            addCriterion("englishname =", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotEqualTo(String value) {
            addCriterion("englishname <>", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameGreaterThan(String value) {
            addCriterion("englishname >", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameGreaterThanOrEqualTo(String value) {
            addCriterion("englishname >=", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLessThan(String value) {
            addCriterion("englishname <", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLessThanOrEqualTo(String value) {
            addCriterion("englishname <=", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLike(String value) {
            addCriterion("englishname like", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotLike(String value) {
            addCriterion("englishname not like", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIn(List<String> values) {
            addCriterion("englishname in", values, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotIn(List<String> values) {
            addCriterion("englishname not in", values, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameBetween(String value1, String value2) {
            addCriterion("englishname between", value1, value2, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotBetween(String value1, String value2) {
            addCriterion("englishname not between", value1, value2, "englishname");
            return (Criteria) this;
        }

        public Criteria andAirexpressIsNull() {
            addCriterion("airexpress is null");
            return (Criteria) this;
        }

        public Criteria andAirexpressIsNotNull() {
            addCriterion("airexpress is not null");
            return (Criteria) this;
        }

        public Criteria andAirexpressEqualTo(BigDecimal value) {
            addCriterion("airexpress =", value, "airexpress");
            return (Criteria) this;
        }

        public Criteria andAirexpressNotEqualTo(BigDecimal value) {
            addCriterion("airexpress <>", value, "airexpress");
            return (Criteria) this;
        }

        public Criteria andAirexpressGreaterThan(BigDecimal value) {
            addCriterion("airexpress >", value, "airexpress");
            return (Criteria) this;
        }

        public Criteria andAirexpressGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("airexpress >=", value, "airexpress");
            return (Criteria) this;
        }

        public Criteria andAirexpressLessThan(BigDecimal value) {
            addCriterion("airexpress <", value, "airexpress");
            return (Criteria) this;
        }

        public Criteria andAirexpressLessThanOrEqualTo(BigDecimal value) {
            addCriterion("airexpress <=", value, "airexpress");
            return (Criteria) this;
        }

        public Criteria andAirexpressIn(List<BigDecimal> values) {
            addCriterion("airexpress in", values, "airexpress");
            return (Criteria) this;
        }

        public Criteria andAirexpressNotIn(List<BigDecimal> values) {
            addCriterion("airexpress not in", values, "airexpress");
            return (Criteria) this;
        }

        public Criteria andAirexpressBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("airexpress between", value1, value2, "airexpress");
            return (Criteria) this;
        }

        public Criteria andAirexpressNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("airexpress not between", value1, value2, "airexpress");
            return (Criteria) this;
        }

        public Criteria andAirshippingIsNull() {
            addCriterion("airshipping is null");
            return (Criteria) this;
        }

        public Criteria andAirshippingIsNotNull() {
            addCriterion("airshipping is not null");
            return (Criteria) this;
        }

        public Criteria andAirshippingEqualTo(BigDecimal value) {
            addCriterion("airshipping =", value, "airshipping");
            return (Criteria) this;
        }

        public Criteria andAirshippingNotEqualTo(BigDecimal value) {
            addCriterion("airshipping <>", value, "airshipping");
            return (Criteria) this;
        }

        public Criteria andAirshippingGreaterThan(BigDecimal value) {
            addCriterion("airshipping >", value, "airshipping");
            return (Criteria) this;
        }

        public Criteria andAirshippingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("airshipping >=", value, "airshipping");
            return (Criteria) this;
        }

        public Criteria andAirshippingLessThan(BigDecimal value) {
            addCriterion("airshipping <", value, "airshipping");
            return (Criteria) this;
        }

        public Criteria andAirshippingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("airshipping <=", value, "airshipping");
            return (Criteria) this;
        }

        public Criteria andAirshippingIn(List<BigDecimal> values) {
            addCriterion("airshipping in", values, "airshipping");
            return (Criteria) this;
        }

        public Criteria andAirshippingNotIn(List<BigDecimal> values) {
            addCriterion("airshipping not in", values, "airshipping");
            return (Criteria) this;
        }

        public Criteria andAirshippingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("airshipping between", value1, value2, "airshipping");
            return (Criteria) this;
        }

        public Criteria andAirshippingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("airshipping not between", value1, value2, "airshipping");
            return (Criteria) this;
        }

        public Criteria andDragonshippingIsNull() {
            addCriterion("dragonshipping is null");
            return (Criteria) this;
        }

        public Criteria andDragonshippingIsNotNull() {
            addCriterion("dragonshipping is not null");
            return (Criteria) this;
        }

        public Criteria andDragonshippingEqualTo(BigDecimal value) {
            addCriterion("dragonshipping =", value, "dragonshipping");
            return (Criteria) this;
        }

        public Criteria andDragonshippingNotEqualTo(BigDecimal value) {
            addCriterion("dragonshipping <>", value, "dragonshipping");
            return (Criteria) this;
        }

        public Criteria andDragonshippingGreaterThan(BigDecimal value) {
            addCriterion("dragonshipping >", value, "dragonshipping");
            return (Criteria) this;
        }

        public Criteria andDragonshippingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dragonshipping >=", value, "dragonshipping");
            return (Criteria) this;
        }

        public Criteria andDragonshippingLessThan(BigDecimal value) {
            addCriterion("dragonshipping <", value, "dragonshipping");
            return (Criteria) this;
        }

        public Criteria andDragonshippingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dragonshipping <=", value, "dragonshipping");
            return (Criteria) this;
        }

        public Criteria andDragonshippingIn(List<BigDecimal> values) {
            addCriterion("dragonshipping in", values, "dragonshipping");
            return (Criteria) this;
        }

        public Criteria andDragonshippingNotIn(List<BigDecimal> values) {
            addCriterion("dragonshipping not in", values, "dragonshipping");
            return (Criteria) this;
        }

        public Criteria andDragonshippingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dragonshipping between", value1, value2, "dragonshipping");
            return (Criteria) this;
        }

        public Criteria andDragonshippingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dragonshipping not between", value1, value2, "dragonshipping");
            return (Criteria) this;
        }

        public Criteria andSeashippingIsNull() {
            addCriterion("seashipping is null");
            return (Criteria) this;
        }

        public Criteria andSeashippingIsNotNull() {
            addCriterion("seashipping is not null");
            return (Criteria) this;
        }

        public Criteria andSeashippingEqualTo(BigDecimal value) {
            addCriterion("seashipping =", value, "seashipping");
            return (Criteria) this;
        }

        public Criteria andSeashippingNotEqualTo(BigDecimal value) {
            addCriterion("seashipping <>", value, "seashipping");
            return (Criteria) this;
        }

        public Criteria andSeashippingGreaterThan(BigDecimal value) {
            addCriterion("seashipping >", value, "seashipping");
            return (Criteria) this;
        }

        public Criteria andSeashippingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("seashipping >=", value, "seashipping");
            return (Criteria) this;
        }

        public Criteria andSeashippingLessThan(BigDecimal value) {
            addCriterion("seashipping <", value, "seashipping");
            return (Criteria) this;
        }

        public Criteria andSeashippingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("seashipping <=", value, "seashipping");
            return (Criteria) this;
        }

        public Criteria andSeashippingIn(List<BigDecimal> values) {
            addCriterion("seashipping in", values, "seashipping");
            return (Criteria) this;
        }

        public Criteria andSeashippingNotIn(List<BigDecimal> values) {
            addCriterion("seashipping not in", values, "seashipping");
            return (Criteria) this;
        }

        public Criteria andSeashippingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seashipping between", value1, value2, "seashipping");
            return (Criteria) this;
        }

        public Criteria andSeashippingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seashipping not between", value1, value2, "seashipping");
            return (Criteria) this;
        }

        public Criteria andLandshippingIsNull() {
            addCriterion("landshipping is null");
            return (Criteria) this;
        }

        public Criteria andLandshippingIsNotNull() {
            addCriterion("landshipping is not null");
            return (Criteria) this;
        }

        public Criteria andLandshippingEqualTo(BigDecimal value) {
            addCriterion("landshipping =", value, "landshipping");
            return (Criteria) this;
        }

        public Criteria andLandshippingNotEqualTo(BigDecimal value) {
            addCriterion("landshipping <>", value, "landshipping");
            return (Criteria) this;
        }

        public Criteria andLandshippingGreaterThan(BigDecimal value) {
            addCriterion("landshipping >", value, "landshipping");
            return (Criteria) this;
        }

        public Criteria andLandshippingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("landshipping >=", value, "landshipping");
            return (Criteria) this;
        }

        public Criteria andLandshippingLessThan(BigDecimal value) {
            addCriterion("landshipping <", value, "landshipping");
            return (Criteria) this;
        }

        public Criteria andLandshippingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("landshipping <=", value, "landshipping");
            return (Criteria) this;
        }

        public Criteria andLandshippingIn(List<BigDecimal> values) {
            addCriterion("landshipping in", values, "landshipping");
            return (Criteria) this;
        }

        public Criteria andLandshippingNotIn(List<BigDecimal> values) {
            addCriterion("landshipping not in", values, "landshipping");
            return (Criteria) this;
        }

        public Criteria andLandshippingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("landshipping between", value1, value2, "landshipping");
            return (Criteria) this;
        }

        public Criteria andLandshippingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("landshipping not between", value1, value2, "landshipping");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCatNameIsNull() {
            addCriterion("cat_name is null");
            return (Criteria) this;
        }

        public Criteria andCatNameIsNotNull() {
            addCriterion("cat_name is not null");
            return (Criteria) this;
        }

        public Criteria andCatNameEqualTo(String value) {
            addCriterion("cat_name =", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotEqualTo(String value) {
            addCriterion("cat_name <>", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameGreaterThan(String value) {
            addCriterion("cat_name >", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameGreaterThanOrEqualTo(String value) {
            addCriterion("cat_name >=", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLessThan(String value) {
            addCriterion("cat_name <", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLessThanOrEqualTo(String value) {
            addCriterion("cat_name <=", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameLike(String value) {
            addCriterion("cat_name like", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotLike(String value) {
            addCriterion("cat_name not like", value, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameIn(List<String> values) {
            addCriterion("cat_name in", values, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotIn(List<String> values) {
            addCriterion("cat_name not in", values, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameBetween(String value1, String value2) {
            addCriterion("cat_name between", value1, value2, "catName");
            return (Criteria) this;
        }

        public Criteria andCatNameNotBetween(String value1, String value2) {
            addCriterion("cat_name not between", value1, value2, "catName");
            return (Criteria) this;
        }

        public Criteria andPoorgIdIsNull() {
            addCriterion("poorg_id is null");
            return (Criteria) this;
        }

        public Criteria andPoorgIdIsNotNull() {
            addCriterion("poorg_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoorgIdEqualTo(BigDecimal value) {
            addCriterion("poorg_id =", value, "poorgId");
            return (Criteria) this;
        }

        public Criteria andPoorgIdNotEqualTo(BigDecimal value) {
            addCriterion("poorg_id <>", value, "poorgId");
            return (Criteria) this;
        }

        public Criteria andPoorgIdGreaterThan(BigDecimal value) {
            addCriterion("poorg_id >", value, "poorgId");
            return (Criteria) this;
        }

        public Criteria andPoorgIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("poorg_id >=", value, "poorgId");
            return (Criteria) this;
        }

        public Criteria andPoorgIdLessThan(BigDecimal value) {
            addCriterion("poorg_id <", value, "poorgId");
            return (Criteria) this;
        }

        public Criteria andPoorgIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("poorg_id <=", value, "poorgId");
            return (Criteria) this;
        }

        public Criteria andPoorgIdIn(List<BigDecimal> values) {
            addCriterion("poorg_id in", values, "poorgId");
            return (Criteria) this;
        }

        public Criteria andPoorgIdNotIn(List<BigDecimal> values) {
            addCriterion("poorg_id not in", values, "poorgId");
            return (Criteria) this;
        }

        public Criteria andPoorgIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("poorg_id between", value1, value2, "poorgId");
            return (Criteria) this;
        }

        public Criteria andPoorgIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("poorg_id not between", value1, value2, "poorgId");
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