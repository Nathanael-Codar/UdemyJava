package Array;

import java.util.Locale;
import java.util.Scanner;
import Banco.Contas;


// Crie uma Classe e no m�todo main crie um array de contas de tamanho 10. Em
// seguida, fa�a uma la�o para criar 10 contas com saldos distintos e coloc�-
// los no Array.

// 2. Ainda na classe, fa�a um outro la�o para calcular e imprimir a m�dia dos saldos de
// todas as contas do array.

public class TestaArrays {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Contas[] contas = new Contas[10];
		
		for(int i=0; i < contas.length; ++i ) {
			contas[i] = new Contas();
			contas[i].setDeposita(i*100);
		}
		
		for(int i=0; i < contas.length; ++i) {
			
			System.out.println("Deposito: " + contas[i].getDeposita());
			
		}
		double soma = 0.0;
		for(int i=0; i < contas.length; ++i ) {
			soma += contas[i].getDeposita();
		}
		
		double media = soma/10;
		
		System.out.println("Valor da m�dia: " + media);
		

		sc.close();
	}

}
