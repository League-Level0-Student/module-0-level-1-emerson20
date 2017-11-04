import javax.swing.JOptionPane;

public class WarmUp {public static void main(String[] args) {
	int score = 0;
    JOptionPane.showMessageDialog(null, "Here are the instructions: answer the questions correctly to win 10 points.");
	JOptionPane.showMessageDialog(null, "But at the end there will be a bonus question worth 150 points. But reamember it is the hardest question of all. Good luck!");
	String question = JOptionPane.showInputDialog("What is the incantation for the Disarming Spell?");
	if (question.equals("expelliarmus")) {
		JOptionPane.showMessageDialog(null, "Exalent!");
		score+=10;
		
	}
	else {
		JOptionPane.showMessageDialog(null, "Incorrect! It is expelliarmus.");
	}
	String lock = JOptionPane.showInputDialog("What does alohamora do?");
	if (lock.equals("unlocks locks")) {
		JOptionPane.showMessageDialog(null, "Perfect!");
		score+=10;
	}
	else {
		JOptionPane.showMessageDialog(null, "Wrong! It unlocks locks.");
	}
	String book = JOptionPane.showInputDialog("What book do first years use for their transfiguration classes? Use capital letters.");
	if (book.equals("A Beginers Guide to Transfiguration")) {
		JOptionPane.showMessageDialog(null, "Correct!");
		score+=10;
	}
	else {
		JOptionPane.showMessageDialog(null, "Nope! It is A Beginers Guide to Transfiguration.");
	}
	String bonus = JOptionPane.showInputDialog("What is Hagrids full name");
	if (bonus.equals("Rubeus Hagrid")) {
		JOptionPane.showMessageDialog(null, "How did you know that!");
		score+=150;	
	}
	else {
		JOptionPane.showMessageDialog(null, "Sorry, incorrect! The answer is really Rubeus Hagrid.");
	}
	JOptionPane.showMessageDialog(null, "Here is your score "+score);
}

}
