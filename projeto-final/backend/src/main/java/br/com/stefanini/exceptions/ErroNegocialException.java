package br.com.stefanini.exceptions;

/**
 * @author danilo
 * @version 0.1.0
 * @email maratona@stefanini.com
 * @created 21/09/2021 on 19:16
 */
public class ErroNegocialException extends Exception {

    protected ErroNegocialException(String message){
        super(message);
    }


    public ErroNegocialException(EnumMensagens enumMensagem) {
        super(enumMensagem.getMensagem());
    }

}
