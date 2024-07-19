package az.edu.turing.turingdatingappmaven.service;

import az.edu.turing.turingdatingappmaven.entity.Like;
import az.edu.turing.turingdatingappmaven.entity.User;
import az.edu.turing.turingdatingappmaven.repository.LikeRepository;
import az.edu.turing.turingdatingappmaven.repository.UserRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class UserService {

    UserRepository userRepository;
    LikeRepository likeRepository;
    User user;
    UserService userService;

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User getRandomUser(Long currentUserId) {
        List<User> users = (List<User>) userRepository.findAll().stream()
                .filter(user -> !this.user.getId().equals(currentUserId))
                .collect(Collectors.toList());

        if (users.isEmpty()) {
            return null;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(users.size());
        return users.get(randomIndex);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}


