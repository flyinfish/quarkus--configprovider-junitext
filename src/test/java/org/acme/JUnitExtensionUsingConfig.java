package org.acme;

import java.util.Optional;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class JUnitExtensionUsingConfig implements BeforeEachCallback, AfterEachCallback {

    @Override
    public void afterEach(ExtensionContext extensionContext) {  //FIXME this doesn't work
        Config config = ConfigProvider.getConfig();
        Optional<String> value = config.getOptionalValue("quarkus.http.root-path", String.class);
        value.get(); //exception here, no value set
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) {//FIXME this doesn't work
        Config config = ConfigProvider.getConfig();
        Optional<String> value = config.getOptionalValue("quarkus.http.root-path", String.class);
        value.get(); //exception here, no value set
    }
}