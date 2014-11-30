/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.user.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings("ucd")
public class BillingAccountExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table s_account
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table s_account
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table s_account
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    public BillingAccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table s_account
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    @SuppressWarnings("ucd")
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIsNull() {
            addCriterion("createdTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIsNotNull() {
            addCriterion("createdTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeEqualTo(Date value) {
            addCriterion("createdTime =", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotEqualTo(Date value) {
            addCriterion("createdTime <>", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeGreaterThan(Date value) {
            addCriterion("createdTime >", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createdTime >=", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeLessThan(Date value) {
            addCriterion("createdTime <", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeLessThanOrEqualTo(Date value) {
            addCriterion("createdTime <=", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIn(List<Date> values) {
            addCriterion("createdTime in", values, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotIn(List<Date> values) {
            addCriterion("createdTime not in", values, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeBetween(Date value1, Date value2) {
            addCriterion("createdTime between", value1, value2, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotBetween(Date value1, Date value2) {
            addCriterion("createdTime not between", value1, value2, "createdtime");
            return (Criteria) this;
        }

        public Criteria andBillingplanidIsNull() {
            addCriterion("billingPlanId is null");
            return (Criteria) this;
        }

        public Criteria andBillingplanidIsNotNull() {
            addCriterion("billingPlanId is not null");
            return (Criteria) this;
        }

        public Criteria andBillingplanidEqualTo(Integer value) {
            addCriterion("billingPlanId =", value, "billingplanid");
            return (Criteria) this;
        }

        public Criteria andBillingplanidNotEqualTo(Integer value) {
            addCriterion("billingPlanId <>", value, "billingplanid");
            return (Criteria) this;
        }

        public Criteria andBillingplanidGreaterThan(Integer value) {
            addCriterion("billingPlanId >", value, "billingplanid");
            return (Criteria) this;
        }

        public Criteria andBillingplanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("billingPlanId >=", value, "billingplanid");
            return (Criteria) this;
        }

        public Criteria andBillingplanidLessThan(Integer value) {
            addCriterion("billingPlanId <", value, "billingplanid");
            return (Criteria) this;
        }

        public Criteria andBillingplanidLessThanOrEqualTo(Integer value) {
            addCriterion("billingPlanId <=", value, "billingplanid");
            return (Criteria) this;
        }

        public Criteria andBillingplanidIn(List<Integer> values) {
            addCriterion("billingPlanId in", values, "billingplanid");
            return (Criteria) this;
        }

        public Criteria andBillingplanidNotIn(List<Integer> values) {
            addCriterion("billingPlanId not in", values, "billingplanid");
            return (Criteria) this;
        }

        public Criteria andBillingplanidBetween(Integer value1, Integer value2) {
            addCriterion("billingPlanId between", value1, value2, "billingplanid");
            return (Criteria) this;
        }

        public Criteria andBillingplanidNotBetween(Integer value1, Integer value2) {
            addCriterion("billingPlanId not between", value1, value2, "billingplanid");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNull() {
            addCriterion("accountName is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("accountName is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("accountName =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("accountName <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("accountName >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("accountName >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("accountName <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("accountName <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("accountName like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("accountName not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("accountName in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("accountName not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("accountName between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("accountName not between", value1, value2, "accountname");
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

        public Criteria andPaymentmethodIsNull() {
            addCriterion("paymentMethod is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIsNotNull() {
            addCriterion("paymentMethod is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodEqualTo(String value) {
            addCriterion("paymentMethod =", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotEqualTo(String value) {
            addCriterion("paymentMethod <>", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThan(String value) {
            addCriterion("paymentMethod >", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThanOrEqualTo(String value) {
            addCriterion("paymentMethod >=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThan(String value) {
            addCriterion("paymentMethod <", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThanOrEqualTo(String value) {
            addCriterion("paymentMethod <=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLike(String value) {
            addCriterion("paymentMethod like", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotLike(String value) {
            addCriterion("paymentMethod not like", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIn(List<String> values) {
            addCriterion("paymentMethod in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotIn(List<String> values) {
            addCriterion("paymentMethod not in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodBetween(String value1, String value2) {
            addCriterion("paymentMethod between", value1, value2, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotBetween(String value1, String value2) {
            addCriterion("paymentMethod not between", value1, value2, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPricingIsNull() {
            addCriterion("pricing is null");
            return (Criteria) this;
        }

        public Criteria andPricingIsNotNull() {
            addCriterion("pricing is not null");
            return (Criteria) this;
        }

        public Criteria andPricingEqualTo(Double value) {
            addCriterion("pricing =", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingNotEqualTo(Double value) {
            addCriterion("pricing <>", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingGreaterThan(Double value) {
            addCriterion("pricing >", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingGreaterThanOrEqualTo(Double value) {
            addCriterion("pricing >=", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingLessThan(Double value) {
            addCriterion("pricing <", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingLessThanOrEqualTo(Double value) {
            addCriterion("pricing <=", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingIn(List<Double> values) {
            addCriterion("pricing in", values, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingNotIn(List<Double> values) {
            addCriterion("pricing not in", values, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingBetween(Double value1, Double value2) {
            addCriterion("pricing between", value1, value2, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingNotBetween(Double value1, Double value2) {
            addCriterion("pricing not between", value1, value2, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingeffectfromIsNull() {
            addCriterion("pricingEffectFrom is null");
            return (Criteria) this;
        }

        public Criteria andPricingeffectfromIsNotNull() {
            addCriterion("pricingEffectFrom is not null");
            return (Criteria) this;
        }

        public Criteria andPricingeffectfromEqualTo(Date value) {
            addCriterion("pricingEffectFrom =", value, "pricingeffectfrom");
            return (Criteria) this;
        }

        public Criteria andPricingeffectfromNotEqualTo(Date value) {
            addCriterion("pricingEffectFrom <>", value, "pricingeffectfrom");
            return (Criteria) this;
        }

        public Criteria andPricingeffectfromGreaterThan(Date value) {
            addCriterion("pricingEffectFrom >", value, "pricingeffectfrom");
            return (Criteria) this;
        }

        public Criteria andPricingeffectfromGreaterThanOrEqualTo(Date value) {
            addCriterion("pricingEffectFrom >=", value, "pricingeffectfrom");
            return (Criteria) this;
        }

        public Criteria andPricingeffectfromLessThan(Date value) {
            addCriterion("pricingEffectFrom <", value, "pricingeffectfrom");
            return (Criteria) this;
        }

        public Criteria andPricingeffectfromLessThanOrEqualTo(Date value) {
            addCriterion("pricingEffectFrom <=", value, "pricingeffectfrom");
            return (Criteria) this;
        }

        public Criteria andPricingeffectfromIn(List<Date> values) {
            addCriterion("pricingEffectFrom in", values, "pricingeffectfrom");
            return (Criteria) this;
        }

        public Criteria andPricingeffectfromNotIn(List<Date> values) {
            addCriterion("pricingEffectFrom not in", values, "pricingeffectfrom");
            return (Criteria) this;
        }

        public Criteria andPricingeffectfromBetween(Date value1, Date value2) {
            addCriterion("pricingEffectFrom between", value1, value2, "pricingeffectfrom");
            return (Criteria) this;
        }

        public Criteria andPricingeffectfromNotBetween(Date value1, Date value2) {
            addCriterion("pricingEffectFrom not between", value1, value2, "pricingeffectfrom");
            return (Criteria) this;
        }

        public Criteria andPricingeffecttoIsNull() {
            addCriterion("pricingEffectTo is null");
            return (Criteria) this;
        }

        public Criteria andPricingeffecttoIsNotNull() {
            addCriterion("pricingEffectTo is not null");
            return (Criteria) this;
        }

        public Criteria andPricingeffecttoEqualTo(Date value) {
            addCriterion("pricingEffectTo =", value, "pricingeffectto");
            return (Criteria) this;
        }

        public Criteria andPricingeffecttoNotEqualTo(Date value) {
            addCriterion("pricingEffectTo <>", value, "pricingeffectto");
            return (Criteria) this;
        }

        public Criteria andPricingeffecttoGreaterThan(Date value) {
            addCriterion("pricingEffectTo >", value, "pricingeffectto");
            return (Criteria) this;
        }

        public Criteria andPricingeffecttoGreaterThanOrEqualTo(Date value) {
            addCriterion("pricingEffectTo >=", value, "pricingeffectto");
            return (Criteria) this;
        }

        public Criteria andPricingeffecttoLessThan(Date value) {
            addCriterion("pricingEffectTo <", value, "pricingeffectto");
            return (Criteria) this;
        }

        public Criteria andPricingeffecttoLessThanOrEqualTo(Date value) {
            addCriterion("pricingEffectTo <=", value, "pricingeffectto");
            return (Criteria) this;
        }

        public Criteria andPricingeffecttoIn(List<Date> values) {
            addCriterion("pricingEffectTo in", values, "pricingeffectto");
            return (Criteria) this;
        }

        public Criteria andPricingeffecttoNotIn(List<Date> values) {
            addCriterion("pricingEffectTo not in", values, "pricingeffectto");
            return (Criteria) this;
        }

        public Criteria andPricingeffecttoBetween(Date value1, Date value2) {
            addCriterion("pricingEffectTo between", value1, value2, "pricingeffectto");
            return (Criteria) this;
        }

        public Criteria andPricingeffecttoNotBetween(Date value1, Date value2) {
            addCriterion("pricingEffectTo not between", value1, value2, "pricingeffectto");
            return (Criteria) this;
        }

        public Criteria andSubdomainIsNull() {
            addCriterion("subdomain is null");
            return (Criteria) this;
        }

        public Criteria andSubdomainIsNotNull() {
            addCriterion("subdomain is not null");
            return (Criteria) this;
        }

        public Criteria andSubdomainEqualTo(String value) {
            addCriterion("subdomain =", value, "subdomain");
            return (Criteria) this;
        }

        public Criteria andSubdomainNotEqualTo(String value) {
            addCriterion("subdomain <>", value, "subdomain");
            return (Criteria) this;
        }

        public Criteria andSubdomainGreaterThan(String value) {
            addCriterion("subdomain >", value, "subdomain");
            return (Criteria) this;
        }

        public Criteria andSubdomainGreaterThanOrEqualTo(String value) {
            addCriterion("subdomain >=", value, "subdomain");
            return (Criteria) this;
        }

        public Criteria andSubdomainLessThan(String value) {
            addCriterion("subdomain <", value, "subdomain");
            return (Criteria) this;
        }

        public Criteria andSubdomainLessThanOrEqualTo(String value) {
            addCriterion("subdomain <=", value, "subdomain");
            return (Criteria) this;
        }

        public Criteria andSubdomainLike(String value) {
            addCriterion("subdomain like", value, "subdomain");
            return (Criteria) this;
        }

        public Criteria andSubdomainNotLike(String value) {
            addCriterion("subdomain not like", value, "subdomain");
            return (Criteria) this;
        }

        public Criteria andSubdomainIn(List<String> values) {
            addCriterion("subdomain in", values, "subdomain");
            return (Criteria) this;
        }

        public Criteria andSubdomainNotIn(List<String> values) {
            addCriterion("subdomain not in", values, "subdomain");
            return (Criteria) this;
        }

        public Criteria andSubdomainBetween(String value1, String value2) {
            addCriterion("subdomain between", value1, value2, "subdomain");
            return (Criteria) this;
        }

        public Criteria andSubdomainNotBetween(String value1, String value2) {
            addCriterion("subdomain not between", value1, value2, "subdomain");
            return (Criteria) this;
        }

        public Criteria andReminderstatusIsNull() {
            addCriterion("reminderStatus is null");
            return (Criteria) this;
        }

        public Criteria andReminderstatusIsNotNull() {
            addCriterion("reminderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andReminderstatusEqualTo(String value) {
            addCriterion("reminderStatus =", value, "reminderstatus");
            return (Criteria) this;
        }

        public Criteria andReminderstatusNotEqualTo(String value) {
            addCriterion("reminderStatus <>", value, "reminderstatus");
            return (Criteria) this;
        }

        public Criteria andReminderstatusGreaterThan(String value) {
            addCriterion("reminderStatus >", value, "reminderstatus");
            return (Criteria) this;
        }

        public Criteria andReminderstatusGreaterThanOrEqualTo(String value) {
            addCriterion("reminderStatus >=", value, "reminderstatus");
            return (Criteria) this;
        }

        public Criteria andReminderstatusLessThan(String value) {
            addCriterion("reminderStatus <", value, "reminderstatus");
            return (Criteria) this;
        }

        public Criteria andReminderstatusLessThanOrEqualTo(String value) {
            addCriterion("reminderStatus <=", value, "reminderstatus");
            return (Criteria) this;
        }

        public Criteria andReminderstatusLike(String value) {
            addCriterion("reminderStatus like", value, "reminderstatus");
            return (Criteria) this;
        }

        public Criteria andReminderstatusNotLike(String value) {
            addCriterion("reminderStatus not like", value, "reminderstatus");
            return (Criteria) this;
        }

        public Criteria andReminderstatusIn(List<String> values) {
            addCriterion("reminderStatus in", values, "reminderstatus");
            return (Criteria) this;
        }

        public Criteria andReminderstatusNotIn(List<String> values) {
            addCriterion("reminderStatus not in", values, "reminderstatus");
            return (Criteria) this;
        }

        public Criteria andReminderstatusBetween(String value1, String value2) {
            addCriterion("reminderStatus between", value1, value2, "reminderstatus");
            return (Criteria) this;
        }

        public Criteria andReminderstatusNotBetween(String value1, String value2) {
            addCriterion("reminderStatus not between", value1, value2, "reminderstatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table s_account
     *
     * @mbggenerated do_not_delete_during_merge Sun Nov 30 15:08:34 ICT 2014
     */
    @SuppressWarnings("ucd")
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table s_account
     *
     * @mbggenerated Sun Nov 30 15:08:34 ICT 2014
     */
    @SuppressWarnings("ucd")
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