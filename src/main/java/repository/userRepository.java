package repository;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public class userRepository {
	@Repository
	public interface UserRepository extends CrudRepository<User, Long> {
		User findByUsername(String username);
	}

}
