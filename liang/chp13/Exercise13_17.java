public class Exercise13_17{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the first complex Number: ");
        Complex numOne = new Complex(
            Double.parseDouble(input.next()),
            Double.parseDouble(input.next()));
        
        System.out.print("Enter the first complex Number: ");
        Complex numTwo = new Complex(
            Double.parseDouble(input.next()), 
            Double.parseDouble(input.next()));
        
        //add
        System.out.print("(" + numOne.toString() + ") + (" + numTwo.toString() + ") = ");
        System.out.println(numOne.add(numTwo).toString());

        //subtract
        System.out.print("(" + numOne.toString() + ") - (" + numTwo.toString() + ") = ");
        System.out.println(numOne.subtract(numTwo).toString());

        //multiple
        System.out.print("(" + numOne.toString() + ") * (" + numTwo.toString() + ") = ");
        System.out.println(numOne.multiply(numTwo).toString());

        //divide
        System.out.print("(" + numOne.toString() + ") / (" + numTwo.toString() + ") = ");
        System.out.println(numOne.divide(numTwo).toString());

        //abs
        System.out.print("|" + numOne.toString() + "| = ");
        System.out.println(numOne.abs().toString());
    }
}