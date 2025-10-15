/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.atvd.model;

/**
 *
 * @author Admin
 */
public class Funcionario extends Pessoa{
    
    private String rf;
    private String cargo;

    public Funcionario(String nome, String cpf, String rg, String cargo, String rf) {
        super(nome, cpf, rg);
        this.cargo = cargo;
        this.rf = rf;
    }
//metodos de acesso    
    public String getRf() {
        return rf;
    }

    public void setRf(String rf) {
        this.rf = rf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
//-------------------------------------------------------

//metodos normais

    public void exibirInfo(){
        System.out.println("Tabela de funcionarios \n");
        System.out.println("Nome: " + getNome() );
        System.out.println("Rg: " + getRg());
        System.out.println("CPF: " + getCpf());
        System.out.println("RF: " + getRf());
        System.out.println("Cargo: " + getCargo());
    }
}
