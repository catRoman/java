public class Exercise7_3{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the integers between 1 and 100 (0 to quite): ");
        

        // enter a string of numbers that terminate if the last number is a single zero
        int count = -1;
        String numberString = "";
       int temp = 0;
       do{
           temp = input.nextInt();
           numberString +=" " + temp;
           count++;
       }while(temp != 0);
      
       numberString = numberString.substring(0,numberString.length()-1);
       numberString = numberString.trim();
      //  System.out.println(numberString.trim());

     //  System.out.println(count);

       // create array and assign each indiviual number to it
       String[] numbers = new String[count];
       String tempString = "";
       for(int i = 0; i < count; i++){
           for(int j = 0; j < numberString.length(); j++){    
                if(numberString.charAt(j) != ' '){
                    tempString += numberString.charAt(j);      
                }else if(numberString.charAt(j) == ' '){
                    numberString = numberString.substring(j + 1); 
                    break;   
                }   
                //numbers[i] = Integer.parseInt(tempString);  
                numbers[i] = tempString;       
            }

            tempString = "";
                    
          //  System.out.println("LOOP: " + i + "(outside j loop) numbers[i]: " + numbers[i]);
        }
    // determine if and how many times each digit is represented throughout the whole string
        int[] occurenceCount = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            count = 0;
            for(int j = 0; j < numbers.length; j++){
                if(numbers[j].equals(numbers[i]))
                    count++;
              // was thinking about something else... not needed
            /*  else if(numbers[j].length() == 1 && numbers[i].indexOf(numbers[j].charAt(0)) != -1 ){
                    count++;
                }else if (numbers[j].length() == 2){
                         if( numbers[i].indexOf(numbers[j].charAt(0)) != -1 
                            && numbers[i].indexOf(numbers[j].charAt(1)) != -1)
                            count += 2;
                         else if( numbers[i].indexOf(numbers[j].charAt(0)) != -1 
                            || numbers[i].indexOf(numbers[j].charAt(1)) != -1)
                            count++;
               
                        }
                        */
            }
            occurenceCount[i] = count;
        //    System.out.println("Loop --> " + i + "ccurenceCount[i]: " + occurenceCount[i]);
        }
        //sort numbers from lowest to highest
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(Integer.parseInt(numbers[j]) > Integer.parseInt(numbers[i])){
                    tempString = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempString;
                    temp = occurenceCount[i];
                    occurenceCount[i] = occurenceCount[j];
                    occurenceCount[j] = temp;

                }
            }
        }

        // display results with a va riable plural depending on the occurence
        String time = ""; 

        for(int i = 0; i < numbers.length; i++){
            time = "time";
            if(occurenceCount[i] > 1)
               time = time + "s";
            if(i != numbers.length - 1){
               if(numbers[i].equals(numbers[i + 1]))
                continue;
            //}else{
              //  if(numbers[i].equals(numbers[i - 1])){
                //    continue;
           // }
            }
            System.out.println(numbers[i] + " occures " + occurenceCount[i] + " " + time);
        }
    
    }
}