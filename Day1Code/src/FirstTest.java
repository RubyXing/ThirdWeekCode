public class FirstTest {
    public static void main(String[] args) {
        System.out.println(Test2.str);
    }
}
class Test1{
    public static final String str=new String("sout1111");
    static {
        System.out.println("test1 static");
    }
}
class Test2 extends Test1{
    static {
        System.out.println("test2 static");
    }
}