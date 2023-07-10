package composite3;

public class Sistema {

	public static void main(String[] args) {
		Postagem postagem1 = new Postagem();
		
		postagem1.setTitulo("Postagem 1");
		postagem1.setUrl("/url");
		
		Pagina pagina1 = new Pagina();
		Pagina pagina2 = new Pagina();
		Pagina pagina3 = new Pagina();
		
		pagina1.setTitulo("pagina1");
		pagina1.setUrl("/pagina1");
		pagina1.setConteudo("Conteudo da pagina1 ");
		
		pagina2.setTitulo("pagina2");
		pagina2.setUrl("/pagina2");
		pagina2.setConteudo("Conteudo da pagina2 ");
		
		pagina3.setTitulo("pagina3");
		pagina3.setUrl("/pagina3");
		pagina3.setConteudo("Conteudo da pagina3 ");
		
		postagem1.add(pagina1);
		postagem1.add(pagina2);
		postagem1.add(pagina3);
		
		Pagina pagina4 = new Pagina();
		Pagina pagina5 = new Pagina();
	
		pagina4.setTitulo("pagina4");
		pagina4.setUrl("/pagina4");
		pagina4.setConteudo("Conteudo da pagina4 ");
		
		pagina5.setTitulo("pagina5");
		pagina5.setUrl("/pagina5");
		pagina5.setConteudo("Conteudo da pagina5 ");
		
		postagem1.imprimir();
		System.out.println("=====================");
		pagina4.imprimir();
		System.out.println("=====================");
		pagina5.imprimir();
	
	}
}
