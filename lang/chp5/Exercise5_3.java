public class Exercise5_3{
    public static void main(String[] args){
        final double KILO_TO_POUNDS = 2.2;

        

        System.out.println("kilograms\tPounds");
        for (int i = 1; i <= 199; i += 2){
            double pounds = (int)((i * KILO_TO_POUNDS) * 10)/10.0;
            System.out.println(i + "\t\t" + pounds);

        }
    }
}