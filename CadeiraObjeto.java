package ExercíciosPOO;



public class CadeiraObjeto {

	public static void main(String[] args) {
		
		Cadeira cadeira1 = new Cadeira();
		

		cadeira1.setCor("Preta");
		cadeira1.setMaterial("Couro");
		cadeira1.setUsabilidade("Trabalho");
		
		System.out.println("");
		
		System.out.println(cadeira1.getCor());
		System.out.println(cadeira1.getMaterial());
		System.out.println(cadeira1.getUsabilidade());
		
		cadeira1.exibirCadeira();
	}

}
