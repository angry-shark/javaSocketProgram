package ch1;

public class Demo01_CreateThead {
    public static void main(String[] args) {
        myThread Thread1 = new myThread();
        Thread1.start();
        for (int i = 0; i < 1000 ; i++) {
            System.out.println("Main Thread " + i);
        }
    }
}

class myThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 1000 ; i++) {
            System.out.println( "myThread " + i);
        }
    }
}
