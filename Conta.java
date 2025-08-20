package ExercíciosPOO;

public class Conta {

	int id;
	String tipo;
	double saldo;
	double saque;
	double deposito;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar (double saque) {
		saldo -= saque;
	}
	
	public void deposito (double deposito) {
		deposito += deposito;
	}
	public void exibirConta() {
		System.out.println("");
		System.out.println(" O ID é : " + id);
		System.out.println(" O tipo  é: " + tipo);
		System.out.println(" O saldo é: " + saldo);
		
		
			
}}