package Strings;

public class performance {
    public static void main(String[] args) {
        String series = " ";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+ i);
            series = series + ch;
            /* during this loop execution by every iteration the value gets changed and we know that Strings are immutable
              hence the previous value doesn't change actually a new every has been created every time and the rest of
              the previous value get destroyed by garbage collector since they aren't pointing towards any, thing.
             */
        }
        System.out.println(series);
    }
}
