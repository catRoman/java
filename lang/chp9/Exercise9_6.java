public class Exercise9_6{
    public static void main(String[] args){
        StopWatch myWatch = new StopWatch();

        int[] list = new int[100_000];
        randomizeList(list);

       

        myWatch.start();
        selectionSort(list);
        myWatch.stop();

        System.out.println("The elapsed Time is " + myWatch.getElapsedTime() + " milliseconds");

    }
    public static void randomizeList(int[] list){
        for(int i = 0; i < list.length; i++){
            list[i] = (int)(Math.random() * list.length);
        }

    }
    
    public static void selectionSort(int[] list){

        for(int i =0; i < list.length-1; i++){
            int currentMin = list[i];
            int currentMinIndex = i;

            for(int j = i +1; j < list.length; j++){
                if(currentMin < list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}