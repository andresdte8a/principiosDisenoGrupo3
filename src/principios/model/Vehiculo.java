/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principios.model;

import principios.interfaces.IVehiculoCombustible;

/**
 *
 * @author Nine
 */
public class Vehiculo {
    
    private int topNivelCombustible;
    private int nivelCombustible;

    public Vehiculo() {
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
