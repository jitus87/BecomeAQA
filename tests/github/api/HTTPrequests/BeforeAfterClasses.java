package github.api.HTTPrequests;
import api_testing.GitHubAPIClient;
import org.junit.jupiter.api.BeforeEach;

public class BeforeAfterClasses {
    protected GitHubAPIClient client;
    @BeforeEach
    public void setUp(){
        client = new GitHubAPIClient();
    }
}
