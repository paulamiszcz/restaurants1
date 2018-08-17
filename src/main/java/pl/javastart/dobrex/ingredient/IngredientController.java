package pl.javastart.dobrex.ingredient;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IngredientController {


    private IngredientRepository ingredientRepository;

    public IngredientController(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @GetMapping("/skladniki")
    public String cities(Model model) {
        List<Ingredient> ingredient = ingredientRepository.findAll();
        model.addAttribute("ingredients", ingredient);
        return "ingredients";
    }

}
