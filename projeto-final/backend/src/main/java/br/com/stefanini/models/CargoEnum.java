package br.com.stefanini.models;

/**
 * @author danilo
 * @version 0.1.0
 * @email maratona@stefanini.com
 * @created 23/09/2021 on 20:18
 */
public enum CargoEnum {
    JR(1,"Analista de Sistemas Jr."),
    PL(1,"Analista de Sistemas Pl."),
    SR(1,"Analista de Sistemas Sr.")
    ;
    private int codigo;
    private String descricao;

    CargoEnum(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
}
