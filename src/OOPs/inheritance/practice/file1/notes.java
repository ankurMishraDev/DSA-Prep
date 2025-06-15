package inheritance.practice.file1;

public class notes extends pencil{
    String type;
    int numberOfPacks;

    public notes(String material, int numberOfBlocks, String color, int numberOfPens, String color1,
                 int numberOfMarker, int numberOfPencils, String type, int numberOfPacks) {
        super(material, numberOfBlocks, color, numberOfPens, color1, numberOfMarker, numberOfPencils);
        this.type = type;
        this.numberOfPacks = numberOfPacks;
    }
}
