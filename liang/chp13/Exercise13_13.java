/** Exercise 13 Chapter 13 Intro to java by Liang
 * 
 * <ol>
 *      <li>Exercise13_13- Enable the Course class cloneable
 * </ol>
 * @author Cat Roman 2022-01-22
 * @see Course
 * @see java.lang.Cloneable
 */
public class Exercise13_13{
    /**Test Driver */
    public static void main(String[] args){
        Course course1 = new Course("Bio");
        course1.addStudent("Lisa");

        System.out.println("Course one # students: " + course1.getNumberOfStudents());
        
        Course course2 = (Course)course1.clone();
        course1.addStudent("Maya");
        System.out.println("\nCloned course1\nadd one student to original course 1\n");
        System.out.println("CLone -> # of students: " + course2.getNumberOfStudents());
        System.out.println("Original -> # of students: " + course1.getNumberOfStudents());
    }
}