import java.util.Scanner;

public class Exercise4_23{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employess's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        int hours = input.nextInt();
        System.out.print("Enter the hourly rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter provincial tax withholding rate: ");
        double provincialTax = input.nextDouble();

        double gross = hours * rate;
        double fTax = gross * federalTax;
        double pTax = gross * provincialTax;
        double net = gross - (fTax + pTax);
        System.out.println();
        System.out.printf("Employee Name: %s\nHours Worked: %d\n" 
                            + "Pay Rate: $%2.2f\nGross Pay: $%2.2f\nDeductions:\n"
                            + "\tFederal Withdholding (%2.1f%%): $%2.2f\n"
                            + "\tProvincial Withholding (%2.1f%%): $%2.2f\n"
                            + "\tTotal Deduction: $%2.2f\nNet Pay: $%2.2f\n", 
                            name , hours, rate, gross, (federalTax * 100),
                            fTax, (provincialTax * 100), pTax,(fTax + pTax), net);
    }
}