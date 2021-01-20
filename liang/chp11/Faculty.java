/** ====================
 *          Faculty
 *  ====================
 * -officeHours : String
 * -rank :  String
 * -title : String
 * +Faculty()
 * +Faculty(officeHours : String, rank : String)
 * +Faculty(officeHours : String, rank : String, 
 *          name : String, address : String,
 *          email : String, phoneNumber : String)
 * +getOfficeHours() : String
 * +getRank() : Sting 
 * +setOfficeHours(String officeHours) : void
 * +setRank(String rank) : void
 * +toString() : String
 */
public class Faculty extends Person{
    private String officeHours;
    private String rank;
    

    public Faculty(){
    }
    public Faculty(String officeHours, String rank){
        this.officeHours = officeHours;
        this.rank = rank;
       
    }
    public Faculty(String officeHours, String rank, 
                    String name, String address,
                    String email, String phoneNumber){
        super(name, address, email, phoneNumber);
        this.officeHours = officeHours;
        this.rank = rank;
        
    }
    public String getOfficeHours(){
        return officeHours;
    }
    public String getRank(){
        return rank;
    }
   
    public void setOfficeHours(String officeHours){
        this.officeHours = officeHours;
    }
    public void setRank(String rank){
        this.rank = rank;
    }
   
    @Override
    public String toString(){
        return "Faculty Memeber: " + super.toString();
    }
    
}