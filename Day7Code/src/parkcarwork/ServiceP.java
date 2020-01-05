package parkcarwork;/*
 * @author Xingqilin
 *
 */

import java.util.Date;
import java.util.Scanner;

public class ServiceP {

    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入停取车操作：1，停车   2，取车");
            String chek =sc.nextLine();
            switch (chek) {
                case "1":
                    parkCar();
                    break;
                case "2":
                    pickCar();
                    break;
                default:
                    System.out.println("输入异常");
            }
        }
    }

    private void parkCar() {
        System.out.println("请输入停入车辆信息");
        Scanner sc=new Scanner(System.in);
        System.out.println("车牌:");
        String cID = sc.nextLine();
        System.out.println("颜色:");
        String cColor = sc.nextLine();
        Date cTime=new Date();
        DataSave da=new DataSave();
        da.saveToD(cID,cColor,cTime);
        System.out.println(da.showCar() + "入库成功");

    }

    private void pickCar() {
        DataSave da=new DataSave();
        System.out.println("已停车辆：");
        da.showAll();
        System.out.println("请输入要取的车牌：");
        Scanner sc=new Scanner(System.in);
        String cID = sc.nextLine();
        da.pickedC(cID);


    }
}
