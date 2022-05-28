/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portaria.controller;
import javax.swing.JOptionPane;
import portaria.dao.MoradorDAO;
import portaria.model.Morador;
import portaria.view.TelaConsultaMorador;
import java.util.ArrayList;


/**
 *
 * @author Pichau
 */
public class MoradorController {
    private Morador mor;
    private ArrayList<String[]> arrayMor = new ArrayList<String[]>();
    private MoradorDAO morDAO;
    private TelaConsultaMorador telaL;
    
    //Construtores
    public MoradorController(){}
    
    public MoradorController(TelaConsultaMorador telaL){
        this.telaL = telaL;
    }
    
    public ArrayList<String[]> consulMorador(String nome){
        if (nome.length() >= 0 || nome != null || nome != ""){
            try{
                mor = new Morador();
                morDAO = new MoradorDAO();

                mor.setNome(nome);

                arrayMor = morDAO.connMorador(mor);
                
                if (arrayMor != null){
                    return arrayMor;
                }
                else{
                    return null;
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro na Consulta", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
            else{
            JOptionPane.showMessageDialog(null, "Campos Inválidas", "Erro", JOptionPane.ERROR_MESSAGE);
            telaL.limpaCampos();
        }
        return null;
    }
    
}