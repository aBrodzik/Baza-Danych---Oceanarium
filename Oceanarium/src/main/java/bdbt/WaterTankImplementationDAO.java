package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class WaterTankImplementationDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* Constructor for jdbcTemplate */
	public WaterTankImplementationDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* List */
	public List<WaterTankImplementation> list() {
		String sql = "SELECT * FROM ZBIORNIKI_WODNE_REALIZACJE";

		List<WaterTankImplementation> listWaterTankImplementation = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(WaterTankImplementation.class));
		return listWaterTankImplementation;
	}

	/* (C)reate */
	public void save(WaterTankImplementation watertankimplementation) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("ZBIORNIKI_WODNE_REALIZACJE").usingColumns("NR_ZBIORNIKA", "NR_REALIZACJI");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(watertankimplementation);
		insertActor.execute(param);

	}

	/* (R)ead */
	public WaterTankImplementation get(int id) {
		return null;
	}

	/* (U)pdate */
	public void update(WaterTankImplementation watertankimplementation) {

	}

	/* (D)elete */
	public void delete(int id) {

	}
}