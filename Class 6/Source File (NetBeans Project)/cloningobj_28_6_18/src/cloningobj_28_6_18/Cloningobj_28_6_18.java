
package cloningobj_28_6_18;

class Box{
    double width;
    double height;
    double depth;
    
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d; 
    }
    
    Box(){
        width = -2;
        height = -3;
        depth = -4;
    }
    
    Box(double length){
        width = height = depth = length;
    }
    
    double volume(){
        return width * height * depth;
    }
}

public class Cloningobj_28_6_18 {

    
    public static void main(String[] args) {
       
        Box mybox1 = new Box(15,16,17);
        Box mybox2 = new Box();
        Box mybox3 = new Box(6,7,8);
        Box mycube = new Box(8);
        
        Box cloneObj = new Box(mybox3);
        
        double result;
        result = mybox1.volume();
        System.out.println("The volume of mybox1 is : "+result);
        
        result = mybox2.volume();
        System.out.println("The volume of mybox2 is: "+result);
        
        result = mybox3.volume();
        System.out.println("The volume of mybox3 is : "+result);
        
        result = mycube.volume();
        System.out.println("The volume of mycube is: "+result);
        
        result = cloneObj.volume();
        System.out.println("The volume of cloneObj is: "+result);
    }
    
}
