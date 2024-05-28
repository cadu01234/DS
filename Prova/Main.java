
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Livro livro1 = new Livro();
		Revista revista1 = new Revista();
		Livro livro2 = new Livro();
		Revista revista2 = new Revista();
		Livro livro3 = new Livro();
		Revista revista3 = new Revista();
		
		livro1.setTitulo("Os destemiveis");
		livro1.setAutor("José Azevedo");
		livro1.setAnoPublicacao(2000);
		livro1.setNumeroPaginas(100);
		livro1.setEditora("Panini");
		
		livro2.setTitulo("Os incriveis");
		livro2.setAutor("João Pedro");
		livro2.setAnoPublicacao(2003);
		livro2.setNumeroPaginas(67);
		livro2.setEditora("Salvati");
		
		livro3.setTitulo("Os legais");
		livro3.setAutor("Davi Nunes");
		livro3.setAnoPublicacao(2004);
		livro3.setNumeroPaginas(77);
		livro3.setEditora("Panini");
		
		
		revista1.setTitulo("Nova Era");
		revista1.setAutor("Guilherme Silva");
		revista1.setAnoPublicacao(2002);
		revista1.setNumeroEdicao(5);
		revista1.setMesPublicacao("Abril");
		
		revista2.setTitulo("Um tempo passado");
		revista2.setAutor("Otávio Mendes");
		revista2.setAnoPublicacao(2007);
		revista2.setNumeroEdicao(3);
		revista2.setMesPublicacao("Junho");
		
		revista3.setTitulo("Os imbativeis");
		revista3.setAutor("Guilherme Silva");
		revista3.setAnoPublicacao(2010);
		revista3.setNumeroEdicao(7);
		revista3.setMesPublicacao("Setembro");
		
		System.out.println("O titulo do livro 1 é : " +livro1.getTitulo()+ " seu autor é : " +livro1.getAutor()+ "e " +livro1.getAnoPublicacao()+ "é o ano em que foi publicado");
		System.out.println("O livro 1 tem : " +livro1.getNumeroPaginas()+ " paginas e a sua editora é :" +livro1.getEditora());
		System.out.println("O titulo do livro 2 é : " +livro2.getTitulo()+ " seu autor é : " +livro2.getAutor()+ "e " +livro2.getAnoPublicacao()+ "é o ano em que foi publicado");
		System.out.println("O livro 2 tem : " +livro2.getNumeroPaginas()+ " paginas e a sua editora é : " +livro2.getEditora());
		System.out.println("O titulo do livro 3 é : " +livro3.getTitulo()+ " seu autor é : " +livro3.getAutor()+ "e " +livro3.getAnoPublicacao()+ "é o ano em que foi publicado");
		System.out.println("O livro 3 tem : " +livro3.getNumeroPaginas()+ " paginas e a sua editora é : " +livro3.getEditora());
		
		System.out.println("A revista 1 tem : " +revista1.getNumeroEdicao()+ " e a seu mês de publicação é : " +revista1.getMesPublicacao());
		System.out.println("A revista 2 tem : " +revista2.getNumeroEdicao()+ " e a seu mês de publicação é : " +revista2.getMesPublicacao());
		System.out.println("A revista 3 tem : " +revista3.getNumeroEdicao()+ " e a seu mês de publicação é : " +revista3.getMesPublicacao());

		
	}

}
