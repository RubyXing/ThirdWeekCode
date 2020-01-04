package expcatch;/*
 * @author Xingqilin
 *
 */

public class FakerBank {
    private double money;
    public FakerBank() {
    }

    public FakerBank(double money) {
        this.money = money;
    }
    public void withDrawal(double money) throws InsufficientFoundException ,NagativateFoundException{
        if (this.money<money){
            throw new InsufficientFoundException("你有："+this.money+",你想取："+money+"\n想啥呐");
        }
        if (money<0){
            throw new NagativateFoundException(money+"");
        }

        this.money-=money;
    }
}
