package static_example;

import java.util.Arrays;

public class human {
    int age;
    String name;
    int salary;

    boolean gender;

    static  long population;


    static void mail(){
        System.out.println("hello everyone");
    }

    public human(int age, String name, int salary, boolean gender) {
    this.age = age;
    this.name = name;
    this.salary = salary;
    this.gender = gender;
    human.population +=1;

    }

    public static void main(String[] args) {
        mail();
        human b = new human(20, "ankur mishra", 100000000, true);
        human a = new human(20, "anmol mishra", 20000, true);

        human s = new human(20, "ankur nehra", 7000000, true);
        human e = new human(20, "ankur mehta", 18100000, true);
        human q = new human(20, "neha sharma", 8340000, false);
        human h = new human(20, "arpit mishra", 27000000, true);
        human ew = new human(20, "aaditya mishra", 7200000, true);
        human w = new human(20, "anshika mishra", 10000, false);
        human n = new human(20, "ankush mishra", 14200000, true);
        System.out.println(w.name);
        System.out.println(a.salary);
        System.out.println(s.gender);
        System.out.println(e.age);
        System.out.println(q.name);
        System.out.println(h.salary);
        System.out.println(ew.gender);
        System.out.println(w.age);
        System.out.println(n.name);
        System.out.println(human.population);
    }
}
