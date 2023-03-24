package com.catchtwobirds.soboro.user.repository;

import com.catchtwobirds.soboro.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(" SELECT u FROM User as u WHERE u.userId=:userId AND u.userActive=true")
    Optional<User> findByUserId(String userId);

    @Query(" SELECT u FROM User as u WHERE u.userName=:userName AND u.userActive=true")
    Optional<User> findByUserName(String userName);
}
