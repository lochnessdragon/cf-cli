package com.github.lochnessdragon;

import org.json.JSONObject;

public class RESTApi {
	public JSONObject get(String address) {
		URL url = new URL(url);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		con.setRequestMethod("GET");

		int status = con.getStatusCode();

		BufferedReader in = new BufferedReader(
  new InputStreamReader(con.getInputStream()));
		String inputLine;
		// StringBuffer content = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
    	System.out.println(inputLine);
		}
		in.close();

		return new JSONObject()
         .put("JSON", "Hello, World!");
	}
}