/**=======================
 * BinaryFormatException
 * =======================
 * -errorCause: String
 * 
 * +BinaryFormatException()
 * +BinaryFormatException(errorCause: String)
 * +BinaryFormatException(message: String, errorCause: String)
 * +getErrorCause(): String
 */

 public class BinaryFormatException extends Exception{
     private String errorCause;

     public BinaryFormatException(){

     }
     public BinaryFormatException(String errorCause){
         super(errorCause);
         this.errorCause = errorCause;
     }
     public BinaryFormatException(String message, String errorCause){
         super(message + " : Caused by \"" + errorCause + "\"");
         this.errorCause = errorCause;
     }
     public String getErrorCause(){
         return errorCause;
     }
 }