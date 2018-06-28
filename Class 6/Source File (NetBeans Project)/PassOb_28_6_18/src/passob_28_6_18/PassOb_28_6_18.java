
package passob_28_6_18;

class test{
    int a,b;
    
    test (int i, int j){
        a = i;
        b = j;
    }
    
    boolean equals(test o){
        if (o.a == a && o.b == b){
            return true;
        }else{
            return false;
        }
    }
}

public class PassOb_28_6_18 {

    
    public static void main(String[] args) {
        test ob1 = new test(100,22);
        test ob2 = new test(100,22);
        test ob3 = new test(-1,-1);
        
        System.out.println("Are ob1 and ob2 equal ? "+ ob1.equals(ob2));
        
        System.out.println("Are ob1 and ob3 equal ? "+ ob1.equals(ob3));
        
    }
    
}
