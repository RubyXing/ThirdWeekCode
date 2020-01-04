package expcatch;/*
 * @author Xingqilin
 *
 */


public class TwoExpCatch {
    public void catchexp(){

        try {
            String s = "123";
            Object o=s;
            Integer i=(Integer)o;

            int c[]=new int[5];
            c[6]=12;

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }catch (ClassCastException e){
            System.out.println("类型转换异常");
        }finally {
            System.out.println("最终");
        }


    }
}
