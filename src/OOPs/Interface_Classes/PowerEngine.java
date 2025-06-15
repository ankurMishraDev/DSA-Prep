package Interface_Classes;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine stops");
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void accelerator() {
        System.out.println("Power Engine accelerate");
    }
}
