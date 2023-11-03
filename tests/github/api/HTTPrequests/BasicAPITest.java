package github.api.HTTPrequests;

import api_testing.GitHubAPIClient;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;


public class BasicAPITest extends BeforeAfterClasses {
    //BeforeAfterClass is doing the same thing before each test: client = new GitHubAPIClient()
    //it's stored extra
protected GitHubAPIClient client;
    @Test
    public void testSearchForExistingRepo(){
          JsonPath repos = client.searchRepos("junit-team/junit5-samples");
          Verify.verifyTotalCount(3, repos);
    }

    @Test
    public void testSearchForNonExistingRepo(){
          JsonPath repos = client.searchRepos("non-existing-repo-sjdghlakjgdfkljg");
          Verify.verifyTotalCount(0,repos);
    }

    @Test
    public void testSearchNonExistingCommit(){
          JsonPath commits = client.searchCommit("non-existing-commit-fhdkisfjhksdfjh");
          Verify.verifyTotalCount(0,commits);
    }

    @Test
    public void testSearchUsers() {
        JsonPath users = client.searchUsers("junit-team/junit5-samples");
        Verify.verifyTotalCount(0, users);
    }
}

