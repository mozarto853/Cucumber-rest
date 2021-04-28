package FakeTests;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PutPatchDeleteExamples {

    @Test
    public void testPut(){

        baseURI = "https://reqres.in/api";

        JSONObject request = new JSONObject();
        request.put("name","Estelle Bright");
        request.put("job","Bracer");
        System.out.println(request.toJSONString());

        given().
                contentType(ContentType.JSON).accept(ContentType.JSON).   //This tells the server that im sending a JSON and I want to receive JSON
                body(request.toJSONString()).when().put("/users/2").then().statusCode(200).log().all();
    }

    @Test
    public void testPatch(){

        baseURI = "https://reqres.in/api";

        JSONObject request = new JSONObject();
        request.put("name","Estelle Bright");
        request.put("job","Bracer");
        System.out.println(request.toJSONString());

        given().
                contentType(ContentType.JSON).accept(ContentType.JSON).   //This tells the server that im sending a JSON and I want to receive JSON
                body(request.toJSONString()).when().patch("/users/2").then().statusCode(200).log().all();
    }

    @Test
    public void testDelete(){

        baseURI = "https://reqres.in/api";

        when().delete("/users/2").then().statusCode(204).log().all();
    }

}
