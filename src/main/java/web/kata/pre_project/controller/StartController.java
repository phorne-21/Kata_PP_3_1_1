package web.kata.pre_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/start")
public class StartController {

    @GetMapping
    public String showStartPage() {
        return "start";
    }
}
