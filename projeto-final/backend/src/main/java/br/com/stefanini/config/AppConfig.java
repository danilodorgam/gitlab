package br.com.stefanini.config;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;
import org.eclipse.microprofile.openapi.annotations.servers.ServerVariable;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        servers = @Server(
                description = "Microserviço Local",
                url = "{host}",
                variables = {
                        @ServerVariable(name = "host",
                                description = "Host da aplicacao",
                                defaultValue = "http://localhost:8080",
                                enumeration = {"http://localhost:8080", "dev.teste.com.br", "hom.test.com.br"})}),
        info = @Info(
                title="Microserviço para Manter (CRURD) Pessoa",
                version = "1.0.0",
                contact = @Contact(
                        name = "Duvidas?",
                        url = "https://gitmaratonadev.stefanini.com.br/",
                        email = "maratona@stefanini.com"))
)
public class AppConfig extends Application {

}
