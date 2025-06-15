package inheritance.practice.file5;

public class Hello {
    {
        show();
    }
    Hello(){
        System.out.println("hello constructor");
        show();
    }
    void show(){
        System.out.println("hello method");
    }
}
