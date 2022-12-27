package twitter.tweetingapp.tweetapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import  twitter.tweetingapp.tweetapp.domain.Tweets;
import  twitter.tweetingapp.tweetapp.service.TweetService;
import twitter.tweetingapp.tweetapp.service.TweetService;

import java.util.List;


@RestController
public class TweetController {

    @Autowired
    private TweetService tweetService;


    @PostMapping("/Tweet")
    public String postTweet(@RequestBody @NonNull Tweets tweet){

       // if(tweet == null) throw new IllegalArgumentException("tweet cannot be null");

         String res =   tweetService.postTweets(tweet);

         if(res == null) throw new IllegalStateException("tweet returned null");
         return res;
    }

    @GetMapping("/Tweet")
    public List<Tweets> getTweets(){
        return tweetService.getAllTweets();
    }

}
