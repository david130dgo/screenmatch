package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificable clasificable){
        if(clasificable.getClasificable() >= 4){
            System.out.println("\nMuy bien evaluado en el momento");
        } else if (clasificable.getClasificable() >= 2) {
            System.out.println("Popular en el momento");
        } else {
            System.out.println("Colócalo en tu lista para verlo después");
        }
    }
}
