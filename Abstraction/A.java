package Abstraction;

public class A {
    protected int num;
    public String name;
    double salary;
    private float height;

    public A() {
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    A(int num, String name, double salary, float height){
        this.num = num;
        this.name = name;
        this.salary = salary;
        this.height = height;
    }
}
