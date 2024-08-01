package com.livrojava.imobiliaria;


public class Imobiliaria {

    public static void main(String[] args) {
        Aluguel aluguel = new Aluguel();
        Locatario locatario = new Locatario();
        Imovel imovel = new Imovel();
        locatario.imprimirResumoLocatario();
        aluguel.locarImovel();
        imovel.imprimirResumoImovel();
        System.out.println(aluguel.validarLocacao(300,1000));
    }
}
