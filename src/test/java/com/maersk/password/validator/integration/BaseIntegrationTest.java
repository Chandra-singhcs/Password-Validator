package com.maersk.password.validator.integration;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class BaseIntegrationTest {

    /** The port. */
    @Value("${local.server.port}")
    private int port;

    /** The test_base_url. */
    protected String test_base_url;

    @Autowired
    protected TestRestTemplate testRestTemplate;

    /**
     * Initializes the Message Controller Integration Test.
     * @throws Exception the exception
     */
    @Before
    public void init() throws Exception {
        test_base_url = "http://localhost:" + port;
    }

    @Test
    public void testPort() {
        // then
        assertTrue(port > 0);
    }

}
