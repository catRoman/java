public class Exercise10_23{
    public static void main(String[] args){
        String t1 = "Test1";
        String t1a = "Test100";
        String t1b = "Tsst1";
        String t2 = "Qest2";

        MyString2 test1 = new MyString2(t1);
        
        System.out.println(test1.compare(t1));
            System.out.println(t1.compareTo(t1));
        System.out.println(test1.compare(t1b));
            System.out.println(t1.compareTo(t1b));
        System.out.println(test1.compare(t1a));
            System.out.println(t1.compareTo(t1a));
        System.out.println(test1.compare(t2));
            System.out.println(t1.compareTo(t2));


    }
}