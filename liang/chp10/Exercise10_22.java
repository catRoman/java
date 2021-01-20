public class Exercise10_22{
    public static void main(String[] args){
        char[] t1 = {'t','e','s','t','1'};
        char[] t2 = {'T','E','S','T','2'};
        MyString1 test1 = new MyString1(t1);
        MyString1 test2 = new MyString1(t2);


        //length(), charAt() test
        println(test1);
        

        //substring() test
        println(test1.subString(0,2));

        //toLowerCase() test
        println(test2.toLowerCase());
        
        //equals() test
        System.out.println(test1.equals(test2));
        System.out.println(test1.subString(0,3).equals(test2.toLowerCase().subString(0,3)));

        //valueOf() test
        println(MyString1.valueOf(1853));
        println(MyString1.valueOf(1002));
    }
        
        public static void println(MyString1 mystring){
        for(int i = 0; i < mystring.length(); i++)
            System.out.print(mystring.charAt(i));
            System.out.println();
        }

    
}