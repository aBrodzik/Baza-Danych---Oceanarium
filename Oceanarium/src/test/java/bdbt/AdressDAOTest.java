package bdbt;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

class AdressDAOTest {

	private AdressDAO dao;
	
	@BeforeEach
	void setUp() throws Exception {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		datasource.setUsername("ABRODZIK");
		datasource.setPassword("123");
		datasource.setDriverClassName("oracle.jdbc.OracleDriver");
		
		dao = new AdressDAO (new JdbcTemplate(datasource));
		
	}

	@Test
	void testList() {
		List<Adress> listAdress = dao.list();
		assertFalse(listAdress.isEmpty());
	}

	@Test
	void testSave() {
		Adress adress = new Adress(0,"aaaa","bbb","4",4);
		dao.save(adress);
	}

	@Test
	void testGet() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

}
