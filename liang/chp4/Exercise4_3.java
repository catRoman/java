import java.util.Scanner;

public class Exercise4_3 {

    public static final double RADIUS = 6371.01;
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the latitude and longitude of the first city (in degrees): ");
        String city1 = input.nextLine();
        System.out.print("Enter the latitude and longitude of the second city (in degrees): ");
        String city2 = input.nextLine();
        System.out.print("Enter the latitude and longitude of the third city (in degrees): ");
        String city3 = input.nextLine();
        System.out.print("Enter the latitude and longitude of the fourth city (in degrees): ");
        String city4 = input.nextLine();
        
String x1 = "", 
        y1 = "",
        x2 = "",
        y2 = "",
        x3 = "",
        y3 = "",
        x4 = "",
        y4 = "";

        if((city1.contains(" ") || city1.contains(","))
            && (city2.contains(" ") || city2.contains(","))
            && (city3.contains(" ") || city3.contains(","))
            && (city4.contains(" ") || city4.contains(","))){
                if(((int)(city1.charAt(city1.indexOf(delinatorFunction(city1)) + 1)) > -1)
                    && ((int)(city2.charAt(city2.indexOf(delinatorFunction(city2)) + 1))  > -1)
                    && ((int)(city3.charAt(city3.indexOf(delinatorFunction(city3)) + 1)) > -1)
                    && ((int)(city4.charAt(city4.indexOf(delinatorFunction(city4)) + 1)) > -1)){
                       
                        x1 = city1.substring(0, city1.indexOf(delinatorFunction(city1)));
                        y1 = city1.substring(city1.indexOf(delinatorFunction(city1)));
                       
                        x2 = city2.substring(0, city2.indexOf(delinatorFunction(city2)));
                        y2 = city2.substring(city2.indexOf(delinatorFunction(city2)));
                        
                        x3 = city3.substring(0, city3.indexOf(delinatorFunction(city3)));
                        y3 = city3.substring(city3.indexOf(delinatorFunction(city3)));
                        
                        x4 = city4.substring(0, city4.indexOf(delinatorFunction(city4)));
                        y4 = city4.substring(city4.indexOf(delinatorFunction(city4)));
                    }

            } else {
                System.out.println("You need to enter both longitude and latitude for each city");
                System.exit(1);
            }

            System.out.println(formatConvert(x1) + " " + formatConvert(y1));
            System.out.println(formatConvert(x2) + " " + formatConvert(y2));
            System.out.println(formatConvert(x3) + " " + formatConvert(y3));
            System.out.println(formatConvert(x4) + " " + formatConvert(y4));
    
            double l1 = greatCircleFunction(formatConvert(x1), formatConvert(y1), formatConvert(x2), formatConvert(y2));
            double l2 = greatCircleFunction(formatConvert(x2), formatConvert(y2), formatConvert(x3), formatConvert(y3));
            double l3 = greatCircleFunction(formatConvert(x3), formatConvert(y3), formatConvert(x4), formatConvert(y4));
            double l4 = greatCircleFunction(formatConvert(x4), formatConvert(y4), formatConvert(x1), formatConvert(y1));
            double l5 = greatCircleFunction(formatConvert(x1), formatConvert(y1), formatConvert(x3), formatConvert(y3));

            
            double estimatedArea = triangleArea(l1, l2, l5) + triangleArea(l3, l4, l5);

            System.out.printf("Triangle %s: %3.6f -- %3.6f -- %3.6f\t: area = %5.6f\n","1", l1, l2, l3, triangleArea(l1, l2, l5));
            System.out.printf("Triangle %s: %3.6f -- %3.6f -- %3.6f\t: area = %5.6f\n","2", l3, l4, l5, triangleArea(l3, l4, l5));
            System.out.printf("%s %5.2f km\n", "The estimated area between the 4 cities is", estimatedArea);
    
        }
    public static char delinatorFunction(String a){
        char b = ' ';
        if (a.contains(" "))
            b = ' ';
        if (a.contains(","))
            b = ',';
        return b;
    }

    public static double formatConvert(String a){
        a.trim();
        if (a.startsWith(","))
            a = a.substring(1);
        if (a.endsWith(","))
            a = a.substring(0, a.length() - 1);
        
            double b = Double.parseDouble(a);
            b = Math.toRadians(b);
            return b;
    }

    public static double greatCircleFunction(double x1, double y1, double x2, double y2){
        double distance = RADIUS * Math.acos((Math.sin(x1) * Math.sin(x2)) 
                + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
            
                return distance;
    }
    public static double triangleArea(double side1, double side2, double side3){
        double s = (side1 + side2 + side3)/2;
 
        double area = Math.sqrt((s*(s-side1)*(s-side2)*(s-side3)));
        area = (int)(area*10)/10.0;

        return area;
    }

    }
