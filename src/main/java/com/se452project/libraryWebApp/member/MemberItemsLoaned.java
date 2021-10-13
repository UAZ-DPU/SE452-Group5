package com.se452project.libraryWebApp.member;

import com.se452project.libraryWebApp.itemObject.Item;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("MemberItemsLoaned")
@Data
public class MemberItemsLoaned {

    @Id
    private String memberID;

    private List<Item>loanedItems;


}
