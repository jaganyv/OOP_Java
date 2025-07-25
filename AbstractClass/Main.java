package AbstractClass;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.career("Engineer");
        Daughter daughter = new Daughter();
        daughter.career("Doctor");
        son.partner("bmw",21);
        daughter.partner("Audi",20);
    }
}
