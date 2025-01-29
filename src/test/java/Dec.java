import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Dec {


    @Test
    public void testApi(){
        Response res =given().when().
                baseUri("https://postman-echo.com").get("/get?foo1=bar1&foo2=bar2").then().
                assertThat().statusCode(200).extract().response();

        String responseString = res.asString();

        Assert.assertEquals(res.statusCode(), 200);

        JsonPath jp = new JsonPath(responseString);
        String foo1Val= jp.get("args.foo1");
        String userAgent = jp.get("headers.user-agent");
        Assert.assertTrue(userAgent.contains("Java"));
        Assert.assertEquals(foo1Val,"bar1");
        System.out.println("foo 1 val is "+foo1Val);

        System.out.println("res "+res.asString());







    }
}
