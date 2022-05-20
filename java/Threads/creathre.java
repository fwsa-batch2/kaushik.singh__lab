package Threads;

public class creathre extends Thread {
    public void run(){
        System.out.println("Hello iam thread");
    }

    public static void main(String[] args) {
        creathre a = new creathre();

        a.start();
    }
}
