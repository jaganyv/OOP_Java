package MultiTasking;

public class MultiThreading extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello I am Cristiano Ronaldo");
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) {
        MultiThreading mt = new MultiThreading();
        mt.run();

    }
}
