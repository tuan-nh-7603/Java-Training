package com.example.demo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
    private final DataSource dataSource;

    @Autowired
    public Service(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public void getInfos(){
        System.out.println(dataSource.getData());
    }
}
