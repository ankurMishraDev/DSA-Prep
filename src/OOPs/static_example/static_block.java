package static_example;

public class static_block {
   static int a = 4;
    static int b;
    static  {//will only run once, when the first object is created i.e. when the class is loaded for the first time
        System.out.println("I am in static block");
        b= a*5;
    }

    public static void main(String[] args) {
        static_block obj = new static_block();
        System.out.println(static_block.a + " " + static_block.b);

        static_block.b += 4;
        System.out.println(static_block.a + " " + static_block.b);

        static_block obj2 = new static_block();
        System.out.println(static_block.a + " " + static_block.b);
        static_block.b += 54;

        System.out.println(static_block.a + " " + static_block.b);


    }
}
