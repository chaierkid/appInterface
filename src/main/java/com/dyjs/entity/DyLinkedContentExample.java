package com.dyjs.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DyLinkedContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DyLinkedContentExample() {
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

        public Criteria andLinkedIdIsNull() {
            addCriterion("linked_id is null");
            return (Criteria) this;
        }

        public Criteria andLinkedIdIsNotNull() {
            addCriterion("linked_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinkedIdEqualTo(String value) {
            addCriterion("linked_id =", value, "linkedId");
            return (Criteria) this;
        }

        public Criteria andLinkedIdNotEqualTo(String value) {
            addCriterion("linked_id <>", value, "linkedId");
            return (Criteria) this;
        }

        public Criteria andLinkedIdGreaterThan(String value) {
            addCriterion("linked_id >", value, "linkedId");
            return (Criteria) this;
        }

        public Criteria andLinkedIdGreaterThanOrEqualTo(String value) {
            addCriterion("linked_id >=", value, "linkedId");
            return (Criteria) this;
        }

        public Criteria andLinkedIdLessThan(String value) {
            addCriterion("linked_id <", value, "linkedId");
            return (Criteria) this;
        }

        public Criteria andLinkedIdLessThanOrEqualTo(String value) {
            addCriterion("linked_id <=", value, "linkedId");
            return (Criteria) this;
        }

        public Criteria andLinkedIdLike(String value) {
            addCriterion("linked_id like", value, "linkedId");
            return (Criteria) this;
        }

        public Criteria andLinkedIdNotLike(String value) {
            addCriterion("linked_id not like", value, "linkedId");
            return (Criteria) this;
        }

        public Criteria andLinkedIdIn(List<String> values) {
            addCriterion("linked_id in", values, "linkedId");
            return (Criteria) this;
        }

        public Criteria andLinkedIdNotIn(List<String> values) {
            addCriterion("linked_id not in", values, "linkedId");
            return (Criteria) this;
        }

        public Criteria andLinkedIdBetween(String value1, String value2) {
            addCriterion("linked_id between", value1, value2, "linkedId");
            return (Criteria) this;
        }

        public Criteria andLinkedIdNotBetween(String value1, String value2) {
            addCriterion("linked_id not between", value1, value2, "linkedId");
            return (Criteria) this;
        }

        public Criteria andLinkedContentIsNull() {
            addCriterion("linked_content is null");
            return (Criteria) this;
        }

        public Criteria andLinkedContentIsNotNull() {
            addCriterion("linked_content is not null");
            return (Criteria) this;
        }

        public Criteria andLinkedContentEqualTo(String value) {
            addCriterion("linked_content =", value, "linkedContent");
            return (Criteria) this;
        }

        public Criteria andLinkedContentNotEqualTo(String value) {
            addCriterion("linked_content <>", value, "linkedContent");
            return (Criteria) this;
        }

        public Criteria andLinkedContentGreaterThan(String value) {
            addCriterion("linked_content >", value, "linkedContent");
            return (Criteria) this;
        }

        public Criteria andLinkedContentGreaterThanOrEqualTo(String value) {
            addCriterion("linked_content >=", value, "linkedContent");
            return (Criteria) this;
        }

        public Criteria andLinkedContentLessThan(String value) {
            addCriterion("linked_content <", value, "linkedContent");
            return (Criteria) this;
        }

        public Criteria andLinkedContentLessThanOrEqualTo(String value) {
            addCriterion("linked_content <=", value, "linkedContent");
            return (Criteria) this;
        }

        public Criteria andLinkedContentLike(String value) {
            addCriterion("linked_content like", value, "linkedContent");
            return (Criteria) this;
        }

        public Criteria andLinkedContentNotLike(String value) {
            addCriterion("linked_content not like", value, "linkedContent");
            return (Criteria) this;
        }

        public Criteria andLinkedContentIn(List<String> values) {
            addCriterion("linked_content in", values, "linkedContent");
            return (Criteria) this;
        }

        public Criteria andLinkedContentNotIn(List<String> values) {
            addCriterion("linked_content not in", values, "linkedContent");
            return (Criteria) this;
        }

        public Criteria andLinkedContentBetween(String value1, String value2) {
            addCriterion("linked_content between", value1, value2, "linkedContent");
            return (Criteria) this;
        }

        public Criteria andLinkedContentNotBetween(String value1, String value2) {
            addCriterion("linked_content not between", value1, value2, "linkedContent");
            return (Criteria) this;
        }

        public Criteria andLinkedCodeIsNull() {
            addCriterion("linked_code is null");
            return (Criteria) this;
        }

        public Criteria andLinkedCodeIsNotNull() {
            addCriterion("linked_code is not null");
            return (Criteria) this;
        }

        public Criteria andLinkedCodeEqualTo(String value) {
            addCriterion("linked_code =", value, "linkedCode");
            return (Criteria) this;
        }

        public Criteria andLinkedCodeNotEqualTo(String value) {
            addCriterion("linked_code <>", value, "linkedCode");
            return (Criteria) this;
        }

        public Criteria andLinkedCodeGreaterThan(String value) {
            addCriterion("linked_code >", value, "linkedCode");
            return (Criteria) this;
        }

        public Criteria andLinkedCodeGreaterThanOrEqualTo(String value) {
            addCriterion("linked_code >=", value, "linkedCode");
            return (Criteria) this;
        }

        public Criteria andLinkedCodeLessThan(String value) {
            addCriterion("linked_code <", value, "linkedCode");
            return (Criteria) this;
        }

        public Criteria andLinkedCodeLessThanOrEqualTo(String value) {
            addCriterion("linked_code <=", value, "linkedCode");
            return (Criteria) this;
        }

        public Criteria andLinkedCodeLike(String value) {
            addCriterion("linked_code like", value, "linkedCode");
            return (Criteria) this;
        }

        public Criteria andLinkedCodeNotLike(String value) {
            addCriterion("linked_code not like", value, "linkedCode");
            return (Criteria) this;
        }

        public Criteria andLinkedCodeIn(List<String> values) {
            addCriterion("linked_code in", values, "linkedCode");
            return (Criteria) this;
        }

        public Criteria andLinkedCodeNotIn(List<String> values) {
            addCriterion("linked_code not in", values, "linkedCode");
            return (Criteria) this;
        }

        public Criteria andLinkedCodeBetween(String value1, String value2) {
            addCriterion("linked_code between", value1, value2, "linkedCode");
            return (Criteria) this;
        }

        public Criteria andLinkedCodeNotBetween(String value1, String value2) {
            addCriterion("linked_code not between", value1, value2, "linkedCode");
            return (Criteria) this;
        }

        public Criteria andLinkedEquipmentIdIsNull() {
            addCriterion("linked_equipment_id is null");
            return (Criteria) this;
        }

        public Criteria andLinkedEquipmentIdIsNotNull() {
            addCriterion("linked_equipment_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinkedEquipmentIdEqualTo(String value) {
            addCriterion("linked_equipment_id =", value, "linkedEquipmentId");
            return (Criteria) this;
        }

        public Criteria andLinkedEquipmentIdNotEqualTo(String value) {
            addCriterion("linked_equipment_id <>", value, "linkedEquipmentId");
            return (Criteria) this;
        }

        public Criteria andLinkedEquipmentIdGreaterThan(String value) {
            addCriterion("linked_equipment_id >", value, "linkedEquipmentId");
            return (Criteria) this;
        }

        public Criteria andLinkedEquipmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("linked_equipment_id >=", value, "linkedEquipmentId");
            return (Criteria) this;
        }

        public Criteria andLinkedEquipmentIdLessThan(String value) {
            addCriterion("linked_equipment_id <", value, "linkedEquipmentId");
            return (Criteria) this;
        }

        public Criteria andLinkedEquipmentIdLessThanOrEqualTo(String value) {
            addCriterion("linked_equipment_id <=", value, "linkedEquipmentId");
            return (Criteria) this;
        }

        public Criteria andLinkedEquipmentIdLike(String value) {
            addCriterion("linked_equipment_id like", value, "linkedEquipmentId");
            return (Criteria) this;
        }

        public Criteria andLinkedEquipmentIdNotLike(String value) {
            addCriterion("linked_equipment_id not like", value, "linkedEquipmentId");
            return (Criteria) this;
        }

        public Criteria andLinkedEquipmentIdIn(List<String> values) {
            addCriterion("linked_equipment_id in", values, "linkedEquipmentId");
            return (Criteria) this;
        }

        public Criteria andLinkedEquipmentIdNotIn(List<String> values) {
            addCriterion("linked_equipment_id not in", values, "linkedEquipmentId");
            return (Criteria) this;
        }

        public Criteria andLinkedEquipmentIdBetween(String value1, String value2) {
            addCriterion("linked_equipment_id between", value1, value2, "linkedEquipmentId");
            return (Criteria) this;
        }

        public Criteria andLinkedEquipmentIdNotBetween(String value1, String value2) {
            addCriterion("linked_equipment_id not between", value1, value2, "linkedEquipmentId");
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