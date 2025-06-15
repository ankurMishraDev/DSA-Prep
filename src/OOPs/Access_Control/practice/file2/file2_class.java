package Access_Control.practice.file2;
import Access_Control.practice.file1.a;
public class file2_class extends a{
    public file2_class(int x, int y, int z, int s) {
        super(x, y, z, s);
    }

    public static void main(String[] args) {
        file2_class object = new file2_class(45,321,18,4);
        System.out.println(object.y);
        System.out.println(object.z);
        System.out.println(object.getS());
        object.method2();
        object.method3();
        object.getmethod4();
    }

}
