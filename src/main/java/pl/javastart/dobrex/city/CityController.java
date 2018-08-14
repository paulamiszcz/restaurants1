package pl.javastart.dobrex.city;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CityController {

    private CityRepository cityRepository;

    public CityController(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping("/miasta")
    public String cities(Model model) {
        List<City> cities = cityRepository.findAll();
        model.addAttribute("cities", cities);
        return "cities";
    }


}
