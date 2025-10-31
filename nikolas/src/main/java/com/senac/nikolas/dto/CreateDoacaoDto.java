package com.senac.nikolas.dto;

import java.time.LocalDateTime;

public class CreateDoacaoDto {
    private Integer id ;
    // Integer te obriga a ser inicializado com valor, já o int pode ser null
    private LocalDateTime dataDoacao;
    private Integer valor;

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(LocalDateTime dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
