package com.cursomc.cursomc.exceptions;

public class CategoriaNotFoundException extends RuntimeException {

    public CategoriaNotFoundException(String mensagem){
        super(mensagem);
    }

    public CategoriaNotFoundException(String mensagem, Throwable causa){
        super(mensagem,causa);
    }
}
