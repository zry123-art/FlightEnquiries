package com.ay.controller;


import com.ay.dao.AircraftDao;
import com.ay.domain.Aircraft;
import com.ay.service.AircraftServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author yt
 * @date 2019/3/12 - 22:20
 */

/**
 * 初始化加载程序界面jsp
 */
@Controller
@RequestMapping(value = "/")
public class AircraftController {
    private Aircraft xinXi;



    /**
     * 默认启动查询界面
     * @return 主页面
     */
    @RequestMapping("/")
    public String flightEnquiry(){
        return "main";
    }

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    /**
     * 点击查询后跳转到查询结果界面并赋值给结果文本框
     * @param model 传值的
     * @param aircraft 实体类类型
     * @return 返回到display界面
     */
    @RequestMapping("/queryResults")
    public String queryResults(Model model,Aircraft aircraft){
        //取出查询的出发点和到达点
        String chu_fa_dian = aircraft.getTakeOffAirport();
        String dao_da_dian = aircraft.getAerodromeOfLanding();
        //加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        AircraftDao aircraftDao = (AircraftDao) applicationContext.getBean("aircraftDao");
        //调用查询方法
        xinXi = aircraftDao.flightEnquiry(chu_fa_dian,dao_da_dian);

         if(xinXi==null){
             model.addAttribute("error_one","非常抱歉!无此航班信息");
         }else {
             //传值到页面
             model.addAttribute("flightNumber",xinXi.getFlightNumber());
             model.addAttribute("takeOffTime",xinXi.getTakeOffTime());
             model.addAttribute("landingTime",xinXi.getLandingTime());
             model.addAttribute("takeOffAirport",xinXi.getTakeOffAirport());
             model.addAttribute("aerodromeOfLanding",xinXi.getAerodromeOfLanding());
             model.addAttribute("price",xinXi.getPrice());
             model.addAttribute("dateOfDeparture",xinXi.getDateOfDeparture());
         }
        return "display";
    }


    /**
     * 使用mybatis的方法类查询航班信息
     * @param model
     * @param aircraft
     * @return
     * @throws IOException
     */
    @Test
    @RequestMapping("/queryResultsMapper")
    public String queryResultsMapper(Model model,Aircraft aircraft) throws IOException {
        //取出查询的出发点和到达点
        String chu_fa_dian = aircraft.getTakeOffAirport();
        String dao_da_dian = aircraft.getAerodromeOfLanding();

        //用mybatis的方法来查询航班信息
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Map<String,Object> parameters=new HashMap<String, Object>();
        parameters.put("0",chu_fa_dian);
        parameters.put("1",dao_da_dian);
        Aircraft result =  sqlSession.selectOne("AircraftMapper.xml.flightEnquiry",parameters);

        if (result == null){
            model.addAttribute("error_one","非常抱歉!无此航班信息");
        }else {
            //传值到页面
            model.addAttribute("flightNumber",result.getFlightNumber());
            model.addAttribute("takeOffTime",result.getTakeOffTime());
            model.addAttribute("landingTime",result.getLandingTime());
            model.addAttribute("takeOffAirport",result.getTakeOffAirport());
            model.addAttribute("aerodromeOfLanding",result.getAerodromeOfLanding());
            model.addAttribute("price",result.getPrice());
            model.addAttribute("dateOfDeparture",result.getDateOfDeparture());
        }
        return "display";
    }




    @Test
    public void text() throws IOException {
/*        //加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        AircraftDao aircraftDao = (AircraftDao) applicationContext.getBean("aircraftDao");
        xinXi = aircraftDao.flightEnquiry("双流国际机场","北京国际机场");*/
        //读取配置文件


        //用mybatis的方法来查询航班信息
/*        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Map<String,Object> parameters=new HashMap<String, Object>();
        parameters.put("0","双流国际机场");
        parameters.put("1","北京国际机场");
         xinXi = sqlSession.selectOne("AircraftMapper.xml.flightEnquiry",parameters);
        System.out.println(xinXi);*/
    }

}
