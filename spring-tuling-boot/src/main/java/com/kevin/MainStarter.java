package com.kevin;

import com.kevin.web.TulingSpringBootApplication;
import org.apache.catalina.LifecycleException;

import javax.servlet.ServletException;

/**
 * Created by xsls on 2019/8/18.
 */


public class MainStarter {

    public static void main(String[] args) throws ServletException, LifecycleException {
        TulingSpringBootApplication.run();
    }
}
