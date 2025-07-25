package AbstractClass;

public class Son extends Parent{

    @Override
    void career(String name) {
        System.out.println("I am gonna become a Full stack developer");
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I am gonna marry her");
    }
}
