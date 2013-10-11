package persistencia;

import modelo.Aluno;

import org.hibernate.Session;

public class AlunoDAO {
	private Session session;
	public AlunoDAO(Session session) {
		this.session = session;
	}
	
	public void inserir(Aluno aluno){
		this.session.save(aluno);
	}
	
	public void alterar(Aluno aluno){
		this.session.update(aluno);
		this.session.flush();
	}
	
	public void excluir (Aluno aluno){
		this.session.delete(aluno);
		this.session.flush();
	}
	
	public Aluno pesquisar(String matricula){
		return (Aluno) this.session.load(Aluno.class, matricula);
	}

}
