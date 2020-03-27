package Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;


public class Get_AllInsuranceAgencies

{

    @Test
    public void GetAllInsuranceAgencies()
    {
        Response resp =
                given()
                        .contentType(ContentType.JSON)
                .when()
                .get("api/Insurer/InsurerAgencies/GetAllInsuranceAgencies");
        System.out.println((resp.body().prettyPrint()));




    }
}
