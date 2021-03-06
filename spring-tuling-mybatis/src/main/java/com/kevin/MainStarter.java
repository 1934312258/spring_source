package com.kevin;

import com.kevin.config.MyBatisConfig;
import com.kevin.mapper.UserMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
public class MainStarter {

    public static void main(String[] args) {
    	// 记载spring上下文
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MyBatisConfig.class);
		UserMapper bean = (UserMapper) ioc.getBean("userMapper2");
        System.out.println(bean.selectById(1L));

		/*UserMapper userMapper =(UserMapper) Proxy.newProxyInstance(UserMapper.class.getClassLoader(), new Class[]{UserMapper.class}, (proxy, method, args1) -> {
			// 查询数据库...
			System.out.println("查询");
			return new User();
		});
		userMapper.selectById(1L);*/
	}
}
