public class TesteCondicional4 {
	public static void main(String[] args) {
		int carrosEstacionados = 5;
		int manobrista = 1;
		
		if (carrosEstacionados <= 4) {
			System.out.println("Pode estacionar");
		} else {
			if (manobrista >= 2) {
				System.out.println("Chame um manobrista");
			}
			else {
				System.out.println("Não temos vagas");
			}
		}
	}
}
