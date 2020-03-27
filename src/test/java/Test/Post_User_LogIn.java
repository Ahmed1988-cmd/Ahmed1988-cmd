package Test;

import Pages.Login_Post;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class Post_User_LogIn extends HttpRequest

{

    @Test(priority = 1)
    public void PostLogin()
    {

        Login_Post log = new Login_Post();
        log.Email = "mohamed.farid@devexy.com";
        log.password = "P@ssw0rd";
        log.clientId = "Bawbty.Web";
        log.clientSecret = "Web@Passw0rd";
        log.clientScope = "IntegrationService InsurerQuote.API UserManagement.API";


        Response resp = given()
                    .header("Authorization", "Bearer" + AccessToken)
                    .contentType(ContentType.JSON)
                    .when()
              .body(log)
                    .post("api/Account/Users/Signin")
                    .then()
                    .statusCode(200)
                .extract()
                .response();
        System.out.println(resp.body().prettyPrint());


    }

}
