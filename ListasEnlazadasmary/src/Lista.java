/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class Lista {

    private Nodo primerNodo;
    private Nodo ultimoNodo;

    public Lista() {
        primerNodo = ultimoNodo = null;
    }

    public void agregarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato, null);
        if (primerNodo == null) {
            primerNodo = ultimoNodo = nuevo;
        }  else
  {
   ultimoNodo.setNodoDere(nuevo);
   ultimoNodo = nuevo;
  }
 }
  
 public void imprimir(){
  Nodo aux=primerNodo; 
  while(aux!=null){
   System.out.println(aux.getDato());
   aux = aux.getNodoDere();
  } 
 }
  
 public void eliminar(int valor){
  Nodo anterior=primerNodo;
  Nodo aux= primerNodo.getNodoDere();
  Nodo temporal;
  while(aux!=null){
   if(aux.getDato() > valor) {
    temporal=aux.getNodoDere();   
    anterior.setNodoDere(aux.getNodoDere()); 
    aux = temporal;   
   }
   else
   {
    anterior=anterior.getNodoDere();
    aux=aux.getNodoDere();
   } 
  }
 }
}
