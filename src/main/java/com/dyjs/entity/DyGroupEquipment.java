package com.dyjs.entity;

import java.util.Date;
import java.util.List;

public class DyGroupEquipment {
    private String id;

    private Integer version;

    private String equipmentId;

    private String equipmentGroupId;

    private Integer tabIsDelete;

    private Date tabCreateDate;

    private String tabCreatorId;

    private String tabCreatorName;

    private Date tabModifyDate;

    private String tabModifierId;

    private String tabModifierName;

    private String tabRemark;
    
    private List<DyEquipment> equipments;

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

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId == null ? null : equipmentId.trim();
    }

    public String getEquipmentGroupId() {
        return equipmentGroupId;
    }

    public void setEquipmentGroupId(String equipmentGroupId) {
        this.equipmentGroupId = equipmentGroupId == null ? null : equipmentGroupId.trim();
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

	public List<DyEquipment> getEquipments() {
		return equipments;
	}

	public void setEquipments(List<DyEquipment> equipments) {
		this.equipments = equipments;
	}
}