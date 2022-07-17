package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
		int score = 0;
		
		String input = JOptionPane.showInputDialog(null, "Brothers and sisters I have none but this man's father is my father's son.  Who is the man?");
		
		if (input.equals("My son")) {
			
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
			else {
				JOptionPane.showMessageDialog(null, "Incorrect, the correct answer would be: My son");

			}
		
String input2 = JOptionPane.showInputDialog(null, "What can travel around the world while staying in a corner?");
		
		if (input2.equals("A stamp")) {
			
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
			else {
				JOptionPane.showMessageDialog(null, "Incorrect, the correct answer would be: A stamp");

			}
		
		JOptionPane.showMessageDialog(null, "Your Score is: " + score);
       
				
	}
}

