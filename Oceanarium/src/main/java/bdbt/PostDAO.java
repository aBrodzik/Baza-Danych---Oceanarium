package bdbt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
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
		return null;
	}

	/* (U)pdate */
	public void update(Post post) {

	}

	/* (D)delete */
	public void delete(int id) {

	}

}
