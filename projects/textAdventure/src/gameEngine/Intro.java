package gameEngine;

public class Intro{

	public Intro() {
		
	}
	public void introScene(){
	linePrint();
	//System.out.println();
	//System.out.printf("%-25s", "The Maya Mystery");
	System.out.println();
//	linePrint();
	System.out.println();
	System.out.println("It was a dark and stormy night...... You just got home from a weekend on the\n"
	+ "Island and cant wait to hold Maya. Scritches has been texting you the whole time youve been\n"
	+ "Gone and has been hinting of some pecululiar things going on at home. None to worry about \n"
	+ "untill the last message....\n\t\t\t 'Maya Missing. Meow. Cat Missing. Meow. Bring Snacks...\n");
	System.out.println();
String introTitle = "-----------------------------------------------------------------------------------\n"
		+   " ========  ======  =====  ========      ====  ====    =====  =====   ====   ====   \n"
		+   " \\     \\ \\   \\ \\  \\ \\     \\    /   \\/   \\  /    \\ \\  \\ /  //  /   \\  \n"
		+   "  ===   === \\   ====   \\ \\  ====    /           \\ | __ ||  \\  ==  //   | __ || \n"
		+   "     \\ \\   \\          \\ \\    \\  |   /\\/\\  || | || ||   ||    ||    | || || \n"
		+   "      \\ \\   \\          \\ \\  ===  |   |   ||  || | == ||   ||    ||    | == || \n"  
}

public void linePrint(){
String line = "";
for(int i = 0; i < 50; i++)
	line += "-";
System.out.println(line);
}

public void clearScreen(){
for(int i = 0; i < 50; i++){
System.out.println();
}


}
