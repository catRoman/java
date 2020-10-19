public class Exercise6_9{
    public static void main(String[] args){
        System.out.printf("%-10s%-10s|%10s%10s\t\n", "Feet","Meters","Meters","Feet");
        for(int i = 1 ; i<= 45;i++)
            System.out.print("-");
        System.out.println();
        for(int i = 1, j = 20; i <= 10; i++, j +=5){
            System.out.printf("%-10.1f%-10.3f|%10.1f%14.3f\n",(double)i,footToMeter((double)i),(double)j,meterToFoot((double)j));
        }
    }
public static double footToMeter(double foot){
    double meter = 0.305 * foot;
    return meter;
}
public static double meterToFoot(double meter){
    double foot = 3.279 * meter;
    return foot;
}
}
