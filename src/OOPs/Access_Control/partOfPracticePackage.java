package Access_Control;

import Access_Control.practice.file2.file2_class;

public class partOfPracticePackage extends file2_class {
    public partOfPracticePackage(int x, int y, int z, int s) {
        super(x, y, z, s);
    }

    public static void main(String[] args) {
        partOfPracticePackage model = new partOfPracticePackage(4, 46, 48, 37);
        System.out.println(model.y);
        System.out.println(model.z);
        System.out.println(model.getS());
        model.method2();
        model.method3();
        model.getmethod4();
    }
}
