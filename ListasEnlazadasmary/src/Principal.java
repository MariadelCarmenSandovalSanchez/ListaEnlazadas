import java.util.Scanner;
import javax.swing.JOptionPane;
 /**
 *
 * @author Maria
 */
public class Principal 
{
  
 public static int leerEntero(String linea)
 {
  Scanner leer = new Scanner(System.in);
  System.out.println(linea);
  int dato = leer.nextInt();
  return dato; 
 }
    public static void main(String[] args) {
        Lista coleccion = new Lista();
  int opcion;
  do{
   opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Listas Enlazadas \n"
           + " Selecciona una opción: "
           + "\n 1.-Proporciona lo números a la lista "
           + "\n 2.-Mostrar lista"
           + "\n 3.-Borrar datos que se pasan de un límite "
           + "\n 4.-Mostrar nuevamente la lista \n "
           + "5.-Salir \n"
           ));
   

    
   switch(opcion)
   {
   case 1:
   {
    int nuevo = Integer.parseInt(JOptionPane.showInputDialog(null,"Proporciona un número para la lista:"));
    coleccion.agregarAlFinal(nuevo);
    break;
   }
   case 2:
   {
    JOptionPane.showMessageDialog(null, "Los números ingresada son: \n ");
    coleccion.imprimir();
    break;
   }
   case 3:
   {
    int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Proporcione un número que supera su límite:"));
    coleccion.eliminar(valor);
    break;
   }
   case 4:
   {
    JOptionPane.showMessageDialog(null,"Nueva lista es:");
    coleccion.imprimir();
    break;
   }
   case 5:
   {
    JOptionPane.showMessageDialog(null,"Fin del programa");
    break;
   }
   }
  }while(opcion!=5);
 }
} 
