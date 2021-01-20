import java.util.GregorianCalendar;

public class Exercise9_5{
    public static void main(String[] args){
        GregorianCalendar todaysDate = new GregorianCalendar();
        GregorianCalendar givenDate = new GregorianCalendar();

        System.out.println("Todays date is: " + todaysDate.get(GregorianCalendar.MONTH)
                        + " " + todaysDate.get(GregorianCalendar.DAY_OF_MONTH)
                        + " " + todaysDate.get(GregorianCalendar.YEAR));
        System.out.println();
        givenDate.setTimeInMillis(1234567898765L);
        System.out.println("The given date is: " + givenDate.get(GregorianCalendar.MONTH)
                        + " " + givenDate.get(GregorianCalendar.DAY_OF_MONTH)
                        + " " + givenDate.get(GregorianCalendar.YEAR));
        System.out.println();

    }
}