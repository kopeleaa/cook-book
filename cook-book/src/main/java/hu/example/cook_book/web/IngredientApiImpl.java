package hu.example.cook_book.web;

import hu.example.cook_book.service.IngredientService;
import hu.example.cook_book.web.api.IngredientApi;
import hu.example.cook_book.web.model.IngredientDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class IngredientApiImpl implements IngredientApi {

    private final IngredientService ingredientService;

    public IngredientApiImpl(final IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @Override
    public ResponseEntity<IngredientDTO> createIngredient(final IngredientDTO ingredientDTO) {
        return ResponseEntity.ok(ingredientService.createIngredient(ingredientDTO));
    }
}
