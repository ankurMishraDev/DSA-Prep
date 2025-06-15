package Interface_Classes;

public class main {
    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.accelerator();
//        car1.start();
//        car1.stop();
//        car1.brake();
//
//        media carMedia = new Car();
//        carMedia.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.stopMusic();
        car.upgradeEngine();
        car.start();

    }
}

