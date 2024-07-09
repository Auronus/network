import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        String host = "netology.homework";
        int port = 8080;
        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            String resp = in.readLine();
            System.out.println(resp);
            out.println(s.nextLine());

            resp = in.readLine();
            System.out.println(resp);
            out.println(s.nextLine());

            resp = in.readLine();
            System.out.println(resp);
        }
    }
}
