package github.api.HTTPrequests;

import api.GitHubAPIClient;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;


public class BasicAPITest {
protected GitHubAPIClient client;
      @Test
    public void testSearchForExistingRepo(){

          client = new GitHubAPIClient();
          JsonPath repos = client.searchRepos("junit-team/junit5-samples");
          Verify.verifyTotalCount(3, repos);
    }

    @Test
    public void testSearchForNonExistingRepo(){
          client = new GitHubAPIClient();
          JsonPath repos = client.searchRepos("non-existing-repo-sjdghlakjgdfkljg");
          Verify.verifyTotalCount(0,repos);
    }

    @Test
    public void testSearchNonExistingCommit(){
          client = new GitHubAPIClient();
          JsonPath commits = client.searchCommit("non-existing-commit-fhdkisfjhksdfjh");
          Verify.verifyTotalCount(0,commits);
    }
}

