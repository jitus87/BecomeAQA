package github.api.HTTPrequests;
import api_testing.GitHubAPIClient;
import org.testng.annotations.BeforeTest;


public class BeforeAfterClasses {
    protected GitHubAPIClient client;
    @BeforeTest
    public void setUp(){
        client = new GitHubAPIClient();
    }
}
