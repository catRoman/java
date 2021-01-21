public class Exercise7_7{
    public static void main(String[] args){
        int[] random = new int[100];

        for(int i = 0; i < random.length; i++){
            random[i] = (int)(Math.random() * 10);
        }
        int count[] = new int[10];

        for(int i = 0; i< count.length; i++){
            for(int j = 0; j < random.length; j++){
                if(random[j] == i)
                count[i]++;
            }
            System.out.println(i + " occurs " + count[i] + " times");
        }
        
    }
}