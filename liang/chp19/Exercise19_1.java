public class Exercise19_1{
    public static void main(String[] args)
        throws Exception{
        ArrayStack<Integer> testOne = new ArrayStack<>();

        System.out.println("size: " + testOne.size());
        System.out.println("isEmpty: " + testOne.isEmpty());
        testOne.push(100);
        testOne.push(28367);
        testOne.push(84345);
        System.out.println("toString: " + testOne.toString());
        System.out.println("size: " + testOne.size());
        System.out.println("peek: " + testOne.peek());
        System.out.println("size: " + testOne.size());
        System.out.println("pop!");
        testOne.pop();
        System.out.println("peek: " + testOne.peek());
        System.out.println("size: " + testOne.size());
        System.out.println("pop!");
        testOne.pop();
        System.out.println("peek: " + testOne.peek());
        System.out.println("size: " + testOne.size());
        System.out.println("pop!");
        testOne.pop();
        System.out.println("isEmpty: " + testOne.isEmpty());
        System.out.println("size: " + testOne.size());
     //   System.out.println("Exception test 1");
     //   testOne.pop();
     //   System.out.println("Exception test 2");
     //   testOne.peek();



    }
}