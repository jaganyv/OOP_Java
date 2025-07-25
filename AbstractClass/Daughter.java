package AbstractClass;

public class Daughter extends Parent{

    @Override
    void career(String name) {
        System.out.println("I am gonna become an doctor");
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I am gonna marry him");
    }
}
