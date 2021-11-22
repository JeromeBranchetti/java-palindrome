package org.generation.italy.strings;

import java.util.Scanner;

public class VerificaPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Inserisci una parola: ");
		String parola = scan.nextLine();
		
		int lunghezza = parola.length();
		int indiceCentraele = lunghezza / 2;
		boolean diversi = false;
		char[] scomposta = parola.toCharArray();
		
		if (parola.length() % 2 == 0) {
			System.out.println("Mi dispiace ma non può essere palindrona");
		}
		else {
			for (int i = 0; i < indiceCentraele && !diversi; i++) {
				System.out.println("step " + i);
				System.out.println("confronto " + scomposta[i] + "  con  " + scomposta[(lunghezza - 1) - i]);
				if (scomposta[i] != scomposta[(lunghezza - 1) - i]) {
					
					diversi = true;
					System.out.println("Purtroppo non è palindroma");
					
				}
			}
			System.out.println("La parola è lunga " + lunghezza);
			if (diversi == false) {
				System.out.println("La parola " + parola + " è palindroma");
				
		}
		
		}

	}

}
