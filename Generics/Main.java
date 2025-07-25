package Generics;

public class Main {
    public static void main(String[] args) {
//        Box<String> b1 = new Box<>("Apple");
//        System.out.println(b1.getItem());
        Product<String,Integer> p1 = new Product<>("Apple",25);
        System.out.println(p1.item);
        System.out.println(p1.price);
    }
}
