package github.api.HTTPrequests;

import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Assertions;

public class Verify {

    public static void verifyTotalCount(int expected, JsonPath jp){
        int actualTotalCount = jp.get("total_count");
        Assertions.assertEquals(expected,actualTotalCount);
    }

}
