package persistencia;

import modelo.Aluno;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Secao {
	
	private static SessionFactory factory;
	
	public Secao() {
		AnnotationConfiguration config = new AnnotationConfiguration();
		AnnotationConfiguration configure = config.configure();
		configure.addAnnotatedClass(Aluno.class);
		factory = configure.buildSessionFactory();
		
	}
	
	public static Session getSession(){
		return factory.openSession();
	}
	

}
