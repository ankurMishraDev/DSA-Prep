package static_example;

public class Main {
    public static void main(String[] args) {
     Main obj1 = new Main();
     obj1.ref();
     obj1.message();
    }
    static void abs(){
       /* [greet();]you can't use this because this function is a non-static code block .
        you can't access non-static stuff without referencing their instances in a static context
        Hence you can't access it directly , firstly you have to make a reference object to make it's static context*/
        Main obj = new Main();
        obj.greet();
    }
    void ref(){
        greet();
    }
    void greet(){
        System.out.println("It's me Ankur");
    }
    void message(){
        System.out.println("java programming");
    }
}
