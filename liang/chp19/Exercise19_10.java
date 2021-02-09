import java.util.ArrayList;

public class Exercise19_9{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i =1; i < 11; i++){
            int random = (int)(1 + Math.random() * 100);
            list.add(random);
        }
        System.out.println("Original list:");
        System.out.println(list.toString());
        System.out.println();
        System.out.println("min : " + min(list));
       
    }
    public static <E extends Comparable<E>> E min(ArrayList<E> list){
        E min = list.get(0);

        for(int i =1; i < list.size(); i++){
            if(min.compareTo(list.get(i)) >= 0){
                min = list.get(i);
            }
        }
        return min;
    }
}