package singleton;

public class Singleton {
    private static Singleton getInstance;
    public static Singleton instance(){
        if(getInstance == null){
            getInstance = new Singleton();
        }
        return getInstance;
    }

}
