public class Exercise10_2{
    public static void main(String[] args){
        BMI bmi1 = new BMI("Kin Yang", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is " +
        bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Jogn Yang", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is " +
                bmi2.getBMI() + " " + bmi2.getStatus());

        BMI bmi3 = new BMI("Skritches Yang", 18, 160, 5, 8);
        System.out.println("The BMI for " + bmi3.getName() + " is " +
                    bmi3.getBMI() + " " + bmi3.getStatus());
                
    }
}