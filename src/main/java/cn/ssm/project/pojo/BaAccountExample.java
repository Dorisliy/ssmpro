package cn.ssm.project.pojo;

import java.util.ArrayList;
import java.util.List;

public class BaAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaAccountExample() {
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

        public Criteria andAccountIsNull() {
            addCriterion("ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("ACCOUNT =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("ACCOUNT <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("ACCOUNT >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("ACCOUNT <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("ACCOUNT like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("ACCOUNT not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("ACCOUNT in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("ACCOUNT not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("ACCOUNT between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Integer value) {
            addCriterion("CHANNEL_ID =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Integer value) {
            addCriterion("CHANNEL_ID <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Integer value) {
            addCriterion("CHANNEL_ID >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHANNEL_ID >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Integer value) {
            addCriterion("CHANNEL_ID <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Integer value) {
            addCriterion("CHANNEL_ID <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Integer> values) {
            addCriterion("CHANNEL_ID in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Integer> values) {
            addCriterion("CHANNEL_ID not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Integer value1, Integer value2) {
            addCriterion("CHANNEL_ID between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andMerchantidIsNull() {
            addCriterion("MERCHANTID is null");
            return (Criteria) this;
        }

        public Criteria andMerchantidIsNotNull() {
            addCriterion("MERCHANTID is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantidEqualTo(String value) {
            addCriterion("MERCHANTID =", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotEqualTo(String value) {
            addCriterion("MERCHANTID <>", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidGreaterThan(String value) {
            addCriterion("MERCHANTID >", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANTID >=", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidLessThan(String value) {
            addCriterion("MERCHANTID <", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidLessThanOrEqualTo(String value) {
            addCriterion("MERCHANTID <=", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidLike(String value) {
            addCriterion("MERCHANTID like", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotLike(String value) {
            addCriterion("MERCHANTID not like", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidIn(List<String> values) {
            addCriterion("MERCHANTID in", values, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotIn(List<String> values) {
            addCriterion("MERCHANTID not in", values, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidBetween(String value1, String value2) {
            addCriterion("MERCHANTID between", value1, value2, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotBetween(String value1, String value2) {
            addCriterion("MERCHANTID not between", value1, value2, "merchantid");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("AREA_ID =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("AREA_ID <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("AREA_ID >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AREA_ID >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("AREA_ID <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("AREA_ID <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("AREA_ID in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("AREA_ID not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("AREA_ID between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AREA_ID not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNull() {
            addCriterion("COUNTRY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("COUNTRY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(Integer value) {
            addCriterion("COUNTRY_ID =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Integer value) {
            addCriterion("COUNTRY_ID <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Integer value) {
            addCriterion("COUNTRY_ID >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNTRY_ID >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Integer value) {
            addCriterion("COUNTRY_ID <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Integer value) {
            addCriterion("COUNTRY_ID <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Integer> values) {
            addCriterion("COUNTRY_ID in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Integer> values) {
            addCriterion("COUNTRY_ID not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Integer value1, Integer value2) {
            addCriterion("COUNTRY_ID between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COUNTRY_ID not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andOrganisationIdIsNull() {
            addCriterion("ORGANISATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrganisationIdIsNotNull() {
            addCriterion("ORGANISATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrganisationIdEqualTo(Integer value) {
            addCriterion("ORGANISATION_ID =", value, "organisationId");
            return (Criteria) this;
        }

        public Criteria andOrganisationIdNotEqualTo(Integer value) {
            addCriterion("ORGANISATION_ID <>", value, "organisationId");
            return (Criteria) this;
        }

        public Criteria andOrganisationIdGreaterThan(Integer value) {
            addCriterion("ORGANISATION_ID >", value, "organisationId");
            return (Criteria) this;
        }

        public Criteria andOrganisationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORGANISATION_ID >=", value, "organisationId");
            return (Criteria) this;
        }

        public Criteria andOrganisationIdLessThan(Integer value) {
            addCriterion("ORGANISATION_ID <", value, "organisationId");
            return (Criteria) this;
        }

        public Criteria andOrganisationIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORGANISATION_ID <=", value, "organisationId");
            return (Criteria) this;
        }

        public Criteria andOrganisationIdIn(List<Integer> values) {
            addCriterion("ORGANISATION_ID in", values, "organisationId");
            return (Criteria) this;
        }

        public Criteria andOrganisationIdNotIn(List<Integer> values) {
            addCriterion("ORGANISATION_ID not in", values, "organisationId");
            return (Criteria) this;
        }

        public Criteria andOrganisationIdBetween(Integer value1, Integer value2) {
            addCriterion("ORGANISATION_ID between", value1, value2, "organisationId");
            return (Criteria) this;
        }

        public Criteria andOrganisationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORGANISATION_ID not between", value1, value2, "organisationId");
            return (Criteria) this;
        }

        public Criteria andSalesBrandTypeIsNull() {
            addCriterion("SALES_BRAND_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSalesBrandTypeIsNotNull() {
            addCriterion("SALES_BRAND_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSalesBrandTypeEqualTo(String value) {
            addCriterion("SALES_BRAND_TYPE =", value, "salesBrandType");
            return (Criteria) this;
        }

        public Criteria andSalesBrandTypeNotEqualTo(String value) {
            addCriterion("SALES_BRAND_TYPE <>", value, "salesBrandType");
            return (Criteria) this;
        }

        public Criteria andSalesBrandTypeGreaterThan(String value) {
            addCriterion("SALES_BRAND_TYPE >", value, "salesBrandType");
            return (Criteria) this;
        }

        public Criteria andSalesBrandTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SALES_BRAND_TYPE >=", value, "salesBrandType");
            return (Criteria) this;
        }

        public Criteria andSalesBrandTypeLessThan(String value) {
            addCriterion("SALES_BRAND_TYPE <", value, "salesBrandType");
            return (Criteria) this;
        }

        public Criteria andSalesBrandTypeLessThanOrEqualTo(String value) {
            addCriterion("SALES_BRAND_TYPE <=", value, "salesBrandType");
            return (Criteria) this;
        }

        public Criteria andSalesBrandTypeLike(String value) {
            addCriterion("SALES_BRAND_TYPE like", value, "salesBrandType");
            return (Criteria) this;
        }

        public Criteria andSalesBrandTypeNotLike(String value) {
            addCriterion("SALES_BRAND_TYPE not like", value, "salesBrandType");
            return (Criteria) this;
        }

        public Criteria andSalesBrandTypeIn(List<String> values) {
            addCriterion("SALES_BRAND_TYPE in", values, "salesBrandType");
            return (Criteria) this;
        }

        public Criteria andSalesBrandTypeNotIn(List<String> values) {
            addCriterion("SALES_BRAND_TYPE not in", values, "salesBrandType");
            return (Criteria) this;
        }

        public Criteria andSalesBrandTypeBetween(String value1, String value2) {
            addCriterion("SALES_BRAND_TYPE between", value1, value2, "salesBrandType");
            return (Criteria) this;
        }

        public Criteria andSalesBrandTypeNotBetween(String value1, String value2) {
            addCriterion("SALES_BRAND_TYPE not between", value1, value2, "salesBrandType");
            return (Criteria) this;
        }

        public Criteria andAccountStateIsNull() {
            addCriterion("ACCOUNT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andAccountStateIsNotNull() {
            addCriterion("ACCOUNT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountStateEqualTo(Short value) {
            addCriterion("ACCOUNT_STATE =", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotEqualTo(Short value) {
            addCriterion("ACCOUNT_STATE <>", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateGreaterThan(Short value) {
            addCriterion("ACCOUNT_STATE >", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateGreaterThanOrEqualTo(Short value) {
            addCriterion("ACCOUNT_STATE >=", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateLessThan(Short value) {
            addCriterion("ACCOUNT_STATE <", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateLessThanOrEqualTo(Short value) {
            addCriterion("ACCOUNT_STATE <=", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateIn(List<Short> values) {
            addCriterion("ACCOUNT_STATE in", values, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotIn(List<Short> values) {
            addCriterion("ACCOUNT_STATE not in", values, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateBetween(Short value1, Short value2) {
            addCriterion("ACCOUNT_STATE between", value1, value2, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotBetween(Short value1, Short value2) {
            addCriterion("ACCOUNT_STATE not between", value1, value2, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountRemarksIsNull() {
            addCriterion("ACCOUNT_REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andAccountRemarksIsNotNull() {
            addCriterion("ACCOUNT_REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andAccountRemarksEqualTo(String value) {
            addCriterion("ACCOUNT_REMARKS =", value, "accountRemarks");
            return (Criteria) this;
        }

        public Criteria andAccountRemarksNotEqualTo(String value) {
            addCriterion("ACCOUNT_REMARKS <>", value, "accountRemarks");
            return (Criteria) this;
        }

        public Criteria andAccountRemarksGreaterThan(String value) {
            addCriterion("ACCOUNT_REMARKS >", value, "accountRemarks");
            return (Criteria) this;
        }

        public Criteria andAccountRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_REMARKS >=", value, "accountRemarks");
            return (Criteria) this;
        }

        public Criteria andAccountRemarksLessThan(String value) {
            addCriterion("ACCOUNT_REMARKS <", value, "accountRemarks");
            return (Criteria) this;
        }

        public Criteria andAccountRemarksLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_REMARKS <=", value, "accountRemarks");
            return (Criteria) this;
        }

        public Criteria andAccountRemarksLike(String value) {
            addCriterion("ACCOUNT_REMARKS like", value, "accountRemarks");
            return (Criteria) this;
        }

        public Criteria andAccountRemarksNotLike(String value) {
            addCriterion("ACCOUNT_REMARKS not like", value, "accountRemarks");
            return (Criteria) this;
        }

        public Criteria andAccountRemarksIn(List<String> values) {
            addCriterion("ACCOUNT_REMARKS in", values, "accountRemarks");
            return (Criteria) this;
        }

        public Criteria andAccountRemarksNotIn(List<String> values) {
            addCriterion("ACCOUNT_REMARKS not in", values, "accountRemarks");
            return (Criteria) this;
        }

        public Criteria andAccountRemarksBetween(String value1, String value2) {
            addCriterion("ACCOUNT_REMARKS between", value1, value2, "accountRemarks");
            return (Criteria) this;
        }

        public Criteria andAccountRemarksNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_REMARKS not between", value1, value2, "accountRemarks");
            return (Criteria) this;
        }

        public Criteria andMwsMpIsNull() {
            addCriterion("MWS_MP is null");
            return (Criteria) this;
        }

        public Criteria andMwsMpIsNotNull() {
            addCriterion("MWS_MP is not null");
            return (Criteria) this;
        }

        public Criteria andMwsMpEqualTo(String value) {
            addCriterion("MWS_MP =", value, "mwsMp");
            return (Criteria) this;
        }

        public Criteria andMwsMpNotEqualTo(String value) {
            addCriterion("MWS_MP <>", value, "mwsMp");
            return (Criteria) this;
        }

        public Criteria andMwsMpGreaterThan(String value) {
            addCriterion("MWS_MP >", value, "mwsMp");
            return (Criteria) this;
        }

        public Criteria andMwsMpGreaterThanOrEqualTo(String value) {
            addCriterion("MWS_MP >=", value, "mwsMp");
            return (Criteria) this;
        }

        public Criteria andMwsMpLessThan(String value) {
            addCriterion("MWS_MP <", value, "mwsMp");
            return (Criteria) this;
        }

        public Criteria andMwsMpLessThanOrEqualTo(String value) {
            addCriterion("MWS_MP <=", value, "mwsMp");
            return (Criteria) this;
        }

        public Criteria andMwsMpLike(String value) {
            addCriterion("MWS_MP like", value, "mwsMp");
            return (Criteria) this;
        }

        public Criteria andMwsMpNotLike(String value) {
            addCriterion("MWS_MP not like", value, "mwsMp");
            return (Criteria) this;
        }

        public Criteria andMwsMpIn(List<String> values) {
            addCriterion("MWS_MP in", values, "mwsMp");
            return (Criteria) this;
        }

        public Criteria andMwsMpNotIn(List<String> values) {
            addCriterion("MWS_MP not in", values, "mwsMp");
            return (Criteria) this;
        }

        public Criteria andMwsMpBetween(String value1, String value2) {
            addCriterion("MWS_MP between", value1, value2, "mwsMp");
            return (Criteria) this;
        }

        public Criteria andMwsMpNotBetween(String value1, String value2) {
            addCriterion("MWS_MP not between", value1, value2, "mwsMp");
            return (Criteria) this;
        }

        public Criteria andMwsAkeyIsNull() {
            addCriterion("MWS_AKey is null");
            return (Criteria) this;
        }

        public Criteria andMwsAkeyIsNotNull() {
            addCriterion("MWS_AKey is not null");
            return (Criteria) this;
        }

        public Criteria andMwsAkeyEqualTo(String value) {
            addCriterion("MWS_AKey =", value, "mwsAkey");
            return (Criteria) this;
        }

        public Criteria andMwsAkeyNotEqualTo(String value) {
            addCriterion("MWS_AKey <>", value, "mwsAkey");
            return (Criteria) this;
        }

        public Criteria andMwsAkeyGreaterThan(String value) {
            addCriterion("MWS_AKey >", value, "mwsAkey");
            return (Criteria) this;
        }

        public Criteria andMwsAkeyGreaterThanOrEqualTo(String value) {
            addCriterion("MWS_AKey >=", value, "mwsAkey");
            return (Criteria) this;
        }

        public Criteria andMwsAkeyLessThan(String value) {
            addCriterion("MWS_AKey <", value, "mwsAkey");
            return (Criteria) this;
        }

        public Criteria andMwsAkeyLessThanOrEqualTo(String value) {
            addCriterion("MWS_AKey <=", value, "mwsAkey");
            return (Criteria) this;
        }

        public Criteria andMwsAkeyLike(String value) {
            addCriterion("MWS_AKey like", value, "mwsAkey");
            return (Criteria) this;
        }

        public Criteria andMwsAkeyNotLike(String value) {
            addCriterion("MWS_AKey not like", value, "mwsAkey");
            return (Criteria) this;
        }

        public Criteria andMwsAkeyIn(List<String> values) {
            addCriterion("MWS_AKey in", values, "mwsAkey");
            return (Criteria) this;
        }

        public Criteria andMwsAkeyNotIn(List<String> values) {
            addCriterion("MWS_AKey not in", values, "mwsAkey");
            return (Criteria) this;
        }

        public Criteria andMwsAkeyBetween(String value1, String value2) {
            addCriterion("MWS_AKey between", value1, value2, "mwsAkey");
            return (Criteria) this;
        }

        public Criteria andMwsAkeyNotBetween(String value1, String value2) {
            addCriterion("MWS_AKey not between", value1, value2, "mwsAkey");
            return (Criteria) this;
        }

        public Criteria andMwsSkeyIsNull() {
            addCriterion("MWS_SKey is null");
            return (Criteria) this;
        }

        public Criteria andMwsSkeyIsNotNull() {
            addCriterion("MWS_SKey is not null");
            return (Criteria) this;
        }

        public Criteria andMwsSkeyEqualTo(String value) {
            addCriterion("MWS_SKey =", value, "mwsSkey");
            return (Criteria) this;
        }

        public Criteria andMwsSkeyNotEqualTo(String value) {
            addCriterion("MWS_SKey <>", value, "mwsSkey");
            return (Criteria) this;
        }

        public Criteria andMwsSkeyGreaterThan(String value) {
            addCriterion("MWS_SKey >", value, "mwsSkey");
            return (Criteria) this;
        }

        public Criteria andMwsSkeyGreaterThanOrEqualTo(String value) {
            addCriterion("MWS_SKey >=", value, "mwsSkey");
            return (Criteria) this;
        }

        public Criteria andMwsSkeyLessThan(String value) {
            addCriterion("MWS_SKey <", value, "mwsSkey");
            return (Criteria) this;
        }

        public Criteria andMwsSkeyLessThanOrEqualTo(String value) {
            addCriterion("MWS_SKey <=", value, "mwsSkey");
            return (Criteria) this;
        }

        public Criteria andMwsSkeyLike(String value) {
            addCriterion("MWS_SKey like", value, "mwsSkey");
            return (Criteria) this;
        }

        public Criteria andMwsSkeyNotLike(String value) {
            addCriterion("MWS_SKey not like", value, "mwsSkey");
            return (Criteria) this;
        }

        public Criteria andMwsSkeyIn(List<String> values) {
            addCriterion("MWS_SKey in", values, "mwsSkey");
            return (Criteria) this;
        }

        public Criteria andMwsSkeyNotIn(List<String> values) {
            addCriterion("MWS_SKey not in", values, "mwsSkey");
            return (Criteria) this;
        }

        public Criteria andMwsSkeyBetween(String value1, String value2) {
            addCriterion("MWS_SKey between", value1, value2, "mwsSkey");
            return (Criteria) this;
        }

        public Criteria andMwsSkeyNotBetween(String value1, String value2) {
            addCriterion("MWS_SKey not between", value1, value2, "mwsSkey");
            return (Criteria) this;
        }

        public Criteria andMwsUrlIsNull() {
            addCriterion("MWS_URL is null");
            return (Criteria) this;
        }

        public Criteria andMwsUrlIsNotNull() {
            addCriterion("MWS_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMwsUrlEqualTo(String value) {
            addCriterion("MWS_URL =", value, "mwsUrl");
            return (Criteria) this;
        }

        public Criteria andMwsUrlNotEqualTo(String value) {
            addCriterion("MWS_URL <>", value, "mwsUrl");
            return (Criteria) this;
        }

        public Criteria andMwsUrlGreaterThan(String value) {
            addCriterion("MWS_URL >", value, "mwsUrl");
            return (Criteria) this;
        }

        public Criteria andMwsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MWS_URL >=", value, "mwsUrl");
            return (Criteria) this;
        }

        public Criteria andMwsUrlLessThan(String value) {
            addCriterion("MWS_URL <", value, "mwsUrl");
            return (Criteria) this;
        }

        public Criteria andMwsUrlLessThanOrEqualTo(String value) {
            addCriterion("MWS_URL <=", value, "mwsUrl");
            return (Criteria) this;
        }

        public Criteria andMwsUrlLike(String value) {
            addCriterion("MWS_URL like", value, "mwsUrl");
            return (Criteria) this;
        }

        public Criteria andMwsUrlNotLike(String value) {
            addCriterion("MWS_URL not like", value, "mwsUrl");
            return (Criteria) this;
        }

        public Criteria andMwsUrlIn(List<String> values) {
            addCriterion("MWS_URL in", values, "mwsUrl");
            return (Criteria) this;
        }

        public Criteria andMwsUrlNotIn(List<String> values) {
            addCriterion("MWS_URL not in", values, "mwsUrl");
            return (Criteria) this;
        }

        public Criteria andMwsUrlBetween(String value1, String value2) {
            addCriterion("MWS_URL between", value1, value2, "mwsUrl");
            return (Criteria) this;
        }

        public Criteria andMwsUrlNotBetween(String value1, String value2) {
            addCriterion("MWS_URL not between", value1, value2, "mwsUrl");
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