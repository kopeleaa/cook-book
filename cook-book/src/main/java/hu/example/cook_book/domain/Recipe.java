package hu.example.cook_book.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "RECIPE")
public class Recipe extends AbstractEntity{

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    /**
     * Preparation time in minutes
     */
    @Column(name = "PREPARATION_TIME", nullable = false)
    private int preparationTime;



}
