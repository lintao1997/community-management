package gks.lcf.com.dao;

import gks.lcf.com.entity.News;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKeyWithBLOBs(News record);

    int updateByPrimaryKey(News record);
}