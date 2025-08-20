package ExercíciosPOO;

public class ComputadorObjeto {

	public static void main(String[] args) {
		
		Computador computador1 = new Computador();
		
		computador1.setCor("Preto");
		computador1.setMarca("Dell");
		computador1.setTipo("Trabalho");
		
		System.out.println("");
		
		System.out.println(computador1.getCor());
		System.out.println(computador1.getMarca());
		System.out.println(computador1.getTipo());
		
		computador1.exibirComputador();

	}

}
