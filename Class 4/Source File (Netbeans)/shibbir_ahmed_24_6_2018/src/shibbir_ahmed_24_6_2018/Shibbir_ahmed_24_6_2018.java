
package shibbir_ahmed_24_6_2018;

class Box{
    //property
    double width;
    double height;
    double depth;
    
    //method with no return
    void volume(){
        System.out.print("The volume of box is: ");
        System.out.println(width * height * depth);
    }
    
    //method with return
    double anotherVolume(){
        return width * height * depth;
    }
    
    //method with parameter
    double dimInit(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
        return width * height * depth;
    }
}

public class Shibbir_ahmed_24_6_2018 {

   
    public static void main(String[] args) {
       //creating instance of class
       Box mybox1 = new Box();
       Box mybox2 = new Box();
       
       mybox1.width = 10;
       mybox1.height = 15;
       mybox1.depth = 25;
       
       double volume;
       
       /*
       volume = mybox1.width * mybox1.height * mybox1.depth;
       System.out.println("The volume of first box is: "+ volume);
       */
       
       //using method without retun
       mybox1.volume();
       
       //using method with reutn
       volume = mybox1.anotherVolume();
       System.out.println("The volume of first box is: "+ volume);
       
       //using method with arguments
       volume = mybox1.dimInit(10, 15, 25);
       System.out.println("The volume of first box is: "+ volume);
       
       
       mybox2.width = 3;
       mybox2.height = 6;
       mybox2.depth = 9;
       
       /*
       volume = mybox2.width * mybox2.height * mybox2.depth;
       System.out.println("The volume of second box is : "+ volume);
       */
       
       //using method without retun
       mybox2.volume();
       
       //using method with return
       volume = mybox2.anotherVolume();
       System.out.println("The volume of second box is: "+ volume);
       
       
       //using method with argument
       volume = mybox2.dimInit(3, 6, 9);
       System.out.println("The volume of second box is: "+ volume);
       
    }
    
}
