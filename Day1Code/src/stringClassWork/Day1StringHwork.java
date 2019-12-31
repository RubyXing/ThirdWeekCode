package stringClassWork;/*
 * @author Xingqilin
 *
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//[2016][9][8][10][55][3]{1}[2016][9][8][10][58][57],
//[2016][9][8][10][55][3]{1}[2016][9][8][10][58][57]，
//[2016][9][8][10][55][3]{1}[2016][9][8][10][58][57]
//{1}表示主叫
//{0}表示被叫
//计算通话时间和通话类型以：【主叫：1分20秒 】的格式输出
public class Day1StringHwork {
    public static void callTime(String str1) {

        int cType = str1.indexOf('{');
        switch (Integer.parseInt(str1.substring(cType + 1, cType + 2))) {
            case 0:
                System.out.print("[被叫：");
                break;
            case 1:
                System.out.print("[主叫：");
                break;
        }


        str1 = str1.replace("{1}", "");
        str1 = str1.replace("{0}", "");
        StringBuffer stringBuffer = new StringBuffer(str1);
        str1 = String.valueOf(stringBuffer.deleteCharAt(0));


        int j = 0, k = 0, nums[] = new int[12];
        char[] dataa = new char[7];
        for (int i = 0; i < str1.length(); i++) {
            if ('0' <= str1.charAt(i) && str1.charAt(i) <= '9') {
                dataa[j] = str1.charAt(i);

            }
            if (str1.charAt(i) == ']') {
                String temp = new String(dataa);
                temp = temp.trim();
                nums[k] = Integer.valueOf(temp);
                k++;
                dataa = new char[7];
                j = 0;
                continue;
            }
            j++;
        }


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date d1 = df.parse(nums[0] + "-" + nums[1] + "-" + nums[2] + " " + nums[3] + ":" + nums[4] + ":" + nums[5]);
            Date d2 = df.parse(nums[6] + "-" + nums[7] + "-" + nums[8] + " " + nums[9] + ":" + nums[10] + ":" + nums[11]);
            long diff = d2.getTime() - d1.getTime();
            long day = diff / (24 * 60 * 60 * 1000);
            long hour = (diff / (60 * 60 * 1000) - day * 24);
            long min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);
            long s = (diff / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
            System.out.print(day + "天" + hour + "小时" + min + "分" + s + "秒");

        } catch (Exception e) {
        }
        System.out.println("]");
    }

    public static void spliteString(String str1) {
        for (String s : str1.split(",")) {
            newCallTime(s);
//            callTime(s);
        }
    }


    //定义一个对象数组，里面包含用户名，密码，地址属性
//创建5个对象存入当前对象数组。
//张三	123  四川省双流区
//李四    admin  重庆江北路
//小吴    root  四川南充市
//小黑    123456 甘肃兰州
//小白    woniuxy  四川省梁山市
//判断有几个重庆的并且输出其数量。
    public static void getAddress(Persone person[]) {
        for (Persone p : person) {
            if (p.getUaddress().indexOf("重庆") != -1) {
                System.out.println(p.toString());
            }
        }
    }

    public static void newCallTime(String str4){
        switch (Integer.parseInt(str4.substring(str4.indexOf("{" )+ 1,str4.indexOf("}")))) {
            case 0:
                System.out.print("[被叫：");
                break;
            case 1:
                System.out.print("[主叫：");
                break;
        }
        String bgt=str4.substring(0,str4.indexOf("{"));
        String ent=str4.substring(str4.indexOf("}")+1);
        DateFormat df = new SimpleDateFormat("[yyyy][MM][dd][HH][mm][ss]");
        try {
            Date d1 = df.parse(bgt);
            Date d2 = df.parse(ent);
            long diff = d2.getTime() - d1.getTime();
            long day = diff / (24 * 60 * 60 * 1000);
            long hour = (diff / (60 * 60 * 1000) - day * 24);
            long min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);
            long s = (diff / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
            System.out.print(day + "天" + hour + "小时" + min + "分" + s + "秒");
        } catch (Exception e) {
        }
        System.out.println("]");
    }
    public static void main(String[] args) {

        spliteString("[2016][9][8][10][55][3]{1}[2016][9][8][10][58][57]," +
                "[2016][8][7][8][55][20]{0}[2016][9][8][10][58][57]," +
                "[2016][9][6][8][55][20]{1}[2016][9][8][10][58][57]," +
                "[2015][9][7][8][55][20]{0}[2016][9][8][10][58][57]," +
                "[2016][9][7][8][55][20]{1}[2016][9][8][10][58][57]," +
                "[2016][9][7][8][55][20]{0}[2016][9][8][10][58][57]," +
                "[2016][09][08][10][55][03]{1}[2016][09][08][11][41][57]");

//        Persone per1 = new Persone("张三", "123", "四川省双流区");
//        Persone per2 = new Persone("小吴", "admin", "四川南充市");
//        Persone per3 = new Persone("小黑", "root", "甘肃兰州");
//        Persone per4 = new Persone("小白", "123456", "四川省梁山市");
//        Persone per5 = new Persone("李四", "lisi12", "重庆江北路");
//        Persone pers[] = {per1, per2, per3, per4, per5};
//        getAddress(pers);
    }
}
