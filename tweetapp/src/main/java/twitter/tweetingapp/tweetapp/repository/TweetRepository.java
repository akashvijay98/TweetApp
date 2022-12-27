package twitter.tweetingapp.tweetapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import  twitter.tweetingapp.tweetapp.domain.Tweets;
import twitter.tweetingapp.tweetapp.domain.Tweets;

import java.util.UUID;
@Repository
public interface TweetRepository extends JpaRepository<Tweets, UUID> {



}
