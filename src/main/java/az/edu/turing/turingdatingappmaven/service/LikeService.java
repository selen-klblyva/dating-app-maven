package az.edu.turing.turingdatingappmaven.service;

import az.edu.turing.turingdatingappmaven.entity.Like;
import az.edu.turing.turingdatingappmaven.repository.LikeRepository;

import java.util.List;

public class LikeService {
    LikeRepository likeRepository;


    //todo add dislike method

    public void likeUser(Long likeSenderId, Long likeReceiverId) {
        Like like = new Like();
        like.setLikeSenderId(likeSenderId);
        like.setLikeReceiverId(likeReceiverId);
        likeRepository.save(like);
        //todo show next user from Database
    }

    public List<Like> getLikesReceived(Long likeReceiverId) {
        return likeRepository.findByLikedUser(likeReceiverId);
    }
}
