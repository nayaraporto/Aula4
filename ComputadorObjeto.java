package ExercíciosPOO;

public class ComputadorObjeto {

	public static void main(String[] args) {
		
		Computador computador1 = new Computador();
		Computador computador2 = new Computador();
		
		computador1.setCor("Preto");
		computador1.setMarca("Dell");
		computador1.setTipo("Trabalho");
		
		System.out.println("");
		
		computador2.setCor("Preto");
		computador2.setMarca("Apple");
		computador2.setTipo("Trabalho");
		
		System.out.println("");
		
		System.out.println(computador1.getCor());
		System.out.println(computador1.getMarca());
		System.out.println(computador1.getTipo());
		
        System.out.println("");
		
		System.out.println(computador2.getCor());
		System.out.println(computador2.getMarca());
		System.out.println(computador2.getTipo());
		
		computador1.exibirComputador();
		computador1.ligar();
		computador2.exibirComputador();
		computador2.desligar();

	}

}


