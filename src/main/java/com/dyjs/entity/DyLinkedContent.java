package com.dyjs.entity;

import java.util.Date;

public class DyLinkedContent {
    private String id;

    private Integer version;

    private String linkedId;

    private String linkedContent;

    private String linkedCode;

    private String linkedEquipmentId;

    private Integer tabIsDelete;

    private Date tabCreateDate;

    private String tabCreatorId;

    private String tabCreatorName;

    private Date tabModifyDate;

    private String tabModifierId;

    private String tabModifierName;

    private String tabRemark;
    
    private DyEquipment equipment;

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

    public String getLinkedId() {
        return linkedId;
    }

    public void setLinkedId(String linkedId) {
        this.linkedId = linkedId == null ? null : linkedId.trim();
    }

    public String getLinkedContent() {
        return linkedContent;
    }

    public void setLinkedContent(String linkedContent) {
        this.linkedContent = linkedContent == null ? null : linkedContent.trim();
    }

    public String getLinkedCode() {
        return linkedCode;
    }

    public void setLinkedCode(String linkedCode) {
        this.linkedCode = linkedCode == null ? null : linkedCode.trim();
    }

    public String getLinkedEquipmentId() {
        return linkedEquipmentId;
    }

    public void setLinkedEquipmentId(String linkedEquipmentId) {
        this.linkedEquipmentId = linkedEquipmentId == null ? null : linkedEquipmentId.trim();
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

	public DyEquipment getEquipment() {
		return equipment;
	}

	public void setEquipment(DyEquipment equipment) {
		this.equipment = equipment;
	}
}