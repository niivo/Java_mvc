/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.atvd.model;

/**
 *
 * @author Admin
 */
public class Aluno extends Pessoa{

    private String rgm;
    private String turma;

    public Aluno(String nome, String cpf, String rg, String rgm, String turma) {
        super(nome, cpf, rg);
        this.rgm = rgm;
        this.turma = turma;
    }
    
    
//Metodos de acesso    
    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
//--------------------------------------------------------------------
   public void exibirInfo(){
        System.out.println("Registro de alunos \n");
        System.out.println("Nome: " + getNome() );
        System.out.println("Rg: " + getRg());
        System.out.println("CPF: " + getCpf());
        System.out.println("Rgm: " + rgm);
        System.out.println("Turma: " + turma);
    }
}
