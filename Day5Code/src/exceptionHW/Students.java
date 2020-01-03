package exceptionHW;/*
 * @author Xingqilin
 *
 */

public class Students implements Cloneable{
    private String sname;
    private String sage;
    private String sgrade;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Students() {
    }

    public Students(String sname, String sage, String sgrade) {
        this.sname = sname;
        this.sage = sage;
        this.sgrade = sgrade;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage;
    }

    public String getSgrade() {
        return sgrade;
    }

    public void setSgrade(String sgrade) {
        this.sgrade = sgrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", sage='" + sage + '\'' +
                ", sgrade='" + sgrade + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Students) {
            Students stu=(Students)obj;
            if (this.sgrade.equals(stu.sgrade)){
                return true;
            }
        }
        return false;
    }
}