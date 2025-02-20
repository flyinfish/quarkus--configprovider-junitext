# quarkus--configprovider-junitext

reproducer for https://github.com/quarkusio/quarkus/issues/46383

while config can still be received directly in junit-test [ConfigProviderDirectlyInQuarkusTest](src/test/java/org/acme/ConfigProviderDirectlyInQuarkusTest.java) it fails in Junit-Extension [ConfigProviderFromJunitExtensionTest](src/test/java/org/acme/ConfigProviderFromJunitExtensionTest.java)

## reproduce

failure
```
git clone https://github.com/flyinfish/quarkus--configprovider-junitext.git
cd quarkus quarkus--configprovider-junitext
mvn test
```

works with downgrade to 3.17.8 in [pom](pom.xml)
```
mvn clean test
```
