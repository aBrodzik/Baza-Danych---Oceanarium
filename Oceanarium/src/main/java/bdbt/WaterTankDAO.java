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
		Object[] args = {id};
		String sql = "SELECT * FROM ZBIORNIKI_WODNE WHERE NR_ZBIORNIKA =" + args[0];
		WaterTank watertank = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(WaterTank.class));
		return watertank;
	}


	/* (U)pdate */
	public void update(WaterTank watertank) {
		String sql = "UPDATE ZBIORNIKI_WODNE SET  pojemnosc=:pojemnosc, temperatura=:temperatura, typ_zbiornika=:typ_zbiornika, ilosc_miejsc=:ilosc_miejsc, nr_atrakcji=:nr_atrakcji, nr_oceanarium=:nr_oceanarium WHERE nr_zbiornika=:nr_zbiornika";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(watertank);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql,param);

	}


	/* (D)delete */
	public void delete(int nr_zbiornika) {
		String sql = "DELETE FROM ZBIORNIKI_WODNE WHERE NR_ZBIORNIKA =?";
		jdbcTemplate.update(sql, nr_zbiornika);

	}
}