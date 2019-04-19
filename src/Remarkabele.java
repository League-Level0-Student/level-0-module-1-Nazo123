import javax.swing.JOptionPane;

public class Remarkabele {
public static void main(String[] args) {
	String Name = JOptionPane.showInputDialog("What's your name");
	
	if(Name.equals("Daniel")) {JOptionPane.showConfirmDialog(null, "You are good at Java "+Name);}
	if(Name.equals("Michael")) {JOptionPane.showConfirmDialog(null, "You are a lefty "+Name);}
	if(Name.equals("Shivam")) {JOptionPane.showConfirmDialog(null, "You are good at teniss "+Name);}
	if(Name.equals("Dylan")) {JOptionPane.showConfirmDialog(null, "You have practically nothing unique about you, "+Name);}
	if(Name.equals("Eddie")) {JOptionPane.showConfirmDialog(null, "You play double bass "+Name);}
	if(Name.equals("Ella")) {JOptionPane.showConfirmDialog(null, "You good at graphic design "+Name);}
	if(Name.equals("Gizem")) {JOptionPane.showConfirmDialog(null, "You come to class "+Name);}
	if(Name.equals("Ozan")) {JOptionPane.showConfirmDialog(null, "You are bad at spelling "+Name);}
	if(Name.equals("Trump")) {JOptionPane.showConfirmDialog(null, "You suck "+Name);}
}
}
