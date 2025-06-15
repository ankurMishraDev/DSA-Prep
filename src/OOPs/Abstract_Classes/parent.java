package Abstract_Classes;

public abstract class parent {
    int age;

    public parent(int age) {
        this.age = age;
    }

    abstract  void career();
    abstract void  partner ();

    void normal(){
        System.out.println("this is a normal text");
    }

}
