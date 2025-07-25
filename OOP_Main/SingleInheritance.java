package OOP_Main;

public class SingleInheritance {
    void eat(){
        System.out.println("Everyone will eat");
    }
    static class Dog extends SingleInheritance{
        void bark(){
            System.out.println("Dog Will Bark..");
        }
    }
    static class Cat extends SingleInheritance{
        void meow(){
            System.out.println("Cat Meows...");
        }
    }

    public static void main(String[] args) {
        Cat d1 = new Cat();
        d1.eat();
        d1.meow();

    }
}
