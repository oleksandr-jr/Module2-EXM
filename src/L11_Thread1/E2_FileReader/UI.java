package L11_Thread1.E2_FileReader;

import common.Console;
import common.Print;

public class UI implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            render();
            Print.ln("Rendered " + i + " Frames", Console.color.BLUE);
        }
    }

    private void render(){

    }
}
