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
	public WaterTankImplementation get(int p, int z) {
		Object[] args = {p,z};
		String sql = "SELECT * FROM ZBIORNIKI_WODNE_REALIZACJE WHERE NR_ZBIORNIKA=" + args[0] +" AND NR_REALIZACJI=" + args[1]+" FETCH NEXT 1 ROWS ONLY";
		WaterTankImplementation watertankimplementation = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(WaterTankImplementation.class));
		return watertankimplementation;
	}

	/* (U)pdate */
	public void update(WaterTankImplementation watertankimplementation, int z) {
		String sql = "UPDATE ZBIORNIKI_WODNE_REALIZACJE SET nr_zbiornika=:nr_zbiornika WHERE nr_realizacji=:nr_realizacji AND NR_ZBIORNIKA ="+z;
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(watertankimplementation);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql,param);
	}

	/* (D)delete */
	public void delete(int nr_zbiornika, int nr_realizacji) {
		String sql = "DELETE FROM ZBIORNIKI_WODNE_REALIZACJE WHERE NR_ZBIORNIKA =? AND NR_REALIZACJI=?";
		jdbcTemplate.update(sql,nr_zbiornika,nr_realizacji);
	}
}