import java.io.*;

public class FileTest {


    public void start() {
//        showFiletest();
//        calssTest();
//        writeTest();
//        copyPicture();
//        writeTest();
        rwdertest();
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
        File fl2 = new File("D:\\CCC\\bbb.txt");
        byte btemp[] = new byte[1024];
        InputStream fin = null;
        OutputStream fout = null;
        try {
            fin = new FileInputStream(fl1);
            fout = new FileOutputStream(fl2);
            int len = 0;
            while ((len = fin.read(btemp)) != -1) {
                String show = new String(btemp, 0, len);
                System.out.println(show + "写入成功");
                fout.write(btemp);
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
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //安静的离去,和孤单一起,拥挤的回忆,随时间抹去
    private void writeTest() {
        File fl1 = new File("D:\\CCC\\aaa.txt");
        OutputStream ins = null;
        String str = "安静的离去,\n和孤单一起,\n拥挤的回忆,\r\n随时间抹去\r\n";
        try {
            ins = new FileOutputStream(fl1, true);
            byte by[] = str.getBytes();
            ins.write(by);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ins != null) {
                try {
                    ins.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private void copyPicture() {
        File fl1 = new File("D:\\ccc\\bbb\\aaa\\stringbuffer删除.png");
        File fl2 = new File("D:\\ccc\\becopy.png");
        byte btemp[] = new byte[1024];
        InputStream fin = null;
        OutputStream fout = null;
        try {
            fin = new FileInputStream(fl1);
            int len = 0;
            fout = new FileOutputStream(fl2);
            while ((len = fin.read(btemp)) != -1) {
                fout.write(btemp, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fout != null) {
                    fout.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void rwdertest(){
        File fl1 = new File("D:\\CCC\\aaa.txt");
        Reader re1=null;
        Writer wr1=null;
        try {
            wr1=new FileWriter(fl1,true);
            re1=new FileReader(fl1);
//            String str = "aaaaaa";
//            wr1.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (wr1 != null) {
                    wr1.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
