# Changelog

## 0.1.0-alpha.54 (2026-02-25)

Full Changelog: [v0.1.0-alpha.53...v0.1.0-alpha.54](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.53...v0.1.0-alpha.54)

### Chores

* drop apache dependency ([7c4dc22](https://github.com/OneBusAway/java-sdk/commit/7c4dc22dafc8ce6892a94da4d227d5e0a810c4ce))
* **internal:** expand imports ([6b02ef8](https://github.com/OneBusAway/java-sdk/commit/6b02ef86864a0f6a2a1456f59c017364fa271a40))
* make `Properties` more resilient to `null` ([a743178](https://github.com/OneBusAway/java-sdk/commit/a7431780bc7a3b13b284ab66bfafc7aee55dd802))

## 0.1.0-alpha.53 (2026-02-19)

Full Changelog: [v0.1.0-alpha.52...v0.1.0-alpha.53](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.52...v0.1.0-alpha.53)

### Features

* **client:** add connection pooling option ([9dcb580](https://github.com/OneBusAway/java-sdk/commit/9dcb580bc844c9f90296c4e4a2a8c2c53b70bb95))


### Chores

* **internal:** make `OkHttp` constructor internal ([ac8f1c2](https://github.com/OneBusAway/java-sdk/commit/ac8f1c28e6ec0a636fa725bd9f033703388b3282))

## 0.1.0-alpha.52 (2026-02-18)

Full Changelog: [v0.1.0-alpha.51...v0.1.0-alpha.52](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.51...v0.1.0-alpha.52)

### Chores

* **internal:** update `TestServerExtension` comment ([5d66e53](https://github.com/OneBusAway/java-sdk/commit/5d66e53e2c70e34e939d717a688a9a85bbb3bbfd))

## 0.1.0-alpha.51 (2026-02-07)

Full Changelog: [v0.1.0-alpha.50...v0.1.0-alpha.51](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.50...v0.1.0-alpha.51)

### Chores

* **internal:** upgrade AssertJ ([aae1bab](https://github.com/OneBusAway/java-sdk/commit/aae1bab6fcc34c5998e4c0a467de9dcb73026ff4))

## 0.1.0-alpha.50 (2026-01-31)

Full Changelog: [v0.1.0-alpha.49...v0.1.0-alpha.50](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.49...v0.1.0-alpha.50)

### Chores

* **internal:** allow passing args to `./scripts/test` ([2d5fc39](https://github.com/OneBusAway/java-sdk/commit/2d5fc39e92abdc943ac69f4b06120e06ec7d91ec))

## 0.1.0-alpha.49 (2026-01-24)

Full Changelog: [v0.1.0-alpha.48...v0.1.0-alpha.49](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.48...v0.1.0-alpha.49)

### Bug Fixes

* **client:** preserve time zone in lenient date-time parsing ([99572e3](https://github.com/OneBusAway/java-sdk/commit/99572e3a8c05fb5d37d5ba1ed63aae58a49326d6))


### Chores

* **ci:** upgrade `actions/github-script` ([7501fdc](https://github.com/OneBusAway/java-sdk/commit/7501fdca0669d7c6492620d8ab92206357fd142b))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([2625cdd](https://github.com/OneBusAway/java-sdk/commit/2625cddb2178d4c800e97f12440f51d96cc22a97))

## 0.1.0-alpha.48 (2026-01-22)

Full Changelog: [v0.1.0-alpha.47...v0.1.0-alpha.48](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.47...v0.1.0-alpha.48)

### Features

* **client:** send `X-Stainless-Kotlin-Version` header ([acd3860](https://github.com/OneBusAway/java-sdk/commit/acd3860b3b99dffd71f1e9a8f2e554f0b984aaca))


### Chores

* **internal:** update maven repo doc to include authentication ([647f6b5](https://github.com/OneBusAway/java-sdk/commit/647f6b54a992e0e9f131420c3c7ca9168a85b33b))

## 0.1.0-alpha.47 (2026-01-17)

Full Changelog: [v0.1.0-alpha.46...v0.1.0-alpha.47](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.46...v0.1.0-alpha.47)

### Bug Fixes

* **client:** disallow coercion from float to int ([7455e7f](https://github.com/OneBusAway/java-sdk/commit/7455e7fabfca0fa03bae97ffe09afc993f153d64))
* **client:** fully respect max retries ([814f38c](https://github.com/OneBusAway/java-sdk/commit/814f38ce0cba11f4517205d2834d324ad62368dd))
* **client:** send retry count header for max retries 0 ([814f38c](https://github.com/OneBusAway/java-sdk/commit/814f38ce0cba11f4517205d2834d324ad62368dd))
* date time deserialization leniency ([32945ab](https://github.com/OneBusAway/java-sdk/commit/32945ab3cebb1771692105447c58669a1b015b66))


### Chores

* **ci:** upgrade `actions/setup-java` ([efba5c4](https://github.com/OneBusAway/java-sdk/commit/efba5c4cfd981b9a40888f32fef1d8813d46b076))
* **internal:** clean up maven repo artifact script and add html documentation to repo root ([75e739a](https://github.com/OneBusAway/java-sdk/commit/75e739ad6e188354083dc1edd80e2d5c4ce848dc))
* **internal:** depend on packages directly in example ([814f38c](https://github.com/OneBusAway/java-sdk/commit/814f38ce0cba11f4517205d2834d324ad62368dd))
* **internal:** improve maven repo docs ([214feba](https://github.com/OneBusAway/java-sdk/commit/214feba0154c64ddcfbe4142a18c581e5167074b))
* **internal:** update `actions/checkout` version ([e69a85a](https://github.com/OneBusAway/java-sdk/commit/e69a85a1cef632cfe7519003453cd73cf707d279))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/OneBusAway/java-sdk/issues/3240) in tests ([32945ab](https://github.com/OneBusAway/java-sdk/commit/32945ab3cebb1771692105447c58669a1b015b66))

## 0.1.0-alpha.46 (2026-01-13)

Full Changelog: [v0.1.0-alpha.45...v0.1.0-alpha.46](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.45...v0.1.0-alpha.46)

### Chores

* **internal:** support uploading Maven repo artifacts to stainless package server ([4bc9781](https://github.com/OneBusAway/java-sdk/commit/4bc9781829c01677527b5b3dce191908ac6e2a8d))

## 0.1.0-alpha.45 (2026-01-09)

Full Changelog: [v0.1.0-alpha.44...v0.1.0-alpha.45](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.44...v0.1.0-alpha.45)

### Features

* **client:** add `HttpRequest#url()` method ([d7e318b](https://github.com/OneBusAway/java-sdk/commit/d7e318b548f644a4dc9e55f5ebc6604282fe57a3))
* **client:** allow configuring dispatcher executor service ([4ff1629](https://github.com/OneBusAway/java-sdk/commit/4ff16297c9acc59aba99ff7cb1fe278e73c7d38b))

## 0.1.0-alpha.44 (2025-12-03)

Full Changelog: [v0.1.0-alpha.43...v0.1.0-alpha.44](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.43...v0.1.0-alpha.44)

### Documentation

* remove `$` for better copy-pasteabality ([46951ba](https://github.com/OneBusAway/java-sdk/commit/46951ba7f06628a819405b362528401621aa3398))

## 0.1.0-alpha.43 (2025-11-27)

Full Changelog: [v0.1.0-alpha.42...v0.1.0-alpha.43](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.42...v0.1.0-alpha.43)

### Bug Fixes

* **client:** cancel okhttp call when future cancelled ([cdbf828](https://github.com/OneBusAway/java-sdk/commit/cdbf828a4f00dfff3c6cff8ef87cae984c297cb7))

## 0.1.0-alpha.42 (2025-11-14)

Full Changelog: [v0.1.0-alpha.41...v0.1.0-alpha.42](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.41...v0.1.0-alpha.42)

### Bug Fixes

* **client:** multi-value header serialization ([01b57d3](https://github.com/OneBusAway/java-sdk/commit/01b57d3a01c2c628b5559e020bc1b85583d7495c))

## 0.1.0-alpha.41 (2025-09-26)

Full Changelog: [v0.1.0-alpha.40...v0.1.0-alpha.41](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.40...v0.1.0-alpha.41)

### Bug Fixes

* **client:** deserialization of empty objects ([7061257](https://github.com/OneBusAway/java-sdk/commit/70612576669e680829aabd44e20d3d89e445ab91))

## 0.1.0-alpha.40 (2025-09-20)

Full Changelog: [v0.1.0-alpha.39...v0.1.0-alpha.40](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.39...v0.1.0-alpha.40)

### Features

* **client:** expose sleeper option ([9c57ef5](https://github.com/OneBusAway/java-sdk/commit/9c57ef569421965bce99ce27f8358c5eb20caa52))


### Bug Fixes

* **client:** ensure single timer is created per client ([9c57ef5](https://github.com/OneBusAway/java-sdk/commit/9c57ef569421965bce99ce27f8358c5eb20caa52))


### Chores

* **internal:** codegen related update ([ccef12d](https://github.com/OneBusAway/java-sdk/commit/ccef12dd603250750b17aaeded659ea7c0b4b82d))
* **internal:** codegen related update ([96fbb1e](https://github.com/OneBusAway/java-sdk/commit/96fbb1e00da731ee2f86acfa8ec03b9868661bd7))

## 0.1.0-alpha.39 (2025-09-13)

Full Changelog: [v0.1.0-alpha.38...v0.1.0-alpha.39](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.38...v0.1.0-alpha.39)

### Chores

* improve formatter performance ([34a4390](https://github.com/OneBusAway/java-sdk/commit/34a4390f6087d3d532aeeab138e10a02199f3cc3))
* **internal:** codegen related update ([f52bc12](https://github.com/OneBusAway/java-sdk/commit/f52bc129a49fcbdeff69f8d93bea0fa2bb4a319e))
* **internal:** codegen related update ([691195c](https://github.com/OneBusAway/java-sdk/commit/691195c6e62b0d805ae1a013193e1713df612877))

## 0.1.0-alpha.38 (2025-09-04)

Full Changelog: [v0.1.0-alpha.37...v0.1.0-alpha.38](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.37...v0.1.0-alpha.38)

### Bug Fixes

* **ci:** use java-version 21 for publish step ([a49cd4d](https://github.com/OneBusAway/java-sdk/commit/a49cd4dbfc8864b62779ef104947a631f5c41455))

## 0.1.0-alpha.37 (2025-08-31)

Full Changelog: [v0.1.0-alpha.36...v0.1.0-alpha.37](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.36...v0.1.0-alpha.37)

### Performance Improvements

* **internal:** make formatting faster ([99fbd78](https://github.com/OneBusAway/java-sdk/commit/99fbd78f052b7bd28679a4e4ca63e5486909b40c))


### Chores

* **ci:** add build job ([e9a4334](https://github.com/OneBusAway/java-sdk/commit/e9a4334ed4def5ff07ef7ad9fc959d86531423d4))
* **ci:** reduce log noise ([a44cd60](https://github.com/OneBusAway/java-sdk/commit/a44cd60b985c90043721fdd5e59913bbee7001ef))
* **client:** refactor closing / shutdown ([1a3f6c5](https://github.com/OneBusAway/java-sdk/commit/1a3f6c59f0a6215188bbce3d1117f1008b7e4008))
* increase max gradle JVM heap to 8GB ([09fe22c](https://github.com/OneBusAway/java-sdk/commit/09fe22c50fd3025c2f1da7a37218d6cbfc8a04d9))
* **internal:** codegen related update ([fcda4f9](https://github.com/OneBusAway/java-sdk/commit/fcda4f9e3cadf6574f110689ddb80fda9fe3e87b))
* **internal:** dynamically determine included projects ([87d4c56](https://github.com/OneBusAway/java-sdk/commit/87d4c56d8a6f24de52544ade996e83dd65bedbe0))
* **internal:** support passing arguments to test script ([7bad9c0](https://github.com/OneBusAway/java-sdk/commit/7bad9c0a8741e9ffd6432856434a48a9d76af7af))
* **internal:** support running formatters directly ([bd33d83](https://github.com/OneBusAway/java-sdk/commit/bd33d83283a843365951f3b6f7de65367ae7bcd7))
* **internal:** update comment in script ([d037c17](https://github.com/OneBusAway/java-sdk/commit/d037c17a5b778fc55c8e30534bfd50f23f4d0984))
* remove memory upper bound from publishing step ([9710ffe](https://github.com/OneBusAway/java-sdk/commit/9710ffe8cbce1fbc8870aa4de279524e40ea4153))
* update @stainless-api/prism-cli to v5.15.0 ([3f2a043](https://github.com/OneBusAway/java-sdk/commit/3f2a043a8a41078b57b5d2afa8052824b60d6a43))

## 0.1.0-alpha.36 (2025-08-06)

Full Changelog: [v0.1.0-alpha.35...v0.1.0-alpha.36](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.35...v0.1.0-alpha.36)

### Chores

* **example:** fix run example comment ([0e6c265](https://github.com/OneBusAway/java-sdk/commit/0e6c265bb71ed5edbe6d556cad5b864f853f2441))

## 0.1.0-alpha.35 (2025-08-05)

Full Changelog: [v0.1.0-alpha.34...v0.1.0-alpha.35](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.34...v0.1.0-alpha.35)

### Chores

* **internal:** add async lock helper ([63451dd](https://github.com/OneBusAway/java-sdk/commit/63451dd73826cddeb322fe779cf797b06c4b490a))

## 0.1.0-alpha.34 (2025-08-01)

Full Changelog: [v0.1.0-alpha.33...v0.1.0-alpha.34](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.33...v0.1.0-alpha.34)

### Bug Fixes

* **client:** r8 support ([dbca2b6](https://github.com/OneBusAway/java-sdk/commit/dbca2b6f65b33feb5dac137c43976ee53adf1586))


### Chores

* **internal:** bump ci test timeout ([6139a45](https://github.com/OneBusAway/java-sdk/commit/6139a454dea5b2df944e1ff9e51ee68102048eb1))
* **internal:** reduce proguard ci logging ([0953534](https://github.com/OneBusAway/java-sdk/commit/09535340857380e8bb7ec1112aafd2b84efb55dc))

## 0.1.0-alpha.33 (2025-07-30)

Full Changelog: [v0.1.0-alpha.32...v0.1.0-alpha.33](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.32...v0.1.0-alpha.33)

### Features

* add retryable exception ([f679fac](https://github.com/OneBusAway/java-sdk/commit/f679fac35bb7b6695d80dc3819f7d6ec884e9cc8))

## 0.1.0-alpha.32 (2025-07-29)

Full Changelog: [v0.1.0-alpha.31...v0.1.0-alpha.32](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.31...v0.1.0-alpha.32)

### Features

* **client:** ensure compat with proguard ([06bc3af](https://github.com/OneBusAway/java-sdk/commit/06bc3afc80e34e726f835bbe3eca0ec8dc3c4d43))

## 0.1.0-alpha.31 (2025-07-25)

Full Changelog: [v0.1.0-alpha.30...v0.1.0-alpha.31](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.30...v0.1.0-alpha.31)

### Chores

* **internal:** remove unnecessary `[...]` in `[@see](https://github.com/see)` ([bb19ff1](https://github.com/OneBusAway/java-sdk/commit/bb19ff1cd43642f3023f3e521509c424142e9f36))


### Documentation

* more code comments ([07cd62d](https://github.com/OneBusAway/java-sdk/commit/07cd62d5e4d6479f61961f0e75eb3a507fd4516c))

## 0.1.0-alpha.30 (2025-07-24)

Full Changelog: [v0.1.0-alpha.29...v0.1.0-alpha.30](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.29...v0.1.0-alpha.30)

### Documentation

* fix missing readme comment ([a9d4615](https://github.com/OneBusAway/java-sdk/commit/a9d4615d619845152576922ee4869bdb2a74ae4e))

## 0.1.0-alpha.29 (2025-07-22)

Full Changelog: [v0.1.0-alpha.28...v0.1.0-alpha.29](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.28...v0.1.0-alpha.29)

### Features

* **client:** add `{QueryParams,Headers}#put(String, JsonValue)` methods ([6994f02](https://github.com/OneBusAway/java-sdk/commit/6994f026a6c7abb90a0bfec9ebb213f51dcf9347))
* **client:** allow configuring env via system properties ([8f26ee5](https://github.com/OneBusAway/java-sdk/commit/8f26ee53d24819972943490215990c79d929b2fd))

## 0.1.0-alpha.28 (2025-07-19)

Full Changelog: [v0.1.0-alpha.27...v0.1.0-alpha.28](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.27...v0.1.0-alpha.28)

### Features

* **client:** add https config options ([33a2005](https://github.com/OneBusAway/java-sdk/commit/33a20057b47858e95ed95e55929f53de8d1ea730))


### Bug Fixes

* **client:** ensure error handling always occurs ([2673594](https://github.com/OneBusAway/java-sdk/commit/2673594be236598da80ba68129dbf43f6c6c9c63))


### Chores

* **internal:** refactor delegating from client to options ([4fcb8ab](https://github.com/OneBusAway/java-sdk/commit/4fcb8abd83fe8b32a232364375a8f5e0051f8416))

## 0.1.0-alpha.27 (2025-07-17)

Full Changelog: [v0.1.0-alpha.26...v0.1.0-alpha.27](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.26...v0.1.0-alpha.27)

### Chores

* **ci:** bump `actions/setup-java` to v4 ([152dd66](https://github.com/OneBusAway/java-sdk/commit/152dd6617f35f4b040410306f394dd63c7df95e8))
* **internal:** allow running specific example from cli ([ac73bf1](https://github.com/OneBusAway/java-sdk/commit/ac73bf1bd0d3cd74dfb3a0bd46d47e79debd6d61))

## 0.1.0-alpha.26 (2025-07-09)

Full Changelog: [v0.1.0-alpha.25...v0.1.0-alpha.26](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.25...v0.1.0-alpha.26)

### Chores

* **ci:** ensure docs generation always succeeds ([af735e6](https://github.com/OneBusAway/java-sdk/commit/af735e631940318c9127efeedf587d10c563aa51))

## 0.1.0-alpha.25 (2025-07-07)

Full Changelog: [v0.1.0-alpha.24...v0.1.0-alpha.25](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.24...v0.1.0-alpha.25)

### Chores

* **internal:** version bump ([97b8b21](https://github.com/OneBusAway/java-sdk/commit/97b8b21fb686dbf3ec55c42b57a69353a14ee6e8))

## 0.1.0-alpha.24 (2025-07-07)

Full Changelog: [v0.1.0-alpha.23...v0.1.0-alpha.24](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.23...v0.1.0-alpha.24)

### Features

* **api:** api update ([a9266bd](https://github.com/OneBusAway/java-sdk/commit/a9266bd3053952157431e4aee9b36aae6b637164))
* **api:** manual updates ([#74](https://github.com/OneBusAway/java-sdk/issues/74)) ([ddda17b](https://github.com/OneBusAway/java-sdk/commit/ddda17b7186ef701720740c946250b5fa902a4cc))


### Chores

* **internal:** codegen related update ([8f6f893](https://github.com/OneBusAway/java-sdk/commit/8f6f893129b9b061d933432fc8ecc36be5e5ad7f))
* **internal:** codegen related update ([#71](https://github.com/OneBusAway/java-sdk/issues/71)) ([c5e90c0](https://github.com/OneBusAway/java-sdk/commit/c5e90c0cda29a9131fd81e60d22711794a2f0a71))
* **internal:** codegen related update ([#73](https://github.com/OneBusAway/java-sdk/issues/73)) ([a45c6b0](https://github.com/OneBusAway/java-sdk/commit/a45c6b0bc2f45328c1365db12b9ed2fca0d85ce6))
* **internal:** codegen related update ([#75](https://github.com/OneBusAway/java-sdk/issues/75)) ([a433a99](https://github.com/OneBusAway/java-sdk/commit/a433a99937fdc1729f36a4e7d16a8d90137758e8))
* **internal:** codegen related update ([#76](https://github.com/OneBusAway/java-sdk/issues/76)) ([a8f595e](https://github.com/OneBusAway/java-sdk/commit/a8f595e2ee1038f8161ab784fd189d074f375d07))
* **internal:** codegen related update ([#77](https://github.com/OneBusAway/java-sdk/issues/77)) ([14ea7b7](https://github.com/OneBusAway/java-sdk/commit/14ea7b7438268138410dca70f28807ec06f5c5b0))
* **internal:** codegen related update ([#78](https://github.com/OneBusAway/java-sdk/issues/78)) ([51a4c8c](https://github.com/OneBusAway/java-sdk/commit/51a4c8cab3782706a773525083c4b17da4543064))
* **internal:** update example values ([#72](https://github.com/OneBusAway/java-sdk/issues/72)) ([9f7aadf](https://github.com/OneBusAway/java-sdk/commit/9f7aadf0b9229f441f1dbfed4b64035f195c3b1e))

## 0.1.0-alpha.23 (2024-11-29)

Full Changelog: [v0.1.0-alpha.22...v0.1.0-alpha.23](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.22...v0.1.0-alpha.23)

### Features

* **api:** api update ([#65](https://github.com/OneBusAway/java-sdk/issues/65)) ([e1cdfe0](https://github.com/OneBusAway/java-sdk/commit/e1cdfe0c4376e95396eea0752e59364e9a271c39))
* **api:** api update ([#67](https://github.com/OneBusAway/java-sdk/issues/67)) ([96c38d4](https://github.com/OneBusAway/java-sdk/commit/96c38d45b4f5bf26e086a11fe79306325e19b2a7))

## 0.1.0-alpha.22 (2024-11-05)

Full Changelog: [v0.1.0-alpha.21...v0.1.0-alpha.22](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.21...v0.1.0-alpha.22)

### Chores

* rebuild project due to codegen change ([#62](https://github.com/OneBusAway/java-sdk/issues/62)) ([f36db52](https://github.com/OneBusAway/java-sdk/commit/f36db524ee6dc538e370148bb04e29a2b0316dd1))

## 0.1.0-alpha.21 (2024-11-04)

Full Changelog: [v0.1.0-alpha.20...v0.1.0-alpha.21](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.20...v0.1.0-alpha.21)

### Chores

* rebuild project due to codegen change ([#59](https://github.com/OneBusAway/java-sdk/issues/59)) ([7d281c3](https://github.com/OneBusAway/java-sdk/commit/7d281c337d68908e4e6c0b2523065919f3b26455))

## 0.1.0-alpha.20 (2024-11-04)

Full Changelog: [v0.1.0-alpha.19...v0.1.0-alpha.20](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.19...v0.1.0-alpha.20)

### Chores

* rebuild project due to codegen change ([#57](https://github.com/OneBusAway/java-sdk/issues/57)) ([8994079](https://github.com/OneBusAway/java-sdk/commit/899407978ac6a5e0fc2f96145d4cab6bd0172cdb))

## 0.1.0-alpha.19 (2024-11-01)

Full Changelog: [v0.1.0-alpha.18...v0.1.0-alpha.19](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.18...v0.1.0-alpha.19)

### Chores

* rebuild project due to codegen change ([#54](https://github.com/OneBusAway/java-sdk/issues/54)) ([d89979d](https://github.com/OneBusAway/java-sdk/commit/d89979d652a3b8100488b21343f6634ec62c769f))

## 0.1.0-alpha.18 (2024-11-01)

Full Changelog: [v0.1.0-alpha.17...v0.1.0-alpha.18](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.17...v0.1.0-alpha.18)

### Chores

* rebuild project due to codegen change ([#51](https://github.com/OneBusAway/java-sdk/issues/51)) ([5a61592](https://github.com/OneBusAway/java-sdk/commit/5a61592abb6aac1f416dd999542f76fabff87854))

## 0.1.0-alpha.17 (2024-11-01)

Full Changelog: [v0.1.0-alpha.16...v0.1.0-alpha.17](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.16...v0.1.0-alpha.17)

### Chores

* rebuild project due to codegen change ([#48](https://github.com/OneBusAway/java-sdk/issues/48)) ([0acd03d](https://github.com/OneBusAway/java-sdk/commit/0acd03dd94e7b976234b75acab3cba022b07bca3))

## 0.1.0-alpha.16 (2024-10-30)

Full Changelog: [v0.1.0-alpha.15...v0.1.0-alpha.16](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.15...v0.1.0-alpha.16)

### Chores

* rebuild project due to codegen change ([#45](https://github.com/OneBusAway/java-sdk/issues/45)) ([dbbf637](https://github.com/OneBusAway/java-sdk/commit/dbbf6370c53ff40309a6e2aeae29d2fde5fd565c))

## 0.1.0-alpha.15 (2024-10-30)

Full Changelog: [v0.1.0-alpha.14...v0.1.0-alpha.15](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.14...v0.1.0-alpha.15)

### Chores

* rebuild project due to codegen change ([#43](https://github.com/OneBusAway/java-sdk/issues/43)) ([0410a3a](https://github.com/OneBusAway/java-sdk/commit/0410a3a8be6c0c848026bf7963336e26af69a931))

## 0.1.0-alpha.14 (2024-10-30)

Full Changelog: [v0.1.0-alpha.13...v0.1.0-alpha.14](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.13...v0.1.0-alpha.14)

### Chores

* rebuild project due to codegen change ([#40](https://github.com/OneBusAway/java-sdk/issues/40)) ([80f3744](https://github.com/OneBusAway/java-sdk/commit/80f3744e2859a56fd622f4ae2ea7c0117a65bad4))

## 0.1.0-alpha.13 (2024-10-28)

Full Changelog: [v0.1.0-alpha.12...v0.1.0-alpha.13](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.12...v0.1.0-alpha.13)

### Chores

* rebuild project due to codegen change ([#37](https://github.com/OneBusAway/java-sdk/issues/37)) ([cadf9d3](https://github.com/OneBusAway/java-sdk/commit/cadf9d3c803c89e67896bd8aaf38e13b6f4c0664))

## 0.1.0-alpha.12 (2024-10-25)

Full Changelog: [v0.1.0-alpha.11...v0.1.0-alpha.12](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.11...v0.1.0-alpha.12)

### Chores

* rebuild project due to codegen change ([#34](https://github.com/OneBusAway/java-sdk/issues/34)) ([c61cdcf](https://github.com/OneBusAway/java-sdk/commit/c61cdcf24faabe76aed951df8edfe2f148d9ae58))

## 0.1.0-alpha.11 (2024-10-25)

Full Changelog: [v0.1.0-alpha.10...v0.1.0-alpha.11](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.10...v0.1.0-alpha.11)

### Chores

* rebuild project due to codegen change ([#31](https://github.com/OneBusAway/java-sdk/issues/31)) ([3da20f0](https://github.com/OneBusAway/java-sdk/commit/3da20f0b3322e82d29aa2c595b27ddd2b4b3069f))

## 0.1.0-alpha.10 (2024-10-25)

Full Changelog: [v0.1.0-alpha.9...v0.1.0-alpha.10](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.9...v0.1.0-alpha.10)

### Chores

* rebuild project due to codegen change ([#28](https://github.com/OneBusAway/java-sdk/issues/28)) ([544f691](https://github.com/OneBusAway/java-sdk/commit/544f691ad4d4857af7da87b92c7f956a42fc0154))

## 0.1.0-alpha.9 (2024-10-23)

Full Changelog: [v0.1.0-alpha.8...v0.1.0-alpha.9](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.8...v0.1.0-alpha.9)

### Features

* **api:** api update ([#25](https://github.com/OneBusAway/java-sdk/issues/25)) ([1fb1c0c](https://github.com/OneBusAway/java-sdk/commit/1fb1c0c461d0153e1991cbdcb2ca7b30d8953f3f))

## 0.1.0-alpha.8 (2024-10-23)

Full Changelog: [v0.1.0-alpha.7...v0.1.0-alpha.8](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.7...v0.1.0-alpha.8)

### Features

* **api:** api update ([#22](https://github.com/OneBusAway/java-sdk/issues/22)) ([3a97b33](https://github.com/OneBusAway/java-sdk/commit/3a97b33a09ff7b0113cbe9bf11b7b68bf7f48850))

## 0.1.0-alpha.7 (2024-10-22)

Full Changelog: [v0.1.0-alpha.6...v0.1.0-alpha.7](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.6...v0.1.0-alpha.7)

### Features

* **api:** api update ([#19](https://github.com/OneBusAway/java-sdk/issues/19)) ([39eac34](https://github.com/OneBusAway/java-sdk/commit/39eac341473071dfa331f359730f0371df3ba71e))

## 0.1.0-alpha.6 (2024-10-04)

Full Changelog: [v0.1.0-alpha.5...v0.1.0-alpha.6](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.5...v0.1.0-alpha.6)

### Chores

* **internal:** codegen related update ([#16](https://github.com/OneBusAway/java-sdk/issues/16)) ([cb43600](https://github.com/OneBusAway/java-sdk/commit/cb4360080a5b99050f72e16edabdc542e3a58615))

## 0.1.0-alpha.5 (2024-10-04)

Full Changelog: [v0.1.0-alpha.4...v0.1.0-alpha.5](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.4...v0.1.0-alpha.5)

### Features

* feat: build gradle file for the examples ([ca60afd](https://github.com/OneBusAway/java-sdk/commit/ca60afddfc983dc517375a72fd6d3f70201b2bf2))
* feat: Java examples ([782ab17](https://github.com/OneBusAway/java-sdk/commit/782ab1748d7268e8befc3028c98146d0c1398a81))
* feat: Java examples ([3409162](https://github.com/OneBusAway/java-sdk/commit/34091627a89eed6f5d42ae9ee401df3c0aea2e1e))
* feat: Java examples ([b1c0c68](https://github.com/OneBusAway/java-sdk/commit/b1c0c68aa6b14f6bf48b0c8544bea40341cfe83d))

## 0.1.0-alpha.4 (2024-10-03)

Full Changelog: [v0.1.0-alpha.3...v0.1.0-alpha.4](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.3...v0.1.0-alpha.4)

### Features

* chore: linting and formatting ([a5bd78b](https://github.com/OneBusAway/java-sdk/commit/a5bd78b993afc0fdf9262d00449959564b8f7005))
* fix: remove hashCode variable ([eee87e7](https://github.com/OneBusAway/java-sdk/commit/eee87e7bbcd54a1352231b07d4ec921ace56f020))

## 0.1.0-alpha.3 (2024-10-03)

Full Changelog: [v0.1.0-alpha.2...v0.1.0-alpha.3](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.2...v0.1.0-alpha.3)

### Chores

* **internal:** codegen related update ([#7](https://github.com/OneBusAway/java-sdk/issues/7)) ([ca7150a](https://github.com/OneBusAway/java-sdk/commit/ca7150a121355cdf5fc7c22ae283c9e680a5de61))
* **internal:** codegen related update ([#9](https://github.com/OneBusAway/java-sdk/issues/9)) ([dfc2794](https://github.com/OneBusAway/java-sdk/commit/dfc2794f244796f1041b91c6bc01ef81c7b7a8be))

## 0.1.0-alpha.2 (2024-09-30)

Full Changelog: [v0.1.0-alpha.1...v0.1.0-alpha.2](https://github.com/OneBusAway/java-sdk/compare/v0.1.0-alpha.1...v0.1.0-alpha.2)

### Features

* **api:** manual updates ([#4](https://github.com/OneBusAway/java-sdk/issues/4)) ([e9c7b74](https://github.com/OneBusAway/java-sdk/commit/e9c7b741ad5a0469d4f44899a0be89fc14ad2246))

## 0.1.0-alpha.1 (2024-09-27)

Full Changelog: [v0.0.1-alpha.0...v0.1.0-alpha.1](https://github.com/OneBusAway/java-sdk/compare/v0.0.1-alpha.0...v0.1.0-alpha.1)

### Features

* Add agency example ([ef7448f](https://github.com/OneBusAway/java-sdk/commit/ef7448f639977458579dbbcd91aca908ccb1d0a7))
* **api:** OpenAPI spec update via Stainless API ([b4786b0](https://github.com/OneBusAway/java-sdk/commit/b4786b0c41b22ea2a43d990f65084c4029732025))
* **client:** added structured fields to errors ([9687ab3](https://github.com/OneBusAway/java-sdk/commit/9687ab3b832c6c505510a0a9a303c477a4757ad7))


### Chores

* configure new SDK language ([cf9cd4c](https://github.com/OneBusAway/java-sdk/commit/cf9cd4cbf0e67e73caa5a2bd774f5a7ea9881ad9))
* go live ([#1](https://github.com/OneBusAway/java-sdk/issues/1)) ([1066566](https://github.com/OneBusAway/java-sdk/commit/10665665d9098194a0a9247c7514480c95ed7e88))
* **internal:** codegen related update ([230e249](https://github.com/OneBusAway/java-sdk/commit/230e249b9eaf1067b8d121a85ca9532e98739980))
* **internal:** codegen related update ([648c03d](https://github.com/OneBusAway/java-sdk/commit/648c03db5003b6fb53797fbbf71f68e999c5c8f1))


### Documentation

* adjust additional properties example ([eca27c4](https://github.com/OneBusAway/java-sdk/commit/eca27c4625b1b4b024f8245d7848930b9549c4f9))


### Refactors

* formatting and linting ([1424931](https://github.com/OneBusAway/java-sdk/commit/1424931d51b31cf21947435ba4ce968097254c19))
* list to use kotlin.collections.List ([345cd26](https://github.com/OneBusAway/java-sdk/commit/345cd261a37568db62dabb964322068894f09857))
