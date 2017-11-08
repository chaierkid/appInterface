package com.dyjs.dao;

import com.dyjs.entity.DyUserSafety;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DyUserSafetyDao {
	/**
	 * 插入用户安全设置
	 * @author Dyan
	 * @param userSafety
	 * @return
	 */
	 int insert(DyUserSafety userSafety);
	 /**
	  * 根据用户ID获取用户安全设置
	  * @author Dyan
	  * @param example
	  * @return
	  */
	 List<DyUserSafety> selectUserSafetyByPersonID(@Param("userID") String userID);
	 
	 /**
	  * 修改用户安全设置
	  * @author Dyan
	  * @param userSafety
	  * @return
	  */
	 int updateSafety(DyUserSafety userSafety);
//    long countByExample(DyUserSafetyExample example);
//
//    int deleteByExample(DyUserSafetyExample example);
//
//    int deleteByPrimaryKey(String id);
//
//    int insert(DyUserSafety record);
//
//    int insertSelective(DyUserSafety record);
//
//    List<DyUserSafety> selectByExample(DyUserSafetyExample example);
//
//    DyUserSafety selectByPrimaryKey(String id);
//
//    int updateByExampleSelective(@Param("record") DyUserSafety record, @Param("example") DyUserSafetyExample example);
//
//    int updateByExample(@Param("record") DyUserSafety record, @Param("example") DyUserSafetyExample example);
//
//    int updateByPrimaryKeySelective(DyUserSafety record);
//
//    int updateByPrimaryKey(DyUserSafety record);
}