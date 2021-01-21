/** =======================
 *         UML Diagram
 *  =======================
 *          Location
 *  -----------------------
 *  + row : int
 *  + column : int
 *  + maxValue : double
 *  -----------------------
 *  + Location()
 *  + locateLargest(double[][]) : Location
 */

 public class Location{
     int row;
     int column;
     double maxValue;
     
     public Location(int row, int column, double maxValue){
        this.row = row;
        this.column = column;
        this.maxValue =maxValue;    
     }
     public static Location locateLargest(double[][] list){
        int column = 0;
        int row = 0; 
        double maxValue = list[0][0];

        for(int i = 0; i < list.length; i++){
             for(int j = 0; j < list[j].length; j++){
                if(list[i][j] > maxValue)
                    maxValue = list[i][j];
                    row = i;
                    column = j;
             }
         }

         return Location(row, column, maxValue);
     }
 }