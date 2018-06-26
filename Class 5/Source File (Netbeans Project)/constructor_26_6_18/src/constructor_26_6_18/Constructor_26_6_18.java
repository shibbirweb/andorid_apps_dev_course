
package constructor_26_6_18;

class Box{
    double width;
    double height;
    double depth;
    
    
    /*
       **constructor without parameter
    Box(){
        System.out.println("Constructing the Box");
        width = 10;
        height = 15;
        depth = 20; 
    }
   */
    
     
    /*
       **constructor with parameter
    */
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d; 
    }
   
    
    double volume(){
        return width * height * depth;
    }
            
}

public class Constructor_26_6_18 {

   
    public static void main(String[] args) {
        
        /*
       *constructor without argument
        Box mybox1 = new Box();
        Box mybox2 = new Box();
       */
        
        /*
        *constructor with argument
        */
        Box mybox1 = new Box(10,15,20);
        Box mybox2 = new Box(3,6,9);
        
        
        double result;
        
        
        result = mybox1.volume();
        System.out.println("The volume of first box is: "+ result);
        
        result = mybox2.volume();
        System.out.println("The volume of second box is: "+ result);
    }
    
}
