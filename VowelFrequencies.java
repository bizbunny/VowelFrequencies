package assignment3;

import algs4.StdIn;
import algs4.StdOut;
//Anh Nguyen
public class VowelFrequencies {
	public static double charVars(char[] bookWords) {
		int totalCharCount = charAlphabetCount(bookWords);
		int totalVCount=isVowel(bookWords);
		double percentV=(1.0*totalVCount)/(1.0*totalCharCount)*100;
		return percentV;
	}
	public static int charAlphabetCount(char[] lst) {
		int totalCharCount = 0;
		for(char c: lst) {
			boolean isChar = Character.isAlphabetic(c);
			if(isChar==true) {
				totalCharCount++;
			}
		}
		return totalCharCount;
	}
	public static int isVowel(char[] c) {//check
		int vowelCount = 0;
		String vowelLst = new String("aeiouàáâãäåèéêëìíîïòóôõöùúûüAEIOUÀÁÂÃÄÅÈÉÊËÌÍÎÏÒÓÔÕÖÙÚÛÜ");
		
		for(char charc: c) {
			int vPres = vowelLst.indexOf(charc);
			if(vPres!=-1) {
				vowelCount++;
			}
		}
		return vowelCount;
	}	
	public static void main(String[] args) {
		String textSourceGer = "data/GermanNovel.txt";
		StdIn.fromFile(textSourceGer);
		String bookTextGer = StdIn.readAll();
		char[] bookWordsG = bookTextGer.toCharArray();
		
		String textSourceFre = "data/FrenchNovel.txt";
		StdIn.fromFile(textSourceFre);
		String bookTextFre = StdIn.readAll();	
		char[] bookWordsF = bookTextFre.toCharArray();
		
		String textSourceEng = "data/EnglishNovel.txt";
		StdIn.fromFile(textSourceEng);
		String bookTextEng = StdIn.readAll();
		char[] bookWordsE = bookTextEng.toCharArray();
		
		double perE = charVars(bookWordsE);
		double perF = charVars(bookWordsF);
		double perG = charVars(bookWordsG);
		
		StdOut.println("Percentage of Vowels in English Text: "+perE+" %");
		StdOut.println("Percentage of Vowels in French Text: "+perF+" %");
		StdOut.println("Percentage of Vowels in German Text: "+perG+" %");
	}

}
