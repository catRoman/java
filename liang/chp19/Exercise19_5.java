public class Exercise19_5{
    public static void main(String[] args){
        Triplet<Integer> tripOne = new Triplet<>(1, 5, 8);
        Triplet<Double> tripTwo = new Triplet<>(2.3, 5.6, 8.9);

        System.out.println("Triplet one test:");
        System.out.println("one: " + tripOne.getOne().toString());
        System.out.println("two: " + tripOne.getTwo().toString());
        System.out.println("two: " + tripOne.getThree().toString());
        System.out.println("toString: " + tripOne.toString());
        System.out.println();
        System.out.println("Triplet two test:");
        System.out.println("one: " + tripTwo.getOne().toString());
        System.out.println("two: " + tripTwo.getTwo().toString());
        System.out.println("two: " + tripTwo.getThree().toString());
        System.out.println("toString: " + tripTwo.toString());

    }
}