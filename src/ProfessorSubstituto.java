/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFNMG
 */
public class ProfessorSubstituto extends Professor {
    private String dataTerminoContrato;

    public ProfessorSubstituto(String dataTerminoContrato, String nome, Servidor coordenador) {
        super(nome, coordenador);
        this.dataTerminoContrato = dataTerminoContrato;
    }
    

    public String getDataTerminoContrato() {
        return dataTerminoContrato;
    }

    public void setDataTerminoContrato(String dataTerminoContrato) {
        this.dataTerminoContrato = dataTerminoContrato;
    }
    
}
