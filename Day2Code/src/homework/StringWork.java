package homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

//1：在网络程序中，如聊天室、聊天软件等，经常需要对一些用户所提交的聊天内容中的敏感性词语进行过滤。
// 如“性”、“色情”、“爆炸”、“恐怖”、“枪”、“军火”等，这些都不可以在网上进行传播，需要过滤掉或者用其他词语替换掉。
//2：(Scanner)当以年-月-日的格式输入一个日期时，输出其该年是否为闰年，该月有几天，该日是星期几
//3：日期练习—计算已出生多少天
public class StringWork {

    private String filter(String str1, ArrayList<String> stword) {
//        StringBuilder sb = new StringBuilder(str1);
//        //定义flag确认未替换次数
//        int flag = 0;
//        for (String s : stword) {
//            int index = sb.indexOf(s);
//            //-1则不进行替换，未替换次数+1
//            if (index == -1) {
//                flag++;
//            } else {
//                sb.replace(index, index + s.length(), "*");
//            }
//            //当敏感词库.size()==本次循环未替换次数，则返回新字符串
//            if (flag == stword.size()) {
//                return sb.toString();
//            }
//        }
//        return filter(sb.toString(), stword);

        //解法二 String的replace全部替换
        for (String s : stword) {
           str1=str1.replace(s,"*");
        }
        return str1;
    }

    private void checkDays(String str2) throws ParseException {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(str2));
        System.out.print(cal.get(Calendar.YEAR));
        if (new GregorianCalendar().isLeapYear(cal.get(Calendar.YEAR))) {
            System.out.println("是闰年");
        } else {
            System.out.println("不是闰年");
        }
        System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("今天是星期" + "零天一二三四五六".charAt(cal.get(Calendar.DAY_OF_WEEK)));
    }

    private void birthCount(String str3) throws ParseException {
        Calendar cal2 = Calendar.getInstance();
        Calendar caln = Calendar.getInstance();
        cal2.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(str3));
        caln.getTime();
        System.out.print("已经存在：");
        System.out.println((caln.getTimeInMillis() - cal2.getTimeInMillis()) / (24 * 60 * 60 * 1000) + "天");
    }

    public static void main(String[] args) {
        StringWork strw = new StringWork();
//第一题
//        SensitiveWords stword=new SensitiveWords();
//        String str1="在网络程序中，如聊天室、聊天软件等，经常需要对一些用户所提交的聊天内容中的敏感性词语进行过滤。" +
//                "如“性”、“色情”、“爆炸”、“恐怖”、“枪”、“军火”等，这些都不可以在网上进行传播，需要过滤掉或者用其他词语替换掉。" +
//                "如“性”、“色情”、“爆炸”、“恐怖”、“枪”、“军火”等，这些都不可以在网上进行传播，需要过滤掉或者用其他词语替换掉。";
//        Long starter=System.currentTimeMillis();
//        System.out.println(strw.filter(str1, stword.getStword()));
//        Long ender=System.currentTimeMillis();
//        System.out.println(ender-starter);
// 第二题
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入日期：格式yyyy-MM-dd");
//        String str2 = sc.nextLine();
//        try {
//            strw.checkDays(str2);
//        } catch (Exception e) {
//            System.out.println("异常");
//        }

// 第三题
//        try {
//            strw.birthCount("1996-11-22");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

    }
}
