package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public ClientDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/* List */
	public List<Client> list() {
		String sql = "SELECT * FROM KLIENCI";
		List<Client> listClient = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Client.class));
		return listClient;
	}
	
	/* (C)reate */
	public void save(Client client) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("KLIENCI").usingColumns("IMIE","NAZWISKO","NR_TELEFONU","PLEC","DATA_URODZENIA","NR_OCEANARIUM","NR_ADRESU");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(client);
		insertActor.execute(param);
	}
	
	/* (R)ead */
	public Client get(int id) {
		return null;
	}

	/* (U)pdate */
	public void update(Client client) {

	}

	/* (D)delete */
	public void delete(int id) {

	}

}
