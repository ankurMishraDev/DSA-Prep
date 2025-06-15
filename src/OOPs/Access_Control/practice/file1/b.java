package Access_Control.practice.file1;

 class b extends a {
    public b(){
        super(48,4,37,29);
    }
    public static void main(String[] args) {
        a obj = new a(2,8,46,5);
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
        System.out.println(obj.getS());
        obj.method1();
        obj.method2();
        obj.method3();
        obj.getmethod4();
    }
}
