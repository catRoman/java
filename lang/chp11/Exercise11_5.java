public class Exercise11_5{

    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.println("Enter the course name: ");
        Course math100 = new Course(input.nextLine());

        System.out.println("Enter the students names, quiting with a zero...");
        String studentName;
        do{
            studentName = input.nextLine();
            if(studentName.charAt(0) != '0'){
                math100.addStudent(studentName);
            }else
                break;

        }while(true);

        System.out.println(math100.getStudents());
        System.out.println();
        math100.dropStudent("Mufasssa");

    }
}