package cn.spring.day01;

import cn.spring.day01.MESGOD_Service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/3/21.
 */
public class Test20180303 {

    @Test
    public void t1(){
        //context就是（spring 容器）
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        MESGOD_Service service = (MESGOD_Service)context.getBean("service");
        System.out.println(service);
    }

}
