package com.github.lochnessdragon.CFAPI;

import java.util.List;

public class ExtCFProject extends BasicCFProject {
    String game, type;
    List<String> urls;
    List<String> files;
    List<String> downloads;
    String thumbnail;
    List<String> categories;
    String description;
    String download;
    String created_at;
    String last_fetch;

    public ExtCFProject(int id, String name) {
        super(id, name);
    }
}
