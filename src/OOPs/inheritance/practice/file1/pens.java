package inheritance.practice.file1;

public class pens extends stationary_stand{
    String  color;
    int numberOfPens;

    public pens(String material, int blocks, String color, int numberOfPens) {
        super(material, blocks);
        this.color = color;
        this.numberOfPens = numberOfPens;
    }
}
