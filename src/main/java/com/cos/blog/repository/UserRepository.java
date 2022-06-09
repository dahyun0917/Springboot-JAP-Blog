package com.cos.blog.repository;

import com.cos.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//DAO
//자동으로 bean등록이 된다
//@Repository //생략 가능하다.
public interface UserRepository extends JpaRepository<User,Integer> {
    // SELECT * FROM user WHERE username=1?
    Optional<User> findByUsername(String username);
}

//JPA Naming 쿼리
//select * from user where username=? and password=?
//    User findByUsernameAndPassword(String username, String password);

//    @Query(value="SELECT * from user where username=? AND password=?",nativeQuery = true)
//    User login(String username, String password);
