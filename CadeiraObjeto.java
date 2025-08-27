package ExercíciosPOO;
public class CadeiraObjeto {

	public static void main(String[] args) {
		
		Cadeira cadeira1 = new Cadeira();
		Cadeira cadeira2 = new Cadeira();
		

		cadeira1.setCor("Preta");
		cadeira1.setMaterial("Couro");
		cadeira1.setUsabilidade("Trabalho");
		
		System.out.println("");
		
		cadeira2.setCor("Azul");
		cadeira2.setMaterial("Couro");
		cadeira2.setUsabilidade("Game");
		
		System.out.println("");
		
		System.out.println(cadeira1.getCor());
		System.out.println(cadeira1.getMaterial());
		System.out.println(cadeira1.getUsabilidade());
		
        System.out.println("");
		
		System.out.println(cadeira2.getCor());
		System.out.println(cadeira2.getMaterial());
		System.out.println(cadeira2.getUsabilidade());
		
		cadeira1.exibirCadeira();
		cadeira1.disponivel1();
		cadeira2.exibirCadeira();
		cadeira2.disponivel2();
		
	
	}

}

