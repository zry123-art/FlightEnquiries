package com.ay.dao;

import com.ay.domain.Aircraft;

import java.util.List;

/**
 * @author yt
 * @date 2019/3/12 - 16:48
 */
public interface AircraftDao {
    //查询航班
    public Aircraft flightEnquiry(String takeOffAirport, String aerodromeOfLanding);
}
