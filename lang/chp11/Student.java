/**==================
 *      Student
 * ==================
 * -classStatus: int
 * +Student()
 * +Student(classStatus: int)
 * +getClassStatus(): String
 * +setClassStatus(classStatus: int): void
 * +toString():  
 */
public class Student extends Person{
    private int classStatus;
    public Student(){
    }
    public Student(int classStatus){
        this.classStatus = classStatus;
    }
    public String getClassStatus(){
        switch(classStatus){
            case 1: return "freshman";
            case 2: return "sophmore";
            case 3: return "junior";
            case 4: return "senior";
            default: return "unknown";
        }
    }
    public void setClassStatus(int classStatus){
        this.classStatus = classStatus;
    }
    @Override
    public String toString(){
        return "Student: " + super.toString();
    }
}