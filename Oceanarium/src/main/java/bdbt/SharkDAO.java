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
public class SharkDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* Constructor for jdbcTemplate */
	public SharkDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* List */
	public List<Shark> list() {
		String sql = "SELECT * FROM REKINY";

		List<Shark> listShark = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Shark.class));
		return listShark;
	}

	/* (C)reate */
	public void save(Shark shark) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("REKINY").usingColumns("NR_ZWIERZECIA", "ILOSC_W_ZBIORNIKU", "RODZAJ", "WIELKOSC");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(shark);
		insertActor.execute(param);

	}

	/* (R)ead */
	public Shark get(int id) {
		Object[] args = {id};
		String sql = "SELECT * FROM REKINY WHERE NR_ZWIERZECIA =" + args[0];
		Shark shark = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Shark.class));
		return shark;
	}

	/* (U)pdate */
	public void update(Shark shark) {
		String sql = "UPDATE REKINY SET  ilosc_w_zbiorniku=:ilosc_w_zbiorniku, rodzaj=:rodzaj, wielkosc=:wielkosc WHERE nr_zwierzecia=:nr_zwierzecia";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(shark);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql,param);

	}

	/* (D)delete */
	public void delete(int nr_zwierzecia) {
		String sql = "DELETE FROM REKINY WHERE NR_ZWIERZECIA =?";
		jdbcTemplate.update(sql,nr_zwierzecia);
	}
}