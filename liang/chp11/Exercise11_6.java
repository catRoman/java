import java.util.ArrayList;
import java.util.Date;

public class Exercise11_6{
    public static void main(String[] args){

        ArrayList<Object> myList = new ArrayList<>();

        Circle myCircle = new Circle(10, "Blue", true);
        Loan myLoan = new Loan(2, 5, 10000);
        Date today = new Date();

        myList.add(myCircle);
        myList.add(myLoan);
        myList.add(today);

        for(Object e : myList){
            System.out.println(e.toString());
            System.out.println();
        }
    }
}