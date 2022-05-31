/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portaria.model;

/**
 *
 * @author Pichau
 *
 */
public class Morador extends Pessoa {

    private int numCondominio;
    private int numBloco;
    private boolean vagaEstacionamento;
    private String dtCadastro;

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

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
    }
    
    public Morador() {
    }

    public Morador(String nome, String CPF, int idade, int numCondominio, int numBloco, boolean vagaEstacionamento) {
        super(nome, CPF, idade);
        this.numCondominio = numCondominio;
        this.numBloco = numBloco;
        this.vagaEstacionamento = vagaEstacionamento;
        this.dtCadastro = dtCadastro;
    }

    @Override
    public String toString(){
        return String.format("Morador{id_morador = %d, nome_morador= %s, cpf_morador= %s, idade_morador= %d, num_condominio= %s, num_bloco= %s, vaga_estacionamento= %b, dt_cadastro= %s",
                super.getId(), super.getNome(), super.getCPF(), super.getIdade(), this.numCondominio, this.numBloco, this.vagaEstacionamento, this.dtCadastro);
    }
    
}