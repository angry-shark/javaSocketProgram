package ch2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_Receive {
    public static void main(String[] args) throws IOException {

        while (true){
            //create the Socket and pass the parameter as the port be listen
            DatagramSocket ds = new DatagramSocket(7879);

            //create a byte array to store the data be received
            byte[] buf = new byte[1024];
            //pass the byte array as the parameter to store the data be receive
            DatagramPacket dp = new DatagramPacket(buf,1024);
            //receive the datapacket in dp and store the data in buf,The program will wait the send request
            ds.receive(dp);

            String str = new String(dp.getData(),0,dp.getLength());

            //release the receive socket
            ds.close();

            System.out.println("The receive data is:" + str);
        }
    }
}
