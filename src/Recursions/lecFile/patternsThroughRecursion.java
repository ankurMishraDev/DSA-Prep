package Recursions.lecFile;

public class patternsThroughRecursion {
    public static void main(String[] args) {
        pattern1(4,0);
        pattern2(5,0);
    }
    static void pattern1(int r,int c){
        if(r<1){
            return;
        }
        while(c<r){
            System.out.print("* ");
            c++;
        }
        System.out.println(" ");
        pattern1(r-1,0);
    }
    static void pattern2(int lastRow,int currentRow){
        if(currentRow>lastRow) return;
        int c = 1;
        while(c<currentRow){
            System.out.print("* ");
            c++;
        }
        System.out.println(" ");
        pattern2(lastRow,++currentRow);
    }
}
