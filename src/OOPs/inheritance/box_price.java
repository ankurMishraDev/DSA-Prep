package inheritance;

public class box_price extends box_weight {
    double value ;

    box_price() {
        super();
        this.value = -4;
    }

    public static void main(String[] args) {
        box_price a = new box_price();
        System.out.println(a.value);
    }

    box_price(box_price other) {
        super(other);
        this.value = other.value;


    }

    box_price(double l, double h, double w, double weight, double value) {
        super(l, h, w, weight);
        this.value = value;
    }
    public box_price(double side, double weight, double value){
        super(side, weight);
        this.value = value;
    }



}


//}
