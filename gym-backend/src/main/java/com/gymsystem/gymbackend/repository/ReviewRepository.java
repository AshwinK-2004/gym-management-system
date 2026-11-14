package com.gymsystem.gymbackend.repository;

import com.gymsystem.gymbackend.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
<<<<<<< HEAD:gym-backend/src/main/java/com/gymsystem/gymbackend/repository/ReviewRepository.java
// Spring to interface give a  implementation
public interface ReviewRepository extends JpaRepository<Review, Integer> {
=======
public interface MemberRepository extends JpaRepository<Member, Integer> {

    Optional<Member> findByEmail(String email);

>>>>>>> main:gym-backend/src/main/java/com/gymsystem/gymbackend/repository/MemberRepository.java
}