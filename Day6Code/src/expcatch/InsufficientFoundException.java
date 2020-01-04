package expcatch;/*
 * @author Xingqilin
 *
 */

public class InsufficientFoundException extends Exception {
    public InsufficientFoundException() {
        super();
    }

    public InsufficientFoundException(String message) {
        super("你没钱了的异常:"+message);
    }
}
