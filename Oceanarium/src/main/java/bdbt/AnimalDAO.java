package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class AnimalDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* Constructor for jdbcTemplate */
	public AnimalDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* List */
	public List<Animal> list() {
		String sql = "SELECT * FROM ZWIERZETA";

		List<Animal> listAnimal = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Animal.class));
		return listAnimal;
	}

	/* (C)reate */
	public void save(Animal animal) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("ZWIERZETA").usingColumns("NR_ZWIERZECIA", "NAZWA_GATUNKOWA", "WIEK", "CZY_DRAPIEZNE", "IMIE", "WAGA", "NR_ZBIORNIKA", "NR_OCEANARIUM");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(animal);
		insertActor.execute(param);

	}

	/* (R)ead */
	public Animal get(int id) {
		return null;
	}

	/* (U)pdate */
	public void update(Animal animal) {

	}

	/* (D)elete */
	public void delete(int id) {

	}
}
