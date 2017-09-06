package cn.ssm.project.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ToFbafeeDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ToFbafeeDetailExample() {
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

        public Criteria andCreatedAtEqualTo(Integer value) {
            addCriterion("CREATED_AT =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Integer value) {
            addCriterion("CREATED_AT <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Integer value) {
            addCriterion("CREATED_AT >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATED_AT >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Integer value) {
            addCriterion("CREATED_AT <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Integer value) {
            addCriterion("CREATED_AT <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Integer> values) {
            addCriterion("CREATED_AT in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Integer> values) {
            addCriterion("CREATED_AT not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Integer value1, Integer value2) {
            addCriterion("CREATED_AT between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Integer value1, Integer value2) {
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

        public Criteria andUpdatedAtEqualTo(Integer value) {
            addCriterion("UPDATED_AT =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Integer value) {
            addCriterion("UPDATED_AT <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Integer value) {
            addCriterion("UPDATED_AT >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPDATED_AT >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Integer value) {
            addCriterion("UPDATED_AT <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Integer value) {
            addCriterion("UPDATED_AT <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Integer> values) {
            addCriterion("UPDATED_AT in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Integer> values) {
            addCriterion("UPDATED_AT not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Integer value1, Integer value2) {
            addCriterion("UPDATED_AT between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Integer value1, Integer value2) {
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

        public Criteria andRuleIdIsNull() {
            addCriterion("RULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNotNull() {
            addCriterion("RULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRuleIdEqualTo(Integer value) {
            addCriterion("RULE_ID =", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotEqualTo(Integer value) {
            addCriterion("RULE_ID <>", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThan(Integer value) {
            addCriterion("RULE_ID >", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RULE_ID >=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThan(Integer value) {
            addCriterion("RULE_ID <", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("RULE_ID <=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdIn(List<Integer> values) {
            addCriterion("RULE_ID in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotIn(List<Integer> values) {
            addCriterion("RULE_ID not in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdBetween(Integer value1, Integer value2) {
            addCriterion("RULE_ID between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RULE_ID not between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andLineIsNull() {
            addCriterion("LINE is null");
            return (Criteria) this;
        }

        public Criteria andLineIsNotNull() {
            addCriterion("LINE is not null");
            return (Criteria) this;
        }

        public Criteria andLineEqualTo(Integer value) {
            addCriterion("LINE =", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotEqualTo(Integer value) {
            addCriterion("LINE <>", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineGreaterThan(Integer value) {
            addCriterion("LINE >", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineGreaterThanOrEqualTo(Integer value) {
            addCriterion("LINE >=", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineLessThan(Integer value) {
            addCriterion("LINE <", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineLessThanOrEqualTo(Integer value) {
            addCriterion("LINE <=", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineIn(List<Integer> values) {
            addCriterion("LINE in", values, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotIn(List<Integer> values) {
            addCriterion("LINE not in", values, "line");
            return (Criteria) this;
        }

        public Criteria andLineBetween(Integer value1, Integer value2) {
            addCriterion("LINE between", value1, value2, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotBetween(Integer value1, Integer value2) {
            addCriterion("LINE not between", value1, value2, "line");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIsNull() {
            addCriterion("PACKAGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIsNotNull() {
            addCriterion("PACKAGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPackageTypeEqualTo(String value) {
            addCriterion("PACKAGE_TYPE =", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotEqualTo(String value) {
            addCriterion("PACKAGE_TYPE <>", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeGreaterThan(String value) {
            addCriterion("PACKAGE_TYPE >", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PACKAGE_TYPE >=", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLessThan(String value) {
            addCriterion("PACKAGE_TYPE <", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLessThanOrEqualTo(String value) {
            addCriterion("PACKAGE_TYPE <=", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLike(String value) {
            addCriterion("PACKAGE_TYPE like", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotLike(String value) {
            addCriterion("PACKAGE_TYPE not like", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIn(List<String> values) {
            addCriterion("PACKAGE_TYPE in", values, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotIn(List<String> values) {
            addCriterion("PACKAGE_TYPE not in", values, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeBetween(String value1, String value2) {
            addCriterion("PACKAGE_TYPE between", value1, value2, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotBetween(String value1, String value2) {
            addCriterion("PACKAGE_TYPE not between", value1, value2, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageWeightIsNull() {
            addCriterion("PACKAGE_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andPackageWeightIsNotNull() {
            addCriterion("PACKAGE_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andPackageWeightEqualTo(BigDecimal value) {
            addCriterion("PACKAGE_WEIGHT =", value, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightNotEqualTo(BigDecimal value) {
            addCriterion("PACKAGE_WEIGHT <>", value, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightGreaterThan(BigDecimal value) {
            addCriterion("PACKAGE_WEIGHT >", value, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKAGE_WEIGHT >=", value, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightLessThan(BigDecimal value) {
            addCriterion("PACKAGE_WEIGHT <", value, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKAGE_WEIGHT <=", value, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightIn(List<BigDecimal> values) {
            addCriterion("PACKAGE_WEIGHT in", values, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightNotIn(List<BigDecimal> values) {
            addCriterion("PACKAGE_WEIGHT not in", values, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKAGE_WEIGHT between", value1, value2, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andPackageWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKAGE_WEIGHT not between", value1, value2, "packageWeight");
            return (Criteria) this;
        }

        public Criteria andLengthMaxIsNull() {
            addCriterion("LENGTH_MAX is null");
            return (Criteria) this;
        }

        public Criteria andLengthMaxIsNotNull() {
            addCriterion("LENGTH_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andLengthMaxEqualTo(BigDecimal value) {
            addCriterion("LENGTH_MAX =", value, "lengthMax");
            return (Criteria) this;
        }

        public Criteria andLengthMaxNotEqualTo(BigDecimal value) {
            addCriterion("LENGTH_MAX <>", value, "lengthMax");
            return (Criteria) this;
        }

        public Criteria andLengthMaxGreaterThan(BigDecimal value) {
            addCriterion("LENGTH_MAX >", value, "lengthMax");
            return (Criteria) this;
        }

        public Criteria andLengthMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LENGTH_MAX >=", value, "lengthMax");
            return (Criteria) this;
        }

        public Criteria andLengthMaxLessThan(BigDecimal value) {
            addCriterion("LENGTH_MAX <", value, "lengthMax");
            return (Criteria) this;
        }

        public Criteria andLengthMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LENGTH_MAX <=", value, "lengthMax");
            return (Criteria) this;
        }

        public Criteria andLengthMaxIn(List<BigDecimal> values) {
            addCriterion("LENGTH_MAX in", values, "lengthMax");
            return (Criteria) this;
        }

        public Criteria andLengthMaxNotIn(List<BigDecimal> values) {
            addCriterion("LENGTH_MAX not in", values, "lengthMax");
            return (Criteria) this;
        }

        public Criteria andLengthMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LENGTH_MAX between", value1, value2, "lengthMax");
            return (Criteria) this;
        }

        public Criteria andLengthMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LENGTH_MAX not between", value1, value2, "lengthMax");
            return (Criteria) this;
        }

        public Criteria andWidthMaxIsNull() {
            addCriterion("WIDTH_MAX is null");
            return (Criteria) this;
        }

        public Criteria andWidthMaxIsNotNull() {
            addCriterion("WIDTH_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andWidthMaxEqualTo(BigDecimal value) {
            addCriterion("WIDTH_MAX =", value, "widthMax");
            return (Criteria) this;
        }

        public Criteria andWidthMaxNotEqualTo(BigDecimal value) {
            addCriterion("WIDTH_MAX <>", value, "widthMax");
            return (Criteria) this;
        }

        public Criteria andWidthMaxGreaterThan(BigDecimal value) {
            addCriterion("WIDTH_MAX >", value, "widthMax");
            return (Criteria) this;
        }

        public Criteria andWidthMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WIDTH_MAX >=", value, "widthMax");
            return (Criteria) this;
        }

        public Criteria andWidthMaxLessThan(BigDecimal value) {
            addCriterion("WIDTH_MAX <", value, "widthMax");
            return (Criteria) this;
        }

        public Criteria andWidthMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WIDTH_MAX <=", value, "widthMax");
            return (Criteria) this;
        }

        public Criteria andWidthMaxIn(List<BigDecimal> values) {
            addCriterion("WIDTH_MAX in", values, "widthMax");
            return (Criteria) this;
        }

        public Criteria andWidthMaxNotIn(List<BigDecimal> values) {
            addCriterion("WIDTH_MAX not in", values, "widthMax");
            return (Criteria) this;
        }

        public Criteria andWidthMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WIDTH_MAX between", value1, value2, "widthMax");
            return (Criteria) this;
        }

        public Criteria andWidthMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WIDTH_MAX not between", value1, value2, "widthMax");
            return (Criteria) this;
        }

        public Criteria andHeightMaxIsNull() {
            addCriterion("HEIGHT_MAX is null");
            return (Criteria) this;
        }

        public Criteria andHeightMaxIsNotNull() {
            addCriterion("HEIGHT_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andHeightMaxEqualTo(BigDecimal value) {
            addCriterion("HEIGHT_MAX =", value, "heightMax");
            return (Criteria) this;
        }

        public Criteria andHeightMaxNotEqualTo(BigDecimal value) {
            addCriterion("HEIGHT_MAX <>", value, "heightMax");
            return (Criteria) this;
        }

        public Criteria andHeightMaxGreaterThan(BigDecimal value) {
            addCriterion("HEIGHT_MAX >", value, "heightMax");
            return (Criteria) this;
        }

        public Criteria andHeightMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEIGHT_MAX >=", value, "heightMax");
            return (Criteria) this;
        }

        public Criteria andHeightMaxLessThan(BigDecimal value) {
            addCriterion("HEIGHT_MAX <", value, "heightMax");
            return (Criteria) this;
        }

        public Criteria andHeightMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEIGHT_MAX <=", value, "heightMax");
            return (Criteria) this;
        }

        public Criteria andHeightMaxIn(List<BigDecimal> values) {
            addCriterion("HEIGHT_MAX in", values, "heightMax");
            return (Criteria) this;
        }

        public Criteria andHeightMaxNotIn(List<BigDecimal> values) {
            addCriterion("HEIGHT_MAX not in", values, "heightMax");
            return (Criteria) this;
        }

        public Criteria andHeightMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEIGHT_MAX between", value1, value2, "heightMax");
            return (Criteria) this;
        }

        public Criteria andHeightMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEIGHT_MAX not between", value1, value2, "heightMax");
            return (Criteria) this;
        }

        public Criteria andLengthAddwmaxIsNull() {
            addCriterion("LENGTH_ADDWMAX is null");
            return (Criteria) this;
        }

        public Criteria andLengthAddwmaxIsNotNull() {
            addCriterion("LENGTH_ADDWMAX is not null");
            return (Criteria) this;
        }

        public Criteria andLengthAddwmaxEqualTo(BigDecimal value) {
            addCriterion("LENGTH_ADDWMAX =", value, "lengthAddwmax");
            return (Criteria) this;
        }

        public Criteria andLengthAddwmaxNotEqualTo(BigDecimal value) {
            addCriterion("LENGTH_ADDWMAX <>", value, "lengthAddwmax");
            return (Criteria) this;
        }

        public Criteria andLengthAddwmaxGreaterThan(BigDecimal value) {
            addCriterion("LENGTH_ADDWMAX >", value, "lengthAddwmax");
            return (Criteria) this;
        }

        public Criteria andLengthAddwmaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LENGTH_ADDWMAX >=", value, "lengthAddwmax");
            return (Criteria) this;
        }

        public Criteria andLengthAddwmaxLessThan(BigDecimal value) {
            addCriterion("LENGTH_ADDWMAX <", value, "lengthAddwmax");
            return (Criteria) this;
        }

        public Criteria andLengthAddwmaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LENGTH_ADDWMAX <=", value, "lengthAddwmax");
            return (Criteria) this;
        }

        public Criteria andLengthAddwmaxIn(List<BigDecimal> values) {
            addCriterion("LENGTH_ADDWMAX in", values, "lengthAddwmax");
            return (Criteria) this;
        }

        public Criteria andLengthAddwmaxNotIn(List<BigDecimal> values) {
            addCriterion("LENGTH_ADDWMAX not in", values, "lengthAddwmax");
            return (Criteria) this;
        }

        public Criteria andLengthAddwmaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LENGTH_ADDWMAX between", value1, value2, "lengthAddwmax");
            return (Criteria) this;
        }

        public Criteria andLengthAddwmaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LENGTH_ADDWMAX not between", value1, value2, "lengthAddwmax");
            return (Criteria) this;
        }

        public Criteria andWeightMaxIsNull() {
            addCriterion("WEIGHT_MAX is null");
            return (Criteria) this;
        }

        public Criteria andWeightMaxIsNotNull() {
            addCriterion("WEIGHT_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andWeightMaxEqualTo(BigDecimal value) {
            addCriterion("WEIGHT_MAX =", value, "weightMax");
            return (Criteria) this;
        }

        public Criteria andWeightMaxNotEqualTo(BigDecimal value) {
            addCriterion("WEIGHT_MAX <>", value, "weightMax");
            return (Criteria) this;
        }

        public Criteria andWeightMaxGreaterThan(BigDecimal value) {
            addCriterion("WEIGHT_MAX >", value, "weightMax");
            return (Criteria) this;
        }

        public Criteria andWeightMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT_MAX >=", value, "weightMax");
            return (Criteria) this;
        }

        public Criteria andWeightMaxLessThan(BigDecimal value) {
            addCriterion("WEIGHT_MAX <", value, "weightMax");
            return (Criteria) this;
        }

        public Criteria andWeightMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT_MAX <=", value, "weightMax");
            return (Criteria) this;
        }

        public Criteria andWeightMaxIn(List<BigDecimal> values) {
            addCriterion("WEIGHT_MAX in", values, "weightMax");
            return (Criteria) this;
        }

        public Criteria andWeightMaxNotIn(List<BigDecimal> values) {
            addCriterion("WEIGHT_MAX not in", values, "weightMax");
            return (Criteria) this;
        }

        public Criteria andWeightMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT_MAX between", value1, value2, "weightMax");
            return (Criteria) this;
        }

        public Criteria andWeightMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT_MAX not between", value1, value2, "weightMax");
            return (Criteria) this;
        }

        public Criteria andDiagonalMaxIsNull() {
            addCriterion("DIAGONAL_MAX is null");
            return (Criteria) this;
        }

        public Criteria andDiagonalMaxIsNotNull() {
            addCriterion("DIAGONAL_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andDiagonalMaxEqualTo(BigDecimal value) {
            addCriterion("DIAGONAL_MAX =", value, "diagonalMax");
            return (Criteria) this;
        }

        public Criteria andDiagonalMaxNotEqualTo(BigDecimal value) {
            addCriterion("DIAGONAL_MAX <>", value, "diagonalMax");
            return (Criteria) this;
        }

        public Criteria andDiagonalMaxGreaterThan(BigDecimal value) {
            addCriterion("DIAGONAL_MAX >", value, "diagonalMax");
            return (Criteria) this;
        }

        public Criteria andDiagonalMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DIAGONAL_MAX >=", value, "diagonalMax");
            return (Criteria) this;
        }

        public Criteria andDiagonalMaxLessThan(BigDecimal value) {
            addCriterion("DIAGONAL_MAX <", value, "diagonalMax");
            return (Criteria) this;
        }

        public Criteria andDiagonalMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DIAGONAL_MAX <=", value, "diagonalMax");
            return (Criteria) this;
        }

        public Criteria andDiagonalMaxIn(List<BigDecimal> values) {
            addCriterion("DIAGONAL_MAX in", values, "diagonalMax");
            return (Criteria) this;
        }

        public Criteria andDiagonalMaxNotIn(List<BigDecimal> values) {
            addCriterion("DIAGONAL_MAX not in", values, "diagonalMax");
            return (Criteria) this;
        }

        public Criteria andDiagonalMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIAGONAL_MAX between", value1, value2, "diagonalMax");
            return (Criteria) this;
        }

        public Criteria andDiagonalMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIAGONAL_MAX not between", value1, value2, "diagonalMax");
            return (Criteria) this;
        }

        public Criteria andYkgIsNull() {
            addCriterion("YKG is null");
            return (Criteria) this;
        }

        public Criteria andYkgIsNotNull() {
            addCriterion("YKG is not null");
            return (Criteria) this;
        }

        public Criteria andYkgEqualTo(BigDecimal value) {
            addCriterion("YKG =", value, "ykg");
            return (Criteria) this;
        }

        public Criteria andYkgNotEqualTo(BigDecimal value) {
            addCriterion("YKG <>", value, "ykg");
            return (Criteria) this;
        }

        public Criteria andYkgGreaterThan(BigDecimal value) {
            addCriterion("YKG >", value, "ykg");
            return (Criteria) this;
        }

        public Criteria andYkgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YKG >=", value, "ykg");
            return (Criteria) this;
        }

        public Criteria andYkgLessThan(BigDecimal value) {
            addCriterion("YKG <", value, "ykg");
            return (Criteria) this;
        }

        public Criteria andYkgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YKG <=", value, "ykg");
            return (Criteria) this;
        }

        public Criteria andYkgIn(List<BigDecimal> values) {
            addCriterion("YKG in", values, "ykg");
            return (Criteria) this;
        }

        public Criteria andYkgNotIn(List<BigDecimal> values) {
            addCriterion("YKG not in", values, "ykg");
            return (Criteria) this;
        }

        public Criteria andYkgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YKG between", value1, value2, "ykg");
            return (Criteria) this;
        }

        public Criteria andYkgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YKG not between", value1, value2, "ykg");
            return (Criteria) this;
        }

        public Criteria andYkgPrice9IsNull() {
            addCriterion("YKG_PRICE9 is null");
            return (Criteria) this;
        }

        public Criteria andYkgPrice9IsNotNull() {
            addCriterion("YKG_PRICE9 is not null");
            return (Criteria) this;
        }

        public Criteria andYkgPrice9EqualTo(BigDecimal value) {
            addCriterion("YKG_PRICE9 =", value, "ykgPrice9");
            return (Criteria) this;
        }

        public Criteria andYkgPrice9NotEqualTo(BigDecimal value) {
            addCriterion("YKG_PRICE9 <>", value, "ykgPrice9");
            return (Criteria) this;
        }

        public Criteria andYkgPrice9GreaterThan(BigDecimal value) {
            addCriterion("YKG_PRICE9 >", value, "ykgPrice9");
            return (Criteria) this;
        }

        public Criteria andYkgPrice9GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YKG_PRICE9 >=", value, "ykgPrice9");
            return (Criteria) this;
        }

        public Criteria andYkgPrice9LessThan(BigDecimal value) {
            addCriterion("YKG_PRICE9 <", value, "ykgPrice9");
            return (Criteria) this;
        }

        public Criteria andYkgPrice9LessThanOrEqualTo(BigDecimal value) {
            addCriterion("YKG_PRICE9 <=", value, "ykgPrice9");
            return (Criteria) this;
        }

        public Criteria andYkgPrice9In(List<BigDecimal> values) {
            addCriterion("YKG_PRICE9 in", values, "ykgPrice9");
            return (Criteria) this;
        }

        public Criteria andYkgPrice9NotIn(List<BigDecimal> values) {
            addCriterion("YKG_PRICE9 not in", values, "ykgPrice9");
            return (Criteria) this;
        }

        public Criteria andYkgPrice9Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("YKG_PRICE9 between", value1, value2, "ykgPrice9");
            return (Criteria) this;
        }

        public Criteria andYkgPrice9NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YKG_PRICE9 not between", value1, value2, "ykgPrice9");
            return (Criteria) this;
        }

        public Criteria andYkgPrice10IsNull() {
            addCriterion("YKG_PRICE10 is null");
            return (Criteria) this;
        }

        public Criteria andYkgPrice10IsNotNull() {
            addCriterion("YKG_PRICE10 is not null");
            return (Criteria) this;
        }

        public Criteria andYkgPrice10EqualTo(BigDecimal value) {
            addCriterion("YKG_PRICE10 =", value, "ykgPrice10");
            return (Criteria) this;
        }

        public Criteria andYkgPrice10NotEqualTo(BigDecimal value) {
            addCriterion("YKG_PRICE10 <>", value, "ykgPrice10");
            return (Criteria) this;
        }

        public Criteria andYkgPrice10GreaterThan(BigDecimal value) {
            addCriterion("YKG_PRICE10 >", value, "ykgPrice10");
            return (Criteria) this;
        }

        public Criteria andYkgPrice10GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YKG_PRICE10 >=", value, "ykgPrice10");
            return (Criteria) this;
        }

        public Criteria andYkgPrice10LessThan(BigDecimal value) {
            addCriterion("YKG_PRICE10 <", value, "ykgPrice10");
            return (Criteria) this;
        }

        public Criteria andYkgPrice10LessThanOrEqualTo(BigDecimal value) {
            addCriterion("YKG_PRICE10 <=", value, "ykgPrice10");
            return (Criteria) this;
        }

        public Criteria andYkgPrice10In(List<BigDecimal> values) {
            addCriterion("YKG_PRICE10 in", values, "ykgPrice10");
            return (Criteria) this;
        }

        public Criteria andYkgPrice10NotIn(List<BigDecimal> values) {
            addCriterion("YKG_PRICE10 not in", values, "ykgPrice10");
            return (Criteria) this;
        }

        public Criteria andYkgPrice10Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("YKG_PRICE10 between", value1, value2, "ykgPrice10");
            return (Criteria) this;
        }

        public Criteria andYkgPrice10NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YKG_PRICE10 not between", value1, value2, "ykgPrice10");
            return (Criteria) this;
        }

        public Criteria andOverweightNumIsNull() {
            addCriterion("OVERWEIGHT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andOverweightNumIsNotNull() {
            addCriterion("OVERWEIGHT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andOverweightNumEqualTo(BigDecimal value) {
            addCriterion("OVERWEIGHT_NUM =", value, "overweightNum");
            return (Criteria) this;
        }

        public Criteria andOverweightNumNotEqualTo(BigDecimal value) {
            addCriterion("OVERWEIGHT_NUM <>", value, "overweightNum");
            return (Criteria) this;
        }

        public Criteria andOverweightNumGreaterThan(BigDecimal value) {
            addCriterion("OVERWEIGHT_NUM >", value, "overweightNum");
            return (Criteria) this;
        }

        public Criteria andOverweightNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OVERWEIGHT_NUM >=", value, "overweightNum");
            return (Criteria) this;
        }

        public Criteria andOverweightNumLessThan(BigDecimal value) {
            addCriterion("OVERWEIGHT_NUM <", value, "overweightNum");
            return (Criteria) this;
        }

        public Criteria andOverweightNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OVERWEIGHT_NUM <=", value, "overweightNum");
            return (Criteria) this;
        }

        public Criteria andOverweightNumIn(List<BigDecimal> values) {
            addCriterion("OVERWEIGHT_NUM in", values, "overweightNum");
            return (Criteria) this;
        }

        public Criteria andOverweightNumNotIn(List<BigDecimal> values) {
            addCriterion("OVERWEIGHT_NUM not in", values, "overweightNum");
            return (Criteria) this;
        }

        public Criteria andOverweightNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OVERWEIGHT_NUM between", value1, value2, "overweightNum");
            return (Criteria) this;
        }

        public Criteria andOverweightNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OVERWEIGHT_NUM not between", value1, value2, "overweightNum");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice9IsNull() {
            addCriterion("OVERWEIGHT_PRICE9 is null");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice9IsNotNull() {
            addCriterion("OVERWEIGHT_PRICE9 is not null");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice9EqualTo(BigDecimal value) {
            addCriterion("OVERWEIGHT_PRICE9 =", value, "overweightPrice9");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice9NotEqualTo(BigDecimal value) {
            addCriterion("OVERWEIGHT_PRICE9 <>", value, "overweightPrice9");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice9GreaterThan(BigDecimal value) {
            addCriterion("OVERWEIGHT_PRICE9 >", value, "overweightPrice9");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice9GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OVERWEIGHT_PRICE9 >=", value, "overweightPrice9");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice9LessThan(BigDecimal value) {
            addCriterion("OVERWEIGHT_PRICE9 <", value, "overweightPrice9");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice9LessThanOrEqualTo(BigDecimal value) {
            addCriterion("OVERWEIGHT_PRICE9 <=", value, "overweightPrice9");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice9In(List<BigDecimal> values) {
            addCriterion("OVERWEIGHT_PRICE9 in", values, "overweightPrice9");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice9NotIn(List<BigDecimal> values) {
            addCriterion("OVERWEIGHT_PRICE9 not in", values, "overweightPrice9");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice9Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("OVERWEIGHT_PRICE9 between", value1, value2, "overweightPrice9");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice9NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OVERWEIGHT_PRICE9 not between", value1, value2, "overweightPrice9");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice10IsNull() {
            addCriterion("OVERWEIGHT_PRICE10 is null");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice10IsNotNull() {
            addCriterion("OVERWEIGHT_PRICE10 is not null");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice10EqualTo(BigDecimal value) {
            addCriterion("OVERWEIGHT_PRICE10 =", value, "overweightPrice10");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice10NotEqualTo(BigDecimal value) {
            addCriterion("OVERWEIGHT_PRICE10 <>", value, "overweightPrice10");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice10GreaterThan(BigDecimal value) {
            addCriterion("OVERWEIGHT_PRICE10 >", value, "overweightPrice10");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice10GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OVERWEIGHT_PRICE10 >=", value, "overweightPrice10");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice10LessThan(BigDecimal value) {
            addCriterion("OVERWEIGHT_PRICE10 <", value, "overweightPrice10");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice10LessThanOrEqualTo(BigDecimal value) {
            addCriterion("OVERWEIGHT_PRICE10 <=", value, "overweightPrice10");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice10In(List<BigDecimal> values) {
            addCriterion("OVERWEIGHT_PRICE10 in", values, "overweightPrice10");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice10NotIn(List<BigDecimal> values) {
            addCriterion("OVERWEIGHT_PRICE10 not in", values, "overweightPrice10");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice10Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("OVERWEIGHT_PRICE10 between", value1, value2, "overweightPrice10");
            return (Criteria) this;
        }

        public Criteria andOverweightPrice10NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OVERWEIGHT_PRICE10 not between", value1, value2, "overweightPrice10");
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