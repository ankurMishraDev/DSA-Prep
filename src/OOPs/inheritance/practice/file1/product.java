package inheritance.practice.file1;

public class product extends pencil {
    public product(String material, int numberOfBlocks, String color, int numberOfPens, String color1, int numberOfMarker, int numberOfPencils) {
        super(material, numberOfBlocks, color, numberOfPens, color1, numberOfMarker, numberOfPencils);

    }

    public static void main(String[] args) {
        product[] arr = new product[6];
        int ands;
        product Product = new product("metal", 4, "black", 4, "red", 3, 5);
        System.out.println("Stationary stand properties in order material->number of blocks in it-> pens color-> number of pens->number of marker-> number of pencils");
        System.out.println("stand material " + Product.material);
        System.out.println("No. of blocks " + Product.numberOfBlocks);
        System.out.println("Color of pens " + Product.color);
        System.out.println("number of pens " + Product.numberOfPens);
        System.out.println("number of markers " + Product.numberOfMarker);
        System.out.println("number of pencils " + Product.numberOfPencils);
        System.out.println(Product.getDesign());// reading private variable data
        Product.setDesign("attached");//modifying private variable data
        System.out.println(Product.getDesign());
    }
}
