package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class WaterTankDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* Constructor for jdbcTemplate */
	public WaterTankDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* List */
	public List<WaterTank> list() {
		String sql = "SELECT * FROM ZBIORNIKI_WODNE";

		List<WaterTank> listWaterTank = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(WaterTank.class));
		return listWaterTank;
	}

	/* (C)reate */
	public void save(WaterTank watertank) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("ZBIORNIKI_WODNE").usingColumns("NR_ZBIORNIKA", "POJEMNOSC", "TEMPERATURA", "TYP_ZBIORNIKA", "ILOSC_MIEJSC", "NR_ATRAKCJI", "NR_OCEANARIUM");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(watertank);
		insertActor.execute(param);

	}

	/* (R)ead */
	public WaterTank get(int id) {
		return null;
	}

	/* (U)pdate */
	public void update(WaterTank watertank) {

	}

	/* (D)elete */
	public void delete(int id) {

	}
}