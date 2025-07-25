package Generics;

public class Product<T,U>{
    T item;
    U price;

    Product(T item,U price){
        this.item = item;
        this.price = price;
    }
    public T setItem(T item){
        return this.item;
    }
    public U setPrice(U price){
        return this.price;
    }
}
