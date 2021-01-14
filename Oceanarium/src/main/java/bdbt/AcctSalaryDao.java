package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AcctSalaryDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public AcctSalaryDao(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* List */
	public List<AcctSalary> list() {
		String sql = "SELECT NR_PRACOWNIKA, IMIE, NAZWISKO, DATA_WYNAGRODZENIA, KWOTA_POD, KWOTA_DOD, NAZWA_STANOWISKA FROM PRACOWNICY NATURAL JOIN WYNAGRODZENIA NATURAL JOIN STANOWISKA ";
		List<AcctSalary> listAcctSalary = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(AcctSalary.class));
		return listAcctSalary;
	}




}
