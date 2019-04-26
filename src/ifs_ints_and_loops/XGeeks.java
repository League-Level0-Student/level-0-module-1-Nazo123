package ifs_ints_and_loops;
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
String Name = JOptionPane.showInputDialog("What's your name");
	
	if(Name.equals("Daniel")) {JOptionPane.showConfirmDialog(null, "Your superpower is Java "+Name);}
	if(Name.equals("Michael")) {JOptionPane.showConfirmDialog(null, "Your superpower is being lefty "+Name);}
	if(Name.equals("Shivam")) {JOptionPane.showConfirmDialog(null, "Your superpower is being good at teniss "+Name);}
	if(Name.equals("Dylan")) {JOptionPane.showConfirmDialog(null, "Your superpower is that you have practically nothing unique about you, "+Name);}
	if(Name.equals("Eddie")) {JOptionPane.showConfirmDialog(null, "Your superpower is playing the double bass "+Name);}
	if(Name.equals("Ella")) {JOptionPane.showConfirmDialog(null, "Your superpower is graphic design "+Name);}
	if(Name.equals("Gizem")) {JOptionPane.showConfirmDialog(null, "Your superpower is coming to class "+Name);}
	if(Name.equals("Ozan")) {JOptionPane.showConfirmDialog(null, "Your superpower is being bad at spelling "+Name);}
	
}
		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. Show the superpower in a pop-up, depending on the name entered. 

	}


