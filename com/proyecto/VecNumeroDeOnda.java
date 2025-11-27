package com.proyecto;

/**
 * Clase que representa un vector de numeros de onda. Se puede pensar como la primera coordenada en la dupla (k, I(k)).
 * <p>
 * Esta clase se utiliza para crear el objeto que representa la variable dependiente en el experimento.
 * Contiene numeros de onda de los fotones de Raman (en teoria es identico en todos los mapas.. eso queda por verse..)
 * 
 *
 * @author uwu

 */
public class VecNumeroDeOnda{
    private final double[] numeroDeOnda;
    

    public VecNumeroDeOnda(double[] numOndaVec){
	numeroDeOnda = numOndaVec.clone();
    }
    public double[] getVecNumeroDeOnda(){
	return this.numeroDeOnda;
    };
    public double getVecNumeroDeOndaAtIndex(int indice){
	return this.numeroDeOnda[indice];
    };

}
