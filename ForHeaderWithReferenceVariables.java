/* classe que testa a criação de um cabeçalho for com variáveis de referência */

class ForHeaderWithReferenceVariables {

	public static void main(String[] args) {
	
		for (Integer n1 = new Integer(3), n2 = new Integer(5); 
				n1 < 10 || n2 < 10; n1++, n2++) {
			System.out.println(n1 + " " + n2);
		}
	
	}

} // fim da classe ForHeaderWithReferenceVariables
