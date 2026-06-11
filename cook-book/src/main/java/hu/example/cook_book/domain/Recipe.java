package hu.example.cook_book.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "RECIPE")
public class Recipe extends AbstractEntity{

    @Column(name = "NAME", nullable = false, length = 256)
    private String name;

    @Column(name = "DESCRIPTION", nullable = false, length = 4000)
    private String description;

    /**
     * Preparation time in minutes
     */
    @Column(name = "PREPARATION_TIME", nullable = false)
    private int preparationTime;

    @OneToMany(mappedBy = "recipe")
    private List<Ingredient> ingredients;

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

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(final int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(final List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
