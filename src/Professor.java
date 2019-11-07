/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFNMG
 */
public class Professor extends Servidor{
    private Servidor coordenador;

    public Professor(String nome,Servidor coordenador) {
        super(nome);
        this.coordenador = coordenador;
    }
    

    public Servidor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Servidor coordenador) {
        this.coordenador = coordenador;
    }
}
