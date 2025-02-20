package org.acme;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;

@QuarkusTest
class ConfigProviderDirectlyInQuarkusTest {
    @BeforeAll
    static void beforeAll() { //this works
        Config config = ConfigProvider.getConfig();
        Optional<String> value = config.getOptionalValue("quarkus.http.root-path", String.class);
        value.get();
    }

    @BeforeEach
    void beforeEach() { //this works
        Config config = ConfigProvider.getConfig();
        Optional<String> value = config.getOptionalValue("quarkus.http.root-path", String.class);
        value.get();
    }

    @Test
    void justRunBeforeAllEach() {
        // nothing here
    }
}
