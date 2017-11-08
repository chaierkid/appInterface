package com.dyjs.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DyEquipmentGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DyEquipmentGroupExample() {
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

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("parent_id like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("parent_id not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andChildrenIdIsNull() {
            addCriterion("children_id is null");
            return (Criteria) this;
        }

        public Criteria andChildrenIdIsNotNull() {
            addCriterion("children_id is not null");
            return (Criteria) this;
        }

        public Criteria andChildrenIdEqualTo(String value) {
            addCriterion("children_id =", value, "childrenId");
            return (Criteria) this;
        }

        public Criteria andChildrenIdNotEqualTo(String value) {
            addCriterion("children_id <>", value, "childrenId");
            return (Criteria) this;
        }

        public Criteria andChildrenIdGreaterThan(String value) {
            addCriterion("children_id >", value, "childrenId");
            return (Criteria) this;
        }

        public Criteria andChildrenIdGreaterThanOrEqualTo(String value) {
            addCriterion("children_id >=", value, "childrenId");
            return (Criteria) this;
        }

        public Criteria andChildrenIdLessThan(String value) {
            addCriterion("children_id <", value, "childrenId");
            return (Criteria) this;
        }

        public Criteria andChildrenIdLessThanOrEqualTo(String value) {
            addCriterion("children_id <=", value, "childrenId");
            return (Criteria) this;
        }

        public Criteria andChildrenIdLike(String value) {
            addCriterion("children_id like", value, "childrenId");
            return (Criteria) this;
        }

        public Criteria andChildrenIdNotLike(String value) {
            addCriterion("children_id not like", value, "childrenId");
            return (Criteria) this;
        }

        public Criteria andChildrenIdIn(List<String> values) {
            addCriterion("children_id in", values, "childrenId");
            return (Criteria) this;
        }

        public Criteria andChildrenIdNotIn(List<String> values) {
            addCriterion("children_id not in", values, "childrenId");
            return (Criteria) this;
        }

        public Criteria andChildrenIdBetween(String value1, String value2) {
            addCriterion("children_id between", value1, value2, "childrenId");
            return (Criteria) this;
        }

        public Criteria andChildrenIdNotBetween(String value1, String value2) {
            addCriterion("children_id not between", value1, value2, "childrenId");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIsNull() {
            addCriterion("node_type is null");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIsNotNull() {
            addCriterion("node_type is not null");
            return (Criteria) this;
        }

        public Criteria andNodeTypeEqualTo(String value) {
            addCriterion("node_type =", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotEqualTo(String value) {
            addCriterion("node_type <>", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeGreaterThan(String value) {
            addCriterion("node_type >", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("node_type >=", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeLessThan(String value) {
            addCriterion("node_type <", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeLessThanOrEqualTo(String value) {
            addCriterion("node_type <=", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeLike(String value) {
            addCriterion("node_type like", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotLike(String value) {
            addCriterion("node_type not like", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIn(List<String> values) {
            addCriterion("node_type in", values, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotIn(List<String> values) {
            addCriterion("node_type not in", values, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeBetween(String value1, String value2) {
            addCriterion("node_type between", value1, value2, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotBetween(String value1, String value2) {
            addCriterion("node_type not between", value1, value2, "nodeType");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIsNull() {
            addCriterion("group_type is null");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIsNotNull() {
            addCriterion("group_type is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTypeEqualTo(String value) {
            addCriterion("group_type =", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotEqualTo(String value) {
            addCriterion("group_type <>", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeGreaterThan(String value) {
            addCriterion("group_type >", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeGreaterThanOrEqualTo(String value) {
            addCriterion("group_type >=", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeLessThan(String value) {
            addCriterion("group_type <", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeLessThanOrEqualTo(String value) {
            addCriterion("group_type <=", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeLike(String value) {
            addCriterion("group_type like", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotLike(String value) {
            addCriterion("group_type not like", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIn(List<String> values) {
            addCriterion("group_type in", values, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotIn(List<String> values) {
            addCriterion("group_type not in", values, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeBetween(String value1, String value2) {
            addCriterion("group_type between", value1, value2, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotBetween(String value1, String value2) {
            addCriterion("group_type not between", value1, value2, "groupType");
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