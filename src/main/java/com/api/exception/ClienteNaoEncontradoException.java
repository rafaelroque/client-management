package com.api.exception;

import lombok.Data;

@Data
public class ClienteNaoEncontradoException extends RuntimeException{

    private String msg;


    public ClienteNaoEncontradoException(String msg){
        this.msg = msg;
    }

}
