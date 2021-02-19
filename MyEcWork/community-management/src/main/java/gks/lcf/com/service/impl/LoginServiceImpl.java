package gks.lcf.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import gks.lcf.com.dao.StuMapper;
import gks.lcf.com.entity.Stu;
import gks.lcf.com.service.LoginService;
import gks.lcf.com.util.MD5Util;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private StuMapper stuMapper;
	
	@Override
	public Stu login(String username, String password) {
		String md5Encode = MD5Util.MD5Encode(password, "UTF-8");
		Stu login = stuMapper.login(username, md5Encode);
		return login;
	}

	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly = false, rollbackFor = {Exception.class})
	public int deleteByPrimaryKey(Integer sId) {
		return stuMapper.deleteByPrimaryKey(sId);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly = false, rollbackFor = {Exception.class})
	public int insertSelective(Stu record) {
		int insertSelective = stuMapper.insertSelective(record);
		return insertSelective;
	}

	@Override
	public Stu selectByPrimaryKey(Integer sId) {
		Stu selectByPrimaryKey = stuMapper.selectByPrimaryKey(sId);
		return selectByPrimaryKey;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly = false, rollbackFor = {Exception.class})
	public int updateByPrimaryKeySelective(Stu record) {
		int updateByPrimaryKeySelective = stuMapper.updateByPrimaryKeySelective(record);
		return updateByPrimaryKeySelective;
	}
	
	
}
