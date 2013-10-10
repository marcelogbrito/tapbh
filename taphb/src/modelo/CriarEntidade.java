package modelo;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class CriarEntidade {
	public static void main(String[] args) {
		
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		AnnotationConfiguration configure = configuration.configure();
		configure.addAnnotatedClass(Aluno.class);
		
		SchemaExport esqe = new SchemaExport(configure);
		esqe.create(true, false);
	}

}
