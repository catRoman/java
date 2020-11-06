public class Calc{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);


        System.out.println("Enter the number of sections: ");
        int sections = input.nextInt();

        double[] sectWeight = new double[sections];

        System.out.println("Enter the percentage weight for each section: ");
        for(int i = 0; i < sectWeight.length; i++){
            sectWeight[i] = input.nextDouble();
        }

        int[] numGrades = new int[sections];
        for(int i =0; i < sections; i++){
        System.out.println("How many grades in each section: ");
        numGrades[i] = input.nextInt();
        }

        int max = numGrades[0];

        for(int i =0; i < numGrades.length; i++){
            if(max < numGrades[i]){
                max = numGrades[i];
            }
        }

        double[][] grades = new double[sections][max];

        for(int i = 0; i <= sections; i++){
            for(int j=0; j < max; j++){
                System.out.print("What are the grades for section (type -1 if not known) " + (i+1) + ": ");
                grades[i][j] = input.nextDouble();
            } 
        }
        
        System.out.println("What grade are you trying to achieve: ");
        int soughtGrade = input.nextInt();
        int count = 0;

        int[] negCount = new int[sections];
        
        double[] weightedMark = new double[sections];
        for(int i =0; i < grades.length; i++){
            for(int j = 0; j < grades[i].length; j++ ){
               
                    if(grades[i][j] == -1){
                        count++;
                    }
            }
            negCount[i] = count;
            count = 0;
        }


        
    
    }
}