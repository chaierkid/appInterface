package com.dyjs.entity;

import java.util.Date;

public class DyUserSafety {
    private String id;

	private Integer version;

	private String personId;

	private String questionId;

	private String answer;

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

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId == null ? null : personId.trim();
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId == null ? null : questionId.trim();
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer == null ? null : answer.trim();
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