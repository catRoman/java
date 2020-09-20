import java.util.Scanner;

class Exercise2_7{


    static public void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        double min = input.nextDouble();
        double years = ((min/60)/24)/365;
        double days = (years - (long)years) * 365;

        System.out.println((long)min + " minutes is approximately " + (long)years + " and " + (long)days + " days");    
    }
}