package bg.softuni.mobilele.web;

import bg.softuni.mobilele.service.BrandService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/brands")
public class BrandController {
    private BrandService brandService;

    public BrandController(BrandService brandService ) {
        this.brandService = brandService;
    }

    @GetMapping("/all")
    public String allBrands(Model model){
        model.addAttribute("allBrands",brandService.getAllBrands());
        return "brands";
    }
}
