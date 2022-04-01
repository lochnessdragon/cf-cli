package com.github.lochnessdragon.CFAPI;

public class CFAPIProvider implements ICFAPIProvider {

    private static String BASE_URL = "https://api.cfwidget.com/";

    @Override
    public CFAuthor getAuthor(String name) {
        RESTApi api = new RESTApi();
				api.get(BASE_URL + "author/search/" + name);
        return new CFAuthor("lochnessdragon", 12390);
    }

    @Override
    public CFAuthor getAuthor(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ExtCFProject getProject(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ExtCFProject getProject(String projectPath) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
