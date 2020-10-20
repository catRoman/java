public class Exercise7_4{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter your scores ending with -1: ");

        int[] scores = new int[100];
        int sum = 0;
        int count = 0;

        for(int i= 0; i < scores.length; i++){
            scores[i] = input.nextInt();
            
            if( scores[i] > 0){
            sum += scores[i];
            count++;
            }else if (scores[i] < 0)
            break;
        }

        double average = (double)sum/count;
        int underCount = 0;
        int overCount = 0;
        for(int i = 0; i< scores.length; i++){
            if(scores[i] > average)
            overCount++;
            else if(scores[i] < average && scores[i] > 0)
            underCount++;
        }

        System.out.println("The average is " + average + " with "
                + overCount + " scores over average and " + underCount
                + " under average");
        
    }
} 