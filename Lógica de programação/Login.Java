import java.util.Scanner;

public class Aula04Login {

	public static void main(String[] args) {

		final String login = "Naruto";
		final String password = "Hokage";
		boolean exibirTelaLogin = true;
		Scanner scanner = new Scanner (System.in);
		while(exibirTelaLogin) {
			System.out.println("Digite seu Login.");
			String loginDigitado = scanner.nextLine();
			System.out.println("Digite sua senha.");
			String passowrdDigitado = scanner.nextLine();
			if (login.equals(loginDigitado) && password.equals(passowrdDigitado)){
				System.out.println("ACESSO CONCEDIDO");
				exibirTelaLogin = false;
				break;
				
			}
				System.out.println("ACESSO NEGADO.");
			}
		System.out.println("Programa terminado.");
		}
	}
