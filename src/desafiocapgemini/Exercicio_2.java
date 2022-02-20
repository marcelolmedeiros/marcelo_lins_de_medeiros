package desafiocapgemini;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("digite sua senha: ");
			String senha = sc.nextLine();
			
			System.out.println();

			int contMai = 0, contMin = 0, contCarEsp = 0;

			String[] cod = senha.split("");
			for (String string : cod) {

				if (senha.length() < 6) {
					System.out.println("A senha deve conter no mínimo 6 caracter!");
					break;
				}

				if (string == string.toLowerCase()) {

					contMin = 1;

				}

				if (string == string.toUpperCase()) {

					contMai = 1;

				}

				if (string.equals("@") || string.equals("!") || string.equals("%") || string.equals("#")
						|| string.equals("*") || string.equals("^") || string.equals("&")) {
					contCarEsp = 1;

				}

			}

			while (senha.length() < senha.length() + 1) {

				if (contMin == 0) {
					System.out.println("A senha deve conter no mínimo 1 caracter minúsculo!");
					break;

				}

				if (contMai == 0) {
					System.out.println("A senha deve conter no mínimo 1 caracter maiúsculo!");
					break;

				}

				if (contCarEsp == 0) {
					System.out.println("A senha deve conter no mínimo 1 caracter especial!");
					break;

				}
				
				System.out.println("SENHA CADASTRADA COM SUCESO!");
				break;
			}

		}

	}

}
