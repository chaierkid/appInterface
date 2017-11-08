package com.dyjs.dao;

import com.dyjs.entity.DyLinkedRelation;
import java.util.List;

public interface DyLinkedRelationDao {
	/**
	 * 获取联动设备关系列表
	 * @author Dyan
	 * @return
	 */
    List<DyLinkedRelation> selectRelations(String ID);

//    long countByExample(DyLinkedRelationExample example);
//
//    int deleteByExample(DyLinkedRelationExample example);
//
//    int deleteByPrimaryKey(String id);
//
//    int insert(DyLinkedRelation record);
//
//    int insertSelective(DyLinkedRelation record);
//
//    List<DyLinkedRelation> selectByExample(DyLinkedRelationExample example);
//
//    DyLinkedRelation selectByPrimaryKey(String id);
//
//    int updateByExampleSelective(@Param("record") DyLinkedRelation record, @Param("example") DyLinkedRelationExample example);
//
//    int updateByExample(@Param("record") DyLinkedRelation record, @Param("example") DyLinkedRelationExample example);
//
//    int updateByPrimaryKeySelective(DyLinkedRelation record);
//
//    int updateByPrimaryKey(DyLinkedRelation record);
}