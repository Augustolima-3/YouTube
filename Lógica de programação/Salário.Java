public class Salario {

	public static void main(String[] args) {
		
		float salario = 4700.50F;
		
		if (salario > 4500) {
			float trintaporcento = salario + 0.3F;
			System.out.println("30% ="+trintaporcento);
		}else {
			float dezporcento = salario + 0.1F;
			System.out.println("10% = "+dezporcento);
		}
		
	}

}
