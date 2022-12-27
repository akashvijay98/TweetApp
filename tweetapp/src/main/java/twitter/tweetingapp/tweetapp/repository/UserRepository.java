package twitter.tweetingapp.tweetapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import  twitter.tweetingapp.tweetapp.domain.Users;

import java.util.UUID;
@Repository
public interface UserRepository  extends JpaRepository<Users, UUID> {

}
