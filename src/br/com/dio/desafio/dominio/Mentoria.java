package br.com.dio.desafio.dominio;

import javax.swing.*;
import java.time.LocalDate;

public class Mentoria {
    private Spring titulo;
   private Spring descricao;
   private LocalDate data;

    public Mentoria(Spring titulo, Spring descricao, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Spring getTitulo() {
        return titulo;
    }

    public void setTitulo(Spring titulo) {
        this.titulo = titulo;
    }

    public Spring getDescricao() {
        return descricao;
    }

    public void setDescricao(Spring descricao) {
        this.descricao = descricao;
    }

    public int getCargaoraria() {
        int cargaoraria;
        return cargaoraria;
    }

    public void setCargaoraria(int cargaoraria) {
        this.cargaoraria = cargaoraria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo=" + titulo +
                ", descricao=" + descricao +
                ", data=" + data +
                '}';
    }
}
