package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import data.JSONDataReader;

public class LoginTest extends TestBase{

	LoginPage loginOBJ;
	
	@Test
	void LoginSuccessfully() throws FileNotFoundException, IOException, ParseException, InterruptedException
	{
		loginOBJ = new LoginPage(driver);
		JSONDataReader jsonReader = new JSONDataReader();
		jsonReader.jsonReader();
		
		loginOBJ.LoginCase(jsonReader.email, jsonReader.password);
		
		Assert.assertTrue(loginOBJ.LoginTXT.getText().contains("Welcome to Codility"));
		
		System.out.println("The current title is ... " + driver.getTitle());
		System.out.println("The current URL is ... " + driver.getCurrentUrl());
	}
}
