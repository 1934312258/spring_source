package com.kevin.parsebeandefinition;

import org.springframework.context.annotation.*;

/**
 * Created by xsls on 2019/7/15.
 */
@Configuration
@Import(value = {CompentC.class,TulingImportSelect.class,TulingImportBeanfinitionRegister.class})
@ComponentScan(basePackages = {"com.kevin.parsebeandefinition"})
public class MainConfig {

	@Bean
	public CompentD compentD() {
		return new CompentD();
	}

	@Bean
	public CompentC compentC() {
		return new CompentC();
	}
}
