import java.util.Scanner;

public class CadastroDeLogin {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = teclado.next();
		if (nome.equals("") || nome.equalsIgnoreCase ("admim") || nome.equalsIgnoreCase ("administrador")) {
			System.out.println(nome+ " Usuário inválido.");
		}else {
			System.out.println(nome+ " Usuário cadastrado com sucesso.");
		}
	}

}
