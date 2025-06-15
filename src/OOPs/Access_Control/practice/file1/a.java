package Access_Control.practice.file1;

public class a {
    int x ;
    public int y;
    protected int z;
    private int s;

    public a() {
    }

    void method1(){
        System.out.println("method1 called");
    }
    public void method2(){
        System.out.println("method2 called");
    }
    protected void method3(){
        System.out.println("method3 called");
    }
    private int method4(){
        System.out.println("method4 called");
        return 0;
    }
    protected int getmethod4(){
        return method4();
    }

    public int getS(){return s;}
    public a(int x,int y,int z,int s){
        this.x = x;
        this.y = y;
        this.z = z;
        this.s = s;
    }

}
class aa{
    public static void main(String[] args) {
        a obj1 = new a(54,1114,32,18);
        System.out.println(obj1.x);
        System.out.println(obj1.y);
        System.out.println(obj1.z);
        System.out.println(obj1.getS());
        obj1.method1();
        obj1.method2();
        obj1.method3();

    }
}
class sample extends b{
    public static void main(String[] args) {
        sample obj2 = new sample();
        System.out.println(obj2.x);
        System.out.println(obj2.y);
        System.out.println(obj2.z);
        System.out.println(obj2.getS());
        obj2.method1();
        obj2.method2();
        obj2.method3();
        obj2.getmethod4();

    }
}
