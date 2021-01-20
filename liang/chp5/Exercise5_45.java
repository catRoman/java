public class Exercise5_45{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter 10 numbers: ");
        double devTemp = 0;
        double temp = 0;
        for(int i = 1; i <=10; i++){
        double number = input.nextDouble();
        temp += number;
        devTemp += Math.pow(number, 2);  
        }
        System.out.println("The mean is " + temp/10.0);
        System.out.printf("The standard deviation is %1.5f\n",stdDevFunction(temp, devTemp));
    }
    public static double stdDevFunction(double temp, double devTemp){
        double inside = ((devTemp)-(Math.pow(temp,2) / 10.0))/ 9.0;
        double deviation = Math.pow(inside, 0.5);

        return deviation;
    }
}