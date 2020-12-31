/**==================
 *      Student
 * ==================
 * -classStatus: int
 * +Student()
 * +Student(classStatus: int)
 * +Student(classStatus: int, name : String, 
 *          address : String, email : String, 
 *          phoneNumber : String)
 * +getClassStatus(): String
 * +setClassStatus(classStatus: int): void
 * +toString():  
 */
public class Student extends Person{
    private int classStatus;
    final String freshman = "freshman";
    final String sophmore = "sophmore";
    final String junior = "junior";
    final String senior = "senior";

    public Student(){
    }
    public Student(int classStatus){
        this.classStatus = classStatus;
    }
    public Student(int classStatus,String name, 
                    String address, String email, 
                    String phoneNumber){
        super(name, address, email, phoneNumber);
        this.classStatus = classStatus;
    }
    public String getClassStatus(){
        switch(classStatus){
            case 1: return freshman;
            case 2: return sophmore;
            case 3: return junior;
            case 4: return senior;
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