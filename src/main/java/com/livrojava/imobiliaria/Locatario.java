package com.livrojava.imobiliaria;

import javax.swing.JOptionPane;

public class Locatario {
    private int id;
    private String nome;
    private int idade;
    private double salario;
    
    public void cadastrarLocatario(){
        this.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do Locatário"));
        this.nome = JOptionPane.showInputDialog("Digite o nome do Locatário");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Locatário"));
        if (!validarIdade(this.idade)){
            JOptionPane.showMessageDialog(null, "Locatário deve ter 18 anos ou mais");
            return;
        }
        this.salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do Locatário"));
        
    }

    private boolean validarIdade(int idade) {
        return idade >=18;
    }
    
    public String imprimirResumoLocatario(){
        String msg = "Id: " + this.id + "\n";
        msg += "Nome: " + this.nome + "\n";
        msg += "Idade: " + this.idade + "\n";
        msg += "Salário: " + this.salario + "\n";
        return msg;
    }
    
    public double getSalario(){
        return this.salario;
    }
}
