package com.dyjs.dao;

import com.dyjs.entity.DyEquipmentType;
import com.dyjs.entity.DyEquipmentTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DyEquipmentTypeDao {
    long countByExample(DyEquipmentTypeExample example);

    int deleteByExample(DyEquipmentTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(DyEquipmentType record);

    int insertSelective(DyEquipmentType record);

    List<DyEquipmentType> selectByExample(DyEquipmentTypeExample example);

    DyEquipmentType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DyEquipmentType record, @Param("example") DyEquipmentTypeExample example);

    int updateByExample(@Param("record") DyEquipmentType record, @Param("example") DyEquipmentTypeExample example);

    int updateByPrimaryKeySelective(DyEquipmentType record);

    int updateByPrimaryKey(DyEquipmentType record);
}