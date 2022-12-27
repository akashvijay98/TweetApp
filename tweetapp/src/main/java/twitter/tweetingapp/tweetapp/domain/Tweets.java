package twitter.tweetingapp.tweetapp.domain;

import jakarta.persistence.*;

import java.util.UUID;
@Entity
@Table(name = "tweets")
public class Tweets {
    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "tweet_id")
    private UUID tweetId;
    @Column(name = "user_id")
    private UUID userId;
    private String tweet;



    public UUID getTweetId() {
        return tweetId;
    }

    public void setTweetId(UUID tweetId) {
        this.tweetId = tweetId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }
}
