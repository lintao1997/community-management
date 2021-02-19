package gks.lcf.com.service;

import org.apache.ibatis.annotations.Param;

import gks.lcf.com.entity.Stu;

public interface LoginService {
    Stu login(String username,String password);
    int deleteByPrimaryKey(Integer sId);

    int insertSelective(Stu record);

    Stu selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(Stu record);

}
