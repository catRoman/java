/**=======================
 *      UML Diagram
 * =======================
 *      MyDate
 * -----------------------
 *  - int year
 *  - int month
 *  - int day
 *  + MyDate()
 *  + MyDate(elapsedTime : long)
 *  + MyDate(year : int, month : int, day : int)
 *  + getYear() : int
 *  + getMonth() : int
 *  + getDay() : int
 *  + setDate(elapsedTime : long)
 
 */


import java.util.GregorianCalendar;

 public class MyDate{
     private int year;
     private int month;
     private int day;
     GregorianCalendar myCal = new GregorianCalendar();

     public MyDate(){
        year = myCal.get(GregorianCalendar.YEAR);
        month = myCal.get(GregorianCalendar.MONTH);
        day = myCal.get(GregorianCalendar.DAY_OF_MONTH);
     }
     public MyDate(long elapsedTime){
        myCal.setTimeInMillis(elapsedTime);

        year = myCal.get(GregorianCalendar.YEAR);
        month = myCal.get(GregorianCalendar.MONTH);
        day = myCal.get(GregorianCalendar.DAY_OF_MONTH);
     }
     public MyDate(int year, int month, int date){
        GregorianCalendar myCal2 = new GregorianCalendar(year, month, day);
        this.year = myCal2.get(GregorianCalendar.YEAR);
        this.month = myCal2.get(GregorianCalendar.MONTH);
        this.day = myCal2.get(GregorianCalendar.DAY_OF_MONTH);
     }
     public int getYear(){
         return year;
     }
     public int getMonth(){
         return month;
     }
     public int getDay(){
         return day;
     }
     public void setDate(long elapsedTime){
        myCal.setTimeInMillis(elapsedTime);

        year = myCal.get(GregorianCalendar.YEAR);
        month = myCal.get(GregorianCalendar.MONTH);
        day = myCal.get(GregorianCalendar.DAY_OF_MONTH);

     }
   
 }