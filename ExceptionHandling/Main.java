package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
          divide(a,b);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Whatever Happens It will Run...");
        }
    }

    static int divide(int a,int b) throws Exception{
        if(b == 0){
            throw new Exception("Cannot divide by Zero");
        }
        return a/b;
    }

}
