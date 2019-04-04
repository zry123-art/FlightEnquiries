package com.ay.service;


import com.ay.domain.Aircraft;

/**
 * @author yt
 * @date 2019/3/12 - 22:07
 */
public interface AircraftService {
    /**
     * 通过传参查询机票信息
     * @param takeOffAirport 出发地点
     * @param aerodromeOfLanding 到达地点
     * @return 返回查出的航班询信息
     */
    public Aircraft fuZhi(String takeOffAirport, String aerodromeOfLanding);
}
