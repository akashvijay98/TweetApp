package twitter.tweetingapp.tweetapp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import  twitter.tweetingapp.tweetapp.domain.Tweets;
import  twitter.tweetingapp.tweetapp.repository.TweetRepository;
import twitter.tweetingapp.tweetapp.repository.TweetRepository;

import java.util.List;

@Service
public class TweetService {

    private final TweetRepository tweet;



    TweetService(TweetRepository tweet){
        this.tweet=tweet;
    }


    @Transactional
    public String postTweets(Tweets tweetInfo){
        
        tweet.save(tweetInfo);


        return "post initiated";
    }

    @Transactional
    public List<Tweets> getAllTweets(){

        return tweet.findAll();
    }

}
