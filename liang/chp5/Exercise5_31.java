public class Exercise5_31{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double deposit = input.nextInt();
        System.out.print("Enter the annual percent yield: ");
        double annualYield = input.nextDouble();
        System.out.print("Enter the maturity period (number of months): ");
        int numOfMonths = input.nextInt();

        System.out.println("Month  CD Value");

        
        for(int i = 1; i <= numOfMonths; i++){
            deposit = deposit + (deposit * annualYield) / 1200.0;
            System.out.printf("%-6d  %8.2f\n", i, deposit);
        }
    }
}