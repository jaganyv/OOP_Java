package ExampleBox;

public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice(){
        super();
        this.cost = -1;
    }
    BoxPrice(BoxPrice other){
//        super(other);
        this.cost = other.cost;
    }
//    BoxPrice(double l,double h,double w,double weight,double cost){
//        super(l,h,w,weight);
//        this.cost = cost;
//    }
    BoxPrice(double side,double weight,double cost){
        super(side,weight);
        this.cost = cost;
    }
    BoxPrice(double side){
        super(side);
        this.cost = cost;
    }
}
