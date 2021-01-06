package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* Constructor for jdbcTemplate */
	public PaymentDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* List */
	public List<Payment> list() {
		String sql = "SELECT * FROM WYNAGRODZENIA";

		List<Payment> listPayment = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Payment.class));
		return listPayment;
	}

	/* (C)reate */
	public void save(Payment payment) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("WYNAGRODZENIA").usingColumns("NR_WYNAGRODZENIA", "DATA_WYNAGRODZENIA", "KWOTA_POD", "KWOTA_DOD", "NR_PRACOWNIKA");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(payment);
		insertActor.execute(param);

	}

	/* (R)ead */
	public Payment get(int id) {
		return null;
	}

	/* (U)pdate */
	public void update(Payment payment) {

	}

	/* (D)elete */
	public void delete(int id) {

	}
}