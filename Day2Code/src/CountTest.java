import com.sun.org.apache.xalan.internal.xsltc.compiler.SyntaxTreeNode;

import java.text.DecimalFormat;

//以下是一段歌词，请从这段歌词中统计出朋友出现的次数。
//这些年一个人，风也过，雨也走，有过泪，有过错, 还记得坚持甚么，真爱过才会懂，会寂寞会回首，终有梦终有你在心中。
//朋友一生一起走，那些日子不再有，一句话，一辈子，一生情，一杯酒。朋友不曾孤单过，一声朋友你会懂，还有伤，还有痛，还要走，还有我。”
class CountTest {
    int count = 0;
    public void countF(String str, int index) {
        int tempi = str.indexOf("朋友", index);
        if (tempi == -1) {
            System.out.println("朋友出现了：" + count + "次");
            return;
        } else {
            count++;
        }
        countF(str, tempi + 1);
    }


    //习题：钱币输出：从右边开始计数，每三个数字用逗号分割 如：23456789--->输出     23,456,789
    public void formatM(String str2) {
        double money = Double.parseDouble(str2);
        System.out.println(new DecimalFormat(",###").format(money));

    }
    /*可以优化从后往前加
    for(i=str2.length()-3,i>0,i-=3){
        str2.insert(i,",");
    }
    */
    public void formatN(String str2) {
        int fnum = str2.length() / 3, indexn = str2.length() % 3;
        if (indexn == 0) {
            fnum--;
            indexn = 3;
        }
        StringBuilder strnew = new StringBuilder(str2);
        for (int i = 0; i < fnum; i++) {
            strnew = strnew.insert(indexn, ",");
            indexn += 4;
        }
        System.out.println(strnew);
    }

    //    编写一个StringBufferDemo类，在主方法中，创建两个int值，和一个double值，
//    建立一个StringBuffer对象，把三个值添加到StringBuffer中，并且输出
    public void stringBufferDemo(int i, int j, double k) {
        StringBuffer stringBuffer = new StringBuffer("int:" + i + "," + j + ",double:" + k);
        System.out.println(stringBuffer);
    }

    //    将一个字符串的其中一部分内容进行翻转“蜗牛学院评价表：xxx 学院满意度：优  教师评分：中 教师评价:伙食评价：差”  ，
//    对其中“教师评价：”这几个字进行翻转，其他字符不变，并且整句输出
    public void myreverse(String str4) {
        System.out.println(str4.replace("教师评价:", new StringBuilder(str4.substring(str4.indexOf("教师评价:"), str4.indexOf("教师评价:") + 5)).reverse().toString()));
    }
}
