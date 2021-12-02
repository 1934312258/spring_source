package com.kevin.version2;

import com.kevin.version2.config.SpringRedisonfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by xsls on 2019/8/31.
 */
@Slf4j
public class TestBaseJavaConfig {

	public static void main(String[] args) {


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringRedisonfig.class);
		RedisTemplate redisTemplate = (RedisTemplate) context.getBean("redisTemplate");

		redisTemplate.opsForValue().set("smlz","司马");

		System.out.println("从redis获取===="+redisTemplate.opsForValue().get("smlz"));
	}
}
