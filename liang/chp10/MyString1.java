public class MyString1{
    private char[] chars;

    public MyString1(char[] chars){
        this.chars = chars;
    }
    public char charAt(int index){
        return chars[index];
    }
    public int length(){
        return chars.length;
    }
    public MyString1 subString(int begin, int end){
        char[] temp = new char[(end - begin) + 1];
        
        for(int i = begin, j = 0; i <= end; i++, j++){
            temp[j] = this.charAt(i);
        }
        return  new MyString1(temp);
    }
    public MyString1 toLowerCase(){
        char[] temp = new char[this.length()];
        for(int i = 0; i < this.length(); i++){
            temp[i] = Character.toLowerCase(this.charAt(i));

        }
        return new MyString1(temp);
    }
    public boolean equals(MyString1 s){
        if(s.length() != this.length()){
            return false;
        }
        
        for(int i = 0; i < s.length(); i++){
            if(this.charAt(i) != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
public static MyString1 valueOf(int i){
    
    int temp = i;
    char[] newChar = new char[10];
    int count = 0;
    while(temp > 0){
        if(count >= newChar.length){
            char[] tempChar = new char[newChar.length * 2];
            for(int j = 0; j < newChar.length; j++){
                tempChar[j] = newChar[j];
            }
            newChar = tempChar;
        }
        
        if(temp != 0 && temp % 10 >= 0){
            newChar[count] = (char)((temp % 10) + 48);
            temp = (int)(temp / 10);
            count++;
        }
    }
   
    MyString1 newString = new MyString1(newChar).subString(0, count - 1);
    char[] temp2 = new char[newString.length()];

    for(int j = 0, k = newString.length() -1; j < newString.length(); j++, k--){
        
        temp2[k] = newString.charAt(j);
    }
   
    return new MyString1(temp2);
}

}