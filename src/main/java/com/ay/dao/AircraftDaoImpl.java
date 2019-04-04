package com.ay.dao;

import com.ay.domain.Aircraft;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

/**
 * @author yt
 * @date 2019/3/12 - 16:57
 */
@Repository("AircraftDao")
public class AircraftDaoImpl implements AircraftDao {
    //声明JdbcTemplate属性及其setterff
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Aircraft flightEnquiry(String takeOffAirport, String aerodromeOfLanding) {
        ArrayList<Aircraft> FlightCollection = new ArrayList<Aircraft>();

        //定义SQL语句
        String sql = "select * from aircraft where TakeOffAirport=? and AerodromeOfLanding=?";
        RowMapper<Aircraft> rowMapper = new BeanPropertyRowMapper<Aircraft>(Aircraft.class);
        return this.jdbcTemplate.queryForObject(sql,rowMapper,takeOffAirport,aerodromeOfLanding);
    }

}
