package ch2;

public class Chat02 {
    public static void main(String[] args) {
        SendThread St = new SendThread(7890);
        ReceiveThread Rt = new ReceiveThread(7889);
        St.start();
        Rt.start();
    }
}
