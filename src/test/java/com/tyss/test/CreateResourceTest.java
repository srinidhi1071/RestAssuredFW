package com.tyss.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tyss.generics.IConstants;
import com.tyss.generics.IEndPoints;
import com.tyss.parser.JsonUtil;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateResourceTest {

	@Test
	public void tc_01() {
		try {
		FileInputStream fis = new FileInputStream(new File(IConstants.createStudentPath));
		Response response = given().contentType(ContentType.JSON).body(fis)
		.when().post(IEndPoints.ADD_STUDENT);
		
		response.then().statusCode(201).and().time(lessThan(5000L))
		.and().contentType(ContentType.JSON);
		
		Assert.assertEquals(JsonUtil.getJsonString(response, "msg"),"Student added");
		
	}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
}
}
