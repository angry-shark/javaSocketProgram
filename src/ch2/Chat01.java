package ch2;

public class Chat01 {
    public static void main(String[] args) {
        SendThread St = new SendThread(7889);
        ReceiveThread Rt = new ReceiveThread(7890);
        St.start();
        Rt.start();
    }
}
