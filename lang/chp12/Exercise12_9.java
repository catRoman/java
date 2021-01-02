import java.util.Scanner;

public class Exercise12_9{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary sequence: ");
        try{
        binarySeqVerify(input.nextLine());
        System.out.println("The sequence is verified");
        }
        catch(BinaryFormatException ex){
            System.out.print(ex);
        }finally{
            System.out.println();
        }
    }
    public static void binarySeqVerify(String seq)
        throws BinaryFormatException{
            for(int i = 0; i < seq.length(); i++){
                if(seq.charAt(i) == '0' || seq.charAt(i) == '1')
                    continue;
                else
                    throw new BinaryFormatException(seq);
            }
        }
}