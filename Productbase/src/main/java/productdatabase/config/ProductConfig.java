package productdatabase.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages  = {"productdatabase"})
public class ProductConfig {
	@Bean
	public EntityManager getEntityManager() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ranjith");
	EntityManager em = emf.createEntityManager();
	return em;
	}

}
