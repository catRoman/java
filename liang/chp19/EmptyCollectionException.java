public class EmptyCollectionException 
    extends RuntimeException {
        String message;

        public EmptyCollectionException(String collection){
            super("The  " + collection + " is empty.");
        }

}