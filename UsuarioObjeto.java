package ExercíciosPOO;

public class UsuarioObjeto {

	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		
		usuario1.setId(010101);
		usuario1.setNome("Murillo");
		usuario1.setPassword(12345);
		usuario1.setPermissao("Sim");
		usuario1.setUsuario("@Murillin.xp");
		
		System.out.println("");
		
		usuario2.setId(101010);
		usuario2.setNome("Nayara");
		usuario2.setPassword(15243);
		usuario2.setPermissao("Sim");
		usuario2.setUsuario("@naya.ufw");
		
		System.out.println("");
		
		System.out.println(usuario1.getId());
		System.out.println(usuario1.getNome());
		System.out.println(usuario1.getPassword());
		System.out.println(usuario1.getPermissao());
		System.out.println(usuario1.getUsuario());
		
        System.out.println("");
		
		System.out.println(usuario2.getId());
		System.out.println(usuario2.getNome());
		System.out.println(usuario2.getPassword());
		System.out.println(usuario2.getPermissao());
		System.out.println(usuario2.getUsuario());
		
		usuario1.exibirUsuario();
		usuario2.exibirUsuario();
		
		
	}

}
