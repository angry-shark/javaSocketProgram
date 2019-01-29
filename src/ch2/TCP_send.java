package ch2;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCP_send {
    public static void main(String[] args) throws Exception {
        //Socket
        Socket s = new Socket("192.168.137.1",5050);//build the connection to 192.168.137.1:5050

        Scanner input = new Scanner(System.in);
        OutputStream output = s.getOutputStream();

        while (true){
            output.write(input.nextLine().getBytes());
        }

       // s.close();

    }
}
