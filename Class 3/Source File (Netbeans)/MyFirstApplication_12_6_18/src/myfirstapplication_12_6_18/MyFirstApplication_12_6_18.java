
package myfirstapplication_12_6_18;

public class MyFirstApplication_12_6_18 {


    public static void main(String[] args) {
       /*
        double r, pi, area;
        r = 10.8;
        pi = 3.1415;
        area = pi*r*r;
        System.out.println("Area is : "+area);
        
        int x, y, addition;
        x = 10;
        y = 30;
        addition = x + y;
        System.out.println("Addition of x and y is: "+ addition);
        
        double ami, tumi;
        double amra;
        ami = 10;
        tumi = 4;
        amra = ami/tumi;
        System.out.println(amra);
        */
       
       
       //conditional statement
       int FirstNumeber, SecondNumber;
       
       FirstNumeber = 50;
       SecondNumber = 60;
       
       if(FirstNumeber > SecondNumber){
           System.out.println("First number is geater than Second Number");
       }
       
       if(FirstNumeber < SecondNumber){
           System.out.println("First number is smaller than Second Number");
       }
       
       if(FirstNumeber == SecondNumber){
           System.out.println("First Number and Second Number are equal");
       }
       
       //the for loop
       int x;
       for(x=1; x<=10; x=x+2){
        System.out.println("Line "+ x);
       }
       
       int y;
       for(y=10; y>=0; y--){
           System.out.println(y);
       }
       
       int i;
       for(i=0; i <= 20; i=i+2){
           System.out.println("Even number: "+i);
       }
        
    }
}
