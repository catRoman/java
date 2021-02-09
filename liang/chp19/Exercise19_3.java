public class Exercise19_3{
    public static void main(String[] args){
        Integer newInt = 5;
        Integer newIntTwo = 8;
        

        Pair<Integer> pairOne = new Pair<>(newInt, newIntTwo);
        System.out.println("Pair one test:");
        System.out.println("one: " + pairOne.getOne().toString());
        System.out.println("two: " + pairOne.getTwo().toString());
        System.out.println("toString: " + pairOne.toString());

       
    }
}