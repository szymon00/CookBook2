package com.example.student7.cookbook.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.security.Timestamp;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Przepis {

    public String title;
    public String introduction;
    public String ingredients;
    public String steps;
    /*public Timestamp created;
    public Integer preparationMinutes;
    public Integer cookingMinutes;
    public Integer servings;*/
}
