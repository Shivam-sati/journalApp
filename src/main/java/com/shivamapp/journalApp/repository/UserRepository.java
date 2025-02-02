package com.shivamapp.journalApp.repository;

import com.shivamapp.journalApp.entity.JournalEntry;
import com.shivamapp.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String userName);

    void deleteByUserName(String username);
}
