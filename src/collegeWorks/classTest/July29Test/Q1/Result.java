package collegeWorks.classTest.July29Test.Q1;

public class Result extends Test {
    public Result(int[]arr,int rollNo){
        super(arr,rollNo);
    }
    public void Display(int[]arr, int rollNo){
        Result result = new Result(arr,rollNo);
        int marks = 0;
        int avg = 0;
        System.out.println("Roll No.: "+rollNo);
        for (int i = 0; i < 5; i++) {
            marks += arr[i];
        }
        avg = marks/arr.length;
        System.out.println("Total Marks: "+ marks);
        System.out.println("Average: " + avg);
    }

    public static void main(String[] args) {
        int [] marks = {87,76,78,98,88};
        int rollNo = 1;
        Result student1 = new Result(marks,rollNo);
        student1.Display(marks,rollNo);
    }
}
