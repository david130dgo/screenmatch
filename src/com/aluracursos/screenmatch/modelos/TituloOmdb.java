package com.aluracursos.screenmatch.modelos;

public record TituloOmdb(String title, String  year, String runtime) {
    @Override
    public String toString() {
        return "Título= " + title + "\n" +
                "Fecha de lanzamiento= " + year + '\n' +
                "Duración en minutos= " + runtime + '\n';
    }
}
