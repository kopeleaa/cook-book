package hu.example.cook_book.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;


@Getter
public class AbstractEntity {

    @Id
    @GeneratedValue
    private Long id;


}
