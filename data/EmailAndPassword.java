package com.example.student7.cookbook.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public class EmailAndPassword {

    public String email;
    public String password;

}
