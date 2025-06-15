package Access_Control;

@SuppressWarnings("ALL")
public class ObjectsDemo {
    int num;
    float gpa;

    public ObjectsDemo(int num, float gpa) {
        super();
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {//a unique representation of an object via a no.
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectsDemo) obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void finalize() throws Throwable{
        System.out.println("finalize method called");
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectsDemo obj = new ObjectsDemo(98, 9.2f);
        ObjectsDemo obj2 = new ObjectsDemo(98, 8.9f);
        if (obj == obj2) {
            System.out.println("obj is equal to obj2");
        }
        if (obj.equals(obj2)) {
            System.out.println("obj  equal to obj2");
        }

//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
    }

}
// Java program to demonstrate working of getClass()
class Test {
    public static void main(String[] args) {
        Object obj = new String("GeeksForGeeks");
        Class c = obj.getClass();
        System.out.println("Class of Object obj is : "
                + c.getName());
    }
}
