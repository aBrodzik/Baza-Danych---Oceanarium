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
		Object[] args = {id};
		String sql = "SELECT * FROM WYNAGRODZENIA WHERE NR_WYNAGRODZENIA =" + args[0];
		Payment payment = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Payment.class));

		return payment;
	}

	/* (U)pdate */
	public void update(Payment payment) {
		String sql = "UPDATE WYNAGRODZENIA SET data_wynagrodzenia=TO_DATE(:data_wynagrodzenia,'yyyy-mm-dd HH24:MI:SS'), kwota_pod=:kwota_pod, kwota_dod=:kwota_dod, nr_pracownika=:nr_pracownika WHERE nr_wynagrodzenia=:nr_wynagrodzenia";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(payment);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

		template.update(sql, param);

	}

	/* (D)elete */
	public void delete(int nr_wynagrodzenia) {
		String sql = "DELETE FROM WYNAGRODZENIA WHERE NR_WYNAGRODZENIA =?";
		jdbcTemplate.update(sql, nr_wynagrodzenia);

	}
}