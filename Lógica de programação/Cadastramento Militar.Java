public class CadastramentoMilitar {

	public static void main(String[] args) {

		char sexo ='M';
		int idade = 19;
		
		if ( (sexo == 'M' || sexo == 'F') && idade < 18) {
			System.out.println("Alistamento não permitido");
		}else if (sexo == 'M' && idade >= 18) {
			System.out.println("Alistamento militar obrigatório.");
		}else if (sexo == 'F' && idade >= 18) {
			System.out.println("Pode alistar-se.");
		}
	}

}
