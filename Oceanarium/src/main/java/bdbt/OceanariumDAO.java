package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class OceanariumDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* constructor */
	public OceanariumDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/* List */
	public List<Oceanarium> list() {
		String sql = "SELECT * FROM OCEANARIA";
		List<Oceanarium> listOceanarium = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Oceanarium.class));
		return listOceanarium;
	}

	/* (C)reate */
	public void save(Oceanarium oceanarium) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("OCEANARIA").usingColumns("NAZWA","NR_ADRESU");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(oceanarium);
		insertActor.execute(param);
	}

	/* (R)ead */
	public Oceanarium get(int id) {
		return null;
	}

	/* (U)pdate */
	public void update(Oceanarium oceanarium) {

	}

	/* (D)delete */
	public void delete(int id) {

	}

	
}
