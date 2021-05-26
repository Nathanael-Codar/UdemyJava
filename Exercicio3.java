import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String frase = "Socorra-me, subi no ônibus em Marrocos";
		System.out.println(frase);
		
		String[] palavra = frase.split(" ");
		
		for(int i= palavra.length; i > 0; --i) {
			System.out.printf("%s ", palavra[i-1]);
		}
		
//		System.out.println(palavra.length);
		
		sc.close();
	}

}
