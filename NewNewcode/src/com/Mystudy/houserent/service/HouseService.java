package com.Mystudy.houserent.service;

import com.Mystudy.houserent.domain.House;

import java.util.Scanner;


/**
 * HouseService.java 业务层
 * 定义House[],保存房屋信息
 * 1. 响应HouseView的请求
 * 2. 处理对房屋信息的各种操作(crud)
 */
public class HouseService {
    Scanner scanner = new Scanner(System.in);
    private House[] houses; // 房屋信息数组
    private int houseCount = 1; // 房屋数量
    private int id = 0; // 房屋id
    public HouseService(int size) {
        houses = new House[size]; // 初始化房屋信息数组
        houses[0] = new House(0, "1号房", "15649169672", "1室1厅1卫", 30000, "未出租");
    }
    public House[] getHouses() {
        return houses;
    }
    public boolean addHouse(House newhouse) {
        // 判断房屋数量是否已满，若满则扩充房屋数组
        if(houseCount >= houses.length) {
            System.out.println("房屋数量已满");
            System.out.println("请问您需要扩充房屋数量吗？");
            System.out.println("请输入1继续扩充，0退出");
            int choice = scanner.nextInt();
            if(choice == 1) {
                House[] newhouses = new House[houses.length + 1];
                for(int i = 0; i < houses.length; i++) {
                    newhouses[i] = houses[i];
                }
                houses = newhouses;
                return addHouse(newhouse);
            }
            return false;
        }
        houses[houseCount++] = newhouse;
        //houseCount++;
        newhouse.setIdd(++id);
        return true;
    }

    public boolean deleteHouse(int id) {
        for(int i = 0; i < houseCount; i++) {
            if(houses[i].getIdd() == id) {
                houses[i] = null;
                for(int j = i; j < houseCount -1 ; j++) {
                    houses[j] = houses[j + 1];
                    houses[j+1] = null;
                }
                houseCount--;
                return true;
            }
        }
        return false;
    }

    public House getHouse(int id) {
        for(int i = 0; i < houseCount; i++) {
            if(houses[i].getIdd() == id) {
                return houses[i];
            }
        }
        return null;
    }

    public boolean modifyHouse(House newhouse) {
        for(int i = 0; i < houseCount; i++) {
            if(houses[i].getIdd() == newhouse.getIdd()) {
                houses[i] = newhouse;
                return true;
            }
        }
        return false;
    }
}
