package L19.E2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);
        System.out.println("Server started");

        while (true){
            Socket socket = serverSocket.accept();


            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream()));

            String query = reader.readLine();

            System.out.println("Server received: " + query);

            String answer = String.format("Hello, from server. Your message was: %s", query);

            writer.write(answer);
            writer.flush();

            socket.close();
        }
    }
}
