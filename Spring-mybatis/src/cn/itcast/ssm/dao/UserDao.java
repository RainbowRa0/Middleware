package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.User;

public interface UserDao {
	public User findUserById(int id) throws Exception;

}
