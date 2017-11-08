package com.dyjs.entity;

import java.util.Date;

public class DyEquipmentGroup {
    private String id;

    private Integer version;

    private String parentId;

    private String childrenId;

    private String nodeType;

    private Integer level;

    private String groupName;

    private String groupType;

    private Integer tabIsDelete;

    private Date tabCreateDate;

    private String tabCreatorId;

    private String tabCreatorName;

    private Date tabModifyDate;

    private String tabModifierId;

    private String tabModifierName;

    private String tabRemark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getChildrenId() {
        return childrenId;
    }

    public void setChildrenId(String childrenId) {
        this.childrenId = childrenId == null ? null : childrenId.trim();
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType == null ? null : nodeType.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType == null ? null : groupType.trim();
    }

    public Integer getTabIsDelete() {
        return tabIsDelete;
    }

    public void setTabIsDelete(Integer tabIsDelete) {
        this.tabIsDelete = tabIsDelete;
    }

    public Date getTabCreateDate() {
        return tabCreateDate;
    }

    public void setTabCreateDate(Date tabCreateDate) {
        this.tabCreateDate = tabCreateDate;
    }

    public String getTabCreatorId() {
        return tabCreatorId;
    }

    public void setTabCreatorId(String tabCreatorId) {
        this.tabCreatorId = tabCreatorId == null ? null : tabCreatorId.trim();
    }

    public String getTabCreatorName() {
        return tabCreatorName;
    }

    public void setTabCreatorName(String tabCreatorName) {
        this.tabCreatorName = tabCreatorName == null ? null : tabCreatorName.trim();
    }

    public Date getTabModifyDate() {
        return tabModifyDate;
    }

    public void setTabModifyDate(Date tabModifyDate) {
        this.tabModifyDate = tabModifyDate;
    }

    public String getTabModifierId() {
        return tabModifierId;
    }

    public void setTabModifierId(String tabModifierId) {
        this.tabModifierId = tabModifierId == null ? null : tabModifierId.trim();
    }

    public String getTabModifierName() {
        return tabModifierName;
    }

    public void setTabModifierName(String tabModifierName) {
        this.tabModifierName = tabModifierName == null ? null : tabModifierName.trim();
    }

    public String getTabRemark() {
        return tabRemark;
    }

    public void setTabRemark(String tabRemark) {
        this.tabRemark = tabRemark == null ? null : tabRemark.trim();
    }
}