package ExercíciosPOO;

public class FornecedorObjeto {

	public static void main(String[] args) {
	
		Fornecedor fornecedor1 = new Fornecedor();
		
		fornecedor1.setId(56712);
		fornecedor1.setRazaoSocial("Serviço Social da Indústria");
		fornecedor1.setNomeFantasia("SESI");
		fornecedor1.setCnpj("03.779.133/0019-25");
		fornecedor1.setEndereço("Av. Padre Antônio Brunetti");
		fornecedor1.setFone("153275-7920");
		fornecedor1.setEmail("suitapetininga@sesisp.org.br.");
		fornecedor1.setEscricaoEstadual("Não encontrado");
		
		 System.out.println("");
		 
		System.out.println(fornecedor1.getId());
		System.out.println(fornecedor1.getRazaoSocial());
		System.out.println(fornecedor1.getNomeFantasia());
		System.out.println(fornecedor1.getCnpj());
		System.out.println(fornecedor1.getEndereço());
		System.out.println(fornecedor1.getFone());
		System.out.println(fornecedor1.getEmail());
		System.out.println(fornecedor1.getEscricaoEstadual());
		
		fornecedor1.exibirFornecedor();

	}

}
