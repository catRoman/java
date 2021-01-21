/**====================
 *      UML Diagram
 * ====================
 *      Person
 * --------------------
 * -name :  String
 * -address: String
 * -phoneNum: String
 * -email: String
 * +Person()
 * +Person(name: String, address: String, email: String)
 * +getName(): String
 * +getAddress(): String
 * +getPhoneNum(): String
 * +getEmail(): String
 * +setName(email: String): void
 * +setAddress(address: String): void
 * +setPhoneNum(phoneNum: String): void
 * +setEmail(email: String): void
 * +toString(): String
 */
public class Person{
    private String name = "not given";
    private String address= "not given";
    private String email = "not given";
    private String phoneNum = "not given";

    public Person(){
    }
    public Person(String name, String address, String email, String phoneNum){
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNum = phoneNum;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
    @Override
    public String toString(){
        return name;
    }
}