
package arraylist_22_07_2018;

import java.util.ArrayList;

public class ArrayList_22_07_2018 {

   
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("Shibbir");
        list.add("Ahmed");
        list.add("Rizwan");
        list.add("Raihan");
        list.add("Vaira deloar");
        
        System.out.print(list.size()+"\n");
        list.remove(1);
        System.out.println("Size "+list.size());
        System.out.println(list.get(0));
        
        list.clear();
        System.err.println(list.size());
                
          
        
        
    }
    
}
