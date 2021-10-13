package com.se452project.libraryWebApp.member;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberItemsLoanedRepository extends MongoRepository<MemberItemsLoaned, String> {
    List findByMembers(String memberId);
    List findByItem(String itemID);
}
