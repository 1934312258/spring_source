package com.kevin.config;

import com.kevin.compent.TulingDataSource;
import org.springframework.context.annotation.*;

/**
 * Created by xsls on 2019/7/7.
 */
@Configuration
@ComponentScan(basePackages = {"com.kevin.compent"})
public class MainConfig {


	@Bean
	public TulingDataSource tulingDataSource() {
		TulingDataSource tulingDataSource = new TulingDataSource();
		tulingDataSource.setFlag(1);
		return tulingDataSource;
	}

	@Bean
	public TulingDataSource tulingDataSource2() {
		TulingDataSource tulingDataSource = new TulingDataSource();
		tulingDataSource.setFlag(2);
		return tulingDataSource;
	}
}
