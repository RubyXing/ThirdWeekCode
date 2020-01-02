package RegexTest;/*
 * @author Xingqilin
 *
 */

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//（需求）判断简单邮箱的验证示例：wangyijsyy@126.com
//规则：邮箱首字母为字母，@符号以前字母数字下划线均可，@符号后与.符号前，字母+数字 ，然后在.后只能是3位字母。
//生成一个4位随机数，要求：必须有大小写，和数字，并且不能重复（且数字大小写必须出现一次）
public class Day3homwork {

    public void start() {
//        System.out.println(checkEmail("xingqilin@126.com"));
        checkNum();
    }

    private boolean checkEmail(String eml) {
        Pattern pa = Pattern.compile("\\w[_\\w\\d]*@[A-Za-z0-9]{3}\\.[A-Za-z]{2,14}");
        Matcher ma = pa.matcher(eml);
        return ma.matches();
    }

    private void checkNum() {
        Pattern pcapital = Pattern.compile("[a-z]+");
        Pattern psmall = Pattern.compile("[A-Z]+");
        Pattern pnum = Pattern.compile("\\d+");

        Random ra = new Random();
        StringBuilder sb = new StringBuilder();
        char onechar = '0';
        while (sb.length() < 6) {
            switch (ra.nextInt(4)) {
                case 0:
                    onechar = (char) ('a' + ra.nextInt(26));
                    break;
                case 1:
                    onechar = (char) ('A' + ra.nextInt(26));
                    break;
                case 2:
                    onechar = (char) ('0' + ra.nextInt(10));
                    break;
            }
            if (sb.indexOf(onechar + "") == -1) {
                sb.append(onechar);
            }
        }
        Matcher ma1 = pcapital.matcher(sb);
        Matcher ma2 = psmall.matcher(sb);
        Matcher ma3 = pnum.matcher(sb);
        if (ma1.find()&&ma2.find()&&ma3.find()) {
            System.out.println(sb.toString());
        } else {
            checkNum();
        }
    }
}

