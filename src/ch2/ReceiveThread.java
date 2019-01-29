package ch2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveThread extends Thread {

    private int port;

    public ReceiveThread(int _port){
        this.port = _port;
    }

    @Override
    public void run() {
        super.run();
        DatagramSocket ds = null;
        try {
            //create the Socket and pass the parameter as the port be listen
            ds = new DatagramSocket(port);
            while (true){
                //create a byte array to store the data be received
                byte[] buf = new byte[1024];
                //pass the byte array as the parameter to store the data be receive
                DatagramPacket dp = new DatagramPacket(buf,1024);
                //receive the datapacket in dp and store the data in buf,The program will wait the send request
                ds.receive(dp);

                String str = new String(dp.getData(),0,dp.getLength());

                System.out.println("The receive data is:" + str);

                //release the receive socket
               // ds.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(ds != null){
                ds.close();
            }
        }


    }
}
