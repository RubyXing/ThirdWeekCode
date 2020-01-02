import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//在一个医疗系统中，需要对门诊挂号以及处方药进行结算，请结算一下单个病人的费用。
//展鹏缴费清单：挂号费10元，门诊费10元，办卡费3.5元，药费23.91元，服务费按照总金额的5%收取，求总费用
class BigdicimalDemo {

    public void start() {
//        BigDecimal bg1=new BigDecimal("10");
//        BigDecimal bg2=new BigDecimal("10");
//        BigDecimal bg3=new BigDecimal("3.5");
//        BigDecimal bg4=new BigDecimal("23.91");
//
//        bg1=bg1.add(bg2).add(bg3).add(bg4);
//        System.out.println(bg1.multiply(new BigDecimal("1.05")).setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println(getRandom());
//        preRegax("123123123");
    }

    private String getRandom() {
        Random ra = new Random();
        StringBuilder sb = new StringBuilder();
        char onechar='0';
//        int weight[]={11,12,13,14,21,31,41,22,23,32};
        int weight[]={11,12,13,14,21,22,23,31,32,41},i=0;
        while (sb.length() < 6) {
            switch (ra.nextInt(3)) {
                case 0:
                    onechar = (char) ('a' + ra.nextInt(26));
                    break;
                case 1:
                    onechar = (char) ('A' + ra.nextInt(26));
                    i++;
                    break;
                case 2:
                    onechar = (char) ('0' + ra.nextInt(10));
                    i+=10;
                    break;
            }
            if (sb.indexOf(onechar + "") == -1) {
                sb.append(onechar);
            }
        }
        if (Arrays.binarySearch(weight,i)==-1) {
            return getRandom();
        }
        return sb.toString();
    }

    private void preRegax(String str1){
        Pattern pat=Pattern.compile("[1-9]\\d{4,10}");
        Matcher ma=pat.matcher(str1);
        System.out.println(ma.matches());
    }

}
