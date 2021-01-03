package bdbt;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class AttractionDAOTest {

	
private AttractionDAO dao;
	
	@BeforeEach
	void setUp() throws Exception {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		datasource.setUsername("ABRODZIK");
		datasource.setPassword("123");
		datasource.setDriverClassName("oracle.jdbc.OracleDriver");
		
		dao = new AttractionDAO (new JdbcTemplate(datasource));
		
	}
	@Test
	void testList() {
		List<Attraction> listAttraction = dao.list();
		assertFalse(listAttraction.isEmpty());
	}

	@Test
	void testSave() {
		Attraction attraction = new Attraction(0,"aaaa","bbb",4);
		dao.save(attraction);
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
