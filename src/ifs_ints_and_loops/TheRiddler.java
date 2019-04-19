package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String Q1 = JOptionPane.showInputDialog("What is greater than God,\r\n" + 
		"more evil than the devil,\r\n" + 
		"the poor have it,\r\n" + 
		"the rich need it,\r\n" + 
		"and if you eat it, you'll die?");
if(Q1.equalsIgnoreCase("Nothing")) {score ++; JOptionPane.showMessageDialog(null, "Correct");}
else {JOptionPane.showConfirmDialog(null, "Wrong");}
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
String Q2 = JOptionPane.showInputDialog("Where do fish store money?");
if(Q2.equalsIgnoreCase("Riverbank")) {score ++; JOptionPane.showMessageDialog(null, "Correct");}
else {JOptionPane.showConfirmDialog(null, "Wrong");}

String Q3 = JOptionPane.showInputDialog("What can travel around the world while staying in a corner? \r\n" + 
		"\r\n" + 
		"");
if(Q3.equalsIgnoreCase("Stamp")) {score ++; JOptionPane.showMessageDialog(null, "Correct");}
else {JOptionPane.showConfirmDialog(null, "Wrong");}
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
String Q4 = JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
if(Q4.equalsIgnoreCase("Candle")) {score ++; JOptionPane.showMessageDialog(null, "Correct");}
else {JOptionPane.showConfirmDialog(null, "Wrong");}




		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}

