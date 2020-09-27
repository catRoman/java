import java.util.Scanner;

public class Exercise3_3 {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
    
        
        System.out.println("(" + a + ")x + (" + b + ")y = (" + e + ")\n"
                        + "(" + c + ")x + (" + d + ")y = (" + f + ")");
        System.out.println();
        
        if((a * d) - (b * c) == 0 ){
            System.out.println("The equation has no solution. ");
        } else{
            System.out.println("The solution is true");
            System.out.println();
            cramersLaw(a,b,e,c,d,f);
            }
    }

    static void cramersLaw(double a,double b,double e,double c,double d,double f) {
        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("Where x = " + x);
        System.out.println("Where y = " + y);   
    }
}
