package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* Constructor for jdbcTemplate */
	public EmployeeDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* List */
	public List<Employee> list() {
		String sql = "SELECT * FROM PRACOWNICY";

		List<Employee> listEmployee = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Employee.class));
		return listEmployee;
	}

	/* (C)reate */
	public void save(Employee employee) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("PRACOWNICY").usingColumns("NR_PRACOWNIKA", "IMIE", "NAZWISKO", "DATA_URODZENIA", "PESEL", "NR_OCEANARIUM", "NR_ADRESU", "NR_STANOWISKA");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(employee);
		insertActor.execute(param);

	}

	/* (R)ead */
	public Employee get(int id) {
		Object[] args = { id };
		String sql = "SELECT * FROM PRACOWNICY WHERE NR_PRACOWNIKA =" + args[0];
		Employee employee = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Employee.class));

		return employee;
	}

	/* (U)pdate */
	public void update(Employee employee) {
		String sql = "UPDATE PRACOWNICY SET imie=:imie, nazwisko=:nazwisko, data_urodzenia=TO_DATE(:data_urodzenia,'yyyy-mm-dd HH24:MI:SS'), pesel=:pesel, nr_oceanarium=:nr_oceanarium, nr_adresu=:nr_adresu, nr_stanowiska=:nr_stanowiska WHERE nr_pracownika=:nr_pracownika";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(employee);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

		template.update(sql, param);

	}

	/* (D)elete */
	public void delete(int nr_pracownika) {
		String sql = "DELETE FROM PRACOWNICY WHERE NR_PRACOWNIKA = ?";
		jdbcTemplate.update(sql, nr_pracownika);
	}
}
