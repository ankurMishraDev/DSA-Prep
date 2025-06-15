package inheritance.practice.file6;

public class animalTest extends lion{
    public static void main(String[] args) {
        animal obj = new animal();
        obj.food();
//        obj.food(456);

        lion obj1 = new lion();
        obj1.food();
        obj1.food(40);
    }
}
