package com.sookocheff.boomi.connector;

import com.boomi.connector.api.BrowseContext;
import com.boomi.connector.api.Browser;
import com.boomi.connector.api.Operation;
import com.boomi.connector.api.OperationContext;
import com.boomi.connector.util.BaseConnector;

/**
 * A Boomi connector to read GitHub follower's using the GitHub API.
 */
public class GitHubFollowerConnector extends BaseConnector {

    @Override
    public Browser createBrowser(BrowseContext context) {
        return new GitHubFollowerBrowser(new GitHubFollowerConnection(context));
    }

    @Override
    public Operation createGetOperation(OperationContext context) {
        return new GitHubFollowerGetOperation(new GitHubFollowerConnection(context));
    }
}
