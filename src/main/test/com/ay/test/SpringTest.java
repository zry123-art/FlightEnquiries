package com.ay.test;

import com.ay.dao.AircraftDaoImpl;
import com.ay.domain.Aircraft;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author yt
 * @date 2019/3/12 - 23:43
 */
@Service
public class SpringTest {
    @Test
    public void testSpring(){
        //获取上下文应用
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringTest springTest =
                (SpringTest) applicationContext.getBean("springTest");
        //对应sayHello方法
        springTest.sayHello();
    }
    public void sayHello(){
        System.out.println("hello ay");
    }

    @Test
    public void find(){
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        AircraftDaoImpl aircraftDao =
                (AircraftDaoImpl) applicationContext.getBean("aircraftDao");
        Aircraft aircraft = aircraftDao.flightEnquiry("双流国际机场","北京国际机场");
        System.out.println(aircraft);
    }
}
