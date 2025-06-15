package static_example.practise;

import java.util.Arrays;

class Employee {
String name;
int age;
long salary;
String gender ;
static  long population;

  public Employee(String name, int age, long salary, String gender) {
this.name = name;
   this.age = age;
   this.salary = salary;
   this.gender = gender;
   Employee.population +=1;
  }

  public static void main(String[] args) {
      Employee[] arr = new Employee[5];
   System.out.println("Enter the details of Employee in the\n [Name->Age->salary->gender] order");
   Employee a = new Employee("ankur mishra", 20, 2000000, "male");
   Employee b = new Employee("anand mehra", 24, 35465165, "male");
   Employee c = new Employee("cooper austin", 22, 545154, "male");
   Employee d = new Employee("prachi bhardwaj", 19, 51513, "female");
   Employee e = new Employee("shreya mishra", 20, 546426, "female");
   Employee f = new Employee("aayush bansal", 20,454651, "male" );
      Employee g = new Employee("ansh mehta", 20,4554651, "male" );
      Employee w = new Employee("kiara advani", 28,3154651, "female" );
long  netSalary = a.salary+b.salary+c.salary+d.salary+ e.salary+f.salary+g.salary+w.salary;

      System.out.println(Arrays.asList(a.name,a.age, a.salary, a.gender));
   System.out.println(Arrays.asList(b.name, b.age, b.salary, a.gender));
      System.out.println(Arrays.asList(c.name, c.age, c.salary, c.gender));
      System.out.println(Arrays.asList(d.name, d.age, d.salary, d.gender));
      System.out.println(Arrays.asList(e.name, e.age, e.salary, e.gender));
      System.out.println(Arrays.asList(f.name, f.age, f.salary, f.gender));
      System.out.println(Arrays.asList(g.name, g.age, g.salary, g.gender));
      System.out.println(Arrays.asList(w.name, w.age, w.salary, w.gender));
      System.out.println("total no. of employees: " + Employee.population);
      System.out.println("total amount of salary: " + netSalary);
  }
 }
