# Changelog

## 1.0.0 (2025-02-24)


### ⚠ BREAKING CHANGES

* implements bag sizes and flavornotes as list  ([#5](https://github.com/KompBasEntw-HTW/products/issues/5))
* change api definitions a bit to simplify hosting

### Features

* add ability to produce stock updted events and produces them after database seeding ([#8](https://github.com/KompBasEntw-HTW/products/issues/8)) ([50b511a](https://github.com/KompBasEntw-HTW/products/commit/50b511a13abf4fdea6d614e1c9b20391c7fccfa6))
* add basic product controller ([6fa01c5](https://github.com/KompBasEntw-HTW/products/commit/6fa01c5a1e5a67fe235db35ae3ed1d3a88ab5260))
* add product entity ([9726974](https://github.com/KompBasEntw-HTW/products/commit/97269744bd1b8f6f7a3a61255af99311aae54c9b))
* add product repository ([197ddfb](https://github.com/KompBasEntw-HTW/products/commit/197ddfb081643034d9d9ec48b7e543a967c7691c))
* add product seeder change boolean to run or not ([549241c](https://github.com/KompBasEntw-HTW/products/commit/549241c7abcdb87aa88638038748be1833b4c51e))
* add proteced route for testing with keycloak ([#9](https://github.com/KompBasEntw-HTW/products/issues/9)) ([40f4077](https://github.com/KompBasEntw-HTW/products/commit/40f4077f65c2fbf26bfa319de976e89e1a43ff6b))
* add quantity to coffee bags randomly assigns a quantity between 0 and 8 ([d10a3a7](https://github.com/KompBasEntw-HTW/products/commit/d10a3a72c5d54b12b382da2822edb34966ac8816))
* add quantity to coffee bags randomly assigns a quantity between 0 and 8 ([#7](https://github.com/KompBasEntw-HTW/products/issues/7)) ([dadb17d](https://github.com/KompBasEntw-HTW/products/commit/dadb17db6c990074ed7155de0ec95acf35f45fa7))
* add redis client ([77cad60](https://github.com/KompBasEntw-HTW/products/commit/77cad60ddf0f8a49c36473909e53e373561e53e6))
* add release please workflow and docker build on release workflow ([920c68d](https://github.com/KompBasEntw-HTW/products/commit/920c68d1c928566ae9eb2919408f4c28569d085b))
* add required endpoints and validation to products controller ([7c06e27](https://github.com/KompBasEntw-HTW/products/commit/7c06e279e58eaa6f847931af018c7b4b1aa32f03))
* add single product endpoint ([928d45a](https://github.com/KompBasEntw-HTW/products/commit/928d45a4ef753c6ca8fc4941600dd9d0996eb4c2))
* change api definitions a bit to simplify hosting ([d831332](https://github.com/KompBasEntw-HTW/products/commit/d8313320f517a5a3e1ba40a52f3e9e1b23d75598))
* change priceModifier in bagsize to volumeDiscount to clarify its meaning ([#6](https://github.com/KompBasEntw-HTW/products/issues/6)) ([2083d3e](https://github.com/KompBasEntw-HTW/products/commit/2083d3e937ec1fa59b376ca848d3dcb0ba81d6ec))
* change product to coffee and seed db with scraped data ([b6396c6](https://github.com/KompBasEntw-HTW/products/commit/b6396c6eb52f4a7b9b45407e64080332b01e8841))
* enable database seeding in production environment ([3e006ce](https://github.com/KompBasEntw-HTW/products/commit/3e006cea4d8be46ed9d817e6940521099f4b9c29))
* implements bag sizes and flavornotes as list  ([#5](https://github.com/KompBasEntw-HTW/products/issues/5)) ([0b1b2c4](https://github.com/KompBasEntw-HTW/products/commit/0b1b2c4b3730e1e47805f328d4d5df62a72cae32))
* migrate to quarkus from spring boot ([8a3f804](https://github.com/KompBasEntw-HTW/products/commit/8a3f80432f851abea18be3b9bd58518fae6ef982))
* refactor order validation ([#10](https://github.com/KompBasEntw-HTW/products/issues/10)) ([5f4df45](https://github.com/KompBasEntw-HTW/products/commit/5f4df45efb915cc25197a537b20efc6182a5e65e))
* Setup Commitlint in product service ([#1](https://github.com/KompBasEntw-HTW/products/issues/1)) ([5299f8b](https://github.com/KompBasEntw-HTW/products/commit/5299f8bd59320b04d9e990175d7712b8394b43eb))
* setup Dockerfile for dev environment enabling live reload in docker container ([99657fa](https://github.com/KompBasEntw-HTW/products/commit/99657fa31ecffdd5df8876ac69be22d7f878a047))
* setup products service spring boot application ([3831dcb](https://github.com/KompBasEntw-HTW/products/commit/3831dcb2de7051dadd29c6337ad125ec058013a5))
* start enabling validation pipeline ([e93ccee](https://github.com/KompBasEntw-HTW/products/commit/e93ccee015ee118c16f1750ccb7a4cd6303c38c9))
* start work on order validation processing in product service ([aef2551](https://github.com/KompBasEntw-HTW/products/commit/aef25513e25ee80c6adae2976a5636b3b554a1bc))
* upgrade to quarkus 3 and switch to gradle ([48ba600](https://github.com/KompBasEntw-HTW/products/commit/48ba6009522e00a44455956885651c3e0cc2992e))
* use cron notation and update every 2 minutes: ([b96199f](https://github.com/KompBasEntw-HTW/products/commit/b96199f6720aeeaefe09d43cb8dd16febc0bc714))


### Bug Fixes

* add rounding down to 10 cents in individual item price calculation ([f00ae86](https://github.com/KompBasEntw-HTW/products/commit/f00ae86e2701b83c625a3559c90de7750660c011))
* change price to pricePerKilo this got lost before somehow ([45460a2](https://github.com/KompBasEntw-HTW/products/commit/45460a233b014a7da7c059a2a5110bce77b572ca))
* indent in quarkus config ([0fc9244](https://github.com/KompBasEntw-HTW/products/commit/0fc924434aa2c82d9eb8ffa440b179b2aa0e7c7f))
* migrate to individual sequence ([59c35e1](https://github.com/KompBasEntw-HTW/products/commit/59c35e196989767656316ce539c928a9cfeb2ed6))
* order validation in prodcut service ([dcf91c7](https://github.com/KompBasEntw-HTW/products/commit/dcf91c7281ba0337d92eced949c720033aa2d14d))
* remove security requirement from swagger ui as it no longer exists ([823d768](https://github.com/KompBasEntw-HTW/products/commit/823d7682e9fb547c9d11ec40cb0c1d4a4036dd74))
* remove transactional annoatation from private method ([e19119f](https://github.com/KompBasEntw-HTW/products/commit/e19119ff438904c6f0d136a50edbd7d1a79f3db4))
* try hardcoding openapi hostname in production ([499471e](https://github.com/KompBasEntw-HTW/products/commit/499471e300ed9bc9fb5bd22a401d70ca3d72cd61))
* use https in prod ([00c1930](https://github.com/KompBasEntw-HTW/products/commit/00c193024eac467fe290878911a03d60bef043ec))
