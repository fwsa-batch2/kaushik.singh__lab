package Threads;

public class mluthr extends Thread{
        public static void main(String[] args) {
            Muluthr obj = new mluthr();
            for(int i=0; i <6 ; i++){
                obj.run();
            }
        }
    
        public void run() {
            System.out.println("Running...");
        }
    }





