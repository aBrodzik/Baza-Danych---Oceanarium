package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOlogin {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* Constructor for jdbcTemplate */
	public EmployeeDAOlogin(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* List */
	public List<Employeelogin> list() {
		String sql = "SELECT * FROM PRACOWNICY WHERE ROWNUM = 1";

		List<Employeelogin> listEmployeelogin = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Employeelogin.class));
		return listEmployeelogin;
	}
}