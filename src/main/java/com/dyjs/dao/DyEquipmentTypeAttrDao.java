package com.dyjs.dao;

import com.dyjs.entity.DyEquipmentTypeAttr;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DyEquipmentTypeAttrDao {
	
	List<DyEquipmentTypeAttr> getAttrByEquipmentTypeID(@Param("id") String id);

//    long countByExample(DyEquipmentTypeAttrExample example);
//
//    int deleteByExample(DyEquipmentTypeAttrExample example);
//
//    int deleteByPrimaryKey(String id);
//
//    int insert(DyEquipmentTypeAttr record);
//
//    int insertSelective(DyEquipmentTypeAttr record);
//
//    List<DyEquipmentTypeAttr> selectByExample(DyEquipmentTypeAttrExample example);
//
//    DyEquipmentTypeAttr selectByPrimaryKey(String id);
//
//    int updateByExampleSelective(@Param("record") DyEquipmentTypeAttr record, @Param("example") DyEquipmentTypeAttrExample example);
//
//    int updateByExample(@Param("record") DyEquipmentTypeAttr record, @Param("example") DyEquipmentTypeAttrExample example);
//
//    int updateByPrimaryKeySelective(DyEquipmentTypeAttr record);
//
//    int updateByPrimaryKey(DyEquipmentTypeAttr record);
}