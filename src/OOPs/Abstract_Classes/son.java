package Abstract_Classes;

public  class son extends parent {
    public son(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("I am going to be a professional footballer");

    }

    @Override
    void partner() {
        System.out.println("I love playing football" );
    }
}
