package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class AzController {

    @GetMapping(
        value = {"/hello"}
    )
    public String showMain() {
        return "main";
    }

}