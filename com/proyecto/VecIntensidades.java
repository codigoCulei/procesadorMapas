package com.proyecto;
/**
 * Clase que representa un vector de intensidades para un espectro de Raman. (se puede pensar como la segunda coordenada de la dupla (k, I(k))
 * <p>
 * Esta clase permite crear objetos que representan intensidades medidas por un detector dentro de un rango de numeros de onda (1600 numeros de onda -> 1600 intensidades (k,I(k)). 
 * 
 * @author uwu
 * 
 */
public class VecIntensidades{
    private final int[] intensidadVec;   

    public VecIntensidades(int[] intVec){
	intensidadVec = intVec.clone();
    }
    public int[] getVecIntensidades(){
	return this.intensidadVec;
    };
    public int getIntensidadAtIndex(int indice){
	return this.intensidadVec[indice];
    };

}
