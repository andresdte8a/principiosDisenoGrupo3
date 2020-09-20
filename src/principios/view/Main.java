/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principios.view;

import principios.model.CargarCombustible;
import principios.model.Carro;
import principios.model.Avion;

/**
 *
 * @author andres vergara, diana pastrana, andres duarte
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CargarCombustible objCargarCombustible = new CargarCombustible();
        
        Carro carro = new Carro();
        carro.setTopNivelCombustible(10);
        carro.setNumeroEjes(2);
        System.out.println("Número de ejes: " + carro.getNumeroEjes());
        System.out.println(" " + objCargarCombustible.cargar(carro, 5));
        System.out.println(" " + objCargarCombustible.cargar(carro, 5));
        System.out.println(" " + objCargarCombustible.cargar(carro, 5));

        System.out.println("\n\n");

        Avion avion = new Avion();
        avion.setTopNivelCombustible(20);
        avion.setNumeroTurbinas(4);
        System.out.println("Número de turbinas: " + avion.getNumeroTurbinas());
        System.out.println(" " + objCargarCombustible.cargar(avion, 5));
        System.out.println(" " + objCargarCombustible.cargar(avion, 5));
        System.out.println(" " + objCargarCombustible.cargar(avion, 5));

    }
}
