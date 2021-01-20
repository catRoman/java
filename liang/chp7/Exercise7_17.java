public class Exercise7_17{

    public static void main(String[] args){

        java.util.Scanner input= new java.util.Scanner(System.in);

        System.out.println("Enter how many students are in the class: ");
        
        int numStudents = input.nextInt();

        String[] names = new String[numStudents];
        int[] grades = new int[numStudents];

        System.out.println("What are the students names and their grade: ");

        for(int i =0; i < numStudents; i ++){
            System.out.print("Name: ");
            names[i] = input.next();
            input.nextLine();
            System.out.println("Grade: ");
            grades[i] = input.nextInt();
        }

        
        for(int i = 0; i< grades.length-1; i++){
            int currentMin = grades[i];
            int currentMinIndex = i;
            String temp = "";

            for(int j = i + 1; j < grades.length; j++){
                if(currentMin < grades[j]){
                    currentMin = grades[j];
                    currentMinIndex = j;
                   // names[i] = names[j];
                }
            }

            if(currentMinIndex != i){
                grades[currentMinIndex] = grades[i];
                temp = names[currentMinIndex];
                names[currentMinIndex] = names[i];
                names[i] = temp;
                grades[i] = currentMin;
            }
        }
        System.out.println();
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i] + " " + grades[i]);
        }
    }
}