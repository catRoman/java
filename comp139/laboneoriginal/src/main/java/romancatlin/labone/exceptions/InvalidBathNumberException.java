package labone.exceptions;

/**InvalidBathNumberException ensures all livingspaces have
 * at least a set number of baths depending on clients 
 * implementation 
 * 
 * @author Catlin Roman -2021/01/27
 * 
 * @see labone.livingspace.LivingSpace
*/
public class InvalidBathNumberException extends Exception {
    private String message;

    /**Default constructor */
    public InvalidBathNumberException(){
        
    }
    /**Exception with message
     * @param message customized exvarible eption message
     */
    public InvalidBathNumberException(String message){
        super(message);
        this.message = message;
    }

    /**@return customized message if any else returns null */
    public String getMessage(){
        return this.message;
    }
}