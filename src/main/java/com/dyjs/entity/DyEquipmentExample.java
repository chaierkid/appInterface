package com.dyjs.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DyEquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DyEquipmentExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdIsNull() {
            addCriterion("equipment_type_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdIsNotNull() {
            addCriterion("equipment_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdEqualTo(String value) {
            addCriterion("equipment_type_id =", value, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdNotEqualTo(String value) {
            addCriterion("equipment_type_id <>", value, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdGreaterThan(String value) {
            addCriterion("equipment_type_id >", value, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_type_id >=", value, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdLessThan(String value) {
            addCriterion("equipment_type_id <", value, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdLessThanOrEqualTo(String value) {
            addCriterion("equipment_type_id <=", value, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdLike(String value) {
            addCriterion("equipment_type_id like", value, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdNotLike(String value) {
            addCriterion("equipment_type_id not like", value, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdIn(List<String> values) {
            addCriterion("equipment_type_id in", values, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdNotIn(List<String> values) {
            addCriterion("equipment_type_id not in", values, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdBetween(String value1, String value2) {
            addCriterion("equipment_type_id between", value1, value2, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentTypeIdNotBetween(String value1, String value2) {
            addCriterion("equipment_type_id not between", value1, value2, "equipmentTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdIsNull() {
            addCriterion("equipment_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdIsNotNull() {
            addCriterion("equipment_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdEqualTo(String value) {
            addCriterion("equipment_parent_id =", value, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdNotEqualTo(String value) {
            addCriterion("equipment_parent_id <>", value, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdGreaterThan(String value) {
            addCriterion("equipment_parent_id >", value, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_parent_id >=", value, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdLessThan(String value) {
            addCriterion("equipment_parent_id <", value, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdLessThanOrEqualTo(String value) {
            addCriterion("equipment_parent_id <=", value, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdLike(String value) {
            addCriterion("equipment_parent_id like", value, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdNotLike(String value) {
            addCriterion("equipment_parent_id not like", value, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdIn(List<String> values) {
            addCriterion("equipment_parent_id in", values, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdNotIn(List<String> values) {
            addCriterion("equipment_parent_id not in", values, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdBetween(String value1, String value2) {
            addCriterion("equipment_parent_id between", value1, value2, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentParentIdNotBetween(String value1, String value2) {
            addCriterion("equipment_parent_id not between", value1, value2, "equipmentParentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIsNull() {
            addCriterion("equipment_name is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIsNotNull() {
            addCriterion("equipment_name is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameEqualTo(String value) {
            addCriterion("equipment_name =", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotEqualTo(String value) {
            addCriterion("equipment_name <>", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameGreaterThan(String value) {
            addCriterion("equipment_name >", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_name >=", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLessThan(String value) {
            addCriterion("equipment_name <", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLessThanOrEqualTo(String value) {
            addCriterion("equipment_name <=", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLike(String value) {
            addCriterion("equipment_name like", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotLike(String value) {
            addCriterion("equipment_name not like", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIn(List<String> values) {
            addCriterion("equipment_name in", values, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotIn(List<String> values) {
            addCriterion("equipment_name not in", values, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameBetween(String value1, String value2) {
            addCriterion("equipment_name between", value1, value2, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotBetween(String value1, String value2) {
            addCriterion("equipment_name not between", value1, value2, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentCodeIsNull() {
            addCriterion("equipment_code is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentCodeIsNotNull() {
            addCriterion("equipment_code is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentCodeEqualTo(String value) {
            addCriterion("equipment_code =", value, "equipmentCode");
            return (Criteria) this;
        }

        public Criteria andEquipmentCodeNotEqualTo(String value) {
            addCriterion("equipment_code <>", value, "equipmentCode");
            return (Criteria) this;
        }

        public Criteria andEquipmentCodeGreaterThan(String value) {
            addCriterion("equipment_code >", value, "equipmentCode");
            return (Criteria) this;
        }

        public Criteria andEquipmentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_code >=", value, "equipmentCode");
            return (Criteria) this;
        }

        public Criteria andEquipmentCodeLessThan(String value) {
            addCriterion("equipment_code <", value, "equipmentCode");
            return (Criteria) this;
        }

        public Criteria andEquipmentCodeLessThanOrEqualTo(String value) {
            addCriterion("equipment_code <=", value, "equipmentCode");
            return (Criteria) this;
        }

        public Criteria andEquipmentCodeLike(String value) {
            addCriterion("equipment_code like", value, "equipmentCode");
            return (Criteria) this;
        }

        public Criteria andEquipmentCodeNotLike(String value) {
            addCriterion("equipment_code not like", value, "equipmentCode");
            return (Criteria) this;
        }

        public Criteria andEquipmentCodeIn(List<String> values) {
            addCriterion("equipment_code in", values, "equipmentCode");
            return (Criteria) this;
        }

        public Criteria andEquipmentCodeNotIn(List<String> values) {
            addCriterion("equipment_code not in", values, "equipmentCode");
            return (Criteria) this;
        }

        public Criteria andEquipmentCodeBetween(String value1, String value2) {
            addCriterion("equipment_code between", value1, value2, "equipmentCode");
            return (Criteria) this;
        }

        public Criteria andEquipmentCodeNotBetween(String value1, String value2) {
            addCriterion("equipment_code not between", value1, value2, "equipmentCode");
            return (Criteria) this;
        }

        public Criteria andEquipmentPasswordIsNull() {
            addCriterion("equipment_password is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentPasswordIsNotNull() {
            addCriterion("equipment_password is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentPasswordEqualTo(String value) {
            addCriterion("equipment_password =", value, "equipmentPassword");
            return (Criteria) this;
        }

        public Criteria andEquipmentPasswordNotEqualTo(String value) {
            addCriterion("equipment_password <>", value, "equipmentPassword");
            return (Criteria) this;
        }

        public Criteria andEquipmentPasswordGreaterThan(String value) {
            addCriterion("equipment_password >", value, "equipmentPassword");
            return (Criteria) this;
        }

        public Criteria andEquipmentPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_password >=", value, "equipmentPassword");
            return (Criteria) this;
        }

        public Criteria andEquipmentPasswordLessThan(String value) {
            addCriterion("equipment_password <", value, "equipmentPassword");
            return (Criteria) this;
        }

        public Criteria andEquipmentPasswordLessThanOrEqualTo(String value) {
            addCriterion("equipment_password <=", value, "equipmentPassword");
            return (Criteria) this;
        }

        public Criteria andEquipmentPasswordLike(String value) {
            addCriterion("equipment_password like", value, "equipmentPassword");
            return (Criteria) this;
        }

        public Criteria andEquipmentPasswordNotLike(String value) {
            addCriterion("equipment_password not like", value, "equipmentPassword");
            return (Criteria) this;
        }

        public Criteria andEquipmentPasswordIn(List<String> values) {
            addCriterion("equipment_password in", values, "equipmentPassword");
            return (Criteria) this;
        }

        public Criteria andEquipmentPasswordNotIn(List<String> values) {
            addCriterion("equipment_password not in", values, "equipmentPassword");
            return (Criteria) this;
        }

        public Criteria andEquipmentPasswordBetween(String value1, String value2) {
            addCriterion("equipment_password between", value1, value2, "equipmentPassword");
            return (Criteria) this;
        }

        public Criteria andEquipmentPasswordNotBetween(String value1, String value2) {
            addCriterion("equipment_password not between", value1, value2, "equipmentPassword");
            return (Criteria) this;
        }

        public Criteria andEquipmentIconIsNull() {
            addCriterion("equipment_icon is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIconIsNotNull() {
            addCriterion("equipment_icon is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIconEqualTo(String value) {
            addCriterion("equipment_icon =", value, "equipmentIcon");
            return (Criteria) this;
        }

        public Criteria andEquipmentIconNotEqualTo(String value) {
            addCriterion("equipment_icon <>", value, "equipmentIcon");
            return (Criteria) this;
        }

        public Criteria andEquipmentIconGreaterThan(String value) {
            addCriterion("equipment_icon >", value, "equipmentIcon");
            return (Criteria) this;
        }

        public Criteria andEquipmentIconGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_icon >=", value, "equipmentIcon");
            return (Criteria) this;
        }

        public Criteria andEquipmentIconLessThan(String value) {
            addCriterion("equipment_icon <", value, "equipmentIcon");
            return (Criteria) this;
        }

        public Criteria andEquipmentIconLessThanOrEqualTo(String value) {
            addCriterion("equipment_icon <=", value, "equipmentIcon");
            return (Criteria) this;
        }

        public Criteria andEquipmentIconLike(String value) {
            addCriterion("equipment_icon like", value, "equipmentIcon");
            return (Criteria) this;
        }

        public Criteria andEquipmentIconNotLike(String value) {
            addCriterion("equipment_icon not like", value, "equipmentIcon");
            return (Criteria) this;
        }

        public Criteria andEquipmentIconIn(List<String> values) {
            addCriterion("equipment_icon in", values, "equipmentIcon");
            return (Criteria) this;
        }

        public Criteria andEquipmentIconNotIn(List<String> values) {
            addCriterion("equipment_icon not in", values, "equipmentIcon");
            return (Criteria) this;
        }

        public Criteria andEquipmentIconBetween(String value1, String value2) {
            addCriterion("equipment_icon between", value1, value2, "equipmentIcon");
            return (Criteria) this;
        }

        public Criteria andEquipmentIconNotBetween(String value1, String value2) {
            addCriterion("equipment_icon not between", value1, value2, "equipmentIcon");
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

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("standard not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andProductDateIsNull() {
            addCriterion("product_date is null");
            return (Criteria) this;
        }

        public Criteria andProductDateIsNotNull() {
            addCriterion("product_date is not null");
            return (Criteria) this;
        }

        public Criteria andProductDateEqualTo(String value) {
            addCriterion("product_date =", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateNotEqualTo(String value) {
            addCriterion("product_date <>", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateGreaterThan(String value) {
            addCriterion("product_date >", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateGreaterThanOrEqualTo(String value) {
            addCriterion("product_date >=", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateLessThan(String value) {
            addCriterion("product_date <", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateLessThanOrEqualTo(String value) {
            addCriterion("product_date <=", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateLike(String value) {
            addCriterion("product_date like", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateNotLike(String value) {
            addCriterion("product_date not like", value, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateIn(List<String> values) {
            addCriterion("product_date in", values, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateNotIn(List<String> values) {
            addCriterion("product_date not in", values, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateBetween(String value1, String value2) {
            addCriterion("product_date between", value1, value2, "productDate");
            return (Criteria) this;
        }

        public Criteria andProductDateNotBetween(String value1, String value2) {
            addCriterion("product_date not between", value1, value2, "productDate");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNull() {
            addCriterion("certificate is null");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNotNull() {
            addCriterion("certificate is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateEqualTo(String value) {
            addCriterion("certificate =", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotEqualTo(String value) {
            addCriterion("certificate <>", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThan(String value) {
            addCriterion("certificate >", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("certificate >=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThan(String value) {
            addCriterion("certificate <", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThanOrEqualTo(String value) {
            addCriterion("certificate <=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLike(String value) {
            addCriterion("certificate like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotLike(String value) {
            addCriterion("certificate not like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateIn(List<String> values) {
            addCriterion("certificate in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotIn(List<String> values) {
            addCriterion("certificate not in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateBetween(String value1, String value2) {
            addCriterion("certificate between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotBetween(String value1, String value2) {
            addCriterion("certificate not between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andOnlineStateIsNull() {
            addCriterion("online_state is null");
            return (Criteria) this;
        }

        public Criteria andOnlineStateIsNotNull() {
            addCriterion("online_state is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineStateEqualTo(Integer value) {
            addCriterion("online_state =", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateNotEqualTo(Integer value) {
            addCriterion("online_state <>", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateGreaterThan(Integer value) {
            addCriterion("online_state >", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("online_state >=", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateLessThan(Integer value) {
            addCriterion("online_state <", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateLessThanOrEqualTo(Integer value) {
            addCriterion("online_state <=", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateIn(List<Integer> values) {
            addCriterion("online_state in", values, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateNotIn(List<Integer> values) {
            addCriterion("online_state not in", values, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateBetween(Integer value1, Integer value2) {
            addCriterion("online_state between", value1, value2, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateNotBetween(Integer value1, Integer value2) {
            addCriterion("online_state not between", value1, value2, "onlineState");
            return (Criteria) this;
        }

        public Criteria andTabIsDeleteIsNull() {
            addCriterion("tab_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andTabIsDeleteIsNotNull() {
            addCriterion("tab_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andTabIsDeleteEqualTo(Integer value) {
            addCriterion("tab_is_delete =", value, "tabIsDelete");
            return (Criteria) this;
        }

        public Criteria andTabIsDeleteNotEqualTo(Integer value) {
            addCriterion("tab_is_delete <>", value, "tabIsDelete");
            return (Criteria) this;
        }

        public Criteria andTabIsDeleteGreaterThan(Integer value) {
            addCriterion("tab_is_delete >", value, "tabIsDelete");
            return (Criteria) this;
        }

        public Criteria andTabIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("tab_is_delete >=", value, "tabIsDelete");
            return (Criteria) this;
        }

        public Criteria andTabIsDeleteLessThan(Integer value) {
            addCriterion("tab_is_delete <", value, "tabIsDelete");
            return (Criteria) this;
        }

        public Criteria andTabIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("tab_is_delete <=", value, "tabIsDelete");
            return (Criteria) this;
        }

        public Criteria andTabIsDeleteIn(List<Integer> values) {
            addCriterion("tab_is_delete in", values, "tabIsDelete");
            return (Criteria) this;
        }

        public Criteria andTabIsDeleteNotIn(List<Integer> values) {
            addCriterion("tab_is_delete not in", values, "tabIsDelete");
            return (Criteria) this;
        }

        public Criteria andTabIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("tab_is_delete between", value1, value2, "tabIsDelete");
            return (Criteria) this;
        }

        public Criteria andTabIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("tab_is_delete not between", value1, value2, "tabIsDelete");
            return (Criteria) this;
        }

        public Criteria andTabCreateDateIsNull() {
            addCriterion("tab_create_date is null");
            return (Criteria) this;
        }

        public Criteria andTabCreateDateIsNotNull() {
            addCriterion("tab_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andTabCreateDateEqualTo(Date value) {
            addCriterion("tab_create_date =", value, "tabCreateDate");
            return (Criteria) this;
        }

        public Criteria andTabCreateDateNotEqualTo(Date value) {
            addCriterion("tab_create_date <>", value, "tabCreateDate");
            return (Criteria) this;
        }

        public Criteria andTabCreateDateGreaterThan(Date value) {
            addCriterion("tab_create_date >", value, "tabCreateDate");
            return (Criteria) this;
        }

        public Criteria andTabCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("tab_create_date >=", value, "tabCreateDate");
            return (Criteria) this;
        }

        public Criteria andTabCreateDateLessThan(Date value) {
            addCriterion("tab_create_date <", value, "tabCreateDate");
            return (Criteria) this;
        }

        public Criteria andTabCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("tab_create_date <=", value, "tabCreateDate");
            return (Criteria) this;
        }

        public Criteria andTabCreateDateIn(List<Date> values) {
            addCriterion("tab_create_date in", values, "tabCreateDate");
            return (Criteria) this;
        }

        public Criteria andTabCreateDateNotIn(List<Date> values) {
            addCriterion("tab_create_date not in", values, "tabCreateDate");
            return (Criteria) this;
        }

        public Criteria andTabCreateDateBetween(Date value1, Date value2) {
            addCriterion("tab_create_date between", value1, value2, "tabCreateDate");
            return (Criteria) this;
        }

        public Criteria andTabCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("tab_create_date not between", value1, value2, "tabCreateDate");
            return (Criteria) this;
        }

        public Criteria andTabCreatorIdIsNull() {
            addCriterion("tab_creator_id is null");
            return (Criteria) this;
        }

        public Criteria andTabCreatorIdIsNotNull() {
            addCriterion("tab_creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andTabCreatorIdEqualTo(String value) {
            addCriterion("tab_creator_id =", value, "tabCreatorId");
            return (Criteria) this;
        }

        public Criteria andTabCreatorIdNotEqualTo(String value) {
            addCriterion("tab_creator_id <>", value, "tabCreatorId");
            return (Criteria) this;
        }

        public Criteria andTabCreatorIdGreaterThan(String value) {
            addCriterion("tab_creator_id >", value, "tabCreatorId");
            return (Criteria) this;
        }

        public Criteria andTabCreatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("tab_creator_id >=", value, "tabCreatorId");
            return (Criteria) this;
        }

        public Criteria andTabCreatorIdLessThan(String value) {
            addCriterion("tab_creator_id <", value, "tabCreatorId");
            return (Criteria) this;
        }

        public Criteria andTabCreatorIdLessThanOrEqualTo(String value) {
            addCriterion("tab_creator_id <=", value, "tabCreatorId");
            return (Criteria) this;
        }

        public Criteria andTabCreatorIdLike(String value) {
            addCriterion("tab_creator_id like", value, "tabCreatorId");
            return (Criteria) this;
        }

        public Criteria andTabCreatorIdNotLike(String value) {
            addCriterion("tab_creator_id not like", value, "tabCreatorId");
            return (Criteria) this;
        }

        public Criteria andTabCreatorIdIn(List<String> values) {
            addCriterion("tab_creator_id in", values, "tabCreatorId");
            return (Criteria) this;
        }

        public Criteria andTabCreatorIdNotIn(List<String> values) {
            addCriterion("tab_creator_id not in", values, "tabCreatorId");
            return (Criteria) this;
        }

        public Criteria andTabCreatorIdBetween(String value1, String value2) {
            addCriterion("tab_creator_id between", value1, value2, "tabCreatorId");
            return (Criteria) this;
        }

        public Criteria andTabCreatorIdNotBetween(String value1, String value2) {
            addCriterion("tab_creator_id not between", value1, value2, "tabCreatorId");
            return (Criteria) this;
        }

        public Criteria andTabCreatorNameIsNull() {
            addCriterion("tab_creator_name is null");
            return (Criteria) this;
        }

        public Criteria andTabCreatorNameIsNotNull() {
            addCriterion("tab_creator_name is not null");
            return (Criteria) this;
        }

        public Criteria andTabCreatorNameEqualTo(String value) {
            addCriterion("tab_creator_name =", value, "tabCreatorName");
            return (Criteria) this;
        }

        public Criteria andTabCreatorNameNotEqualTo(String value) {
            addCriterion("tab_creator_name <>", value, "tabCreatorName");
            return (Criteria) this;
        }

        public Criteria andTabCreatorNameGreaterThan(String value) {
            addCriterion("tab_creator_name >", value, "tabCreatorName");
            return (Criteria) this;
        }

        public Criteria andTabCreatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("tab_creator_name >=", value, "tabCreatorName");
            return (Criteria) this;
        }

        public Criteria andTabCreatorNameLessThan(String value) {
            addCriterion("tab_creator_name <", value, "tabCreatorName");
            return (Criteria) this;
        }

        public Criteria andTabCreatorNameLessThanOrEqualTo(String value) {
            addCriterion("tab_creator_name <=", value, "tabCreatorName");
            return (Criteria) this;
        }

        public Criteria andTabCreatorNameLike(String value) {
            addCriterion("tab_creator_name like", value, "tabCreatorName");
            return (Criteria) this;
        }

        public Criteria andTabCreatorNameNotLike(String value) {
            addCriterion("tab_creator_name not like", value, "tabCreatorName");
            return (Criteria) this;
        }

        public Criteria andTabCreatorNameIn(List<String> values) {
            addCriterion("tab_creator_name in", values, "tabCreatorName");
            return (Criteria) this;
        }

        public Criteria andTabCreatorNameNotIn(List<String> values) {
            addCriterion("tab_creator_name not in", values, "tabCreatorName");
            return (Criteria) this;
        }

        public Criteria andTabCreatorNameBetween(String value1, String value2) {
            addCriterion("tab_creator_name between", value1, value2, "tabCreatorName");
            return (Criteria) this;
        }

        public Criteria andTabCreatorNameNotBetween(String value1, String value2) {
            addCriterion("tab_creator_name not between", value1, value2, "tabCreatorName");
            return (Criteria) this;
        }

        public Criteria andTabModifyDateIsNull() {
            addCriterion("tab_modify_date is null");
            return (Criteria) this;
        }

        public Criteria andTabModifyDateIsNotNull() {
            addCriterion("tab_modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andTabModifyDateEqualTo(Date value) {
            addCriterion("tab_modify_date =", value, "tabModifyDate");
            return (Criteria) this;
        }

        public Criteria andTabModifyDateNotEqualTo(Date value) {
            addCriterion("tab_modify_date <>", value, "tabModifyDate");
            return (Criteria) this;
        }

        public Criteria andTabModifyDateGreaterThan(Date value) {
            addCriterion("tab_modify_date >", value, "tabModifyDate");
            return (Criteria) this;
        }

        public Criteria andTabModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("tab_modify_date >=", value, "tabModifyDate");
            return (Criteria) this;
        }

        public Criteria andTabModifyDateLessThan(Date value) {
            addCriterion("tab_modify_date <", value, "tabModifyDate");
            return (Criteria) this;
        }

        public Criteria andTabModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("tab_modify_date <=", value, "tabModifyDate");
            return (Criteria) this;
        }

        public Criteria andTabModifyDateIn(List<Date> values) {
            addCriterion("tab_modify_date in", values, "tabModifyDate");
            return (Criteria) this;
        }

        public Criteria andTabModifyDateNotIn(List<Date> values) {
            addCriterion("tab_modify_date not in", values, "tabModifyDate");
            return (Criteria) this;
        }

        public Criteria andTabModifyDateBetween(Date value1, Date value2) {
            addCriterion("tab_modify_date between", value1, value2, "tabModifyDate");
            return (Criteria) this;
        }

        public Criteria andTabModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("tab_modify_date not between", value1, value2, "tabModifyDate");
            return (Criteria) this;
        }

        public Criteria andTabModifierIdIsNull() {
            addCriterion("tab_modifier_id is null");
            return (Criteria) this;
        }

        public Criteria andTabModifierIdIsNotNull() {
            addCriterion("tab_modifier_id is not null");
            return (Criteria) this;
        }

        public Criteria andTabModifierIdEqualTo(String value) {
            addCriterion("tab_modifier_id =", value, "tabModifierId");
            return (Criteria) this;
        }

        public Criteria andTabModifierIdNotEqualTo(String value) {
            addCriterion("tab_modifier_id <>", value, "tabModifierId");
            return (Criteria) this;
        }

        public Criteria andTabModifierIdGreaterThan(String value) {
            addCriterion("tab_modifier_id >", value, "tabModifierId");
            return (Criteria) this;
        }

        public Criteria andTabModifierIdGreaterThanOrEqualTo(String value) {
            addCriterion("tab_modifier_id >=", value, "tabModifierId");
            return (Criteria) this;
        }

        public Criteria andTabModifierIdLessThan(String value) {
            addCriterion("tab_modifier_id <", value, "tabModifierId");
            return (Criteria) this;
        }

        public Criteria andTabModifierIdLessThanOrEqualTo(String value) {
            addCriterion("tab_modifier_id <=", value, "tabModifierId");
            return (Criteria) this;
        }

        public Criteria andTabModifierIdLike(String value) {
            addCriterion("tab_modifier_id like", value, "tabModifierId");
            return (Criteria) this;
        }

        public Criteria andTabModifierIdNotLike(String value) {
            addCriterion("tab_modifier_id not like", value, "tabModifierId");
            return (Criteria) this;
        }

        public Criteria andTabModifierIdIn(List<String> values) {
            addCriterion("tab_modifier_id in", values, "tabModifierId");
            return (Criteria) this;
        }

        public Criteria andTabModifierIdNotIn(List<String> values) {
            addCriterion("tab_modifier_id not in", values, "tabModifierId");
            return (Criteria) this;
        }

        public Criteria andTabModifierIdBetween(String value1, String value2) {
            addCriterion("tab_modifier_id between", value1, value2, "tabModifierId");
            return (Criteria) this;
        }

        public Criteria andTabModifierIdNotBetween(String value1, String value2) {
            addCriterion("tab_modifier_id not between", value1, value2, "tabModifierId");
            return (Criteria) this;
        }

        public Criteria andTabModifierNameIsNull() {
            addCriterion("tab_modifier_name is null");
            return (Criteria) this;
        }

        public Criteria andTabModifierNameIsNotNull() {
            addCriterion("tab_modifier_name is not null");
            return (Criteria) this;
        }

        public Criteria andTabModifierNameEqualTo(String value) {
            addCriterion("tab_modifier_name =", value, "tabModifierName");
            return (Criteria) this;
        }

        public Criteria andTabModifierNameNotEqualTo(String value) {
            addCriterion("tab_modifier_name <>", value, "tabModifierName");
            return (Criteria) this;
        }

        public Criteria andTabModifierNameGreaterThan(String value) {
            addCriterion("tab_modifier_name >", value, "tabModifierName");
            return (Criteria) this;
        }

        public Criteria andTabModifierNameGreaterThanOrEqualTo(String value) {
            addCriterion("tab_modifier_name >=", value, "tabModifierName");
            return (Criteria) this;
        }

        public Criteria andTabModifierNameLessThan(String value) {
            addCriterion("tab_modifier_name <", value, "tabModifierName");
            return (Criteria) this;
        }

        public Criteria andTabModifierNameLessThanOrEqualTo(String value) {
            addCriterion("tab_modifier_name <=", value, "tabModifierName");
            return (Criteria) this;
        }

        public Criteria andTabModifierNameLike(String value) {
            addCriterion("tab_modifier_name like", value, "tabModifierName");
            return (Criteria) this;
        }

        public Criteria andTabModifierNameNotLike(String value) {
            addCriterion("tab_modifier_name not like", value, "tabModifierName");
            return (Criteria) this;
        }

        public Criteria andTabModifierNameIn(List<String> values) {
            addCriterion("tab_modifier_name in", values, "tabModifierName");
            return (Criteria) this;
        }

        public Criteria andTabModifierNameNotIn(List<String> values) {
            addCriterion("tab_modifier_name not in", values, "tabModifierName");
            return (Criteria) this;
        }

        public Criteria andTabModifierNameBetween(String value1, String value2) {
            addCriterion("tab_modifier_name between", value1, value2, "tabModifierName");
            return (Criteria) this;
        }

        public Criteria andTabModifierNameNotBetween(String value1, String value2) {
            addCriterion("tab_modifier_name not between", value1, value2, "tabModifierName");
            return (Criteria) this;
        }

        public Criteria andTabRemarkIsNull() {
            addCriterion("tab_remark is null");
            return (Criteria) this;
        }

        public Criteria andTabRemarkIsNotNull() {
            addCriterion("tab_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTabRemarkEqualTo(String value) {
            addCriterion("tab_remark =", value, "tabRemark");
            return (Criteria) this;
        }

        public Criteria andTabRemarkNotEqualTo(String value) {
            addCriterion("tab_remark <>", value, "tabRemark");
            return (Criteria) this;
        }

        public Criteria andTabRemarkGreaterThan(String value) {
            addCriterion("tab_remark >", value, "tabRemark");
            return (Criteria) this;
        }

        public Criteria andTabRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tab_remark >=", value, "tabRemark");
            return (Criteria) this;
        }

        public Criteria andTabRemarkLessThan(String value) {
            addCriterion("tab_remark <", value, "tabRemark");
            return (Criteria) this;
        }

        public Criteria andTabRemarkLessThanOrEqualTo(String value) {
            addCriterion("tab_remark <=", value, "tabRemark");
            return (Criteria) this;
        }

        public Criteria andTabRemarkLike(String value) {
            addCriterion("tab_remark like", value, "tabRemark");
            return (Criteria) this;
        }

        public Criteria andTabRemarkNotLike(String value) {
            addCriterion("tab_remark not like", value, "tabRemark");
            return (Criteria) this;
        }

        public Criteria andTabRemarkIn(List<String> values) {
            addCriterion("tab_remark in", values, "tabRemark");
            return (Criteria) this;
        }

        public Criteria andTabRemarkNotIn(List<String> values) {
            addCriterion("tab_remark not in", values, "tabRemark");
            return (Criteria) this;
        }

        public Criteria andTabRemarkBetween(String value1, String value2) {
            addCriterion("tab_remark between", value1, value2, "tabRemark");
            return (Criteria) this;
        }

        public Criteria andTabRemarkNotBetween(String value1, String value2) {
            addCriterion("tab_remark not between", value1, value2, "tabRemark");
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