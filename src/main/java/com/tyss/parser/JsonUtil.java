package com.tyss.parser;

import java.util.List;
import io.restassured.response.Response;


public class JsonUtil {

	public static String getJsonString(Response response, String jsonPath) {
		return response.getBody().jsonPath().get(jsonPath).toString();
	}
	

	public static List<String> getJsonList(Response response, String jsonPath) {
		return response.getBody().jsonPath().getList(jsonPath);
	}

	
}
