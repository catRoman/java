/**========================
 *          Staff
 * ========================
 * -title
 * +Staff()
 * +Staff(title : String)
 * +Staff(title: String, name : String, address : String
 *         email : String, phoneNumber : String)
 * +setTitle(String title) : void
 * +getTitle() : String
 * +toString()
 */

public class Staff extends Person{
    private String title;

    public Staff(){
    }
    public Staff(String title){
        this.title = title;
    }
    public Staff(String title, String name, String address,
                String email, String phoneNumber){
                    super(name, address, email, phoneNumber);
                    this.title = title;

                }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    @Override
    public String toString(){
        return "Staff Memeber: " + super.toString();
    }
}
