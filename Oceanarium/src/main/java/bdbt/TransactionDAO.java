package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* Constructor for jdbcTemplate */
	public TransactionDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* List */
	public List<Transaction> list() {
		String sql = "SELECT * FROM TRANSAKCJE";

		List<Transaction> listTransaction = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Transaction.class));
		return listTransaction;
	}

	/* (C)reate */
	public void save(Transaction transaction) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("TRANSAKCJE").usingColumns("NR_KLIENTA", "NR_REALIZACJI", "DATA_ZAKUPU", "CZY_FAKTURA");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(transaction);
		insertActor.execute(param);

	}

	/* (R)ead */
	public Transaction get(int id) {
		return null;
	}

	/* (U)pdate */
	public void update(Transaction transaction) {

	}

	/* (D)elete */
	public void delete(int id) {

	}
}