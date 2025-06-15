package Arrays.assignmentProblems;

public class dsaQuestion {
    public static void main(String[] args) {
        int time = mobilePad(5,"ankur");
        System.out.println(time);
    }
    public static int mobilePad(int wordLength, String str){
        String [][]dialPad = {
                {"_","@"},{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}
        };
        int time =0,count=0;
        String temp="";
        while(count<wordLength){
            temp= String.valueOf(str.charAt(count));
            for (int i = 0; i <dialPad.length; i++) {
                for (int j = 0,k=1; j < dialPad[i].length; k++,j++) {
                    if (temp.equals(dialPad[i][j])){
                        time=k+time;
                    }
                }
            }
            count++;
        }
        return time;
    }
}
