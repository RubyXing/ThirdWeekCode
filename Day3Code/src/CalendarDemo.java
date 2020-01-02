import java.util.Calendar;
import java.util.GregorianCalendar;

class CalendarDemo {
    void start() {
//        getDifference();
//        getMonthday();
        getDayoflast();
    }


    //    判断 1996年6月19日10时68分10秒，1995年5月15日12时68分10秒之间相差多少秒
    private void getDifference() {
        Calendar ca1 = Calendar.getInstance();
        Calendar ca2 = Calendar.getInstance();
        try {
//            ca1.setTime(new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒").parse("1996年6月19日 10时68分10秒"));
//            ca2.setTime(new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒").parse("1995年5月15日 12时68分10"));
            ca1.set(1996, 6, 19, 10, 68, 10);
            ca2.set(1995, 5, 15, 12, 68, 10);
            System.out.println(ca1.getTime());
            System.out.println((ca1.getTimeInMillis() - ca2.getTimeInMillis()) / 1000);
        } catch (Exception e) {
        }
    }

    //    2028年的2月一共有多少天
    private void getMonthday() {
        Calendar ca1 = Calendar.getInstance();
        ca1.set(2028, 1,1);
//        System.out.println(ca1.get(Calendar.DAY_OF_MONTH));
//        System.out.println(ca1.getActualMaximum(Calendar.MONTH));

        System.out.println(new GregorianCalendar().isLeapYear(2028) ? 29 : 28);
    }
    private void getDayoflast(){
        Calendar ca1 = Calendar.getInstance();
        ca1.add(Calendar.YEAR,-1);
        System.out.println("星期"+"零天一二三四五六".charAt(ca1.get(Calendar.DAY_OF_WEEK)));
    }
}
