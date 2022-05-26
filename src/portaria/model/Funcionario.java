/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portaria.model;

/**
 *
 * @author Pichau
 */

public class Funcionario extends Pessoa {
    private String email, senha;
    private Boolean isADM;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getIsADM() {
        return isADM;
    }

    public void setIsADM(Boolean isADM) {
        this.isADM = isADM;
    }
    
    
    public Funcionario(){}
    
    public Funcionario(String nome, String CPF, int idade, int id, String email, String senha, Boolean isADM){
        super(nome, CPF, idade, id);
        this.email = email;
        this.senha = senha;
        this.isADM = isADM;
        
    }
    
    @Override
    public String toString(){
        return String.format("Funcionario{id_funcionario = %d, nome_funcionario= %s, cpf_funcionario= %s, idade_funcionario= %d, email_funcionario= %s, senha_funcionario= %s, is_adm= %b",
                super.getId(), super.getNome(), super.getCPF(), super.getIdade(), this.email, this.senha, this.isADM);
    }
    
}