package Enums;

public class basic {
    enum week{
        monday, tuesday, wednesday, thursday, friday, saturday, sunday;// these are enum constants
        // every member here is of public, static and final class.
        //since its final you can't create child enums

        week() {
            System.out.println("Constructor called for " + this);
        }
//        this constructor is not public or protected, only private or default
        // as we don't want to create new objects
//        this is not the enum concept, that's why

        // internally: public static final week monday = new week();

    public static void main(String[] args) {
        week Week ;
        Week = week.wednesday;
//         for(week day : week.values()){
//             System.out.println(day);
//         }
//        System.out.println(Week);
    }
}}
