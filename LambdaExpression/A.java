package LambdaExpression;
//Lambda Expression ()-> can only be used for interface
public interface A {
    void display();

    public static void main(String[] args) {
        A obj = ()-> {
            System.out.println("This is Display.");
        };
        obj.display();
    }
}
