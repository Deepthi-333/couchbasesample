package com.example.couchbasesample;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CouchbaseRepository<UserEntity, String> {

    List<UserEntity> findByEmailLike(String email);
}