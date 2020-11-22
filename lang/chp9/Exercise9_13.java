public class Exercise9_13{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        
        
        System.out.print("Enter the number of rows and columns: ");
        int row =input.nextInt();
        int column = input.nextInt();

        System.out.println("Enter the Array: ");

        double[][] list = new double[row][column];

        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list[i].length; j++){
                list[i][j] = input.nextDouble();
            }
        }
        

        System.out.print("The location of the largest element is " + Location.locateLargest(list).maxValue 
                    + " at (" + Location.locateLargest(list).row + "," + Location.locateLargest(list).column + ")");
    }
}