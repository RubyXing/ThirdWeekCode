package RegexTest;/*
 * @author Xingqilin
 *
 */

import java.util.regex.Pattern;

//（需求）判断简单邮箱的验证示例：wangyijsyy@126.com
//规则：邮箱首字母为字母，@符号以前字母数字下划线均可，@符号后与.符号前，字母+数字 ，然后在.后只能是3位字母。
//生成一个4位随机数，要求：必须有大小写，和数字，并且不能重复（且数字大小写必须出现一次）
public class Day3homwork {

    public void start() {
        checkEmail("xingqilin@126.com");
    }

    private boolean checkEmail(String eml){
        Pattern pa=Pattern.compile("");

        return false;
    }
}
