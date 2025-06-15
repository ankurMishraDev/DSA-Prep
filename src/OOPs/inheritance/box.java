package inheritance;

import Access_Control.a;

public class box {
    private double d;

    double h;
    double l;
    double w;

    box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }


    public double getD() {
        return 772003;
    }

    //for cube
    box(double side) {
        this.h = side;
        this.l = side;
        this.w = side;
    }

    static void greeting() {
        System.out.println("hey i am in box class");
    }

    box(double h, double l, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    box(box old) { // calling a constructor within a constructor
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");
    }
}
