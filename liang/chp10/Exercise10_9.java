public class Exercise10_9{
    public static void main(String[] args){
        Course introJava = new Course("Intro to java");

        introJava.addStudent("Catlin");
        introJava.addStudent("Lisa");
        introJava.addStudent("Skritches");
        introJava.addStudent("Maya");
        introJava.addStudent("Steve");
        System.out.println("There are " + introJava.getNumberOfStudents() + " students.");
        for(int i = 0; i < introJava.getStudents().length; i++){
            if(introJava.getStudents()[i] != null)
            System.out.println(introJava.getStudents()[i]);
        }
        System.out.println();
        introJava.dropStudent("Steve");
        System.out.println("See ya steve...");
        for(int i = 0; i < introJava.getStudents().length; i++){
            if(introJava.getStudents()[i] != null)
            System.out.println(introJava.getStudents()[i]);
        }
        System.out.println("There are now " + introJava.getNumberOfStudents() + " students.");
    }
}