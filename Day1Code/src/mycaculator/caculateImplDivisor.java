package mycaculator;/*
 * @author Xingqilin
 */

public class caculateImplDivisor implements caculate {
    @Override
    public double operate(double num1, double num2) {
        if (num2!=0){
            return num1/num2;
        }
        return -1;
    }
}
