package OOP_Main;

public class Multilevel {
    void eat(){
        System.out.println("I will Eat");
    }
    static class Dog extends Multilevel{
        void bark(){
            System.out.println("I will Bark..");
        }
    }
    static class Cat extends Dog{
        void meow(){
            System.out.println("I will Meow");
        }
    }

    public static void main(String[] args) {
      Cat c1 = new Cat();
      c1.eat();
      c1.bark();
      c1.meow();
    }
}
