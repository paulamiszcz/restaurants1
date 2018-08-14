package pl.javastart.dobrex.courier;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CourierController {

    private CourierRepository courierRepository;

    public CourierController(CourierRepository courierRepository) {
        this.courierRepository = courierRepository;
    }

    @GetMapping("/kurierzy")
    public String couriers(Model model) {
        List<Courier> courierList = courierRepository.findAll();
        model.addAttribute("kurierzy", courierList);
        return "couriers";
    }
}
