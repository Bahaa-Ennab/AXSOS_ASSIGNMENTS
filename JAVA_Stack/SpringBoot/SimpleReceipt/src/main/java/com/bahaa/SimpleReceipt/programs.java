package com.bahaa.SimpleReceipt;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class programs {
    @RequestMapping("/programs")
    public String programs(Model model) {
        ArrayList<String> axsosPrograms= new ArrayList<String>();
        axsosPrograms.add("Web Development");
        axsosPrograms.add("Data Science");
        axsosPrograms.add("Power BI");
        model.addAttribute("programsFromMyController", axsosPrograms);
        return "programs.jsp";
    }
}
