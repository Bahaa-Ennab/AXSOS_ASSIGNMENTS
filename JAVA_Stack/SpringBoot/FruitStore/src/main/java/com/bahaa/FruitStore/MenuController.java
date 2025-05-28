package com.bahaa.FruitStore;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {
    @RequestMapping("/menu")
    public String menuDisplay(Model model) {
        ArrayList<Item> menu = new ArrayList<>();

        menu.add(new Item("Kiwi", 1.5));
        menu.add(new Item("Mango", 2.0));
        menu.add(new Item("Goji Berries", 4.0));
        menu.add(new Item("Guava", 0.75));
        menu.add(new Item("Banana", 5.00));
        menu.add(new Item("apple", 50.00));


        model.addAttribute("menu", menu);

        return "index.jsp";
    }

}
