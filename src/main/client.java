package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class client {

    public static void main(String[] args) {
        try {
            System.out.println("CLIENT started !");
            Socket soc = new Socket("localhost", 8081);

            // Read data from keyboard
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a String: ");
            String str = userInput.readLine();

            // Send data to the server
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println(str);
            System.out.println("Sent to server: " + str);

            // Read response from the server
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String serverResponse = in.readLine();
            System.out.println("Received from server: " + serverResponse);

            // Close the socket
            soc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

