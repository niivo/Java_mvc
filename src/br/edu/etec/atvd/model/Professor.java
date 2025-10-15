/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.atvd.model;

/**
 *
 * @author Admin
 */
public class Professor extends Funcionario{

    private String disciplina;

    public Professor(String nome, String cpf, String rg, String rf, String cargo, String disciplina) {
        super(nome, cpf, rg, rf, cargo);
        this.disciplina =  disciplina;
    }
    
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
@Override
public void exibirInfo() {
    super.exibirInfo();  // Chama o método da classe Funcionario
    System.out.println("Disciplina: " + getDisciplina());  // Adiciona info da classe Professor
}

    
    
}
