package com.sjoj.mapper;

import com.sjoj.bean.User;

public interface UserMapper {
	//检验登录
	User login(User user);
	//注册检验用户名是否存在
	String checkregister(String user_id);
	//注册新用户
	int register(User user);
}
