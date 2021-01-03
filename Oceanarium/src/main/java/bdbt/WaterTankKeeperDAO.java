package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class WaterTankKeeperDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public WaterTankKeeperDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
	
	/* List */
	public List<WaterTankKeeper> list() {
		String sql = "SELECT * FROM OPIEKUNOWIE_ZBIORNIKI_WODNE";
		List<WaterTankKeeper> listWaterTankKeeper = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(WaterTankKeeper.class));
		return listWaterTankKeeper;
	}

	/* (C)reate */
	public void save(WaterTankKeeper waterTankKeeper) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("OPIEKUNOWIE_ZBIORNIKI_WODNE").usingColumns("NR_PRACOWNIKA","NR_ZBIORNIKA");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(waterTankKeeper);
		insertActor.execute(param);
	}

	/* (R)ead */
	public WaterTankKeeper get(int id) {
		return null;
	}

	/* (U)pdate */
	public void update(WaterTankKeeper waterTankKeeper) {

	}

	/* (D)delete */
	public void delete(int id) {

	}
	
	
	
	
	
	
	
	
	
	
}
