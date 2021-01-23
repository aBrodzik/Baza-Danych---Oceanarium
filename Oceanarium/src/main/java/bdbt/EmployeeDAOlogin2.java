package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOlogin2 {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* Constructor for jdbcTemplate */
	public EmployeeDAOlogin2(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* List */
	public List<Employeelogin2> list() {
		String sql = "SELECT * FROM (SELECT ROWNUM r, PRACOWNICY.* FROM PRACOWNICY) WHERE r=2";

		List<Employeelogin2> listEmployeelogin2 = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Employeelogin2.class));
		return listEmployeelogin2;
	}
}