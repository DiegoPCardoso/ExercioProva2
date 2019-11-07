/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFNMG
 */
public class AssistenteAdministrativo extends Servidor{
    private String setor;

    
     
    public AssistenteAdministrativo( String nome,String setor) {
        super(nome);
        this.setor = setor;
    }
    

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
