package client;

import java.io.*;

public class FileTest {
    public static void main(String[] args) throws IOException {
//        File newF = new File("LogClient/log.txt");
//        newF.createNewFile();

        FileOutputStream fos = new FileOutputStream("LogClient/log.txt",true);
        fos.write("456\n789".getBytes());
    }


}
