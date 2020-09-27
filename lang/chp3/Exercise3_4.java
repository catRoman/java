public class Exercise3_4{

    public static void main(String[] args){
        for(int i=0; i<12; i++){

            int randomNumber = (int)(Math.random() * 12);
      String month = "Septemburary";
        switch(randomNumber) {
            case 0: month = "January";
                break;
            case 1: month = "Feburary";
                break;
            case 2: month = "March";
                break;
            case 3: month = "April";
                break;
            case 4: month = "May";
                break;
            case 5: month = "June";
                break;
            case 6: month = "July";
                break;
            case 7: month = "August";
                break;
            case 8: month = "September";
                break;
            case 9: month = "October";
                break;
            case 10: month = "November";
                break;
            case 11: month = "December";
                break;
            default : System.out.println("Error: invalid status");
        }
        System.out.println("The random number is " + randomNumber + " and the month is " + month);
    }
}
}