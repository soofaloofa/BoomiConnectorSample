package com.sookocheff.boomi.connector;

import com.boomi.connector.api.BrowseContext;
import com.boomi.connector.util.BaseConnection;

/**
 * GitHub follower connection.
 * Maintains any behaviour useful across all operations.
 */
public class GitHubFollowerConnection extends BaseConnection
{
    public GitHubFollowerConnection(BrowseContext context) {
        super(context);
    }
}
