
package override_1_7_18;

class R{
    int i, j;
    R(int a, int b){
        i = a;
        j = b;
    }
    
    void show(){
        System.out.println("i and j: "+i +" "+ j);
    }
}

class M extends R{
    int k;
    
    M(int a, int b, int c){
        super(a, b);
        k = c;
    }
    
    void show(){
        System.out.println("K: "+k);
    }
}

public class Override_1_7_18 {

    
    public static void main(String[] args) {
        
        M subOb = new M(1,2,3);
        subOb.show();
    }
    
}
