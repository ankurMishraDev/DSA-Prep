package Cloning;

public class human implements Cloneable{
    int age;
    String name;
    int []arr ;


    public human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr =new int[]{3,5,2,6,4,654};
    }

//    public human(human other) {
//        this.age = other.age;
//        this.name = other.name;
//    }
    public Object clone() throws CloneNotSupportedException{
       human twin = (human)super.clone();//this is actually a shallow copy
        // make a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
