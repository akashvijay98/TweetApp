package twitter.tweetingapp.tweetapp.service;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import  twitter.tweetingapp.tweetapp.domain.Users;
import  twitter.tweetingapp.tweetapp.repository.UserRepository;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository user;

    UserService(UserRepository user){
        this.user = user;
    }


    public  Users getUserDetails(UUID id){
        try {
            return user.findById(id).orElseThrow(ChangeSetPersister.NotFoundException::new);
        } catch (ChangeSetPersister.NotFoundException e) {
            throw new RuntimeException(e);
        }
        //return user.findAll();



    }

    public String postUserDetails(Users info){

        user.save(info);
        return "insert initiated";
    }

    public List<Users> getAllUsers(){
        return user.findAll();
    }

}
