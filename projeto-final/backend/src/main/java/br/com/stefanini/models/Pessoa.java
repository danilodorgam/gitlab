package br.com.stefanini.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author danilo
 * @version 0.1.0
 * @email maratona@stefanini.com
 * @created 21/09/2021 on 06:35
 */
@Entity
@Table(name="pessoa", schema="H2DB")
@NamedNativeQueries({
        @NamedNativeQuery(name="INSERIR_PESSOA", query = " INSERT INTO H2DB.pessoa (nome, sobrenome, contato, email, cargo) " +
                "VALUES (:nome, :sobrenome, :contato, :email, :cargo) "),
        @NamedNativeQuery(name="LISTAR_PESSOA", query = "select id, nome, sobrenome, contato, email, cargo from H2DB.pessoa ", resultClass = Pessoa.class),
})
public class Pessoa implements Serializable{
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sobrenome")
    private String sobrenome;

    @Column(name = "contato")
    private String contato;

    @Column(name = "email")
    private String email;

    @Column(name = "cargo")
    private int cargo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }
}
