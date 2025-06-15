package Access_Control;


public class subClass extends a {
    public subClass(int num, String name, int arr) {
        super(num, name, arr);
    }


    public static void main(String[] args) {
        subClass   obj = new subClass(45, "ankur",93);
        int n = obj.num;
//        System.out.println(n);
    }
}
 class subClass2 extends a {
    public subClass2(int num, String name, int arr) {
        super(num, name, arr);
    }

    public static void main(String[] args) {
        subClass2   obj = new subClass2(45, "ankur",93);
        int w = obj.num;
        System.out.println(w);
        System.out.println(obj instanceof subClass2);
        System.out.println(obj.getClass().getName() );
    }
}


