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
		Object[] args = {id};
		String sql = "SELECT * FROM KLIENCI WHERE NR_KLIENTA =" + args[0];
		Client client = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Client.class));
		return client;
	}

	/* (U)pdate */
	public void update(Client client) {
		String sql = "UPDATE KLIENCI SET  imie=:imie, nazwisko=:nazwisko, nr_telefonu=:nr_telefonu, plec=:plec, data_urodzenia=TO_DATE(:data_urodzenia,'yyyy-mm-dd HH24:MI:SS'), nr_oceanarium=:nr_oceanarium, nr_adresu=:nr_adresu WHERE nr_klienta=:nr_klienta";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(client);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql,param);

	}

	/* (D)delete */
	public void delete(int nr_klienta) {
		String sql = "DELETE FROM KLIENCI WHERE NR_KLIENTA =?";
		jdbcTemplate.update(sql,nr_klienta);
	}

}
