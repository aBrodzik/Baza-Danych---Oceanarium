package bdbt;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

class EmployeeDAOTest {
	
	private EmployeeDAO dao;

	@BeforeEach
	void setUp() throws Exception {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl1");
		datasource.setUsername("URTY");
		datasource.setPassword("Hipster12");
		datasource.setDriverClassName("oracle.jdbc.OracleDriver");
		
		dao = new EmployeeDAO(new JdbcTemplate(datasource));
	}

	@Test
	void testList() {
		
		List<Employee> listEmployee = dao.list();
		assertFalse(listEmployee.isEmpty());
	}

	@Test
	void testSave() {
		Employee employee = new Employee(14, "Mareczek", "Bogdan", "2000.12.12", "12351212213", 1, 14, 3);
		dao.save(employee);
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
