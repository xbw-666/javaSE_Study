package com.Mystudy.houserent.domain;

/**
 * House的对象表示一个房屋信息
 * @author Administrator
 */
public class House {
    // 房屋编号 房主 电话 地址 月租 状态(未出租/已出租)
    private int idd;
    private String name;
    private String telephone;
    private String address;
    private int rent;
    private String status;

    public House(int idd, String name, String telephone, String address, int rent, String status) {
        this.idd = idd;
        this.name = name;
        this.telephone = telephone;
        this.address = address;
        this.rent = rent;
        this.status = status;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // toString方法用于打印房屋信息
    @Override
    public String toString() {
        return "House{" +
                "idd=" + idd +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", rent=" + rent +
                ", status='" + status + '\'' +
                '}';
    }
}
