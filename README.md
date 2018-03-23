# scc591-consumer

A demonstration of [#591](https://github.com/spring-cloud/spring-cloud-contract/issues/591) for `spring-cloud-contract-wiremock`.

Run `ConsumerApplicationTests`.

With the `classpath:/` prefix in `@AutoConfigureWireMock`, only one set of Wiremock mappings will be picked up: the one from `src/test/resources` in the app itself, or the one from the `com.example:scc591-dependent-api-stubs:0.0.1` external `jar` dependency-- but not both.

With the `classpath*:/` prefix, we get the aforementioned `FileNotFoundException` from [the issue](https://github.com/spring-cloud/spring-cloud-contract/issues/591#issuecomment-375772736).
