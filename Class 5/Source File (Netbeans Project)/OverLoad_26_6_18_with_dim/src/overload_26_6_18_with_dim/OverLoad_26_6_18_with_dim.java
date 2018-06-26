
package overload_26_6_18_with_dim;

class Overloaddemo{
    void test(){
        System.out.println("No Parameter");
    }
    
    void test(int a, int b){
        System.out.println("a and b: "+a +" " + b);
    }
    
    void test(double a){
        System.out.println("Inside test(double) a: "+ a);
    }
    
    
}

public class OverLoad_26_6_18_with_dim {

    
    public static void main(String[] args) {
       Overloaddemo ob = new Overloaddemo();
       int i = 88;
       ob.test();
       ob.test(10, 10);
       ob.test(i);
       ob.test(123.25);
    }
    
}
    