package L3.E2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("file.txt");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        while (bufferedInputStream.available() > 0){
            System.out.println(bufferedInputStream.read());
        }

        fileInputStream.close();
    }
}
