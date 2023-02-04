package L19.E2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

import static java.lang.System.in;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(in);


        while (true){
            String input = sc.nextLine();
            if (input.equals("exit")) break;

            sendToServer(input);
        }

    }

    public static void sendToServer(String text) throws IOException {
        Socket socket = new Socket("localhost", 3000);

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        writer.write(text);
        writer.newLine();
        writer.flush();

        String answerFromServer = reader.readLine();
        System.out.println("<- " + answerFromServer);

        socket.close();
    }
}
