package me.agal.recipes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public String defaultInfo() {
        return "Application \"Recipes\" is running";
    }
    @GetMapping("/info")
    public String projectInfo() {
        return "Project by Agapov Aleksandr<br>" +
                "\"Book of Recipes\"<br>" +
                "06\\06\\2023<br><br>" +
                "Проект \"Книга рецептов\"<br>" +
                "Содержит рецепты - названия, ингридиенты, инструкции.<br>" +
                "Написан на языке Java 17.<br>" +
                "Реализован в виде RESTful-сервиса.";
    }
}
