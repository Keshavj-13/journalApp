package net.engineeringdigest.journalApp.Service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {
    @Autowired
    private UserRepo userrepo;

    public void saveEntry(User user){
        userrepo.save(user);
    }

    public List<User> getAll(){
        return userrepo.findAll();
    }

    public Optional<User> findById(Long id){
        return userrepo.findById(id);
    }

    public void deleteById(Long id){
        userrepo.deleteById(id);
    }

    public User findByUserName(String userName){
        return userrepo.findByUsername(userName);
    }
}
