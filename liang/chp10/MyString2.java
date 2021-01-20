public class MyString2{
String s;

    public MyString2(String s){
        this.s = s;
    }
    @Override
    public String toString(){
        return this.s;
    }
    public int compare(String s){
        
        if(this.s.length() < s.length()){
            return this.s.length() - s.length();
        }else if(this.s.length() > s.length()){
            return this.s.length() - s.length();
        }
        
        
         int num = 0;
        for(int i =0; i < this.s.length(); i++){
                if(this.s.charAt(i) < s.charAt(i)){
                    num = this.s.charAt(i) - s.charAt(i);
                    break;
                }else if(this.s.charAt(i) > s.charAt(i)){
                    num =this.s.charAt(i) - s.charAt(i);
                    break;
            }

        }
        return num;

    }
    public MyString2 subString(int begin){
        String newSubString = "";

        for(int i = begin; i < this.s.length(); i++){
            newSubString += "" + this.s.charAt(i);
        }
        return new MyString2(newSubString);
    }
    public MyString2 toUpperCase(){
        String upperCase = "";
        for(int i = 0; i < this.s.length(); i++){
            upperCase += "" + Character.toUpperCase(this.s.charAt(i));
        }
        return new MyString2(upperCase);
    }
    public char[] toChars(){
        char[] charArr = new char[this.s.length()];
        for(int i = 0; i < this.s.length(); i++){
            charArr[i] = this.s.charAt(i);
        }
        return charArr;
    }
    public static MyString2 valueOf(boolean b){
        if(b)
            return new MyString2("True");
        else    
            return new MyString2("False");

    }
}