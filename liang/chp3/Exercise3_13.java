import java.util.Scanner;


public class Exercise3_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("(0-single filler, 1-married jointly or "
                        + "qualified widow(er), 2-marries seperately"
                        + ", 3-head of househole) Enter the filling status: ");

        int status = input.nextInt();

        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        double tax = 0;

        if (status == 0) {
           tax = taxFunction(income, 8350,33950,82250,171550,372950);
        } else if (status == 1) {
           tax = taxFunction(income, 16700, 67900, 137050, 208850, 372950);
        } else if (status == 2){
            tax = taxFunction(income, 8350, 33950, 68525,104425,186475);
        } else if (status == 3){
            tax = taxFunction(income, 11950, 45500, 117450, 190200, 372950);
        } else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }
        System.out.println("Tax is " + (int)(tax * 100)/ 100.0);
    }

    public static double taxFunction(double income, int a, int b, int c, int d, int e){
        double tax = 0;

        if (income <= a)
        tax = income * 0.10;
        else if (income <= b)
        tax = a * 0.10 + (income - a) * 0.15;
        else if (income <= c)
        tax = a * 0.10 + (b - a) * 0.15 + (income - b) * 0.25;
        else if (income <= d)
        tax = a * 0.10 + (b -a) * 0.15 + (c - b) * 0.25 
            + (income - c) * 0.28;
        else if (income <= e)
        tax = a * 0.10 + (b -a) * 0.15 + (c - b) * 0.25 
            + (d - c) * 0.28 + (income - d) * 0.33;
        else
        tax = a * 0.10 + (b - a) * 0.15 + (c -b) * 0.25 
            + (d - c) * 0.28 + (e - d) * 0.33 + (income - e) * 0.35;
        
            return tax;
        }
}