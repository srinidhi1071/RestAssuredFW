package com.tyss.generics;

import org.testng.annotations.BeforeSuite;
import static io.restassured.RestAssured.*;


public class BaseLib {
	/*
	 * 
	 * to Initialize the base URI,port and the authentication
	 * 
	 * 
	 */
	@BeforeSuite
	public void config() {
		baseURI="http://localhost:8080/";
		port=3000;
//		basePath=" ";
		
		
//		Basic Auth
//		given().auth().preemptive().basic(username, password)
		
//		Bearer Token
//		given().auth().oauth2(accessToken)
	}

}
