package Test;

import Pages.UserInfo_Post;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;



public class Post_UserInfo extends HttpRequest

{
    @Test(priority = 3)
    public void UserInfo() {

        UserInfo_Post UserObj = new UserInfo_Post();
        UserObj.registration_type = "0";
        UserObj.purpose_of_insurance = "0";
        UserObj.VehicleID = "757613110";
        UserObj.insured_national_id = "1019621018";
        UserObj.policy_effective_date = "25/03/2020";
        UserObj.education_qualification="1";
        UserObj.hildren_below_16 = "1";
        UserObj.traffic_violations = "1";
        UserObj.medical_conditions = "1";

       // UserObj.drivers = "";


        UserObj.driver_national_id = "2431628847";
        UserObj.BirthMonth = "11";

        UserObj.BirthYear = "1991";
        UserObj.driverRelation = "2";
        UserObj.education_qualificationn = "2";
        UserObj.children_below_16 = "2";
        UserObj.traffic_violationss = "1";
        UserObj.medical_conditionss = "1";
        UserObj.driving_percentage = "25";

        UserObj.DriverWorkCityId = "string";
        UserObj.DriverNoALast5Years = "1";
        UserObj.DriverNoCLast5Years = "1";
     //   UserObj.LicenseCountries = "0";
        UserObj.LicenseCountryCode = "string";
        UserObj.LicenseOwnYears = "1";


        UserObj.vehicle_value = "20000";
        UserObj.overnight_parking = "1";
        UserObj.transmission_type = "1";
        UserObj.expected_km_annual = "1";
        UserObj.purpose_of_vehicle_use = "1";
        UserObj.driving_city = "1";
        UserObj.vehicle_specifications = "0";

        UserObj.repair_method = "1";
        UserObj.manifucture_year = "1";
        UserObj.VehicleCurrentMillage = "1";
        UserObj.VehicleModifications = "1";
        UserObj.PolicyHolderWorkCityId = "1";
        UserObj.PolicyHolderNoALast5Years = "1";
        UserObj.PolicyHolderNoCLast5Years = "1";
        UserObj.LicenseCountriess = "0";

        UserObj.LicenseCountryCodee = "1";
        UserObj.LicenseOwnYearss = "0";



        given()
                .header("Authorization", "Bearer" + AccessToken)
                .contentType(ContentType.JSON)
                .when()
                .body(UserObj)
                .post("api/Insurer/InsurerQuotes/GetQuotes")
                .then()
                .statusCode(200);





    }
}
