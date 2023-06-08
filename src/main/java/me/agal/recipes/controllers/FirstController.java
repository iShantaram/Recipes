package me.agal.recipes.controllers;

import me.agal.recipes.model.AppInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public String defaultInfo() {
        return "Application \"Recipes\" is running";
    }
    @GetMapping("/info")
    public AppInfo projectInfo() {
        return new AppInfo();
    }
}
