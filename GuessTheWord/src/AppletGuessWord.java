import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AppletGuessWord extends JApplet {
	private JTextField textGuessTheWord;
	private JTextField textLivesLeft;
	Hangman HangmanObj= new Hangman();
	//private Hangman HangmanObj; 
	//
	
	/**
	 * Create the applet.
	 */
	public void behindTheButton(Button btn){
	
		try{
		HangmanObj.chrLetterGuessed=btn.getLabel().charAt(0);
		HangmanObj.CompareWord(HangmanObj.chrLetterGuessed);
		textGuessTheWord.setText(HangmanObj.MaskedWord);
		textLivesLeft.setText(String.valueOf(HangmanObj.intLivesLeft));
		
		IfAlive();
		IfWin();
		}
		catch (Exception e){
			
			JOptionPane.showMessageDialog(null, "Press Start Button");
		}
	}
	
	
	public void IfAlive(){
		
		
		if (HangmanObj.getIntLivesLeft() > 0){
					
		}else {
			JOptionPane.showMessageDialog(null, "You lose");
			HangmanObj.intLivesLeft=8;
		}
		
	}
	
	public void IfWin(){
		if (!HangmanObj.getMaskedWord().contains("*")){
			JOptionPane.showMessageDialog(null, "YOu Win!");
			textGuessTheWord.setText("");
			HangmanObj.WordIndex++;
			HangmanObj.MaskedWord="";
			HangmanObj.GenerateMaskedWord();
			HangmanObj.PickWord();
			textGuessTheWord.setText(HangmanObj.getMaskedWord());
			HangmanObj.intLivesLeft=8;
			textLivesLeft.setText(String.valueOf(HangmanObj.intLivesLeft));
			
		}
	}
	public AppletGuessWord() {
		
		
		
		getContentPane().setLayout(null);
		
		Label lblGuessTheWord = new Label("GUESS THE WORD");
		lblGuessTheWord.setFont(new Font("DialogInput", Font.PLAIN, 18));
		lblGuessTheWord.setForeground(Color.RED);
		lblGuessTheWord.setBounds(185, 0, 218, 33);
		getContentPane().add(lblGuessTheWord);
		
		Label lblGuessesRemaining = new Label("GUESSES REMAINING");
		lblGuessesRemaining.setForeground(Color.RED);
		lblGuessesRemaining.setFont(new Font("DialogInput", Font.PLAIN, 18));
		lblGuessesRemaining.setBounds(97, 63, 201, 28);
		getContentPane().add(lblGuessesRemaining);
		
		textGuessTheWord = new JTextField();
		textGuessTheWord.setBounds(185, 37, 160, 20);
		getContentPane().add(textGuessTheWord);
		textGuessTheWord.setColumns(10);
		
		textLivesLeft = new JTextField();
		textLivesLeft.setBounds(304, 71, 41, 20);
		getContentPane().add(textLivesLeft);
		textLivesLeft.setColumns(10);
		
		Button btnA = new Button("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnA);
			}
		});
		btnA.setBounds(10, 103, 60, 28);
		getContentPane().add(btnA);
		
		Button btnB = new Button("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnB);
				
			}
		});
		btnB.setBounds(76, 103, 60, 28);
		getContentPane().add(btnB);
		
		Button btnC = new Button("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnC);
				
			}
		});
		btnC.setBounds(142, 103, 60, 28);
		getContentPane().add(btnC);
		
		Button btnD = new Button("D");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnD);
			}
		});
		btnD.setBounds(208, 103, 60, 28);
		getContentPane().add(btnD);
		
		Button btnE = new Button("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnE);
			}
		});
		btnE.setBounds(274, 103, 60, 28);
		getContentPane().add(btnE);
		
		Button btnF = new Button("F");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnF);
			}
		});
		btnF.setBounds(340, 103, 60, 28);
		getContentPane().add(btnF);
		
		Button btnG = new Button("G");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnG);
				
			}
		});
		btnG.setBounds(406, 103, 60, 28);
		getContentPane().add(btnG);
		
		Button btnN = new Button("N");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnN);
			}
		});
		btnN.setBounds(406, 137, 60, 28);
		getContentPane().add(btnN);
		
		Button btnH = new Button("H");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnH);
				
			}
		});
		btnH.setBounds(10, 137, 60, 28);
		getContentPane().add(btnH);
		
		Button btnI = new Button("I");
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnI);
				
			}
		});
		btnI.setBounds(76, 137, 60, 28);
		getContentPane().add(btnI);
		
		Button btnJ = new Button("J");
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnJ);
				
			}
		});
		btnJ.setBounds(142, 137, 60, 28);
		getContentPane().add(btnJ);
		
		Button btnK = new Button("K");
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				behindTheButton(btnK);
			}
		});
		btnK.setBounds(208, 137, 60, 28);
		getContentPane().add(btnK);
		
		Button btnL = new Button("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnL);
			}
		});
		btnL.setBounds(274, 137, 60, 28);
		getContentPane().add(btnL);
		
		Button btnM = new Button("M");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnM);	
			}
		});
		btnM.setBounds(340, 137, 60, 28);
		getContentPane().add(btnM);
		
		Button btnU = new Button("U");
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnU);
			}
		});
		btnU.setBounds(406, 171, 60, 28);
		getContentPane().add(btnU);
		
		Button btnO = new Button("O");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnO);
			}
		});
		btnO.setBounds(10, 171, 60, 28);
		getContentPane().add(btnO);
		
		Button btnP = new Button("P");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnP);
			}
		});
		btnP.setBounds(76, 171, 60, 28);
		getContentPane().add(btnP);
		
		Button btnQ = new Button("Q");
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnQ);
			}
		});
		btnQ.setBounds(142, 171, 60, 28);
		getContentPane().add(btnQ);
		
		Button btnR = new Button("R");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnR);
			}
		});
		btnR.setBounds(208, 171, 60, 28);
		getContentPane().add(btnR);
		
		Button btnS = new Button("S");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnS);
			}
		});
		btnS.setBounds(274, 171, 60, 28);
		getContentPane().add(btnS);
		
		Button btnT = new Button("T");
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnT);
			}
		});
		btnT.setBounds(340, 171, 60, 28);
		getContentPane().add(btnT);
		
		Button btnAnswer = new Button("ANSWER");
		btnAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textGuessTheWord.setText(HangmanObj.strGuessWord);
				textLivesLeft.setText("");
			}
		});
		btnAnswer.setBounds(406, 205, 60, 28);
		getContentPane().add(btnAnswer);
		
		Button btnV = new Button("V");
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnV);
			}
		});
		btnV.setBounds(10, 205, 60, 28);
		getContentPane().add(btnV);
		
		Button btnW = new Button("W");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnW);
			}
		});
		btnW.setBounds(76, 205, 60, 28);
		getContentPane().add(btnW);
		
		Button btnX = new Button("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnX);
			}
		});
		btnX.setBounds(142, 205, 60, 28);
		getContentPane().add(btnX);
		
		Button btnY = new Button("Y");
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnY);
			}
		});
		btnY.setBounds(208, 205, 60, 28);
		getContentPane().add(btnY);
		
		Button btnZ = new Button("Z");
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				behindTheButton(btnZ);
			}
		});
		btnZ.setBounds(274, 205, 60, 28);
		getContentPane().add(btnZ);
		
		Button btnStart = new Button("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				HangmanObj.PickWord();
				HangmanObj.GenerateMaskedWord();
				textGuessTheWord.setText(HangmanObj.MaskedWord);
				HangmanObj.intLivesLeft=8;
				textLivesLeft.setText(String.valueOf(HangmanObj.intLivesLeft));
				
			}
		});
		btnStart.setBounds(340, 205, 60, 28);
		getContentPane().add(btnStart);

	}
}
