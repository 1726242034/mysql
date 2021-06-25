package com.xu.mapper;

import com.xu.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserTest {

	public User selectUser();

	public int updateUser(@Param("upAge") Integer upAge,@Param("age") Integer age);

	public int deleteUser(@Param("age") Integer age);

}
