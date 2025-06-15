package Abstract_Classes;

public class daughter extends parent{
    public daughter(int age) {
        super(age);
    }
    @Override
    void career() {
        System.out.println("I am going to be a professional athlete");
    }

    @Override
    void partner() {
        System.out.println("I love my pet he is 5 years old" );
    }

}
