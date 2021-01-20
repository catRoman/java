public class Chapter4CheckPoints{
    public static void main(String[] args){
        System.out.println("Question 4.1");
        System.out.println("(a) Math.sqrt(4) = " + Math.sqrt(4));
        System.out.println("(b) Math.sin(2 * Math.PI) = " + Math.sin(2 * Math.PI));
        System.out.println("(c) Math.cos(2 * Math.PI) = " + Math.cos(2 * Math.PI));
        System.out.println("(d) Math.pow(2, 2) = " + Math.pow(2 ,2));
        System.out.println("(e) Math.log(Math.E) = " + Math.log(Math.E));
        System.out.println("(f) Math.exp(1) = " + Math.exp(1));
        System.out.println("(g) Math.max(2, Math.min(3, 4)) = " + Math.max(2, Math.min(3, 4)));
        System.out.println("(h) Math.rint(-2.5) = " + Math.rint(-2.5));
        System.out.println("(i) Math.ceil(-2.5) = " + Math.ceil(-2.5));
        System.out.println("(j) Math.floor(-2.5) = " + Math.floor(-2.5));
        System.out.println("(k) Math.round(-2.5f) = " + Math.round(-2.5f));
        System.out.println("(l) Math.round(-2.5) = " + Math.round(-2.5));
        System.out.println("(m) Math.rint(2.5) = " + Math.rint(2.5));
        System.out.println("(n) Math.ceil(2.5) = " + Math.ceil(2.5));
        System.out.println("(o) Math.floor(2.5) = " + Math.floor(2.5));
        System.out.println("(p) Math.round(2.5f) = " + Math.round(2.5f));
        System.out.println("(q) Math.round(2.5) = " + Math.round(2.5));
        System.out.println("(r) Math.round(Math.abs(-2.5))) = " + Math.round(Math.abs(-2.5)));
        System.out.println();
        System.out.println();

        System.out.println("Question 4.3:");
        double radians =  Math.toRadians(47);
        System.out.println("Math.toRadians(47) = " + radians); 
        
        System.out.println("Question 4.4: ");
        double degrees = Math.toDegrees(Math.PI/7);
        System.out.println("Math.toDegrees(Math.PI/7) = " + degrees);

        System.out.println("Question 4.5: ");
        int randomOne = 34 + (int)(Math.random() * 21);
        int randomeTwo = (int)(Math.random() * 1000);
        double randomThree = 5.5 +(Math.random() * 50);

        System.out.println("Eample of unicode: ");
        System.out.println("\u6B22\u8FCE");

        System.out.println("Question 4.8: ");
        System.out.print("The ASCII code for....\n"
                    + "'1'\t" + (int)'1' + "\n"
                    + "'A'\t" + (int)'A' + "\n"
                    + "'B'\t" + (int)'B' + "\n"
                    + "'a'\t" + (int)'a' + "\n"
                    + "'b'\t" + (int)'b' + "\n");
        System.out.println();
        System.out.print("The character for the decimal code is..\n"
                    + "40\t" + (char)40 + "\n"
                    + "59\t" + (char)59 + "\n"
                    + "79\t" + (char)79 + "\n"
                    + "85\t" + (char)85 + "\n"
                    + "90\t" + (char)90 + "\n");
        System.out.println();
        System.out.print("The character for the hexadicimal code is..\n"
                    + "40\t" + (char)0x40 + "\n"
                    + "5A\t" + (char)0x5A + "\n"
                    + "71\t" + (char)0x71 + "\n"
                    + "72\t" + (char)0x72 + "\n"
                    + "7A\t" + (char)0x7A + "\n");
        System.out.println();
        
        System.out.println("Question 4.11: ");
        int i = '1';
        int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
        int k = 'a';
        char c = 90;
        System.out.println("i = " + i + "\nj = " + j + "\nk = " + k + "\nc = " + c);
        System.out.println();
        
        System.out.println("Question 4.13: ");
        System.out.println("'a' = " + (int)'a' + " 'c' = " + (int)'c');
        char x = 'a';
        char y = 'c';
        System.out.println((int)++x);
        System.out.println((int)y++);
        System.out.println((int)x + " - " + (int)y + " = " + (x - y));
        System.out.println();
        System.out.println("Question 4.15: ");
        System.out.println('a' < 'b'); //true
        System.out.println('a' <= 'A'); //false
        System.out.println('a' > 'b'); //false
        System.out.println('a' >= 'A'); //true
        System.out.println('a' == 'a'); //true
        System.out.println('a' != 'b'); //true
        System.out.println();
        int h = 1;
        int n = 2;
        System.out.println("h + n is " + h + n);
        System.out.println("or " + (h +n));
        System.out.println();
        System.out.println("Question 4.16: ");
        String s1 = "Welcome to Java";
        String s2 = "Programming is fun";
        String s3 = "Welcome to Java";
        System.out.print("(a) s1 == s2: " + (s1 == s2) + "\n" //false
                    + "(b) s2 == s3: " + (s2 == s3) + "\n" //false
                    + "(c) s1.equals(s2): " + s1.equals(s2) + "\n" //false
                    + "(d) s2.equals(s3): " + s2.equals(s3) + "\n" //false
                    + "(e) s1.compareTo(s2): " + s1.compareTo(s2) + "\n" //7
                    + "'W' = " + (int)'W' + " 'P' = " + (int)'P' + "\n" //testing understanding
                    + "(f) s2.compareTo(s3): " + s2.compareTo(s3) + "\n" //-7
                    + "(g) s2.compareTo(s2): " + s2.compareTo(s2) + "\n" //0
                    + "(h) s1.charAt(0): " + s1.charAt(0) + "\n" // W
                    + "(i) s1.indexOf('j'): " + s1.indexOf('j') + "\n" // -1 ( doesnt exist)
                    + "(j) s1.indexOf(\"to\"): " + s1.indexOf("to") + "\n" //8
                    + "(k) s1.lastIndexOf('a'): " + s1.lastIndexOf('a') + "\n" //14
                    + "(l) s1.lastIndexOf(\"o\", 15): " + s1.lastIndexOf("o", 15) + "\n" // 9
                    + "(m) s1.length(): " + s1.length() + "\n" //15
                    + "(n) s1.substring(5): " + s1.substring(5) + "\n" //me to Java
                    + "(o) s1.substring(5, 11): " +  s1.substring(5, 11) + "\n" //me to 
                    + "(p) s1.startsWith(\"Wel\"): " + s1.startsWith("Wel") + "\n" //true
                    + "(q) s1.endsWith(\"Java\"): " + s1.endsWith("Java") + "\n" //true
                    + "(r) s1.toLowerCase(): " + s1.toLowerCase() + "\n" // welcome to java
                    + "(s) s1.toUpperCase(): " + s1.toUpperCase() + "\n" // WELCOME TO JAVA
                    + "(t) s1.concat(s2): " + s1.concat(s2) + "\n" // Welcome to JavaProgramming is fun
                    + "(u) s1.contains(s2): " + s1.contains(s2) + "\n" // false
                    + "(v) \"\\t Wel \\t\".trim(): " + "\t Wel \t".trim() + "\n" // Wel
        );

        System.out.println();

        System.out.println("Question 4.10:");
        System.out.println(1 + "Welcome " + 1 + 1); // 1Welcome 11
        System.out.println(1 + "Welcome " + (1 + 1)); // 1Welcome 2
        System.out.println(1 + "Welcome " + ('\u0001' + 1)); // 1Welcome 2
        System.out.println(1 + "Welcome " + 'a' + 1); // 1Welcome a1
        System.out.println();

        System.out.println("Question 4.20: ");
        String s5 = "Welcome";
        String s6 = "welcome";
        System.out.println("(a): " + s5.equals(s6));
        boolean isEqual = s5.equals(s6);
        System.out.println("isEqual: " + isEqual);
        System.out.println("(b): " + s5.equalsIgnoreCase(s6) );
        isEqual = s5.equalsIgnoreCase(s6);
        System.out.println("isEqual: " + isEqual);
   //c     
        int x1 = s5.compareTo(s6);
        System.out.println("(c): " + x1);
//d
        x1 = s5.compareToIgnoreCase(s6);
        System.out.println("(d): " + x1);

        
//e
        boolean b1 = s5.startsWith("AAA");
        System.out.println("(e): " + b1);
//f
        b1 = s5.endsWith("AAA");
        System.out.println("(f): " + b1);
        //g
        x1 = s5.length();
        System.out.println("(g): " + s5.length());

        //h
        char x2 = s1.charAt(0);
        System.out.println("(h): " + x2);

        //i
        String s7 = s5 + s6;
        System.out.println("(i): " + s7);

        //j
        System.out.println("(j): " + s5.substring(1));
        //k
        System.out.println("(k): " + s5.substring(1, 5));
        //l
        s7 = s5.toLowerCase();
        System.out.println("(l): " + s7);
        //m
        s7 = s5.toUpperCase();
        System.out.println("(m): " + s7);
        //n
        s7 = s5.trim();
        System.out.println("(n): " + s7);
        //o
        x1 = s5.indexOf('e');
        System.out.println("(o): " + x1);
        //p
        x1 = s5.lastIndexOf("abc");
        System.out.println("(p): " + x1 );

System.out.println();

        System.out.println("Question 4.24: ");
        System.out.printf("%6b%-8s\n", (1 > 2), "Java");
        System.out.printf("%6b%8s\n", (1 > 2), "Java");
        System.out.printf("%-6b%s\n", (1 > 2), "Java");

         
    
    }




}