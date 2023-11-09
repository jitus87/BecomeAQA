package github.api.HTTPrequests;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;


public class Verify {

    public static void verifyTotalCount(int expected, JsonPath jp){
        int actualTotalCount = jp.get("total_count");
        Assert.assertEquals(expected,actualTotalCount);
    }

}
