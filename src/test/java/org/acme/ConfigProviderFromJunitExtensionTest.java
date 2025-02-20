package org.acme;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


@QuarkusTest
@ExtendWith(JUnitExtensionUsingConfig.class)
class ConfigProviderFromJunitExtensionTest {

    @Test
    void justRunExtension() {
        // nothing here
    }
}
