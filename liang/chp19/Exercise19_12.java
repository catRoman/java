public class Exercise19_12{
    public static void main(String[] args){
        Complex[] list = new Complex[]{
            new Complex(1.2 -3.5),
            new Complex(3.5,7.6),
            new Complex(5.3,-5.5),
            new Complex(2.7,4.2),
            new Complex(-6.0,1.4),
            new Complex(2.5, 7.6),
            new Complex(3.0,8.5),
            new Complex(3.6,8.4),
            new Complex(5.6,5.6)
        };

        System.out.println("Original List:");
        printArray(list);
        System.out.println();
        GenericBubbleSort.bubbleSort(list);
        System.out.println("After bubble sort:");
        printArray(list);
    }
    private static void printArray(Complex[] o){
        System.out.print("[");
        for(int i = 0; i < o.length; i++){
            if(i == (o.length -1)){
                System.out.print(o[i].toString() + "]\n" );
                return;
            }
            System.out.print(o[i].toString() + " , ");
        }
    }
}