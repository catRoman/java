public class MyString2{
String s;

    public MyString2(String s){
        this.s = s;
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
       
        
            String neWstring
            
            for(int i = begin, j = 0; i <= end; i++, j++){
                temp[j] = this.charAt(i);
            }
            return  new MyString1(temp);
        
    }
}