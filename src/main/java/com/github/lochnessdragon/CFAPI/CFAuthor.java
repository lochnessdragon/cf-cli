package com.github.lochnessdragon.CFAPI;

import java.util.List;

public class CFAuthor {
    int id;
    String username;
    
    List<ICFProject> projects;

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public List<ICFProject> getProjects() {
        return projects;
    }
}
