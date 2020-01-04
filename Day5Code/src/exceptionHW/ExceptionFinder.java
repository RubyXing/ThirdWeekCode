package exceptionHW;/*
 * @author Xingqilin
 *
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionFinder {

    public void start() {
        try {
            System.out.println(new SimpleDateFormat("YYYY").format("2019"));
        }catch (IllegalArgumentException e){

            System.out.println(e);
        }

        try {
            System.out.println(new SimpleDateFormat("yyyy").parse("avc"));
        } catch (ParseException e) {
            System.out.println(e);
        }

        try {
            ExceptionFinder e=null;
            e.start();
        }catch (NullPointerException e){
            System.out.println(e);
        }


    }
}
