package AbstractClass;

public abstract class Animal {
    abstract void makeSound();
    static class Dog extends Animal{
        void makeSound(){
            System.out.println("Wow wow Nallaiyan");
        }
    }
    static class Cat extends Animal{
        void makeSound(){
            System.out.println("Meow Meow Chandru.");
        }
    }

    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.makeSound();
        Dog d1 = new Dog();
        d1.makeSound();
    }
}
