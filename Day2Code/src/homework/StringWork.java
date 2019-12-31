package homework;

import java.util.ArrayList;

//1：在网络程序中，如聊天室、聊天软件等，经常需要对一些用户所提交的聊天内容中的敏感性词语进行过滤。
// 如“性”、“色情”、“爆炸”、“恐怖”、“枪”、“军火”等，这些都不可以在网上进行传播，需要过滤掉或者用其他词语替换掉。
//2：(Scanner)当以年-月-日的格式输入一个日期时，输出其该年是否为闰年，该月有几天，该日是星期几
//3：日期练习—计算已出生多少天
public class StringWork {

    private String filter(String str1, ArrayList<String> stword) {
        StringBuilder sb = new StringBuilder(str1);
        int flag = 0;
        for (String s : stword) {
            int index = str1.indexOf(s);
            if (index == -1) {
                flag++;
            } else {
                String strs = "";
                for (int i = 0; i < s.length(); i++) {
                    strs = strs + "*";
                }
                sb.replace(index, index + s.length(), strs);
            }
            if (flag == stword.size()) {
                return sb.toString();
            }
        }
        return filter(sb.toString(), stword);
    }

    private void checkdays(String str2) {

    }

    public static void main(String[] args) {
        StringWork strw = new StringWork();

//        SensitiveWords stword=new SensitiveWords();
//        String str1="在网络程序中，如聊天室、聊天软件等，经常需要对一些用户所提交的聊天内容中的敏感性词语进行过滤。" +
//                "如“性”、“色情”、“爆炸”、“恐怖”、“枪”、“军火”等，这些都不可以在网上进行传播，需要过滤掉或者用其他词语替换掉。";
//        System.out.println(strw.filter(str1, stword.getStword()));

    }
}
