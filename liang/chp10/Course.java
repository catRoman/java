public class Course{
    public static final int DEFAULT_CAPACITY = 100;
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
        this.students = new String[DEFAULT_CAPACITY];
    }
    public void addStudent(String student){
        if(numberOfStudents >= students.length){
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    
    }
    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String student){
        int index = -1;
        for(int j = 0; j < students.length; j++){
            if(student.equalsIgnoreCase(students[j])){
                index = j;
            }
        }

        if(index == -1){
            System.out.println("Student is not in the class.");
            return;
        }

        
        
        for(int i = index; i < students.length-1; i++){   
           students[i] = students[i+1];
        }
  
        numberOfStudents--;
    }
    public void clear(){
        String[] clear = new String[DEFAULT_CAPACITY];
        students = clear;
        numberOfStudents = 0;
    }
    
}