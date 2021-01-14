package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AcctTransactionDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public AcctTransactionDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* List */
	public List<AcctTransaction> list() {
		String sql = "SELECT NAZWA, IMIE, NAZWISKO, CENA, realizacje.data, DATA_ZAKUPU, CZY_FAKTURA FROM ATRAKCJE NATURAL JOIN KLIENCI NATURAL JOIN REALIZACJE NATURAL JOIN TRANSAKCJE";
		List<AcctTransaction> listAcctTransaction = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(AcctTransaction.class));
		return listAcctTransaction;
	}




}
