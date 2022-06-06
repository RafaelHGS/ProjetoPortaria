/*
    Criação de dados/objeto que é a representação de morador
*/


package portaria.model;

import java.sql.*;
public class Morador extends Pessoa {

    private int numCondominio;
    private int numBloco;
    private boolean vagaEstacionamento;
    private Timestamp dtCadastro;

    public int getNumCondominio() {
        return numCondominio;
    }

    public void setNumCondominio(int numCondominio) {
        this.numCondominio = numCondominio;
    }

    public int getNumBloco() {
        return numBloco;
    }

    public void setNumBloco(int numBloco) {
        this.numBloco = numBloco;
    }

    public boolean isVagaEstacionamento() {
        return vagaEstacionamento;
    }

    public void setVagaEstacionamento(boolean vagaEstacionamento) {
        this.vagaEstacionamento = vagaEstacionamento;
    }

    public Timestamp getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Timestamp dtCadastro) {
        this.dtCadastro = dtCadastro;
    }
    
    //Construtores
    public Morador() {
    }

    public Morador(String nome, String CPF, int idade, int numCondominio, int numBloco, boolean vagaEstacionamento) {
        super(nome, CPF, idade);
        this.numCondominio = numCondominio;
        this.numBloco = numBloco;
        this.vagaEstacionamento = vagaEstacionamento;
    }

    @Override
    public String toString(){
        return String.format("Morador{id_morador = %d, nome_morador= %s, cpf_morador= %s, idade_morador= %d, num_condominio= %s, num_bloco= %s, vaga_estacionamento= %b, dt_cadastro= %s",
                super.getId(), super.getNome(), super.getCPF(), super.getIdade(), this.numCondominio, this.numBloco, this.vagaEstacionamento, this.dtCadastro);
    }
    
}