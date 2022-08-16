import java.util.Scanner;

public class TorneioDeNatacao {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = teclado.next();
		System.out.println("Digite sua Idade: ");
		int idade = teclado.nextInt();
		String nome2 = null;
		nome2 = "";
		if (nome2 == null || nome2 == ""){
				
		}
		
		if (idade <= 10) {
			System.out.println(nome +" Participará da categoria infantil.");
		}else if (idade >= 11 && idade <= 15) {
			System.out.println(nome +" Participará da categoria juvenil.");
		}else if (idade >= 16 && idade <= 19) {
			System.out.println(nome +" Participará da categoria pré-adulto.");
		}else {
			System.out.println(nome +" Participará da categoria adulto.");
		}
	}

}
