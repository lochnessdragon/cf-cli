package com.github.lochnessdragon.CFAPI;

public class BasicCFProject implements ICFProject {
    private int id;
    private String name;

    public BasicCFProject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return id;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }
    
}
