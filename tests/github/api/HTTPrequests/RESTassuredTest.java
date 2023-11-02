package github.api.HTTPrequests;

import io.restassured.*;
import org.junit.jupiter.api.Test;

public class RESTassuredTest {

//anotacia TEST = @Test, pracuje s JUnit5 kniznicou (v pom adresari) aby sa test dal spustit
    @Test
    public void SimpleGETrequest(){
        RestAssured.baseURI="https://dummy.restapiexample.com";
        RestAssured.basePath="/api/v1";
        RestAssured
                .given() //precondition
                //.pathParam(1) //when: co ked dame parameter (nefunguje)
                .get("/employee/1") //when - co spravit metoda
                .then().statusCode(200) //co ocakavat po spusteni
                .extract().response(); //vypisat vysledok

    }

}
