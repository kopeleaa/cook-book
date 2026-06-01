package hu.example.cook_book.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;


@Getter
@MappedSuperclass
public class AbstractEntity {

    @Id
    @GeneratedValue
    private Long id;


}
