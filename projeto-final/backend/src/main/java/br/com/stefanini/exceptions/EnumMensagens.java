package br.com.stefanini.exceptions;

/**
 * @author danilo
 * @version 0.1.0
 * @email maratona@stefanini.com
 * @created 21/09/2021 on 19:17
 */
public enum EnumMensagens {
    ERRO_APLICACAO("000","Erro ao executar"),
    ERRO_SQL("999","Erro no sistema"),
    ;

    String mensagem;
    String codigo;


    EnumMensagens(String codigo, String mensagem) {
        this.codigo = codigo;
        this.mensagem = mensagem;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMensagem() {
        return mensagem;
    }

}
