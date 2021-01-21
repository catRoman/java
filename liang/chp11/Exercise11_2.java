public class Exercise11_2{
    public static void main(String[] args){
        Person catlin = new Person("catlin", 
                                    "1234 laneway rd",
                                    "dummy@email.ca",
                                    "555-555-5555");
        Student lisa = new Student(2, "lisa",
                                    "1234 laneway rd",
                                    "dummy@email.ca",
                                    "555-555-5551");
        Employee skritches = new Employee(true, 100.12,
                                        new MyDate(),
                                        "Skritches",
                                        "1234 laneway rd",
                                        "dummy@email.ca",
                                        "555-555-5552");
        Faculty maya = new Faculty("mon - fri, 9-5",
                                    "Doctor", "Maya",
                                    "1234 laneway rd",
                                    "dummy@email.ca",
                                    "555-555-5553");
        Staff blinky = new Staff("Chief", "Blinky",
                                "The fishbowl", 
                                "fish1@guppies.ca",
                                "555-555-5554");
        
    
        System.out.println(catlin.toString());  
        System.out.println(lisa.toString()); 
        System.out.println(skritches.toString()); 
        System.out.println(maya.toString()); 
        System.out.println(blinky.toString());  
        
        System.out.println();
        System.out.println(skritches.getDateHired());
    }
}