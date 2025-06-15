package inheritance.practice.file1;

public class marker extends pens {
    String color;
    int numberOfMarker;

    public marker(String material, int blocks, String color, int numberOfPens, String color1, int numberOfMarker) {
        super(material, blocks, color, numberOfPens);
        this.color = color1;
        this.numberOfMarker = numberOfMarker;
    }
}
