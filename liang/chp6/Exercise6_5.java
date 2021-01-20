import javax.lang.model.util.ElementScanner6;

public class Exercise6_5{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Enter thre numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);

    }

    public static void displaySortedNumbers(double num1, double num2, double num3){
        double temp = 0;

        if (num2 < num1 && num2 < num3){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		else if (num3 < num1 && num3 < num2) {
			temp = num1; 
			num1 = num3;
			num3 = temp;
		}
		if (num3 < num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}

        System.out.println(num1 + " " + num2 + " " + num3);
    }
}