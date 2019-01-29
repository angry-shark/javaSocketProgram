package ch2;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Receive {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5050);

        Socket client = serverSocket.accept();//receive build the connection from Sender
        System.out.println("Connect Successful");

        InputStream inputStream = client.getInputStream();

        byte[] b = new byte[1024];

        while (true){
            inputStream.read(b);

            String str = new String(b,0,b.length);
            System.out.println("receive is " + str);

        }
//
//        client.close();
//        serverSocket.close();
    }
}
