package com.sookocheff.boomi.connector;

import com.boomi.connector.api.OperationType;
import com.boomi.connector.testutil.ConnectorTester;
import org.junit.Test;

/**
 * Tests for {@link GitHubFollowerBrowser}.
 */
public class GitHubFollowerBrowserTest {

    @Test
    public void testTypes() throws Exception
    {
        GitHubFollowerConnector connector = new GitHubFollowerConnector();
        ConnectorTester tester = new ConnectorTester(connector);

        tester.setBrowseContext(OperationType.GET, null, null);

        tester.testBrowseTypes("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ObjectTypes><type id=\"Followers\"/></ObjectTypes>");
    }

    @Test
    public void testProfile() throws Exception
    {
        GitHubFollowerConnector connector = new GitHubFollowerConnector();
        ConnectorTester tester = new ConnectorTester(connector);

        tester.setBrowseContext(OperationType.GET, null, null);

        tester.testBrowseProfiles("Followers",
        "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ObjectDefinitions><definition elementName=\"Followers\" inputType=\"json\" outputType=\"json\"><jsonSchema>{\n" +
                "  \"$schema\": \"http://json-schema.org/draft-04/schema#\",\n" +
                "  \"title\": \"Followers\",\n" +
                "  \"type\": \"array\",\n" +
                "  \"items\": {\n" +
                "    \"title\": \"Follower\",\n" +
                "    \"type\": \"object\",\n" +
                "    \"properties\": {\n" +
                "      \"login\": {\n" +
                "        \"type\": \"string\"\n" +
                "      },\n" +
                "      \"id\": {\n" +
                "        \"type\": \"number\"\n" +
                "      },\n" +
                "      \"avatar_url\": {\n" +
                "        \"type\": \"string\"\n" +
                "      },\n" +
                "      \"gravatar_id\": {\n" +
                "        \"type\": \"string\"\n" +
                "      },\n" +
                "      \"url\": {\n" +
                "        \"type\": \"string\"\n" +
                "      },\n" +
                "      \"html_url\": {\n" +
                "        \"type\": \"string\"\n" +
                "      },\n" +
                "      \"followers_url\": {\n" +
                "        \"type\": \"string\"\n" +
                "      },\n" +
                "      \"following_url\": {\n" +
                "        \"type\": \"string\"\n" +
                "      },\n" +
                "      \"gists_url\": {\n" +
                "        \"type\": \"string\"\n" +
                "      },\n" +
                "      \"starred_url\": {\n" +
                "        \"type\": \"string\"\n" +
                "      },\n" +
                "      \"subscriptions_url\": {\n" +
                "        \"type\": \"string\"\n" +
                "      },\n" +
                "      \"organizations_url\": {\n" +
                "        \"type\": \"string\"\n" +
                "      },\n" +
                "      \"repos_url\": {\n" +
                "        \"type\": \"string\"\n" +
                "      },\n" +
                "      \"received_events_url\": {\n" +
                "        \"type\": \"string\"\n" +
                "      },\n" +
                "      \"type\": {\n" +
                "        \"type\": \"string\"\n" +
                "      },\n" +
                "      \"site_admin\": {\n" +
                "        \"type\": \"string\"\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "}\n" +
                "</jsonSchema></definition></ObjectDefinitions>");

    }
}
