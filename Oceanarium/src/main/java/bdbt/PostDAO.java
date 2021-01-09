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
public class PostDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public PostDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/* List */
	public List<Post> list() {
		String sql = "SELECT * FROM POCZTY";
		List<Post> listPost = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Post.class));
		return listPost;
	}

	/* (C)reate */
	public void save(Post post) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("POCZTY").usingColumns("KOD_POCZTY","POCZTA");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(post);
		insertActor.execute(param);
	}

	/* (R)ead */
	public Post get(int id) {
		Object[] args = {id};
		String sql = "SELECT * FROM POCZTY WHERE NR_POCZTY =" + args[0];
		Post post = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Post.class));
		return post;
	}

	/* (U)pdate */
	public void update(Post post) {
		String sql = "UPDATE POCZTY SET  kod_poczty=:kod_poczty, poczta=:poczta WHERE nr_poczty=:nr_poczty";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(post);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql,param);

	}

	/* (D)delete */
	public void delete(int nr_poczty) {
		String sql = "DELETE FROM POCZTY WHERE nr_poczty= ?";
		jdbcTemplate.update(sql,nr_poczty);
	}

}
