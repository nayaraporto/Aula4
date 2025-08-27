package ExercíciosPOO;

public class Computador {
	
	String cor;
	String marca;
	String tipo;
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void ligar() {
	System.out.println("O computador esta ligado");}
	
	public void desligar() {
		System.out.println("O computador esta ligado");}
		
	
	public void exibirComputador() {
		System.out.println("");
		System.out.println(" A cor é: " + cor);
		System.out.println(" A marca é: " + marca);
		System.out.println(" O tipo é: " + tipo);
    
}}
