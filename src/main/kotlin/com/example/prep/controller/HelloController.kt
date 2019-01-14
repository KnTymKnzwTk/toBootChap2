package com.example.prep.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("hello")
class HelloController {
    @ModelAttribute("form")
    fun helloForm() = HelloForm("orange", 0)

    @GetMapping("/world")
    fun hello(model: Model): String {
        model.addAttribute("form", helloForm())
        return "greeting"
    }
}