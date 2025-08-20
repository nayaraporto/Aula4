package ExercíciosPOO;

public class Cadeira {

	String cor;
	String material;
	String usabilidade;
	
	
	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public String getUsabilidade() {
		return usabilidade;
	}


	public void setUsabilidade(String usabilidade) {
		this.usabilidade = usabilidade;
	}


	public void exibirCadeira() {
		System.out.println("");
		System.out.println(" A cor é: " + cor);
		System.out.println(" O material é: " + material);
		System.out.println(" A usabilidade é: " + usabilidade);
	}

}
