package com.spring.redditclone.application.repository;

import com.spring.redditclone.application.model.Post;
import com.spring.redditclone.application.model.User;
import com.spring.redditclone.application.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository   extends JpaRepository<Vote, Long> {

    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User user);

}
