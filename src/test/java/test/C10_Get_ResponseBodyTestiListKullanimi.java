package test;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.hasSize;

public class C10_Get_ResponseBodyTestiListKullanimi {

    /*
            http://dummy.restapiexample.com/api/v1/employees url'ine bir GET request yolladigimizda
            donen Response'in
            status code'unun 200,
            ve content type'inin application/json,
            ve response body'sindeki
                employees sayisinin 24
                ve employee'lerden birinin "Ashton Cox"
                ve girilen yaslar icinde 61,40 ve 30 degerlerinin oldugunu test edin
            test edin.
     */
@Test
    public void get01(){


    String url = "http://dummy.restapiexample.com/api/v1/employees";

    Response response = given().when().get(url);

    response.prettyPrint();

    response.then().assertThat()
            .statusCode(200)
            .contentType("application/json")
            .body("data.id", hasSize(24),
                    "data.employee_name",hasItem("Ashton Cox"),
                    "data.employee_age",hasItems(61,30,40));
}







}
