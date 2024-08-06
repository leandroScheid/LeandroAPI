import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.CoreMatchers.containsString;

public class RestAssuredSample {

    @Test
    public void getPageOneTest(){
    	String url = "https://jsonplaceholder.typicode.com/comments";
        given().
                param("name", "alias odio sit").
        when().
                get(url).
        then().
                statusCode(200);
    }

    @Test
    public void postUserTest(){
    	String url = "https://jsonplaceholder.typicode.com/users";
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "Leandro");
        requestParams.put("username", "QA");
        requestParams.put("email", "testee@april.biz");
        requestParams.put("address.street", "Hoeger Mall");
        requestParams.put("address.suite", "Apt. 692");
        requestParams.put("address.city", "South Elvis");
        requestParams.put("address.zipcode", "53919-4257");
        requestParams.put("address.geo.lat", "29.4572");
        requestParams.put("address.geo.lng", "-164.2990");
        requestParams.put("phone", "493-170-9623 x156");
        requestParams.put("website", "teste.123");
        requestParams.put("company.name", "Robel-Corkery");
        requestParams.put("company.catchPhrase", "Multi-tiered zero tolerance productivity");
        requestParams.put("company.bs", "transition cutting-edge web services");
        given().
                body(requestParams.toJSONString()).
        when().
                post(url).
        then().
                statusCode(201);
    }

    @Test
    public void putUserTest(){
    	String url = "https://jsonplaceholder.typicode.com/users/5";
        JSONObject requestParams = new JSONObject();
        requestParams.put("email", "teste123@april.biz");
        requestParams.put("address.geo.lat", "29.4572");
        requestParams.put("address.geo.lng", "-164.2990");
        given().
                body(requestParams.toJSONString()).
        when().
                put(url + "/5").
        then().
                statusCode(200);
    }

}