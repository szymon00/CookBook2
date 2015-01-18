package com.example.student7.cookbook.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable {
    public Integer id;

    @JsonProperty("session_id")
    public String sessionId;
}
