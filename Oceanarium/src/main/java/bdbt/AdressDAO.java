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
public class AdressDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* constructor */
	public AdressDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* List */
	public List<Adress> list() {
		String sql = "SELECT * FROM ADRESY";
		List<Adress> listAdress = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Adress.class));
		return listAdress;
	}

	/* (C)reate */
	public void save(Adress adress) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("ADRESY").usingColumns("MIASTO","ULICA","NR_LOKALU","NR_POCZTY");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(adress);
		insertActor.execute(param);
	}

	/* (R)ead */
	public Adress get(int id) {
		Object[] args = {id};
		String sql = "SELECT * FROM ADRESY WHERE NR_ADRESU =" + args[0];
		Adress adress = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Adress.class));
		return adress;
	}

	/* (U)pdate */
	public void update(Adress adress) {
		String sql = "UPDATE ADRESY SET  miasto=:miasto, ulica=:ulica, nr_lokalu=:nr_lokalu, nr_poczty=:nr_poczty WHERE nr_adresu=:nr_adresu";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(adress);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql,param);

	}

	/* (D)delete */
	public void delete(int id) {
		String sql = "DELETE FROM ADRESY WHERE NR_ADRESU =?";
		jdbcTemplate.update(sql,id);
		

	}

}
