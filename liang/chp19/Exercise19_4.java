public class Exercise19_4{
    public static void main(String[] args){
       Pair<Integer> pairOne = new Pair<>(7, 14);
       Pair<Double> pairTwo = new Pair<>(2.5,5.3);

        System.out.print("Pair One:\n"
        + Exercise19_4.<Integer>getSmallest(pairOne)
        + "\nPairTwo:\n"
        + getSmallest(pairTwo) + "\n");
    }
    
    public static <E extends Comparable<E>> E getSmallest(Pair<E> o){
        if((o.getOne()).compareTo(o.getTwo()) < 0)
            return o.getOne();
        return o.getTwo();
    }
}