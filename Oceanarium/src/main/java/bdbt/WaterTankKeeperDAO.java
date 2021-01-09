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
	public WaterTankKeeper get(int p, int z) {
		Object[] args = {p,z};
		String sql = "SELECT * FROM OPIEKUNOWIE_ZBIORNIKI_WODNE WHERE NR_PRACOWNIKA=" + args[0] +" AND NR_ZBIORNIKA=" + args[1]+" FETCH NEXT 1 ROWS ONLY";
		WaterTankKeeper waterTankKeeper = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(WaterTankKeeper.class));
		return waterTankKeeper;
	}

	/* (U)pdate */
	public void update(WaterTankKeeper waterTankKeeper, int z) {
		String sql = "UPDATE OPIEKUNOWIE_ZBIORNIKI_WODNE SET nr_zbiornika=:nr_zbiornika WHERE nr_pracownika=:nr_pracownika AND NR_ZBIORNIKA ="+z;
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(waterTankKeeper);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql,param);
	}

	/* (D)delete */
	public void delete(int nr_pracownika, int nr_zbiornika) {
		String sql = "DELETE FROM OPIEKUNOWIE_ZBIORNIKI_WODNE WHERE NR_PRACOWNIKA =? AND NR_ZBIORNIKA=?";
		jdbcTemplate.update(sql,nr_pracownika,nr_zbiornika);
	}
	
	
	
	
	
	
	
	
	
	
}
