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
	public Attraction get(int id) {
		Object[] args = {id};
		String sql = "SELECT * FROM ATRAKCJE WHERE NR_ATRAKCJI =" + args[0];
		Attraction attraction = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Attraction.class));
		return attraction;
	}

	/* (U)pdate */
	public void update(Attraction attraction) {
		String sql = "UPDATE ATRAKCJE SET  nazwa=:nazwa, opis=:opis, nr_oceanarium=:nr_oceanarium WHERE nr_atrakcji=:nr_atrakcji";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(attraction);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql,param);

	}

	/* (D)delete */
	public void delete(int nr_atrakcji) {
		String sql = "DELETE FROM ATRAKCJE WHERE NR_ATRAKCJI =?";
		jdbcTemplate.update(sql,nr_atrakcji);
	}

}
