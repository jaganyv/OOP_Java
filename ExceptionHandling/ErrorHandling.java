package ExceptionHandling;
import java.util.*;
public class ErrorHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int a = scanner.nextInt();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
