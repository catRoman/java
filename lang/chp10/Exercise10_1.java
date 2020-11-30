

public class Exercise10_1{
    public static void main(String[] args){
        Time time1 = new Time();
        Time time2 = new Time(555550000);

        System.out.println(time1.toString());
        System.out.println();
        System.out.println(time2.toString());
    }
}