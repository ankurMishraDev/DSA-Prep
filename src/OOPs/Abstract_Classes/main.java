package Abstract_Classes;

public class main {
    public static void main(String[] args) {
        son Son = new son(25);
        Son.career();
        Son.partner();
        System.out.println(Son.age);

        daughter Daughter = new daughter(27);
        Daughter.career();
        Daughter.partner();
        System.out.println(Daughter.age);

        parent mon = new parent(34) {
            @Override
            void career() {

            }

            @Override
            void partner() {

            }
        };
   }
}
