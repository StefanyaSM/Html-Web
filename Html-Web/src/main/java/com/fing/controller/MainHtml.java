package com.fing.controller;

import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.fing.User;

@Controller
public class MainHtml {

    @GetMapping("/perfil")
    public String info(Model model) {

        User user = new User(
                "Diana Stefanya Saldaña Mendoza",
                "a376952@uach.mx",
                "https://github.com/StefanyaSM",
                Arrays.asList("Java","Spring","HTML")
        );

        model.addAttribute("user", user);

        return "index";
    }
}
