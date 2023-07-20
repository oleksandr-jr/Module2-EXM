package L11_Thread1.E2_FileReader;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        Thread fileReaderThread = new Thread(fileReader, "FileReader");
        fileReaderThread.start();

        UI helloWindow = new UI();
        Thread UIThread = new Thread(helloWindow, "HelloWindow");
        UIThread.start();
    }
}
