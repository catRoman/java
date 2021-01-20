import java.util.Scanner;

public class Exercise3_25 {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
    
        double a = (y1-y2);
        double b = (x1 - x2);
        double c = (y3 - y4);
        double d = (x3 - x4);
        double e = (a * x1) - (b * y1);
        double f = (c * x3) - (d * y3);

        System.out.println("(" + a + ")x + (" + b + ")y = (" + e + ")\n"
                        + "(" + c + ")x + (" + d + ")y = (" + f + ")");
        System.out.println();
        
        if((a * d) - (b * c) == 0 ){
            System.out.println("The ywo lines are parallel ");
        } else{
            
            System.out.println();
            cramersLaw(a,b,e,c,d,f);
            }
    }

    static void cramersLaw(double a,double b,double e,double c,double d,double f) {
        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));
        x = (int)((x * 100000)+0.5)/100000.0;
        y = (int)((y * 100000)+0.5)/100000.0;
       System.out.println("The intersecting point is at (" + x + ", " + y + ")");  
    }
}
