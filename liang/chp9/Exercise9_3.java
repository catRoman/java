import java.util.Date;

public class Exercise9_3{
    public static void main(String[] args){

        Date[] myDate = new Date[8];

        long timeElapsed = 1000;
        for(int i = 0; i < myDate.length; i++){
            myDate[i] = new Date(timeElapsed);
            System.out.println(timeElapsed + ": " + myDate[i].toString());
            timeElapsed *= 10;
        }
        System.out.println();
    }
}