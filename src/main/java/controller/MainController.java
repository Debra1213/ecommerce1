package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import Service.ProductService;
import lombok.Data;
import model.Product;

@Data
@Controller
@ControllerAdvice

public class MainController {
    
@Autowired
ProductService productService;
private Object brand;

@GetMapping("/")
public String main( ) {
    return "main";
}
@ModelAttribute("products")
public List<Product> products() {
   return productService.findAll();
}

@ModelAttribute("categories")
public List<String> catagories(){
    return productService.findDistinctCategories();
    
}

@ModelAttribute("brands")
public List<String> categories() {
    return productService.findDistinctCategories();
    
}
@GetMapping("/filter")
public String filter(@RequestParam(required = false) String category,
                    @RequestParam(required = false) String brand,
                    Model model) {
    List<Product> filtered =
productService.findByBrandAndOrCategory(brand, category);
            model.addAttribute("products", filtered);
            return "main";
}
@GetMapping("/about")
public String about() {
    return "about";
    
}


}
