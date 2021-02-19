package gks.lcf.com.dao;

import org.apache.ibatis.annotations.Param;

import gks.lcf.com.entity.Stu;

public interface StuMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(Stu record);

    int insertSelective(Stu record);

    Stu selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(Stu record);

    int updateByPrimaryKey(Stu record);
    
    Stu login(@Param("username") String username,@Param("password") String password);
    
}