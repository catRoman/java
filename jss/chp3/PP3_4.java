package chp3;

/**Array stack using an array test program
 * 
 * Java Software structures by Lewis and Chase
 * Chapter 3
 */
public class PP3_4{
    /**Test Driver */
    public static void main(String[] args){
        AnotherArrayStack<String> stackOne = new AnotherArrayStack<>();

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
        while(!stackOne.isEmpty()){
            System.out.println(stackOne.pop());
            System.out.println("size: " + stackOne.size());
            System.out.println("\tempty: " + stackOne.isEmpty());
            
        }
        System.out.println("empty: " + stackOne.isEmpty());
        System.out.println("Exception attempt");
        System.out.println("peek: " + stackOne.peek());
    }

}
