/*
 Agora crie uma nova classe, escreva um for que inicie uma vari�vel n (n�mero atual) 
 como 1 e fatorial (resultado total) como 1. Fa�a seu la�o entre 1 a 10 e calcule o resultado!
 */
public class Desafio03 {
	
	public static void main(String[] args) {
		int fatorial = 1;
		for(int i = 1; i < 11; i++) {
			fatorial *= i;
				System.out.println("Fatorial de "+ i + "=" + fatorial);	
		}
	}

}
