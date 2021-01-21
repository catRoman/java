public class Exercise5_6{
    public static void main(String[] args){
        final double M_T_K = 1.609;

        System.out.printf("Miles\tKilometers  |  Kilometers\tMiles\n");

            int kilo = 20;
        for(int i = 1;i <= 10; i++){
            System.out.printf("%-5d\t%-10.3f  |  %-10d\t%-5.3f\n",i,(i * M_T_K),kilo,(kilo / M_T_K));
            kilo += 5;
        }
    }
}