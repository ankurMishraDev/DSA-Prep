package inheritance;

public class Main {
    public static void main(String[] args) {
        box box1 = new box(7);
        System.out.println(box1.h + " " + box1.l + " " + box1.w);
        box box2 = new box(7, 34, 34);
        System.out.println(box2.h + " " + box2.l + " " + box2.w);
        box box3 = new box(box2);
        System.out.println(box3.l + box3.w + box3.l);
        System.out.println(box1.getD());
        box1.greeting();
        box box = new box_weight();
//        box_weight container = new box_weight();
//        System.out.println(container.l + " " + container.h + " " + container.w + "  " + container.weight);
//
//        box box4 = new box_weight();
//      [  System.out.println(box4.l + " "+ box4.h + " "  + box4.w + "  " +  box4.weight);] here you are making an object of parent class along with
//      child elements
//        but, you can't  access the elements which aren't initialized in the parent constructor

        /* there are many variables in both parent and child classes you are given access to variables that are in
        the ref type i.e. box_weight
        hence you should have access to weight variable . This also means that the ones you are truing to access it
        should be initialized but here
        when the obj itself
        is a type of parent class ,  how will you call the constructor of child class
        that is why we are facing error  */
//        box_weight box5 = new box(12, 3, 4);
//        box_price box = new box_price(65,8,4,1,2);


//    box_price box = new box_price(54,23,48);
    }

}

