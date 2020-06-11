import java.io.*;

class fileinp {

    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("input1.txt");
            int c;
            while ((c = in.read()) != -1) {
                System.out.println(" no :  " + c);
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
