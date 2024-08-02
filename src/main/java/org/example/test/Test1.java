package org.example.test;


import org.example.config.MyConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    @Test
    public void test1(){

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("ioc容器创建完成了。。。。");
        //关闭容器执行销毁方法
        ctx.close();
    }
}
