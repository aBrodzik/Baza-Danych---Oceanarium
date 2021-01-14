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
public class ImplementationDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* Constructor for jdbcTemplate */
	public ImplementationDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* List */
	public List<Implementation> list() {
		String sql = "SELECT * FROM REALIZACJE";

		List<Implementation> listImplementation = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Implementation.class));
		return listImplementation;
	}

	/* (C)reate */
	public void save(Implementation implementation) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("REALIZACJE").usingColumns("NR_REALIZACJI", "CENA", "DATA", "NR_ATRAKCJI");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(implementation);
		insertActor.execute(param);

	}

	/* (R)ead */
	public Implementation get(int id) {
		Object[] args = {id};
		String sql = "SELECT * FROM REALIZACJE WHERE NR_REALIZACJI =" + args[0];
		Implementation implementation = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Implementation.class));
		return implementation;
	}


	/* (U)pdate */
	public void update(Implementation implementation) {
		String sql = "UPDATE REALIZACJE SET  cena=:cena, data=TO_DATE(:data,'yyyy-mm-dd HH24:MI:SS'), nr_atrakcji=:nr_atrakcji WHERE nr_realizacji=:nr_realizacji";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(implementation);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql,param);

	}


	/* (D)delete */
	public void delete(int nr_realizacji) {
		String sql = "DELETE FROM REALIZACJE WHERE NR_REALIZACJI =?";
		jdbcTemplate.update(sql, nr_realizacji);

	}
}