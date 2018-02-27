package Papers.Model.codes;

import java.io.*;

public class DemoC2B {
        private File f = new File("Examination/Papers/Model/codes/fileOperationDemo.html");
        public void iFIS() throws IOException {
            FileInputStream fis = new FileInputStream(f);
            byte b[] = new byte[1024];
            fis.read(b);
            System.out.println("FIS: " + new String(b).trim());
        }
        public void iBIS() throws IOException{
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
            byte b[] = new byte[1024];
            bis.read(b);
            System.out.println("BIS: " + new String(b).trim());
        }
        public void iFOS(String message) throws IOException{
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(message.getBytes());
            fos.close();
        }
        public void iBOS(String message) throws IOException{
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f));
            bos.write(message.getBytes());
            bos.close();
        }
        public static void main(String args[]) {
            DemoC2B obj = new DemoC2B();
            try {
                obj.iFIS();
                obj.iBIS();
                obj.iFOS("Hello World");
                obj.iBOS("This is me");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}
