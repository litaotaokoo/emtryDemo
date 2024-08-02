package org.example.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
/**
 * 创建一个car的实体类,实现InitializingBean和DisposableBean接口
 * */
public class Car  implements InitializingBean,DisposableBean{

    public Car(){
        System.out.println("执行了Car类的无参数构造方法");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("执行了Car类的初始化方法。。。。。");

    }

    public void destroy() throws Exception {
        System.out.println("执行了Car类的销毁方法。。。。。");
    }
}

