package exceptionhandling_1_7_18;

class Exception{
    /*
        *   java error
        
    static void subroutine(){
        int d = 0;
        int a = 10/d;
        
    }
    */
}

public class ExceptionHandling_1_7_18 {

    public static void main(String[] args) {
        
        /*
        *   java error
        
        Exception.subroutine();
        */
        
        int d, a;
        
        try{
            d = 0;
            d =42/d;
            System.out.println("This will not printed");
        } catch(ArithmeticException e){ // catch divided by zero
            System.out.println("Division by zero");
            System.out.println("After catch exception");
        }
    }

}
