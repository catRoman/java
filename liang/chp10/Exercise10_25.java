import java.util.Arrays;
public class Exercise10_25{
    public static void main(String[] args){

        String regEx1 = "#";
        String regEx2 = "?!";

        String test1 = "This#is#a#test";
        String test2 = "This?is?another!test!";

        System.out.println(Arrays.toString(split(test1,regEx1)));
        System.out.println(Arrays.toString(split(test2,regEx2)));

    }
    public static String[] split(String s, String regEx){
        String[] stringArr = new String [1];
        String temp = "";
        int count = 0;
    

        for(int i = 0; i < regEx.length(); i++){
            if(s.contains(regEx.charAt(i)){
                
            }
        }










        
        for(int i = 0; i < s.length(); i++ ){
            if(!s.charAt(i).equals(regEx)){
                temp += s.charAt(i);

            }else{ 
                if(count >= stringArr.length){
                   stringArr = Arrays.copyOf(stringArr, stringArr.length + 1);
                }
                stringArr[count] = temp;
                temp = "";
                count++;     
            }
            }
        
    }
}