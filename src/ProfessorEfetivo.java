/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFNMG
 */
public class ProfessorEfetivo extends Professor{
    private int tempoServico;

    public ProfessorEfetivo(int tempoServico, String nome, Servidor coordenador) {
        super(nome, coordenador);
        this.tempoServico = tempoServico;
    }
    

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }
}
