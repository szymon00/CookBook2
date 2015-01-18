package com.example.student7.cookbook.data;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;


public class CookBook {

    @JsonProperty("record")
    public List<Przepis> records = new ArrayList<Przepis>();
}
