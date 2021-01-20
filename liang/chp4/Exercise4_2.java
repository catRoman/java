import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Exercise4_2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        String pointOne = input.nextLine(); 
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        String pointTwo = input.nextLine();

        String x1 = "",
                x2 = "",
                y1 = "",
                y2 = "";
       
                
                
    if((pointOne.contains(" ") || pointOne.contains(","))
        && (pointTwo.contains(" ") || pointTwo.contains(","))){
            
            

        if(((int)(pointOne.charAt(pointOne.indexOf(delineatorFunction(pointOne)) + 1)) > -1)
            && (int)(pointTwo.charAt(pointTwo.indexOf(delineatorFunction(pointTwo)) + 1)) > -1){
         x1 = pointOne.substring(0, pointOne.indexOf(delineatorFunction(pointOne)));
         y1 = pointOne.substring(pointOne.indexOf(delineatorFunction(pointOne)) + 1);

         x2 = pointTwo.substring(0, pointTwo.indexOf(delineatorFunction(pointTwo)));
         y2 = pointTwo.substring(pointTwo.indexOf(delineatorFunction(pointTwo)) +1);
        }
    }else {
            System.out.println("Enter both the lattitude and longitude on the same for each point.");
            System.exit(1);
        }
   
        // check for comma and spaces and delete and convert to double

   
        double dx1 = formatConvertFunction(x1);
        double dx2 = formatConvertFunction(x2);
        double dy1 = formatConvertFunction(y1);
        double dy2 = formatConvertFunction(y2);


        //math 

        double radius = 6371.01;
        double distance = radius * Math.acos(((Math.sin(dx1)) * Math.sin(dx2))
                        + (Math.cos(dx1) * Math.cos(dx2) * Math.cos(dy1-dy2)));
        
        System.out.printf("%s %5.11f km\n", "The distance between the two points is", distance);

    } // end of main
    
    public static char delineatorFunction(String a){
        char d = ',';
        
        if (a.contains(",") && !(a.contains(" ")))
        d = ',';
        else 
       d = ' ';
        
        return d;
    }
    public static double formatConvertFunction(String a){ 
        a = a.trim();
        if (a.endsWith(",")){
            a = a.substring(0, a.length() - 1);
        }
        if (a.startsWith(",")){
            a = a.substring(1, a.length());
        }
        double b = Double.parseDouble(a);
        b = Math.toRadians(b);
        
    return b;
    }

}