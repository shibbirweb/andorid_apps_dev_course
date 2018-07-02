
package threaddemo_1_7_18;


public class ThreadDemo_1_7_18 {

    
    public static void main(String[] args) {
        
        Thread t = Thread.currentThread();
        
        System.out.println("Current thread : "+t);
        
        t.setName("My Thread");
        
        System.out.println("After name Change: "+ t);
        
        try{
            for(int n = 5; n> 0; n--){
                System.out.println(n);
                Thread.sleep(2000);
                
            }
        } catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
    }
    
}
