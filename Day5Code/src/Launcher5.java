import exceptionHW.Students;

public class Launcher5 {
    public static void main(String[] args) {
        Students stu1=new Students("xing", "12","34");
        Students stu2=new Students("xing", "14","34");
        System.out.println(stu1.equals(stu2));
        stu2=stu1;
        System.out.println(stu2 == stu1);
//        System.out.println(stu1.equals(stu2) ? "匹配成功" : "匹配失败");

//        ExceptionFinder ef=new ExceptionFinder();
//        ef.start();

    }
}
