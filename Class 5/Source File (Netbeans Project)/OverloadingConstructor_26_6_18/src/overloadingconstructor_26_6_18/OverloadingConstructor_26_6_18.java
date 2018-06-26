
package overloadingconstructor_26_6_18;

class Box{
    double width;
    double height;
    double depth;
    
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
        
    
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    
    Box(double length){
        width = height = depth = length;
    }
    
    double volume(){
        return width * height * depth;
    }
}

public class OverloadingConstructor_26_6_18 {

    
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 15, 20);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
       
        
        double result;
        
        result = mybox1.volume();
        System.out.println("Volume of mybox1 is: "+ result);
        
        result = mybox2.volume();
        System.out.println("Volume of mybox2 is: "+ result);
        
        result = mycube.volume();
        System.out.println("Volume of mycube is: "+ result);
        
       
        Box myclone = new Box(mybox1);
        
        result = myclone.volume();
        System.out.println("Volume of myclone is: "+result);
        
        
    }
    
}
