package com.example.hibernateelementcollectiondemo.repository;

import com.example.hibernateelementcollectiondemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rajeevkumarsingh on 22/11/17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
