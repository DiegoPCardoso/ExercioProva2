/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFNMG
 */
public class ProfessorTemporario extends Professor{
    private int horasTrabalhadas;

    public ProfessorTemporario(int horasTrabalhadas, String nome, Servidor coordenador) {
        super(nome, coordenador);
        this.horasTrabalhadas = horasTrabalhadas;
    }
    

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
