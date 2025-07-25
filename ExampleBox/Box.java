package ExampleBox;

public class Box {
    private double l;
    double h;
    double w;

    Box(){
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }
    Box(double l,double h,double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
    public void information(){
        System.out.println("Running the box...");
    }
}
