/**===============================
 *          Course
 * ===============================
 * -String courseName
 * -ArrayList<String> studentList
 * 
 * +Course(coursEName : String)
 * +addStudent(student : String) : void
 * +getStudent() : String
 * +getStudentList() : ArrayList<String>
 * +getNumberOfStudents() : int
 * +getCourseNmae() : String
 * +dropStudent(student : String) : void
 */

import java.util.ArrayList;

public class Course{
    private String courseName;
    private ArrayList<String> studentList = new ArrayList<>();
  

    public Course(String courseName){
        this.courseName = courseName;
    }
    public void addStudent(String student){
        studentList.add(student);
      
    }
    public String getStudents(){
        return studentList.toString();
    }
    public ArrayList<String> getStudentList(){
        return studentList;
    }
    public int getNumberOfStudents(){
        return studentList.size();
    }
    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String student){
        if(studentList.contains(student)){
        int studentNum = studentList.indexOf(student);
        studentList.remove(studentNum);
        } else
            System.out.println("Student not Regestered");
    }
}