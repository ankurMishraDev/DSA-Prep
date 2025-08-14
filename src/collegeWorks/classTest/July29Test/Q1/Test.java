package collegeWorks.classTest.July29Test.Q1;

class Student{
   private int rollNo = 0;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
public class Test extends Student {
    int []marks = new int[5];
    public Test(int [] arr,int rollNo){
        super.setRollNo(rollNo);
        this.marks = arr;
    }
}
