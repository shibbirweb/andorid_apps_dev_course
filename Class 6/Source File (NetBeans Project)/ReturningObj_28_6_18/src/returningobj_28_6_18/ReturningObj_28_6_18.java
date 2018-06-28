
package returningobj_28_6_18;

class Test{
    int a;
    
    Test(int i){
        a = i;
    }
    
    Test incrByTen(){
        Test temp = new Test(a+10);
        return temp;
    }
    
}

public class ReturningObj_28_6_18 {

    
    public static void main(String[] args) {
        
        Test ob1= new Test(2);
        Test ob2;
        
        ob2= ob1.incrByTen();
        
        System.out.println("ob1.a: "+ ob1.a);
        System.out.println("ob2.a: "+ ob2.a);
        
        ob2= ob2.incrByTen();
        System.out.println("ob2. after second increment: "+ ob2.a);
    }
    
}
