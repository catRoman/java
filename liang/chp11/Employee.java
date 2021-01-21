/**===================
 *      Employee
 * -------------------
 * -office : boolean
 * -salary: double
 * -dateHired : MyDate
 * +Employee()
 * +Employee(office : boolean, salary : double, 
 *          dateHired : MyDate)
 * +Employee(office : boolean, salary : double,
 *           dateHired : MyDate, name : String,
 *           address : String, email : String, 
 *           phoneNumber : String)
 * +getOffice(): boolean
 * +getSalary(): double
 * +getDateHired(): MyDate
 * +setOffice(office : boolean): void
 * +setSalary(salary: double): void
 * +setDateHired(dateHired : MyDate): void
 * +toString() : String
 */

 public class Employee extends Person{
     private boolean office;
     private double salary;
     private MyDate dateHired;
     
     public Employee(){
         
     }
     public Employee(boolean office, double salary, MyDate dateHired){
         this.office = office;
         this.salary = salary;
         this.dateHired = dateHired;
     }
     public Employee(boolean office, double salary, 
                     MyDate dateHired,
                    String name, 
                    String address, String email, 
                    String phoneNumber){ 
        super(name, address, email, phoneNumber);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;

    }
     public boolean getOffice(){
         return office;
     }
     public double getSalary(){
         return salary;
     }
     public MyDate getDateHired(){
         MyDate copy = dateHired;
         return copy;
     }
     public void setOffice(boolean office){
         this.office = office;
     }
     public void setSalary(double salary){
         this.salary = salary;
     }
     public void setDateHire(MyDate dateHired){
         this.dateHired = dateHired;
     }
     @Override
     public String toString(){
         return "Employee: " + super.toString();
     }

 }