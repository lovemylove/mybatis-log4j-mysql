package com.ly.mybatisdemo.model;

/**
 * Created by acer on 2016/9/10.
 */
public class UserDetail extends User {

    private Integer cityId;
    private String city;
    private String price;
    private String province;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
