public class Exercise7_1{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        System.out.print("Enter " + numberOfStudents + " scores: ");
        int[] scores = new int[numberOfStudents];
        for(int i = 0;i < scores.length; i++){
            scores[i] = input.nextInt();
        }
        for(int i = 0; i < scores.length; i++){
            System.out.println("Student " + i + " is " + scores[i] + " and grade is " + gradeFunction(scores[i], scores));
        }
    }
    public static String gradeFunction(int score, int[] grades){
       int best = grades[0];
        for(int i = 1; i < grades.length; i++){
            if(grades[i] > best)
                best = grades[i];
        }
        String grade = "";
        if(score >= (best - 10)){
            grade = "A";
        }else if (score >= (best - 20)){
            grade = "B";
        }else if(score >= (best - 30)){
            grade = "C";
        }else if(score >= (best - 40)){
            grade = "D";
        }else{
            grade = "F";
        }

        return grade;
    }
}