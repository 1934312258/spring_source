package com.kevin.component;

import com.kevin.entity.User;
import com.kevin.mapper.UserMapper;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
public class MyFactoryBean implements FactoryBean {

    public Class getMapperInterFace() {
        return mapperInterFace;
    }

    public void setMapperInterFace(Class mapperInterFace) {
        this.mapperInterFace = mapperInterFace;
    }

    // 动态传进来
    private Class mapperInterFace;

    @Override
    public Object getObject() throws Exception {
        // DeptMapper
        return (UserMapper) Proxy.newProxyInstance(mapperInterFace.getClassLoader(), new Class[]{mapperInterFace}, (proxy, method, args1) -> {
            // 查询数据库...   mybatis
            System.out.println("查询");
            return new User();
        });
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterFace;
    }

    public MyFactoryBean() {
        System.out.println("加载");
    }
}
