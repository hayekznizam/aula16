
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.recibo.cidade.Cidade;
import br.com.db1.recibo.cidade.UF;

public class CidadeTest {

	EntityManager em;

	@Before
	public void setUp() {
		EntityManagerFactory efm = Persistence.createEntityManagerFactory("db1start");
		em = efm.createEntityManager();
		em.getTransaction().begin();

	}

	@After
	public void after() {

		em.getTransaction().commit();
		em.close();

	}

	/*@Test
	public void deveSalvarUmaNovaCidade() {

		Cidade cidade = new Cidade("Cascavel", UF.PR);

		em.persist(cidade);

	}*/

	@Test
	public void deveAlterarCidade() {

		Query query = (Query) em.createQuery("select c from Cidade c where c.nome = :pNome");
		query.setParameter("pNome", "Cascavel");
		query.setMaxResults(1);
		Cidade cidade = (Cidade) query.getSingleResult();

		cidade.alteraNome("Mandaguari");

	}

}
