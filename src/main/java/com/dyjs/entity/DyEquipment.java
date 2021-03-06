package com.dyjs.entity;

import java.util.Date;
import java.util.List;

public class DyEquipment {
    private String id;

    private Integer version;

    private String equipmentTypeId;

    private String equipmentParentId;

    private String equipmentName;

    private String equipmentCode;

    private String equipmentPassword;

    private String equipmentIcon;

    private String manufacturer;

    private String supplier;

    private String brand;

    private String standard;

    private String productDate;

    private String certificate;

    private Integer sort;

    private Integer onlineState;

    private Integer tabIsDelete;

    private Date tabCreateDate;

    private String tabCreatorId;

    private String tabCreatorName;

    private Date tabModifyDate;

    private String tabModifierId;

    private String tabModifierName;

    private String tabRemark;
    
    private List<DyEquipmentAttrConfig> equipmentAttrList;

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

    public String getEquipmentTypeId() {
        return equipmentTypeId;
    }

    public void setEquipmentTypeId(String equipmentTypeId) {
        this.equipmentTypeId = equipmentTypeId == null ? null : equipmentTypeId.trim();
    }

    public String getEquipmentParentId() {
        return equipmentParentId;
    }

    public void setEquipmentParentId(String equipmentParentId) {
        this.equipmentParentId = equipmentParentId == null ? null : equipmentParentId.trim();
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
    }

    public String getEquipmentCode() {
        return equipmentCode;
    }

    public void setEquipmentCode(String equipmentCode) {
        this.equipmentCode = equipmentCode == null ? null : equipmentCode.trim();
    }

    public String getEquipmentPassword() {
        return equipmentPassword;
    }

    public void setEquipmentPassword(String equipmentPassword) {
        this.equipmentPassword = equipmentPassword == null ? null : equipmentPassword.trim();
    }

    public String getEquipmentIcon() {
        return equipmentIcon;
    }

    public void setEquipmentIcon(String equipmentIcon) {
        this.equipmentIcon = equipmentIcon == null ? null : equipmentIcon.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public String getProductDate() {
        return productDate;
    }

    public void setProductDate(String productDate) {
        this.productDate = productDate == null ? null : productDate.trim();
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate == null ? null : certificate.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getOnlineState() {
        return onlineState;
    }

    public void setOnlineState(Integer onlineState) {
        this.onlineState = onlineState;
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

	public List<DyEquipmentAttrConfig> getEquipmentAttrList() {
		return equipmentAttrList;
	}

	public void setEquipmentAttrList(List<DyEquipmentAttrConfig> equipmentAttrList) {
		this.equipmentAttrList = equipmentAttrList;
	}
}