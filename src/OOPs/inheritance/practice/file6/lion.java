package inheritance.practice.file6;

public class lion extends animal{
    void food(int x){
        System.out.println("lions eat flesh.");
    }

    @Override
    void food() {
        System.out.println("what kind of food lion should eat?");
    }
}
