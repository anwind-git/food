package ru.geekbrains.food.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.geekbrains.food.models.ObjectFood;
import ru.geekbrains.food.repo.FoodRepository;

@Controller
public class MainController {
    @Autowired
    private FoodRepository foodRepository;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Заказ еды в Ростове-на-Дону");
        Iterable<ObjectFood> objectFoods = foodRepository.findAll();

        model.addAttribute("menu", objectFoods);
        return "home";
    }
    @GetMapping("/payment")
    public String payment(Model model) {
        model.addAttribute("title", "Оплата и доставка");
        return "payment";
    }
    @GetMapping("/contacts")
    public String contacts(Model model) {
        model.addAttribute("title", "Контакты");
        return "contacts";
    }

}
