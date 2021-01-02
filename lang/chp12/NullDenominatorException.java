/**=========================
 *  NullDenominatorException
 * =========================
 * +NullDenominatorException()
 * +NullDenominatorException(denominator: int)
 * +getDenominator(): int

 */

 public class NullDenominatorException extends Exception{
     

     public NullDenominatorException(){
       super("invalid denominator");
        
     }

     public NullDenominatorException(String str){
      super(str);
    }

     
 }