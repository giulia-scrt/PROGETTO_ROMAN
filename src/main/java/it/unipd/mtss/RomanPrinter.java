////////////////////////////////////////////////////////////////////
// SCARTON GIULIA 2116432
// TONINATO ALESSANDRO 2076446
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
	public static String print(int num) {
		return printAsciiArt(IntegerToRoman.convert(num));
	}
	
	private static String printAsciiArt(String romanNumber) {
		int n=romanNumber.length();

		//ciclo per stampare la prima riga di ascii art
		for (int i = 0; i < n; i++) {
			char c = romanNumber.charAt(i);
			if(c=='I') System.out.print(" _____  ");
			else if(c=='V') System.out.print("__      __ ");
			else if(c=='X') System.out.print("__   __ ");
			else if(c=='L') System.out.print(" _       ");
			else if(c=='C') System.out.print("  _____  ");
			else if(c=='D') System.out.print(" _____   ");
			else System.out.print(" __  __  ");
		}
		System.out.println("");

		//ciclo per stampare la seconda riga di ascii art
		for (int i = 0; i < n; i++) {
			char c = romanNumber.charAt(i);
			if(c=='I') System.out.print("|_   _| ");
			else if(c=='V') System.out.print("\\ \\    / / ");
			else if(c=='X') System.out.print("\\ \\ / / ");
			else if(c=='L') System.out.print("| |      ");
			else if(c=='C') System.out.print(" / ____| ");
			else if(c=='D') System.out.print("|  __ \\  ");
			else System.out.print("|  \\/  | ");
		}
		System.out.println("");
		
		//ciclo per stampare la terza riga di ascii art
		for (int i = 0; i < n; i++) {
			char c = romanNumber.charAt(i);
			if(c=='I') System.out.print("  | |   ");
			else if(c=='V') System.out.print(" \\ \\  / /  ");
			else if(c=='X') System.out.print(" \\ V /  ");
			else if(c=='L') System.out.print("| |      ");
			else if(c=='C') System.out.print("| |      ");
			else if(c=='D') System.out.print("| |  | | ");
			else System.out.print("| \\  / | ");
		}
		System.out.println("");
		
		//ciclo per stampare la quarta riga di ascii art
		for (int i = 0; i < n; i++) {
			char c = romanNumber.charAt(i);
			if(c=='I') System.out.print("  | |   ");
			else if(c=='V') System.out.print("  \\ \\/ /   ");
			else if(c=='X') System.out.print("  > <   ");
			else if(c=='L') System.out.print("| |      ");
			else if(c=='C') System.out.print("| |      ");
			else if(c=='D') System.out.print("| |  | | ");
			else System.out.print("| |\\/| | ");
		}
		System.out.println("");
		
		//ciclo per stampare la quinta riga di ascii art
		for (int i = 0; i < n; i++) {
			char c = romanNumber.charAt(i);
			if(c=='I') System.out.print(" _| |_  ");
			else if(c=='V') System.out.print("   \\  /    ");
			else if(c=='X') System.out.print(" / . \\  ");
			else if(c=='L') System.out.print("| |____  ");
			else if(c=='C') System.out.print("| |____  ");
			else if(c=='D') System.out.print("| |__| | ");
			else System.out.print("| |  | | ");
		}
		System.out.println("");
		
		//ciclo per stampare la sesta riga di ascii art
		for (int i = 0; i < n; i++) {
			char c = romanNumber.charAt(i);
			if(c=='I') System.out.print("|_____| ");
			else if(c=='V') System.out.print("    \\/     ");
			else if(c=='X') System.out.print("/_/ \\_\\ ");
			else if(c=='L') System.out.print("|______| ");
			else if(c=='C') System.out.print(" \\_____| ");
			else if(c=='D') System.out.print("|_____/  ");
			else System.out.print("|_|  |_| ");
		}
		
		return null;
	}

}