package stringClassWork;/*
 * @author Xingqilin
 *
 */

//编写程序将 “jdk” 全部变为大写,并输出到屏幕,“woniuxyteachjdkjdkisjava”
//将一个字符串进行反转。例：”abcdefg”反转成“gfedcba”.
//如:"abcbcbabcb34bcbd"中,"bcb"子串的出现位置为:
//“D:\myDonload\SogouExplorer\8.0.5.28300\LocalPage\test.java”判断这段字符串是否为java文件
//已知一个18位身份证号码（字符串），求出其出生年月日(格式:1990年3月1号或1991年11月29号)
//给定一个字符串，要求将其中的-全部替换为空字符串
// (13131-dewfre-113213-131231)-->(13131dewfre113213131231)
public class Day1Afternoon {
    public void mywork1() {
        String str1 = "woniuxyteachjdkjdkisjava";
        String temp = str1.replace("jdk", "JDK");
        System.out.println(temp);
    }

    public void mywork2(String str2) {
        char temp[] = new char[str2.length()];
        for (int i = temp.length - 1; i >= 0; i--) {
            temp[i] = str2.charAt(temp.length-i-1);
        }
        String nstr = new String(temp);
        System.out.println(nstr);
    }

    String note = "";
    public String mywork3(String str3, int i) {
        int temp = str3.indexOf("bcd", i);
        if (temp == -1) {
            return null;
        }
        note = note + temp + "  ";
        mywork3(str3, temp + 1);
        return note;
    }

    public boolean mywork4(String str4) {
        return str4.endsWith(".java");

    }

    public void mywork5(String str5) {
        //500112 1996 11 22 6632
        String year = str5.substring(6, 10);
        String month = str5.substring(10, 12);
        month=month.replace("0","");
        String day = str5.substring(12, 14);
        System.out.println(year + "年，" + month + "月，" + day + "日");

    }

    public void mywork6(String str6) {
        String nstr = str6.replace("-", "");
        System.out.println(nstr);
    }

    public static void main(String[] args) {
        Day1Afternoon work = new Day1Afternoon();

//        work.mywork1();
//        work.mywork2("abcdefgh");
//        System.out.println(work.mywork3("abcdgbcdbcdabcabcd", 0));
        System.out.println(work.mywork4("D:\\myDonload\\SogouExplorer\\8.0.5.28300\\LocalPage\\test.java"));
//        work.mywork5("500112199601226632");
//        work.mywork6("13131-dewfre-113213-131231");

    }
}
