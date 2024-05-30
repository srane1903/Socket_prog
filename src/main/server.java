package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

    public static void main(String[] args) {
        ServerSocket ss = null;
        try {
            // Create the server socket
            ss = new ServerSocket(8081);
            System.out.println("Waiting for clients...");

            while (true) {
                // Accept a client connection
                Socket soc = ss.accept();
                System.out.println("Connection established!");

                // Read input from the client
                BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                String str = in.readLine();
                System.out.println("Received from client: " + str);

                // Send a response back to the client
                PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
                out.println("Server says: " + str);
                System.out.println("Sent to client: " + str);

                // Close the client socket
                soc.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ss != null) {
                try {
                    // Close the server socket
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


