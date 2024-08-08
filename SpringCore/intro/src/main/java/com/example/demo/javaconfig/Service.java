package com.example.demo.javaconfig;

public class Service {
    private final DataSource dataSource;

    public Service(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public void getInfos(){
        System.out.println(dataSource.getData());
    }
}
