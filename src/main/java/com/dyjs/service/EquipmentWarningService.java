package com.dyjs.service;

import java.util.List;

import com.dyjs.entity.DyEquipmentLog;
import com.dyjs.entity.DyEquipmentWarning;

public interface EquipmentWarningService {
	List<DyEquipmentWarning> selectWarnings();
	
	public List<DyEquipmentLog> selectEquipmentState();
}
