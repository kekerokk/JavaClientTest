package com.kv.myapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Repos {
    private Socket s;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public Repos() throws IOException {
         s = new Socket("localhost",11000);
    }

    public void startConnection(String ip, int port) throws IOException {
        clientSocket = new Socket(ip, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public void sendMessage() throws IOException {
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("HELLO NIGGER");
        pr.flush();
    }

    public void stopConnection() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
    }
}
