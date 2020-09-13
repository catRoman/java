import java.lang.Math.*;
 class Exercise7 {
    public static void main(String[] args){
        double pi =4 * 1.0 -(1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11);
        double piExtended = 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13));


        System.out.println("This is pi: " + pi);
        System.out.println("This is also pie: " + piExtended);
        System.out.println("This is the real Pi: " + Math.PI);
    }
}