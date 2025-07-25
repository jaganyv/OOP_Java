package OOP_Main;

public class Heirarchial {
    void eat(){
        System.out.println("Eating bro...");
    }
    static class Dog extends Heirarchial{
        void bark(){
            System.out.println("Barking bro...");
        }
    }
    static class Cat extends Heirarchial{
        void meow(){
            System.out.println("Cat Meows");
        }
    }

    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.meow();
        c1.eat();
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
    }
}
