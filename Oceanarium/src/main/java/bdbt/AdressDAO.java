package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class AdressDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* constructor */
	public AdressDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* List */
	public List<Adress> list() {
		String sql = "SELECT * FROM ADRESY";
		List<Adress> listAdress = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Adress.class));
		return listAdress;
	}

	/* (C)reate */
	public void save(Adress adress) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("ADRESY").usingColumns("MIASTO","ULICA","NR_LOKALU","NR_POCZTY");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(adress);
		insertActor.execute(param);
	}

	/* (R)ead */
	public Adress get(int id) {
		return null;
	}

	/* (U)pdate */
	public void update(Adress adress) {

	}

	/* (D)delete */
	public void delete(int id) {

	}

}
