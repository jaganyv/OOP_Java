package ExampleBox;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
     this.weight = -1;
     this.w = -1;
    }
    public BoxWeight(double l,double h,double w,double weight){
        super(l,h,w); //call the parent class constructor
//        used to initalize values present in parent class this is known as super class
        this.weight = weight;
    }
    public BoxWeight(double side,double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double side) {
        super(side);
//        this.side = side;
    }
}
