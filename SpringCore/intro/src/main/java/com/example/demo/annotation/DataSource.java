package com.example.demo.annotation;

import org.springframework.stereotype.Component;

@Component
public class DataSource {

    public String getData() {
        return "example data for annotation";
    }
}
