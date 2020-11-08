import javax.lang.model.util.ElementScanner6;

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
// first glimpse of backtracking and recursion, not used effiecently but its a start, once 
// a solution was not possible the system restarts from the the beginning untill a solution is 
// aquired rather than reversing one iteration at a time to check for solutions....
// ill probly be back here to change it later down the roadS
public class Exercise7_22{
    public static void main(String[] args){

        // declare boolean 2 x 2 matrix and fill with true
        // the represent space available
        boolean[][] available = new boolean[8][8];
        int queensPlaced = 0; //for backtracking
        int[] queensPosition = new int[8];
        
        //master backtrack loop
        do{
        
        for(int i =0; i < available.length; i++)
            java.util.Arrays.fill(available[i], true);
        queensPlaced = 0;
        

        // main game iterations    
        for(int i = 0; i < 8; i++){
           // while(availableSpace(available[i])){

                // place a queen randomly in an available space
                int position = availableRandomSpace(available, i);
                
                //if you can no longer place a queen, restart
                if(position < 0){
                    break;
                }else
                    queensPlaced++;
                    queensPosition[i] = position; // used for displaying Queens
               

                for(int j = 0; j < 8; j++){
                    // update non availibly spaces throughout
                    // rest of board after position is selected
                    available[j][position]= false; // columns
                    diagonal(available,position, i, j); //diagonals
                }
                //display chess board row
               // displayChessBoardRow(i,position, available);
        
          
                //System.out.println();
            }    
    }while(queensPlaced < 8);
    displayChessBoard(available, queensPosition);
}
//first attempt at backtrack loop
    public static boolean availableSpace(boolean[] availableSpace){
        boolean key = true;
        for(int i =0; i < availableSpace.length; i++){
            if(key == availableSpace[i])
                return true;
        }
        return false;
    } 

    // diagonals left and right down from current row
    public static void diagonal(boolean[][] available, int position, int startingRow, int currentRow){
    int rowChange = currentRow - startingRow;

    if(rowChange > 0){
        if((position + rowChange) < available[currentRow].length)
        available[currentRow][position+rowChange]=false;
        
        if((position - rowChange) >= 0)
        available[currentRow][position-rowChange]=false;
    }
    
}
//creates a random index number until the number lies on any assioceated
// available space
    public static int availableRandomSpace(boolean[][] available, int row){
       int number = -1;
      if(availableSpace(available[row])){
    do{
       number = (int)(Math.random() * 8);    
    }while(available[row][number] == false);
        return number;
    }else 
        return -1;
    }

    /** takes in a boolean  value if a particular space in a row is 
     * occupied and either displays a queen of a space, drawing
     * a 1 x 8 line, in ascoitiation with a noter loop, a full
     * 8 x 8 chess board is produced
     * 
    */
    public static void displayChessBoard(boolean[][] board, int[] queensPosition){
        
       

        for(int i = 0; i < 8; i++){
            System.out.print("|");
                for(int j = 0; j < 8; j++){
                if(j == queensPosition[i])
                    System.out.print("Q");
                
                else
                    System.out.print(" ");
                    System.out.print("|");
                }
                System.out.println();
        }


       

        
    
    }
}