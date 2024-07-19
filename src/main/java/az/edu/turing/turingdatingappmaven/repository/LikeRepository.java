package az.edu.turing.turingdatingappmaven.repository;

import az.edu.turing.turingdatingappmaven.entity.Like;
import az.edu.turing.turingdatingappmaven.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {
    List<Like> findByLikedUser(Long likeReceiverId);
}