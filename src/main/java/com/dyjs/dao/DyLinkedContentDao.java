package com.dyjs.dao;

import com.dyjs.entity.DyLinkedContent;
import java.util.List;

public interface DyLinkedContentDao {
	/**
	 * 获取联动触发列表
	 * @author Dyan
	 * @param example
	 * @return
	 */
	List<DyLinkedContent> selectContents(String ID);
//    long countByExample(DyLinkedContentExample example);
//
//    int deleteByExample(DyLinkedContentExample example);
//
//    int deleteByPrimaryKey(String id);
//
//    int insert(DyLinkedContent record);
//
//    int insertSelective(DyLinkedContent record);
//
//    List<DyLinkedContent> selectByExample(DyLinkedContentExample example);
//
//    DyLinkedContent selectByPrimaryKey(String id);
//
//    int updateByExampleSelective(@Param("record") DyLinkedContent record, @Param("example") DyLinkedContentExample example);
//
//    int updateByExample(@Param("record") DyLinkedContent record, @Param("example") DyLinkedContentExample example);
//
//    int updateByPrimaryKeySelective(DyLinkedContent record);
//
//    int updateByPrimaryKey(DyLinkedContent record);
}