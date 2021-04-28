package FakeTests;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetAndPostExamples {

    @Test
    public void testGet(){

        baseURI = "https://reqres.in/api";

        given().get("/users?page=2").then().statusCode(200).body("data[3].first_name",equalTo("Byron")).body("data.first_name",hasItems("George","Rachel"));

    }

    @Test
    public void testPost(){
        baseURI = "https://reqres.in/api";

        JSONObject request = new JSONObject();

        request.put("name","Estelle");
        request.put("job","Bracer");
        System.out.println(request.toJSONString());

        given().
                contentType(ContentType.JSON).accept(ContentType.JSON).   //This tells the server that im sending a JSON and I want to receive JSON
                body(request.toJSONString()).when().post("/users").then().statusCode(201).log().all();

    }

}
