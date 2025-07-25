package OOPS;

public class GetterandSetter {
    private String name;
    public String getName(){
        return name;
    }
    public String setName(String name){
        this.name = name;
        return name;
    }
    public static void main(String[] args) {
      GetterandSetter gt = new GetterandSetter();
      gt.setName("Jagan Yadav ");
      System.out.println(gt.getName());
    }
}
