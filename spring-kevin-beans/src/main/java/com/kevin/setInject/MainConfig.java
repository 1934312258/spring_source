package com.kevin.setInject;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by xsls on 2019/8/22.
 */
@ComponentScan(basePackages = {"com.kevin.setInject"})
//@Import(value = {InstC.class,TulingImportBeanDefinitionRegister.class,TulingImportSelector.class})
//@Import(value = {InstC.class})
//@Import(value = {TulingImportBeanDefinitionRegister.class})
@Import(value = {TulingImportSelector.class})
@Configuration
public class MainConfig {

/*	@Bean
	public InstB instB2() {
		return new InstB();
	}*/

}
