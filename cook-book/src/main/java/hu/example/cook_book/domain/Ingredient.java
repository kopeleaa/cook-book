package hu.example.cook_book.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "INGREDIENT")
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

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public IngredientType getType() {
        return type;
    }

    public void setType(final IngredientType type) {
        this.type = type;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(final Double quantity) {
        this.quantity = quantity;
    }

    public IngredientUnit getUnit() {
        return unit;
    }

    public void setUnit(final IngredientUnit unit) {
        this.unit = unit;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(final LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public TasteProfile getTasteProfile() {
        return tasteProfile;
    }

    public void setTasteProfile(final TasteProfile tasteProfile) {
        this.tasteProfile = tasteProfile;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(final boolean inStock) {
        this.inStock = inStock;
    }
}


