package hu.example.cook_book.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "INGREDIENT")
@Getter
@Setter
@NoArgsConstructor
public class Ingredient extends AbstractEntity{

    @NotNull
    @Column(name = "NAME", nullable = false, length = 256)
    private String name;

    @Column(name = "DESCRIPTION", length = 1024)
    private String description;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE", nullable = false, length = 256)
    private IngredientType type;

    @Column(name = "QUANTITY", nullable = false)
    private Double quantity;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "UNIT", length = 256, nullable = false)
    private IngredientUnit unit;

    @Future
    @Column(name = "EXPIRATION_DATE", nullable = false)
    private LocalDate expirationDate;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "TASTE_PROFILE", nullable = false, length = 256)
    private TasteProfile tasteProfile;

    @Column(name = "IN_STOCK", nullable = false)
    private boolean inStock;



}


