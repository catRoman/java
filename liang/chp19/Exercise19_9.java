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
        sort(list);
        System.out.println("Sorted List:\n" + list.toString());
    }

    //insertion sort
    public static <E extends Comparable<E>> void sort(ArrayList<E> list){
        E temp;
        for(int i = 1; i < list.size(); i++){
            for(int j = i; j > 0 && list.get(j-1).compareTo(list.get(j)) > 0; j--){
                temp = list.get(j);
                list.set(j, list.get(j -1));
                list.set(j -1, temp);
            }
        }
    }
}