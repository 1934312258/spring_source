package com.kevin.web;

import org.apache.catalina.startup.Tomcat;

/**
 * Created by xsls on 2019/8/18.
 */
public class TulingSpringBootApplication {

    public static void run() {

        Tomcat tomcat = new Tomcat();

        tomcat.setPort(8080);

        try {
            tomcat.addWebapp("/","D:\\");

            tomcat.start();

            tomcat.getServer().await();
        }catch (Exception e) {
			System.out.println("容器启动失败");
		}
    }

}
