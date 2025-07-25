package Polymorphism.MethodOverloading;

public class Number {
    double sum(double a,int b){
        return a + b;
    }
    int sum(int a,int b,int c){
        return a + b + c;
    }
    int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    void sum(String name,int a){
        System.out.println(name+a);
    }

    public static void main(String[] args) {
        Number obj = new Number();
        obj.sum(1,2);
        obj.sum(1,2,3);
        obj.sum(1,2,3,4);
        obj.sum("Jagan",18);
    }
}
