package ExercíciosPOO;

public class Fornecedor {
	
	int id;
	String razaoSocial;
	String nomeFantasia;
	String cnpj;
	String endereço;
	String fone;
	String email;
	String escricaoEstadual;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEscricaoEstadual() {
		return escricaoEstadual;
	}
	public void setEscricaoEstadual(String escricaoEstadual) {
		this.escricaoEstadual = escricaoEstadual;
	}
	public void exibirFornecedor() {
		System.out.println("");
		System.out.println(" O ID é : " + id);
		System.out.println(" A rasão social  é: " + razaoSocial);
		System.out.println(" O nome fantasia é: " + nomeFantasia);
		System.out.println(" O CNPJ é: " + cnpj);
		System.out.println(" O endereço é: " + endereço);
		System.out.println(" O fone é: " + fone);
		System.out.println(" O email é: " + email);
		System.out.println(" A escrição estadual é: " + escricaoEstadual);
	
	

}}
