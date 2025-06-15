package inheritance.practice.file1;

public class stationary_stand {
    String material;
    int numberOfBlocks;
    private String design = "upside down";

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public stationary_stand(String material, int numberOfBlocks) {
        this.material = material;
        this.numberOfBlocks = numberOfBlocks;
    }
}
