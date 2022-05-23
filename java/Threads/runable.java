package Threads;

public class runable implements Runnable{
    public void run(){
        System.out.println("Hello iam Runablethread");
    }

    public static void main(String[] args) {
        creathre a = new creathre(new runable()) ;
        
        a.start();
    }
}


