package stringClassWork;

public class Persone {
    String uname, upwd, uaddress;

    public Persone(String uname, String upwd, String uaddress) {
        this.uname = uname;
        this.upwd = upwd;
        this.uaddress = uaddress;
    }

    public Persone() {
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    @Override
    public String toString() {
        return "uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", uaddress='" + uaddress + '\'';
    }
}
