/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principios.model;

/**
 *
 * @author andres vergara, diana pastrana, andres duarte
 */
public class Vehiculo {
    
    private int topNivelCombustible;
    private int nivelCombustible;
    private int numeroTurbinas;
    private int NumeroEjes;
    
    public Vehiculo() {
    }   
    

    public int getNumeroEjes() {
        return NumeroEjes;
    }

    public void setNumeroEjes(int NumeroEjes) {
        this.NumeroEjes = NumeroEjes;
    }
       
    public int getNumeroTurbinas() {
        return numeroTurbinas;
    }

    public void setNumeroTurbinas(int numeroTurbinas) {
        this.numeroTurbinas = numeroTurbinas;
    }

    public int getTopNivelCombustible() {
        return topNivelCombustible;
    }

    public void setTopNivelCombustible(int topNivelCombustible) {
        this.topNivelCombustible = topNivelCombustible;
    }

    public int getNivelCombustible() {
        return nivelCombustible;
    }

    public void setNivelCombustible(int nivelCombustible) {
        this.nivelCombustible = nivelCombustible;
    }
    
}
