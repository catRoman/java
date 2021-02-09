public class PP3_5{
    public static void main(String[] args){
        System.out.println("Test drop out:");
        DropOutStack<Integer> stack = new DropOutStack<>(5,10);
        
        for(int i = 1 ; i <= 10; i++){
            System.out.println("\tis Empty? " + stack.isEmpty() + " size?-> " + stack.size());
            stack.push(i);
            System.out.println("Adding a number: " + i + " toString|-->  " + stack.toString());
        }
        while(!stack.isEmpty()){
            System.out.println("is Empty? " + stack.isEmpty() + " size?-> " + stack.size());
            System.out.println("\tRemoving a number: " + stack.pop() + " toString|-->  " + stack.toString());
        }
        System.out.println("is Empty? " + stack.isEmpty() + " size?-> " + stack.size());
    }
}