/**===================
 *      Employee
 * -------------------
 * -office : boolean
 * -salary: double
 * -dateHired : MyDate
 * +Employee()
 * +Employee(office : boolean, salary : double, dateHired : MyDate)
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
         MyDate temp = dateHired;
         this.dateHired = temp;
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
         MyDate copy = dateHired;
         this.dateHired = copy;
     }
     @Override
     public String toString(){
         return "Employee: " + super.toString();
     }

 }