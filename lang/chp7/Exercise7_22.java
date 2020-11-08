/**(Game: Eight Queens) The classic Eight Queens puzzle is to place eight queens
on a chessboard such that no two queens can attack each other (i.e., no two queens
are on the same row, same column, or same diagonal). There are many possible
solutions. Write a program that displays one such solution. A sample output is
shown below: 

|Q| | | | | | | |
| | | | |Q| | | |
| | | | | | | |Q|
| | | | | |Q| | |
| | |Q| | | | | |
| | | | | | |Q| |
| |Q| | | | | | |
| | | |Q| | | | |

*/

public class Exercise7_22{
    public static void main(String[] args){

        int[] usedColumns = new int[8];
        java.util.Arrays.fill(usedColumns, -1);

        boolean[][] available = new boolean[8][8];
        for(int i =0; i < available.length; i++)
        java.util.Arrays.fill(available[i], true);
        
      

        
        int[] row = new int[8];
        int[] column = new int[8];

        for(int i = 0; i < 8; i++){
            int position = availableRandomNumber(available, i);
            row[i] = position;
            System.out.print(position);
            for(int j = 0; j < 8; j++){
                
                available[j][position]= false; // columns
                 int t = position;
                 int q = position;

                for(int k = j; k < 8; k++){
                    
                if(q < available[k].length){
                    available[j][q] = false;
                    q++;
                }
                if(t > 0 ){
                    
                    available[j][t] = false;
                    t--;
                }  
            }
                
                   
                }
                
           
            
           // if(column[position]){
             //   available[position] = false;
            //}

           // chessBoardRow(i,row[i], available);
           System.out.println();
           System.out.println(java.util.Arrays.deepToString(available).replace("], ", "]\n"));
           }
            //column[position]=false;
           
           }
        

    public static int availableRandomNumber(boolean[][] available, int row){
       int number = -1;
      
    do{
       number = (int)(Math.random() * 8);    
    }while(available[row][number] == false);
        return number;
    }

    /** takes in a boolean  value if a particular space in a row is 
     * occupied and either displays a queen of a space, drawing
     * a 8 x 8 board
     * 
    */
    public static void chessBoardRow(int row,int position, boolean[][] available){
        System.out.print("|");
       
        for(int i = 0; i < 8; i++){
                
                if(i == position)
                    System.out.print("Q");
                else if(available[row][i] == false)
                    System.out.print("*");
                else
                    System.out.print(" ");

                System.out.print("|"); 
               

        }


        System.out.println();

        
    
    }
}