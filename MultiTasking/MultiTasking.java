package MultiTasking;

public class MultiTasking {
    void start(){
        for(int i=0;i<10;i++){
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        MultiTasking ml = new MultiTasking();
        ml.start();
    }
}
