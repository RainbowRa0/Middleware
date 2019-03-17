package cn.itcast.ssm.mapper;



import cn.itcast.ssm.po.User;



public interface UserMapper {
	
	public User findUserById(int id) throws Exception;
	

}
