package com.ay.service;


import com.ay.dao.AircraftDao;
import com.ay.domain.Aircraft;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;


/**
 * @author yt
 * @date 2019/3/12 - 22:07
 */

@Service("AircraftService")
public class AircraftServiceImpl implements AircraftService {
    private Aircraft aircraft;
    @Override
    public Aircraft fuZhi(String takeOffAirport, String aerodromeOfLanding) {
        try {
            //加载配置文件
            ApplicationContext applicationContext =
                    new ClassPathXmlApplicationContext("applicationContext.xml");
            AircraftDao aircraftDao = (AircraftDao) applicationContext.getBean("aircraftDao");
            //执行查询方法
            aircraft = aircraftDao.flightEnquiry(takeOffAirport,aerodromeOfLanding);
            return aircraft;
        }catch (Exception e){
            e.toString();
        }finally {
            return aircraft;
        }
    }
}
