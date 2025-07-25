package FileHandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
public class Writer {
    public static void main(String[] args) {
//        try {
//            FileWriter fw = new FileWriter("output.txt");
//            fw.write("Hello Brother.");
//            fw.append("Hi Brother.");
//            fw.close();
//            System.out.println("File Written Successfully");
//            FileReader fr = new FileReader("output.txt");
//            System.out.println(fr);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//}
//    }
     try{
         BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
         bw.write("Hello Brother");
         System.out.println("Data Written Successfully");
     }catch (Exception e){
         System.out.println(e);
     }
    }
}