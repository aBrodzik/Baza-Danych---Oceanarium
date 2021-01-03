package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class DolphinDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public DolphinDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	/* List */
	public List<Dolphin> list() {
		String sql = "SELECT * FROM DELFINY";
		List<Dolphin> listDolphin = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Dolphin.class));
		return listDolphin;
	}

	/* (C)reate */
	public void save(Dolphin dolphin) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("DELFINY").usingColumns("NR_ZWIERZECIA","ILOSC_W_ZBIORNIKU","INTERAKCJA_Z_KLIENTAM","CZY_WYSTEPY");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(dolphin);
		insertActor.execute(param);
	}

	/* (R)ead */
	public Dolphin get(int id) {
		return null;
	}

	/* (U)pdate */
	public void update(Dolphin dolphin) {

	}

	/* (D)delete */
	public void delete(int id) {

	}
}
