import java.util.Scanner;

public class ExercĂ­cioImparesEPares {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor desejado.");
		int valorFinal = teclado.nextInt();
		int i = 0;
		while (i <= valorFinal) {
			if (i % 2 != 0) {
				System.out.println("I= "+ i);
				
			}
			i = i + 1;
		}
	}

}
