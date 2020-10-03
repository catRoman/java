public class Exercise5_4 {
    public static void main(String[] args){

        final double MILES_TO_KILO = 1.609;

        System.out.println("Miles\t\tKilometers");
        for(int i = 1; i <=10; i++){
            double kilometers = (int)((i * MILES_TO_KILO)* 1000)/1000.0;
            System.out.println(i + "\t\t" + kilometers);
        }
    }
}