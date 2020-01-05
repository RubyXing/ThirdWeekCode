import java.io.*;

public class FileTest {


    public void start() {
//        showFiletest();
//        calssTest();
        writeTest();
    }


    private void showFiletest() {
        File fl1 = new File("D:\\CCC\\aaa.txt");
        InputStream fin = null;
        InputStreamReader inr = null;
        try {
            fin = new FileInputStream(fl1);
            inr = new InputStreamReader(fin);
            StringBuilder sb = new StringBuilder();
            while (inr.ready()) {
                sb.append((char) inr.read());
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inr != null) {
                try {
                    inr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void calssTest() {
        File fl1 = new File("D:\\CCC\\aaa.txt");
        byte btemp[] = new byte[1024];
        InputStream fin = null;
        try {
            fin = new FileInputStream(fl1);
            int len = 0;
            while ((len=fin.read(btemp)) != -1) {
                String show = new String(btemp, 0, len);
                System.out.println(show);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fin != null)
                    fin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
//安静的离去,和孤单一起,拥挤的回忆,随时间抹去
    private void writeTest(){
        File fl1 = new File("D:\\CCC\\aaa.txt");
        OutputStream ins=null;
        String str="安静的离去,\n和孤单一起,\n拥挤的回忆,\n随时间抹去\n";
        try {
            ins=new FileOutputStream(fl1,true);
            byte by[]=str.getBytes();
            ins.write(by);
        } catch (IOException  e) {
            e.printStackTrace();
        }finally {
            if (ins!=null) {
                try {
                    ins.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
