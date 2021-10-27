package com.se452project.libraryWebApp.member;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface MemberRepository extends MongoRepository<Member, String > {
    List findByID(String memberID);
}
