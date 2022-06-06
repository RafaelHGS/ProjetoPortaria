/*
    Criação de dados/objeto que é a representação de funcionário/adm
*/
package portaria.model;

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
    
    public Funcionario(String nome, String CPF, int idade, String email, String senha, Boolean isADM){
        super(nome, CPF, idade);
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