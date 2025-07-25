package Main;

class Test{
    String name;
    Test(String name){
        this.name = name;
    }
}
public class Main {

    public static void main(String[] args) {
        Test t1 = new Test("Kunal");
        System.out.println(t1.name);
      Main showing = new Main();
      showing.show();
      say();
    }

    static void say(){
        System.out.println("Remember the name leo messi!");
    }
    void show(){
        display();
    }
    void display(){
        System.out.println("Hello I am Cristiano Ronaldo");
    }

}