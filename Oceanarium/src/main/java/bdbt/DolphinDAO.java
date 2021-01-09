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
public class DolphinDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public DolphinDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	/* List */
	public List<Dolphin> list() {
		String sql = "SELECT * FROM DELFINY";
		List<Dolphin> listDolphin = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Dolphin.class));
		return listDolphin;
	}

	/* (C)reate */
	public void save(Dolphin dolphin) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("DELFINY").usingColumns("NR_ZWIERZECIA","ILOSC_W_ZBIORNIKU","INTERAKCJA_Z_KLIENTAM","CZY_WYSTEPY");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(dolphin);
		insertActor.execute(param);
	}

	/* (R)ead */
	public Dolphin get(int id) {
		Object[] args = {id};
		String sql = "SELECT * FROM DELFINY WHERE NR_ZWIERZECIA =" + args[0];
		Dolphin dolphin = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Dolphin.class));
		return dolphin;
	}

	/* (U)pdate */
	public void update(Dolphin dolphin) {
		String sql = "UPDATE DELFINY SET  ilosc_w_zbiorniku=:ilosc_w_zbiorniku, interakcja_z_klientam=:interakcja_z_klientam, czy_wystepy=:czy_wystepy WHERE nr_zwierzecia=:nr_zwierzecia";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(dolphin);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql,param);

	}

	/* (D)delete */
	public void delete(int nr_zwierzecia) {
		String sql = "DELETE FROM DELFINY WHERE NR_ZWIERZECIA =?";
		jdbcTemplate.update(sql,nr_zwierzecia);
	}
}
