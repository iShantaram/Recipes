package me.agal.recipes.model;

import lombok.Data;

@Data
public class AppInfo {
    private final String name = "Agapov Aleksandr";
    private final String projectName = "Book of Recipes";
    private final String dataOfCreation = "06/06/2023";
    private final String[] projectInfo = {"Проект cодержит рецепты - названия, ингридиенты, инструкции.",
            "Написан на языке Java 17.", "Реализован в виде RESTful-сервиса."};

}
