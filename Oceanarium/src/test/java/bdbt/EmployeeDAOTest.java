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
		int id = 41;
		Employee employee = dao.get(id);
		
		assertNotNull(employee);
	}

	@Test
	void testUpdate() {
		Employee employee = new Employee();
		employee.setNr_pracownika(41);
		employee.setImie("Chrom");
		employee.setNazwisko("Stonog");
		employee.setData_urodzenia("2000.10.10");
		employee.setPesel("1231213131");
		employee.setNr_oceanarium(1);
		employee.setNr_adresu(5);
		employee.setNr_stanowiska(1);
		
		dao.update(employee);
		
	}

	@Test
	void testDelete() {
		int nr_pracownika = 41;
		dao.delete(nr_pracownika);
	}

}
