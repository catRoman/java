/**=====================
 *  HexFormatException
 * =====================
 * -errorString: String
 * +HexFormatException()
 * +HexFormatException(errorString: String)
 * +HexformatException(message: String, errorString: String)
 * 
 */

 public class HexFormatException extends Exception{

    private String errorCause;

public HexFormatException(){
    
}
public HexFormatException(String errorCause){
    super(errorCause);
    this.errorCause = errorCause;

}
public HexFormatException(String errorMessage, String errorCause){
    super(errorMessage + " : Caused by \"" + errorCause + "\"");
    this.errorCause = errorCause;
}
public String getErrorCause(){
    return errorCause;
}
 }