public class TipoDeConta {

	public static void main(String[] args) {

		String conta = "Conta correNte";
		switch (conta){
			case "Conta poupança":
				System.out.println("0.05%");
					break;
			case "Conta corrente":
				System.out.println("0.02%");
					break;
			case "Conta investimento":
				System.out.println("0.1%");
					break;
			default:
				System.out.println("Conta inexistente.");
			
		}
			
		
	}

}
