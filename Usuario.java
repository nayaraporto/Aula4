package ExercíciosPOO;

public class Usuario {
	
	int id;
	String nome;
	int password;
	String permissao;
	String usuario;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getPermissao() {
		return permissao;
	}
	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public void exibirUsuario() {
		System.out.println("");
		System.out.println(" O ID é : " + id);
		System.out.println(" O nome  é: " + nome);
		System.out.println(" O password é: " + password);
		System.out.println(" A permissão  é: " + permissao);
		System.out.println(" O usuário é: " + usuario);




}}
