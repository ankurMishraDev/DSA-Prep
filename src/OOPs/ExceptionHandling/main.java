package ExceptionHandling;

public class main  {
    public static void main(String[] args) throws myException {
        int a= 4, b = 0;
        try {
//            divide(a,b);
            String name = "ankur";
           if (name.equals("ankur")){
                throw new myException("name is ankur");
            }
        }
        catch (myException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e ){
            System.out.println("normal exception");
        }
        finally {
            System.out.println("this will always execute");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0 ){
            throw new ArithmeticException("please do not divide by zero");
        }
        return a/b;
    }
}
