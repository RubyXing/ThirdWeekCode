import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//        1：检查D盘下是否存在文件a.txt,如果不存在则创建该文件。
//在D盘下创建一个名为ccc的文件夹，要求如下：
//1.ccc文件夹中要求包含bbb子文件夹
//2.bbb子文件夹要求包含aaa文件夹
//获取D盘aaa文件夹中b.txt文件的文件名，文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台。
//将D盘下aaa文件夹删除,要求文件夹aaa是一个空文件夹。
public class FileStudy {
    public void start() {
//    homework1();


        System.out.println("请输入地址：");
        Scanner sc = new Scanner(System.in);
        File fl1 = new File(sc.nextLine());
        File fl2[] = fl1.listFiles();
        homeword2(fl2);


    }

    private void homework1() {

        File fl1 = new File("D:\\targetfile\\a.txt");
        if (fl1.exists()) {
            try {
                System.out.println(fl1.createNewFile());
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        File fl2 = new File("D:\\");
        File fl3 = new File(fl2, "ccc\\bbb\\aaa");
        File fl4 = new File(fl3, "b.txt");
        System.out.println(fl3.mkdirs());
        try {
            System.out.println(fl4.createNewFile());
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(fl4.getPath());
        System.out.println(fl4.getName());
        System.out.println(fl4.getParent());
        System.out.println(fl4.getAbsolutePath());
        System.out.println(fl4.getTotalSpace());
        System.out.println(fl4.getFreeSpace());

        System.out.println(fl4.delete());
        System.out.println(fl3.delete());

    }

    private void homeword2(File... dir) {
        for (File fi : dir) {
            if (fi.isDirectory()) {
                File flt[] = fi.listFiles();
                if (flt != null) {
                    homeword2(flt);
                }
            } else {
                if (fi.getName().endsWith(".png") || fi.getName().endsWith(".jpg")) {
                    System.out.println("找到图片" + fi.getAbsoluteFile());
                }
            }
        }

    }

}
