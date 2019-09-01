package cn.beauty.network.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocket {

    public MySocket() {
        try {
            ServerSocket serverSocket = new ServerSocket();
            serverSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Socket socket = new Socket();


    }
}
