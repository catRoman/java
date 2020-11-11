public class weightedClass{
    public static void main(String[] args){

        java.util.Scanner input =new java.util.Scanner(System.in);

       
        System.out.print("Enter the number of sections: ");
        int sections = input.nextInt();

        double[][] grade = new double[sections][];
        double[] weight = new double[sections];

        for(int i =0; i < grade.length; i++){
            System.out.print("Enter the percentage weight of section " + (i + 1) + ": ");
            weight[i] = input.nextDouble();
            System.out.print("Enter the number of grades for section " + (i+ 1) + ": ");
            grade[i] = new double[input.nextInt()]; 
        }

        for(int i = 0; i < grade.length; i++){
            System.out.print("Enter the grades for section (-1 if not completed) " + (i + 1) + ": ");
            for(int j = 0; j < grade[i].length; j++){
            
                grade[i][j] = input.nextDouble();
            }
        }
        
        System.out.print("Enter the grade you wish to get: ");
        double gradeSought = input.nextDouble();
    
        double[] weightedAverage = new double[grade.length];
        for(int i =0; i < grade.length; i++){
           int total = 0;
            for(int j = 0; i < grade[i].length; j++){
                total += grade[i][j];
            }
            weightedAverage[i] = total * weight[i];
        }

        int finalGrade = 0;

        for(int i = 0; i < weightedAverage.length; i++){
            finalGrade += weightedAverage[i];
        }

        System.out.println("Your average is " + finalGrade);
    }
}