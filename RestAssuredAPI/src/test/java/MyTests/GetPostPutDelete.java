package MyTests;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class GetPostPutDelete {

    @Test
    public void getAPI(){

        baseURI = "http://localhost:3000";

        given().get("/bracer").then().statusCode(200);
    }

    @Test
    public void post(){

        JSONObject request = new JSONObject();

        request.put("name","Agate");
        request.put("rank","A");
        request.put("subjectId",1);

        baseURI = "http://localhost:3000";

        given().contentType(ContentType.JSON).accept(ContentType.JSON).
                body(request.toJSONString()).when().
                post("/bracer").then().statusCode(201);

    }

    @Test
    public void put(){

        JSONObject request = new JSONObject();

        request.put("name","Sarah Valestine");
        request.put("rank","A");
        request.put("subjectId",3);

        baseURI = "http://localhost:3000";

        given().contentType(ContentType.JSON).accept(ContentType.JSON).
                body(request.toJSONString()).when().
                put("/bracer/2").then().statusCode(200);

    }

    @Test
    public void patch(){

        JSONObject request = new JSONObject();

        request.put("name","Joshua Bright");
        request.put("rank","B+");
        request.put("subjectId","1");


        baseURI = "http://localhost:3000";

        given().contentType(ContentType.JSON).accept(ContentType.JSON).
                body(request.toJSONString()).when().
                patch("/bracer/4").then().statusCode(200);

    }

}
