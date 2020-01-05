package parkcarwork;/*
 * @author Xingqilin
 *
 */

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DataSave {
    private Cars car=null;
    private ArrayList<Cars> cars=new ArrayList<>();
    private File fl1 = new File("D:\\CCC\\park.txt");
    public void saveToD(String cID, String cColor, Date cTime){
        car=new Cars(cID,cColor,cTime);
        Writer wr1=null;
        try {
            wr1=new FileWriter(fl1,true);
            wr1.write(car.toString()+"\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (wr1 != null) {
                try {
                    wr1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void pickedC(String cID){
        boolean gflag=false;
        Long money=0l;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getcID().equals(cID)) {
                Date nowda=new Date();
                Long parktime=nowda.getTime()-cars.get(i).getcTime().getTime();
                money=parktime/1000/60;
                gflag=true;
                cars.remove(i);
            }
        }
        if (gflag) {
            saveChange();
            System.out.println("取车成功，停车费：" + money);
        }else {
            System.out.println("没有该车辆");
        }


    }
    public void saveChange(){
        fl1.delete();
        for (Cars car1 : cars) {
            saveToD(car1.getcID(),car1.getcColor(),car1.getcTime());
        }
    }
    public void showAll(){
        Reader re1=null;
        StringBuilder sb=new StringBuilder();
        try {
            re1=new FileReader(fl1);
            char cht[]=new char[1024];
            int len=0;
            while ((len=re1.read(cht))!=-1){
                String str=new String(cht,0,len);
                sb.append(str);
            }
            String cstring=sb.toString();
            String strc[]=cstring.split("\r\n");
            for (String s : strc) {
                String carm[]=s.split(",");
                Cars cartemp=new Cars(carm[0],carm[1],new SimpleDateFormat("停入日期:yyyy年MM月dd日 HH:mm:ss").parse(carm[2]));
                cars.add(cartemp);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }finally {
            if (re1 != null) {
                try {
                    re1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        for (Cars car1 : cars) {
            System.out.println("车牌：" + car1.getcID() + ",颜色：" + car1.getcColor() + "," + new SimpleDateFormat("停入日期:yyyy年MM月dd日 HH:mm:ss").format(car1.getcTime()));
        }

    }
    public String showCar(){
        return "车牌："+car.getcID()+",颜色："+car.getcColor()+","+new SimpleDateFormat("停入日期:yyyy年MM月dd日 HH:mm:ss").format(car.getcTime());
    }
}
