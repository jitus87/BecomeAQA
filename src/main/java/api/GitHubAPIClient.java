package api;

import config.ConfigReader;
import io.restassured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class GitHubAPIClient {
    protected final String SEARCH_REPOSITORIES_URI = "/search/repositories";
    protected final String SEARCH_COMMITS_URI = "/search/commits";
    private RequestSpecification requestSpec;

    {
        RestAssured.baseURI = ConfigReader.URL;
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.addHeader("Accept","application/json");

        requestSpec=builder.build();
    }

    public JsonPath searchRepos(String repoName){
        JsonPath response = RestAssured
                .given(requestSpec)
                .queryParam("q",repoName)
                .get(SEARCH_REPOSITORIES_URI)
                .then()
                  .log().all()
                .assertThat().statusCode(200)
                .contentType(ContentType.JSON)
                .extract().jsonPath();
        return response;

    }

    public JsonPath searchCommit(String commit){
        JsonPath response = RestAssured
                .given(requestSpec)
                .queryParam("q", commit)
                .get(SEARCH_COMMITS_URI)
                .then()
                  .log().all()
                .assertThat().statusCode(200)
                .contentType(ContentType.JSON)
                .extract().jsonPath();
        return response;
    }
}