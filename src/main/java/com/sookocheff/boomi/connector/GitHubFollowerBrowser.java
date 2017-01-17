package com.sookocheff.boomi.connector;

import com.boomi.connector.api.ContentType;
import com.boomi.connector.api.ObjectDefinition;
import com.boomi.connector.api.ObjectDefinitionRole;
import com.boomi.connector.api.ObjectDefinitions;
import com.boomi.connector.api.ObjectType;
import com.boomi.connector.api.ObjectTypes;
import com.boomi.connector.util.BaseBrowser;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Implements browse functionality for the connector.
 * Browsing allows a user to discover the types and object definitions
 * supported by this API.
 */
public class GitHubFollowerBrowser extends BaseBrowser {

    public static String followerSchema = "{\n" +
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
            "}\n";


    public GitHubFollowerBrowser(GitHubFollowerConnection conn) {
        super(conn);
    }

    @Override
    public ObjectTypes getObjectTypes() {
        List<String> typeNames = Collections.singletonList("Followers");

        ObjectTypes types = new ObjectTypes();
        for (String typeName : typeNames) {
            ObjectType type = new ObjectType();
            type.setId(typeName);
            types.getTypes().add(type);
        }

        return types;
    }

    @Override
    public ObjectDefinitions getObjectDefinitions(String objectTypeId, Collection<ObjectDefinitionRole> roles) {
        ObjectDefinition followerDefinition = new ObjectDefinition();
        followerDefinition.setElementName("Followers");
        followerDefinition.setInputType(ContentType.JSON);
        followerDefinition.setOutputType(ContentType.JSON);
        followerDefinition.setJsonSchema(followerSchema);

        ObjectDefinitions definitions = new ObjectDefinitions();

        definitions.getDefinitions().add(followerDefinition);
        return definitions;
    }

    @Override
    public GitHubFollowerConnection getConnection() {
        return (GitHubFollowerConnection) super.getConnection();
    }

}
