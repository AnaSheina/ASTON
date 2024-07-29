package api;

import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostmanTest {
    private static final String URL = "https://postman-echo.com";

    @Test
    public void getRequestTest() {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecOK200());
        given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .log().all()
                //проверка args
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))

                //проверка headers
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.user-agent", notNullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("headers.postman-token", nullValue())
                .body("headers.cookie", nullValue())
                .body("headers.accept-encoding", equalTo("gzip,deflate"))

                //проверка url
                .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));

    }

    @Test
    public void postRawTextTest() {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecOK200());
        given()
                .contentType("application/json")
                .body("{\"test\":\"value\"}")
                .when()
                .post("/post")
                .then()
                .log().all()

                //проверка headers
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.user-agent", notNullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("headers.postman-token", nullValue())
                .body("headers.cookie", nullValue())
                .body("headers.accept-encoding", equalTo("gzip,deflate"))

                //проверка json
                .body("json.test", equalTo("value"))

                //проверка url
                .body("url", equalTo("https://postman-echo.com/post"));
    }

    @Test
    public void postFormDataTest() {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecOK200());
        given()
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .log().all()

                //проверка headers
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.user-agent", notNullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("headers.postman-token", nullValue())
                .body("headers.cookie", nullValue())
                .body("headers.accept-encoding", equalTo("gzip,deflate"))

                //проверка form
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"))

                //проверка json
                .body("json.foo1", equalTo("bar1"))
                .body("json.foo2", equalTo("bar2"))

                //проверка url
                .body("url", equalTo("https://postman-echo.com/post"));
    }

    @Test
    public void putRequestTest() {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecOK200());
        given()
                .contentType("application/json")
                .body("This is expected to be sent back as part of response body.")
                .when()
                .put("/put")
                .then()
                .log().all()

                //проверка headers
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.user-agent", notNullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("headers.postman-token", nullValue())
                .body("headers.cookie", nullValue())
                .body("headers.accept-encoding", equalTo("gzip,deflate"))

                //проверка data
                .body("data", equalTo("This is expected to be sent back as part of response body."))

                //проверка url
                .body("url", equalTo("https://postman-echo.com/put"));
    }

    @Test
    public void patchRequestTest() {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecOK200());
        given()
                .body("This is expected to be sent back as part of response body.")
                .when()
                .patch("/patch")
                .then()
                .log().all()

                //проверка headers
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.user-agent", notNullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("headers.postman-token", nullValue())
                .body("headers.cookie", nullValue())
                .body("headers.accept-encoding", equalTo("gzip,deflate"))

                //проверка data
                .body("data", equalTo("This is expected to be sent back as part of response body."))

                //проверка url
                .body("url", equalTo("https://postman-echo.com/patch"));
    }

    @Test
    public void deleteRequestTest() {
        Specification.installSpecification(Specification.requestSpec(URL), Specification.responseSpecOK200());
        given()
                .body("This is expected to be sent back as part of response body.")
                .when()
                .delete("/delete")
                .then()
                .log().all()

                //проверка headers
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.user-agent", notNullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("headers.postman-token", nullValue())
                .body("headers.cookie", nullValue())
                .body("headers.accept-encoding", equalTo("gzip,deflate"))

                //проверка data
                .body("data", equalTo("This is expected to be sent back as part of response body."))

                //проверка url
                .body("url", equalTo("https://postman-echo.com/delete"));
    }
}
