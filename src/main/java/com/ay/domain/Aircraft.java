package com.ay.domain;

/**
 * @author yt
 * @date 2019/3/12 - 16:27
 */
public class Aircraft {

    private Integer flightNumber; //机票编号
    private String takeOffTime; //起飞时间
    private String landingTime; //降落时间
    private String takeOffAirport; //起飞地点
    private String aerodromeOfLanding; //到达地点
    private Integer price; //价格
    private String dateOfDeparture; //日期时间

    public Aircraft() {
    }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getTakeOffTime() {
        return takeOffTime;
    }

    public void setTakeOffTime(String takeOffTime) {
        this.takeOffTime = takeOffTime;
    }

    public String getLandingTime() {
        return landingTime;
    }

    public void setLandingTime(String landingTime) {
        this.landingTime = landingTime;
    }

    public String getTakeOffAirport() {
        return takeOffAirport;
    }

    public void setTakeOffAirport(String takeOffAirport) {
        this.takeOffAirport = takeOffAirport;
    }

    public String getAerodromeOfLanding() {
        return aerodromeOfLanding;
    }

    public void setAerodromeOfLanding(String aerodromeOfLanding) {
        this.aerodromeOfLanding = aerodromeOfLanding;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(String dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "flightNumber=" + flightNumber +
                ", takeOffTime='" + takeOffTime + '\'' +
                ", landingTime='" + landingTime + '\'' +
                ", takeOffAirport='" + takeOffAirport + '\'' +
                ", aerodromeOfLanding='" + aerodromeOfLanding + '\'' +
                ", price=" + price +
                ", dateOfDeparture='" + dateOfDeparture + '\'' +
                '}';
    }
}
