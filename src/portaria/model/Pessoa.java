/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portaria.model;

/**
 *
 * @author Pichau
 */
public class Pessoa {
    private String nome, CPF;
    private int idade, id;
    
    public Pessoa(){}
    
    public Pessoa(String nome, String CPF, int idade){
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
    }
    
    public Pessoa(String nome, String CPF, int idade, int id){
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
