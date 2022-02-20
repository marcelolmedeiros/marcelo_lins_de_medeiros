package desafiocapgemini;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 
{public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	// Questão 01

	System.out.print("digite valor de 'n' ");
	int n = sc.nextInt();
	
	int i = 0, y=0,a=0;
	
	System.out.println();
	
	while (i < n) {

		y=i;
		while (y < n) {
			System.out.print(" ");				
			y = y + 1;
		}
		
		while (a < i+1) {
			System.out.print("*");
			a=a+1;
			 
		}
		System.out.println();
		i = i + 1;	
		y=0;
		a=0;
	}
	
	
}

}