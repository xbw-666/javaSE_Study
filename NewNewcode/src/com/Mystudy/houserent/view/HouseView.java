package com.Mystudy.houserent.view;

import com.Mystudy.houserent.domain.House;
import com.Mystudy.houserent.service.HouseService;
import com.Mystudy.houserent.utils.Utility;
import java.util.Scanner;

/**
 * 1. 显示界面
 * 2. 处理用户输入
 * 3. 处理业务逻辑
 */
public class HouseView {
    // 显示界面
    private boolean loop = true;
    Scanner scan = new Scanner(System.in);
    private HouseService houseService = new HouseService(scan.nextInt());
    Scanner scanner = new Scanner(System.in);
    int key;

    //编写modifyHouse方法
    public void modifyHouse() {
        System.out.println("**********房屋详情**********");
        System.out.print("请输入房屋编号:");
        int id = Utility.readInt();
        House house = houseService.getHouse(id);
        if (house != null) {
            System.out.println(house);
            System.out.print("请输入修改后的房屋信息(姓名/电话/地址/租金/状态):\n");
            String name = Utility.readString(8);
            String telephone = Utility.readString(11);
            String address = Utility.readString(100);
            int rent = Utility.readInt();
            String status = Utility.readString(10);
            House newhouse = new House(id,name, telephone, address,rent, status);
            if (houseService.modifyHouse(newhouse)) {
                System.out.println("修改成功！");
            } else {
                System.out.println("修改失败！");
            }
        }
        else {
            System.out.println("房屋不存在！");
        }
    }

    //编写showHouse方法，用于显示房源信息
    public void showHouse() {
        System.out.println("**********房屋详情**********");
        System.out.print("请输入房屋编号:");
        int id = Utility.readInt();
        House house = houseService.getHouse(id);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("房屋不存在！");
        }
    }

    //编写DeleteHouse方法，用于删除房源
    public void DeleteHouse() {
        System.out.println("**********删除房屋**********");
        System.out.print("请输入房屋编号:");
        int id = Utility.readInt();
        if (houseService.deleteHouse(id)) {
            System.out.println("删除成功！");
        }
    }

    //编写addHouse方法，用于添加房源
    public void addHouse() {
        System.out.println("**********添加房屋**********");
        System.out.print("请输入姓名:");
        String name = Utility.readString(8);
        System.out.print("请输入电话:");
        String telephone = Utility.readString(11);
        System.out.print("请输入地址:");
        String address = Utility.readString(100);
        System.out.print("请输入租金:");
        int rent = Utility.readInt();
        System.out.print("请输入状态:");
        String status = Utility.readString(10);
        House house = new House(0,name, telephone, address,rent, status);
        if (houseService.addHouse(house)) {
            System.out.println("添加成功！");
        }
        else {
            System.out.println("添加失败！");
        }
    }

    // 显示房屋列表
    public void showHouseList() {
        System.out.println("**********房屋列表**********");
        House[] houses = houseService.getHouses();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null) {
                System.out.println(houses[i]);
            }
        }
    }

    //显示主菜单
    public void showMenu() {
        do{
            System.out.println("**********欢迎来到房屋租赁系统**********");
            System.out.println("1. 发布房源");
            System.out.println("2. 查看房源");
            System.out.println("3. 删除房源");
            System.out.println("4. 修改房源");
            System.out.println("5. 房屋列表");
            System.out.println("6. 退出系统");
            System.out.print("请选择(1/2/3/4/5/6):");
            key = scanner.nextInt();
            switch (key) {
                case 1:
                    addHouse();
                    // 发布房源
                    break;
                case 2:
                    showHouse();
                    // 查看房源
                    break;
                case 3:
                    DeleteHouse();
                    // 删除房源
                    break;
                case 4:
                    modifyHouse();
                    // 修改房源
                    break;
                case 5:
                    showHouseList();
                    // 房屋列表
                    break;
                case 6:
                    // 退出系统
                    loop = false;
                    System.out.println("===你退出了房屋租赁系统===");
                    break;
                default:
                    System.out.println("输入错误，请重新输入！");
                    break;
            }
        }while(loop);
    }
    public void print(){
        System.out.println("请输入房子个数:>");
    }
}