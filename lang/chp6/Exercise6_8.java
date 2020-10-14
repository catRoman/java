public class Exercise6_8{
    public static void main(String[] args){

        System.out.printf("Celsius\tFahrenheit\t|\tFahrenheit\tCelsius\n");
        System.out.println("---------------------------------------------------");

        for(int i = 40, j = 120; i >= 31; i--, j -=10 ){
            System.out.printf("%-7.1f\t%-10.1f\t|\t%10.1f\t%-7.2f\n",(double)i, celsiusToFahrenheit(i),(double)j,fahrenheitToCelsius(j));
        }
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}