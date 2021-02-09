import java.util.ArrayList;

public class Exercise19_8{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i =1; i < 11; i++){
            list.add(i);
        }
        System.out.println("Original list:");
        System.out.println(list.toString());
        System.out.println();
        System.out.println("Shuffled List:");
        shuffle(list);
        System.out.println(list.toString());
    }
    public static <E> void shuffle(ArrayList<E> list){
       ArrayList<E> temp = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            int random = (int)(Math.random() * list.size());
            if(random != i){
                temp.add(list.get(i));
                list.set(i, list.get(random));
                list.set(random, temp.get(i));
            }
       }
    }

}