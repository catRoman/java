import java.lang.Math.*;
 class Exercise7 {

     static void piFunction(int total){
     double x = 1.0;
        double num = 1.0;
        double xDen = 1.0;
        double xNum = 1.0;
     for(int i = 1; i <= total; i++) {
         // count number up to total by two
        
         if(i == 1.0){
             x = 1.0;
            
         } else {
         xDen = (xDen + 2.0);
         }
         x = num * (xNum/xDen);
         if(i % 2 == 0){
             x = x * (-1);
         }
        
         System.out.println("This is a test pi algorithm: " + x);
     }
       }

    public static void main(String[] args){
        double pi1 =4 * 1.0 -(1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11);
        double piExtended = 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13));
        int total = 5;
       

       

        
        System.out.println("This is pi: " + pi1);
        System.out.println("This is also pie: " + piExtended);
        System.out.println("This is the real Pi: " + Math.PI);
        piFunction(total);
    }
}