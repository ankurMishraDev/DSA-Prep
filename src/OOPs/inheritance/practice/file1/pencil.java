package inheritance.practice.file1;

public class pencil extends marker {
    int numberOfPencils;

    public pencil(String material, int numberOfBlocks, String color, int numberOfPens, String color1, int numberOfMarker, int numberOfPencils) {
        super(material, numberOfBlocks, color, numberOfPens, color1, numberOfMarker);
        this.numberOfPencils = numberOfPencils;
    }
}
