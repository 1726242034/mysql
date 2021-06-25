package com.xu.service;

import com.xu.mapper.UserTest;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(
		propagation = Propagation.REQUIRED,
		isolation = Isolation.DEFAULT,
		readOnly = false,
		rollbackFor = {
				ArithmeticException.class, NullPointerException.class
		}
)
public class UserServiceImpl implements UserService {

	private UserTest userDao;
	public void setUserDao(UserTest userDao) {
		this.userDao = userDao;
	}

	@Override
	public void transactionTest() {

		userDao.updateUser(1,99);
		userDao.deleteUser(12);
		throw new NullPointerException();

	}
}
