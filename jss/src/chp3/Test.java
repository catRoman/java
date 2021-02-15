package chp3;


/**Array stack using an array test program
 * 
 * Java Software structures by Lewis and Chase
 * Chapter 3
 */
public class Test{
    /**Test Driver */
    public static void main(String[] args){
        ArrayStack<String> stackOne = new ArrayStack<>();

        System.out.println("Empty? " + stackOne.isEmpty());

        stackOne.push("test");
        stackOne.push("testskjdhf");
        stackOne.push("tess,dncklsjdt");
        stackOne.push("testskdjchksjhdckjsdh");
        stackOne.push("testsldjchskdfhckisdbhciushdc");
        stackOne.push("testsdgcsdgfciusdcishucuishdciuhss");
        stackOne.push("sdm,fnskudhcsukdhfckishdciuhdcuhdcihsh");
        stackOne.push("ksjhfsdgsdhcsdckshdckihsdcfhsdhcsuihdcuksh");
    
        System.out.println("size: " + stackOne.size());
        System.out.println("peek: " + stackOne.peek());
        System.out.println("size: " + stackOne.size());
        System.out.println("pop!pop!: ");
        stackOne.pop();
        stackOne.pop();
        System.out.println("size: " + stackOne.size());
        System.out.println("pop loop to zero:");
        for(int i = stackOne.size() ; i >= 0; i--){
        System.out.println("size: " + stackOne.size());
        System.out.println(stackOne.pop());
        }
        System.out.println("empty: " + stackOne.isEmpty());
        System.out.println("Exception attempt");
        System.out.println("peek: " + stackOne.peek());
    }
    thisis a test;

}
