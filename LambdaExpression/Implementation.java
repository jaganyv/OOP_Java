package LambdaExpression;

public class Implementation implements Readable,Writable,Storable{
    @Override
    public void read() {
        System.out.println("Reading From Interface");
    }

    @Override
    public void store() {
        System.out.println("Storing From Interface");
    }

    @Override
    public void write() {
        System.out.println("Writing From Interface");
    }

    public static void main(String[] args) {
        Implementation imp = new Implementation();
        imp.read();
        imp.write();
        imp.store();
    }
}
