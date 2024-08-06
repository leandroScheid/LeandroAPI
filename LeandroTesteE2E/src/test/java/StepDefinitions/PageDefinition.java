package StepDefinitions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.Json;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageDefinition {
	
	static WebDriver driver;
	
	@Given("acessa a pagina jsonplaceholder")
	public void acessa_a_pagina_jsonplaceholder() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jsonplaceholder.typicode.com");
	    
	}

	@Given("acessa o menu Guide")
	public void acessa_o_manu_guide() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("body > header:nth-child(1) > nav:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
	    //throw new io.cucumber.java.PendingException();
	}

	@When("abre o link de photos")
	public void abre_o_link_de_photos() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[normalize-space()='/albums/1/photos']")).click();
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("armazena os objetos em um array JSON")
	public void armazena_os_objetos_em_um_array_json() throws FileNotFoundException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("body pre"));
		String teste = driver.findElement(By.cssSelector("body pre")).getText();
	    //throw new io.cucumber.java.PendingException();
		//System.out.println("testeffff " + teste);
		//JSONObject object = (JSONObject) JSONValue.parse(teste);
		//object.get("title").toString();
		//JSONParser jSONParser = new JSONParser();
		//JSONObject jSONObject = null;
		//try {
		//	jSONObject = new JSONObject((Map) jSONParser.parse(teste));
		//	System.out.println("testeccccc " + jSONObject.get("title"));
		//} catch (ParseException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
	//	}
		//JSONObject obj = (JSONObject) jSONObject.get("dados"); //chave do objeto

		
	}

	@Then("verifica o id do objeto")
	public void verifica_se_o_id_do_objeto_é(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("verifica se o albumId")
	public void verifica_se_o_album_id() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("verifica se o title")
	public void verifica_se_o_title() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("verifica a url")
	public void verifica_a_url() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("verifica a thumbnailUrl")
	public void verifica_a_thumbnail_url() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}


}
