package stringClassWork;/*
 * @author Xingqilin
 *
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//[2016][9][8][10][55][3]{1}[2016][9][8][10][58][57],
//2016-9-8 10:55:3
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
            System.out.print("" + day + "天" + hour + "小时" + min + "分" + s + "秒");

        } catch (Exception e) {
        }
        System.out.println("]");
    }


    public static void main(String[] args) {
        callTime("[2016][9][8][10][55][3]{1}[2016][9][8][10][58][57]");
    }
}
