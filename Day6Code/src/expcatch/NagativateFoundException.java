package expcatch;/*
 * @author Xingqilin
 *
 */

public class NagativateFoundException extends Exception {
    public NagativateFoundException() {
        super();
    }

    public NagativateFoundException(String message) {
        super("你取："+message+"元");
    }
}
