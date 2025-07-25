package OOP_Main;

public class Hybrid {
    void eat(){
        System.out.println("The Animal Eats");
    }
    static class Dog extends Hybrid{
        void bark(){
            System.out.println("The Dog Barks.");
        }
    }
    static class Cat extends Dog{
        void meow(){
            System.out.println("Cat Meows.");
        }
    }
    static class Puppy extends Dog{
        void weeps(){
            System.out.println("Puppy weeps.");
        }
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        Puppy p1 = new Puppy();
        p1.weeps();
        p1.eat();
        p1.bark();
        Cat c1 = new Cat();
        c1.meow();
        c1.eat();
    }
}
