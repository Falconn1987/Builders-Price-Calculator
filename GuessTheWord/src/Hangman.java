import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Hangman {

	ArrayList <String>wordsList = new ArrayList<String>();
	String strGuessWord;
	int intLivesLeft;
	String MaskedWord="";
	int WordIndex;
	char chrLetterGuessed;
	boolean alive;

	public ArrayList<String> getWordsList() {return wordsList;}

	public void setWordsList(ArrayList<String> wordsList) {this.wordsList = wordsList;}

	public String getGuessWord() {return strGuessWord;}

	public void setGuessWord(String guessWord) {strGuessWord = guessWord;}

	public int getIntLivesLeft() {return intLivesLeft;}

	public void setIntLivesLeft(int intLivesLeft) {this.intLivesLeft = intLivesLeft;}

	public String getMaskedWord() {return MaskedWord;}

	public void setMaskedWord(String maskedWord) {MaskedWord = maskedWord;}

	public boolean isBlnWin() {return blnWin;}

	public void setBlnWin(boolean blnWin) {this.blnWin = blnWin;}

	boolean blnWin;

	Hangman(){
		wordsList.add("MEMORY");
		wordsList.add("COMPUTER");
		wordsList.add("PRINTER");
		wordsList.add("TROUSERS");
		wordsList.add("SCREEN");
		wordsList.add("MOUSE");
		wordsList.add("DRIVE");
		wordsList.add("BROWSER");
		wordsList.add("SOFTWARE");
		wordsList.add("INDEX");
		wordsList.add("JACKET");
		wordsList.add("PROJECTOR");
		intLivesLeft=8;
	}

	public void PickWord(){

		try {
			strGuessWord=wordsList.get(WordIndex);
		} catch (IndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Are You still here? :)");		}

	}

	public void GenerateMaskedWord(){
		try {
			MaskedWord="";
			for (int i = 0; i < wordsList.get(WordIndex).length(); i++) {
				MaskedWord=MaskedWord+"*";}
		} 
		catch (IndexOutOfBoundsException e) {
					JOptionPane.showMessageDialog(null, "Congratulations! You have guessed all the words!");	
		}

	}
	public void CompareWord(char chrLetterGuessed){

		if (strGuessWord.indexOf(chrLetterGuessed)!=-1){
			char[] tempArray = MaskedWord.toCharArray();
			for (int i = 0; i < tempArray.length; i++) {
				if(strGuessWord.charAt(i)==chrLetterGuessed){
					tempArray[i]=chrLetterGuessed;
				}	

			} MaskedWord=String.valueOf(tempArray);

		}else{
			intLivesLeft=intLivesLeft-1;
		}
	}
}