package com.livrojava.imobiliaria;

import javax.swing.JOptionPane;

public class Imovel {
    private int id;
    private String descricao;
    private double metragem;
    private double valorAluguel;
    
    public void CadastarImovel(){
        this.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do Imovel"));
        this.descricao = JOptionPane.showInputDialog("Digite a descrição do Imovel");
        this.metragem = Double.parseDouble(JOptionPane.showInputDialog("Digite a metragem do Imóvel"));
        this.valorAluguel = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Aluguel"));
    }
    
    public String imprimirResumoImovel(){
        String msg = "Id: " + this.id + "\n" + "Descrição: " + this.descricao + "\n";
        msg += "Metragem: " + this.metragem + "\n" + "Valor do Aluguel: " + this.valorAluguel;
        return msg;
    }
    
    public void atualizarValorAnual(double percentualAjuste){
        this.valorAluguel = valorAluguel * (1 + percentualAjuste /100);
    }
    public double getValorAluguel(){
        return this.valorAluguel;
    }
    
}
