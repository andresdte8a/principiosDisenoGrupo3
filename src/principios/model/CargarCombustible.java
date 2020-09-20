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
public class CargarCombustible implements IVehiculoCombustible{
    
    @Override
    public String cargar(Vehiculo vehiculo, int cantidad){
        if(vehiculo.getTopNivelCombustible() >= (vehiculo.getNivelCombustible() + cantidad)){
            vehiculo.setNivelCombustible(vehiculo.getNivelCombustible() + cantidad);
            return "Se ingresaron "  + cantidad + " litro(s) de combustible, el nuevo nivel de combustible es: " + vehiculo.getNivelCombustible() + " litro(s)";
        }else{
            return "No se pueden ingresar los " + cantidad + " litro(s) de combustible, se sobrepasarian los " + vehiculo.getTopNivelCombustible() + " litro(s) de combustible permitidos";
        }
    }
}
