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
public class PositionDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* Constructor for jdbcTemplate */
	public PositionDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* List */
	public List<Position> list() {
		String sql = "SELECT * FROM STANOWISKA";

		List<Position> listPosition = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Position.class));
		return listPosition;
	}

	/* (C)reate */
	public void save(Position position) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("STANOWISKA").usingColumns("NR_STANOWISKA", "NAZWA_STANOWISKA", "OPIS");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(position);
		insertActor.execute(param);

	}

	/* (R)ead */
	public Position get(int id) {
		Object[] args = {id};
		String sql = "SELECT * FROM STANOWISKA WHERE NR_STANOWISKA =" + args[0];
		Position position = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Position.class));
		return position;
	}


	/* (U)pdate */
	public void update(Position position) {
		String sql = "UPDATE STANOWISKA SET  nazwa_stanowiska=:nazwa_stanowiska, opis=:opis WHERE nr_stanowiska=:nr_stanowiska";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(position);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql,param);

	}


	/* (D)delete */
	public void delete(int nr_stanowiska) {
		String sql = "DELETE FROM STANOWISKA WHERE NR_STANOWISKA =?";
		jdbcTemplate.update(sql, nr_stanowiska);

	}
}