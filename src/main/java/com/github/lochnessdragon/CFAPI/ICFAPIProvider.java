package com.github.lochnessdragon.CFAPI;

public interface ICFAPIProvider {
    public CFAuthor getAuthor(String name);
    public CFAuthor getAuthor(int id);

    public ExtCFProject getProject(int id);
    public ExtCFProject getProject(String projectPath);
}