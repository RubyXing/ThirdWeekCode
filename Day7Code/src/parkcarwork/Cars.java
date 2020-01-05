package parkcarwork;/*
 * @author Xingqilin
 *
 */

import java.text.SimpleDateFormat;
import java.util.Date;

//简易停车场系统
//功能
//;1：入场：登记入库车辆车牌号，时间，颜色信息:
//2： 出场：登记车辆，车牌号，颜色信息，自动获取时间，并且与入场进行匹配，每分钟1块钱计算。
// 其他需求;要求数据要能永久保存。
public class Cars {
    private String cID;
    private String cColor;
    private Date cTime;

    public Cars(String cID, String cColor, Date cTime) {
        this.cID = cID;
        this.cColor = cColor;
        this.cTime = cTime;
    }

    public Cars() {
    }

    public String getcID() {
        return cID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public String getcColor() {
        return cColor;
    }

    public void setcColor(String cColor) {
        this.cColor = cColor;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    @Override
    public String toString() {
        return cID + "," + cColor + ","+ new SimpleDateFormat("停入日期:yyyy年MM月dd日 HH:mm:ss").format(cTime);
    }

    public String showcar() {
        return "车牌：" + cID + ",颜色：" + cColor + "," + new SimpleDateFormat("停入日期:yyyy年MM月dd日 HH:mm:ss").format(cTime);
    }
}
