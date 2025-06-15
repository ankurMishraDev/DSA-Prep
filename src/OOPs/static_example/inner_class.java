package static_example;

public class inner_class {
    public static void main(String[] args) {
        a first = new a("ankur");
        b firstM = new b(98);

        a second = new a("ansh");
        b secondM = new b(95);
        System.out.println(first.name);
        System.out.println(firstM.marks);
        System.out.println(second.name);
        System.out.println(secondM.marks);
    }
    static class b {// this class is applicable in main function only until it is declared as static.
        int marks;

        public b(int marks) {
            this.marks = marks;
        }
    }
}
class a {
    String name;
    public a (String name){
        this.name = name;
    }
}

