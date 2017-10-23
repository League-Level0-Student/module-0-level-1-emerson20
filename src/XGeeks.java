//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String kg = "robotics";
String pn = "math";
String st = "programing";
String eb = "anything magical";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("Please enter one of these initials: kg, pn, st, or eb.");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
if(name.equals("kg")) {
JOptionPane.showMessageDialog(null, kg);	
}if(name.equals("pn")) {
JOptionPane.showMessageDialog(null, pn);	
}if(name.equals("st")) {
JOptionPane.showMessageDialog(null, st);
}if(name.equals("eb")) {
JOptionPane.showMessageDialog(null, eb);
}
	}
}

