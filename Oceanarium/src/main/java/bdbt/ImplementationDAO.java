package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class ImplementationDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* Constructor for jdbcTemplate */
	public ImplementationDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* List */
	public List<Implementation> list() {
		String sql = "SELECT * FROM REALIZACJE";

		List<Implementation> listImplementation = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Implementation.class));
		return listImplementation;
	}

	/* (C)reate */
	public void save(Implementation implementation) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("REALIZACJE").usingColumns("NR_REALIZACJI", "CENA", "DATA", "NR_ATRAKCJI");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(implementation);
		insertActor.execute(param);

	}

	/* (R)ead */
	public Implementation get(int id) {
		return null;
	}

	/* (U)pdate */
	public void update(Implementation implementation) {

	}

	/* (D)elete */
	public void delete(int id) {

	}
}