package com.sookocheff.boomi.connector;

import com.boomi.connector.api.OperationStatus;
import com.boomi.connector.api.OperationType;
import com.boomi.connector.testutil.ConnectorTester;
import com.boomi.connector.testutil.SimpleOperationResult;
import org.junit.Test;

import java.util.Arrays;

/**
 * Tests for {@link GitHubFollowerConnector}.
 */
public class GitHubFollowerGetOperationTest {

    @Test
    public void testGetOperation() throws Exception {
        GitHubFollowerConnector connector = new GitHubFollowerConnector();
        ConnectorTester tester = new ConnectorTester(connector);

        tester.setOperationContext(OperationType.GET, null, null, "Follower", null);

        tester.testExecuteGetOperation("soofaloofa", Arrays.asList(
                new SimpleOperationResult(OperationStatus.SUCCESS, "200", null, Arrays.asList("test".getBytes()))));
    }
}
