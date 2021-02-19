package gks.lcf.com.dao;

import gks.lcf.com.entity.Association;

public interface AssociationMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(Association record);

    int insertSelective(Association record);

    Association selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(Association record);

    int updateByPrimaryKey(Association record);
}