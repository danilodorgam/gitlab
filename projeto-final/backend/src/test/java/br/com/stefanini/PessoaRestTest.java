package br.com.stefanini;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import io.vertx.core.json.JsonObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

/**
 * @author danilo
 * @version 0.1.0
 * @email maratona@stefanini.com
 * @created 23/09/2021 on 20:24
 */
@QuarkusTest
public class PessoaRestTest {
    private final static String URL = "/pessoa";

    @Test
    public void listarPessoaSucessoTest(){
        given()
                .contentType(ContentType.JSON)
                .when().body("")
                .get(URL)
                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("schemas/JsonSchema.json"));
    }
//    @Test
    public void inserirPessoaSucessoTest(){
        String body = montaBody(5,2021, 147639);
        given()
                .contentType(ContentType.JSON)
                .when().body(body)
                .post(URL)
                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("schemas/JsonSchema.json"));
    }

    private String montaBody(Integer parametroUm, Integer parametroDois, Integer parametroTres){
        JsonObject bodyJson = new JsonObject();
        bodyJson.put("nome",parametroUm);
        bodyJson.put("sobrenome",parametroDois);
        bodyJson.put("contato",parametroTres);
        return bodyJson.toString();
    }
}
