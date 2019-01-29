package ch2;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDP_send {
    public static void main(String[] args) throws IOException {

        //define a scanner for get input from user
        Scanner input = new Scanner(System.in);
        while (true){
            //create socket
            DatagramSocket ds = new DatagramSocket();

            String uinput = input.nextLine();
            if (uinput.equals("end")){
                break;
            }

            //define some parameters
            byte[] buf = uinput.getBytes();
            int length = buf.length;
            InetAddress address = InetAddress.getByName("192.168.0.104");
            int port = 7879;

            //construct the packet sent
            DatagramPacket dp = new DatagramPacket(buf,length,address,port);

            //send packet
            ds.send(dp);

            //release the socket after sending
            ds.close();
        }


        System.out.println("/***GoodBye!***/");

    }
}
