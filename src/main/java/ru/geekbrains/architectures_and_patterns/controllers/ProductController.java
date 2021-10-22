package ru.geekbrains.architectures_and_patterns.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.architectures_and_patterns.entities.Product;
import ru.geekbrains.architectures_and_patterns.services.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/add")
    public String showAddForm() {
        return "add_product_form";
    }

    @PostMapping("/add")
    public String saveNewStudent(@ModelAttribute Product newProduct) {
        productService.saveOrUpdate(newProduct);
        return "redirect:/products/";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("product", productService.findProductById(id));
        return "edit_product_form";
    }

    @PostMapping("/edit")
    public String modifyStudent(@ModelAttribute Product modifiedProduct) {
        productService.saveOrUpdate(modifiedProduct);
        return "redirect:/products/";
    }

    @GetMapping("/json/{id}")
    @ResponseBody
    public Product showJsonProduct(@PathVariable Long id) {
        return productService.findProductById(id);
    }
}