package Access_Control;

public class a {
    int num;
    public static String name;
    public int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public a(int num, String name, int arr) {
        this.num = num;
        this.name = name;
        this.arr = new int[arr];
    }
}
