import java.lang.Math.*;
 class Exercise7 {

     static double piFunction(int total){
    
        double x = 1.0;
        double num = 4.0;
        double xDen = 1.0;
        double xNum = 1.0;
        double pi = 0;
    
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

        pi = pi + x;
    }
    return pi;
    }

    public static void main(String[] args){
       
        double pi1 =4 * (1.0 -(1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        double piExtended = 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13));
        int total = 5;

        System.out.println("Through simple addition of 6 iterations,");
        System.out.println("This is pi: " + pi1);
        System.out.println("This is with 7 iterations: " + piExtended);
        System.out.println();
        System.out.println("This is using the Math method provided by JVM,");
        System.out.println("This is the real Pi: " + Math.PI);
        System.out.println();
        System.out.println("This is through use of an Algorithm in a method I created");
        System.out.println("This is pi to six iterations: " + piFunction(6));
        System.out.println("This is pi to 7 iterations: " + piFunction(7));
        System.out.println("This is pi to 8 iterations: " + piFunction(8));
        System.out.println("This is pi to 9 iterations: " + piFunction(9));
        System.out.println("This is pi to 10 iterations: " + piFunction(10));
        System.out.println("This is pi to 100 iterations: " + piFunction(100));
        System.out.println("This is pi to 250 iterations: " + piFunction(250));
        System.out.println("This is pi to 1000 iterations: " + piFunction(1000));
        System.out.println("This is pi to 10000 iterations: " + piFunction(10000));
    }
}