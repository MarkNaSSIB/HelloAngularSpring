package com.NaSSIB.HelloAngularSpring.HelloAngularSpring.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.NaSSIB.HelloAngularSpring.HelloAngularSpring.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
