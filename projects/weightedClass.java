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
            System.out.println();
        }
        
        System.out.print("Enter the grade you wish to get: ");
        double gradeSought = input.nextDouble();
    
        double[] weightedAverage = new double[grade.length];
        
        boolean[][] unknown = new boolean[grade.length][];



        for(int i =0; i < grade.length; i++){
           int total = 0;
           unknown[i] = new boolean[grade[i].length];
            for(int j = 0; j < grade[i].length; j++){
                if(grade[i][j] == -1){
                    unknown[i][j] = true;
                }
                    
                total += grade[i][j];
            }

            

            weightedAverage[i] = (total / (double)grade[i].length) * weight[i];
        }

        double reqTotalGradeAverage = 0;
        double[] gradeReq = new double[grade.length];
System.out.println();


        for(int i =0; i < unknown.length; i++){
                if(containsUnknown(unknown[i])){
                    double weightedAverageTotal = 0;
                    for(int j = 0; j < weightedAverage.length; j++){
                        if(j != i)
                            weightedAverageTotal += weightedAverage[j];
                            
                    }
              

                    reqTotalGradeAverage = (gradeSought- (weightedAverageTotal)) / weight[i];
                  
                    weightedAverage[i] = reqTotalGradeAverage * weight[i];
                
                    double knownGradeAverage = 0;
                    for(int k = 0; k < grade[i].length; k++){
                    if(grade[i][k] > -1){
                        knownGradeAverage += grade[i][k];
                     
                    }
                        gradeReq[i] = (reqTotalGradeAverage * grade[i].length) - knownGradeAverage; // / weight[i];
                        gradeReq[i] = gradeReq[i] / unknownAmount(unknown[i]);


                }

            }
        
        }

        


        double finalGrade = 0;

        for(int i = 0; i < weightedAverage.length; i++){
            finalGrade += weightedAverage[i];
        }

        finalGrade = (int)(Math.round(finalGrade * 100)) / 100.0;
        
        for(double e: gradeReq){
        e = (int)(Math.round(e * 100)) / 100.0;
        }

        if (containsUnknown(unknown) == false){
            System.out.println("Your average is " + finalGrade);
        }

        for(int i =0; i < gradeReq.length; i++){
            if(containsUnknown(unknown[i])){

                System.out.println("Your in order to acheive a final grade of " + finalGrade 
                                + "% you need an average grade of " + gradeReq[i]
                                + "% for the remaining assignments"
                                + " in section " + (i +1));  
            }
        }

    } 
    
    
    public static boolean containsUnknown(boolean[] list){
        for(boolean e : list){
            if (e)
            return true;
        }
        return false;
    }
    public static boolean containsUnknown(boolean[][] list){
        for(int i =0; i < list.length; i++){
            for(int j =0; j < list[i].length; j++){
                if (list[i][j])
                    return true;
            }
        }
        return false;
    }
    public static int unknownAmount(boolean [] list){
        int count = 0;
        for(boolean e : list){
            if(e)
                count++;
        }
        return count;
    }
}