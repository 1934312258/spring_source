package com.kevin;


import com.kevin.config.MainConfig;
import com.kevin.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xsls on 2019/8/18.
 */
public class MainClassStarter {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

/*		AccountInfoDao accountInfoDao = (AccountInfoDao) context.getBean("accountInfoDao");

		accountInfoDao.saveAccountInfo("9988776644",500);*/

		UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");
		//userService.updateBlance(1);
		userService.findUserName(1);
	}

}
