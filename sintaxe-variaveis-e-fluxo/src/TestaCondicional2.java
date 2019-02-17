public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 18;
		int quatidadePessoas = 2;
		boolean acompanhando = true;
		//Usando para condicionais OU
		/*if (idade >= 18 || quatidadePessoas >= 2) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente voc� n�o pode entrar");
		}*/
		//Usando para condicionais E => &&
		/*if (idade >= 18 && quatidadePessoas >= 2) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente voc� n�o pode entrar");
		}*/
		//Utilizando Boolean para True e False
		if (idade >= 18 && acompanhando) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente voc� n�o pode entrar");
		}
	}
}
