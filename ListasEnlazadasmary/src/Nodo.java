/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class Nodo {
    private int dato;
    private Nodo nodoDere;
  
 public Nodo (int dato, Nodo nodoDere) {
  this.dato=dato;
  this.nodoDere=nodoDere;
 }
  
 public Nodo (int datos){
  this.dato=datos;
  this.nodoDere=null;
 }

 public int getDato() {
  return dato;
 }
 
 public void setDato(int dato) {
  this.dato = dato;
 }

    public Nodo getNodoDere() {
        return nodoDere;
    }

    public void setNodoDere(Nodo nodoDere) {
        this.nodoDere = nodoDere;
    }
}
