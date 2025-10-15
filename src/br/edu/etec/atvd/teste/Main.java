/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.atvd.teste;
import br.edu.etec.atvd.model.Aluno;
import br.edu.etec.atvd.model.Funcionario;
import br.edu.etec.atvd.model.Professor;
/**
 *
 * @author Isaac
 */
public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Pedro", "12314", "a", "a", "aa");
        a1.exibirInfo();
        
        Funcionario f1 = new Funcionario("Maria", "12512", "1255", "Seguranca", "123");
        f1.exibirInfo();
        
        Professor p1 = new Professor("Andreia", "12512", "1245", "Professora", "1255", "Portugues");
        p1.exibirInfo();
    }
    
}
