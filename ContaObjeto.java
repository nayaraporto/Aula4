package ExercíciosPOO;

public class ContaObjeto {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.setId(11111);
		conta1.setTipo("Poupança");
		conta1.setSaldo(100);
		
		System.out.println("");
		
		conta2.setId(10101);
		conta2.setTipo("Corrente");
		conta2.setSaldo(150);
		
		System.out.println("");
		
		conta1.exibirConta();
		conta2.exibirConta();
		

	}

}
