package ch2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendThread extends Thread{

    private int port;
   // private String addr = null;

    public SendThread(int _port){
        this.port = _port;
       // this.addr = _addr;
    }

    @Override
    public void run() {
        super.run();
        DatagramSocket ds = null;
        try{
            //define a scanner for get input from user
            Scanner input = new Scanner(System.in);
            while (true){
                //create socket
                ds = new DatagramSocket();

                String uinput = input.nextLine();
                if (uinput.equals("end")){
                    break;
                }

                //define some parameters
                byte[] buf = uinput.getBytes();
                int length = buf.length;
                InetAddress address = InetAddress.getByName("192.168.0.104");
               // InetAddress address = InetAddress.getByName(addr);


                //construct the packet sent
                DatagramPacket dp = new DatagramPacket(buf,length,address,port);

                //send packet
                ds.send(dp);

                //release the socket after sending
                //ds.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(ds != null) {
                System.out.println("****goodBye****");
                ds.close();
            }
        }
    }
}
