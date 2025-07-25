package Generics;

public class Box<T>{
    T item;

    public Box(T item) {
        this.item = item;
    }
    public T setItem(T item){
        return this.item;
    }
    public T getItem(){
        return item;
    }
}
