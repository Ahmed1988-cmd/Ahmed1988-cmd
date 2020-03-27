package Test;


import Pages.Basic_Post;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class Post_Basicinfo extends HttpRequest

{

    @Test(priority = 2)
    public void BasicInfo()
    {

        Basic_Post BasicObj = new Basic_Post();
        BasicObj.RegistrationType = "0";
        BasicObj.PurposeOfInsurance = "0";
        BasicObj.SequenceNumber = "757613110";
        BasicObj.CustomNumber = "string";
        BasicObj.InsuredNationalId = "1019621018";
        BasicObj.BirthMonth = "04";
        BasicObj.BirthYear = "1379";
        BasicObj.manifucture_year = "0";



      Response response = given()
                .header("Authorization", "Bearer" + AccessToken)
                .contentType(ContentType.JSON)
                .when()
                .body(BasicObj)
                .post("api/Insurer/InsurerQuotes/GetUserInfo")
                .then()
                .statusCode(200)
                .extract()
                .response();
      System.out.println(response.body().prettyPrint());



    }

}
