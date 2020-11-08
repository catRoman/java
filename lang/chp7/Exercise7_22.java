

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
        
        

        for(int i = 0; i < 8; i++){
           // while(availableSpace(available[i])){
                int position = availableRandomNumber(available, i);
                System.out.print(position);

                for(int j = 0; j < 8; j++){
                   available[j][position]= false; // columns
                    diagonal(available,position, i, j);
                }
                chessBoardRow(i,position, available);
        
          
                //System.out.println();
            
    }
}
    public static boolean availableSpace(boolean[] availableSpace){
        boolean key = true;
        for(int i =0; i < availableSpace.length; i++){
            if(key == availableSpace[i])
                return true;
        }
        return false;
    } 

    public static void diagonal(boolean[][] available, int position, int startingRow, int currentRow){
    int rowChange = currentRow - startingRow;

    if(rowChange > 0){
        if((position + rowChange) < available[currentRow].length)
        available[currentRow][position+rowChange]=false;
        
        if((position - rowChange) >= 0)
        available[currentRow][position-rowChange]=false;
    }
    
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