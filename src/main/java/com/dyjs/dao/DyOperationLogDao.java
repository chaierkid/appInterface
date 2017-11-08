package com.dyjs.dao;

import com.dyjs.entity.DyOperationLog;

public interface DyOperationLogDao {
	
	/**
	 * 插入操作记录
	 * @author Dyan
	 * @param record
	 * @return
	 */
	int insert(DyOperationLog dyOperationLog);
//    long countByExample(DyOperationLogExample example);
//
//    int deleteByExample(DyOperationLogExample example);
//
//    int deleteByPrimaryKey(String id);
//
//    int insert(DyOperationLog record);
//
//    int insertSelective(DyOperationLog record);
//
//    List<DyOperationLog> selectByExample(DyOperationLogExample example);
//
//    DyOperationLog selectByPrimaryKey(String id);
//
//    int updateByExampleSelective(@Param("record") DyOperationLog record, @Param("example") DyOperationLogExample example);
//
//    int updateByExample(@Param("record") DyOperationLog record, @Param("example") DyOperationLogExample example);
//
//    int updateByPrimaryKeySelective(DyOperationLog record);
//
//    int updateByPrimaryKey(DyOperationLog record);
}