package MultiTasking;

public abstract class Thread {
    protected static void sleep(int i) {
    }

    abstract void run();
    static class A extends Thread{

        @Override
        void run() {

        }
    }
    static class B extends Thread{
        void run(){
            for(int i=0;i<10;i++){
                System.out.println("Okay bye...");
            }
        }
    }

    public static void main(String[] args) {
        A a1 = new A();
        a1.run();
        B b1 = new B();
        b1.run();
    }
}
