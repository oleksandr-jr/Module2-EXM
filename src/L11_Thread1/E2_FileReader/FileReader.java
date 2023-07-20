package L11_Thread1.E2_FileReader;

import common.Console;
import common.Print;

public class FileReader implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            readNextByte();
            Print.ln("Read " + i + "/" + 10000 + "bytes", Console.color.GREEN);
        }
    }

    private void readNextByte(){

    }
}
