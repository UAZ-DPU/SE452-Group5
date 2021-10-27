package com.se452project.libraryWebApp.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/librarywebapp")
public class MemberController {
    @Autowired
    MemberRepository memberRepo;

    @GetMapping("/user/{id}")
    public ResponseEntity<Member> getMemberById(@PathVariable("id") String id) {
        List memberData = memberRepo.findByID(id);
        if(memberData.contains(id)) {
            return new ResponseEntity<Member>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
