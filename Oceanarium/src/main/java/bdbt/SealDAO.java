package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class SealDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public SealDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	/* List */
	public List<Seal> list() {
		String sql = "SELECT * FROM FOKI";
		List<Seal> listSeal = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Seal.class));
		return listSeal;
	}

	/* (C)reate */
	public void save(Seal seal) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("FOKI").usingColumns("NR_ZWIERZECIA","CZY_WYSTEPY","ILOSC_W_ZBIORNIKU");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(seal);
		insertActor.execute(param);
	}

	/* (R)ead */
	public Seal get(int id) {
		return null;
	}

	/* (U)pdate */
	public void update(Seal seal) {

	}

	/* (D)delete */
	public void delete(int id) {

	}
}
