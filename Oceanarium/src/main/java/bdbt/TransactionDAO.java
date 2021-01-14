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
	public Transaction get(int p, int z) {
		Object[] args = {p,z};
		String sql = "SELECT * FROM TRANSAKCJE WHERE NR_KLIENTA=" + args[0] +" AND NR_REALIZACJI=" + args[1]+" FETCH NEXT 1 ROWS ONLY";
		Transaction transaction = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Transaction.class));
		return transaction;
	}

	/* (U)pdate */
	public void update(Transaction transaction, int z) {
		String sql = "UPDATE TRANSAKCJE SET nr_klienta=:nr_klienta, data_zakupu=TO_DATE(:data_zakupu,'yyyy-mm-dd HH24:MI:SS'), czy_faktura=:czy_faktura WHERE nr_realizacji=:nr_realizacji";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(transaction);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql,param);
	}

	/* (D)delete */
	public void delete(int nr_klienta, int nr_realizacji) {
		String sql = "DELETE FROM TRANSAKCJE WHERE NR_KLIENTA =? AND NR_REALIZACJI=?";
		jdbcTemplate.update(sql,nr_klienta,nr_realizacji);
	}
}