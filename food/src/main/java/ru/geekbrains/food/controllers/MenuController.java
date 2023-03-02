package ru.geekbrains.food.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.geekbrains.food.models.ObjectFood;
import ru.geekbrains.food.repo.FoodRepository;
import java.util.ArrayList;
import java.util.Collections;

@Controller
public class MenuController {
    @Autowired
    private FoodRepository foodRepository;
    @GetMapping("menu")
    public String menuMain(Model model){
        model.addAttribute("title", "Сегодня можно заказать");
        Iterable<ObjectFood> objectFoods = foodRepository.findAll();
        model.addAttribute("menu", objectFoods);
        return "menu";
    }
    @GetMapping("menu/add")
    public String menuAdd(Model model){
        model.addAttribute("title", "Добавление нового лота");
        return "menu-add";
    }
    @PostMapping("menu/add")
    public String menuPostAdd(@RequestParam int category, @RequestParam String image, @RequestParam String name, @RequestParam String description, @RequestParam String compound, @RequestParam int weight, @RequestParam int price){
        ObjectFood objectFood = new ObjectFood(category, image, name, description, compound, weight, price);
        foodRepository.save(objectFood);
        return "redirect:/menu";
    }
    @GetMapping("menu/{id}")
    public String menuDetails(@PathVariable(value = "id") long id, Model model){
        if(!foodRepository.existsById(id)){
            return "redirect:/";
        }
        model.addAttribute("title", "Полное описание заказа");
        Iterable<ObjectFood> objectFood = foodRepository.findAllById(Collections.singleton(id));
        ArrayList<ObjectFood> tree = new ArrayList<>();
        objectFood.forEach(tree::add);
        model.addAttribute("menu", tree);
        return "menu-details";
    }
    @GetMapping("menu/{id}/edit")
    public String menuEdit(@PathVariable(value = "id") long id, Model model){
        if(!foodRepository.existsById(id)){
            return "redirect:/";
        }
        Iterable<ObjectFood> objectFood = foodRepository.findAllById(Collections.singleton(id));
        ArrayList<ObjectFood> tree = new ArrayList<>();
        objectFood.forEach(tree::add);
        model.addAttribute("menu", tree);
        return "menu-edit";
    }
    @PostMapping("menu/{id}/edit")
    public String menuPostUpdate(@PathVariable(value = "id") long id, @RequestParam String name, @RequestParam String description, @RequestParam String compound, @RequestParam int weight, @RequestParam int price){
        ObjectFood objectFood = foodRepository.findById(id).orElseThrow();
        objectFood.setName(name);
        objectFood.setDescription(description);
        objectFood.setCompound(compound);
        objectFood.setWeight(weight);
        objectFood.setPrice(price);
        foodRepository.save(objectFood);
        return "redirect:/menu";
    }
    @PostMapping("menu/{id}/dell")
    public String menuPostDelete(@PathVariable(value = "id") long id, Model model){
        ObjectFood objectFood = foodRepository.findById(id).orElseThrow();
        foodRepository.delete(objectFood);
        return "redirect:/menu";
    }

    @GetMapping("menu/{id}/remove")
    public String menuRemover(@PathVariable(value = "id") long id, Model model){
        if(!foodRepository.existsById(id)){
            return "redirect:/";
        }
        Iterable<ObjectFood> objectFood = foodRepository.findAllById(Collections.singleton(id));
        ArrayList<ObjectFood> tree = new ArrayList<>();
        objectFood.forEach(tree::add);
        model.addAttribute("menu", tree);

        return "menu-dell";
    }

}
