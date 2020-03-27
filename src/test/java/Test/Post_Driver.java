package Test;

import Pages.AddDriver_Post;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class Post_Driver extends HttpRequest {

    @Test(priority = 3)
    public void AddDriver()
    {
        AddDriver_Post driverlog = new AddDriver_Post();
        driverlog.PolicyHolderId = "1019621018";
        driverlog.national_id = "2431628847";
        driverlog.BirthMonth = "06";
        driverlog.BirthYear = "1989";

        Response resp = given()

                .header("Authorization", "Bearer" + AccessToken)
                .contentType(ContentType.JSON)
                .when()
                .body(driverlog)
                .post("api/Insurer/InsurerQuotes/GetDriverDetails")
                .then()
                .statusCode(200)
                .extract()
                .response();
        System.out.println(resp.body().prettyPrint());


    }

}
