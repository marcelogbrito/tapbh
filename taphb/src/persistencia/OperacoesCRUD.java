package persistencia;

import org.hibernate.Session;

import modelo.Aluno;

public class OperacoesCRUD {
	
	public static void main(String[] args) {
		    Aluno a = new Aluno();        
	        Session session = new  Secao().getSession();
	        AlunoDAO ad = new AlunoDAO(session);
	        
		//Código para inserção

	        a.setMatricula("123");
	        a.setNome("Nome 1");
	        a.setCidade("Cidade 1");
	        a.setEstado("DF");
	        a.setPais("BR");
	        session.beginTransaction();
	        ad.inserir(a);
	        session.getTransaction().commit();
	        session.close();
	//Código para alteração
     
	        a.setMatricula("123");
	        a.setNome("Nome 1 alterado");
	        a.setCidade("Cidade 1");
	        a.setEstado("DF");
	        a.setPais("BR");       
	        session.beginTransaction();
	        ad.alterar(a);
	        session.getTransaction().commit();
	        session.close();

	//Código para pesquisar

	        a = ad.pesquisar("123");
	        System.out.println(a.getNome());        
	        session.close();
	        
	        
			//Código para excluir
     
	        a.setMatricula("123");        
	        session.beginTransaction();
	        ad.excluir(a);
	        session.getTransaction().commit();
	        session.close();
	}

}
