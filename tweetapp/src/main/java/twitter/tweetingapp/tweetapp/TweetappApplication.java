package twitter.tweetingapp.tweetapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@EnableCaching

public class TweetappApplication {

	public static void main(String[] args) {
		SpringApplication.run(TweetappApplication.class, args);
	}

	@KafkaListener(topics = "tweets", groupId = "tweetgroup")
	public void listen(String message){
		System.out.println("kafka listener message"+message);
	}



}
