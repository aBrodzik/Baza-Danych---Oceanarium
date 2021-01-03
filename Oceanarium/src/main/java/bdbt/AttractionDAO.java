package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
@Repository
public class AttractionDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public AttractionDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* List */
	public List<Attraction> list() {
		String sql = "SELECT * FROM ATRAKCJE";
		List<Attraction> listAttraction = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Attraction.class));
		return listAttraction;
	}

	/* (C)reate */
	public void save(Attraction attraction) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("ATRAKCJE").usingColumns("NAZWA", "OPIS", "NR_OCEANARIUM");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(attraction);
		insertActor.execute(param);
	}

	/* (R)ead */
	public Adress get(int id) {
		return null;
	}

	/* (U)pdate */
	public void update(Attraction attraction) {

	}

	/* (D)delete */
	public void delete(int id) {

	}

}
