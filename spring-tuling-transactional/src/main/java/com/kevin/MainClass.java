package com.kevin;

import com.kevin.config.MainConfig;
import com.kevin.service.PayService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xsls on 2019/6/17.
 */
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        PayService payService = (PayService) context.getBean("payServiceImpl");
        payService.pay("123456789",10);

    }
}
