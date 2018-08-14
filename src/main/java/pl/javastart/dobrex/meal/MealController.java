package pl.javastart.dobrex.meal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MealController {

    private MealRepository mealRepository;

    public MealController(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    @GetMapping("/meals")
    public String meal(Model model){

        List<Meal> meals = mealRepository.findAll();
        model.addAttribute("meals", meals);

        return "meals";

    }



}
