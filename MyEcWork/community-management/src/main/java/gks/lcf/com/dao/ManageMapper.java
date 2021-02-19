package gks.lcf.com.dao;

import gks.lcf.com.entity.Manage;

public interface ManageMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Manage record);

    int insertSelective(Manage record);

    Manage selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Manage record);

    int updateByPrimaryKey(Manage record);
}